package com.censivn.C3DEngine.api.element.info;
/* loaded from: classes.dex */
public class LauncherWidget3DInfo extends ItemInfo {
    public LauncherWidget3DInfo() {
        super(5);
    }

    @Override // com.censivn.C3DEngine.api.element.info.ItemInfo
    public LauncherWidget3DInfo copy() {
        LauncherWidget3DInfo launcherWidget3DInfo = new LauncherWidget3DInfo();
        ItemInfo.copyInfo(this, launcherWidget3DInfo);
        return launcherWidget3DInfo;
    }
}
