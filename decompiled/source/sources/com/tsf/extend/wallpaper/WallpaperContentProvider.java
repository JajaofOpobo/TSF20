package com.tsf.extend.wallpaper;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
/* loaded from: classes.dex */
public class WallpaperContentProvider extends ContentProvider {
    private static final UriMatcher b = new UriMatcher(-1);
    private y a;

    static {
        b.addURI("com.tsf.extend.wallpaper", "recent_local", 1);
        b.addURI("com.tsf.extend.wallpaper", "recent_favorite", 2);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.a = new y(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        switch (b.match(uri)) {
            case 1:
                return a("local_time > 0", strArr, str, strArr2, str2);
            case 2:
                return a("fav_time > 0", strArr, str, strArr2, str2);
            default:
                throw new IllegalArgumentException("Unkwon Uri:" + uri.toString());
        }
    }

    private Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3) {
        String str4;
        StringBuilder append = new StringBuilder().append(str);
        if (str2 != null) {
            str4 = " and " + str2;
        } else {
            str4 = "";
        }
        return this.a.a("wallpaper", strArr, append.append(str4).toString(), strArr2, null, null, str3, "5");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        switch (b.match(uri)) {
            case 1:
                return "vnd.android.cursor.dir/locals";
            case 2:
                return "vnd.android.cursor.item/favorites";
            default:
                throw new IllegalArgumentException("Unkwon Uri:" + uri.toString());
        }
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
