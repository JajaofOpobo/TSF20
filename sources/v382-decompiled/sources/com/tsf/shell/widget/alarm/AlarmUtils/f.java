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
import com.tsf.shell.widget.alarm.u;

/* loaded from: classes.dex */
public class f {
    private static f a;
    private static final UriMatcher d = new UriMatcher(-1);
    private SQLiteOpenHelper b;
    private Context c;

    static {
        d.addURI("com.tsf.shell.widget.alarm.inshell.alarmclock", "alarm", 1);
        d.addURI("com.tsf.shell.widget.alarm.inshell.alarmclock", "alarm/#", 2);
    }

    public static f a(Context context) {
        if (a == null) {
            a = new f(context);
        }
        return a;
    }

    public f(Context context) {
        this.c = context;
        this.b = new g(this.c);
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
        Cursor query = sQLiteQueryBuilder.query(this.b.getReadableDatabase(), strArr, str, strArr2, null, null, str2);
        if (query == null) {
            u.d("Alarms.query: failed");
        } else {
            query.setNotificationUri(this.c.getContentResolver(), uri);
        }
        return query;
    }

    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int match = d.match(uri);
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        switch (match) {
            case 2:
                int update = writableDatabase.update("alarms", contentValues, "_id=" + Long.parseLong(uri.getPathSegments().get(1)), null);
                writableDatabase.close();
                return update;
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
        long insert = writableDatabase.insert("alarms", "message", contentValues2);
        if (insert < 0) {
            throw new SQLException("Failed to insert row into " + uri);
        }
        u.d("Added alarm rowId = " + insert);
        Uri withAppendedId = ContentUris.withAppendedId(a.a, insert);
        writableDatabase.close();
        return withAppendedId;
    }
}
