package android.support.v4.a.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.j;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class l extends j {
    l(Drawable drawable) {
        super(drawable);
    }

    l(j.a aVar, Resources resources) {
        super(aVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }

    @Override // android.support.v4.a.a.j
    j.a b() {
        return new a(this.b, null);
    }

    private static class a extends j.a {
        a(j.a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // android.support.v4.a.a.j.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new l(this, resources);
        }
    }
}
