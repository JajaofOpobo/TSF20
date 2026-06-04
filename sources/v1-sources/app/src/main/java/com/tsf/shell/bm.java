package com.tsf.shell;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;

/* loaded from: classes.dex */
public final class bm {
    public static byte[] a(ItemInfo itemInfo) {
        byte[] bArr;
        Cursor query = com.censivn.C3DEngine.a.c().getContentResolver().query(cb.a(itemInfo.id), null, null, null, null);
        try {
            query.moveToNext();
            bArr = query.getBlob(query.getColumnIndexOrThrow("data"));
            try {
                query.close();
            } catch (Exception e) {
                query.close();
                return bArr;
            }
        } catch (Exception e2) {
            bArr = null;
        }
        return bArr;
    }

    public static void a(LauncherItem3DInfo launcherItem3DInfo) {
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = com.censivn.C3DEngine.a.c().getContentResolver();
        launcherItem3DInfo.onUpdateData(contentValues);
        launcherItem3DInfo.onInsertToDatabase(contentValues);
        if (contentResolver.insert(cb.b, contentValues) != null) {
            launcherItem3DInfo.id = Integer.parseInt(r0.getPathSegments().get(1));
        }
    }

    public static void a(Context context, ContentValues contentValues, ItemInfo itemInfo) {
        context.getContentResolver().update(cb.a(itemInfo.id), contentValues, null, null);
    }

    public static void a(Context context, ItemInfo itemInfo) {
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = context.getContentResolver();
        itemInfo.onUpdateData(contentValues);
        contentResolver.update(cb.a(itemInfo.id), contentValues, null, null);
    }

    public static void b(Context context, ItemInfo itemInfo) {
        Handler handler;
        ContentResolver contentResolver = context.getContentResolver();
        Uri a = cb.a(itemInfo.id);
        itemInfo.onDelFromDatabase();
        handler = ShellModel.n;
        handler.post(new bn(contentResolver, a));
        itemInfo.unbind();
    }
}
