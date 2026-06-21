package com.tsf.shell;

import android.net.Uri;

/* loaded from: classes.dex */
public final class q implements s {
    public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/application?notify=false");

    public static Uri a(long j, boolean z) {
        return Uri.parse("content://" + ShellProvider.a + "/application/" + j + "?notify=" + z);
    }
}
