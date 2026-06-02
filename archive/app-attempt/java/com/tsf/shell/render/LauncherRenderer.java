package com.tsf.shell.render;

import android.view.View;

public interface LauncherRenderer {

    void initialize();

    void setDesktopView(View desktopView);

    void showDesktop();

    void showAppDrawer();

    void showFolder(long folderId);

    void onScroll(float progress);

    void onDragStart(long itemId);

    void onDrag(float x, float y);

    void onDragEnd(long itemId, float dropX, float dropY);

    void release();

    interface DesktopItemView {
        long getItemId();
        View getView();
        void setScale(float scale);
        void setAlpha(float alpha);
    }

    interface DesktopPageView {
        int getPageIndex();
        View getView();
    }

    interface FolderView {
        long getFolderId();
        View getView();
        void open();
        void close();
    }
}