package android.support.v4.view;

import android.os.Build;
import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.info.ItemInfo;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class g {
    static final d a;

    interface d {
        void a(KeyEvent keyEvent);

        boolean a(int i, int i2);

        boolean b(int i);
    }

    static class a implements d {
        a() {
        }

        private static int a(int i, int i2, int i3, int i4, int i5) {
            boolean z = (i2 & i3) != 0;
            int i6 = i4 | i5;
            boolean z2 = (i2 & i6) != 0;
            if (z) {
                if (z2) {
                    throw new IllegalArgumentException("bad arguments");
                }
                return i & (i6 ^ (-1));
            }
            if (z2) {
                return i & (i3 ^ (-1));
            }
            return i;
        }

        public int a(int i) {
            int i2 = (i & 192) != 0 ? i | 1 : i;
            if ((i2 & 48) != 0) {
                i2 |= 2;
            }
            return i2 & 247;
        }

        @Override // android.support.v4.view.g.d
        public boolean a(int i, int i2) {
            return a(a(a(i) & 247, i2, 1, 64, ItemInfo.APP_INTENT), i2, 2, 16, 32) == i2;
        }

        @Override // android.support.v4.view.g.d
        public boolean b(int i) {
            return (a(i) & 247) == 0;
        }

        @Override // android.support.v4.view.g.d
        public void a(KeyEvent keyEvent) {
        }
    }

    static class b extends a {
        b() {
        }

        @Override // android.support.v4.view.g.a, android.support.v4.view.g.d
        public void a(KeyEvent keyEvent) {
            h.a(keyEvent);
        }
    }

    static class c extends b {
        c() {
        }

        @Override // android.support.v4.view.g.a
        public int a(int i) {
            return i.a(i);
        }

        @Override // android.support.v4.view.g.a, android.support.v4.view.g.d
        public boolean a(int i, int i2) {
            return i.a(i, i2);
        }

        @Override // android.support.v4.view.g.a, android.support.v4.view.g.d
        public boolean b(int i) {
            return i.b(i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            a = new c();
        } else {
            a = new a();
        }
    }

    public static boolean a(KeyEvent keyEvent, int i) {
        return a.a(keyEvent.getMetaState(), i);
    }

    public static boolean a(KeyEvent keyEvent) {
        return a.b(keyEvent.getMetaState());
    }

    public static void b(KeyEvent keyEvent) {
        a.a(keyEvent);
    }
}
