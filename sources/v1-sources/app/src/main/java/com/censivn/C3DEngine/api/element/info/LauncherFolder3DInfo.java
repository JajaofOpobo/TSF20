package com.censivn.C3DEngine.api.element.info;

import android.content.ContentValues;
import com.censivn.C3DEngine.a;
import com.tsf.shell.R;
import com.tsf.shell.bo;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class LauncherFolder3DInfo extends LauncherItem3DInfo {
    public String child;
    public long folderId;
    private ArrayList itemsInfos;

    public LauncherFolder3DInfo(int i) {
        super(i);
        this.folderId = -1L;
        this.title = a.c().getString(R.string.widget_folder);
        this.itemType = 1;
        this.itemsInfos = new ArrayList();
    }

    @Override // com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo, com.censivn.C3DEngine.api.element.info.ItemInfo
    public void onUpdateData(ContentValues contentValues) {
        super.onUpdateData(contentValues);
    }

    @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
    public void onDelFromDatabase() {
        bo.b(a.c(), this);
    }

    @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
    public void onInsertToDatabase(ContentValues contentValues) {
        bo.a(this);
    }

    public void onUpdateFolderData(ContentValues contentValues) {
        contentValues.put("appWidgetId", Integer.valueOf(this.appWidgetId));
        contentValues.put("title", this.title);
        contentValues.put("child", this.child);
    }

    public boolean addItemInfo(LauncherShortcut3DInfo launcherShortcut3DInfo) {
        if (!this.child.contains(Integer.toString(launcherShortcut3DInfo.appWidgetId))) {
            return false;
        }
        this.itemsInfos.add(launcherShortcut3DInfo);
        return true;
    }

    public ArrayList getItemInfo() {
        return this.itemsInfos;
    }

    @Override // com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo, com.censivn.C3DEngine.api.element.info.ItemInfo
    public void unbind() {
        super.unbind();
        this.itemsInfos = null;
    }
}
