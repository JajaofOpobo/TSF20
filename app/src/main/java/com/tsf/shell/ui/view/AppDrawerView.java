package com.tsf.shell.ui.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.tsf.shell.R;
import com.tsf.shell.data.repository.LauncherRepository;
import java.util.List;
import java.util.stream.Collectors;

public class AppDrawerView extends View {

    private static final int COLUMNS = 4;
    private static final int VISIBLE_ROWS = 6;

    private List<LauncherRepository.LaunchableApp> apps;
    private final Paint bgPaint;
    private final Paint labelPaint;
    private final Paint initialPaint;
    private int cellW;
    private int cellH;
    private OnAppClickListener clickListener;
    private int scrollOffset = 0;

    public AppDrawerView(Context context) {
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

    public void setApps(List<LauncherRepository.LaunchableApp> apps) {
        this.apps = apps;
        invalidate();
    }

    public void setOnAppClickListener(OnAppClickListener l) {
        this.clickListener = l;
    }

    public void scrollTo(int offset) {
        this.scrollOffset = offset;
        invalidate();
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int w = MeasureSpec.getSize(widthSpec);
        int h = MeasureSpec.getSize(heightSpec);
        cellW = w / COLUMNS;
        cellH = cellW;
        int computedH = cellH * VISIBLE_ROWS;
        setMeasuredDimension(w, Math.min(h, computedH));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0, 0, getWidth(), getHeight(), bgPaint);

        if (apps == null) return;

        int row = 0;
        int col = 0;
        for (LauncherRepository.LaunchableApp app : apps) {
            int x = col * cellW + cellW / 2;
            int y = row * cellH + cellH / 2 + 20;

            canvas.drawText(getInitial(app.title), x, y, initialPaint);
            canvas.drawText(truncate(app.title, 8), x, y + cellH / 3f, labelPaint);

            col++;
            if (col >= COLUMNS) {
                col = 0;
                row++;
            }
        }
    }

    private String getInitial(String title) {
        if (title == null || title.isEmpty()) return "?";
        return title.substring(0, 1).toUpperCase();
    }

    private String truncate(String s, int max) {
        if (s == null || s.isEmpty()) return "";
        return (s.length() > max) ? s.substring(0, max - 1) + "…" : s;
    }

    @Override
    public boolean performClick() {
        return super.performClick();
    }

    public interface OnAppClickListener {
        void onAppClick(LauncherRepository.LaunchableApp app);
    }
}