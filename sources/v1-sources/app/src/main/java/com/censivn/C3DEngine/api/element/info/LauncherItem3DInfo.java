package com.censivn.C3DEngine.api.element.info;

import android.content.ContentValues;
import com.censivn.C3DEngine.a;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.j;

/* loaded from: classes.dex */
public class LauncherItem3DInfo extends ItemInfo {
    public int appWidgetId;
    public boolean internal;
    j mWidget;
    public String title = "";
    public String packagename = "";
    public String classname = "";
    public String config = "";
    public boolean isRecreate = true;

    public LauncherItem3DInfo(int i) {
        this.itemType = 2;
        this.appWidgetId = i;
        bf.l().e(this.appWidgetId);
    }

    public void setTarget(j jVar) {
        this.mWidget = jVar;
    }

    public j getTarget() {
        return this.mWidget;
    }

    @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
    public void onUpdateData(ContentValues contentValues) {
        super.onUpdateData(contentValues);
        if (a.q) {
            this.scale = this.mWidget.aN();
            this.cellX = (int) this.mWidget.L().x;
            this.cellY = (int) this.mWidget.L().y;
            this.rotation = (int) this.mWidget.M().z;
        } else {
            this.scaleH = this.mWidget.aN();
            this.cellXH = (int) this.mWidget.L().x;
            this.cellYH = (int) this.mWidget.L().y;
            this.rotationH = (int) this.mWidget.M().z;
        }
        contentValues.put("appWidgetId", Integer.valueOf(this.appWidgetId));
        contentValues.put("screen", Integer.valueOf(this.screen));
        contentValues.put("cellX", String.valueOf(this.cellX) + "," + this.cellXH);
        contentValues.put("cellY", String.valueOf(this.cellY) + "," + this.cellYH);
        contentValues.put("rotation", String.valueOf(this.rotation) + "," + this.rotationH);
        contentValues.put("packagename", this.packagename);
        contentValues.put("classname", this.classname);
        contentValues.put("internal", Boolean.valueOf(this.internal));
        if (!(this instanceof LauncherShortcut3DInfo)) {
            contentValues.put("config", this.config);
        }
        contentValues.put("scale", String.valueOf(this.scale) + "," + this.scaleH);
        if (this.data != null) {
            contentValues.put("data", this.data);
        }
    }

    @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
    public String toString() {
        return "AppWidget(id=" + Integer.toString(this.appWidgetId) + "  classname:" + this.classname + ")   packagename:" + this.packagename + "   title:" + this.title;
    }

    @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
    public void unbind() {
        super.unbind();
        this.mWidget = null;
    }
}
