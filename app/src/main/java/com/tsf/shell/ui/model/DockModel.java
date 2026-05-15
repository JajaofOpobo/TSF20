package com.tsf.shell.ui.model;

import com.tsf.shell.data.local.entity.DockItem;
import java.util.ArrayList;
import java.util.List;

public class DockModel {

    private final List<DockItem> items = new ArrayList<>();
    private int maxSlots = 5;

    public DockModel() {
    }

    public List<DockItem> getItems() {
        return items;
    }

    public void setMaxSlots(int slots) {
        this.maxSlots = slots;
    }

    public int getMaxSlots() {
        return maxSlots;
    }

    public void setItems(List<DockItem> newItems) {
        items.clear();
        items.addAll(newItems);
    }

    public void addItem(DockItem item) {
        if (items.size() < maxSlots) {
            items.add(item);
        }
    }

    public void removeItem(DockItem item) {
        items.remove(item);
    }

    public DockItem getItemAt(int slot) {
        if (slot >= 0 && slot < items.size()) {
            return items.get(slot);
        }
        return null;
    }

    public void clear() {
        items.clear();
    }

    public int count() {
        return items.size();
    }
}