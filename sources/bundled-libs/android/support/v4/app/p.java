package android.support.v4.app;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.g;
import android.support.v4.app.o;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
final class p extends o implements android.support.v4.view.n {
    static final Interpolator A;
    static final Interpolator B;
    static final Interpolator C;
    static final Interpolator D;
    static boolean a = false;
    static final boolean b;
    static Field r;
    ArrayList<Runnable> c;
    Runnable[] d;
    boolean e;
    ArrayList<Fragment> f;
    ArrayList<Fragment> g;
    ArrayList<Integer> h;
    ArrayList<g> i;
    ArrayList<Fragment> j;
    ArrayList<g> k;
    ArrayList<Integer> l;
    ArrayList<o.a> m;
    n o;
    l p;
    Fragment q;
    boolean s;
    boolean t;
    boolean u;
    String v;
    boolean w;
    int n = 0;
    Bundle x = null;
    SparseArray<Parcelable> y = null;
    Runnable z = new Runnable() { // from class: android.support.v4.app.p.1
        @Override // java.lang.Runnable
        public void run() {
            p.this.f();
        }
    };

    static class b {
        public static final int[] a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    p() {
    }

    static {
        b = Build.VERSION.SDK_INT >= 11;
        r = null;
        A = new DecelerateInterpolator(2.5f);
        B = new DecelerateInterpolator(1.5f);
        C = new AccelerateInterpolator(2.5f);
        D = new AccelerateInterpolator(1.5f);
    }

    static class a implements Animation.AnimationListener {
        private Animation.AnimationListener a;
        private boolean b;
        private View c;

        public a(View view, Animation animation) {
            this.a = null;
            this.b = false;
            this.c = null;
            if (view != null && animation != null) {
                this.c = view;
            }
        }

        public a(View view, Animation animation, Animation.AnimationListener animationListener) {
            this.a = null;
            this.b = false;
            this.c = null;
            if (view != null && animation != null) {
                this.a = animationListener;
                this.c = view;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.c != null) {
                this.b = p.a(this.c, animation);
                if (this.b) {
                    this.c.post(new Runnable() { // from class: android.support.v4.app.p.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ai.a(a.this.c, 2, (Paint) null);
                        }
                    });
                }
            }
            if (this.a != null) {
                this.a.onAnimationStart(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.c != null && this.b) {
                this.c.post(new Runnable() { // from class: android.support.v4.app.p.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ai.a(a.this.c, 0, (Paint) null);
                    }
                });
            }
            if (this.a != null) {
                this.a.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            if (this.a != null) {
                this.a.onAnimationRepeat(animation);
            }
        }
    }

    static boolean a(Animation animation) {
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return false;
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    static boolean a(View view, Animation animation) {
        return Build.VERSION.SDK_INT >= 19 && ai.d(view) == 0 && ai.s(view) && a(animation);
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new android.support.v4.d.d("FragmentManager"));
        if (this.o != null) {
            try {
                this.o.a("  ", (FileDescriptor) null, printWriter, new String[0]);
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

    @Override // android.support.v4.app.o
    public s a() {
        return new g(this);
    }

    @Override // android.support.v4.app.o
    public boolean b() {
        return f();
    }

    @Override // android.support.v4.app.o
    public boolean c() {
        v();
        b();
        return a(this.o.h(), (String) null, -1, 0);
    }

    @Override // android.support.v4.app.o
    public void a(final int i, final int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        a(new Runnable() { // from class: android.support.v4.app.p.2
            @Override // java.lang.Runnable
            public void run() {
                p.this.a(p.this.o.h(), (String) null, i, i2);
            }
        }, false);
    }

    @Override // android.support.v4.app.o
    public void a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.p < 0) {
            a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.p);
    }

    @Override // android.support.v4.app.o
    public Fragment a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f.size()) {
            a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        Fragment fragment = this.f.get(i);
        if (fragment == null) {
            a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
            return fragment;
        }
        return fragment;
    }

    @Override // android.support.v4.app.o
    public List<Fragment> d() {
        return this.f;
    }

    @Override // android.support.v4.app.o
    public Fragment.SavedState a(Fragment fragment) {
        Bundle bundleG;
        if (fragment.p < 0) {
            a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.k <= 0 || (bundleG = g(fragment)) == null) {
            return null;
        }
        return new Fragment.SavedState(bundleG);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ItemInfo.APP_INTENT);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.q != null) {
            android.support.v4.d.c.a(this.q, sb);
        } else {
            android.support.v4.d.c.a(this.o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // android.support.v4.app.o
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
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
                Fragment fragment = this.f.get(i);
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
                Fragment fragment2 = this.g.get(i2);
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
                Fragment fragment3 = this.j.get(i3);
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
                g gVar = this.i.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(gVar.toString());
                gVar.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.k != null && (size2 = this.k.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj = (g) this.k.get(i5);
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
        printWriter.print("  mHost=");
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
        printWriter.print(this.t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.u);
        if (this.s) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.s);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.v);
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
        scaleAnimation.setInterpolator(A);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(B);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    static Animation a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(B);
        alphaAnimation.setDuration(220L);
        return alphaAnimation;
    }

    Animation a(Fragment fragment, int i, boolean z, int i2) {
        int iB;
        Animation animationLoadAnimation;
        Animation animationA = fragment.a(i, z, fragment.P);
        if (animationA == null) {
            if (fragment.P == 0 || (animationLoadAnimation = AnimationUtils.loadAnimation(this.o.g(), fragment.P)) == null) {
                if (i != 0 && (iB = b(i, z)) >= 0) {
                    switch (iB) {
                        case 1:
                            return a(this.o.g(), 1.125f, 1.0f, 0.0f, 1.0f);
                        case 2:
                            return a(this.o.g(), 1.0f, 0.975f, 1.0f, 0.0f);
                        case 3:
                            return a(this.o.g(), 0.975f, 1.0f, 0.0f, 1.0f);
                        case 4:
                            return a(this.o.g(), 1.0f, 1.075f, 1.0f, 0.0f);
                        case 5:
                            return a(this.o.g(), 0.0f, 1.0f);
                        case 6:
                            return a(this.o.g(), 1.0f, 0.0f);
                        default:
                            if (i2 == 0 && this.o.d()) {
                                i2 = this.o.e();
                            }
                            return i2 == 0 ? null : null;
                    }
                }
                return null;
            }
            return animationLoadAnimation;
        }
        return animationA;
    }

    public void b(Fragment fragment) {
        if (fragment.T) {
            if (this.e) {
                this.w = true;
            } else {
                fragment.T = false;
                a(fragment, this.n, 0, 0, false);
            }
        }
    }

    private void b(View view, Animation animation) {
        Animation.AnimationListener animationListener;
        if (view != null && animation != null && a(view, animation)) {
            try {
                if (r == null) {
                    r = Animation.class.getDeclaredField("mListener");
                    r.setAccessible(true);
                }
                animationListener = (Animation.AnimationListener) r.get(animation);
            } catch (IllegalAccessException e) {
                Log.e("FragmentManager", "Cannot access Animation's mListener field", e);
                animationListener = null;
            } catch (NoSuchFieldException e2) {
                Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e2);
                animationListener = null;
            }
            animation.setAnimationListener(new a(view, animation, animationListener));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045 A[FALL_THROUGH, PHI: r12
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
 binds: [B:118:0x02ac, B:120:0x02b0, B:122:0x02b5, B:183:0x03f0, B:187:0x03fb, B:186:0x03f6, B:130:0x02ca, B:30:0x0042, B:108:0x0268, B:112:0x0286] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(final android.support.v4.app.Fragment r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.p.a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    void c(Fragment fragment) {
        a(fragment, this.n, 0, 0, false);
    }

    void a(int i, boolean z) {
        a(i, 0, 0, z);
    }

    void a(int i, int i2, int i3, boolean z) {
        if (this.o == null && i != 0) {
            throw new IllegalStateException("No host");
        }
        if (z || this.n != i) {
            this.n = i;
            if (this.f != null) {
                int i4 = 0;
                boolean zA = false;
                while (i4 < this.f.size()) {
                    Fragment fragment = this.f.get(i4);
                    if (fragment != null) {
                        a(fragment, i, i2, i3, false);
                        if (fragment.V != null) {
                            zA |= fragment.V.a();
                        }
                    }
                    i4++;
                    zA = zA;
                }
                if (!zA) {
                    e();
                }
                if (this.s && this.o != null && this.n == 5) {
                    this.o.c();
                    this.s = false;
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
                    Fragment fragment = this.f.get(i2);
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
                    this.f = new ArrayList<>();
                }
                fragment.a(this.f.size(), this.q);
                this.f.add(fragment);
            } else {
                fragment.a(this.h.remove(this.h.size() - 1).intValue(), this.q);
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
                this.h = new ArrayList<>();
            }
            this.h.add(Integer.valueOf(fragment.p));
            this.o.a(fragment.q);
            fragment.t();
        }
    }

    public void a(Fragment fragment, boolean z) {
        if (this.g == null) {
            this.g = new ArrayList<>();
        }
        if (a) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        d(fragment);
        if (!fragment.J) {
            if (this.g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            this.g.add(fragment);
            fragment.v = true;
            fragment.w = false;
            if (fragment.M && fragment.N) {
                this.s = true;
            }
            if (z) {
                c(fragment);
            }
        }
    }

    public void a(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.A);
        }
        boolean z = !fragment.g();
        if (!fragment.J || z) {
            if (this.g != null) {
                this.g.remove(fragment);
            }
            if (fragment.M && fragment.N) {
                this.s = true;
            }
            fragment.v = false;
            fragment.w = true;
            a(fragment, z ? 0 : 1, i, i2, false);
        }
    }

    public void b(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.I) {
            fragment.I = true;
            if (fragment.R != null) {
                Animation animationA = a(fragment, i, false, i2);
                if (animationA != null) {
                    b(fragment.R, animationA);
                    fragment.R.startAnimation(animationA);
                }
                fragment.R.setVisibility(8);
            }
            if (fragment.v && fragment.M && fragment.N) {
                this.s = true;
            }
            fragment.b(true);
        }
    }

    public void c(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.I) {
            fragment.I = false;
            if (fragment.R != null) {
                Animation animationA = a(fragment, i, true, i2);
                if (animationA != null) {
                    b(fragment.R, animationA);
                    fragment.R.startAnimation(animationA);
                }
                fragment.R.setVisibility(0);
            }
            if (fragment.v && fragment.M && fragment.N) {
                this.s = true;
            }
            fragment.b(false);
        }
    }

    public void d(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.J) {
            fragment.J = true;
            if (fragment.v) {
                if (this.g != null) {
                    if (a) {
                        Log.v("FragmentManager", "remove from detach: " + fragment);
                    }
                    this.g.remove(fragment);
                }
                if (fragment.M && fragment.N) {
                    this.s = true;
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
        if (fragment.J) {
            fragment.J = false;
            if (!fragment.v) {
                if (this.g == null) {
                    this.g = new ArrayList<>();
                }
                if (this.g.contains(fragment)) {
                    throw new IllegalStateException("Fragment already added: " + fragment);
                }
                if (a) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                this.g.add(fragment);
                fragment.v = true;
                if (fragment.M && fragment.N) {
                    this.s = true;
                }
                a(fragment, this.n, i, i2, false);
            }
        }
    }

    public Fragment a(int i) {
        if (this.g != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = this.g.get(size);
                if (fragment != null && fragment.F == i) {
                    return fragment;
                }
            }
        }
        if (this.f != null) {
            for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = this.f.get(size2);
                if (fragment2 != null && fragment2.F == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    @Override // android.support.v4.app.o
    public Fragment a(String str) {
        if (this.g != null && str != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = this.g.get(size);
                if (fragment != null && str.equals(fragment.H)) {
                    return fragment;
                }
            }
        }
        if (this.f != null && str != null) {
            for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = this.f.get(size2);
                if (fragment2 != null && str.equals(fragment2.H)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public Fragment b(String str) {
        Fragment fragmentA;
        if (this.f != null && str != null) {
            for (int size = this.f.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f.get(size);
                if (fragment != null && (fragmentA = fragment.a(str)) != null) {
                    return fragmentA;
                }
            }
        }
        return null;
    }

    private void v() {
        if (this.t) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.v != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.v);
        }
    }

    public void a(Runnable runnable, boolean z) {
        if (!z) {
            v();
        }
        synchronized (this) {
            if (this.u || this.o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.c == null) {
                this.c = new ArrayList<>();
            }
            this.c.add(runnable);
            if (this.c.size() == 1) {
                this.o.h().removeCallbacks(this.z);
                this.o.h().post(this.z);
            }
        }
    }

    public int a(g gVar) {
        int size;
        synchronized (this) {
            if (this.l == null || this.l.size() <= 0) {
                if (this.k == null) {
                    this.k = new ArrayList<>();
                }
                size = this.k.size();
                if (a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + gVar);
                }
                this.k.add(gVar);
            } else {
                size = this.l.remove(this.l.size() - 1).intValue();
                if (a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + gVar);
                }
                this.k.set(size, gVar);
            }
        }
        return size;
    }

    public void a(int i, g gVar) {
        synchronized (this) {
            if (this.k == null) {
                this.k = new ArrayList<>();
            }
            int size = this.k.size();
            if (i < size) {
                if (a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + gVar);
                }
                this.k.set(i, gVar);
            } else {
                while (size < i) {
                    this.k.add(null);
                    if (this.l == null) {
                        this.l = new ArrayList<>();
                    }
                    if (a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.l.add(Integer.valueOf(size));
                    size++;
                }
                if (a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + gVar);
                }
                this.k.add(gVar);
            }
        }
    }

    public void b(int i) {
        synchronized (this) {
            this.k.set(i, null);
            if (this.l == null) {
                this.l = new ArrayList<>();
            }
            if (a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.l.add(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        r6.e = true;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        if (r1 >= r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        r6.d[r1].run();
        r6.d[r1] = null;
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f() {
        /*
            r6 = this;
            r0 = 1
            r2 = 0
            boolean r1 = r6.e
            if (r1 == 0) goto Le
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Recursive entry to executePendingTransactions"
            r0.<init>(r1)
            throw r0
        Le:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.support.v4.app.n r3 = r6.o
            android.os.Handler r3 = r3.h()
            android.os.Looper r3 = r3.getLooper()
            if (r1 == r3) goto L26
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be called from main thread of process"
            r0.<init>(r1)
            throw r0
        L26:
            r1 = r2
        L27:
            monitor-enter(r6)
            java.util.ArrayList<java.lang.Runnable> r3 = r6.c     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L34
            java.util.ArrayList<java.lang.Runnable> r3 = r6.c     // Catch: java.lang.Throwable -> L9b
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L9b
            if (r3 != 0) goto L5c
        L34:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r6.w
            if (r0 == 0) goto La9
            r3 = r2
            r4 = r2
        L3b:
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r6.f
            int r0 = r0.size()
            if (r3 >= r0) goto La2
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r6.f
            java.lang.Object r0 = r0.get(r3)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            if (r0 == 0) goto L58
            android.support.v4.app.w r5 = r0.V
            if (r5 == 0) goto L58
            android.support.v4.app.w r0 = r0.V
            boolean r0 = r0.a()
            r4 = r4 | r0
        L58:
            int r0 = r3 + 1
            r3 = r0
            goto L3b
        L5c:
            java.util.ArrayList<java.lang.Runnable> r1 = r6.c     // Catch: java.lang.Throwable -> L9b
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L9b
            java.lang.Runnable[] r1 = r6.d     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L6b
            java.lang.Runnable[] r1 = r6.d     // Catch: java.lang.Throwable -> L9b
            int r1 = r1.length     // Catch: java.lang.Throwable -> L9b
            if (r1 >= r3) goto L6f
        L6b:
            java.lang.Runnable[] r1 = new java.lang.Runnable[r3]     // Catch: java.lang.Throwable -> L9b
            r6.d = r1     // Catch: java.lang.Throwable -> L9b
        L6f:
            java.util.ArrayList<java.lang.Runnable> r1 = r6.c     // Catch: java.lang.Throwable -> L9b
            java.lang.Runnable[] r4 = r6.d     // Catch: java.lang.Throwable -> L9b
            r1.toArray(r4)     // Catch: java.lang.Throwable -> L9b
            java.util.ArrayList<java.lang.Runnable> r1 = r6.c     // Catch: java.lang.Throwable -> L9b
            r1.clear()     // Catch: java.lang.Throwable -> L9b
            android.support.v4.app.n r1 = r6.o     // Catch: java.lang.Throwable -> L9b
            android.os.Handler r1 = r1.h()     // Catch: java.lang.Throwable -> L9b
            java.lang.Runnable r4 = r6.z     // Catch: java.lang.Throwable -> L9b
            r1.removeCallbacks(r4)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9b
            r6.e = r0
            r1 = r2
        L8a:
            if (r1 >= r3) goto L9e
            java.lang.Runnable[] r4 = r6.d
            r4 = r4[r1]
            r4.run()
            java.lang.Runnable[] r4 = r6.d
            r5 = 0
            r4[r1] = r5
            int r1 = r1 + 1
            goto L8a
        L9b:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9b
            throw r0
        L9e:
            r6.e = r2
            r1 = r0
            goto L27
        La2:
            if (r4 != 0) goto La9
            r6.w = r2
            r6.e()
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.p.f():boolean");
    }

    void g() {
        if (this.m != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.m.size()) {
                    this.m.get(i2).a();
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    void b(g gVar) {
        if (this.i == null) {
            this.i = new ArrayList<>();
        }
        this.i.add(gVar);
        g();
    }

    boolean a(Handler handler, String str, int i, int i2) {
        if (this.i == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.i.size() - 1;
            if (size < 0) {
                return false;
            }
            g gVarRemove = this.i.remove(size);
            SparseArray<Fragment> sparseArray = new SparseArray<>();
            SparseArray<Fragment> sparseArray2 = new SparseArray<>();
            gVarRemove.a(sparseArray, sparseArray2);
            gVarRemove.a(true, (g.b) null, sparseArray, sparseArray2);
            g();
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = this.i.size() - 1;
                while (size2 >= 0) {
                    g gVar = this.i.get(size2);
                    if ((str != null && str.equals(gVar.c())) || (i >= 0 && i == gVar.p)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size2--;
                    while (size2 >= 0) {
                        g gVar2 = this.i.get(size2);
                        if ((str == null || !str.equals(gVar2.c())) && (i < 0 || i != gVar2.p)) {
                            break;
                        }
                        size2--;
                    }
                }
                i3 = size2;
            }
            if (i3 == this.i.size() - 1) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int size3 = this.i.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.i.remove(size3));
            }
            int size4 = arrayList.size() - 1;
            SparseArray<Fragment> sparseArray3 = new SparseArray<>();
            SparseArray<Fragment> sparseArray4 = new SparseArray<>();
            for (int i4 = 0; i4 <= size4; i4++) {
                ((g) arrayList.get(i4)).a(sparseArray3, sparseArray4);
            }
            g.b bVarA = null;
            int i5 = 0;
            while (i5 <= size4) {
                if (a) {
                    Log.v("FragmentManager", "Popping back stack state: " + arrayList.get(i5));
                }
                i5++;
                bVarA = ((g) arrayList.get(i5)).a(i5 == size4, bVarA, sparseArray3, sparseArray4);
            }
            g();
        }
        return true;
    }

    ArrayList<Fragment> h() {
        ArrayList<Fragment> arrayList = null;
        if (this.f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f.size()) {
                    break;
                }
                Fragment fragment = this.f.get(i2);
                if (fragment != null && fragment.K) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    fragment.L = true;
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
        if (fragment.S != null) {
            if (this.y == null) {
                this.y = new SparseArray<>();
            } else {
                this.y.clear();
            }
            fragment.S.saveHierarchyState(this.y);
            if (this.y.size() > 0) {
                fragment.o = this.y;
                this.y = null;
            }
        }
    }

    Bundle g(Fragment fragment) {
        Bundle bundle;
        if (this.x == null) {
            this.x = new Bundle();
        }
        fragment.k(this.x);
        if (this.x.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.x;
            this.x = null;
        }
        if (fragment.R != null) {
            f(fragment);
        }
        if (fragment.o != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.o);
        }
        if (!fragment.U) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.U);
        }
        return bundle;
    }

    Parcelable i() {
        int[] iArr;
        int size;
        int size2;
        boolean z;
        BackStackState[] backStackStateArr = null;
        f();
        if (b) {
            this.t = true;
        }
        if (this.f == null || this.f.size() <= 0) {
            return null;
        }
        int size3 = this.f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size3];
        int i = 0;
        boolean z2 = false;
        while (i < size3) {
            Fragment fragment = this.f.get(i);
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
                z = true;
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        if (!z2) {
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
                iArr[i2] = this.g.get(i2).p;
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
                backStackStateArr[i3] = new BackStackState(this.i.get(i3));
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

    void a(Parcelable parcelable, List<Fragment> list) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.a != null) {
                if (list != null) {
                    for (int i = 0; i < list.size(); i++) {
                        Fragment fragment = list.get(i);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                        }
                        FragmentState fragmentState = fragmentManagerState.a[fragment.p];
                        fragmentState.k = fragment;
                        fragment.o = null;
                        fragment.A = 0;
                        fragment.y = false;
                        fragment.v = false;
                        fragment.s = null;
                        if (fragmentState.j != null) {
                            fragmentState.j.setClassLoader(this.o.g().getClassLoader());
                            fragment.o = fragmentState.j.getSparseParcelableArray("android:view_state");
                            fragment.n = fragmentState.j;
                        }
                    }
                }
                this.f = new ArrayList<>(fragmentManagerState.a.length);
                if (this.h != null) {
                    this.h.clear();
                }
                for (int i2 = 0; i2 < fragmentManagerState.a.length; i2++) {
                    FragmentState fragmentState2 = fragmentManagerState.a[i2];
                    if (fragmentState2 != null) {
                        Fragment fragmentA = fragmentState2.a(this.o, this.q);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + fragmentA);
                        }
                        this.f.add(fragmentA);
                        fragmentState2.k = null;
                    } else {
                        this.f.add(null);
                        if (this.h == null) {
                            this.h = new ArrayList<>();
                        }
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + i2);
                        }
                        this.h.add(Integer.valueOf(i2));
                    }
                }
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        Fragment fragment2 = list.get(i3);
                        if (fragment2.t >= 0) {
                            if (fragment2.t < this.f.size()) {
                                fragment2.s = this.f.get(fragment2.t);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + fragment2 + " target no longer exists: " + fragment2.t);
                                fragment2.s = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.b != null) {
                    this.g = new ArrayList<>(fragmentManagerState.b.length);
                    for (int i4 = 0; i4 < fragmentManagerState.b.length; i4++) {
                        Fragment fragment3 = this.f.get(fragmentManagerState.b[i4]);
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
                    this.i = new ArrayList<>(fragmentManagerState.c.length);
                    for (int i5 = 0; i5 < fragmentManagerState.c.length; i5++) {
                        g gVarA = fragmentManagerState.c[i5].a(this);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i5 + " (index " + gVarA.p + "): " + gVarA);
                            gVarA.a("  ", new PrintWriter(new android.support.v4.d.d("FragmentManager")), false);
                        }
                        this.i.add(gVarA);
                        if (gVarA.p >= 0) {
                            a(gVarA.p, gVarA);
                        }
                    }
                    return;
                }
                this.i = null;
            }
        }
    }

    public void a(n nVar, l lVar, Fragment fragment) {
        if (this.o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.o = nVar;
        this.p = lVar;
        this.q = fragment;
    }

    public void j() {
        this.t = false;
    }

    public void k() {
        this.t = false;
        a(1, false);
    }

    public void l() {
        this.t = false;
        a(2, false);
    }

    public void m() {
        this.t = false;
        a(4, false);
    }

    public void n() {
        this.t = false;
        a(5, false);
    }

    public void o() {
        a(4, false);
    }

    public void p() {
        this.t = true;
        a(3, false);
    }

    public void q() {
        a(2, false);
    }

    public void r() {
        a(1, false);
    }

    public void s() {
        this.u = true;
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
                    Fragment fragment = this.g.get(i2);
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
                    Fragment fragment = this.g.get(i2);
                    if (fragment != null) {
                        fragment.G();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        ArrayList<Fragment> arrayList = null;
        if (this.g != null) {
            int i = 0;
            z = false;
            while (i < this.g.size()) {
                Fragment fragment = this.g.get(i);
                if (fragment != null && fragment.b(menu, menuInflater)) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                }
                i++;
                z = z;
            }
        } else {
            z = false;
        }
        if (this.j != null) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                Fragment fragment2 = this.j.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.u();
                }
            }
        }
        this.j = arrayList;
        return z;
    }

    public boolean a(Menu menu) {
        if (this.g == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = this.g.get(i);
            if (fragment != null && fragment.c(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean a(MenuItem menuItem) {
        if (this.g == null) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = this.g.get(i);
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
            Fragment fragment = this.g.get(i);
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
                    Fragment fragment = this.g.get(i2);
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

    public static int b(int i, boolean z) {
        switch (i) {
            case ThemeElementType.TYPE_WIDGET_RESIZE /* 4097 */:
                return z ? 1 : 2;
            case 4099:
                return z ? 5 : 6;
            case 8194:
                return z ? 3 : 4;
            default:
                return -1;
        }
    }

    @Override // android.support.v4.view.n
    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a);
        String string = attributeValue == null ? typedArrayObtainStyledAttributes.getString(0) : attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string2 = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (!Fragment.b(this.o.g(), string)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        Fragment fragmentA = resourceId != -1 ? a(resourceId) : null;
        if (fragmentA == null && string2 != null) {
            fragmentA = a(string2);
        }
        if (fragmentA == null && id != -1) {
            fragmentA = a(id);
        }
        if (a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + fragmentA);
        }
        if (fragmentA == null) {
            Fragment fragmentA2 = Fragment.a(context, string);
            fragmentA2.x = true;
            fragmentA2.F = resourceId != 0 ? resourceId : id;
            fragmentA2.G = id;
            fragmentA2.H = string2;
            fragmentA2.y = true;
            fragmentA2.B = this;
            fragmentA2.C = this.o;
            fragmentA2.a(this.o.g(), attributeSet, fragmentA2.n);
            a(fragmentA2, true);
            fragment = fragmentA2;
        } else {
            if (fragmentA.y) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
            }
            fragmentA.y = true;
            fragmentA.C = this.o;
            if (!fragmentA.L) {
                fragmentA.a(this.o.g(), attributeSet, fragmentA.n);
            }
            fragment = fragmentA;
        }
        if (this.n < 1 && fragment.x) {
            a(fragment, 1, 0, 0, false);
        } else {
            c(fragment);
        }
        if (fragment.R == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            fragment.R.setId(resourceId);
        }
        if (fragment.R.getTag() == null) {
            fragment.R.setTag(string2);
        }
        return fragment.R;
    }

    android.support.v4.view.n u() {
        return this;
    }
}
