package com.tsf.shell.plugin.classification;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* renamed from: com.tsf.shell.plugin.classification.c */
/* loaded from: classes.dex */
public class C3776c extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final String f12384a = "CREATE TABLE classification(_id INTEGER PRIMARY KEY," + C3775b.f12381a + " INTEGER," + C3775b.f12382b + " TEXT," + C3775b.f12383c + " TEXT); ";

    /* renamed from: b */
    public static final String f12385b = "CREATE TABLE application(_id INTEGER PRIMARY KEY," + C3774a.f12379a + " INTEGER," + C3774a.f12380b + " TEXT); ";

    /* renamed from: c */
    private static C3776c f12386c;

    /* renamed from: a */
    public static C3776c m1527a(Context context) {
        if (f12386c == null) {
            f12386c = new C3776c(context);
        }
        return f12386c;
    }

    public C3776c(Context context) {
        super(context, "classification.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f12384a);
        sQLiteDatabase.execSQL(f12385b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS classification");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS application");
        onCreate(sQLiteDatabase);
    }
}
