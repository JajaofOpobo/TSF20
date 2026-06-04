package com.tsf.shell;

import android.net.Uri;

/* loaded from: classes.dex */
public final class cd {
    public static final Uri a = Uri.parse("content://com.tsf.shell.settings/optionmenu?notify=true");
    public static final Uri b = Uri.parse("content://com.tsf.shell.settings/optionmenu?notify=false");

    public static Uri a(long j) {
        return Uri.parse("content://com.tsf.shell.settings/optionmenu/" + j + "?notify=false");
    }
}
