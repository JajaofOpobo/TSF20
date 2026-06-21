package com.tsf.shell.widget.alarm.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tsf.shell.widget.alarm.u;

/* loaded from: classes.dex */
class c extends SQLiteOpenHelper {
    c(Context context) {
        super(context, "alarm_setting.db", (SQLiteDatabase.CursorFactory) null, 9);
        u.c("DatabaseHelper   DatabaseHelper");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        u.c("DatabaseHelper   onCreate");
        sQLiteDatabase.execSQL(b.a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        u.c("DatabaseHelper   onUpgrade" + i + "    " + i2);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS settings");
        onCreate(sQLiteDatabase);
    }
}
