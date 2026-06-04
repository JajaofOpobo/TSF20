package com.tsf.shell.preference;

import android.preference.Preference;
import com.tsf.shell.R;
import com.tsf.shell.workspace3D.ShellWallpaperManager;

/* loaded from: classes.dex */
final class z implements Preference.OnPreferenceChangeListener {
    z() {
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        if (com.tsf.shell.a.t.C() == (obj.equals(com.censivn.C3DEngine.h.a.c(R.string.mn_wallpaper_scroll_mode)) ? ShellWallpaperManager.a : ShellWallpaperManager.b)) {
            return true;
        }
        y.d();
        return true;
    }
}
