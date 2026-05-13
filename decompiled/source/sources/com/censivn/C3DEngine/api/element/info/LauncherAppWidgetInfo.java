package com.censivn.C3DEngine.api.element.info;

import android.content.ComponentName;
import android.content.ContentValues;
import com.tsf.shell.manager.r.a.b;
/* loaded from: classes.dex */
public class LauncherAppWidgetInfo extends ItemInfo {
    public int appWidgetId;
    public b mAndroidWidgetManager;
    public ComponentName providerName;

    public LauncherAppWidgetInfo(int i, ComponentName componentName) {
        super(3);
        this.appWidgetId = -1;
        this.appWidgetId = i;
        this.providerName = componentName;
    }

    @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
    public void onAddToDatabase(ContentValues contentValues) {
        super.onAddToDatabase(contentValues);
        contentValues.put("appWidgetId", Integer.valueOf(this.appWidgetId));
        contentValues.put("appWidgetProvider", this.providerName.flattenToString());
    }

    @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
    public LauncherAppWidgetInfo copy() {
        LauncherAppWidgetInfo launcherAppWidgetInfo = new LauncherAppWidgetInfo(this.appWidgetId, this.providerName.clone());
        launcherAppWidgetInfo.appWidgetId = this.appWidgetId;
        ItemInfo.copyInfo(this, launcherAppWidgetInfo);
        return launcherAppWidgetInfo;
    }
}
