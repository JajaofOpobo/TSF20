package com.tsf.shell.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class PageIndicator extends View {

    private int pageCount;
    private int currentPage;
    private final Paint activePaint;
    private final Paint inactivePaint;
    private static final int DOT_SIZE_DP = 8;
    private static final int DOT_SPACING_DP = 16;
    private float dotSize;
    private float dotSpacing;

    public PageIndicator(Context context) {
        super(context);
        float density = getResources().getDisplayMetrics().density;
        dotSize = DOT_SIZE_DP * density;
        dotSpacing = DOT_SPACING_DP * density;

        activePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        activePaint.setColor(0xFFFFFFFF);

        inactivePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        inactivePaint.setColor(0x66FFFFFF);
    }

    public void setPageCount(int count) {
        this.pageCount = count;
        requestLayout();
        invalidate();
    }

    public void setCurrentPage(int page) {
        this.currentPage = page;
        invalidate();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int w = (int) (pageCount * dotSpacing + dotSize);
        int h = (int) (dotSize * 3);
        setMeasuredDimension(w, h);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (pageCount <= 1) return;

        float totalWidth = (pageCount - 1) * dotSpacing;
        float startX = (getWidth() - totalWidth) / 2f;
        float cy = getHeight() / 2f;

        for (int i = 0; i < pageCount; i++) {
            float cx = startX + i * dotSpacing;
            Paint paint = (i == currentPage) ? activePaint : inactivePaint;
            canvas.drawCircle(cx, cy, dotSize / 2f, paint);
        }
    }
}
