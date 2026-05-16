package com.tsf.shell.ui.view;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.tsf.shell.R;
import com.tsf.shell.badge.BadgeManager;
import com.tsf.shell.data.local.entity.FavoriteItem;
import com.tsf.shell.theme.ThemeManager;
import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends View {

    private List<FavoriteItem> items = new ArrayList<>();
    private final Paint textPaint;
    private final Paint iconBgPaint;
    private OnItemClickListener itemClickListener;
    private OnItemLongClickListener itemLongClickListener;
    private OnEmptySpaceLongClickListener emptySpaceLongClickListener;
    private OnDragEndListener dragEndListener;
    private FavoriteItem dragItem;
    private float dragX, dragY;
    private float downX, downY;

    private static final int ICON_SIZE_DP = 56;
    private float iconSize;
    private PackageManager pm;
    private BadgeManager badgeManager;
    private ThemeManager themeManager;
    private GestureDetector gestureDetector;

    public DesktopPage(Context context) {
        super(context);
        float density = getResources().getDisplayMetrics().density;
        iconSize = ICON_SIZE_DP * density;
        pm = context.getPackageManager();
        badgeManager = BadgeManager.getInstance(context);
        themeManager = ThemeManager.getInstance(context);

        iconBgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        iconBgPaint.setColor(0x33FFFFFF);
        iconBgPaint.setAntiAlias(true);

        textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(0xEEFFFFFF);
        textPaint.setTextSize(11 * density);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);

        gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public void onLongPress(MotionEvent e) {
                FavoriteItem hit = findItemAt(e.getX(), e.getY());
                if (hit != null) {
                    if (itemLongClickListener != null) {
                        itemLongClickListener.onItemLongClick(hit, e.getX(), e.getY());
                    }
                } else if (emptySpaceLongClickListener != null) {
                    emptySpaceLongClickListener.onEmptySpaceLongClick(e.getX(), e.getY());
                }
            }
        });
        setClickable(true);
        setLongClickable(true);
    }

    public void setItems(List<FavoriteItem> items) {
        this.items = new ArrayList<>(items);
        invalidate();
    }

    public List<FavoriteItem> getItems() {
        return items;
    }

    public void addItem(FavoriteItem item) {
        items.add(item);
        invalidate();
    }

    public void removeItem(FavoriteItem item) {
        items.remove(item);
        invalidate();
    }

    public FavoriteItem findItemAt(float x, float y) {
        for (int i = items.size() - 1; i >= 0; i--) {
            FavoriteItem item = items.get(i);
            RectF bounds = getItemBounds(item);
            if (bounds.contains(x, y)) {
                return item;
            }
        }
        return null;
    }

    private RectF getItemBounds(FavoriteItem item) {
        float x = item.cellX;
        float y = item.cellY;
        return new RectF(x - iconSize / 2, y - iconSize / 2,
                x + iconSize / 2, y + iconSize / 2);
    }

    public FavoriteItem findItemAtScreen(float screenX, float screenY) {
        return findItemAt(screenX, screenY);
    }

    public void startDrag(FavoriteItem item, float x, float y) {
        dragItem = item;
        dragX = x;
        dragY = y;
        invalidate();
    }

    public void updateDrag(float x, float y) {
        if (dragItem != null) {
            dragX = x;
            dragY = y;
            invalidate();
        }
    }

    public FavoriteItem endDrag() {
        FavoriteItem dragged = dragItem;
        if (dragged != null) {
            if (!isOverlapping(dragged, (int) dragX, (int) dragY)) {
                dragged.cellX = (int) dragX;
                dragged.cellY = (int) dragY;
                if (dragEndListener != null) dragEndListener.onDragEnd(dragged);
            }
        }
        dragItem = null;
        invalidate();
        return dragged;
    }

    private boolean isOverlapping(FavoriteItem item, float x, float y) {
        RectF newBounds = new RectF(x - iconSize / 2, y - iconSize / 2,
                x + iconSize / 2, y + iconSize / 2);
        for (FavoriteItem other : items) {
            if (other == item) continue;
            RectF otherBounds = getItemBounds(other);
            if (RectF.intersects(newBounds, otherBounds)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDragging() {
        return dragItem != null;
    }

    public FavoriteItem getDragItem() {
        return dragItem;
    }

    public void setOnDragEndListener(OnDragEndListener l) {
        this.dragEndListener = l;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for (FavoriteItem item : items) {
            if (item == dragItem) continue;
            drawItem(canvas, item, false);
        }

        if (dragItem != null) {
            canvas.save();
            canvas.translate(dragX - iconSize / 2, dragY - iconSize / 2);
            drawItemContent(canvas, dragItem, iconSize / 2, iconSize / 2, 180);
            canvas.restore();
        }
    }

    private void drawItem(Canvas canvas, FavoriteItem item, boolean isDrag) {
        float x = item.cellX;
        float y = item.cellY;
        canvas.save();
        canvas.translate(x - iconSize / 2, y - iconSize / 2);
        drawItemContent(canvas, item, iconSize / 2, iconSize / 2, isDrag ? 180 : 60);
        canvas.restore();
    }

    private void drawItemContent(Canvas canvas, FavoriteItem item, float cx, float cy, int alpha) {
        Drawable icon = loadIcon(item);
        if (icon != null) {
            int pad = (int) (iconSize * 0.1f);
            icon.setBounds((int) cx - (int) iconSize / 2 + pad, (int) cy - (int) iconSize / 2 + pad,
                    (int) cx + (int) iconSize / 2 - pad, (int) cy + (int) iconSize / 2 - pad);
            icon.setAlpha(alpha);
            icon.draw(canvas);
            icon.setAlpha(255);
        } else {
            iconBgPaint.setAlpha(alpha);
            canvas.drawRoundRect(cx - iconSize / 2, cy - iconSize / 2,
                    cx + iconSize / 2, cy + iconSize / 2, 12, 12, iconBgPaint);
            String initial = item.title != null && !item.title.isEmpty()
                    ? item.title.substring(0, 1).toUpperCase() : "?";
            Paint initPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            initPaint.setColor(0xFFFFFFFF);
            initPaint.setTextSize(iconSize * 0.45f);
            initPaint.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(initial, cx, cy + initPaint.getTextSize() / 3, initPaint);
        }

        textPaint.setTextSize(iconSize * 0.16f);
        String label = item.title;
        if (label != null) {
            String display = label.length() > 12 ? label.substring(0, 11) + "..." : label;
            canvas.drawText(display, cx, cy + iconSize / 2 + textPaint.getTextSize() + 4, textPaint);
        }

        if (badgeManager != null && item.packageName != null && badgeManager.hasBadge(item.packageName)) {
            badgeManager.drawBadge(canvas, cx, cy, iconSize, item.packageName);
        }
    }

    private Drawable loadIcon(FavoriteItem item) {
        if (item == null) return null;

        String pkg = item.packageName;
        if (pkg == null) return null;

        Drawable themed = themeManager.getIconForPackage(pkg);
        if (themed != null) return themed;

        try {
            return pm.getApplicationIcon(pkg);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        float x = event.getX();
        float y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                FavoriteItem hit = findItemAt(x, y);
                if (hit != null) {
                    dragItem = hit;
                    downX = x;
                    downY = y;
                    return true;
                }
                return false;
            }
            case MotionEvent.ACTION_MOVE: {
                if (dragItem != null) {
                    dragX = x;
                    dragY = y;
                    invalidate();
                    return true;
                }
                return false;
            }
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL: {
                if (dragItem != null) {
                    boolean isTap = Math.abs(x - downX) < 15 && Math.abs(y - downY) < 15;
                    if (isTap) {
                        if (itemClickListener != null) {
                            itemClickListener.onItemClick(dragItem);
                        }
                    } else if (!isOverlapping(dragItem, x, y)) {
                        dragItem.cellX = (int) x;
                        dragItem.cellY = (int) y;
                        if (dragEndListener != null) dragEndListener.onDragEnd(dragItem);
                    }
                    dragItem = null;
                    invalidate();
                    return true;
                }
                return false;
            }
        }
        return super.onTouchEvent(event);
    }

    public void setOnItemClickListener(OnItemClickListener l) {
        this.itemClickListener = l;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener l) {
        this.itemLongClickListener = l;
    }

    public void setOnEmptySpaceLongClickListener(OnEmptySpaceLongClickListener l) {
        this.emptySpaceLongClickListener = l;
    }

    public interface OnItemClickListener {
        void onItemClick(FavoriteItem item);
    }

    public interface OnItemLongClickListener {
        void onItemLongClick(FavoriteItem item, float x, float y);
    }

    public interface OnEmptySpaceLongClickListener {
        void onEmptySpaceLongClick(float x, float y);
    }

    public interface OnDragEndListener {
        void onDragEnd(FavoriteItem item);
    }
}
