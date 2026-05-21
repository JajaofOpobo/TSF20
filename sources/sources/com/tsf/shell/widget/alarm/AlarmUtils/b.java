package com.tsf.shell.widget.alarm.AlarmUtils;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.tsf.shell.widget.alarm.AlarmUtils.Alarm;
import com.tsf.shell.widget.alarm.i;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    private static b a;
    private static final UriMatcher d = new UriMatcher(-1);
    private SQLiteOpenHelper b;
    private Context c;

    static {
        d.addURI("com.tsf.shell.widget.alarm.inshell.alarmclock", "alarm", 1);
        d.addURI("com.tsf.shell.widget.alarm.inshell.alarmclock", "alarm/#", 2);
    }

    private static class a extends SQLiteOpenHelper {
        public a(Context context) {
            super(context, "alarms.db", (SQLiteDatabase.CursorFactory) null, 5);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE alarms (_id INTEGER PRIMARY KEY,hour INTEGER, minutes INTEGER, daysofweek INTEGER, alarmtime INTEGER, enabled INTEGER, vibrate INTEGER, message TEXT, alert TEXT);");
            sQLiteDatabase.execSQL("INSERT INTO alarms (hour, minutes, daysofweek, alarmtime, enabled, vibrate, message, alert) VALUES (9, 0, 127, 0, 0, 1, '', '');");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            i.d("Upgrading alarms database from version " + i + " to " + i2 + ", which will destroy all old data");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS alarms");
            onCreate(sQLiteDatabase);
        }
    }

    public static b a(Context context) {
        if (a == null) {
            a = new b(context);
        }
        return a;
    }

    public b(Context context) {
        this.c = context;
        this.b = new a(this.c);
    }

    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        switch (d.match(uri)) {
            case 1:
                sQLiteQueryBuilder.setTables("alarms");
                break;
            case 2:
                sQLiteQueryBuilder.setTables("alarms");
                sQLiteQueryBuilder.appendWhere("_id=");
                sQLiteQueryBuilder.appendWhere(uri.getPathSegments().get(1));
                break;
            default:
                throw new IllegalArgumentException("Unknown URL " + uri);
        }
        Cursor cursorQuery = sQLiteQueryBuilder.query(this.b.getReadableDatabase(), strArr, str, strArr2, null, null, str2);
        if (cursorQuery == null) {
            i.d("Alarms.query: failed");
        } else {
            cursorQuery.setNotificationUri(this.c.getContentResolver(), uri);
        }
        return cursorQuery;
    }

    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int iMatch = d.match(uri);
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        switch (iMatch) {
            case 2:
                int iUpdate = writableDatabase.update("alarms", contentValues, "_id=" + Long.parseLong(uri.getPathSegments().get(1)), null);
                writableDatabase.close();
                return iUpdate;
            default:
                throw new UnsupportedOperationException("Cannot update URL: " + uri);
        }
    }

    public Uri a(Uri uri, ContentValues contentValues) {
        ContentValues contentValues2;
        if (d.match(uri) != 1) {
            throw new IllegalArgumentException("Cannot insert into URL: " + uri);
        }
        if (contentValues != null) {
            contentValues2 = new ContentValues(contentValues);
        } else {
            contentValues2 = new ContentValues();
        }
        if (!contentValues2.containsKey("hour")) {
            contentValues2.put("hour", (Integer) 0);
        }
        if (!contentValues2.containsKey("minutes")) {
            contentValues2.put("minutes", (Integer) 0);
        }
        if (!contentValues2.containsKey("daysofweek")) {
            contentValues2.put("daysofweek", (Integer) 0);
        }
        if (!contentValues2.containsKey("alarmtime")) {
            contentValues2.put("alarmtime", (Integer) 0);
        }
        if (!contentValues2.containsKey("enabled")) {
            contentValues2.put("enabled", (Integer) 0);
        }
        if (!contentValues2.containsKey("vibrate")) {
            contentValues2.put("vibrate", (Integer) 1);
        }
        if (!contentValues2.containsKey("message")) {
            contentValues2.put("message", "");
        }
        if (!contentValues2.containsKey("alert")) {
            contentValues2.put("alert", "");
        }
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        long jInsert = writableDatabase.insert("alarms", "message", contentValues2);
        if (jInsert < 0) {
            throw new SQLException("Failed to insert row into " + uri);
        }
        i.d("Added alarm rowId = " + jInsert);
        Uri uriWithAppendedId = ContentUris.withAppendedId(Alarm.a.a, jInsert);
        writableDatabase.close();
        return uriWithAppendedId;
    }
}
