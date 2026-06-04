package com.tsf.shell;

import android.content.ContentResolver;
import android.net.Uri;

/* loaded from: classes.dex */
final class bp implements Runnable {
    private final /* synthetic */ ContentResolver a;
    private final /* synthetic */ Uri b;

    bp(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.delete(this.b, null, null);
    }
}
