package com.tsf.shell.manager.action;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import com.tsf.shell.R;
import com.tsf.shell.p;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class a {
    public static void a(int i, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
        contentValues.put("action", Integer.valueOf(i));
        contentValues.put("name", str);
        contentValues.put("intent", str2);
        Cursor query = contentResolver.query(p.a, new String[]{"action", "_id"}, "action=" + i, null, "_id desc");
        if (query.moveToFirst()) {
            contentResolver.update(p.a(query.getInt(query.getColumnIndex("_id"))), contentValues, null, null);
        } else {
            contentResolver.insert(p.a, contentValues);
        }
        query.close();
    }

    public static g a(int i) {
        g gVar;
        try {
            Cursor query = com.censivn.C3DEngine.a.d().getContentResolver().query(p.a, new String[]{"action", "name", "intent"}, "action=" + i, null, "_id desc");
            if (query.moveToFirst()) {
                String string = query.getString(query.getColumnIndex("name"));
                String string2 = query.getString(query.getColumnIndex("intent"));
                query.close();
                gVar = new g(i, string, string2);
            } else {
                query.close();
                gVar = new g(i, x.c(R.string.none), "");
            }
            return gVar;
        } catch (Exception e) {
            return new g(i, x.c(R.string.none), "");
        }
    }
}
