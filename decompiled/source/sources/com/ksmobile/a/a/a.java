package com.ksmobile.a.a;

import com.ksmobile.launcher.a.a.b;
import com.tsf.extend.base.d;
import com.tsf.extend.base.j.q;
/* loaded from: classes.dex */
public class a implements d {
    @Override // com.tsf.extend.base.d
    public void a(int i) {
        q.a("sadqdqdqdqdq", "clickWallpaperTab:" + i);
        b.a(false, "tsflauncher_themecenter_wallpaper", "tab", i + "");
    }

    @Override // com.tsf.extend.base.d
    public void b(int i) {
        q.a("sadqdqdqdqdq", "clickThemeTab childId:" + i);
        b.a(false, "tsflauncher_themecenter_theme", "tab", i + "");
    }

    @Override // com.tsf.extend.base.d
    public void c(int i) {
        q.a("sadqdqdqdqdq", "clickKeyboardTab childId:" + i);
        b.a(false, "tsflauncher_themecenter_keyboard", "tab", i + "");
    }

    @Override // com.tsf.extend.base.d
    public void a(String str) {
        q.a("sadqdqdqdqdq", "clickWallpaper wallpaperId:" + str);
        b.a(false, "tsflauncher_themecenter_wallpaperid", "wallpaperid", str);
    }

    @Override // com.tsf.extend.base.d
    public void b(String str) {
        q.a("sadqdqdqdqdq", "clickTheme themeId:" + str);
        b.a(false, "tsflauncher_themecenter_themeid", "themeid", str);
    }

    @Override // com.tsf.extend.base.d
    public void c(String str) {
        q.a("sadqdqdqdqdq", "clickKeyboard keyboardId:" + str);
        b.a(false, "tsflauncher_themecenter_keyboardid", "keyboardid", str);
    }
}
