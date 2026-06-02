package com.tsf.shell.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.tsf.shell.data.local.entity.FavoriteItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LassoSelectionView extends View {

    private boolean lassoMode;
    private float startX, startY, endX, endY;
    private boolean selecting;
    private final Paint lassoPaint;
    private final Paint selectedPaint;
    private final List<FavoriteItem> allItems = new ArrayList<>();
    private final Set<FavoriteItem> selectedItems = new HashSet<>();
    private OnSelectionListener listener;

    public LassoSelectionView(Context context) {
        super(context);
        lassoPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        lassoPaint.setColor(0x664A90D9);
        lassoPaint.setStyle(Paint.Style.FILL);

        selectedPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        selectedPaint.setColor(0x33FFEB3B);
        selectedPaint.setStyle(Paint.Style.STROKE);
        selectedPaint.setStrokeWidth(3);
    }

    public void setLassoMode(boolean enabled) {
        this.lassoMode = enabled;
        if (!enabled) {
            selectedItems.clear();
            selecting = false;
            invalidate();
        }
    }

    public boolean isLassoMode() {
        return lassoMode;
    }

    public void setItems(List<FavoriteItem> items) {
        this.allItems.clear();
        this.allItems.addAll(items);
        invalidate();
    }

    public Set<FavoriteItem> getSelectedItems() {
        return new HashSet<>(selectedItems);
    }

    public void clearSelection() {
        selectedItems.clear();
        invalidate();
    }

    public void setOnSelectionListener(OnSelectionListener l) {
        this.listener = l;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (!lassoMode) return false;

        float x = event.getX();
        float y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startX = x;
                startY = y;
                selecting = true;
                selectedItems.clear();
                return true;
            case MotionEvent.ACTION_MOVE:
                endX = x;
                endY = y;
                updateSelection();
                invalidate();
                return true;
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                selecting = false;
                invalidate();
                if (listener != null) {
                    listener.onSelectionComplete(new ArrayList<>(selectedItems));
                }
                return true;
        }
        return super.onTouchEvent(event);
    }

    private void updateSelection() {
        float left = Math.min(startX, endX);
        float top = Math.min(startY, endY);
        float right = Math.max(startX, endX);
        float bottom = Math.max(startY, endY);
        RectF selectRect = new RectF(left, top, right, bottom);

        for (FavoriteItem item : allItems) {
            if (item != null && selectRect.contains(item.cellX, item.cellY)) {
                selectedItems.add(item);
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!lassoMode) return;

        for (FavoriteItem item : selectedItems) {
            if (item != null) {
                canvas.drawRect(item.cellX - 30, item.cellY - 30,
                        item.cellX + 30, item.cellY + 30, selectedPaint);
            }
        }

        if (selecting) {
            float left = Math.min(startX, endX);
            float top = Math.min(startY, endY);
            float right = Math.max(startX, endX);
            float bottom = Math.max(startY, endY);
            canvas.drawRect(left, top, right, bottom, lassoPaint);
        }
    }

    public interface OnSelectionListener {
        void onSelectionComplete(List<FavoriteItem> selected);
    }
}
