package android.support.v4.app;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import com.tsf.shell.theme.inside.ThemeParser;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
final class m extends l {
    static final Interpolator A;
    static final Interpolator B;
    static final Interpolator C;
    static boolean a = false;
    static final boolean b;
    static final Interpolator z;
    ArrayList c;
    Runnable[] d;
    boolean e;
    ArrayList f;
    ArrayList g;
    ArrayList h;
    ArrayList i;
    ArrayList j;
    ArrayList k;
    ArrayList l;
    ArrayList m;
    FragmentActivity o;
    k p;
    Fragment q;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    int n = 0;
    Bundle w = null;
    SparseArray x = null;
    Runnable y = new n(this);

    m() {
    }

    static {
        b = Build.VERSION.SDK_INT >= 11;
        z = new DecelerateInterpolator(2.5f);
        A = new DecelerateInterpolator(1.5f);
        B = new AccelerateInterpolator(2.5f);
        C = new AccelerateInterpolator(1.5f);
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new android.support.v4.c.b("FragmentManager"));
        if (this.o != null) {
            try {
                this.o.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            a("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    @Override // android.support.v4.app.l
    public final v a() {
        return new a(this);
    }

    @Override // android.support.v4.app.l
    public final boolean b() {
        return d();
    }

    public final boolean c() {
        int size;
        s();
        d();
        Handler handler = this.o.a;
        if (this.i == null || this.i.size() - 1 < 0) {
            return false;
        }
        ((a) this.i.remove(size)).c();
        t();
        return true;
    }

    @Override // android.support.v4.app.l
    public final void a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f < 0) {
            a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.f);
    }

    @Override // android.support.v4.app.l
    public final Fragment a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f.size()) {
            a(new IllegalStateException("Fragement no longer exists for key " + str + ": index " + i));
        }
        Fragment fragment = (Fragment) this.f.get(i);
        if (fragment == null) {
            a(new IllegalStateException("Fragement no longer exists for key " + str + ": index " + i));
            return fragment;
        }
        return fragment;
    }

    @Override // android.support.v4.app.l
    public final Fragment.SavedState a(Fragment fragment) {
        Bundle e;
        if (fragment.f < 0) {
            a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.a <= 0 || (e = e(fragment)) == null) {
            return null;
        }
        return new Fragment.SavedState(e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.q != null) {
            android.support.v4.c.a.a(this.q, sb);
        } else {
            android.support.v4.c.a.a(this.o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        int size6;
        String str2 = str + "    ";
        if (this.f != null && (size6 = this.f.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size6; i++) {
                Fragment fragment = (Fragment) this.f.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        if (this.g != null && (size5 = this.g.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                Fragment fragment2 = (Fragment) this.g.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        if (this.j != null && (size4 = this.j.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                Fragment fragment3 = (Fragment) this.j.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        if (this.i != null && (size3 = this.i.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                a aVar = (a) this.i.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.a(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.k != null && (size2 = this.k.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj = (a) this.k.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.l != null && this.l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.l.toArray()));
            }
        }
        if (this.c != null && (size = this.c.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                Object obj2 = (Runnable) this.c.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mActivity=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.t);
        if (this.r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.u);
        }
        if (this.h != null && this.h.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.h.toArray()));
        }
    }

    private static Animation a(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(z);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(A);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    private static Animation a(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(A);
        alphaAnimation.setDuration(220L);
        return alphaAnimation;
    }

    private Animation a(Fragment fragment, int i, boolean z2, int i2) {
        Animation loadAnimation;
        int i3 = fragment.G;
        Fragment.l();
        if (fragment.G == 0 || (loadAnimation = AnimationUtils.loadAnimation(this.o, fragment.G)) == null) {
            if (i == 0) {
                return null;
            }
            char c = 65535;
            switch (i) {
                case ThemeParser.TYPE_WIDGET_RESIZE /* 4097 */:
                    if (!z2) {
                        c = 2;
                        break;
                    } else {
                        c = 1;
                        break;
                    }
                case 4099:
                    if (!z2) {
                        c = 6;
                        break;
                    } else {
                        c = 5;
                        break;
                    }
                case 8194:
                    if (!z2) {
                        c = 4;
                        break;
                    } else {
                        c = 3;
                        break;
                    }
            }
            if (c < 0) {
                return null;
            }
            switch (c) {
                case 1:
                    FragmentActivity fragmentActivity = this.o;
                    return a(1.125f, 1.0f, 0.0f, 1.0f);
                case 2:
                    FragmentActivity fragmentActivity2 = this.o;
                    return a(1.0f, 0.975f, 1.0f, 0.0f);
                case 3:
                    FragmentActivity fragmentActivity3 = this.o;
                    return a(0.975f, 1.0f, 0.0f, 1.0f);
                case 4:
                    FragmentActivity fragmentActivity4 = this.o;
                    return a(1.0f, 1.075f, 1.0f, 0.0f);
                case 5:
                    FragmentActivity fragmentActivity5 = this.o;
                    return a(0.0f, 1.0f);
                case 6:
                    FragmentActivity fragmentActivity6 = this.o;
                    return a(1.0f, 0.0f);
                default:
                    if (i2 == 0 && this.o.getWindow() != null) {
                        i2 = this.o.getWindow().getAttributes().windowAnimations;
                    }
                    return i2 == 0 ? null : null;
            }
        }
        return loadAnimation;
    }

    public final void b(Fragment fragment) {
        if (fragment.K) {
            if (this.e) {
                this.v = true;
            } else {
                fragment.K = false;
                a(fragment, this.n, 0, 0, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045 A[FALL_THROUGH, PHI: r11
      0x0045: PHI (r11v6 int) = 
      (r11v4 int)
      (r11v4 int)
      (r11v4 int)
      (r11v4 int)
      (r11v4 int)
      (r11v4 int)
      (r11v4 int)
      (r11v5 int)
      (r11v4 int)
      (r11v7 int)
      (r11v7 int)
     binds: [B:109:0x022a, B:111:0x022e, B:112:0x0233, B:131:0x0353, B:143:0x039e, B:135:0x035b, B:142:0x0387, B:120:0x0248, B:28:0x0042, B:103:0x01fc, B:107:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void a(Fragment fragment, int i, int i2, int i3, boolean z2) {
        ViewGroup viewGroup;
        if ((!fragment.l || fragment.A) && i > 1) {
            i = 1;
        }
        if (fragment.m && i > fragment.a) {
            i = fragment.a;
        }
        if (fragment.K && fragment.a < 4 && i > 3) {
            i = 3;
        }
        if (fragment.a < i) {
            if (!fragment.o || fragment.p) {
                if (fragment.b != null) {
                    fragment.b = null;
                    a(fragment, fragment.c, 0, 0, true);
                }
                switch (fragment.a) {
                    case 0:
                        if (a) {
                            Log.v("FragmentManager", "moveto CREATED: " + fragment);
                        }
                        if (fragment.d != null) {
                            fragment.e = fragment.d.getSparseParcelableArray("android:view_state");
                            fragment.i = a(fragment.d, "android:target_state");
                            if (fragment.i != null) {
                                fragment.k = fragment.d.getInt("android:target_req_state", 0);
                            }
                            fragment.L = fragment.d.getBoolean("android:user_visible_hint", true);
                            if (!fragment.L) {
                                fragment.K = true;
                                if (i > 3) {
                                    i = 3;
                                }
                            }
                        }
                        fragment.t = this.o;
                        fragment.v = this.q;
                        fragment.s = this.q != null ? this.q.u : this.o.b;
                        fragment.F = false;
                        FragmentActivity fragmentActivity = this.o;
                        fragment.k();
                        if (!fragment.F) {
                            throw new ae("Fragment " + fragment + " did not call through to super.onAttach()");
                        }
                        if (fragment.v == null) {
                            FragmentActivity fragmentActivity2 = this.o;
                            FragmentActivity.c();
                        }
                        if (!fragment.C) {
                            fragment.d(fragment.d);
                        }
                        fragment.C = false;
                        if (fragment.o) {
                            Bundle bundle = fragment.d;
                            fragment.I = fragment.b(fragment.i(), null, fragment.d);
                            if (fragment.I != null) {
                                fragment.J = fragment.I;
                                fragment.I = ad.a(fragment.I);
                                if (fragment.z) {
                                    fragment.I.setVisibility(8);
                                }
                                fragment.a(fragment.I, fragment.d);
                            } else {
                                fragment.J = null;
                            }
                        }
                    case 1:
                        if (i > 1) {
                            if (a) {
                                Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
                            }
                            if (!fragment.o) {
                                if (fragment.x != 0) {
                                    viewGroup = (ViewGroup) this.p.a(fragment.x);
                                    if (viewGroup == null && !fragment.q) {
                                        a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.x) + " (" + fragment.e().getResourceName(fragment.x) + ") for fragment " + fragment));
                                    }
                                } else {
                                    viewGroup = null;
                                }
                                fragment.H = viewGroup;
                                Bundle bundle2 = fragment.d;
                                fragment.I = fragment.b(fragment.i(), viewGroup, fragment.d);
                                if (fragment.I != null) {
                                    fragment.J = fragment.I;
                                    fragment.I = ad.a(fragment.I);
                                    if (viewGroup != null) {
                                        Animation a2 = a(fragment, i2, true, i3);
                                        if (a2 != null) {
                                            fragment.I.startAnimation(a2);
                                        }
                                        viewGroup.addView(fragment.I);
                                    }
                                    if (fragment.z) {
                                        fragment.I.setVisibility(8);
                                    }
                                    fragment.a(fragment.I, fragment.d);
                                } else {
                                    fragment.J = null;
                                }
                            }
                            fragment.e(fragment.d);
                            if (fragment.I != null) {
                                Bundle bundle3 = fragment.d;
                                fragment.a();
                            }
                            fragment.d = null;
                        }
                        break;
                    case 2:
                    case 3:
                        if (i > 3) {
                            if (a) {
                                Log.v("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.r();
                        }
                    case 4:
                        if (i > 4) {
                            if (a) {
                                Log.v("FragmentManager", "moveto RESUMED: " + fragment);
                            }
                            fragment.n = true;
                            fragment.s();
                            fragment.d = null;
                            fragment.e = null;
                        }
                    default:
                        fragment.a = i;
                }
            } else {
                return;
            }
        } else if (fragment.a > i) {
            switch (fragment.a) {
                case 5:
                    if (i < 5) {
                        if (a) {
                            Log.v("FragmentManager", "movefrom RESUMED: " + fragment);
                        }
                        fragment.u();
                        fragment.n = false;
                    }
                case 4:
                    if (i < 4) {
                        if (a) {
                            Log.v("FragmentManager", "movefrom STARTED: " + fragment);
                        }
                        fragment.v();
                    }
                case 3:
                    if (i < 3) {
                        if (a) {
                            Log.v("FragmentManager", "movefrom STOPPED: " + fragment);
                        }
                        fragment.w();
                    }
                case 2:
                    if (i < 2) {
                        if (a) {
                            Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                        }
                        if (fragment.I != null && !this.o.isFinishing() && fragment.e == null) {
                            d(fragment);
                        }
                        fragment.x();
                        if (fragment.I != null && fragment.H != null) {
                            Animation a3 = (this.n <= 0 || this.t) ? null : a(fragment, i2, false, i3);
                            if (a3 != null) {
                                fragment.b = fragment.I;
                                fragment.c = i;
                                a3.setAnimationListener(new o(this, fragment));
                                fragment.I.startAnimation(a3);
                            }
                            fragment.H.removeView(fragment.I);
                        }
                        fragment.H = null;
                        fragment.I = null;
                        fragment.J = null;
                    }
                    break;
                case 1:
                    if (i <= 0) {
                        if (this.t && fragment.b != null) {
                            View view = fragment.b;
                            fragment.b = null;
                            view.clearAnimation();
                        }
                        if (fragment.b != null) {
                            fragment.c = i;
                            i = 1;
                        } else {
                            if (a) {
                                Log.v("FragmentManager", "movefrom CREATED: " + fragment);
                            }
                            if (!fragment.C) {
                                fragment.y();
                            }
                            fragment.F = false;
                            fragment.p();
                            if (!fragment.F) {
                                throw new ae("Fragment " + fragment + " did not call through to super.onDetach()");
                            }
                            if (!z2) {
                                if (!fragment.C) {
                                    if (fragment.f >= 0) {
                                        if (a) {
                                            Log.v("FragmentManager", "Freeing fragment index " + fragment);
                                        }
                                        this.f.set(fragment.f, null);
                                        if (this.h == null) {
                                            this.h = new ArrayList();
                                        }
                                        this.h.add(Integer.valueOf(fragment.f));
                                        this.o.a(fragment.g);
                                        fragment.o();
                                    }
                                } else {
                                    fragment.t = null;
                                    fragment.s = null;
                                }
                            }
                        }
                    }
                    break;
            }
        }
        fragment.a = i;
    }

    final void c(Fragment fragment) {
        a(fragment, this.n, 0, 0, false);
    }

    private void d(int i) {
        a(i, 0, 0, false);
    }

    final void a(int i, int i2, int i3, boolean z2) {
        if (this.o == null && i != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || this.n != i) {
            this.n = i;
            if (this.f != null) {
                int i4 = 0;
                boolean z3 = false;
                while (i4 < this.f.size()) {
                    Fragment fragment = (Fragment) this.f.get(i4);
                    if (fragment != null) {
                        a(fragment, i, i2, i3, false);
                        if (fragment.M != null) {
                            z3 |= fragment.M.a();
                        }
                    }
                    i4++;
                    z3 = z3;
                }
                if (!z3) {
                    r();
                }
                if (this.r && this.o != null && this.n == 5) {
                    this.o.b();
                    this.r = false;
                }
            }
        }
    }

    private void r() {
        if (this.f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f.size()) {
                    Fragment fragment = (Fragment) this.f.get(i2);
                    if (fragment != null) {
                        b(fragment);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void a(Fragment fragment, boolean z2) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (a) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        if (fragment.f < 0) {
            if (this.h == null || this.h.size() <= 0) {
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                fragment.a(this.f.size(), this.q);
                this.f.add(fragment);
            } else {
                fragment.a(((Integer) this.h.remove(this.h.size() - 1)).intValue(), this.q);
                this.f.set(fragment.f, fragment);
            }
            if (a) {
                Log.v("FragmentManager", "Allocated fragment index " + fragment);
            }
        }
        if (!fragment.A) {
            if (this.g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            this.g.add(fragment);
            fragment.l = true;
            fragment.m = false;
            if (fragment.D && fragment.E) {
                this.r = true;
            }
            if (z2) {
                c(fragment);
            }
        }
    }

    public final void a(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.r);
        }
        boolean z2 = !fragment.b();
        if (!fragment.A || z2) {
            if (this.g != null) {
                this.g.remove(fragment);
            }
            if (fragment.D && fragment.E) {
                this.r = true;
            }
            fragment.l = false;
            fragment.m = true;
            a(fragment, z2 ? 0 : 1, i, i2, false);
        }
    }

    public final void b(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.z) {
            fragment.z = true;
            if (fragment.I != null) {
                Animation a2 = a(fragment, i, true, i2);
                if (a2 != null) {
                    fragment.I.startAnimation(a2);
                }
                fragment.I.setVisibility(8);
            }
            if (fragment.l && fragment.D && fragment.E) {
                this.r = true;
            }
            Fragment.g();
        }
    }

    public final void c(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.z) {
            fragment.z = false;
            if (fragment.I != null) {
                Animation a2 = a(fragment, i, true, i2);
                if (a2 != null) {
                    fragment.I.startAnimation(a2);
                }
                fragment.I.setVisibility(0);
            }
            if (fragment.l && fragment.D && fragment.E) {
                this.r = true;
            }
            Fragment.g();
        }
    }

    public final void d(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.A) {
            fragment.A = true;
            if (fragment.l) {
                if (this.g != null) {
                    if (a) {
                        Log.v("FragmentManager", "remove from detach: " + fragment);
                    }
                    this.g.remove(fragment);
                }
                if (fragment.D && fragment.E) {
                    this.r = true;
                }
                fragment.l = false;
                a(fragment, 1, i, i2, false);
            }
        }
    }

    public final void e(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            if (!fragment.l) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                if (this.g.contains(fragment)) {
                    throw new IllegalStateException("Fragment already added: " + fragment);
                }
                if (a) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                this.g.add(fragment);
                fragment.l = true;
                if (fragment.D && fragment.E) {
                    this.r = true;
                }
                a(fragment, this.n, i, i2, false);
            }
        }
    }

    public final Fragment a(int i) {
        if (this.g != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.g.get(size);
                if (fragment != null && fragment.w == i) {
                    return fragment;
                }
            }
        }
        if (this.f != null) {
            for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f.get(size2);
                if (fragment2 != null && fragment2.w == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    @Override // android.support.v4.app.l
    public final Fragment a(String str) {
        if (this.g != null && str != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.g.get(size);
                if (fragment != null && str.equals(fragment.y)) {
                    return fragment;
                }
            }
        }
        if (this.f != null && str != null) {
            for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f.get(size2);
                if (fragment2 != null && str.equals(fragment2.y)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void s() {
        if (this.s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.u);
        }
    }

    public final void a(Runnable runnable, boolean z2) {
        if (!z2) {
            s();
        }
        synchronized (this) {
            if (this.o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(runnable);
            if (this.c.size() == 1) {
                this.o.a.removeCallbacks(this.y);
                this.o.a.post(this.y);
            }
        }
    }

    public final int a(a aVar) {
        int size;
        synchronized (this) {
            if (this.l == null || this.l.size() <= 0) {
                if (this.k == null) {
                    this.k = new ArrayList();
                }
                size = this.k.size();
                if (a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
                }
                this.k.add(aVar);
            } else {
                size = ((Integer) this.l.remove(this.l.size() - 1)).intValue();
                if (a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + aVar);
                }
                this.k.set(size, aVar);
            }
        }
        return size;
    }

    private void a(int i, a aVar) {
        synchronized (this) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            int size = this.k.size();
            if (i < size) {
                if (a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + aVar);
                }
                this.k.set(i, aVar);
            } else {
                while (size < i) {
                    this.k.add(null);
                    if (this.l == null) {
                        this.l = new ArrayList();
                    }
                    if (a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.l.add(Integer.valueOf(size));
                    size++;
                }
                if (a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + aVar);
                }
                this.k.add(aVar);
            }
        }
    }

    public final void b(int i) {
        synchronized (this) {
            this.k.set(i, null);
            if (this.l == null) {
                this.l = new ArrayList();
            }
            if (a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.l.add(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        r6.e = true;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r1 >= r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        r6.d[r1].run();
        r6.d[r1] = null;
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        if (this.e) {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (Looper.myLooper() != this.o.a.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of process");
        }
        boolean z2 = false;
        while (true) {
            synchronized (this) {
                if (this.c == null || this.c.size() == 0) {
                    break;
                }
                int size = this.c.size();
                if (this.d == null || this.d.length < size) {
                    this.d = new Runnable[size];
                }
                this.c.toArray(this.d);
                this.c.clear();
                this.o.a.removeCallbacks(this.y);
            }
            this.e = false;
            z2 = true;
        }
        if (this.v) {
            boolean z3 = false;
            for (int i = 0; i < this.f.size(); i++) {
                Fragment fragment = (Fragment) this.f.get(i);
                if (fragment != null && fragment.M != null) {
                    z3 |= fragment.M.a();
                }
            }
            if (!z3) {
                this.v = false;
                r();
            }
        }
        return z2;
    }

    private void t() {
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                this.m.get(i);
            }
        }
    }

    final void b(a aVar) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(aVar);
        t();
    }

    final ArrayList e() {
        ArrayList arrayList = null;
        if (this.f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f.size()) {
                    break;
                }
                Fragment fragment = (Fragment) this.f.get(i2);
                if (fragment != null && fragment.B) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                    fragment.C = true;
                    fragment.j = fragment.i != null ? fragment.i.f : -1;
                    if (a) {
                        Log.v("FragmentManager", "retainNonConfig: keeping retained " + fragment);
                    }
                }
                i = i2 + 1;
            }
        }
        return arrayList;
    }

    private void d(Fragment fragment) {
        if (fragment.J != null) {
            if (this.x == null) {
                this.x = new SparseArray();
            } else {
                this.x.clear();
            }
            fragment.J.saveHierarchyState(this.x);
            if (this.x.size() > 0) {
                fragment.e = this.x;
                this.x = null;
            }
        }
    }

    private Bundle e(Fragment fragment) {
        Bundle bundle;
        if (this.w == null) {
            this.w = new Bundle();
        }
        fragment.f(this.w);
        if (this.w.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.w;
            this.w = null;
        }
        if (fragment.I != null) {
            d(fragment);
        }
        if (fragment.e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.e);
        }
        if (!fragment.L) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.L);
        }
        return bundle;
    }

    final Parcelable f() {
        int[] iArr;
        int size;
        int size2;
        boolean z2;
        BackStackState[] backStackStateArr = null;
        d();
        if (b) {
            this.s = true;
        }
        if (this.f == null || this.f.size() <= 0) {
            return null;
        }
        int size3 = this.f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size3];
        int i = 0;
        boolean z3 = false;
        while (i < size3) {
            Fragment fragment = (Fragment) this.f.get(i);
            if (fragment != null) {
                if (fragment.f < 0) {
                    a(new IllegalStateException("Failure saving state: active " + fragment + " has cleared index: " + fragment.f));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i] = fragmentState;
                if (fragment.a > 0 && fragmentState.j == null) {
                    fragmentState.j = e(fragment);
                    if (fragment.i != null) {
                        if (fragment.i.f < 0) {
                            a(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.i));
                        }
                        if (fragmentState.j == null) {
                            fragmentState.j = new Bundle();
                        }
                        a(fragmentState.j, "android:target_state", fragment.i);
                        if (fragment.k != 0) {
                            fragmentState.j.putInt("android:target_req_state", fragment.k);
                        }
                    }
                } else {
                    fragmentState.j = fragment.d;
                }
                if (a) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragmentState.j);
                }
                z2 = true;
            } else {
                z2 = z3;
            }
            i++;
            z3 = z2;
        }
        if (!z3) {
            if (!a) {
                return null;
            }
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
        if (this.g == null || (size2 = this.g.size()) <= 0) {
            iArr = null;
        } else {
            iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = ((Fragment) this.g.get(i2)).f;
                if (iArr[i2] < 0) {
                    a(new IllegalStateException("Failure saving state: active " + this.g.get(i2) + " has cleared index: " + iArr[i2]));
                }
                if (a) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.g.get(i2));
                }
            }
        }
        if (this.i != null && (size = this.i.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i3 = 0; i3 < size; i3++) {
                backStackStateArr[i3] = new BackStackState((a) this.i.get(i3));
                if (a) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.i.get(i3));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.a = fragmentStateArr;
        fragmentManagerState.b = iArr;
        fragmentManagerState.c = backStackStateArr;
        return fragmentManagerState;
    }

    final void a(Parcelable parcelable, ArrayList arrayList) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.a != null) {
                if (arrayList != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        Fragment fragment = (Fragment) arrayList.get(i);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                        }
                        FragmentState fragmentState = fragmentManagerState.a[fragment.f];
                        fragmentState.k = fragment;
                        fragment.e = null;
                        fragment.r = 0;
                        fragment.p = false;
                        fragment.l = false;
                        fragment.i = null;
                        if (fragmentState.j != null) {
                            fragmentState.j.setClassLoader(this.o.getClassLoader());
                            fragment.e = fragmentState.j.getSparseParcelableArray("android:view_state");
                        }
                    }
                }
                this.f = new ArrayList(fragmentManagerState.a.length);
                if (this.h != null) {
                    this.h.clear();
                }
                for (int i2 = 0; i2 < fragmentManagerState.a.length; i2++) {
                    FragmentState fragmentState2 = fragmentManagerState.a[i2];
                    if (fragmentState2 != null) {
                        Fragment a2 = fragmentState2.a(this.o, this.q);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + a2);
                        }
                        this.f.add(a2);
                        fragmentState2.k = null;
                    } else {
                        this.f.add(null);
                        if (this.h == null) {
                            this.h = new ArrayList();
                        }
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + i2);
                        }
                        this.h.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        Fragment fragment2 = (Fragment) arrayList.get(i3);
                        if (fragment2.j >= 0) {
                            if (fragment2.j < this.f.size()) {
                                fragment2.i = (Fragment) this.f.get(fragment2.j);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + fragment2 + " target no longer exists: " + fragment2.j);
                                fragment2.i = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.b != null) {
                    this.g = new ArrayList(fragmentManagerState.b.length);
                    for (int i4 = 0; i4 < fragmentManagerState.b.length; i4++) {
                        Fragment fragment3 = (Fragment) this.f.get(fragmentManagerState.b[i4]);
                        if (fragment3 == null) {
                            a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.b[i4]));
                        }
                        fragment3.l = true;
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + i4 + ": " + fragment3);
                        }
                        if (this.g.contains(fragment3)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.g.add(fragment3);
                    }
                } else {
                    this.g = null;
                }
                if (fragmentManagerState.c != null) {
                    this.i = new ArrayList(fragmentManagerState.c.length);
                    for (int i5 = 0; i5 < fragmentManagerState.c.length; i5++) {
                        a a3 = fragmentManagerState.c[i5].a(this);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i5 + " (index " + a3.o + "): " + a3);
                            a3.a("  ", new PrintWriter(new android.support.v4.c.b("FragmentManager")), false);
                        }
                        this.i.add(a3);
                        if (a3.o >= 0) {
                            a(a3.o, a3);
                        }
                    }
                    return;
                }
                this.i = null;
            }
        }
    }

    public final void a(FragmentActivity fragmentActivity, k kVar, Fragment fragment) {
        if (this.o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.o = fragmentActivity;
        this.p = kVar;
        this.q = fragment;
    }

    public final void g() {
        this.s = false;
    }

    public final void h() {
        this.s = false;
        d(1);
    }

    public final void i() {
        this.s = false;
        d(2);
    }

    public final void j() {
        this.s = false;
        d(4);
    }

    public final void k() {
        this.s = false;
        d(5);
    }

    public final void l() {
        d(4);
    }

    public final void m() {
        this.s = true;
        d(3);
    }

    public final void n() {
        d(2);
    }

    public final void o() {
        d(1);
    }

    public final void p() {
        this.t = true;
        d();
        d(0);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public final void a(Configuration configuration) {
        if (this.g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.g.size()) {
                    Fragment fragment = (Fragment) this.g.get(i2);
                    if (fragment != null) {
                        fragment.a(configuration);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void q() {
        if (this.g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.g.size()) {
                    Fragment fragment = (Fragment) this.g.get(i2);
                    if (fragment != null) {
                        fragment.t();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean a(Menu menu, MenuInflater menuInflater) {
        boolean z2;
        ArrayList arrayList = null;
        if (this.g != null) {
            int i = 0;
            z2 = false;
            while (i < this.g.size()) {
                Fragment fragment = (Fragment) this.g.get(i);
                if (fragment != null && fragment.a(menu, menuInflater)) {
                    z2 = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                }
                i++;
                z2 = z2;
            }
        } else {
            z2 = false;
        }
        if (this.j != null) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                Fragment fragment2 = (Fragment) this.j.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    Fragment.q();
                }
            }
        }
        this.j = arrayList;
        return z2;
    }

    public final boolean a(Menu menu) {
        if (this.g == null) {
            return false;
        }
        boolean z2 = false;
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = (Fragment) this.g.get(i);
            if (fragment != null && fragment.a(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public final boolean a(MenuItem menuItem) {
        if (this.g == null) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = (Fragment) this.g.get(i);
            if (fragment != null && fragment.a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(MenuItem menuItem) {
        if (this.g == null) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = (Fragment) this.g.get(i);
            if (fragment != null && fragment.b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(Menu menu) {
        if (this.g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.g.size()) {
                    Fragment fragment = (Fragment) this.g.get(i2);
                    if (fragment != null) {
                        fragment.b(menu);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public static int c(int i) {
        switch (i) {
            case ThemeParser.TYPE_WIDGET_RESIZE /* 4097 */:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return ThemeParser.TYPE_WIDGET_RESIZE;
            default:
                return 0;
        }
    }
}
