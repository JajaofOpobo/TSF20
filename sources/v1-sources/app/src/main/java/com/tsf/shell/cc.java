package com.tsf.shell;

import android.net.Uri;
import android.provider.BaseColumns;

/* loaded from: classes.dex */
public final class cc implements BaseColumns {
    public static final Uri a = Uri.parse("content://com.tsf.shell.settings/folders?notify=true");
    public static final Uri b = Uri.parse("content://com.tsf.shell.settings/folders?notify=false");

    public static Uri a(long j) {
        return Uri.parse("content://com.tsf.shell.settings/folders/" + j + "?notify=false");
    }
}
