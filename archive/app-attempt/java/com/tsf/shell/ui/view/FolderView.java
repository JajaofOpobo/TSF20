package com.tsf.shell.ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.tsf.shell.data.local.entity.FavoriteItem;
import java.util.ArrayList;
import java.util.List;

public class FolderView extends View {

    private List<FavoriteItem> items = new ArrayList<>();
    private String title = "Folder";
    private final Paint bgPaint;
    private final Paint textPaint;
    private final Paint itemBgPaint;
    private boolean isOpen;
    private OnFolderCloseListener closeListener;
    private OnItemClickListener itemClickListener;
    private float iconSize;
    private float scale = 0f;

    public FolderView(Context context) {
        super(context);
        float density = getResources().getDisplayMetrics().density;
        iconSize = 48 * density;

        bgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        bgPaint.setColor(0xCC101418);

        textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(0xFFFFFFFF);
        textPaint.setTextSize(14 * density);
        textPaint.setTextAlign(Paint.Align.CENTER);

        itemBgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        itemBgPaint.setColor(0x33FFFFFF);
    }

    public void setItems(List<FavoriteItem> items) {
        this.items = new ArrayList<>(items);
        invalidate();
    }

    public void setTitle(String title) {
        this.title = title != null ? title : "Folder";
        invalidate();
    }

    public void open() {
        isOpen = true;
        setVisibility(View.VISIBLE);
        ObjectAnimator anim = ObjectAnimator.ofFloat(this, "scale", 0f, 1f);
        anim.setDuration(300);
        anim.setInterpolator(new OvershootInterpolator());
        anim.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                setScale(1f);
            }
        });
        anim.start();
    }

    public void close() {
        ObjectAnimator anim = ObjectAnimator.ofFloat(this, "scale", 1f, 0f);
        anim.setDuration(200);
        anim.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                isOpen = false;
                setVisibility(View.GONE);
                if (closeListener != null) closeListener.onFolderClose();
            }
        });
        anim.start();
    }

    public void setScale(float s) {
        this.scale = s;
        invalidate();
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOnFolderCloseListener(OnFolderCloseListener l) {
        this.closeListener = l;
    }

    public void setOnItemClickListener(OnItemClickListener l) {
        this.itemClickListener = l;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.scale(scale, scale, getWidth() / 2f, getHeight() / 2f);

        float pad = 24;
        canvas.drawRoundRect(pad, pad, getWidth() - pad, getHeight() - pad, 16, 16, bgPaint);

        textPaint.setTextSize(18 * getResources().getDisplayMetrics().density);
        canvas.drawText(title, getWidth() / 2f, pad + textPaint.getTextSize() + 8, textPaint);

        int cols = Math.min(items.size(), 4);
        int rows = (items.size() + cols - 1) / cols;
        float startX = (getWidth() - cols * iconSize) / 2f;
        float startY = pad + textPaint.getTextSize() + 24;

        for (int i = 0; i < items.size(); i++) {
            FavoriteItem item = items.get(i);
            int col = i % cols;
            int row = i / cols;
            float cx = startX + col * iconSize + iconSize / 2;
            float cy = startY + row * iconSize + iconSize / 2;
            canvas.drawRoundRect(cx - iconSize / 2, cy - iconSize / 2,
                    cx + iconSize / 2, cy + iconSize / 2, 8, 8, itemBgPaint);
            String label = item.title != null && item.title.length() > 0
                    ? item.title.substring(0, 1).toUpperCase() : "?";
            textPaint.setTextSize(iconSize * 0.4f);
            canvas.drawText(label, cx, cy + textPaint.getTextSize() / 3, textPaint);
        }

        canvas.restore();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            float x = event.getX();
            float y = event.getY();
            if (x < 24 || x > getWidth() - 24 || y < 24 || y > getHeight() - 24) {
                close();
                return true;
            }
            int cols = Math.min(items.size(), 4);
            float iconStartX = (getWidth() - cols * iconSize) / 2f;
            float pad = 24;
            float textSize = 18 * getResources().getDisplayMetrics().density;
            float startY = pad + textSize + 24;
            for (int i = 0; i < items.size(); i++) {
                int col = i % cols;
                int row = i / cols;
                float cx = iconStartX + col * iconSize;
                float cy = startY + row * iconSize;
                if (x >= cx && x <= cx + iconSize && y >= cy && y <= cy + iconSize) {
                    if (itemClickListener != null) {
                        itemClickListener.onItemClick(items.get(i));
                    }
                    close();
                    return true;
                }
            }
        }
        return super.onTouchEvent(event);
    }

    public interface OnFolderCloseListener {
        void onFolderClose();
    }

    public interface OnItemClickListener {
        void onItemClick(FavoriteItem item);
    }
}
