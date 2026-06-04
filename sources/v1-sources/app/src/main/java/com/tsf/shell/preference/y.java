package com.tsf.shell.preference;

import android.preference.ListPreference;
import android.preference.PreferenceActivity;
import com.tsf.shell.R;
import com.tsf.shell.preference.widget.SeekBarPreference;
import com.tsf.shell.workspace3D.ShellWallpaperManager;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public final class y {
    private static PreferenceActivity a;
    private static SeekBarPreference b;
    private static ListPreference c;

    public static void a(PreferenceActivity preferenceActivity) {
        a = preferenceActivity;
        c = (ListPreference) preferenceActivity.findPreference("wallpaper_mode");
        String[] strArr = {com.censivn.C3DEngine.h.a.c(R.string.mn_wallpaper_scroll_mode), com.censivn.C3DEngine.h.a.c(R.string.mn_wallpaper_center_mode)};
        c.setEntries(strArr);
        c.setEntryValues(strArr);
        c.setDialogTitle(R.string.mn_wallpaper_mode);
        c.setValueIndex(com.tsf.shell.a.t.C());
        c.setTitle(R.string.mn_wallpaper_mode);
        c.setOnPreferenceChangeListener(new z());
        d();
        SeekBarPreference seekBarPreference = (SeekBarPreference) a.findPreference("wallpaperTransitionSpeed");
        b = seekBarPreference;
        seekBarPreference.a(ShellWallpaperManager.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d() {
        if (com.tsf.shell.a.t.C() == ShellWallpaperManager.a) {
            c.setSummary(R.string.mn_wallpaper_mode_scroll_summary);
        } else {
            c.setSummary(R.string.mn_wallpaper_mode_center_summary);
        }
    }

    public static void a() {
        a = null;
        b = null;
        c = null;
    }

    public static void b() {
        if (b != null) {
            ShellWallpaperManager.a(b.a());
            com.tsf.shell.a.t.b(ShellWallpaperManager.c());
        }
        if (c != null) {
            int i = c.getValue().equals(com.censivn.C3DEngine.h.a.c(R.string.mn_wallpaper_scroll_mode)) ? ShellWallpaperManager.a : ShellWallpaperManager.b;
            if (com.tsf.shell.a.t.C() != i) {
                com.tsf.shell.a.t.i(i);
                d();
                bf.q().c(i);
            }
        }
    }
}
