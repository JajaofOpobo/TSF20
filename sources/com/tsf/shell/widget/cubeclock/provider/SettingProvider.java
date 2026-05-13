package com.tsf.shell.widget.cubeclock.provider;

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
import com.tsf.shell.widget.cubeclock.C4390j;
import java.util.HashMap;
/* loaded from: classes.dex */
public class SettingProvider extends ContentProvider {

    /* renamed from: a */
    private static HashMap<String, String> f14276a;

    /* renamed from: b */
    private static final UriMatcher f14277b = new UriMatcher(-1);

    /* renamed from: c */
    private C4398a f14278c;

    static {
        f14277b.addURI("com.tsf.shell.widget.cubeclock.provider", "settings", 1);
        f14277b.addURI("com.tsf.shell.widget.cubeclock.provider", "settings/#", 2);
        f14276a = new HashMap<>();
        f14276a.put("_id", "_id");
        f14276a.put("widgetid", "widgetid");
        f14276a.put("color", "color");
        f14276a.put("created", "created");
        f14276a.put("modified", "modified");
        f14276a.put("mode", "mode");
    }

    /* renamed from: com.tsf.shell.widget.cubeclock.provider.SettingProvider$a */
    /* loaded from: classes.dex */
    private static class C4398a extends SQLiteOpenHelper {
        C4398a(Context context) {
            super(context, "setting.db", (SQLiteDatabase.CursorFactory) null, 8);
            C4390j.m53a("DatabaseHelper   DatabaseHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C4390j.m53a("DatabaseHelper   onCreate");
            sQLiteDatabase.execSQL("CREATE TABLE settings(_id INTEGER PRIMARY KEY,widgetid INTEGER UNIQUE NOT NULL,color INTEGER,created INTEGER,modified INTEGER,mode INTEGER); ");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C4390j.m53a("DatabaseHelper   onUpgrade" + i + "    " + i2);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS settings");
            onCreate(sQLiteDatabase);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f14278c = new C4398a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete;
        SQLiteDatabase writableDatabase = this.f14278c.getWritableDatabase();
        switch (f14277b.match(uri)) {
            case 1:
                delete = writableDatabase.delete("settings", str, strArr);
                break;
            case 2:
                delete = writableDatabase.delete("settings", "_id=" + uri.getPathSegments().get(1) + (!TextUtils.isEmpty(str) ? " AND (" + str + ')' : ""), strArr);
                break;
            default:
                throw new IllegalArgumentException("Unnown URI" + uri);
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return delete;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        ContentValues contentValues2;
        if (f14277b.match(uri) != 1) {
            throw new IllegalArgumentException("Unknown URI " + uri);
        }
        if (contentValues != null) {
            contentValues2 = new ContentValues(contentValues);
        } else {
            contentValues2 = new ContentValues();
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        if (!contentValues2.containsKey("created")) {
            contentValues2.put("created", valueOf);
        }
        if (!contentValues2.containsKey("modified")) {
            contentValues2.put("modified", valueOf);
        }
        long replace = this.f14278c.getWritableDatabase().replace("settings", "widgetid", contentValues2);
        if (replace > 0) {
            Uri withAppendedId = ContentUris.withAppendedId(C4400b.f14282a, replace);
            getContext().getContentResolver().notifyChange(withAppendedId, null);
            return withAppendedId;
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        switch (f14277b.match(uri)) {
            case 1:
                sQLiteQueryBuilder.setTables("settings");
                sQLiteQueryBuilder.setProjectionMap(f14276a);
                break;
            case 2:
                sQLiteQueryBuilder.setTables("settings");
                sQLiteQueryBuilder.setProjectionMap(f14276a);
                sQLiteQueryBuilder.appendWhere("_id=" + uri.getPathSegments().get(1));
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
        Cursor query = sQLiteQueryBuilder.query(this.f14278c.getReadableDatabase(), strArr, str, strArr2, null, null, TextUtils.isEmpty(str2) ? "modified DESC" : str2);
        query.setNotificationUri(getContext().getContentResolver(), uri);
        return query;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = this.f14278c.getWritableDatabase();
        switch (f14277b.match(uri)) {
            case 1:
                return writableDatabase.update("settings", contentValues, str, strArr);
            case 2:
                return writableDatabase.update("settings", contentValues, "_id=" + uri.getPathSegments().get(1) + (!TextUtils.isEmpty(str) ? " AND (" + str + ')' : ""), strArr);
            default:
                throw new IllegalArgumentException("Unknow URI " + uri);
        }
    }
}
