package com.tsf.shell.widget.cubeclock.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tsf.shell.widget.cubeclock.j;

/* loaded from: classes.dex */
class c extends SQLiteOpenHelper {
    c(Context context) {
        super(context, "setting.db", (SQLiteDatabase.CursorFactory) null, 8);
        j.a("DatabaseHelper   DatabaseHelper");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        j.a("DatabaseHelper   onCreate");
        sQLiteDatabase.execSQL("CREATE TABLE settings(_id INTEGER PRIMARY KEY,widgetid INTEGER UNIQUE NOT NULL,color INTEGER,created INTEGER,modified INTEGER,mode INTEGER); ");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        j.a("DatabaseHelper   onUpgrade" + i + "    " + i2);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS settings");
        onCreate(sQLiteDatabase);
    }
}
