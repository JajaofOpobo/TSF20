package com.tsf.shell.manager.p169c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tsf.shell.manager.p169c.p170a.p171a.C3459a;
/* renamed from: com.tsf.shell.manager.c.a */
/* loaded from: classes.dex */
public class C3458a extends SQLiteOpenHelper {
    public C3458a(Context context) {
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

    /* renamed from: a */
    public void m2330a(C3459a c3459a) {
        Cursor query = getReadableDatabase().query("contact", null, "contact_id=?", new String[]{c3459a.f11433b}, null, null, null);
        if (query.moveToFirst()) {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("defaultNumber");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("defaultEmail");
            query.getColumnIndexOrThrow("config");
            long j = query.getLong(columnIndexOrThrow);
            String string = query.getString(columnIndexOrThrow2);
            String string2 = query.getString(columnIndexOrThrow3);
            c3459a.f11432a = j;
            c3459a.m2321a(string, string2);
            return;
        }
        c3459a.m2321a("", "");
    }

    /* renamed from: b */
    public void m2329b(C3459a c3459a) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact_id", c3459a.f11433b);
        contentValues.put("name", c3459a.f11434c);
        C3459a.C3462b m2328a = c3459a.m2328a();
        if (m2328a != null) {
            contentValues.put("defaultNumber", m2328a.f11447c);
        }
        C3459a.C3462b m2320b = c3459a.m2320b();
        if (m2320b != null) {
            contentValues.put("defaultEmail", m2320b.f11447c);
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        if (c3459a.f11432a != -1) {
            readableDatabase.update("contact", contentValues, "_id=?", new String[]{Long.toString(c3459a.f11432a)});
        } else {
            Cursor query = readableDatabase.query("contact", null, "contact_id=?", new String[]{c3459a.f11433b}, null, null, null);
            if (query.moveToFirst()) {
                c3459a.f11432a = query.getLong(0);
                readableDatabase.update("contact", contentValues, "_id=?", new String[]{Long.toString(c3459a.f11432a)});
            } else {
                c3459a.f11432a = readableDatabase.insert("contact", null, contentValues);
            }
            query.close();
        }
        contentValues.clear();
    }
}
