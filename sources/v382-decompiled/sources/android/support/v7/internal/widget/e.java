package android.support.v7.internal.widget;

import android.content.ContextWrapper;
import android.content.res.Resources;

/* loaded from: classes.dex */
class e extends ContextWrapper {
    private final f a;

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.a.a();
    }

    final f a() {
        return this.a;
    }
}
