package android.support.p002v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
/* renamed from: android.support.v4.widget.c */
/* loaded from: classes.dex */
public final class C0484c {

    /* renamed from: a */
    private static final InterfaceC0487c f1040a;

    /* renamed from: android.support.v4.widget.c$c */
    /* loaded from: classes.dex */
    interface InterfaceC0487c {
        /* renamed from: a */
        Drawable mo12278a(CompoundButton compoundButton);

        /* renamed from: a */
        void mo12277a(CompoundButton compoundButton, ColorStateList colorStateList);

        /* renamed from: a */
        void mo12276a(CompoundButton compoundButton, PorterDuff.Mode mode);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f1040a = new C0485a();
        } else if (i >= 21) {
            f1040a = new C0488d();
        } else {
            f1040a = new C0486b();
        }
    }

    /* renamed from: android.support.v4.widget.c$b */
    /* loaded from: classes.dex */
    static class C0486b implements InterfaceC0487c {
        C0486b() {
        }

        @Override // android.support.p002v4.widget.C0484c.InterfaceC0487c
        /* renamed from: a */
        public void mo12277a(CompoundButton compoundButton, ColorStateList colorStateList) {
            C0490e.m12273a(compoundButton, colorStateList);
        }

        @Override // android.support.p002v4.widget.C0484c.InterfaceC0487c
        /* renamed from: a */
        public void mo12276a(CompoundButton compoundButton, PorterDuff.Mode mode) {
            C0490e.m12272a(compoundButton, mode);
        }

        @Override // android.support.p002v4.widget.C0484c.InterfaceC0487c
        /* renamed from: a */
        public Drawable mo12278a(CompoundButton compoundButton) {
            return C0490e.m12274a(compoundButton);
        }
    }

    /* renamed from: android.support.v4.widget.c$d */
    /* loaded from: classes.dex */
    static class C0488d extends C0486b {
        C0488d() {
        }

        @Override // android.support.p002v4.widget.C0484c.C0486b, android.support.p002v4.widget.C0484c.InterfaceC0487c
        /* renamed from: a */
        public void mo12277a(CompoundButton compoundButton, ColorStateList colorStateList) {
            C0491f.m12271a(compoundButton, colorStateList);
        }

        @Override // android.support.p002v4.widget.C0484c.C0486b, android.support.p002v4.widget.C0484c.InterfaceC0487c
        /* renamed from: a */
        public void mo12276a(CompoundButton compoundButton, PorterDuff.Mode mode) {
            C0491f.m12270a(compoundButton, mode);
        }
    }

    /* renamed from: android.support.v4.widget.c$a */
    /* loaded from: classes.dex */
    static class C0485a extends C0488d {
        C0485a() {
        }

        @Override // android.support.p002v4.widget.C0484c.C0486b, android.support.p002v4.widget.C0484c.InterfaceC0487c
        /* renamed from: a */
        public Drawable mo12278a(CompoundButton compoundButton) {
            return C0489d.m12275a(compoundButton);
        }
    }

    /* renamed from: a */
    public static void m12280a(CompoundButton compoundButton, ColorStateList colorStateList) {
        f1040a.mo12277a(compoundButton, colorStateList);
    }

    /* renamed from: a */
    public static void m12279a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        f1040a.mo12276a(compoundButton, mode);
    }

    /* renamed from: a */
    public static Drawable m12281a(CompoundButton compoundButton) {
        return f1040a.mo12278a(compoundButton);
    }
}
