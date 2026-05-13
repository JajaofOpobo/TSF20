package android.support.p013v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
/* renamed from: android.support.v7.widget.b */
/* loaded from: classes.dex */
class C0731b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f2099a;

    public C0731b(ActionBarContainer actionBarContainer) {
        this.f2099a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f2099a.f1609d) {
            if (this.f2099a.f1608c != null) {
                this.f2099a.f1608c.draw(canvas);
                return;
            }
            return;
        }
        if (this.f2099a.f1606a != null) {
            this.f2099a.f1606a.draw(canvas);
        }
        if (this.f2099a.f1607b != null && this.f2099a.f1610e) {
            this.f2099a.f1607b.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }
}
