package com.tsf.shell.manager.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tsf.shell.manager.c.a.a.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        Cursor cursorQuery = getReadableDatabase().query("contact", null, "contact_id=?", new String[]{aVar.b}, null, null, null);
        if (cursorQuery.moveToFirst()) {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("defaultNumber");
            int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("defaultEmail");
            cursorQuery.getColumnIndexOrThrow("config");
            long j = cursorQuery.getLong(columnIndexOrThrow);
            String string = cursorQuery.getString(columnIndexOrThrow2);
            String string2 = cursorQuery.getString(columnIndexOrThrow3);
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
        a.b bVarA = aVar.a();
        if (bVarA != null) {
            contentValues.put("defaultNumber", bVarA.c);
        }
        a.b bVarB = aVar.b();
        if (bVarB != null) {
            contentValues.put("defaultEmail", bVarB.c);
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        if (aVar.a != -1) {
            readableDatabase.update("contact", contentValues, "_id=?", new String[]{Long.toString(aVar.a)});
        } else {
            Cursor cursorQuery = readableDatabase.query("contact", null, "contact_id=?", new String[]{aVar.b}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                aVar.a = cursorQuery.getLong(0);
                readableDatabase.update("contact", contentValues, "_id=?", new String[]{Long.toString(aVar.a)});
            } else {
                aVar.a = readableDatabase.insert("contact", null, contentValues);
            }
            cursorQuery.close();
        }
        contentValues.clear();
    }
}
