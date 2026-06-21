package com.tsf.shell.manager.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
public class a extends SQLiteOpenHelper {
    public a(Context context) {
        super(context, "contact.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS contact");
        sQLiteDatabase.execSQL("CREATE TABLE contact (_id INTEGER PRIMARY KEY,contact_id INTEGER,name TEXT,defaultNumber TEXT,defaultEmail TEXT,config TEXT);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void a(com.tsf.shell.manager.c.a.a.b bVar) {
        Cursor query = getReadableDatabase().query("contact", null, "contact_id=?", new String[]{bVar.b}, null, null, null);
        if (query.moveToFirst()) {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("defaultNumber");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("defaultEmail");
            query.getColumnIndexOrThrow("config");
            long j = query.getLong(columnIndexOrThrow);
            String string = query.getString(columnIndexOrThrow2);
            String string2 = query.getString(columnIndexOrThrow3);
            bVar.a = j;
            bVar.a(string, string2);
            return;
        }
        bVar.a("", "");
    }

    public void b(com.tsf.shell.manager.c.a.a.b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact_id", bVar.b);
        contentValues.put("name", bVar.c);
        com.tsf.shell.manager.c.a.a.d a = bVar.a();
        if (a != null) {
            contentValues.put("defaultNumber", a.c);
        }
        com.tsf.shell.manager.c.a.a.d b = bVar.b();
        if (b != null) {
            contentValues.put("defaultEmail", b.c);
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        if (bVar.a != -1) {
            readableDatabase.update("contact", contentValues, "_id=?", new String[]{Long.toString(bVar.a)});
        } else {
            Cursor query = readableDatabase.query("contact", null, "contact_id=?", new String[]{bVar.b}, null, null, null);
            if (query.moveToFirst()) {
                bVar.a = query.getLong(0);
                readableDatabase.update("contact", contentValues, "_id=?", new String[]{Long.toString(bVar.a)});
            } else {
                bVar.a = readableDatabase.insert("contact", null, contentValues);
            }
            query.close();
        }
        contentValues.clear();
    }
}
