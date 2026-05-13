package com.ksmobile.p063a.p064a;

import com.ksmobile.launcher.p066a.p067a.C1296b;
import com.tsf.extend.base.InterfaceC1385d;
import com.tsf.extend.base.p080j.C1438q;
/* renamed from: com.ksmobile.a.a.a */
/* loaded from: classes.dex */
public class C1280a implements InterfaceC1385d {
    @Override // com.tsf.extend.base.InterfaceC1385d
    /* renamed from: a */
    public void mo8815a(int i) {
        C1438q.m8608a("sadqdqdqdqdq", "clickWallpaperTab:" + i);
        C1296b.m9073a(false, "tsflauncher_themecenter_wallpaper", "tab", i + "");
    }

    @Override // com.tsf.extend.base.InterfaceC1385d
    /* renamed from: b */
    public void mo8813b(int i) {
        C1438q.m8608a("sadqdqdqdqdq", "clickThemeTab childId:" + i);
        C1296b.m9073a(false, "tsflauncher_themecenter_theme", "tab", i + "");
    }

    @Override // com.tsf.extend.base.InterfaceC1385d
    /* renamed from: c */
    public void mo8811c(int i) {
        C1438q.m8608a("sadqdqdqdqdq", "clickKeyboardTab childId:" + i);
        C1296b.m9073a(false, "tsflauncher_themecenter_keyboard", "tab", i + "");
    }

    @Override // com.tsf.extend.base.InterfaceC1385d
    /* renamed from: a */
    public void mo8814a(String str) {
        C1438q.m8608a("sadqdqdqdqdq", "clickWallpaper wallpaperId:" + str);
        C1296b.m9073a(false, "tsflauncher_themecenter_wallpaperid", "wallpaperid", str);
    }

    @Override // com.tsf.extend.base.InterfaceC1385d
    /* renamed from: b */
    public void mo8812b(String str) {
        C1438q.m8608a("sadqdqdqdqdq", "clickTheme themeId:" + str);
        C1296b.m9073a(false, "tsflauncher_themecenter_themeid", "themeid", str);
    }

    @Override // com.tsf.extend.base.InterfaceC1385d
    /* renamed from: c */
    public void mo8810c(String str) {
        C1438q.m8608a("sadqdqdqdqdq", "clickKeyboard keyboardId:" + str);
        C1296b.m9073a(false, "tsflauncher_themecenter_keyboardid", "keyboardid", str);
    }
}
