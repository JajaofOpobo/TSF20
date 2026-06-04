package com.censivn.C3DEngine.api.element.info;

import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.censivn.C3DEngine.a;
import com.tsf.shell.R;
import com.tsf.shell.bm;
import com.tsf.shell.workspace3D.k.b.ap;

/* loaded from: classes.dex */
public class LauncherShortcut3DInfo extends LauncherItem3DInfo {
    public static final int CONTAINER_DESKTOP = -1;
    public static final int CONTAINER_FOLDER = -3;
    public static final int CONTAINER_QUICKLAUNCH = -2;
    public LauncherFolder3DInfo folderInfo;
    public Intent.ShortcutIconResource iconResource;
    public int iconType;
    public String intent;
    public Intent intentInstance;
    public boolean isCustomName;

    public LauncherShortcut3DInfo(int i) {
        super(i);
        this.iconType = -1;
        this.isCustomName = false;
        this.itemType = 6;
    }

    public void onUpdatePhoto(Bitmap bitmap) {
        if (this.id == -1) {
            bm.a((LauncherItem3DInfo) this);
        } else {
            bm.a(a.c(), this);
        }
        ContentValues contentValues = new ContentValues();
        if (bitmap == null || bitmap.isRecycled()) {
            if (this.iconResource != null) {
                String str = this.isCustomName ? "1" : "0";
                contentValues.put("data", "");
                contentValues.put("packagename", this.iconResource.packageName);
                contentValues.put("config", "0," + this.iconResource.resourceName + "," + str);
                bm.a(a.c(), contentValues, this);
                this.iconType = 0;
                return;
            }
            contentValues.put("data", "");
            contentValues.put("config", "");
            bm.a(a.c(), contentValues, this);
            this.iconType = -1;
            return;
        }
        String str2 = this.isCustomName ? "1" : "0";
        contentValues.put("data", com.censivn.C3DEngine.h.a.a(bitmap));
        contentValues.put("config", "1,," + str2);
        bm.a(a.c(), contentValues, this);
        this.iconType = 1;
    }

    public void onUpdateName(String str) {
        this.title = str;
        this.isCustomName = true;
        ContentValues contentValues = new ContentValues();
        String str2 = this.isCustomName ? "1" : "0";
        if (this.iconType == 1) {
            contentValues.put("config", "1,," + str2);
            contentValues.put("title", this.title);
            bm.a(a.c(), contentValues, this);
        } else {
            contentValues.put("config", "0," + (this.iconResource == null ? "" : this.iconResource.resourceName) + "," + str2);
            contentValues.put("title", this.title);
            bm.a(a.c(), contentValues, this);
        }
    }

    @Override // com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo, com.censivn.C3DEngine.api.element.info.ItemInfo
    public void onUpdateData(ContentValues contentValues) {
        super.onUpdateData(contentValues);
        if (this.folderInfo != null) {
            contentValues.put("container", (Integer) (-3));
            contentValues.put("screen", Integer.valueOf(this.folderInfo.appWidgetId));
        } else {
            contentValues.put("container", Integer.valueOf(this.container));
        }
        contentValues.put("intent", this.intent);
        contentValues.put("title", this.title);
    }

    public void parse(String str) {
        if (str != null && !str.equals("")) {
            try {
                this.intentInstance = Intent.parseUri(this.intent, 0);
            } catch (Exception e) {
            }
            try {
                String[] split = str.split(",");
                this.iconType = Integer.parseInt(split[0]);
                if (split.length > 2) {
                    this.isCustomName = split[2].equals("1");
                }
                switch (this.iconType) {
                    case 0:
                        if (split.length > 1) {
                            String str2 = split[1];
                            if (str2.equals("")) {
                                this.iconType = -1;
                                break;
                            } else {
                                this.iconResource = new Intent.ShortcutIconResource();
                                this.iconResource.packageName = this.packagename;
                                this.iconResource.resourceName = str2;
                                break;
                            }
                        }
                        break;
                }
            } catch (Exception e2) {
            }
        }
    }

    public Bitmap getDefaultIcon() {
        Bitmap bitmap = null;
        if (this.iconResource != null) {
            try {
                Resources resourcesForApplication = a.c().getPackageManager().getResourcesForApplication(this.iconResource.packageName);
                bitmap = com.censivn.C3DEngine.h.a.a(resourcesForApplication, resourcesForApplication.getIdentifier(this.iconResource.resourceName, null, null));
            } catch (Exception e) {
            }
        }
        if (bitmap == null) {
            return com.censivn.C3DEngine.h.a.a(a.c(), R.drawable.dummy_icon);
        }
        return bitmap;
    }

    public Bitmap getIcon(boolean z) {
        return getIcon(z, ap.E, ap.E);
    }

    public Bitmap getIcon(boolean z, int i, int i2) {
        Bitmap bitmap = null;
        switch (this.iconType) {
            case 0:
                try {
                    Resources resourcesForApplication = a.c().getPackageManager().getResourcesForApplication(this.iconResource.packageName);
                    bitmap = com.censivn.C3DEngine.h.a.a(resourcesForApplication, resourcesForApplication.getIdentifier(this.iconResource.resourceName, null, null));
                    break;
                } catch (Exception e) {
                    break;
                }
            case 1:
                byte[] a = bm.a((ItemInfo) this);
                if (a != null) {
                    try {
                        bitmap = BitmapFactory.decodeByteArray(a, 0, a.length);
                        break;
                    } catch (Exception e2) {
                        break;
                    }
                }
                break;
        }
        if (bitmap == null && !z) {
            bitmap = com.censivn.C3DEngine.h.a.a(a.c(), R.drawable.dummy_icon);
        }
        if (bitmap != null) {
            if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                if (createScaledBitmap != bitmap) {
                    bitmap.recycle();
                }
                return createScaledBitmap;
            }
            return bitmap;
        }
        return bitmap;
    }

    @Override // com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo, com.censivn.C3DEngine.api.element.info.ItemInfo
    public void unbind() {
        super.unbind();
        this.folderInfo = null;
    }
}
