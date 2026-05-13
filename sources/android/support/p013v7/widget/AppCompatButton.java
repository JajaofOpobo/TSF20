package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p002v4.view.InterfaceC0303af;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
/* renamed from: android.support.v7.widget.AppCompatButton */
/* loaded from: classes.dex */
public class AppCompatButton extends Button implements InterfaceC0303af {

    /* renamed from: a */
    private final C0742g f1747a;

    /* renamed from: b */
    private final C0740e f1748b;

    /* renamed from: c */
    private final C0751k f1749c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0772x.m11063a(context), attributeSet, i);
        this.f1747a = C0742g.m11215a();
        this.f1748b = new C0740e(this, this.f1747a);
        this.f1748b.m11228a(attributeSet, i);
        this.f1749c = C0751k.m11168a(this);
        this.f1749c.mo11165a(attributeSet, i);
        this.f1749c.mo11166a();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1748b != null) {
            this.f1748b.m11232a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1748b != null) {
            this.f1748b.m11229a(drawable);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1748b != null) {
            this.f1748b.m11231a(colorStateList);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1748b != null) {
            return this.f1748b.m11233a();
        }
        return null;
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1748b != null) {
            this.f1748b.m11230a(mode);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1748b != null) {
            return this.f1748b.m11227b();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1748b != null) {
            this.f1748b.m11224c();
        }
        if (this.f1749c != null) {
            this.f1749c.mo11166a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1749c != null) {
            this.f1749c.m11171a(context, i);
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
        if (this.f1749c != null) {
            this.f1749c.m11167a(z);
        }
    }
}
