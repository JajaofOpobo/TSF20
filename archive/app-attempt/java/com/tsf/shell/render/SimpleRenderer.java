package com.tsf.shell.render;

import android.view.View;

public class SimpleRenderer implements LauncherRenderer {

    private View desktopView;

    @Override
    public void initialize() {
    }

    @Override
    public void setDesktopView(View desktopView) {
        this.desktopView = desktopView;
    }

    @Override
    public void showDesktop() {
    }

    @Override
    public void showAppDrawer() {
    }

    @Override
    public void showFolder(long folderId) {
    }

    @Override
    public void onScroll(float progress) {
    }

    @Override
    public void onDragStart(long itemId) {
    }

    @Override
    public void onDrag(float x, float y) {
    }

    @Override
    public void onDragEnd(long itemId, float dropX, float dropY) {
    }

    @Override
    public void release() {
        desktopView = null;
    }
}