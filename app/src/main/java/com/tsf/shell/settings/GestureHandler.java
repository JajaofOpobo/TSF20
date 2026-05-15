package com.tsf.shell.settings;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class GestureHandler implements View.OnTouchListener {

    private final GestureDetector doubleTapDetector;
    private final GestureDetector swipeDetector;
    private final GestureListener listener;
    private final LauncherPreferences prefs;

    public GestureHandler(Context context, GestureListener listener) {
        this.listener = listener;
        this.prefs = new LauncherPreferences(context);

        doubleTapDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onDoubleTap(MotionEvent e) {
                int action = prefs.getGestureAction(LauncherPreferences.KEY_DOUBLE_TAP);
                listener.onAction(action);
                return true;
            }
        });

        swipeDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float vx, float vy) {
                float dx = e2.getX() - (e1 == null ? e2.getX() : e1.getX());
                float dy = e2.getY() - (e1 == null ? e2.getY() : e1.getY());

                if (Math.abs(dx) > Math.abs(dy)) {
                    if (dx > 80) listener.onAction(prefs.getGestureAction(LauncherPreferences.KEY_TWO_RIGHT));
                    else if (dx < -80) listener.onAction(prefs.getGestureAction(LauncherPreferences.KEY_TWO_LEFT));
                } else {
                    if (dy > 80) listener.onAction(prefs.getGestureAction(LauncherPreferences.KEY_TWO_DOWN));
                    else if (dy < -80) listener.onAction(prefs.getGestureAction(LauncherPreferences.KEY_TWO_UP));
                }
                return true;
            }
        });
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        doubleTapDetector.onTouchEvent(event);
        swipeDetector.onTouchEvent(event);
        return true;
    }

    public interface GestureListener {
        void onAction(int action);
    }
}