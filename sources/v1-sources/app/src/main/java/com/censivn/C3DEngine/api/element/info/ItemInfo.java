package com.censivn.C3DEngine.api.element.info;

import android.content.ContentValues;

/* loaded from: classes.dex */
public class ItemInfo {
    public static final int NO_ID = -1;
    public int cellX;
    public int cellXH;
    public int cellY;
    public int cellYH;
    public int container;
    public byte[] data;
    public int height;
    public int heightH;
    public long id;
    public int itemType;
    public int rotation;
    public int rotationH;
    public float scale;
    public float scaleH;
    public int screen;
    public int width;
    public int widthH;

    public ItemInfo() {
        this.id = -1L;
        this.container = -1;
        this.screen = -1;
        this.cellX = 0;
        this.cellXH = 0;
        this.cellY = 0;
        this.cellYH = 0;
        this.rotation = 0;
        this.rotationH = 0;
        this.width = 100;
        this.widthH = 100;
        this.height = 100;
        this.heightH = 100;
        this.scale = 1.0f;
        this.scaleH = 1.0f;
    }

    public ItemInfo(ItemInfo itemInfo) {
        this.id = -1L;
        this.container = -1;
        this.screen = -1;
        this.cellX = 0;
        this.cellXH = 0;
        this.cellY = 0;
        this.cellYH = 0;
        this.rotation = 0;
        this.rotationH = 0;
        this.width = 100;
        this.widthH = 100;
        this.height = 100;
        this.heightH = 100;
        this.scale = 1.0f;
        this.scaleH = 1.0f;
        this.id = itemInfo.id;
        this.cellX = itemInfo.cellX;
        this.cellY = itemInfo.cellY;
        this.width = itemInfo.width;
        this.height = itemInfo.height;
        this.screen = itemInfo.screen;
        this.itemType = itemInfo.itemType;
        this.container = itemInfo.container;
        this.rotation = itemInfo.rotation;
    }

    public void onUpdateData(ContentValues contentValues) {
        contentValues.put("itemType", Integer.valueOf(this.itemType));
        contentValues.put("container", Integer.valueOf(this.container));
        contentValues.put("screen", Integer.valueOf(this.screen));
    }

    public void onDelFromDatabase() {
    }

    public void onInsertToDatabase(ContentValues contentValues) {
    }

    public void unbind() {
    }

    public String toString() {
        return "Item(id=" + this.id + " type=" + this.itemType + ")";
    }
}
