package com.tsf.shell.plugin.fontspicker;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
/* loaded from: classes.dex */
public class FontsManagerProvider extends ContentProvider {

    /* renamed from: a */
    public static final String f12517a = "CREATE TABLE fonts(_id INTEGER PRIMARY KEY," + C3808b.f12544c + " TEXT," + C3808b.f12543b + " TEXT," + C3808b.f12542a + " TEXT); ";

    /* renamed from: b */
    private C3799a f12518b;

    /* renamed from: com.tsf.shell.plugin.fontspicker.FontsManagerProvider$a */
    /* loaded from: classes.dex */
    private static class C3799a extends SQLiteOpenHelper {
        C3799a(Context context) {
            super(context, "fonts.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(FontsManagerProvider.f12517a);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS fonts");
            onCreate(sQLiteDatabase);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f12518b = new C3799a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete = this.f12518b.getWritableDatabase().delete("fonts", str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return delete;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        long replace = this.f12518b.getWritableDatabase().replace("fonts", "_id", contentValues);
        if (replace > 0) {
            Uri withAppendedId = ContentUris.withAppendedId(C3808b.f12545d, replace);
            getContext().getContentResolver().notifyChange(withAppendedId, null);
            return withAppendedId;
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query = this.f12518b.getWritableDatabase().query("fonts", null, str, strArr2, null, null, str2);
        getContext().getContentResolver().notifyChange(uri, null);
        return query;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update = this.f12518b.getWritableDatabase().update("fonts", contentValues, str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return update;
    }
}
