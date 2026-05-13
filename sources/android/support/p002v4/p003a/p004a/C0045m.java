package android.support.p002v4.p003a.p004a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p002v4.p003a.p004a.C0038j;
/* renamed from: android.support.v4.a.a.m */
/* loaded from: classes.dex */
class C0045m extends C0043l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0045m(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0045m(C0038j.AbstractC0039a abstractC0039a, Resources resources) {
        super(abstractC0039a, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f97c.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f97c.isAutoMirrored();
    }

    @Override // android.support.p002v4.p003a.p004a.C0043l, android.support.p002v4.p003a.p004a.C0038j
    /* renamed from: b */
    C0038j.AbstractC0039a mo13799b() {
        return new C0046a(this.f96b, null);
    }

    /* renamed from: android.support.v4.a.a.m$a */
    /* loaded from: classes.dex */
    private static class C0046a extends C0038j.AbstractC0039a {
        C0046a(C0038j.AbstractC0039a abstractC0039a, Resources resources) {
            super(abstractC0039a, resources);
        }

        @Override // android.support.p002v4.p003a.p004a.C0038j.AbstractC0039a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0045m(this, resources);
        }
    }
}
