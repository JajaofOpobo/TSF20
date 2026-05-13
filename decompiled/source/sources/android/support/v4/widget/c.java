package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
/* loaded from: classes.dex */
public final class c {
    private static final InterfaceC0011c a;

    /* renamed from: android.support.v4.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    interface InterfaceC0011c {
        Drawable a(CompoundButton compoundButton);

        void a(CompoundButton compoundButton, ColorStateList colorStateList);

        void a(CompoundButton compoundButton, PorterDuff.Mode mode);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            a = new a();
        } else if (i >= 21) {
            a = new d();
        } else {
            a = new b();
        }
    }

    /* loaded from: classes.dex */
    static class b implements InterfaceC0011c {
        b() {
        }

        @Override // android.support.v4.widget.c.InterfaceC0011c
        public void a(CompoundButton compoundButton, ColorStateList colorStateList) {
            e.a(compoundButton, colorStateList);
        }

        @Override // android.support.v4.widget.c.InterfaceC0011c
        public void a(CompoundButton compoundButton, PorterDuff.Mode mode) {
            e.a(compoundButton, mode);
        }

        @Override // android.support.v4.widget.c.InterfaceC0011c
        public Drawable a(CompoundButton compoundButton) {
            return e.a(compoundButton);
        }
    }

    /* loaded from: classes.dex */
    static class d extends b {
        d() {
        }

        @Override // android.support.v4.widget.c.b, android.support.v4.widget.c.InterfaceC0011c
        public void a(CompoundButton compoundButton, ColorStateList colorStateList) {
            f.a(compoundButton, colorStateList);
        }

        @Override // android.support.v4.widget.c.b, android.support.v4.widget.c.InterfaceC0011c
        public void a(CompoundButton compoundButton, PorterDuff.Mode mode) {
            f.a(compoundButton, mode);
        }
    }

    /* loaded from: classes.dex */
    static class a extends d {
        a() {
        }

        @Override // android.support.v4.widget.c.b, android.support.v4.widget.c.InterfaceC0011c
        public Drawable a(CompoundButton compoundButton) {
            return android.support.v4.widget.d.a(compoundButton);
        }
    }

    public static void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        a.a(compoundButton, colorStateList);
    }

    public static void a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        a.a(compoundButton, mode);
    }

    public static Drawable a(CompoundButton compoundButton) {
        return a.a(compoundButton);
    }
}
