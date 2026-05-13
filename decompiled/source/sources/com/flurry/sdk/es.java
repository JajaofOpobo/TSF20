package com.flurry.sdk;

import android.content.Context;
/* loaded from: classes.dex */
public class es implements et {
    private final et a;

    public es(et etVar) {
        this.a = etVar;
    }

    @Override // com.flurry.sdk.et
    public void a(dj djVar, Context context) {
        if (this.a != null) {
            this.a.a(djVar, context);
        }
    }

    @Override // com.flurry.sdk.et
    public void b(dj djVar, Context context) {
        if (this.a != null) {
            this.a.b(djVar, context);
        }
    }

    @Override // com.flurry.sdk.et
    public void c(dj djVar, Context context) {
        if (this.a != null) {
            this.a.c(djVar, context);
        }
    }

    @Override // com.flurry.sdk.et
    public void a(dj djVar) {
        if (this.a != null) {
            this.a.a(djVar);
        }
    }
}
