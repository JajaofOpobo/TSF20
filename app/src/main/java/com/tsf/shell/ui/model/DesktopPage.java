package com.tsf.shell.ui.model;

import com.tsf.shell.data.local.entity.FavoriteItem;
import java.util.ArrayList;
import java.util.List;

public class DesktopPage {

    private final int pageIndex;
    private final List<FavoriteItem> items = new ArrayList<>();

    public DesktopPage(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public List<FavoriteItem> getItems() {
        return items;
    }

    public void addItem(FavoriteItem item) {
        items.add(item);
    }

    public void removeItem(FavoriteItem item) {
        items.remove(item);
    }

    public void clear() {
        items.clear();
    }

    public FavoriteItem findItemAt(int cellX, int cellY) {
        for (FavoriteItem item : items) {
            if (item.cellX == cellX && item.cellY == cellY) {
                return item;
            }
        }
        return null;
    }

    public int count() {
        return items.size();
    }
}