package com.flurry.android;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class co extends br {
    private final az a;

    public co(az azVar, j jVar) {
        super(jVar);
        this.a = azVar;
    }

    @Override // com.flurry.android.br
    public final void a(Context context, ViewGroup viewGroup) {
        if (this.a != null) {
            this.a.a();
        }
    }
}
