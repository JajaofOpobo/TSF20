package com.censivn.C3DEngine.api.element.info;

import android.content.ContentValues;
import com.tsf.shell.workspace3D.b.a;

/* loaded from: classes.dex */
public class LauncherAppWidgetInfo extends LauncherItem3DInfo {
    public a mAndroidWidgetManager;
    public LauncherAppWidgetInfo mThis;

    public LauncherAppWidgetInfo(int i) {
        super(i);
        this.mThis = this;
        this.itemType = 3;
    }

    @Override // com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo, com.censivn.C3DEngine.api.element.info.ItemInfo
    public void onUpdateData(ContentValues contentValues) {
        contentValues.put("itemType", Integer.valueOf(this.itemType));
        contentValues.put("container", Integer.valueOf(this.container));
        contentValues.put("appWidgetId", Integer.valueOf(this.appWidgetId));
        contentValues.put("screen", Integer.valueOf(this.screen));
        contentValues.put("cellX", String.valueOf(this.cellX) + "," + this.cellXH);
        contentValues.put("cellY", String.valueOf(this.cellY) + "," + this.cellYH);
        contentValues.put("rotation", Integer.valueOf(this.rotation));
        contentValues.put("packagename", this.packagename);
        contentValues.put("classname", this.classname);
        contentValues.put("internal", Boolean.valueOf(this.internal));
        contentValues.put("scale", String.valueOf(this.scale) + "," + this.scaleH);
        contentValues.put("spanX", String.valueOf(this.width) + "," + this.widthH);
        contentValues.put("spanY", String.valueOf(this.height) + "," + this.heightH);
    }

    @Override // com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo, com.censivn.C3DEngine.api.element.info.ItemInfo
    public void unbind() {
        super.unbind();
    }
}
