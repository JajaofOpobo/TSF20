package com.tsf.shell.plugin.themepicker.utils;

import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k implements Closeable {
    final /* synthetic */ g a;
    private final String b;
    private final long c;
    private final InputStream[] d;

    private k(g gVar, String str, long j, InputStream[] inputStreamArr) {
        this.a = gVar;
        this.b = str;
        this.c = j;
        this.d = inputStreamArr;
    }

    /* synthetic */ k(g gVar, String str, long j, InputStream[] inputStreamArr, k kVar) {
        this(gVar, str, j, inputStreamArr);
    }

    public InputStream a(int i) {
        return this.d[i];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        for (InputStream inputStream : this.d) {
            g.a((Closeable) inputStream);
        }
    }
}
