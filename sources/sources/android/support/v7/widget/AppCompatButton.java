package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.view.af;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AppCompatButton extends Button implements af {
    private final g a;
    private final e b;
    private final k c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C0012a.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(x.a(context), attributeSet, i);
        this.a = g.a();
        this.b = new e(this, this.a);
        this.b.a(attributeSet, i);
        this.c = k.a(this);
        this.c.a(attributeSet, i);
        this.c.a();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.b != null) {
            this.b.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.b != null) {
            this.b.a(drawable);
        }
    }

    @Override // android.support.v4.view.af
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    @Override // android.support.v4.view.af
    public ColorStateList getSupportBackgroundTintList() {
        if (this.b != null) {
            return this.b.a();
        }
        return null;
    }

    @Override // android.support.v4.view.af
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }

    @Override // android.support.v4.view.af
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.c();
        }
        if (this.c != null) {
            this.c.a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setSupportAllCaps(boolean z) {
        if (this.c != null) {
            this.c.a(z);
        }
    }
}
