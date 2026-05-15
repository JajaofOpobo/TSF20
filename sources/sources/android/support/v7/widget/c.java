package android.support.v7.widget;

import android.graphics.Outline;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class c extends b {
    public c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.a.d) {
            if (this.a.c != null) {
                this.a.c.getOutline(outline);
            }
        } else if (this.a.a != null) {
            this.a.a.getOutline(outline);
        }
    }
}
