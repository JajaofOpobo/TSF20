package com.tsf.shell.workspace3D;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import com.tsf.shell.ce;

/* loaded from: classes.dex */
final class bb implements Runnable {
    final /* synthetic */ av a;
    private final /* synthetic */ String b;

    bb(av avVar, String str) {
        this.a = avVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = "saveItemsToDatabase child:" + this.b;
        ContentResolver contentResolver = com.censivn.C3DEngine.a.c().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("child", this.b);
        contentResolver.update(ContentUris.withAppendedId(ce.b, 1L), contentValues, null, null);
        contentValues.clear();
    }
}
