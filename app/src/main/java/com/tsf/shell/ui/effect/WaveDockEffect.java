package com.tsf.shell.ui.effect;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.List;

public class WaveDockEffect {

    private boolean animating;
    private ValueAnimator currentAnim;

    public void playWave(List<View> dockViews, float touchX) {
        if (dockViews == null || dockViews.isEmpty()) return;
        int count = dockViews.size();
        float slotWidth = dockViews.get(0).getWidth();
        if (slotWidth <= 0) slotWidth = 120;

        for (int i = 0; i < count; i++) {
            final View v = dockViews.get(i);
            float centerX = i * slotWidth + slotWidth / 2f;
            float distance = Math.abs(touchX - centerX);
            float maxDist = slotWidth * count / 2f;
            float waveAmount = 1f - Math.min(1f, distance / maxDist);
            waveAmount = (float) Math.sin(waveAmount * Math.PI);

            final float scale = 1f + waveAmount * 0.3f;
            v.animate()
                    .scaleX(scale)
                    .scaleY(scale)
                    .setDuration(200)
                    .setInterpolator(new DecelerateInterpolator())
                    .start();
        }
    }

    public void resetWave(List<View> dockViews) {
        if (dockViews == null) return;
        for (View v : dockViews) {
            v.animate().scaleX(1f).scaleY(1f).setDuration(150).start();
        }
    }
}
