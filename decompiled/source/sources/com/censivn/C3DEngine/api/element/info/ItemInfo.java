package com.censivn.C3DEngine.api.element.info;

import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tsf.shell.f.i.b;
import com.tsf.shell.f.i.b.b.a;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.utils.x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class ItemInfo {
    public static final int APP_CLICKCNT = 32;
    public static final int APP_CONFIG = 16;
    public static final int APP_CONTAINER = 4;
    public static final int APP_INDEX = 2;
    public static final int APP_INTENT = 128;
    public static final int APP_ISHIDE = 64;
    public static final int APP_ITEM_TYPE = 8;
    public static final int APP_TITLE = 1;
    public static final int APP_VERSION_CODE = 256;
    public static final int APP_VERSION_NAME = 512;
    public static final int NO_ID = -1;
    public Intent.ShortcutIconResource iconResource;
    public int index;
    public int itemType;
    public String themeResourceName;
    public String title;
    private b widget;
    public int id = -1;
    public int container = -1;
    public int screen = 0;
    public int cellX = 0;
    public int cellXH = 0;
    public int cellY = 0;
    public int cellYH = 0;
    public int rotation = 0;
    public int rotationH = 0;
    public int width = 100;
    public int widthH = 100;
    public int height = 100;
    public int heightH = 100;
    public float scale = 1.0f;
    public float scaleH = 1.0f;
    public String packagename = "";
    public String config = "";
    public int iconType = 0;
    public int titleType = 0;

    public abstract ItemInfo copy();

    public static void copyInfo(ItemInfo itemInfo, ItemInfo itemInfo2) {
        itemInfo2.itemType = itemInfo.itemType;
        if (itemInfo.title != null) {
            itemInfo2.title = itemInfo.title.toString();
        }
        itemInfo2.container = itemInfo.container;
        itemInfo2.screen = itemInfo.screen;
        itemInfo2.cellX = itemInfo.cellX;
        itemInfo2.cellXH = itemInfo.cellXH;
        itemInfo2.cellY = itemInfo.cellY;
        itemInfo2.cellYH = itemInfo.cellYH;
        itemInfo2.rotation = itemInfo.rotation;
        itemInfo2.rotationH = itemInfo.rotationH;
        itemInfo2.width = itemInfo.width;
        itemInfo2.widthH = itemInfo.widthH;
        itemInfo2.height = itemInfo.height;
        itemInfo2.heightH = itemInfo.heightH;
        itemInfo2.scale = itemInfo.scale;
        itemInfo2.scaleH = itemInfo.scaleH;
        itemInfo2.packagename = itemInfo.packagename;
        itemInfo2.config = itemInfo.config;
        itemInfo2.iconType = itemInfo.iconType;
        itemInfo2.titleType = itemInfo.titleType;
        if (itemInfo.iconResource != null) {
            itemInfo2.iconResource = new Intent.ShortcutIconResource();
            itemInfo2.iconResource.packageName = itemInfo.iconResource.packageName;
            itemInfo2.iconResource.resourceName = itemInfo.iconResource.resourceName;
        }
    }

    public ItemInfo(int i) {
        this.itemType = i;
    }

    public void setWidget(b bVar) {
        this.widget = bVar;
    }

    public b getWidget() {
        return this.widget;
    }

    public void onAddToDatabase(ContentValues contentValues) {
        contentValues.put("itemType", Integer.valueOf(this.itemType));
        contentValues.put("container", Integer.valueOf(this.container));
        contentValues.put("screen", Integer.valueOf(this.screen));
        contentValues.put("packagename", this.packagename);
        contentValues.put("cellX", this.cellX + "," + this.cellXH);
        contentValues.put("cellY", this.cellY + "," + this.cellYH);
        contentValues.put("rotation", this.rotation + "," + this.rotationH);
        contentValues.put("scale", this.scale + "," + this.scaleH);
    }

    public void onUpdateLayoutInformation(ContentValues contentValues, b bVar) {
        if (!(bVar instanceof a) && bVar != null) {
            if (com.censivn.C3DEngine.b.b.a.O) {
                this.scale = bVar.u();
                this.cellX = (int) bVar.position().x;
                this.cellY = (int) bVar.position().y;
                this.rotation = (int) bVar.rotation().z;
            } else {
                this.scaleH = bVar.u();
                this.cellXH = (int) bVar.position().x;
                this.cellYH = (int) bVar.position().y;
                this.rotationH = (int) bVar.rotation().z;
            }
        }
        contentValues.put("container", Integer.valueOf(this.container));
        contentValues.put("screen", Integer.valueOf(this.screen));
        contentValues.put("cellX", this.cellX + "," + this.cellXH);
        contentValues.put("cellY", this.cellY + "," + this.cellYH);
        contentValues.put("rotation", this.rotation + "," + this.rotationH);
        contentValues.put("scale", this.scale + "," + this.scaleH);
    }

    public void onUpdateContainer(int i) {
        ContentValues contentValues = new ContentValues();
        updateContainer(contentValues, i);
        updateDatabase(contentValues);
    }

    public void updateContainer(ContentValues contentValues, int i) {
        int i2 = this.container;
        this.container = i;
        if (i2 != this.container) {
            ShellModel.a.a(this, i2, this.container);
        }
        if (contentValues != null) {
            contentValues.put("container", Integer.valueOf(i));
        }
    }

    public void onUpdateConfig(String str) {
        ContentValues contentValues = new ContentValues();
        updateConfig(contentValues, str);
        updateDatabase(contentValues);
    }

    public void updateConfig(ContentValues contentValues, String str) {
        this.config = str;
        contentValues.put("config", str);
    }

    public void onUpdatePhoto(Bitmap bitmap, Runnable runnable) {
        ContentValues contentValues = new ContentValues();
        updatePhoto(contentValues, bitmap);
        updateDatabase(contentValues, runnable);
    }

    public void updatePhoto(ContentValues contentValues, Bitmap bitmap) {
        if (bitmap != null) {
            this.iconType = 2;
            contentValues.put("iconType", (Integer) 2);
            contentValues.put("iconPackage", "");
            contentValues.put("iconResource", "");
            writeBitmap(contentValues, bitmap);
            bitmap.recycle();
        } else if (this.iconResource == null) {
            this.iconType = 0;
            contentValues.put("icon", "");
            contentValues.put("iconType", (Integer) 0);
            contentValues.put("iconPackage", "");
            contentValues.put("iconResource", "");
        } else {
            this.iconType = 1;
            contentValues.put("iconType", (Integer) 1);
            contentValues.put("iconPackage", this.iconResource.packageName);
            contentValues.put("iconResource", this.iconResource.resourceName);
        }
    }

    public Bitmap getPhoto() {
        switch (this.iconType) {
            case 1:
                try {
                    Resources resourcesForApplication = com.censivn.C3DEngine.a.d().getPackageManager().getResourcesForApplication(this.iconResource.packageName);
                    if (resourcesForApplication != null) {
                        return x.a(resourcesForApplication, resourcesForApplication.getIdentifier(this.iconResource.resourceName, null, null));
                    }
                    return null;
                } catch (Exception e) {
                    return null;
                }
            case 2:
                byte[] a = ShellModel.a.a(this);
                if (a != null) {
                    try {
                        return BitmapFactory.decodeByteArray(a, 0, a.length);
                    } catch (Exception e2) {
                        return null;
                    }
                }
                return null;
            default:
                return null;
        }
    }

    public void onUpdateName(String str, boolean z) {
        ContentValues contentValues = new ContentValues();
        updateName(contentValues, str, z);
        updateDatabase(contentValues);
    }

    public void updateName(ContentValues contentValues, String str, boolean z) {
        this.title = str;
        if (z) {
            this.titleType = 1;
        } else {
            this.titleType = 0;
        }
        contentValues.put("titleType", Integer.valueOf(this.titleType));
        contentValues.put("title", this.title);
    }

    public void updateDatabase(ContentValues contentValues) {
        ShellModel.a.a(contentValues, this, (Runnable) null);
    }

    public void updateDatabase(ContentValues contentValues, Runnable runnable) {
        ShellModel.a.a(contentValues, this, runnable);
    }

    static void writeBitmap(ContentValues contentValues, Bitmap bitmap) {
        if (bitmap != null) {
            contentValues.put("icon", flattenBitmap(bitmap));
        }
    }

    static byte[] flattenBitmap(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getWidth() * bitmap.getHeight() * 4);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            return null;
        }
    }

    public void unbind() {
        this.widget = null;
    }

    public void unbindGL() {
    }
}
