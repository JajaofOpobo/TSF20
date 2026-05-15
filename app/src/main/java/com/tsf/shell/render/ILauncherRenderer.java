package com.tsf.shell.render;

import android.view.View;

public interface ILauncherRenderer {
    void initialize();
    void setDesktopView(View desktopView);
    void setPage(int pageIndex);
    int getPageCount();
    int getCurrentPage();
    void beginDrag(View draggedView, float x, float y);
    void updateDrag(float x, float y);
    void endDrag();
    void playTransition(int fromPage, int toPage);
    void release();
    boolean isReady();
}
