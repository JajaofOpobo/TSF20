package android.support.v4.a.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.j;
/* loaded from: classes.dex */
class k extends j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Drawable drawable) {
        super(drawable);
    }

    k(j.a aVar, Resources resources) {
        super(aVar, resources);
    }

    @Override // android.support.v4.a.a.j
    j.a b() {
        return new a(this.b, null);
    }

    @Override // android.support.v4.a.a.j
    protected Drawable a(Drawable.ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }

    /* loaded from: classes.dex */
    private static class a extends j.a {
        a(j.a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // android.support.v4.a.a.j.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new k(this, resources);
        }
    }
}
