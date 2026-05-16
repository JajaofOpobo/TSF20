package com.tsf.shell.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

public class SideMenuBar extends View {

    private boolean isOpen;
    private float openAmount;
    private int menuWidth;
    private float touchStartX;
    private boolean tracking;
    private VelocityTracker velocityTracker;
    private final Paint bgPaint;
    private final Paint itemPaint;
    private final Paint textPaint;
    private final List<MenuItem> items = new ArrayList<>();

    public static class MenuItem {
        public String label;
        public String iconText;
        public Runnable action;
    }

    public SideMenuBar(Context context) {
        super(context);
        float density = getResources().getDisplayMetrics().density;
        menuWidth = (int) (240 * density);

        bgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        bgPaint.setColor(0xCC101418);

        itemPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        itemPaint.setColor(0x33FFFFFF);

        textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(0xFFFFFFFF);
        textPaint.setTextSize(14 * density);
        textPaint.setTextAlign(Paint.Align.CENTER);

        MenuItem notify = new MenuItem();
        notify.label = "Notifications";
        notify.iconText = "N";
        items.add(notify);

        MenuItem tools = new MenuItem();
        tools.label = "Tools";
        tools.iconText = "T";
        items.add(tools);

        MenuItem settings = new MenuItem();
        settings.label = "Settings";
        settings.iconText = "S";
        items.add(settings);

        MenuItem themes = new MenuItem();
        themes.label = "Themes";
        themes.iconText = "Th";
        items.add(themes);
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open() {
        isOpen = true;
        animateTo(1f);
    }

    public void close() {
        isOpen = false;
        animateTo(0f);
    }

    public void toggle() {
        if (isOpen) close();
        else open();
    }

    public void setItems(List<MenuItem> newItems) {
        items.clear();
        items.addAll(newItems);
        invalidate();
    }

    private void animateTo(float target) {
        ValueAnimator anim = ValueAnimator.ofFloat(openAmount, target);
        anim.setDuration(250);
        anim.setInterpolator(new DecelerateInterpolator());
        anim.addUpdateListener(a -> {
            openAmount = (float) a.getAnimatedValue();
            invalidate();
            getLayoutParams().width = (int) (menuWidth * openAmount);
            requestLayout();
        });
        anim.start();
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int h = MeasureSpec.getSize(heightSpec);
        setMeasuredDimension((int) (menuWidth * openAmount), h);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float w = getWidth();
        float h = getHeight();
        if (w <= 0) return;

        canvas.drawRect(0, 0, w, h, bgPaint);

        float itemSize = 56 * getResources().getDisplayMetrics().density;
        float padding = 16 * getResources().getDisplayMetrics().density;
        float startY = h / 2f - (items.size() * (itemSize + padding)) / 2f;

        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            float cy = startY + i * (itemSize + padding);
            float cx = w / 2f;

            canvas.drawRoundRect(cx - itemSize / 2, cy - itemSize / 2,
                    cx + itemSize / 2, cy + itemSize / 2, 12, 12, itemPaint);

            textPaint.setTextSize(itemSize * 0.35f);
            canvas.drawText(item.iconText, cx, cy + textPaint.getTextSize() / 3, textPaint);

            textPaint.setTextSize(12 * getResources().getDisplayMetrics().density);
            canvas.drawText(item.label, cx, cy + itemSize / 2 + textPaint.getTextSize() + 4, textPaint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                touchStartX = x;
                tracking = x < 60 || isOpen;
                velocityTracker = VelocityTracker.obtain();
                return tracking;
            case MotionEvent.ACTION_MOVE:
                if (tracking && velocityTracker != null) {
                    velocityTracker.addMovement(event);
                    float dx = x - touchStartX;
                    if (isOpen) {
                        openAmount = Math.max(0f, Math.min(1f, 1f + dx / menuWidth));
                    } else {
                        openAmount = Math.max(0f, Math.min(1f, dx / menuWidth));
                    }
                    getLayoutParams().width = (int) (menuWidth * openAmount);
                    requestLayout();
                    invalidate();
                    return true;
                }
                return false;
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                if (tracking) {
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float vx = velocityTracker.getXVelocity();
                        if (Math.abs(vx) > 500) {
                            if (vx > 0) { isOpen = true; animateTo(1f); }
                            else { isOpen = false; animateTo(0f); }
                        } else {
                            if (openAmount > 0.5f) { isOpen = true; animateTo(1f); }
                            else { isOpen = false; animateTo(0f); }
                        }
                        velocityTracker.recycle();
                        velocityTracker = null;
                    }
                    tracking = false;
                    return true;
                }
                return false;
        }
        return super.onTouchEvent(event);
    }
}
