package android.support.p002v4.view;

import android.os.Build;
import android.view.LayoutInflater;
/* renamed from: android.support.v4.view.j */
/* loaded from: classes.dex */
public final class C0403j {

    /* renamed from: a */
    static final InterfaceC0404a f791a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.j$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0404a {
        /* renamed from: a */
        InterfaceC0413n mo12631a(LayoutInflater layoutInflater);

        /* renamed from: a */
        void mo12630a(LayoutInflater layoutInflater, InterfaceC0413n interfaceC0413n);
    }

    /* renamed from: android.support.v4.view.j$b */
    /* loaded from: classes.dex */
    static class C0405b implements InterfaceC0404a {
        C0405b() {
        }

        @Override // android.support.p002v4.view.C0403j.InterfaceC0404a
        /* renamed from: a */
        public void mo12630a(LayoutInflater layoutInflater, InterfaceC0413n interfaceC0413n) {
            C0408k.m12628a(layoutInflater, interfaceC0413n);
        }

        @Override // android.support.p002v4.view.C0403j.InterfaceC0404a
        /* renamed from: a */
        public InterfaceC0413n mo12631a(LayoutInflater layoutInflater) {
            return C0408k.m12629a(layoutInflater);
        }
    }

    /* renamed from: android.support.v4.view.j$c */
    /* loaded from: classes.dex */
    static class C0406c extends C0405b {
        C0406c() {
        }

        @Override // android.support.p002v4.view.C0403j.C0405b, android.support.p002v4.view.C0403j.InterfaceC0404a
        /* renamed from: a */
        public void mo12630a(LayoutInflater layoutInflater, InterfaceC0413n interfaceC0413n) {
            C0410l.m12627a(layoutInflater, interfaceC0413n);
        }
    }

    /* renamed from: android.support.v4.view.j$d */
    /* loaded from: classes.dex */
    static class C0407d extends C0406c {
        C0407d() {
        }

        @Override // android.support.p002v4.view.C0403j.C0406c, android.support.p002v4.view.C0403j.C0405b, android.support.p002v4.view.C0403j.InterfaceC0404a
        /* renamed from: a */
        public void mo12630a(LayoutInflater layoutInflater, InterfaceC0413n interfaceC0413n) {
            C0412m.m12625a(layoutInflater, interfaceC0413n);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f791a = new C0407d();
        } else if (i >= 11) {
            f791a = new C0406c();
        } else {
            f791a = new C0405b();
        }
    }

    /* renamed from: a */
    public static void m12632a(LayoutInflater layoutInflater, InterfaceC0413n interfaceC0413n) {
        f791a.mo12630a(layoutInflater, interfaceC0413n);
    }

    /* renamed from: a */
    public static InterfaceC0413n m12633a(LayoutInflater layoutInflater) {
        return f791a.mo12631a(layoutInflater);
    }
}
