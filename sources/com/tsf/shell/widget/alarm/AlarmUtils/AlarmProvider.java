package com.tsf.shell.widget.alarm.AlarmUtils;

import android.content.ContentProvider;
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
import android.text.TextUtils;
import com.tsf.shell.widget.alarm.AlarmUtils.Alarm;
import com.tsf.shell.widget.alarm.C4305i;
/* loaded from: classes.dex */
public class AlarmProvider extends ContentProvider {

    /* renamed from: b */
    private static final UriMatcher f13700b = new UriMatcher(-1);

    /* renamed from: a */
    private SQLiteOpenHelper f13701a;

    static {
        f13700b.addURI("com.tsf.shell.widget.alarm.inshell.alarmclock", "alarm", 1);
        f13700b.addURI("com.tsf.shell.widget.alarm.inshell.alarmclock", "alarm/#", 2);
    }

    /* renamed from: com.tsf.shell.widget.alarm.AlarmUtils.AlarmProvider$a */
    /* loaded from: classes.dex */
    private static class C4238a extends SQLiteOpenHelper {
        public C4238a(Context context) {
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

    public AlarmProvider() {
        C4305i.m259c("  ============AlarmProvider ================init ");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f13701a = new C4238a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        switch (f13700b.match(uri)) {
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
        Cursor query = sQLiteQueryBuilder.query(this.f13701a.getReadableDatabase(), strArr, str, strArr2, null, null, str2);
        if (query == null) {
            C4305i.m258d("Alarms.query: failed");
        } else {
            query.setNotificationUri(getContext().getContentResolver(), uri);
        }
        return query;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        switch (f13700b.match(uri)) {
            case 1:
                return "vnd.android.cursor.dir/alarms";
            case 2:
                return "vnd.android.cursor.item/alarms";
            default:
                throw new IllegalArgumentException("Unknown URL");
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int match = f13700b.match(uri);
        SQLiteDatabase writableDatabase = this.f13701a.getWritableDatabase();
        switch (match) {
            case 2:
                long parseLong = Long.parseLong(uri.getPathSegments().get(1));
                int update = writableDatabase.update("alarms", contentValues, "_id=" + parseLong, null);
                C4305i.m258d("*** notifyChange() rowId: " + parseLong + " url " + uri);
                getContext().getContentResolver().notifyChange(uri, null);
                return update;
            default:
                throw new UnsupportedOperationException("Cannot update URL: " + uri);
        }
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        ContentValues contentValues2;
        if (f13700b.match(uri) != 1) {
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
        long insert = this.f13701a.getWritableDatabase().insert("alarms", "message", contentValues2);
        if (insert < 0) {
            throw new SQLException("Failed to insert row into " + uri);
        }
        C4305i.m258d("Added alarm rowId = " + insert);
        Uri withAppendedId = ContentUris.withAppendedId(Alarm.C4226a.f13668a, insert);
        getContext().getContentResolver().notifyChange(withAppendedId, null);
        return withAppendedId;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        String str2;
        int delete;
        SQLiteDatabase writableDatabase = this.f13701a.getWritableDatabase();
        switch (f13700b.match(uri)) {
            case 1:
                delete = writableDatabase.delete("alarms", str, strArr);
                break;
            case 2:
                String str3 = uri.getPathSegments().get(1);
                Long.parseLong(str3);
                if (TextUtils.isEmpty(str)) {
                    str2 = "_id=" + str3;
                } else {
                    str2 = "_id=" + str3 + " AND (" + str + ")";
                }
                delete = writableDatabase.delete("alarms", str2, strArr);
                break;
            default:
                throw new IllegalArgumentException("Cannot delete from URL: " + uri);
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return delete;
    }
}
