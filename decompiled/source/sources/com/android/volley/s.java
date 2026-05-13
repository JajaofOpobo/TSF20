package com.android.volley;
/* loaded from: classes.dex */
public class s extends Exception {
    public final i a;
    private long b;

    public s() {
        this.a = null;
    }

    public s(i iVar) {
        this.a = iVar;
    }

    public s(String str) {
        super(str);
        this.a = null;
    }

    public s(Throwable th) {
        super(th);
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j) {
        this.b = j;
    }
}
