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
import com.tsf.shell.widget.alarm.C4305i;
/* renamed from: com.tsf.shell.widget.alarm.AlarmUtils.b */
/* loaded from: classes.dex */
public class C4240b {

    /* renamed from: a */
    private static C4240b f13703a;

    /* renamed from: d */
    private static final UriMatcher f13704d = new UriMatcher(-1);

    /* renamed from: b */
    private SQLiteOpenHelper f13705b;

    /* renamed from: c */
    private Context f13706c;

    static {
        f13704d.addURI("com.tsf.shell.widget.alarm.inshell.alarmclock", "alarm", 1);
        f13704d.addURI("com.tsf.shell.widget.alarm.inshell.alarmclock", "alarm/#", 2);
    }

    /* renamed from: com.tsf.shell.widget.alarm.AlarmUtils.b$a */
    /* loaded from: classes.dex */
    private static class C4241a extends SQLiteOpenHelper {
        public C4241a(Context context) {
            super(context, "alarms.db", (SQLiteDatabase.CursorFactory) null, 5);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE alarms (_id INTEGER PRIMARY KEY,hour INTEGER, minutes INTEGER, daysofweek INTEGER, alarmtime INTEGER, enabled INTEGER, vibrate INTEGER, message TEXT, alert TEXT);");
            sQLiteDatabase.execSQL("INSERT INTO alarms (hour, minutes, daysofweek, alarmtime, enabled, vibrate, message, alert) VALUES (9, 0, 127, 0, 0, 1, '', '');");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C4305i.m258d("Upgrading alarms database from version " + i + " to " + i2 + ", which will destroy all old data");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS alarms");
            onCreate(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    public static C4240b m446a(Context context) {
        if (f13703a == null) {
            f13703a = new C4240b(context);
        }
        return f13703a;
    }

    public C4240b(Context context) {
        this.f13706c = context;
        this.f13705b = new C4241a(this.f13706c);
    }

    /* renamed from: a */
    public Cursor m443a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        switch (f13704d.match(uri)) {
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
        Cursor query = sQLiteQueryBuilder.query(this.f13705b.getReadableDatabase(), strArr, str, strArr2, null, null, str2);
        if (query == null) {
            C4305i.m258d("Alarms.query: failed");
        } else {
            query.setNotificationUri(this.f13706c.getContentResolver(), uri);
        }
        return query;
    }

    /* renamed from: a */
    public int m444a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int match = f13704d.match(uri);
        SQLiteDatabase writableDatabase = this.f13705b.getWritableDatabase();
        switch (match) {
            case 2:
                int update = writableDatabase.update("alarms", contentValues, "_id=" + Long.parseLong(uri.getPathSegments().get(1)), null);
                writableDatabase.close();
                return update;
            default:
                throw new UnsupportedOperationException("Cannot update URL: " + uri);
        }
    }

    /* renamed from: a */
    public Uri m445a(Uri uri, ContentValues contentValues) {
        ContentValues contentValues2;
        if (f13704d.match(uri) != 1) {
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
        SQLiteDatabase writableDatabase = this.f13705b.getWritableDatabase();
        long insert = writableDatabase.insert("alarms", "message", contentValues2);
        if (insert < 0) {
            throw new SQLException("Failed to insert row into " + uri);
        }
        C4305i.m258d("Added alarm rowId = " + insert);
        Uri withAppendedId = ContentUris.withAppendedId(Alarm.C4226a.f13668a, insert);
        writableDatabase.close();
        return withAppendedId;
    }
}
