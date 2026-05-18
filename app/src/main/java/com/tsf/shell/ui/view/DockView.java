package com.tsf.shell.ui.view;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tsf.shell.data.local.entity.DockItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DockView extends View {

    private static final int MAX_SLOTS = 5;

    private List<DockItem> items;
    private final Paint bgPaint;
    private final Paint dividerPaint;
    private final Paint iconPaint;
    private OnDockItemClickListener clickListener;
    private OnDockItemLongClickListener longClickListener;
    private DockItem selectedItem;
    private int slotWidth;
    private int iconSize;
    private final Handler longPressHandler = new Handler(Looper.getMainLooper());
    private final Runnable longPressRunnable = () -> {
        if (longClickListener != null && selectedItem != null) {
            longClickListener.onDockItemLongClick(selectedItem);
        }
        selectedItem = null;
    };
    private float pressX, pressY;
    private final Map<String, Bitmap> iconCache = new HashMap<>();
    private final PackageManager pm;

    public DockView(Context context) {
        super(context);
        pm = context.getPackageManager();
        bgPaint = new Paint();
        bgPaint.setColor(0x00000000);
        dividerPaint = new Paint();
        dividerPaint.setColor(0x33FFFFFF);
        dividerPaint.setStrokeWidth(1);
        iconPaint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.FILTER_BITMAP_FLAG);
        setClickable(true);
    }

    public void setItems(List<DockItem> items) {
        this.items = items;
        iconCache.clear();
        invalidate();
    }

    public void setOnDockItemClickListener(OnDockItemClickListener l) {
        this.clickListener = l;
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int w = MeasureSpec.getSize(widthSpec);
        int iconDp = 48;
        float density = getResources().getDisplayMetrics().density;
        iconSize = (int) (iconDp * density);
        int h = iconSize + (int) (16 * density);
        slotWidth = w / MAX_SLOTS;
        setMeasuredDimension(w, h);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (items == null || items.isEmpty()) return;

        slotWidth = getWidth() / MAX_SLOTS;
        int cy = getHeight() / 2;

        for (int i = 0; i < items.size() && i < MAX_SLOTS; i++) {
            DockItem item = items.get(i);
            int cx = i * slotWidth + slotWidth / 2;
            Bitmap icon = getIconForItem(item);
            if (icon != null) {
                int left = cx - iconSize / 2;
                int top = cy - iconSize / 2;
                canvas.drawBitmap(icon, left, top, iconPaint);
            }
            if (i < MAX_SLOTS - 1) {
                canvas.drawLine((i + 1) * slotWidth, 8, (i + 1) * slotWidth, getHeight() - 8, dividerPaint);
            }
        }
    }

    private Bitmap getIconForItem(DockItem item) {
        if (item == null) return null;
        String cacheKey = item.packageName != null ? item.packageName : item.title;
        if (iconCache.containsKey(cacheKey)) {
            return iconCache.get(cacheKey);
        }
        Bitmap icon = loadIcon(item);
        if (icon != null) {
            iconCache.put(cacheKey, icon);
        }
        return icon;
    }

    private Bitmap loadIcon(DockItem item) {
        if (item.packageName != null) {
            try {
                Drawable d = pm.getApplicationIcon(item.packageName);
                if (d != null) {
                    return drawableToBitmap(d);
                }
            } catch (PackageManager.NameNotFoundException ignored) {
            }
        }
        if (item.className != null && item.packageName != null) {
            try {
                android.content.ComponentName cn = new android.content.ComponentName(item.packageName, item.className);
                android.content.pm.ActivityInfo info = pm.getActivityInfo(cn, 0);
                if (info != null && info.icon != 0) {
                    Drawable d = info.loadIcon(pm);
                    if (d != null) return drawableToBitmap(d);
                }
            } catch (PackageManager.NameNotFoundException ignored) {
            }
        }
        if (item.icon != null) {
            try {
                Bitmap b = android.graphics.BitmapFactory.decodeByteArray(item.icon, 0, item.icon.length);
                if (b != null) return b;
            } catch (Exception ignored) {
            }
        }
        if (item.iconPackage != null) {
            try {
                Drawable d = pm.getApplicationIcon(item.iconPackage);
                if (d != null) return drawableToBitmap(d);
            } catch (PackageManager.NameNotFoundException ignored) {
            }
        }
        return null;
    }

    private Bitmap drawableToBitmap(Drawable d) {
        if (d instanceof BitmapDrawable) {
            Bitmap b = ((BitmapDrawable) d).getBitmap();
            if (b != null) {
                return Bitmap.createScaledBitmap(b, iconSize, iconSize, true);
            }
        }
        int w = Math.max(d.getIntrinsicWidth(), iconSize);
        int h = Math.max(d.getIntrinsicHeight(), iconSize);
        Bitmap b = Bitmap.createBitmap(w > 0 ? w : iconSize, h > 0 ? h : iconSize, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(b);
        d.setBounds(0, 0, c.getWidth(), c.getHeight());
        d.draw(c);
        return Bitmap.createScaledBitmap(b, iconSize, iconSize, true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (slotWidth <= 0) slotWidth = getWidth() / MAX_SLOTS;
        int slot = slotWidth > 0 ? (int) (event.getX() / slotWidth) : -1;
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                if (slot >= 0 && slot < (items != null ? items.size() : 0)) {
                    selectedItem = items.get(slot);
                    pressX = event.getX();
                    pressY = event.getY();
                    longPressHandler.postDelayed(longPressRunnable, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                return false;
            }
            case MotionEvent.ACTION_MOVE: {
                float dx = event.getX() - pressX;
                float dy = event.getY() - pressY;
                float slop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                if (Math.abs(dx) > slop || Math.abs(dy) > slop) {
                    longPressHandler.removeCallbacks(longPressRunnable);
                    selectedItem = null;
                }
                return true;
            }
            case MotionEvent.ACTION_UP: {
                longPressHandler.removeCallbacks(longPressRunnable);
                if (clickListener != null && selectedItem != null) {
                    if (slot >= 0 && slot < (items != null ? items.size() : 0)) {
                        clickListener.onDockItemClick(selectedItem);
                    }
                }
                selectedItem = null;
                return true;
            }
            case MotionEvent.ACTION_CANCEL: {
                longPressHandler.removeCallbacks(longPressRunnable);
                selectedItem = null;
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public void setOnDockItemLongClickListener(OnDockItemLongClickListener l) {
        this.longClickListener = l;
    }

    public interface OnDockItemClickListener {
        void onDockItemClick(DockItem item);
    }

    public interface OnDockItemLongClickListener {
        void onDockItemLongClick(DockItem item);
    }
}
