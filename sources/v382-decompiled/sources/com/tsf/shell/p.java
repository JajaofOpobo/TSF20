package com.tsf.shell;

import android.net.Uri;

/* loaded from: classes.dex */
public final class p {
    public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/action?notify=false");

    public static Uri a(long j) {
        return Uri.parse("content://" + ShellProvider.a + "/action/" + j + "?notify=false");
    }
}
