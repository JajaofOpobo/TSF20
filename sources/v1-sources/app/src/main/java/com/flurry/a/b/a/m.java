package com.flurry.a.b.a;

import java.io.IOException;

/* loaded from: classes.dex */
public class m extends IOException {
    protected g a;

    protected m(String str, g gVar, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this.a = gVar;
    }

    protected m(String str) {
        super(str);
    }

    protected m(String str, g gVar) {
        this(str, gVar, null);
    }

    protected m(String str, Throwable th) {
        this(str, null, th);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        g gVar = this.a;
        if (gVar != null) {
            return message + "\n at " + gVar.toString();
        }
        return message;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
