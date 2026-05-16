package com.tsf.shell.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import com.tsf.shell.data.local.entity.FavoriteItem;

public class DesktopPagerView extends ViewGroup {

    private Scroller scroller;
    private VelocityTracker velocityTracker;
    private int touchSlop;
    private int minimumFlingVelocity;
    private int maximumFlingVelocity;

    private float downX, downY;
    private float lastMotionX;
    private int currentPage;
    private int pageWidth;
    private boolean isBeingDragged;
    private boolean isDraggingChild;

    private OnPageChangeListener pageChangeListener;

    public DesktopPagerView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        scroller = new Scroller(context);
        ViewConfiguration vc = ViewConfiguration.get(context);
        touchSlop = vc.getScaledTouchSlop();
        minimumFlingVelocity = vc.getScaledMinimumFlingVelocity();
        maximumFlingVelocity = vc.getScaledMaximumFlingVelocity();
        setClipChildren(true);
    }

    public void setCurrentPage(int page) {
        if (page < 0 || page >= getChildCount() || page == currentPage) return;
        currentPage = page;
        if (pageWidth > 0) {
            smoothScrollTo(page * pageWidth);
        }
        if (pageChangeListener != null) {
            pageChangeListener.onPageSelected(currentPage);
        }
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getPageCount() {
        return getChildCount();
    }

    public void addPage(View page) {
        addView(page, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        requestLayout();
    }

    public void removeAllPages() {
        removeAllViews();
        currentPage = 0;
        if (pageChangeListener != null) {
            pageChangeListener.onPageSelected(0);
        }
        requestLayout();
    }

    public void addItemToCurrentPage(FavoriteItem item) {
        int pageChildCount = 0;
        View v = getChildAt(currentPage);
        if (v instanceof DesktopPage) {
            pageChildCount = ((DesktopPage) v).getItems().size();
        }
        float cx = pageWidth / 2f + (pageChildCount % 5) * 80f - 160f;
        float cy = getHeight() / 2f + (pageChildCount / 5) * 80f - 80f;
        item.cellX = (int) cx;
        item.cellY = (int) cy;
        item.screen = currentPage;
    }

    public void setOnPageChangeListener(OnPageChangeListener listener) {
        this.pageChangeListener = listener;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
        pageWidth = width;
        setMeasuredDimension(width, height);

        int childWidthSpec = MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY);
        int childHeightSpec = MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY);
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            getChildAt(i).measure(childWidthSpec, childHeightSpec);
        }
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int count = getChildCount();
        int childWidth = r - l;
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            child.layout(i * childWidth, 0, (i + 1) * childWidth, b - t);
        }
        if (changed) {
            scrollTo(currentPage * childWidth, 0);
        }
    }

    @Override
    public void computeScroll() {
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            postInvalidate();
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (getChildCount() == 0) return false;

        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
        }
        velocityTracker.addMovement(ev);

        float x = ev.getX();
        float y = ev.getY();

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                downX = x;
                downY = y;
                lastMotionX = x;
                isBeingDragged = false;
                isDraggingChild = false;

                if (!scroller.isFinished()) {
                    scroller.abortAnimation();
                }

                View currentPageView = getChildAt(currentPage);
                if (currentPageView instanceof DesktopPage) {
                    DesktopPage dp = (DesktopPage) currentPageView;
                    FavoriteItem hit = dp.findItemAtScreen(x, y);
                    isDraggingChild = hit != null;
                }
                return false;
            }
            case MotionEvent.ACTION_MOVE: {
                float dx = x - downX;
                float dy = y - downY;

                if (isDraggingChild) {
                    return false;
                }

                if (Math.abs(dx) > touchSlop && Math.abs(dx) > Math.abs(dy)) {
                    isBeingDragged = true;
                    lastMotionX = x;
                    return true;
                }
                return false;
            }
            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP: {
                isBeingDragged = false;
                isDraggingChild = false;
                recycleVelocityTracker();
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (getChildCount() == 0) return false;

        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
        }
        velocityTracker.addMovement(ev);

        float x = ev.getX();

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                if (!scroller.isFinished()) {
                    scroller.abortAnimation();
                }
                lastMotionX = x;
                return true;
            }
            case MotionEvent.ACTION_MOVE: {
                float dx = lastMotionX - x;
                lastMotionX = x;

                int scrollX = getScrollX();
                int maxScrollX = Math.max(0, (getChildCount() - 1) * pageWidth);

                int targetX = scrollX + (int) dx;
                if (targetX < 0) {
                    targetX = 0;
                } else if (targetX > maxScrollX) {
                    targetX = maxScrollX;
                }
                scrollTo(targetX, 0);
                return true;
            }
            case MotionEvent.ACTION_UP: {
                velocityTracker.computeCurrentVelocity(1000, maximumFlingVelocity);
                float xVelocity = velocityTracker.getXVelocity();

                int targetPage;
                int scrollX = getScrollX();

                if (Math.abs(xVelocity) > minimumFlingVelocity) {
                    targetPage = currentPage + (xVelocity > 0 ? -1 : 1);
                } else {
                    int halfPage = pageWidth / 2;
                    targetPage = (scrollX + halfPage) / pageWidth;
                }

                targetPage = Math.max(0, Math.min(targetPage, getChildCount() - 1));
                currentPage = targetPage;
                smoothScrollTo(targetPage * pageWidth);

                recycleVelocityTracker();
                if (pageChangeListener != null) {
                    pageChangeListener.onPageSelected(currentPage);
                }
                return true;
            }
            case MotionEvent.ACTION_CANCEL: {
                int scrollX = getScrollX();
                int targetPage = (scrollX + pageWidth / 2) / pageWidth;
                targetPage = Math.max(0, Math.min(targetPage, getChildCount() - 1));
                currentPage = targetPage;
                smoothScrollTo(targetPage * pageWidth);
                recycleVelocityTracker();
                if (pageChangeListener != null) {
                    pageChangeListener.onPageSelected(currentPage);
                }
                return true;
            }
        }
        return false;
    }

    private void smoothScrollTo(int destX) {
        int scrollX = getScrollX();
        int delta = destX - scrollX;
        scroller.startScroll(scrollX, 0, delta, 0, Math.min(Math.abs(delta) * 2, 400));
        postInvalidate();
    }

    private void recycleVelocityTracker() {
        if (velocityTracker != null) {
            velocityTracker.recycle();
            velocityTracker = null;
        }
    }

    public interface OnPageChangeListener {
        void onPageSelected(int page);
    }
}
