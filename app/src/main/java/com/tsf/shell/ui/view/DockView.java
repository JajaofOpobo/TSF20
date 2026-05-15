package com.tsf.shell.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import com.tsf.shell.R;
import com.tsf.shell.data.local.entity.DockItem;
import java.util.List;

public class DockView extends View {

    private static final int MAX_SLOTS = 5;

    private List<DockItem> items;
    private final Paint bgPaint;
    private final Paint textPaint;
    private final Paint dividerPaint;
    private OnDockItemClickListener clickListener;
    private DockItem selectedItem;
    private int slotWidth;

    public DockView(Context context) {
        super(context);
        bgPaint = new Paint();
        bgPaint.setColor(0xCC101418);
        textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(getResources().getColor(R.color.launcher_text_primary, null));
        textPaint.setTextSize(36);
        textPaint.setTextAlign(Paint.Align.CENTER);
        dividerPaint = new Paint();
        dividerPaint.setColor(0x33FFFFFF);
        dividerPaint.setStrokeWidth(1);
        setClickable(true);
    }

    public void setItems(List<DockItem> items) {
        this.items = items;
        invalidate();
    }

    public void setOnDockItemClickListener(OnDockItemClickListener l) {
        this.clickListener = l;
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int w = MeasureSpec.getSize(widthSpec);
        int h = (int) (w * 0.15f);
        setMeasuredDimension(w, h);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0, 0, getWidth(), getHeight(), bgPaint);

        if (items == null) return;

        slotWidth = getWidth() / MAX_SLOTS;
        int cy = getHeight() / 2 + 12;

        for (int i = 0; i < items.size() && i < MAX_SLOTS; i++) {
            DockItem item = items.get(i);
            int cx = i * slotWidth + slotWidth / 2;
            canvas.drawText(getInitial(item.title), cx, cy, textPaint);

            if (i < MAX_SLOTS - 1) {
                canvas.drawLine((i + 1) * slotWidth, 8, (i + 1) * slotWidth, getHeight() - 8, dividerPaint);
            }
        }
    }

    private String getInitial(String title) {
        if (title == null || title.isEmpty()) return "?";
        return title.substring(0, 1).toUpperCase();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP && clickListener != null) {
            int slot = (int) (event.getX() / slotWidth);
            if (slot >= 0 && slot < items.size()) {
                selectedItem = items.get(slot);
                clickListener.onDockItemClick(selectedItem);
            }
        }
        return super.onTouchEvent(event);
    }

    public interface OnDockItemClickListener {
        void onDockItemClick(DockItem item);
    }
}