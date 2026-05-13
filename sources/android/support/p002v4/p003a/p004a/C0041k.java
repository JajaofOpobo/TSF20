package android.support.p002v4.p003a.p004a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p002v4.p003a.p004a.C0038j;
/* renamed from: android.support.v4.a.a.k */
/* loaded from: classes.dex */
class C0041k extends C0038j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0041k(Drawable drawable) {
        super(drawable);
    }

    C0041k(C0038j.AbstractC0039a abstractC0039a, Resources resources) {
        super(abstractC0039a, resources);
    }

    @Override // android.support.p002v4.p003a.p004a.C0038j
    /* renamed from: b */
    C0038j.AbstractC0039a mo13799b() {
        return new C0042a(this.f96b, null);
    }

    @Override // android.support.p002v4.p003a.p004a.C0038j
    /* renamed from: a */
    protected Drawable mo13800a(Drawable.ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }

    /* renamed from: android.support.v4.a.a.k$a */
    /* loaded from: classes.dex */
    private static class C0042a extends C0038j.AbstractC0039a {
        C0042a(C0038j.AbstractC0039a abstractC0039a, Resources resources) {
            super(abstractC0039a, resources);
        }

        @Override // android.support.p002v4.p003a.p004a.C0038j.AbstractC0039a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0041k(this, resources);
        }
    }
}
