package com.tsf.shell.e.i.c.a.b;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
class d extends com.tsf.shell.e.i.c.a.p {
    final /* synthetic */ c c;
    private f h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, f fVar) {
        super(cVar);
        this.c = cVar;
        this.h = fVar;
    }

    @Override // com.tsf.shell.e.i.c.a.p
    protected Bitmap a(Void... voidArr) {
        return this.h.a();
    }

    @Override // com.tsf.shell.e.i.c.a.p
    protected void a(Bitmap bitmap) {
        this.h.a(bitmap);
        this.c.a(this);
    }
}
