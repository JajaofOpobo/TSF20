package android.support.p013v7.widget;

import android.graphics.Outline;
/* renamed from: android.support.v7.widget.c */
/* loaded from: classes.dex */
class C0732c extends C0731b {
    public C0732c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f2099a.f1609d) {
            if (this.f2099a.f1608c != null) {
                this.f2099a.f1608c.getOutline(outline);
            }
        } else if (this.f2099a.f1606a != null) {
            this.f2099a.f1606a.getOutline(outline);
        }
    }
}
