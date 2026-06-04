package com.tsf.shell;

import android.content.ContentUris;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class bv {
    public final String a;
    public final String b;
    public final String[] c;

    bv(Uri uri, String str, String[] strArr) {
        if (uri.getPathSegments().size() == 1) {
            this.a = uri.getPathSegments().get(0);
            this.b = str;
            this.c = strArr;
        } else {
            if (uri.getPathSegments().size() != 2) {
                throw new IllegalArgumentException("Invalid URI: " + uri);
            }
            if (!TextUtils.isEmpty(str)) {
                throw new UnsupportedOperationException("WHERE clause not supported: " + uri);
            }
            this.a = uri.getPathSegments().get(0);
            this.b = "_id=" + ContentUris.parseId(uri);
            this.c = null;
        }
    }

    bv(Uri uri) {
        if (uri.getPathSegments().size() == 1) {
            this.a = uri.getPathSegments().get(0);
            this.b = null;
            this.c = null;
            return;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }
}
