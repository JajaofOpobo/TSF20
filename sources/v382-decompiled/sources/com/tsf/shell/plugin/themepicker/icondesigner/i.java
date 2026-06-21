package com.tsf.shell.plugin.themepicker.icondesigner;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
class i extends SQLiteOpenHelper {
    i(Context context) {
        super(context, "theme_icon_design.db", (SQLiteDatabase.CursorFactory) null, 8);
        com.tsf.shell.plugin.themepicker.g.b("DatabaseHelper   DatabaseHelper");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        com.tsf.shell.plugin.themepicker.g.b("DatabaseHelper   onCreate");
        sQLiteDatabase.execSQL(ThemeIconDesignerProvider.a);
        sQLiteDatabase.execSQL(ThemeIconDesignerProvider.b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        com.tsf.shell.plugin.themepicker.g.b("DatabaseHelper   onUpgrade" + i + "    " + i2);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS theme_packages");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS theme_packages_ver_info");
        onCreate(sQLiteDatabase);
    }
}
