package com.tsf.shell.ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.tsf.shell.data.local.entity.FavoriteItem;

public class ArchShortcutMenu extends View {

    private static ArchShortcutMenu current;

    public interface ActionCallback {
        void onEdit(FavoriteItem item);
        void onRemove(FavoriteItem item);
        void onAppInfo(FavoriteItem item);
        void onCreateShortcut(FavoriteItem item);
    }

    private static class MenuOption {
        final String label;
        final String shortLabel;
        final int color;
        final Runnable action;
        MenuOption(String label, String shortLabel, int color, Runnable action) {
            this.label = label;
            this.shortLabel = shortLabel;
            this.color = color;
            this.action = action;
        }
    }

    private final FavoriteItem item;
    private final ActionCallback callback;
    private final float anchorX, anchorY;
    private final MenuOption[] options;
    private final float[] optAngles;
    private final Paint overlayPaint, circlePaint, textPaint, labelPaint, arcPaint;
    private final float density;
    private float animProgress;
    private ValueAnimator animator;
    private boolean dismissed;
    private boolean arcDownward;

    private static final float ARC_RADIUS_DP = 120;
    private static final float ITEM_RADIUS_DP = 28;
    private static final float ARC_START_UP = 150;
    private static final float ARC_SWEEP_UP = -120;
    private static final float ARC_START_DOWN = 30;
    private static final float ARC_SWEEP_DOWN = 120;

    public static void show(Activity activity, FavoriteItem item, float anchorX, float anchorY, ActionCallback callback) {
        dismiss();
        ViewGroup root = activity.findViewById(android.R.id.content);
        ArchShortcutMenu menu = new ArchShortcutMenu(activity, item, anchorX, anchorY, callback);
        root.addView(menu, new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        current = menu;
        menu.animateIn();
    }

    public static void show(Context context, FavoriteItem item, ActionCallback callback) {
        if (context instanceof Activity) {
            Activity a = (Activity) context;
            show(a, item, a.getWindow().getDecorView().getWidth() / 2f,
                    a.getWindow().getDecorView().getHeight() / 2f, callback);
        }
    }

    private static void dismiss() {
        if (current != null) {
            ViewGroup parent = (ViewGroup) current.getParent();
            if (parent != null) parent.removeView(current);
            current = null;
        }
    }

    private ArchShortcutMenu(Context context, FavoriteItem item, float anchorX, float anchorY, ActionCallback callback) {
        super(context);
        this.item = item;
        this.callback = callback;
        this.anchorX = anchorX;
        this.anchorY = anchorY;
        this.density = getResources().getDisplayMetrics().density;

        options = new MenuOption[]{
            new MenuOption("Edit", "E", 0xFF4A90E2, () -> { if (callback != null) callback.onEdit(item); }),
            new MenuOption("Remove", "R", 0xFFE74C3C, () -> {
                new AlertDialog.Builder(getContext())
                        .setTitle("Remove " + (item.title != null ? item.title : "item") + "?")
                        .setPositiveButton("Remove", (d, w) -> { if (callback != null) callback.onRemove(item); })
                        .setNegativeButton("Cancel", null)
                        .show();
            }),
            new MenuOption("App Info", "I", 0xFF2ECC71, () -> { if (callback != null) callback.onAppInfo(item); }),
            new MenuOption("Shortcut", "S", 0xFFF39C12, () -> { if (callback != null) callback.onCreateShortcut(item); }),
        };

        int n = options.length;
        optAngles = new float[n];
        arcDownward = anchorY < 200 * density;
        float start = arcDownward ? ARC_START_DOWN : ARC_START_UP;
        float sweep = arcDownward ? ARC_SWEEP_DOWN : ARC_SWEEP_UP;
        float step = sweep / (n - 1);
        for (int i = 0; i < n; i++) {
            optAngles[i] = start + step * i;
        }

        overlayPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        overlayPaint.setColor(0x88000000);

        circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        circlePaint.setAntiAlias(true);

        textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(Color.WHITE);
        textPaint.setTextSize(20 * density);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setAntiAlias(true);

        labelPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        labelPaint.setColor(0xEEFFFFFF);
        labelPaint.setTextSize(11 * density);
        labelPaint.setTextAlign(Paint.Align.CENTER);
        labelPaint.setAntiAlias(true);

        arcPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        arcPaint.setColor(0x44FFFFFF);
        arcPaint.setStyle(Paint.Style.STROKE);
        arcPaint.setStrokeWidth(1.5f * density);
        arcPaint.setAntiAlias(true);
    }

    private void animateIn() {
        animProgress = 0f;
        animator = ValueAnimator.ofFloat(0f, 1f);
        animator.setDuration(280);
        animator.setInterpolator(new DecelerateInterpolator());
        animator.addUpdateListener(a -> {
            animProgress = a.getAnimatedFraction();
            invalidate();
        });
        animator.start();
    }

    private void animateOut(Runnable onEnd) {
        if (animator != null) animator.cancel();
        animator = ValueAnimator.ofFloat(animProgress, 0f);
        animator.setDuration(160);
        animator.setInterpolator(new DecelerateInterpolator());
        animator.addUpdateListener(a -> {
            animProgress = a.getAnimatedFraction();
            invalidate();
        });
        animator.addListener(new AnimatorListenerAdapter() {
            @Override public void onAnimationEnd(Animator a) { if (onEnd != null) onEnd.run(); }
        });
        animator.start();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(overlayPaint.getColor());

        float arcR = ARC_RADIUS_DP * density * animProgress;
        float itemR = ITEM_RADIUS_DP * density * animProgress;

        float start = arcDownward ? ARC_START_DOWN : ARC_START_UP;
        float sweep = arcDownward ? ARC_SWEEP_DOWN : ARC_SWEEP_UP;
        android.graphics.RectF arcRect = new android.graphics.RectF(
                anchorX - arcR, anchorY - arcR,
                anchorX + arcR, anchorY + arcR);
        arcPaint.setAlpha((int) (68 * animProgress));
        canvas.drawArc(arcRect, start, sweep, false, arcPaint);

        for (int i = 0; i < options.length; i++) {
            float angleRad = (float) Math.toRadians(optAngles[i]);
            float rawCx = anchorX + ARC_RADIUS_DP * density * (float) Math.cos(angleRad);
            float rawCy = anchorY + ARC_RADIUS_DP * density * (float) Math.sin(angleRad);

            float cx = anchorX + (rawCx - anchorX) * animProgress;
            float cy = anchorY + (rawCy - anchorY) * animProgress;

            circlePaint.setColor(options[i].color);
            circlePaint.setAlpha((int) (255 * animProgress));
            canvas.drawCircle(cx, cy, itemR, circlePaint);

            if (animProgress > 0.25f) {
                float textAlpha = (animProgress - 0.25f) / 0.75f;
                textPaint.setAlpha((int) (255 * textAlpha));
                Paint.FontMetrics fm = textPaint.getFontMetrics();
                float textY = cy - (fm.ascent + fm.descent) / 2f;
                canvas.drawText(options[i].shortLabel, cx, textY, textPaint);
            }

            if (animProgress > 0.45f) {
                float labelAlpha = (animProgress - 0.45f) / 0.55f;
                labelPaint.setAlpha((int) (238 * labelAlpha));
                float labelY = cy + itemR + 8 * density + 4;
                canvas.drawText(options[i].label, cx, labelY, labelPaint);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (dismissed) return true;
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            float x = event.getX();
            float y = event.getY();

            float arcR = ARC_RADIUS_DP * density * animProgress;
            float itemR = ITEM_RADIUS_DP * density * animProgress;

            for (int i = 0; i < options.length; i++) {
                float angleRad = (float) Math.toRadians(optAngles[i]);
                float cx = anchorX + arcR * (float) Math.cos(angleRad);
                float cy = anchorY + arcR * (float) Math.sin(angleRad);

                float dx = x - cx;
                float dy = y - cy;
                if (dx * dx + dy * dy <= itemR * itemR + 16 * density) {
                    handleSelect(i);
                    return true;
                }
            }
            animateOut(ArchShortcutMenu::dismiss);
            dismissed = true;
        }
        return true;
    }

    private void handleSelect(int index) {
        if (dismissed) return;
        dismissed = true;
        animateOut(() -> {
            options[index].action.run();
            post(ArchShortcutMenu::dismiss);
        });
    }
}
