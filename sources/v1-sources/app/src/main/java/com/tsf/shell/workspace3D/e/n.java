package com.tsf.shell.workspace3D.e;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;

/* loaded from: classes.dex */
final class n implements Runnable {
    final /* synthetic */ m a;
    private final /* synthetic */ String b;

    n(m mVar, String str) {
        this.a = mVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = "dock aveItemsToDatabase child:" + this.b;
        ContentResolver contentResolver = com.censivn.C3DEngine.a.c().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("child", this.b);
        contentResolver.update(ContentUris.withAppendedId(com.tsf.shell.ca.b, 1L), contentValues, null, null);
        contentValues.clear();
    }
}
