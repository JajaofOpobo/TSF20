package com.tsf.shell;

import android.net.Uri;

/* loaded from: classes.dex */
public final class u implements s {
    public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/favorites?notify=false");

    public static Uri a(long j, boolean z) {
        return Uri.parse("content://" + ShellProvider.a + "/favorites/" + j + "?notify=" + z);
    }
}
