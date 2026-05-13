package android.support.p002v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.p002v4.app.AbstractC0094o;
import android.support.p002v4.app.Fragment;
import android.support.p002v4.app.RunnableC0081g;
import android.support.p002v4.p009d.C0163c;
import android.support.p002v4.p009d.C0164d;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.InterfaceC0413n;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.p */
/* loaded from: classes.dex */
public final class C0096p extends AbstractC0094o implements InterfaceC0413n {

    /* renamed from: A */
    static final Interpolator f293A;

    /* renamed from: B */
    static final Interpolator f294B;

    /* renamed from: C */
    static final Interpolator f295C;

    /* renamed from: D */
    static final Interpolator f296D;

    /* renamed from: a */
    static boolean f297a = false;

    /* renamed from: b */
    static final boolean f298b;

    /* renamed from: r */
    static Field f299r;

    /* renamed from: c */
    ArrayList<Runnable> f300c;

    /* renamed from: d */
    Runnable[] f301d;

    /* renamed from: e */
    boolean f302e;

    /* renamed from: f */
    ArrayList<Fragment> f303f;

    /* renamed from: g */
    ArrayList<Fragment> f304g;

    /* renamed from: h */
    ArrayList<Integer> f305h;

    /* renamed from: i */
    ArrayList<RunnableC0081g> f306i;

    /* renamed from: j */
    ArrayList<Fragment> f307j;

    /* renamed from: k */
    ArrayList<RunnableC0081g> f308k;

    /* renamed from: l */
    ArrayList<Integer> f309l;

    /* renamed from: m */
    ArrayList<AbstractC0094o.InterfaceC0095a> f310m;

    /* renamed from: o */
    AbstractC0093n f312o;

    /* renamed from: p */
    AbstractC0091l f313p;

    /* renamed from: q */
    Fragment f314q;

    /* renamed from: s */
    boolean f315s;

    /* renamed from: t */
    boolean f316t;

    /* renamed from: u */
    boolean f317u;

    /* renamed from: v */
    String f318v;

    /* renamed from: w */
    boolean f319w;

    /* renamed from: n */
    int f311n = 0;

    /* renamed from: x */
    Bundle f320x = null;

    /* renamed from: y */
    SparseArray<Parcelable> f321y = null;

    /* renamed from: z */
    Runnable f322z = new Runnable() { // from class: android.support.v4.app.p.1
        @Override // java.lang.Runnable
        public void run() {
            C0096p.this.m13520f();
        }
    };

    /* renamed from: android.support.v4.app.p$b */
    /* loaded from: classes.dex */
    static class C0103b {

        /* renamed from: a */
        public static final int[] f334a = {16842755, 16842960, 16842961};
    }

    static {
        f298b = Build.VERSION.SDK_INT >= 11;
        f299r = null;
        f293A = new DecelerateInterpolator(2.5f);
        f294B = new DecelerateInterpolator(1.5f);
        f295C = new AccelerateInterpolator(2.5f);
        f296D = new AccelerateInterpolator(1.5f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.p$a  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class animationAnimation$AnimationListenerC0100a implements Animation.AnimationListener {

        /* renamed from: a */
        private Animation.AnimationListener f329a;

        /* renamed from: b */
        private boolean f330b;

        /* renamed from: c */
        private View f331c;

        public animationAnimation$AnimationListenerC0100a(View view, Animation animation) {
            this.f329a = null;
            this.f330b = false;
            this.f331c = null;
            if (view != null && animation != null) {
                this.f331c = view;
            }
        }

        public animationAnimation$AnimationListenerC0100a(View view, Animation animation, Animation.AnimationListener animationListener) {
            this.f329a = null;
            this.f330b = false;
            this.f331c = null;
            if (view != null && animation != null) {
                this.f329a = animationListener;
                this.f331c = view;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.f331c != null) {
                this.f330b = C0096p.m13546a(this.f331c, animation);
                if (this.f330b) {
                    this.f331c.post(new Runnable() { // from class: android.support.v4.app.p.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C0309ai.m12926a(animationAnimation$AnimationListenerC0100a.this.f331c, 2, (Paint) null);
                        }
                    });
                }
            }
            if (this.f329a != null) {
                this.f329a.onAnimationStart(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f331c != null && this.f330b) {
                this.f331c.post(new Runnable() { // from class: android.support.v4.app.p.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C0309ai.m12926a(animationAnimation$AnimationListenerC0100a.this.f331c, 0, (Paint) null);
                    }
                });
            }
            if (this.f329a != null) {
                this.f329a.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            if (this.f329a != null) {
                this.f329a.onAnimationRepeat(animation);
            }
        }
    }

    /* renamed from: a */
    static boolean m13545a(Animation animation) {
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (animation instanceof AnimationSet) {
            List<Animation> animations = ((AnimationSet) animation).getAnimations();
            for (int i = 0; i < animations.size(); i++) {
                if (animations.get(i) instanceof AlphaAnimation) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    static boolean m13546a(View view, Animation animation) {
        return Build.VERSION.SDK_INT >= 19 && C0309ai.m12907d(view) == 0 && C0309ai.m12888s(view) && m13545a(animation);
    }

    /* renamed from: a */
    private void m13543a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0164d("FragmentManager"));
        if (this.f312o != null) {
            try {
                this.f312o.mo13588a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo13541a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    @Override // android.support.p002v4.app.AbstractC0094o
    /* renamed from: a */
    public AbstractC0106s mo13569a() {
        return new RunnableC0081g(this);
    }

    @Override // android.support.p002v4.app.AbstractC0094o
    /* renamed from: b */
    public boolean mo13540b() {
        return m13520f();
    }

    @Override // android.support.p002v4.app.AbstractC0094o
    /* renamed from: c */
    public boolean mo13530c() {
        m13502v();
        mo13540b();
        return m13558a(this.f312o.m13577h(), (String) null, -1, 0);
    }

    @Override // android.support.p002v4.app.AbstractC0094o
    /* renamed from: a */
    public void mo13567a(final int i, final int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        m13544a(new Runnable() { // from class: android.support.v4.app.p.2
            @Override // java.lang.Runnable
            public void run() {
                C0096p.this.m13558a(C0096p.this.f312o.m13577h(), (String) null, i, i2);
            }
        }, false);
    }

    @Override // android.support.p002v4.app.AbstractC0094o
    /* renamed from: a */
    public void mo13559a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f158p < 0) {
            m13543a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.f158p);
    }

    @Override // android.support.p002v4.app.AbstractC0094o
    /* renamed from: a */
    public Fragment mo13560a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f303f.size()) {
            m13543a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        Fragment fragment = this.f303f.get(i);
        if (fragment == null) {
            m13543a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
            return fragment;
        }
        return fragment;
    }

    @Override // android.support.p002v4.app.AbstractC0094o
    /* renamed from: d */
    public List<Fragment> mo13526d() {
        return this.f303f;
    }

    @Override // android.support.p002v4.app.AbstractC0094o
    /* renamed from: a */
    public Fragment.SavedState mo13556a(Fragment fragment) {
        Bundle m13517g;
        if (fragment.f158p < 0) {
            m13543a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.f153k <= 0 || (m13517g = m13517g(fragment)) == null) {
            return null;
        }
        return new Fragment.SavedState(m13517g);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) ItemInfo.APP_INTENT);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.f314q != null) {
            C0163c.m13371a(this.f314q, sb);
        } else {
            C0163c.m13371a(this.f312o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // android.support.p002v4.app.AbstractC0094o
    /* renamed from: a */
    public void mo13541a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        int size6;
        String str2 = str + "    ";
        if (this.f303f != null && (size6 = this.f303f.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size6; i++) {
                Fragment fragment = this.f303f.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.m13764a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        if (this.f304g != null && (size5 = this.f304g.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f304g.get(i2).toString());
            }
        }
        if (this.f307j != null && (size4 = this.f307j.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f307j.get(i3).toString());
            }
        }
        if (this.f306i != null && (size3 = this.f306i.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                RunnableC0081g runnableC0081g = this.f306i.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(runnableC0081g.toString());
                runnableC0081g.m13651a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.f308k != null && (size2 = this.f308k.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((RunnableC0081g) this.f308k.get(i5));
                }
            }
            if (this.f309l != null && this.f309l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f309l.toArray()));
            }
        }
        if (this.f300c != null && (size = this.f300c.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println((Runnable) this.f300c.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f312o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f313p);
        if (this.f314q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f314q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f311n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f316t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f317u);
        if (this.f315s) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f315s);
        }
        if (this.f318v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f318v);
        }
        if (this.f305h != null && this.f305h.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.f305h.toArray()));
        }
    }

    /* renamed from: a */
    static Animation m13562a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f293A);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f294B);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    /* renamed from: a */
    static Animation m13563a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f294B);
        alphaAnimation.setDuration(220L);
        return alphaAnimation;
    }

    /* renamed from: a */
    Animation m13553a(Fragment fragment, int i, boolean z, int i2) {
        int m13538b;
        Animation loadAnimation;
        Animation m13781a = fragment.m13781a(i, z, fragment.f134P);
        if (m13781a == null) {
            if (fragment.f134P == 0 || (loadAnimation = AnimationUtils.loadAnimation(this.f312o.m13578g(), fragment.f134P)) == null) {
                if (i != 0 && (m13538b = m13538b(i, z)) >= 0) {
                    switch (m13538b) {
                        case 1:
                            return m13562a(this.f312o.m13578g(), 1.125f, 1.0f, 0.0f, 1.0f);
                        case 2:
                            return m13562a(this.f312o.m13578g(), 1.0f, 0.975f, 1.0f, 0.0f);
                        case 3:
                            return m13562a(this.f312o.m13578g(), 0.975f, 1.0f, 0.0f, 1.0f);
                        case 4:
                            return m13562a(this.f312o.m13578g(), 1.0f, 1.075f, 1.0f, 0.0f);
                        case 5:
                            return m13563a(this.f312o.m13578g(), 0.0f, 1.0f);
                        case 6:
                            return m13563a(this.f312o.m13578g(), 1.0f, 0.0f);
                        default:
                            if (i2 == 0 && this.f312o.mo13581d()) {
                                i2 = this.f312o.mo13580e();
                            }
                            return i2 == 0 ? null : null;
                    }
                }
                return null;
            }
            return loadAnimation;
        }
        return m13781a;
    }

    /* renamed from: b */
    public void m13537b(Fragment fragment) {
        if (fragment.f138T) {
            if (this.f302e) {
                this.f319w = true;
                return;
            }
            fragment.f138T = false;
            m13554a(fragment, this.f311n, 0, 0, false);
        }
    }

    /* renamed from: b */
    private void m13532b(View view, Animation animation) {
        Animation.AnimationListener animationListener;
        if (view != null && animation != null && m13546a(view, animation)) {
            try {
                if (f299r == null) {
                    f299r = Animation.class.getDeclaredField("mListener");
                    f299r.setAccessible(true);
                }
                animationListener = (Animation.AnimationListener) f299r.get(animation);
            } catch (IllegalAccessException e) {
                Log.e("FragmentManager", "Cannot access Animation's mListener field", e);
                animationListener = null;
            } catch (NoSuchFieldException e2) {
                Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e2);
                animationListener = null;
            }
            animation.setAnimationListener(new animationAnimation$AnimationListenerC0100a(view, animation, animationListener));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0336  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m13554a(final android.support.p002v4.app.Fragment r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.app.C0096p.m13554a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: c */
    void m13528c(Fragment fragment) {
        m13554a(fragment, this.f311n, 0, 0, false);
    }

    /* renamed from: a */
    void m13564a(int i, boolean z) {
        m13566a(i, 0, 0, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13566a(int i, int i2, int i3, boolean z) {
        if (this.f312o == null && i != 0) {
            throw new IllegalStateException("No host");
        }
        if (z || this.f311n != i) {
            this.f311n = i;
            if (this.f303f != null) {
                int i4 = 0;
                boolean z2 = false;
                while (i4 < this.f303f.size()) {
                    Fragment fragment = this.f303f.get(i4);
                    if (fragment != null) {
                        m13554a(fragment, i, i2, i3, false);
                        if (fragment.f140V != null) {
                            z2 |= fragment.f140V.mo13458a();
                        }
                    }
                    i4++;
                    z2 = z2;
                }
                if (!z2) {
                    m13523e();
                }
                if (this.f315s && this.f312o != null && this.f311n == 5) {
                    this.f312o.mo13582c();
                    this.f315s = false;
                }
            }
        }
    }

    /* renamed from: e */
    void m13523e() {
        if (this.f303f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f303f.size()) {
                    Fragment fragment = this.f303f.get(i2);
                    if (fragment != null) {
                        m13537b(fragment);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m13525d(Fragment fragment) {
        if (fragment.f158p < 0) {
            if (this.f305h == null || this.f305h.size() <= 0) {
                if (this.f303f == null) {
                    this.f303f = new ArrayList<>();
                }
                fragment.m13782a(this.f303f.size(), this.f314q);
                this.f303f.add(fragment);
            } else {
                fragment.m13782a(this.f305h.remove(this.f305h.size() - 1).intValue(), this.f314q);
                this.f303f.set(fragment.f158p, fragment);
            }
            if (f297a) {
                Log.v("FragmentManager", "Allocated fragment index " + fragment);
            }
        }
    }

    /* renamed from: e */
    void m13522e(Fragment fragment) {
        if (fragment.f158p >= 0) {
            if (f297a) {
                Log.v("FragmentManager", "Freeing fragment index " + fragment);
            }
            this.f303f.set(fragment.f158p, null);
            if (this.f305h == null) {
                this.f305h = new ArrayList<>();
            }
            this.f305h.add(Integer.valueOf(fragment.f158p));
            this.f312o.m13589a(fragment.f159q);
            fragment.m13734t();
        }
    }

    /* renamed from: a */
    public void m13552a(Fragment fragment, boolean z) {
        if (this.f304g == null) {
            this.f304g = new ArrayList<>();
        }
        if (f297a) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        m13525d(fragment);
        if (!fragment.f128J) {
            if (this.f304g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            this.f304g.add(fragment);
            fragment.f164v = true;
            fragment.f165w = false;
            if (fragment.f131M && fragment.f132N) {
                this.f315s = true;
            }
            if (z) {
                m13528c(fragment);
            }
        }
    }

    /* renamed from: a */
    public void m13555a(Fragment fragment, int i, int i2) {
        if (f297a) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f119A);
        }
        boolean z = !fragment.m13749g();
        if (!fragment.f128J || z) {
            if (this.f304g != null) {
                this.f304g.remove(fragment);
            }
            if (fragment.f131M && fragment.f132N) {
                this.f315s = true;
            }
            fragment.f164v = false;
            fragment.f165w = true;
            m13554a(fragment, z ? 0 : 1, i, i2, false);
        }
    }

    /* renamed from: b */
    public void m13536b(Fragment fragment, int i, int i2) {
        if (f297a) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f127I) {
            fragment.f127I = true;
            if (fragment.f136R != null) {
                Animation m13553a = m13553a(fragment, i, false, i2);
                if (m13553a != null) {
                    m13532b(fragment.f136R, m13553a);
                    fragment.f136R.startAnimation(m13553a);
                }
                fragment.f136R.setVisibility(8);
            }
            if (fragment.f164v && fragment.f131M && fragment.f132N) {
                this.f315s = true;
            }
            fragment.m13758b(true);
        }
    }

    /* renamed from: c */
    public void m13527c(Fragment fragment, int i, int i2) {
        if (f297a) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f127I) {
            fragment.f127I = false;
            if (fragment.f136R != null) {
                Animation m13553a = m13553a(fragment, i, true, i2);
                if (m13553a != null) {
                    m13532b(fragment.f136R, m13553a);
                    fragment.f136R.startAnimation(m13553a);
                }
                fragment.f136R.setVisibility(0);
            }
            if (fragment.f164v && fragment.f131M && fragment.f132N) {
                this.f315s = true;
            }
            fragment.m13758b(false);
        }
    }

    /* renamed from: d */
    public void m13524d(Fragment fragment, int i, int i2) {
        if (f297a) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f128J) {
            fragment.f128J = true;
            if (fragment.f164v) {
                if (this.f304g != null) {
                    if (f297a) {
                        Log.v("FragmentManager", "remove from detach: " + fragment);
                    }
                    this.f304g.remove(fragment);
                }
                if (fragment.f131M && fragment.f132N) {
                    this.f315s = true;
                }
                fragment.f164v = false;
                m13554a(fragment, 1, i, i2, false);
            }
        }
    }

    /* renamed from: e */
    public void m13521e(Fragment fragment, int i, int i2) {
        if (f297a) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f128J) {
            fragment.f128J = false;
            if (!fragment.f164v) {
                if (this.f304g == null) {
                    this.f304g = new ArrayList<>();
                }
                if (this.f304g.contains(fragment)) {
                    throw new IllegalStateException("Fragment already added: " + fragment);
                }
                if (f297a) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                this.f304g.add(fragment);
                fragment.f164v = true;
                if (fragment.f131M && fragment.f132N) {
                    this.f315s = true;
                }
                m13554a(fragment, this.f311n, i, i2, false);
            }
        }
    }

    /* renamed from: a */
    public Fragment m13568a(int i) {
        if (this.f304g != null) {
            for (int size = this.f304g.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f304g.get(size);
                if (fragment != null && fragment.f124F == i) {
                    return fragment;
                }
            }
        }
        if (this.f303f != null) {
            for (int size2 = this.f303f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = this.f303f.get(size2);
                if (fragment2 != null && fragment2.f124F == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    @Override // android.support.p002v4.app.AbstractC0094o
    /* renamed from: a */
    public Fragment mo13542a(String str) {
        if (this.f304g != null && str != null) {
            for (int size = this.f304g.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f304g.get(size);
                if (fragment != null && str.equals(fragment.f126H)) {
                    return fragment;
                }
            }
        }
        if (this.f303f != null && str != null) {
            for (int size2 = this.f303f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = this.f303f.get(size2);
                if (fragment2 != null && str.equals(fragment2.f126H)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Fragment m13531b(String str) {
        Fragment m13765a;
        if (this.f303f != null && str != null) {
            for (int size = this.f303f.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f303f.get(size);
                if (fragment != null && (m13765a = fragment.m13765a(str)) != null) {
                    return m13765a;
                }
            }
        }
        return null;
    }

    /* renamed from: v */
    private void m13502v() {
        if (this.f316t) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f318v != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f318v);
        }
    }

    /* renamed from: a */
    public void m13544a(Runnable runnable, boolean z) {
        if (!z) {
            m13502v();
        }
        synchronized (this) {
            if (this.f317u || this.f312o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.f300c == null) {
                this.f300c = new ArrayList<>();
            }
            this.f300c.add(runnable);
            if (this.f300c.size() == 1) {
                this.f312o.m13577h().removeCallbacks(this.f322z);
                this.f312o.m13577h().post(this.f322z);
            }
        }
    }

    /* renamed from: a */
    public int m13551a(RunnableC0081g runnableC0081g) {
        int size;
        synchronized (this) {
            if (this.f309l == null || this.f309l.size() <= 0) {
                if (this.f308k == null) {
                    this.f308k = new ArrayList<>();
                }
                size = this.f308k.size();
                if (f297a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + runnableC0081g);
                }
                this.f308k.add(runnableC0081g);
            } else {
                size = this.f309l.remove(this.f309l.size() - 1).intValue();
                if (f297a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + runnableC0081g);
                }
                this.f308k.set(size, runnableC0081g);
            }
        }
        return size;
    }

    /* renamed from: a */
    public void m13565a(int i, RunnableC0081g runnableC0081g) {
        synchronized (this) {
            if (this.f308k == null) {
                this.f308k = new ArrayList<>();
            }
            int size = this.f308k.size();
            if (i < size) {
                if (f297a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + runnableC0081g);
                }
                this.f308k.set(i, runnableC0081g);
            } else {
                while (size < i) {
                    this.f308k.add(null);
                    if (this.f309l == null) {
                        this.f309l = new ArrayList<>();
                    }
                    if (f297a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f309l.add(Integer.valueOf(size));
                    size++;
                }
                if (f297a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + runnableC0081g);
                }
                this.f308k.add(runnableC0081g);
            }
        }
    }

    /* renamed from: b */
    public void m13539b(int i) {
        synchronized (this) {
            this.f308k.set(i, null);
            if (this.f309l == null) {
                this.f309l = new ArrayList<>();
            }
            if (f297a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f309l.add(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
        r6.f302e = true;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (r1 >= r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
        r6.f301d[r1].run();
        r6.f301d[r1] = null;
        r1 = r1 + 1;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m13520f() {
        /*
            r6 = this;
            r0 = 1
            r2 = 0
            boolean r1 = r6.f302e
            if (r1 == 0) goto Le
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Recursive entry to executePendingTransactions"
            r0.<init>(r1)
            throw r0
        Le:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.support.v4.app.n r3 = r6.f312o
            android.os.Handler r3 = r3.m13577h()
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
            java.util.ArrayList<java.lang.Runnable> r3 = r6.f300c     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L34
            java.util.ArrayList<java.lang.Runnable> r3 = r6.f300c     // Catch: java.lang.Throwable -> L9b
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L9b
            if (r3 != 0) goto L5c
        L34:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r6.f319w
            if (r0 == 0) goto La9
            r3 = r2
            r4 = r2
        L3b:
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r6.f303f
            int r0 = r0.size()
            if (r3 >= r0) goto La2
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r6.f303f
            java.lang.Object r0 = r0.get(r3)
            android.support.v4.app.Fragment r0 = (android.support.p002v4.app.Fragment) r0
            if (r0 == 0) goto L58
            android.support.v4.app.w r5 = r0.f140V
            if (r5 == 0) goto L58
            android.support.v4.app.w r0 = r0.f140V
            boolean r0 = r0.mo13458a()
            r4 = r4 | r0
        L58:
            int r0 = r3 + 1
            r3 = r0
            goto L3b
        L5c:
            java.util.ArrayList<java.lang.Runnable> r1 = r6.f300c     // Catch: java.lang.Throwable -> L9b
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L9b
            java.lang.Runnable[] r1 = r6.f301d     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L6b
            java.lang.Runnable[] r1 = r6.f301d     // Catch: java.lang.Throwable -> L9b
            int r1 = r1.length     // Catch: java.lang.Throwable -> L9b
            if (r1 >= r3) goto L6f
        L6b:
            java.lang.Runnable[] r1 = new java.lang.Runnable[r3]     // Catch: java.lang.Throwable -> L9b
            r6.f301d = r1     // Catch: java.lang.Throwable -> L9b
        L6f:
            java.util.ArrayList<java.lang.Runnable> r1 = r6.f300c     // Catch: java.lang.Throwable -> L9b
            java.lang.Runnable[] r4 = r6.f301d     // Catch: java.lang.Throwable -> L9b
            r1.toArray(r4)     // Catch: java.lang.Throwable -> L9b
            java.util.ArrayList<java.lang.Runnable> r1 = r6.f300c     // Catch: java.lang.Throwable -> L9b
            r1.clear()     // Catch: java.lang.Throwable -> L9b
            android.support.v4.app.n r1 = r6.f312o     // Catch: java.lang.Throwable -> L9b
            android.os.Handler r1 = r1.m13577h()     // Catch: java.lang.Throwable -> L9b
            java.lang.Runnable r4 = r6.f322z     // Catch: java.lang.Throwable -> L9b
            r1.removeCallbacks(r4)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9b
            r6.f302e = r0
            r1 = r2
        L8a:
            if (r1 >= r3) goto L9e
            java.lang.Runnable[] r4 = r6.f301d
            r4 = r4[r1]
            r4.run()
            java.lang.Runnable[] r4 = r6.f301d
            r5 = 0
            r4[r1] = r5
            int r1 = r1 + 1
            goto L8a
        L9b:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9b
            throw r0
        L9e:
            r6.f302e = r2
            r1 = r0
            goto L27
        La2:
            if (r4 != 0) goto La9
            r6.f319w = r2
            r6.m13523e()
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.app.C0096p.m13520f():boolean");
    }

    /* renamed from: g */
    void m13518g() {
        if (this.f310m != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f310m.size()) {
                    this.f310m.get(i2).m13570a();
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m13535b(RunnableC0081g runnableC0081g) {
        if (this.f306i == null) {
            this.f306i = new ArrayList<>();
        }
        this.f306i.add(runnableC0081g);
        m13518g();
    }

    /* renamed from: a */
    boolean m13558a(Handler handler, String str, int i, int i2) {
        if (this.f306i == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.f306i.size() - 1;
            if (size < 0) {
                return false;
            }
            RunnableC0081g remove = this.f306i.remove(size);
            SparseArray<Fragment> sparseArray = new SparseArray<>();
            SparseArray<Fragment> sparseArray2 = new SparseArray<>();
            remove.m13656a(sparseArray, sparseArray2);
            remove.m13647a(true, (RunnableC0081g.C0086b) null, sparseArray, sparseArray2);
            m13518g();
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = this.f306i.size() - 1;
                while (size2 >= 0) {
                    RunnableC0081g runnableC0081g = this.f306i.get(size2);
                    if ((str != null && str.equals(runnableC0081g.m13641c())) || (i >= 0 && i == runnableC0081g.f237p)) {
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
                        RunnableC0081g runnableC0081g2 = this.f306i.get(size2);
                        if ((str == null || !str.equals(runnableC0081g2.m13641c())) && (i < 0 || i != runnableC0081g2.f237p)) {
                            break;
                        }
                        size2--;
                    }
                }
                i3 = size2;
            }
            if (i3 == this.f306i.size() - 1) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int size3 = this.f306i.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f306i.remove(size3));
            }
            int size4 = arrayList.size() - 1;
            SparseArray<Fragment> sparseArray3 = new SparseArray<>();
            SparseArray<Fragment> sparseArray4 = new SparseArray<>();
            for (int i4 = 0; i4 <= size4; i4++) {
                ((RunnableC0081g) arrayList.get(i4)).m13656a(sparseArray3, sparseArray4);
            }
            RunnableC0081g.C0086b c0086b = null;
            int i5 = 0;
            while (i5 <= size4) {
                if (f297a) {
                    Log.v("FragmentManager", "Popping back stack state: " + arrayList.get(i5));
                }
                i5++;
                c0086b = ((RunnableC0081g) arrayList.get(i5)).m13647a(i5 == size4, c0086b, sparseArray3, sparseArray4);
            }
            m13518g();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public ArrayList<Fragment> m13516h() {
        ArrayList<Fragment> arrayList = null;
        if (this.f303f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f303f.size()) {
                    break;
                }
                Fragment fragment = this.f303f.get(i2);
                if (fragment != null && fragment.f129K) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    fragment.f130L = true;
                    fragment.f162t = fragment.f161s != null ? fragment.f161s.f158p : -1;
                    if (f297a) {
                        Log.v("FragmentManager", "retainNonConfig: keeping retained " + fragment);
                    }
                }
                i = i2 + 1;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    void m13519f(Fragment fragment) {
        if (fragment.f137S != null) {
            if (this.f321y == null) {
                this.f321y = new SparseArray<>();
            } else {
                this.f321y.clear();
            }
            fragment.f137S.saveHierarchyState(this.f321y);
            if (this.f321y.size() > 0) {
                fragment.f157o = this.f321y;
                this.f321y = null;
            }
        }
    }

    /* renamed from: g */
    Bundle m13517g(Fragment fragment) {
        Bundle bundle;
        if (this.f320x == null) {
            this.f320x = new Bundle();
        }
        fragment.m13740k(this.f320x);
        if (this.f320x.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f320x;
            this.f320x = null;
        }
        if (fragment.f136R != null) {
            m13519f(fragment);
        }
        if (fragment.f157o != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f157o);
        }
        if (!fragment.f139U) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.f139U);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Parcelable m13515i() {
        int[] iArr;
        int size;
        int size2;
        boolean z;
        BackStackState[] backStackStateArr = null;
        m13520f();
        if (f298b) {
            this.f316t = true;
        }
        if (this.f303f == null || this.f303f.size() <= 0) {
            return null;
        }
        int size3 = this.f303f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size3];
        int i = 0;
        boolean z2 = false;
        while (i < size3) {
            Fragment fragment = this.f303f.get(i);
            if (fragment != null) {
                if (fragment.f158p < 0) {
                    m13543a(new IllegalStateException("Failure saving state: active " + fragment + " has cleared index: " + fragment.f158p));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i] = fragmentState;
                if (fragment.f153k > 0 && fragmentState.f200j == null) {
                    fragmentState.f200j = m13517g(fragment);
                    if (fragment.f161s != null) {
                        if (fragment.f161s.f158p < 0) {
                            m13543a(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f161s));
                        }
                        if (fragmentState.f200j == null) {
                            fragmentState.f200j = new Bundle();
                        }
                        mo13559a(fragmentState.f200j, "android:target_state", fragment.f161s);
                        if (fragment.f163u != 0) {
                            fragmentState.f200j.putInt("android:target_req_state", fragment.f163u);
                        }
                    }
                } else {
                    fragmentState.f200j = fragment.f156n;
                }
                if (f297a) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragmentState.f200j);
                }
                z = true;
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        if (!z2) {
            if (f297a) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return null;
            }
            return null;
        }
        if (this.f304g == null || (size2 = this.f304g.size()) <= 0) {
            iArr = null;
        } else {
            iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = this.f304g.get(i2).f158p;
                if (iArr[i2] < 0) {
                    m13543a(new IllegalStateException("Failure saving state: active " + this.f304g.get(i2) + " has cleared index: " + iArr[i2]));
                }
                if (f297a) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.f304g.get(i2));
                }
            }
        }
        if (this.f306i != null && (size = this.f306i.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i3 = 0; i3 < size; i3++) {
                backStackStateArr[i3] = new BackStackState(this.f306i.get(i3));
                if (f297a) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.f306i.get(i3));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f188a = fragmentStateArr;
        fragmentManagerState.f189b = iArr;
        fragmentManagerState.f190c = backStackStateArr;
        return fragmentManagerState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13557a(Parcelable parcelable, List<Fragment> list) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f188a != null) {
                if (list != null) {
                    for (int i = 0; i < list.size(); i++) {
                        Fragment fragment = list.get(i);
                        if (f297a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                        }
                        FragmentState fragmentState = fragmentManagerState.f188a[fragment.f158p];
                        fragmentState.f201k = fragment;
                        fragment.f157o = null;
                        fragment.f119A = 0;
                        fragment.f167y = false;
                        fragment.f164v = false;
                        fragment.f161s = null;
                        if (fragmentState.f200j != null) {
                            fragmentState.f200j.setClassLoader(this.f312o.m13578g().getClassLoader());
                            fragment.f157o = fragmentState.f200j.getSparseParcelableArray("android:view_state");
                            fragment.f156n = fragmentState.f200j;
                        }
                    }
                }
                this.f303f = new ArrayList<>(fragmentManagerState.f188a.length);
                if (this.f305h != null) {
                    this.f305h.clear();
                }
                for (int i2 = 0; i2 < fragmentManagerState.f188a.length; i2++) {
                    FragmentState fragmentState2 = fragmentManagerState.f188a[i2];
                    if (fragmentState2 != null) {
                        Fragment m13712a = fragmentState2.m13712a(this.f312o, this.f314q);
                        if (f297a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + m13712a);
                        }
                        this.f303f.add(m13712a);
                        fragmentState2.f201k = null;
                    } else {
                        this.f303f.add(null);
                        if (this.f305h == null) {
                            this.f305h = new ArrayList<>();
                        }
                        if (f297a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + i2);
                        }
                        this.f305h.add(Integer.valueOf(i2));
                    }
                }
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        Fragment fragment2 = list.get(i3);
                        if (fragment2.f162t >= 0) {
                            if (fragment2.f162t < this.f303f.size()) {
                                fragment2.f161s = this.f303f.get(fragment2.f162t);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + fragment2 + " target no longer exists: " + fragment2.f162t);
                                fragment2.f161s = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.f189b != null) {
                    this.f304g = new ArrayList<>(fragmentManagerState.f189b.length);
                    for (int i4 = 0; i4 < fragmentManagerState.f189b.length; i4++) {
                        Fragment fragment3 = this.f303f.get(fragmentManagerState.f189b[i4]);
                        if (fragment3 == null) {
                            m13543a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f189b[i4]));
                        }
                        fragment3.f164v = true;
                        if (f297a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + i4 + ": " + fragment3);
                        }
                        if (this.f304g.contains(fragment3)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.f304g.add(fragment3);
                    }
                } else {
                    this.f304g = null;
                }
                if (fragmentManagerState.f190c != null) {
                    this.f306i = new ArrayList<>(fragmentManagerState.f190c.length);
                    for (int i5 = 0; i5 < fragmentManagerState.f190c.length; i5++) {
                        RunnableC0081g m13797a = fragmentManagerState.f190c[i5].m13797a(this);
                        if (f297a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i5 + " (index " + m13797a.f237p + "): " + m13797a);
                            m13797a.m13650a("  ", new PrintWriter(new C0164d("FragmentManager")), false);
                        }
                        this.f306i.add(m13797a);
                        if (m13797a.f237p >= 0) {
                            m13565a(m13797a.f237p, m13797a);
                        }
                    }
                    return;
                }
                this.f306i = null;
            }
        }
    }

    /* renamed from: a */
    public void m13550a(AbstractC0093n abstractC0093n, AbstractC0091l abstractC0091l, Fragment fragment) {
        if (this.f312o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f312o = abstractC0093n;
        this.f313p = abstractC0091l;
        this.f314q = fragment;
    }

    /* renamed from: j */
    public void m13514j() {
        this.f316t = false;
    }

    /* renamed from: k */
    public void m13513k() {
        this.f316t = false;
        m13564a(1, false);
    }

    /* renamed from: l */
    public void m13512l() {
        this.f316t = false;
        m13564a(2, false);
    }

    /* renamed from: m */
    public void m13511m() {
        this.f316t = false;
        m13564a(4, false);
    }

    /* renamed from: n */
    public void m13510n() {
        this.f316t = false;
        m13564a(5, false);
    }

    /* renamed from: o */
    public void m13509o() {
        m13564a(4, false);
    }

    /* renamed from: p */
    public void m13508p() {
        this.f316t = true;
        m13564a(3, false);
    }

    /* renamed from: q */
    public void m13507q() {
        m13564a(2, false);
    }

    /* renamed from: r */
    public void m13506r() {
        m13564a(1, false);
    }

    /* renamed from: s */
    public void m13505s() {
        this.f317u = true;
        m13520f();
        m13564a(0, false);
        this.f312o = null;
        this.f313p = null;
        this.f314q = null;
    }

    /* renamed from: a */
    public void m13561a(Configuration configuration) {
        if (this.f304g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f304g.size()) {
                    Fragment fragment = this.f304g.get(i2);
                    if (fragment != null) {
                        fragment.m13770a(configuration);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    public void m13504t() {
        if (this.f304g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f304g.size()) {
                    Fragment fragment = this.f304g.get(i2);
                    if (fragment != null) {
                        fragment.m13788G();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m13548a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        ArrayList<Fragment> arrayList = null;
        if (this.f304g != null) {
            int i = 0;
            z = false;
            while (i < this.f304g.size()) {
                Fragment fragment = this.f304g.get(i);
                if (fragment != null && fragment.m13760b(menu, menuInflater)) {
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
        if (this.f307j != null) {
            for (int i2 = 0; i2 < this.f307j.size(); i2++) {
                Fragment fragment2 = this.f307j.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.m13733u();
                }
            }
        }
        this.f307j = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean m13549a(Menu menu) {
        if (this.f304g != null) {
            boolean z = false;
            for (int i = 0; i < this.f304g.size(); i++) {
                Fragment fragment = this.f304g.get(i);
                if (fragment != null && fragment.m13757c(menu)) {
                    z = true;
                }
            }
            return z;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m13547a(MenuItem menuItem) {
        if (this.f304g != null) {
            for (int i = 0; i < this.f304g.size(); i++) {
                Fragment fragment = this.f304g.get(i);
                if (fragment != null && fragment.m13756c(menuItem)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m13533b(MenuItem menuItem) {
        if (this.f304g != null) {
            for (int i = 0; i < this.f304g.size(); i++) {
                Fragment fragment = this.f304g.get(i);
                if (fragment != null && fragment.m13753d(menuItem)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public void m13534b(Menu menu) {
        if (this.f304g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f304g.size()) {
                    Fragment fragment = this.f304g.get(i2);
                    if (fragment != null) {
                        fragment.m13754d(menu);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public static int m13529c(int i) {
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

    /* renamed from: b */
    public static int m13538b(int i, boolean z) {
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

    @Override // android.support.p002v4.view.InterfaceC0413n
    /* renamed from: a */
    public View mo12090a(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0103b.f334a);
            String string = attributeValue == null ? obtainStyledAttributes.getString(0) : attributeValue;
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string2 = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (Fragment.m13763b(this.f312o.m13578g(), string)) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string2 == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
                }
                Fragment m13568a = resourceId != -1 ? m13568a(resourceId) : null;
                if (m13568a == null && string2 != null) {
                    m13568a = mo13542a(string2);
                }
                if (m13568a == null && id != -1) {
                    m13568a = m13568a(id);
                }
                if (f297a) {
                    Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + m13568a);
                }
                if (m13568a == null) {
                    Fragment m13776a = Fragment.m13776a(context, string);
                    m13776a.f166x = true;
                    m13776a.f124F = resourceId != 0 ? resourceId : id;
                    m13776a.f125G = id;
                    m13776a.f126H = string2;
                    m13776a.f167y = true;
                    m13776a.f120B = this;
                    m13776a.f121C = this.f312o;
                    m13776a.m13777a(this.f312o.m13578g(), attributeSet, m13776a.f156n);
                    m13552a(m13776a, true);
                    fragment = m13776a;
                } else if (m13568a.f167y) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
                } else {
                    m13568a.f167y = true;
                    m13568a.f121C = this.f312o;
                    if (!m13568a.f130L) {
                        m13568a.m13777a(this.f312o.m13578g(), attributeSet, m13568a.f156n);
                    }
                    fragment = m13568a;
                }
                if (this.f311n < 1 && fragment.f166x) {
                    m13554a(fragment, 1, 0, 0, false);
                } else {
                    m13528c(fragment);
                }
                if (fragment.f136R == null) {
                    throw new IllegalStateException("Fragment " + string + " did not create a view.");
                }
                if (resourceId != 0) {
                    fragment.f136R.setId(resourceId);
                }
                if (fragment.f136R.getTag() == null) {
                    fragment.f136R.setTag(string2);
                }
                return fragment.f136R;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public InterfaceC0413n m13503u() {
        return this;
    }
}
