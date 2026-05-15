package android.support.v4.a.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.j;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class m extends l {
    m(Drawable drawable) {
        super(drawable);
    }

    m(j.a aVar, Resources resources) {
        super(aVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    @Override // android.support.v4.a.a.l, android.support.v4.a.a.j
    j.a b() {
        return new a(this.b, null);
    }

    private static class a extends j.a {
        a(j.a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // android.support.v4.a.a.j.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new m(this, resources);
        }
    }
}
