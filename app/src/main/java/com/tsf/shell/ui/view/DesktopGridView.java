package com.tsf.shell.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import com.tsf.shell.R;
import com.tsf.shell.data.local.entity.FavoriteItem;
import java.util.List;

public class DesktopGridView extends View {

    private static final int COLUMNS = 4;
    private static final int ROWS = 4;
    private static final int CELL_PADDING = 8;

    private List<FavoriteItem> items;
    private final Paint bgPaint;
    private final Paint labelPaint;
    private final Paint initialPaint;
    private OnItemClickListener clickListener;
    private OnItemLongClickListener longClickListener;
    private FavoriteItem selectedItem;
    private int cellW;
    private int cellH;

    public DesktopGridView(Context context) {
        super(context);
        bgPaint = new Paint();
        bgPaint.setColor(getResources().getColor(R.color.launcher_background, null));
        labelPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        labelPaint.setColor(getResources().getColor(R.color.launcher_text_secondary, null));
        labelPaint.setTextSize(32);
        labelPaint.setTextAlign(Paint.Align.CENTER);
        initialPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        initialPaint.setColor(getResources().getColor(R.color.launcher_accent, null));
        initialPaint.setTextSize(56);
        initialPaint.setTextAlign(Paint.Align.CENTER);
        setClickable(true);
    }

    public void setItems(List<FavoriteItem> items) {
        this.items = items;
        invalidate();
    }

    public void setOnItemClickListener(OnItemClickListener l) {
        this.clickListener = l;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener l) {
        this.longClickListener = l;
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int w = MeasureSpec.getSize(widthSpec);
        int size = Math.min(w, w * 4 / COLUMNS);
        cellW = size / COLUMNS;
        cellH = size / ROWS;
        setMeasuredDimension(size, size);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0, 0, getWidth(), getHeight(), bgPaint);

        if (items == null) return;

        for (FavoriteItem item : items) {
            if (item.screen != 0) continue;
            if (item.cellX < 0 || item.cellY < 0) continue;
            if (item.cellX >= COLUMNS || item.cellY >= ROWS) continue;

            int cx = item.cellX * cellW + cellW / 2;
            int cy = item.cellY * cellH + cellH / 2;

            initialPaint.setTextSize(cellH / 4f);
            canvas.drawText(getInitial(item.title), cx, cy - 10, initialPaint);

            labelPaint.setTextSize(cellH / 5f);
            String label = truncate(item.title, 8);
            canvas.drawText(label, cx, cy + cellH / 5f, labelPaint);
        }
    }

    private String getInitial(String title) {
        if (title == null || title.isEmpty()) return "?";
        return title.substring(0, 1).toUpperCase();
    }

    private String truncate(String s, int max) {
        if (s == null) return "";
        if (s.length() <= max) return s;
        return s.substring(0, max - 1) + "…";
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP && clickListener != null) {
            int col = (int) (event.getX() / cellW);
            int row = (int) (event.getY() / cellH);
            selectedItem = findItemAt(col, row);
            if (selectedItem != null) {
                clickListener.onItemClick(selectedItem);
            }
        }
        return super.onTouchEvent(event);
    }

    private FavoriteItem findItemAt(int col, int row) {
        if (items == null) return null;
        for (FavoriteItem item : items) {
            if (item.cellX == col && item.cellY == row) {
                return item;
            }
        }
        return null;
    }

    public interface OnItemClickListener {
        void onItemClick(FavoriteItem item);
    }

    public interface OnItemLongClickListener {
        void onItemLongClick(FavoriteItem item);
    }
}