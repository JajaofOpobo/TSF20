package com.tsf.shell.render;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.opengl.GLSurfaceView;
import android.view.View;

public class LibGDXRenderer implements ILauncherRenderer {

    private Context context;
    private GLSurfaceView glSurfaceView;
    private PageTransitionRenderer transitionRenderer;
    private View desktopView;
    private int currentPage = 0;
    private int pageCount = 5;
    private boolean ready = false;

    public LibGDXRenderer(Context context) {
        this.context = context;
    }

    public GLSurfaceView getSurfaceView() {
        if (glSurfaceView == null) {
            transitionRenderer = new PageTransitionRenderer();
            glSurfaceView = new GLSurfaceView(context);
            glSurfaceView.setEGLContextClientVersion(2);
            glSurfaceView.setRenderer(transitionRenderer);
            glSurfaceView.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
        }
        return glSurfaceView;
    }

    public void updatePageTexture(int pageIndex, View pageView) {
        if (pageView == null || pageView.getWidth() <= 0 || pageView.getHeight() <= 0) return;
        Bitmap bitmap = Bitmap.createBitmap(pageView.getWidth(), pageView.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        pageView.draw(canvas);
        transitionRenderer.setPageTexture(pageIndex, bitmap);
    }

    public void updateAllPageTextures(View[] pageViews) {
        if (pageViews == null) return;
        for (int i = 0; i < pageViews.length && i < pageCount; i++) {
            updatePageTexture(i, pageViews[i]);
        }
    }

    @Override
    public void initialize() {
        getSurfaceView();
        transitionRenderer.setPageCount(pageCount);
        transitionRenderer.snapToPage(0);
        ready = true;
    }

    @Override
    public void setPage(int pageIndex) {
        if (pageIndex >= 0 && pageIndex < pageCount) {
            currentPage = pageIndex;
            if (transitionRenderer != null) {
                transitionRenderer.animateToPage(pageIndex);
            }
        }
    }

    @Override
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int count) {
        this.pageCount = count;
        if (transitionRenderer != null) {
            transitionRenderer.setPageCount(count);
        }
    }

    @Override
    public int getCurrentPage() {
        return currentPage;
    }

    @Override
    public void beginDrag(View draggedView, float x, float y) {}

    @Override
    public void updateDrag(float x, float y) {}

    @Override
    public void endDrag() {}

    @Override
    public void playTransition(int fromPage, int toPage) {
        if (transitionRenderer != null) {
            transitionRenderer.animateToPage(toPage);
        }
        currentPage = toPage;
    }

    @Override
    public void setDesktopView(View desktopView) {
        this.desktopView = desktopView;
    }

    public View getDesktopView() {
        return desktopView;
    }

    @Override
    public void release() {
        if (glSurfaceView != null) {
            glSurfaceView.onPause();
            glSurfaceView = null;
        }
        transitionRenderer = null;
        ready = false;
    }

    @Override
    public boolean isReady() {
        return ready;
    }
}
