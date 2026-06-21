package com.tsf.shell.plugin.classification;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ClassificationDatabase extends SQLiteOpenHelper {
    public static final String a = "CREATE TABLE classification(_id INTEGER PRIMARY KEY," + ClassificationInfoColumns.a + " INTEGER," + ClassificationInfoColumns.b + " TEXT," + ClassificationInfoColumns.c + " TEXT); ";
    public static final String b = "CREATE TABLE application(_id INTEGER PRIMARY KEY," + ClassificationColumns.a + " INTEGER," + ClassificationColumns.b + " TEXT); ";
    private static c c;

    public static c a(Context context) {
        if (c == null) {
            c = new ClassificationDatabase(context);
        }
        return c;
    }

    public ClassificationDatabase(Context context) {
        super(context, "classification.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(a);
        sQLiteDatabase.execSQL(b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS classification");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS application");
        onCreate(sQLiteDatabase);
    }
}
