package com.tsf.shell.manager.action;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import com.tsf.b;
import com.tsf.shell.g;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class a {
    public static void a(int i, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
        contentValues.put("action", Integer.valueOf(i));
        contentValues.put("name", str);
        contentValues.put("intent", str2);
        Cursor query = contentResolver.query(g.a.a, new String[]{"action", "_id"}, "action=" + i, null, "_id desc");
        if (query.moveToFirst()) {
            contentResolver.update(g.a.a(query.getInt(query.getColumnIndex("_id"))), contentValues, null, null);
        } else {
            contentResolver.insert(g.a.a, contentValues);
        }
        query.close();
    }

    public static e a(int i) {
        e eVar;
        try {
            Cursor query = com.censivn.C3DEngine.a.d().getContentResolver().query(g.a.a, new String[]{"action", "name", "intent"}, "action=" + i, null, "_id desc");
            if (query.moveToFirst()) {
                String string = query.getString(query.getColumnIndex("name"));
                String string2 = query.getString(query.getColumnIndex("intent"));
                query.close();
                eVar = new e(i, string, string2);
            } else {
                query.close();
                eVar = new e(i, x.c(b.i.none), "");
            }
            return eVar;
        } catch (Exception e) {
            return new e(i, x.c(b.i.none), "");
        }
    }
}
