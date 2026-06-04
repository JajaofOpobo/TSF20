package com.tsf.shell;

import android.net.Uri;

/* loaded from: classes.dex */
public final class bx {
    public static final Uri a = Uri.parse("content://com.tsf.shell.settings/action?notify=true");
    public static final Uri b = Uri.parse("content://com.tsf.shell.settings/action?notify=false");

    public static Uri a(long j) {
        return Uri.parse("content://com.tsf.shell.settings/action/" + j + "?notify=false");
    }
}
