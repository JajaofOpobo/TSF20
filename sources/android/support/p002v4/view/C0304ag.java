package android.support.p002v4.view;

import android.os.Build;
import android.view.VelocityTracker;
/* renamed from: android.support.v4.view.ag */
/* loaded from: classes.dex */
public final class C0304ag {

    /* renamed from: a */
    static final InterfaceC0307c f750a;

    /* renamed from: android.support.v4.view.ag$c */
    /* loaded from: classes.dex */
    interface InterfaceC0307c {
        /* renamed from: a */
        float mo12936a(VelocityTracker velocityTracker, int i);

        /* renamed from: b */
        float mo12935b(VelocityTracker velocityTracker, int i);
    }

    /* renamed from: android.support.v4.view.ag$a */
    /* loaded from: classes.dex */
    static class C0305a implements InterfaceC0307c {
        C0305a() {
        }

        @Override // android.support.p002v4.view.C0304ag.InterfaceC0307c
        /* renamed from: a */
        public float mo12936a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getXVelocity();
        }

        @Override // android.support.p002v4.view.C0304ag.InterfaceC0307c
        /* renamed from: b */
        public float mo12935b(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getYVelocity();
        }
    }

    /* renamed from: android.support.v4.view.ag$b */
    /* loaded from: classes.dex */
    static class C0306b implements InterfaceC0307c {
        C0306b() {
        }

        @Override // android.support.p002v4.view.C0304ag.InterfaceC0307c
        /* renamed from: a */
        public float mo12936a(VelocityTracker velocityTracker, int i) {
            return C0308ah.m12934a(velocityTracker, i);
        }

        @Override // android.support.p002v4.view.C0304ag.InterfaceC0307c
        /* renamed from: b */
        public float mo12935b(VelocityTracker velocityTracker, int i) {
            return C0308ah.m12933b(velocityTracker, i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f750a = new C0306b();
        } else {
            f750a = new C0305a();
        }
    }

    /* renamed from: a */
    public static float m12938a(VelocityTracker velocityTracker, int i) {
        return f750a.mo12936a(velocityTracker, i);
    }

    /* renamed from: b */
    public static float m12937b(VelocityTracker velocityTracker, int i) {
        return f750a.mo12935b(velocityTracker, i);
    }
}
