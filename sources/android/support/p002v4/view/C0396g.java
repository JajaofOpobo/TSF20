package android.support.p002v4.view;

import android.os.Build;
import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
/* renamed from: android.support.v4.view.g */
/* loaded from: classes.dex */
public final class C0396g {

    /* renamed from: a */
    static final InterfaceC0400d f790a;

    /* renamed from: android.support.v4.view.g$d */
    /* loaded from: classes.dex */
    interface InterfaceC0400d {
        /* renamed from: a */
        void mo12639a(KeyEvent keyEvent);

        /* renamed from: a */
        boolean mo12640a(int i, int i2);

        /* renamed from: b */
        boolean mo12638b(int i);
    }

    /* renamed from: android.support.v4.view.g$a */
    /* loaded from: classes.dex */
    static class C0397a implements InterfaceC0400d {
        C0397a() {
        }

        /* renamed from: a */
        private static int m12642a(int i, int i2, int i3, int i4, int i5) {
            boolean z = (i2 & i3) != 0;
            int i6 = i4 | i5;
            boolean z2 = (i2 & i6) != 0;
            if (z) {
                if (z2) {
                    throw new IllegalArgumentException("bad arguments");
                }
                return i & (i6 ^ (-1));
            } else if (z2) {
                return i & (i3 ^ (-1));
            } else {
                return i;
            }
        }

        /* renamed from: a */
        public int mo12641a(int i) {
            int i2 = (i & 192) != 0 ? i | 1 : i;
            if ((i2 & 48) != 0) {
                i2 |= 2;
            }
            return i2 & 247;
        }

        @Override // android.support.p002v4.view.C0396g.InterfaceC0400d
        /* renamed from: a */
        public boolean mo12640a(int i, int i2) {
            return m12642a(m12642a(mo12641a(i) & 247, i2, 1, 64, ItemInfo.APP_INTENT), i2, 2, 16, 32) == i2;
        }

        @Override // android.support.p002v4.view.C0396g.InterfaceC0400d
        /* renamed from: b */
        public boolean mo12638b(int i) {
            return (mo12641a(i) & 247) == 0;
        }

        @Override // android.support.p002v4.view.C0396g.InterfaceC0400d
        /* renamed from: a */
        public void mo12639a(KeyEvent keyEvent) {
        }
    }

    /* renamed from: android.support.v4.view.g$b */
    /* loaded from: classes.dex */
    static class C0398b extends C0397a {
        C0398b() {
        }

        @Override // android.support.p002v4.view.C0396g.C0397a, android.support.p002v4.view.C0396g.InterfaceC0400d
        /* renamed from: a */
        public void mo12639a(KeyEvent keyEvent) {
            C0401h.m12637a(keyEvent);
        }
    }

    /* renamed from: android.support.v4.view.g$c */
    /* loaded from: classes.dex */
    static class C0399c extends C0398b {
        C0399c() {
        }

        @Override // android.support.p002v4.view.C0396g.C0397a
        /* renamed from: a */
        public int mo12641a(int i) {
            return C0402i.m12636a(i);
        }

        @Override // android.support.p002v4.view.C0396g.C0397a, android.support.p002v4.view.C0396g.InterfaceC0400d
        /* renamed from: a */
        public boolean mo12640a(int i, int i2) {
            return C0402i.m12635a(i, i2);
        }

        @Override // android.support.p002v4.view.C0396g.C0397a, android.support.p002v4.view.C0396g.InterfaceC0400d
        /* renamed from: b */
        public boolean mo12638b(int i) {
            return C0402i.m12634b(i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f790a = new C0399c();
        } else {
            f790a = new C0397a();
        }
    }

    /* renamed from: a */
    public static boolean m12644a(KeyEvent keyEvent, int i) {
        return f790a.mo12640a(keyEvent.getMetaState(), i);
    }

    /* renamed from: a */
    public static boolean m12645a(KeyEvent keyEvent) {
        return f790a.mo12638b(keyEvent.getMetaState());
    }

    /* renamed from: b */
    public static void m12643b(KeyEvent keyEvent) {
        f790a.mo12639a(keyEvent);
    }
}
