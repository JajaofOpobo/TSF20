package com.tsf.shell.a;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import com.tsf.shell.bz;

/* loaded from: classes.dex */
final class w implements Runnable {
    private final /* synthetic */ s a;

    w(s sVar) {
        this.a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 12;
        int i2 = this.a.a;
        ContentResolver contentResolver = com.censivn.C3DEngine.a.c().getContentResolver();
        ContentValues contentValues = new ContentValues();
        if (i2 <= 12) {
            i = i2 <= 0 ? 1 : i2;
        }
        contentValues.put("extrascreen", Integer.valueOf(i));
        contentValues.put("screenorder", this.a.b);
        contentResolver.update(ContentUris.withAppendedId(bz.b, 1L), contentValues, null, null);
        contentValues.clear();
    }
}
