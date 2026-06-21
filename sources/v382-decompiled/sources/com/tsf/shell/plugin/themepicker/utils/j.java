package com.tsf.shell.plugin.themepicker.utils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class j {
    final /* synthetic */ g a;
    private final String b;
    private final long[] c;
    private boolean d;
    private h e;
    private long f;

    private j(g gVar, String str) {
        int i;
        this.a = gVar;
        this.b = str;
        i = gVar.g;
        this.c = new long[i];
    }

    /* synthetic */ j(g gVar, String str, j jVar) {
        this(gVar, str);
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.c) {
            sb.append(' ').append(j);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String[] strArr) {
        int i;
        int length = strArr.length;
        i = this.a.g;
        if (length != i) {
            throw b(strArr);
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            try {
                this.c[i2] = Long.parseLong(strArr[i2]);
            } catch (NumberFormatException e) {
                throw b(strArr);
            }
        }
    }

    private IOException b(String[] strArr) {
        throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
    }

    public File a(int i) {
        File file;
        file = this.a.b;
        return new File(file, String.valueOf(this.b) + "." + i);
    }

    public File b(int i) {
        File file;
        file = this.a.b;
        return new File(file, String.valueOf(this.b) + "." + i + ".tmp");
    }
}
