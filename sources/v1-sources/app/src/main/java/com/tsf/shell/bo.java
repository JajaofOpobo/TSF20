package com.tsf.shell;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;

/* loaded from: classes.dex */
public final class bo {
    public static void a(LauncherFolder3DInfo launcherFolder3DInfo) {
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = com.censivn.C3DEngine.a.c().getContentResolver();
        launcherFolder3DInfo.onUpdateFolderData(contentValues);
        if (contentResolver.insert(cc.b, contentValues) != null) {
            launcherFolder3DInfo.folderId = Integer.parseInt(r0.getPathSegments().get(1));
        }
    }

    public static void a(Context context, LauncherFolder3DInfo launcherFolder3DInfo) {
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = context.getContentResolver();
        launcherFolder3DInfo.onUpdateFolderData(contentValues);
        Uri a = cc.a(launcherFolder3DInfo.folderId);
        if (contentResolver.update(a, contentValues, null, null) == 0) {
            Cursor query = contentResolver.query(a, null, null, null, null);
            if (query.getCount() == 0) {
                a(launcherFolder3DInfo);
            }
            query.close();
        }
    }

    public static void b(Context context, LauncherFolder3DInfo launcherFolder3DInfo) {
        Handler handler;
        ContentResolver contentResolver = context.getContentResolver();
        Uri a = cc.a(launcherFolder3DInfo.folderId);
        handler = ShellModel.n;
        handler.post(new bp(contentResolver, a));
    }
}
