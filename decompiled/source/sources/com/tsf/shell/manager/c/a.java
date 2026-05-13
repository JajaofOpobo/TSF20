package com.tsf.shell.manager.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tsf.shell.manager.c.a.a.a;
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

    public void a(com.tsf.shell.manager.c.a.a.a aVar) {
        Cursor query = getReadableDatabase().query("contact", null, "contact_id=?", new String[]{aVar.b}, null, null, null);
        if (query.moveToFirst()) {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("defaultNumber");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("defaultEmail");
            query.getColumnIndexOrThrow("config");
            long j = query.getLong(columnIndexOrThrow);
            String string = query.getString(columnIndexOrThrow2);
            String string2 = query.getString(columnIndexOrThrow3);
            aVar.a = j;
            aVar.a(string, string2);
            return;
        }
        aVar.a("", "");
    }

    public void b(com.tsf.shell.manager.c.a.a.a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact_id", aVar.b);
        contentValues.put("name", aVar.c);
        a.b a = aVar.a();
        if (a != null) {
            contentValues.put("defaultNumber", a.c);
        }
        a.b b = aVar.b();
        if (b != null) {
            contentValues.put("defaultEmail", b.c);
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        if (aVar.a != -1) {
            readableDatabase.update("contact", contentValues, "_id=?", new String[]{Long.toString(aVar.a)});
        } else {
            Cursor query = readableDatabase.query("contact", null, "contact_id=?", new String[]{aVar.b}, null, null, null);
            if (query.moveToFirst()) {
                aVar.a = query.getLong(0);
                readableDatabase.update("contact", contentValues, "_id=?", new String[]{Long.toString(aVar.a)});
            } else {
                aVar.a = readableDatabase.insert("contact", null, contentValues);
            }
            query.close();
        }
        contentValues.clear();
    }
}
