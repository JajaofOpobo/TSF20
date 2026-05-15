package com.tsf.shell.render;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.View;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class LibGDXRenderer implements ILauncherRenderer {

    private Context context;
    private GLSurfaceView glSurfaceView;
    private View desktopView;
    private int currentPage = 0;
    private int pageCount = 5;
    private boolean ready = false;

    public LibGDXRenderer(Context context) {
        this.context = context;
    }

    public GLSurfaceView getSurfaceView() {
        if (glSurfaceView == null) {
            glSurfaceView = new GLSurfaceView(context);
            glSurfaceView.setRenderer(new GLRenderer());
            glSurfaceView.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
        }
        return glSurfaceView;
    }

    private static class GLRenderer implements GLSurfaceView.Renderer {
        @Override
        public void onSurfaceCreated(GL10 gl, EGLConfig config) {
            gl.glClearColor(0.1f, 0.1f, 0.15f, 1.0f);
        }

        @Override
        public void onSurfaceChanged(GL10 gl, int width, int height) {
            gl.glViewport(0, 0, width, height);
        }

        @Override
        public void onDrawFrame(GL10 gl) {
            gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
        }
    }

    @Override
    public void initialize() {
        getSurfaceView();
        ready = true;
    }

    @Override
    public void setPage(int pageIndex) {
        if (pageIndex >= 0 && pageIndex < pageCount) {
            currentPage = pageIndex;
        }
    }

    @Override
    public int getPageCount() {
        return pageCount;
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
    public void playTransition(int fromPage, int toPage) {}

    @Override
    public void setDesktopView(View desktopView) {
        this.desktopView = desktopView;
    }

    @Override
    public void release() {
        if (glSurfaceView != null) {
            glSurfaceView.onPause();
            glSurfaceView = null;
        }
        ready = false;
    }

    @Override
    public boolean isReady() {
        return ready;
    }
}