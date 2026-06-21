package com.tsf.shell.plugin.fontspicker;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;

/* loaded from: classes.dex */
public class FontsManagerProvider extends ContentProvider {
    public static final String a = "CREATE TABLE fonts(_id INTEGER PRIMARY KEY," + c.c + " TEXT," + c.b + " TEXT," + c.a + " TEXT); ";
    private f b;

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.b = new f(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete = this.b.getWritableDatabase().delete("fonts", str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return delete;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        long replace = this.b.getWritableDatabase().replace("fonts", "_id", contentValues);
        if (replace > 0) {
            Uri withAppendedId = ContentUris.withAppendedId(c.d, replace);
            getContext().getContentResolver().notifyChange(withAppendedId, null);
            return withAppendedId;
        }
        throw new SQLException("Failed to insert row into" + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query = this.b.getWritableDatabase().query("fonts", null, str, strArr2, null, null, str2);
        getContext().getContentResolver().notifyChange(uri, null);
        return query;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update = this.b.getWritableDatabase().update("fonts", contentValues, str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return update;
    }
}
