package com.tsf.shell.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.tsf.shell.R;
import com.tsf.shell.data.local.entity.FavoriteItem;
import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends View {

    private List<FavoriteItem> items = new ArrayList<>();
    private final Paint bgPaint;
    private final Paint textPaint;
    private final Paint iconBgPaint;
    private OnItemClickListener itemClickListener;
    private OnItemLongClickListener itemLongClickListener;
    private FavoriteItem dragItem;
    private float dragX, dragY;

    private static final int ICON_SIZE_DP = 56;
    private static final int ITEM_PADDING_DP = 12;
    private float iconSize;
    private float itemPadding;

    public DesktopPage(Context context) {
        super(context);
        float density = getResources().getDisplayMetrics().density;
        iconSize = ICON_SIZE_DP * density;
        itemPadding = ITEM_PADDING_DP * density;

        bgPaint = new Paint();
        bgPaint.setColor(0x00000000);

        iconBgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        iconBgPaint.setColor(0x33FFFFFF);

        textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(0xEEFFFFFF);
        textPaint.setTextSize(11 * density);
        textPaint.setTextAlign(Paint.Align.CENTER);
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
            dragged.cellX = (int) dragX;
            dragged.cellY = (int) dragY;
        }
        dragItem = null;
        invalidate();
        return dragged;
    }

    public boolean isDragging() {
        return dragItem != null;
    }

    public FavoriteItem getDragItem() {
        return dragItem;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0, 0, getWidth(), getHeight(), bgPaint);

        for (FavoriteItem item : items) {
            if (item == dragItem) continue;
            drawItem(canvas, item, false);
        }

        if (dragItem != null) {
            canvas.save();
            canvas.translate(dragX - iconSize / 2, dragY - iconSize / 2);
            drawItemContent(canvas, dragItem);
            canvas.restore();
        }
    }

    private void drawItem(Canvas canvas, FavoriteItem item, boolean isDrag) {
        float x = item.cellX;
        float y = item.cellY;
        canvas.save();
        canvas.translate(x - iconSize / 2, y - iconSize / 2);
        if (isDrag) {
            iconBgPaint.setAlpha(180);
        } else {
            iconBgPaint.setAlpha(60);
        }
        canvas.drawRoundRect(0, 0, iconSize, iconSize, 12, 12, iconBgPaint);
        drawItemContent(canvas, item);
        canvas.restore();
    }

    private void drawItemContent(Canvas canvas, FavoriteItem item) {
        boolean isWidget = item.itemType == FavoriteItem.TYPE_WIDGET;
        String label = item.title;
        if (label == null || label.isEmpty()) label = "?";
        String initial = isWidget ? "W" : label.substring(0, 1).toUpperCase();

        Paint initialPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        initialPaint.setColor(0xFFFFFFFF);
        initialPaint.setTextSize(iconSize * 0.45f);
        initialPaint.setTextAlign(Paint.Align.CENTER);

        float cx = iconSize / 2;
        float cy = iconSize / 2 + initialPaint.getTextSize() / 3;

        if (isWidget) {
            iconBgPaint.setColor(0x664CAF50);
        }
        canvas.drawText(initial, cx, cy, initialPaint);

        textPaint.setTextSize(iconSize * 0.16f);
        String display = label.length() > 8 ? label.substring(0, 7) + "..." : label;
        canvas.drawText(display, cx, iconSize + textPaint.getTextSize() + 4, textPaint);

        if (isWidget) {
            iconBgPaint.setColor(0x33FFFFFF);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                FavoriteItem hit = findItemAt(x, y);
                if (hit != null) {
                    dragItem = hit;
                    dragX = x;
                    dragY = y;
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
                    if (Math.abs(x - dragX) < 10 && Math.abs(y - dragY) < 10) {
                        if (itemClickListener != null) {
                            itemClickListener.onItemClick(dragItem);
                        }
                    } else {
                        dragItem.cellX = (int) x;
                        dragItem.cellY = (int) y;
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

    public interface OnItemClickListener {
        void onItemClick(FavoriteItem item);
    }

    public interface OnItemLongClickListener {
        void onItemLongClick(FavoriteItem item);
    }
}
