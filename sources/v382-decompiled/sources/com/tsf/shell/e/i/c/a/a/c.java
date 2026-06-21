package com.tsf.shell.e.i.c.a.a;

import android.graphics.Bitmap;
import com.tsf.shell.e.i.c.a.p;

/* loaded from: classes.dex */
class c extends p {
    final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar) {
        super(bVar);
        this.c = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.e.i.c.a.p
    public Bitmap a(Void... voidArr) {
        return this.c.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.e.i.c.a.p
    public void a(Bitmap bitmap) {
        this.c.a(bitmap);
        this.c.a(this);
    }
}
