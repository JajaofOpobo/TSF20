package com.tsf.shell.settings;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;

public class GestureEngine implements View.OnTouchListener {

    public static final int DIR_UP = 0;
    public static final int DIR_DOWN = 1;
    public static final int DIR_LEFT = 2;
    public static final int DIR_RIGHT = 3;

    private final GestureDetector gestureDetector;
    private final ScaleGestureDetector scaleDetector;
    private final GestureCallback callback;
    private final int touchSlop;

    private float twoFingerStartX, twoFingerStartY;
    private boolean trackingTwoFinger;
    private boolean twoFingerTriggered;
    private float pinchStartSpan;

    public GestureEngine(Context context, GestureCallback callback) {
        this.callback = callback;
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onDoubleTap(MotionEvent e) {
                if (callback != null) callback.onDoubleTap();
                return true;
            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                if (e1 == null || e2 == null) return false;
                float dx = e2.getX() - e1.getX();
                float dy = e2.getY() - e1.getY();
                if (Math.abs(dy) > Math.abs(dx) && Math.abs(dy) > touchSlop * 4) {
                    if (dy > 0) {
                        if (callback != null) callback.onSwipeDown();
                    } else {
                        if (callback != null) callback.onSwipeUp();
                    }
                    return true;
                }
                return false;
            }
        });
        gestureDetector.setIsLongpressEnabled(false);

        this.scaleDetector = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener() {
            @Override
            public boolean onScaleBegin(ScaleGestureDetector detector) {
                pinchStartSpan = detector.getCurrentSpan();
                return true;
            }

            @Override
            public boolean onScale(ScaleGestureDetector detector) {
                float span = detector.getCurrentSpan();
                if (Math.abs(span - pinchStartSpan) > touchSlop * 2) {
                    if (span > pinchStartSpan) {
                        if (callback != null) callback.onPinchOut();
                    } else {
                        if (callback != null) callback.onPinchIn();
                    }
                }
                return true;
            }
        });
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        scaleDetector.onTouchEvent(event);
        trackTwoFinger(event);
        return false;
    }

    private void trackTwoFinger(MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_POINTER_DOWN: {
                if (event.getPointerCount() == 2 && !trackingTwoFinger) {
                    trackingTwoFinger = true;
                    twoFingerTriggered = false;
                    twoFingerStartX = (event.getX(0) + event.getX(1)) / 2f;
                    twoFingerStartY = (event.getY(0) + event.getY(1)) / 2f;
                }
                break;
            }
            case MotionEvent.ACTION_MOVE: {
                if (trackingTwoFinger && !twoFingerTriggered && event.getPointerCount() == 2) {
                    float cx = (event.getX(0) + event.getX(1)) / 2f;
                    float cy = (event.getY(0) + event.getY(1)) / 2f;
                    float dx = cx - twoFingerStartX;
                    float dy = cy - twoFingerStartY;
                    float threshold = touchSlop * 4;
                    if (Math.abs(dx) > threshold || Math.abs(dy) > threshold) {
                        twoFingerTriggered = true;
                        if (Math.abs(dx) > Math.abs(dy)) {
                            if (dx > 0) {
                                if (callback != null) callback.onTwoFingerSwipe(DIR_RIGHT);
                            } else {
                                if (callback != null) callback.onTwoFingerSwipe(DIR_LEFT);
                            }
                        } else {
                            if (dy > 0) {
                                if (callback != null) callback.onTwoFingerSwipe(DIR_DOWN);
                            } else {
                                if (callback != null) callback.onTwoFingerSwipe(DIR_UP);
                            }
                        }
                    }
                }
                break;
            }
            case MotionEvent.ACTION_POINTER_UP:
            case MotionEvent.ACTION_CANCEL: {
                trackingTwoFinger = false;
                twoFingerTriggered = false;
                break;
            }
        }
    }

    public interface GestureCallback {
        void onDoubleTap();
        void onSwipeUp();
        void onSwipeDown();
        void onPinchIn();
        void onPinchOut();
        void onTwoFingerSwipe(int direction);
    }
}
