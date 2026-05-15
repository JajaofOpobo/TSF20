package com.tsf.shell.manager.action;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import com.tsf.b;
import com.tsf.shell.g;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    public static void a(int i, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
        contentValues.put("action", Integer.valueOf(i));
        contentValues.put("name", str);
        contentValues.put("intent", str2);
        Cursor cursorQuery = contentResolver.query(g.a.a, new String[]{"action", "_id"}, "action=" + i, null, "_id desc");
        if (cursorQuery.moveToFirst()) {
            contentResolver.update(g.a.a(cursorQuery.getInt(cursorQuery.getColumnIndex("_id"))), contentValues, null, null);
        } else {
            contentResolver.insert(g.a.a, contentValues);
        }
        cursorQuery.close();
    }

    public static e a(int i) {
        e eVar;
        try {
            Cursor cursorQuery = com.censivn.C3DEngine.a.d().getContentResolver().query(g.a.a, new String[]{"action", "name", "intent"}, "action=" + i, null, "_id desc");
            if (cursorQuery.moveToFirst()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("name"));
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("intent"));
                cursorQuery.close();
                eVar = new e(i, string, string2);
            } else {
                cursorQuery.close();
                eVar = new e(i, x.c(b.i.none), "");
            }
            return eVar;
        } catch (Exception e) {
            return new e(i, x.c(b.i.none), "");
        }
    }
}
