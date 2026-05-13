package android.support.p002v4.p003a.p004a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p002v4.p003a.p004a.C0038j;
/* renamed from: android.support.v4.a.a.l */
/* loaded from: classes.dex */
class C0043l extends C0038j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0043l(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0043l(C0038j.AbstractC0039a abstractC0039a, Resources resources) {
        super(abstractC0039a, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f97c.jumpToCurrentState();
    }

    @Override // android.support.p002v4.p003a.p004a.C0038j
    /* renamed from: b */
    C0038j.AbstractC0039a mo13799b() {
        return new C0044a(this.f96b, null);
    }

    /* renamed from: android.support.v4.a.a.l$a */
    /* loaded from: classes.dex */
    private static class C0044a extends C0038j.AbstractC0039a {
        C0044a(C0038j.AbstractC0039a abstractC0039a, Resources resources) {
            super(abstractC0039a, resources);
        }

        @Override // android.support.p002v4.p003a.p004a.C0038j.AbstractC0039a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0043l(this, resources);
        }
    }
}
