package com.censivn.C3DEngine.api.element.info;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.tsf.C1306b;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class LauncherFolder3DInfo extends ItemInfo {
    public ArrayList<ItemInfo> itemsInfos;

    public LauncherFolder3DInfo() {
        super(1);
        this.itemsInfos = new ArrayList<>();
        this.title = C0853a.m10856d().getString(C1306b.C1315i.widget_folder);
    }

    public void add(LauncherShortcut3DInfo launcherShortcut3DInfo) {
        this.itemsInfos.add(launcherShortcut3DInfo);
    }

    public ArrayList<ItemInfo> getItemInfo() {
        return this.itemsInfos;
    }

    @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
    public LauncherFolder3DInfo copy() {
        LauncherFolder3DInfo launcherFolder3DInfo = new LauncherFolder3DInfo();
        launcherFolder3DInfo.itemsInfos = (ArrayList) this.itemsInfos.clone();
        ItemInfo.copyInfo(this, launcherFolder3DInfo);
        return launcherFolder3DInfo;
    }

    @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
    public void unbind() {
        super.unbind();
        if (this.itemsInfos != null) {
            this.itemsInfos.clear();
            this.itemsInfos = null;
        }
    }
}
