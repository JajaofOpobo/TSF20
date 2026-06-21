package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
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
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class m extends k implements LayoutInflater.Factory {
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
    j p;
    Fragment q;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    int n = 0;
    Bundle w = null;
    SparseArray x = null;
    Runnable y = new Runnable() { // from class: android.support.v4.app.m.1
        @Override // java.lang.Runnable
        public void run() {
            m.this.f();
        }
    };

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
        PrintWriter printWriter = new PrintWriter(new android.support.v4.f.d("FragmentManager"));
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

    @Override // android.support.v4.app.k
    public q a() {
        return new d(this);
    }

    @Override // android.support.v4.app.k
    public boolean b() {
        return f();
    }

    public boolean d() {
        v();
        b();
        return a(this.o.a, (String) null, -1, 0);
    }

    @Override // android.support.v4.app.k
    public void a(final int i, final int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        a(new Runnable() { // from class: android.support.v4.app.m.2
            @Override // java.lang.Runnable
            public void run() {
                m.this.a(m.this.o.a, (String) null, i, i2);
            }
        }, false);
    }

    @Override // android.support.v4.app.k
    public void a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.p < 0) {
            a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.p);
    }

    @Override // android.support.v4.app.k
    public Fragment a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f.size()) {
            a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        Fragment fragment = (Fragment) this.f.get(i);
        if (fragment == null) {
            a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
            return fragment;
        }
        return fragment;
    }

    @Override // android.support.v4.app.k
    public List c() {
        return this.f;
    }

    @Override // android.support.v4.app.k
    public Fragment.SavedState a(Fragment fragment) {
        Bundle g;
        if (fragment.p < 0) {
            a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.k <= 0 || (g = g(fragment)) == null) {
            return null;
        }
        return new Fragment.SavedState(g);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ItemInfo.APP_INTENT);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.q != null) {
            android.support.v4.f.c.a(this.q, sb);
        } else {
            android.support.v4.f.c.a(this.o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        int size6;
        String str2 = String.valueOf(str) + "    ";
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
                d dVar = (d) this.i.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(dVar.toString());
                dVar.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.k != null && (size2 = this.k.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj = (d) this.k.get(i5);
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

    static Animation a(Context context, float f, float f2, float f3, float f4) {
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

    static Animation a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(A);
        alphaAnimation.setDuration(220L);
        return alphaAnimation;
    }

    Animation a(Fragment fragment, int i, boolean z2, int i2) {
        int b2;
        Animation loadAnimation;
        Animation a2 = fragment.a(i, z2, fragment.Q);
        if (a2 == null) {
            if (fragment.Q == 0 || (loadAnimation = AnimationUtils.loadAnimation(this.o, fragment.Q)) == null) {
                if (i != 0 && (b2 = b(i, z2)) >= 0) {
                    switch (b2) {
                        case 1:
                            return a(this.o, 1.125f, 1.0f, 0.0f, 1.0f);
                        case 2:
                            return a(this.o, 1.0f, 0.975f, 1.0f, 0.0f);
                        case 3:
                            return a(this.o, 0.975f, 1.0f, 0.0f, 1.0f);
                        case 4:
                            return a(this.o, 1.0f, 1.075f, 1.0f, 0.0f);
                        case 5:
                            return a(this.o, 0.0f, 1.0f);
                        case 6:
                            return a(this.o, 1.0f, 0.0f);
                        default:
                            if (i2 == 0 && this.o.getWindow() != null) {
                                i2 = this.o.getWindow().getAttributes().windowAnimations;
                            }
                            return i2 == 0 ? null : null;
                    }
                }
                return null;
            }
            return loadAnimation;
        }
        return a2;
    }

    public void b(Fragment fragment) {
        if (fragment.U) {
            if (this.e) {
                this.v = true;
            } else {
                fragment.U = false;
                a(fragment, this.n, 0, 0, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045 A[FALL_THROUGH, PHI: r12
      0x0045: PHI (r12v6 int) = 
      (r12v4 int)
      (r12v4 int)
      (r12v4 int)
      (r12v4 int)
      (r12v4 int)
      (r12v4 int)
      (r12v5 int)
      (r12v4 int)
      (r12v7 int)
      (r12v7 int)
     binds: [B:116:0x024f, B:118:0x0253, B:119:0x0258, B:138:0x0378, B:142:0x0383, B:141:0x037e, B:127:0x026d, B:28:0x0042, B:110:0x020d, B:114:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void a(final Fragment fragment, int i, int i2, int i3, boolean z2) {
        ViewGroup viewGroup;
        if ((!fragment.v || fragment.K) && i > 1) {
            i = 1;
        }
        if (fragment.w && i > fragment.k) {
            i = fragment.k;
        }
        if (fragment.U && fragment.k < 4 && i > 3) {
            i = 3;
        }
        if (fragment.k < i) {
            if (!fragment.y || fragment.z) {
                if (fragment.l != null) {
                    fragment.l = null;
                    a(fragment, fragment.m, 0, 0, true);
                }
                switch (fragment.k) {
                    case 0:
                        if (a) {
                            Log.v("FragmentManager", "moveto CREATED: " + fragment);
                        }
                        if (fragment.n != null) {
                            fragment.n.setClassLoader(this.o.getClassLoader());
                            fragment.o = fragment.n.getSparseParcelableArray("android:view_state");
                            fragment.s = a(fragment.n, "android:target_state");
                            if (fragment.s != null) {
                                fragment.u = fragment.n.getInt("android:target_req_state", 0);
                            }
                            fragment.V = fragment.n.getBoolean("android:user_visible_hint", true);
                            if (!fragment.V) {
                                fragment.U = true;
                                if (i > 3) {
                                    i = 3;
                                }
                            }
                        }
                        fragment.D = this.o;
                        fragment.F = this.q;
                        fragment.C = this.q != null ? this.q.E : this.o.b;
                        fragment.P = false;
                        fragment.a(this.o);
                        if (!fragment.P) {
                            throw new br("Fragment " + fragment + " did not call through to super.onAttach()");
                        }
                        if (fragment.F == null) {
                            this.o.a(fragment);
                        }
                        if (!fragment.M) {
                            fragment.i(fragment.n);
                        }
                        fragment.M = false;
                        if (fragment.y) {
                            fragment.S = fragment.b(fragment.b(fragment.n), null, fragment.n);
                            if (fragment.S != null) {
                                fragment.T = fragment.S;
                                if (Build.VERSION.SDK_INT >= 11) {
                                    android.support.v4.view.ak.a(fragment.S, false);
                                } else {
                                    fragment.S = z.a(fragment.S);
                                }
                                if (fragment.J) {
                                    fragment.S.setVisibility(8);
                                }
                                fragment.a(fragment.S, fragment.n);
                            } else {
                                fragment.T = null;
                            }
                        }
                    case 1:
                        if (i > 1) {
                            if (a) {
                                Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
                            }
                            if (!fragment.y) {
                                if (fragment.H != 0) {
                                    viewGroup = (ViewGroup) this.p.a(fragment.H);
                                    if (viewGroup == null && !fragment.A) {
                                        a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.H) + " (" + fragment.j().getResourceName(fragment.H) + ") for fragment " + fragment));
                                    }
                                } else {
                                    viewGroup = null;
                                }
                                fragment.R = viewGroup;
                                fragment.S = fragment.b(fragment.b(fragment.n), viewGroup, fragment.n);
                                if (fragment.S != null) {
                                    fragment.T = fragment.S;
                                    if (Build.VERSION.SDK_INT >= 11) {
                                        android.support.v4.view.ak.a(fragment.S, false);
                                    } else {
                                        fragment.S = z.a(fragment.S);
                                    }
                                    if (viewGroup != null) {
                                        Animation a2 = a(fragment, i2, true, i3);
                                        if (a2 != null) {
                                            fragment.S.startAnimation(a2);
                                        }
                                        viewGroup.addView(fragment.S);
                                    }
                                    if (fragment.J) {
                                        fragment.S.setVisibility(8);
                                    }
                                    fragment.a(fragment.S, fragment.n);
                                } else {
                                    fragment.T = null;
                                }
                            }
                            fragment.j(fragment.n);
                            if (fragment.S != null) {
                                fragment.f(fragment.n);
                            }
                            fragment.n = null;
                        }
                        break;
                    case 2:
                    case 3:
                        if (i > 3) {
                            if (a) {
                                Log.v("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.D();
                        }
                    case 4:
                        if (i > 4) {
                            if (a) {
                                Log.v("FragmentManager", "moveto RESUMED: " + fragment);
                            }
                            fragment.x = true;
                            fragment.E();
                            fragment.n = null;
                            fragment.o = null;
                        }
                    default:
                        fragment.k = i;
                }
            } else {
                return;
            }
        } else if (fragment.k > i) {
            switch (fragment.k) {
                case 5:
                    if (i < 5) {
                        if (a) {
                            Log.v("FragmentManager", "movefrom RESUMED: " + fragment);
                        }
                        fragment.G();
                        fragment.x = false;
                    }
                case 4:
                    if (i < 4) {
                        if (a) {
                            Log.v("FragmentManager", "movefrom STARTED: " + fragment);
                        }
                        fragment.H();
                    }
                case 3:
                    if (i < 3) {
                        if (a) {
                            Log.v("FragmentManager", "movefrom STOPPED: " + fragment);
                        }
                        fragment.I();
                    }
                case 2:
                    if (i < 2) {
                        if (a) {
                            Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                        }
                        if (fragment.S != null && !this.o.isFinishing() && fragment.o == null) {
                            f(fragment);
                        }
                        fragment.J();
                        if (fragment.S != null && fragment.R != null) {
                            Animation a3 = (this.n <= 0 || this.t) ? null : a(fragment, i2, false, i3);
                            if (a3 != null) {
                                fragment.l = fragment.S;
                                fragment.m = i;
                                a3.setAnimationListener(new Animation.AnimationListener() { // from class: android.support.v4.app.m.3
                                    @Override // android.view.animation.Animation.AnimationListener
                                    public void onAnimationEnd(Animation animation) {
                                        if (fragment.l != null) {
                                            fragment.l = null;
                                            m.this.a(fragment, fragment.m, 0, 0, false);
                                        }
                                    }

                                    @Override // android.view.animation.Animation.AnimationListener
                                    public void onAnimationRepeat(Animation animation) {
                                    }

                                    @Override // android.view.animation.Animation.AnimationListener
                                    public void onAnimationStart(Animation animation) {
                                    }
                                });
                                fragment.S.startAnimation(a3);
                            }
                            fragment.R.removeView(fragment.S);
                        }
                        fragment.R = null;
                        fragment.S = null;
                        fragment.T = null;
                    }
                    break;
                case 1:
                    if (i < 1) {
                        if (this.t && fragment.l != null) {
                            View view = fragment.l;
                            fragment.l = null;
                            view.clearAnimation();
                        }
                        if (fragment.l != null) {
                            fragment.m = i;
                            i = 1;
                        } else {
                            if (a) {
                                Log.v("FragmentManager", "movefrom CREATED: " + fragment);
                            }
                            if (!fragment.M) {
                                fragment.K();
                            }
                            fragment.P = false;
                            fragment.c();
                            if (!fragment.P) {
                                throw new br("Fragment " + fragment + " did not call through to super.onDetach()");
                            }
                            if (!z2) {
                                if (!fragment.M) {
                                    e(fragment);
                                } else {
                                    fragment.D = null;
                                    fragment.F = null;
                                    fragment.C = null;
                                    fragment.E = null;
                                }
                            }
                        }
                    }
                    break;
            }
        }
        fragment.k = i;
    }

    void c(Fragment fragment) {
        a(fragment, this.n, 0, 0, false);
    }

    void a(int i, boolean z2) {
        a(i, 0, 0, z2);
    }

    void a(int i, int i2, int i3, boolean z2) {
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
                        if (fragment.W != null) {
                            z3 |= fragment.W.a();
                        }
                    }
                    i4++;
                    z3 = z3;
                }
                if (!z3) {
                    e();
                }
                if (this.r && this.o != null && this.n == 5) {
                    this.o.d();
                    this.r = false;
                }
            }
        }
    }

    void e() {
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

    void d(Fragment fragment) {
        if (fragment.p < 0) {
            if (this.h == null || this.h.size() <= 0) {
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                fragment.a(this.f.size(), this.q);
                this.f.add(fragment);
            } else {
                fragment.a(((Integer) this.h.remove(this.h.size() - 1)).intValue(), this.q);
                this.f.set(fragment.p, fragment);
            }
            if (a) {
                Log.v("FragmentManager", "Allocated fragment index " + fragment);
            }
        }
    }

    void e(Fragment fragment) {
        if (fragment.p >= 0) {
            if (a) {
                Log.v("FragmentManager", "Freeing fragment index " + fragment);
            }
            this.f.set(fragment.p, null);
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add(Integer.valueOf(fragment.p));
            this.o.a(fragment.q);
            fragment.s();
        }
    }

    public void a(Fragment fragment, boolean z2) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (a) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        d(fragment);
        if (!fragment.K) {
            if (this.g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            this.g.add(fragment);
            fragment.v = true;
            fragment.w = false;
            if (fragment.N && fragment.O) {
                this.r = true;
            }
            if (z2) {
                c(fragment);
            }
        }
    }

    public void a(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.B);
        }
        boolean z2 = !fragment.g();
        if (!fragment.K || z2) {
            if (this.g != null) {
                this.g.remove(fragment);
            }
            if (fragment.N && fragment.O) {
                this.r = true;
            }
            fragment.v = false;
            fragment.w = true;
            a(fragment, z2 ? 0 : 1, i, i2, false);
        }
    }

    public void b(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.J) {
            fragment.J = true;
            if (fragment.S != null) {
                Animation a2 = a(fragment, i, false, i2);
                if (a2 != null) {
                    fragment.S.startAnimation(a2);
                }
                fragment.S.setVisibility(8);
            }
            if (fragment.v && fragment.N && fragment.O) {
                this.r = true;
            }
            fragment.b(true);
        }
    }

    public void c(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.J) {
            fragment.J = false;
            if (fragment.S != null) {
                Animation a2 = a(fragment, i, true, i2);
                if (a2 != null) {
                    fragment.S.startAnimation(a2);
                }
                fragment.S.setVisibility(0);
            }
            if (fragment.v && fragment.N && fragment.O) {
                this.r = true;
            }
            fragment.b(false);
        }
    }

    public void d(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.K) {
            fragment.K = true;
            if (fragment.v) {
                if (this.g != null) {
                    if (a) {
                        Log.v("FragmentManager", "remove from detach: " + fragment);
                    }
                    this.g.remove(fragment);
                }
                if (fragment.N && fragment.O) {
                    this.r = true;
                }
                fragment.v = false;
                a(fragment, 1, i, i2, false);
            }
        }
    }

    public void e(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.K) {
            fragment.K = false;
            if (!fragment.v) {
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
                fragment.v = true;
                if (fragment.N && fragment.O) {
                    this.r = true;
                }
                a(fragment, this.n, i, i2, false);
            }
        }
    }

    public Fragment a(int i) {
        if (this.g != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.g.get(size);
                if (fragment != null && fragment.G == i) {
                    return fragment;
                }
            }
        }
        if (this.f != null) {
            for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f.get(size2);
                if (fragment2 != null && fragment2.G == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    @Override // android.support.v4.app.k
    public Fragment a(String str) {
        if (this.g != null && str != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.g.get(size);
                if (fragment != null && str.equals(fragment.I)) {
                    return fragment;
                }
            }
        }
        if (this.f != null && str != null) {
            for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f.get(size2);
                if (fragment2 != null && str.equals(fragment2.I)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void v() {
        if (this.s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.u);
        }
    }

    public void a(Runnable runnable, boolean z2) {
        if (!z2) {
            v();
        }
        synchronized (this) {
            if (this.t || this.o == null) {
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

    public int a(d dVar) {
        int size;
        synchronized (this) {
            if (this.l == null || this.l.size() <= 0) {
                if (this.k == null) {
                    this.k = new ArrayList();
                }
                size = this.k.size();
                if (a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + dVar);
                }
                this.k.add(dVar);
            } else {
                size = ((Integer) this.l.remove(this.l.size() - 1)).intValue();
                if (a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + dVar);
                }
                this.k.set(size, dVar);
            }
        }
        return size;
    }

    public void a(int i, d dVar) {
        synchronized (this) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            int size = this.k.size();
            if (i < size) {
                if (a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + dVar);
                }
                this.k.set(i, dVar);
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
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + dVar);
                }
                this.k.add(dVar);
            }
        }
    }

    public void b(int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r6.e = true;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r1 < r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        r6.d[r1].run();
        r6.d[r1] = null;
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f() {
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
                if (fragment != null && fragment.W != null) {
                    z3 |= fragment.W.a();
                }
            }
            if (!z3) {
                this.v = false;
                e();
            }
        }
        return z2;
    }

    void g() {
        if (this.m != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.m.size()) {
                    ((l) this.m.get(i2)).a();
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    void b(d dVar) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(dVar);
        g();
    }

    boolean a(Handler handler, String str, int i, int i2) {
        int size;
        if (this.i == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size2 = this.i.size() - 1;
            if (size2 < 0) {
                return false;
            }
            d dVar = (d) this.i.remove(size2);
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            dVar.a(sparseArray, sparseArray2);
            dVar.a(true, (f) null, sparseArray, sparseArray2);
            g();
        } else {
            if (str == null && i < 0) {
                size = -1;
            } else {
                size = this.i.size() - 1;
                while (size >= 0) {
                    d dVar2 = (d) this.i.get(size);
                    if ((str != null && str.equals(dVar2.c())) || (i >= 0 && i == dVar2.o)) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size--;
                    while (size >= 0) {
                        d dVar3 = (d) this.i.get(size);
                        if ((str == null || !str.equals(dVar3.c())) && (i < 0 || i != dVar3.o)) {
                            break;
                        }
                        size--;
                    }
                }
            }
            if (size == this.i.size() - 1) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int size3 = this.i.size() - 1; size3 > size; size3--) {
                arrayList.add((d) this.i.remove(size3));
            }
            int size4 = arrayList.size() - 1;
            SparseArray sparseArray3 = new SparseArray();
            SparseArray sparseArray4 = new SparseArray();
            for (int i3 = 0; i3 <= size4; i3++) {
                ((d) arrayList.get(i3)).a(sparseArray3, sparseArray4);
            }
            f fVar = null;
            int i4 = 0;
            while (i4 <= size4) {
                if (a) {
                    Log.v("FragmentManager", "Popping back stack state: " + arrayList.get(i4));
                }
                i4++;
                fVar = ((d) arrayList.get(i4)).a(i4 == size4, fVar, sparseArray3, sparseArray4);
            }
            g();
        }
        return true;
    }

    ArrayList h() {
        ArrayList arrayList = null;
        if (this.f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f.size()) {
                    break;
                }
                Fragment fragment = (Fragment) this.f.get(i2);
                if (fragment != null && fragment.L) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                    fragment.M = true;
                    fragment.t = fragment.s != null ? fragment.s.p : -1;
                    if (a) {
                        Log.v("FragmentManager", "retainNonConfig: keeping retained " + fragment);
                    }
                }
                i = i2 + 1;
            }
        }
        return arrayList;
    }

    void f(Fragment fragment) {
        if (fragment.T != null) {
            if (this.x == null) {
                this.x = new SparseArray();
            } else {
                this.x.clear();
            }
            fragment.T.saveHierarchyState(this.x);
            if (this.x.size() > 0) {
                fragment.o = this.x;
                this.x = null;
            }
        }
    }

    Bundle g(Fragment fragment) {
        Bundle bundle;
        if (this.w == null) {
            this.w = new Bundle();
        }
        fragment.k(this.w);
        if (this.w.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.w;
            this.w = null;
        }
        if (fragment.S != null) {
            f(fragment);
        }
        if (fragment.o != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.o);
        }
        if (!fragment.V) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.V);
        }
        return bundle;
    }

    Parcelable i() {
        int[] iArr;
        int size;
        int size2;
        boolean z2;
        BackStackState[] backStackStateArr = null;
        f();
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
                if (fragment.p < 0) {
                    a(new IllegalStateException("Failure saving state: active " + fragment + " has cleared index: " + fragment.p));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i] = fragmentState;
                if (fragment.k > 0 && fragmentState.j == null) {
                    fragmentState.j = g(fragment);
                    if (fragment.s != null) {
                        if (fragment.s.p < 0) {
                            a(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.s));
                        }
                        if (fragmentState.j == null) {
                            fragmentState.j = new Bundle();
                        }
                        a(fragmentState.j, "android:target_state", fragment.s);
                        if (fragment.u != 0) {
                            fragmentState.j.putInt("android:target_req_state", fragment.u);
                        }
                    }
                } else {
                    fragmentState.j = fragment.n;
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
                iArr[i2] = ((Fragment) this.g.get(i2)).p;
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
                backStackStateArr[i3] = new BackStackState(this, (d) this.i.get(i3));
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

    void a(Parcelable parcelable, ArrayList arrayList) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.a != null) {
                if (arrayList != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        Fragment fragment = (Fragment) arrayList.get(i);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                        }
                        FragmentState fragmentState = fragmentManagerState.a[fragment.p];
                        fragmentState.k = fragment;
                        fragment.o = null;
                        fragment.B = 0;
                        fragment.z = false;
                        fragment.v = false;
                        fragment.s = null;
                        if (fragmentState.j != null) {
                            fragmentState.j.setClassLoader(this.o.getClassLoader());
                            fragment.o = fragmentState.j.getSparseParcelableArray("android:view_state");
                            fragment.n = fragmentState.j;
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
                        if (fragment2.t >= 0) {
                            if (fragment2.t < this.f.size()) {
                                fragment2.s = (Fragment) this.f.get(fragment2.t);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + fragment2 + " target no longer exists: " + fragment2.t);
                                fragment2.s = null;
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
                        fragment3.v = true;
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
                        d a3 = fragmentManagerState.c[i5].a(this);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i5 + " (index " + a3.o + "): " + a3);
                            a3.a("  ", new PrintWriter(new android.support.v4.f.d("FragmentManager")), false);
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

    public void a(FragmentActivity fragmentActivity, j jVar, Fragment fragment) {
        if (this.o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.o = fragmentActivity;
        this.p = jVar;
        this.q = fragment;
    }

    public void j() {
        this.s = false;
    }

    public void k() {
        this.s = false;
        a(1, false);
    }

    public void l() {
        this.s = false;
        a(2, false);
    }

    public void m() {
        this.s = false;
        a(4, false);
    }

    public void n() {
        this.s = false;
        a(5, false);
    }

    public void o() {
        a(4, false);
    }

    public void p() {
        this.s = true;
        a(3, false);
    }

    public void q() {
        a(2, false);
    }

    public void r() {
        a(1, false);
    }

    public void s() {
        this.t = true;
        f();
        a(0, false);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public void a(Configuration configuration) {
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

    public void t() {
        if (this.g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.g.size()) {
                    Fragment fragment = (Fragment) this.g.get(i2);
                    if (fragment != null) {
                        fragment.F();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        boolean z2;
        ArrayList arrayList = null;
        if (this.g != null) {
            int i = 0;
            z2 = false;
            while (i < this.g.size()) {
                Fragment fragment = (Fragment) this.g.get(i);
                if (fragment != null && fragment.b(menu, menuInflater)) {
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
                    fragment2.t();
                }
            }
        }
        this.j = arrayList;
        return z2;
    }

    public boolean a(Menu menu) {
        if (this.g == null) {
            return false;
        }
        boolean z2 = false;
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = (Fragment) this.g.get(i);
            if (fragment != null && fragment.c(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public boolean a(MenuItem menuItem) {
        if (this.g == null) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = (Fragment) this.g.get(i);
            if (fragment != null && fragment.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean b(MenuItem menuItem) {
        if (this.g == null) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = (Fragment) this.g.get(i);
            if (fragment != null && fragment.d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void b(Menu menu) {
        if (this.g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.g.size()) {
                    Fragment fragment = (Fragment) this.g.get(i2);
                    if (fragment != null) {
                        fragment.d(menu);
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
            case ThemeElementType.TYPE_WIDGET_RESIZE /* 4097 */:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return ThemeElementType.TYPE_WIDGET_RESIZE;
            default:
                return 0;
        }
    }

    public static int b(int i, boolean z2) {
        switch (i) {
            case ThemeElementType.TYPE_WIDGET_RESIZE /* 4097 */:
                return z2 ? 1 : 2;
            case 4099:
                return z2 ? 5 : 6;
            case 8194:
                return z2 ? 3 : 4;
            default:
                return -1;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        View view = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.a);
        String string = attributeValue == null ? obtainStyledAttributes.getString(0) : attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.b(this.o, string)) {
            return null;
        }
        int id = 0 != 0 ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(String.valueOf(attributeSet.getPositionDescription()) + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        Fragment a2 = resourceId != -1 ? a(resourceId) : null;
        if (a2 == null && string2 != null) {
            a2 = a(string2);
        }
        if (a2 == null && id != -1) {
            a2 = a(id);
        }
        if (a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + a2);
        }
        if (a2 == null) {
            Fragment a3 = Fragment.a(context, string);
            a3.y = true;
            a3.G = resourceId != 0 ? resourceId : id;
            a3.H = id;
            a3.I = string2;
            a3.z = true;
            a3.C = this;
            a3.a(this.o, attributeSet, a3.n);
            a(a3, true);
            fragment = a3;
        } else {
            if (a2.z) {
                throw new IllegalArgumentException(String.valueOf(attributeSet.getPositionDescription()) + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
            }
            a2.z = true;
            if (!a2.M) {
                a2.a(this.o, attributeSet, a2.n);
            }
            fragment = a2;
        }
        if (this.n < 1 && fragment.y) {
            a(fragment, 1, 0, 0, false);
        } else {
            c(fragment);
        }
        if (fragment.S == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            fragment.S.setId(resourceId);
        }
        if (fragment.S.getTag() == null) {
            fragment.S.setTag(string2);
        }
        return fragment.S;
    }

    LayoutInflater.Factory u() {
        return this;
    }
}
