package android.support.p013v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.AbstractC0607b;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: android.support.v7.app.ActionBar */
/* loaded from: classes.dex */
public abstract class ActionBar {

    /* renamed from: android.support.v7.app.ActionBar$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0547a {
        /* renamed from: a */
        void m12121a(boolean z);
    }

    /* renamed from: android.support.v7.app.ActionBar$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0548b {
        /* renamed from: a */
        public abstract Drawable m12120a();

        /* renamed from: b */
        public abstract CharSequence m12119b();

        /* renamed from: c */
        public abstract View m12118c();

        /* renamed from: d */
        public abstract void m12117d();

        /* renamed from: e */
        public abstract CharSequence m12116e();
    }

    /* renamed from: a */
    public abstract int mo11925a();

    /* renamed from: b */
    public abstract boolean mo11914b();

    /* renamed from: a */
    public void mo11916a(boolean z) {
    }

    /* renamed from: c */
    public Context mo11909c() {
        return null;
    }

    /* renamed from: b */
    public void mo11911b(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    /* renamed from: d */
    public int mo11906d() {
        return 0;
    }

    /* renamed from: a */
    public void mo11924a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* renamed from: c */
    public void mo11907c(boolean z) {
    }

    /* renamed from: d */
    public void mo11904d(boolean z) {
    }

    /* renamed from: a */
    public void mo11922a(Configuration configuration) {
    }

    /* renamed from: e */
    public void mo11902e(boolean z) {
    }

    /* renamed from: a */
    public AbstractC0607b mo11919a(AbstractC0607b.InterfaceC0608a interfaceC0608a) {
        return null;
    }

    /* renamed from: e */
    public boolean mo11936e() {
        return false;
    }

    /* renamed from: a */
    public boolean mo11939a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: f */
    public boolean mo11901f() {
        return false;
    }

    /* renamed from: a */
    public void mo11917a(CharSequence charSequence) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo11898g() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo11935h() {
    }

    /* renamed from: android.support.v7.app.ActionBar$LayoutParams */
    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1112a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1112a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0535a.C0546k.ActionBarLayout);
            this.f1112a = obtainStyledAttributes.getInt(C0535a.C0546k.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1112a = 0;
            this.f1112a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f1112a = 0;
            this.f1112a = layoutParams.f1112a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1112a = 0;
        }
    }
}
