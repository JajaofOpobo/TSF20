package com.tsf.shell.widget.alarm.AlarmUtils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tsf.shell.widget.alarm.u;

/* loaded from: classes.dex */
class h extends SQLiteOpenHelper {
    public h(Context context) {
        super(context, "alarms.db", (SQLiteDatabase.CursorFactory) null, 5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE alarms (_id INTEGER PRIMARY KEY,hour INTEGER, minutes INTEGER, daysofweek INTEGER, alarmtime INTEGER, enabled INTEGER, vibrate INTEGER, message TEXT, alert TEXT);");
        sQLiteDatabase.execSQL(String.valueOf("INSERT INTO alarms (hour, minutes, daysofweek, alarmtime, enabled, vibrate, message, alert) VALUES ") + "(9, 0, 127, 0, 0, 1, '', '');");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        u.d("Upgrading alarms database from version " + i + " to " + i2 + ", which will destroy all old data");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS alarms");
        onCreate(sQLiteDatabase);
    }
}
