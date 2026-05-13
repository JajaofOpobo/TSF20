package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener {
    private static final android.support.v4.d.h<String, Class<?>> a = new android.support.v4.d.h<>();
    static final Object j = new Object();
    int A;
    p B;
    n C;
    p D;
    Fragment E;
    int F;
    int G;
    String H;
    boolean I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    boolean O;
    int P;
    ViewGroup Q;
    View R;
    View S;
    boolean T;
    w V;
    boolean W;
    boolean X;
    Boolean ae;
    Boolean af;
    View l;
    int m;
    Bundle n;
    SparseArray<Parcelable> o;
    String q;
    Bundle r;
    Fragment s;
    int u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;
    int k = 0;
    int p = -1;
    int t = -1;
    boolean N = true;
    boolean U = true;
    Object Y = null;
    Object Z = j;
    Object aa = null;
    Object ab = j;
    Object ac = null;
    Object ad = j;
    aa ag = null;
    aa ah = null;

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v4.app.Fragment.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        final Bundle a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Bundle bundle) {
            this.a = bundle;
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.a = parcel.readBundle();
            if (classLoader != null && this.a != null) {
                this.a.setClassLoader(classLoader);
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static Fragment a(Context context, String str) {
        return a(context, str, (Bundle) null);
    }

    public static Fragment a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                a.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.r = bundle;
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw new a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Context context, String str) {
        try {
            Class<?> cls = a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                a.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(Bundle bundle) {
        if (this.o != null) {
            this.S.restoreHierarchyState(this.o);
            this.o = null;
        }
        this.O = false;
        h(bundle);
        if (!this.O) {
            throw new ab("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, Fragment fragment) {
        this.p = i;
        if (fragment != null) {
            this.q = fragment.q + ":" + this.p;
        } else {
            this.q = "android:fragment:" + this.p;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        return this.A > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) ItemInfo.APP_INTENT);
        android.support.v4.d.c.a(this, sb);
        if (this.p >= 0) {
            sb.append(" #");
            sb.append(this.p);
        }
        if (this.F != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.F));
        }
        if (this.H != null) {
            sb.append(" ");
            sb.append(this.H);
        }
        sb.append('}');
        return sb.toString();
    }

    public void g(Bundle bundle) {
        if (this.p >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.r = bundle;
    }

    public final Bundle h() {
        return this.r;
    }

    public void a(SavedState savedState) {
        if (this.p >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.n = (savedState == null || savedState.a == null) ? null : savedState.a;
    }

    public final FragmentActivity i() {
        if (this.C == null) {
            return null;
        }
        return (FragmentActivity) this.C.f();
    }

    public final Resources j() {
        if (this.C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        return this.C.g().getResources();
    }

    public final o k() {
        return this.B;
    }

    public final o l() {
        if (this.D == null) {
            D();
            if (this.k >= 5) {
                this.D.n();
            } else if (this.k >= 4) {
                this.D.m();
            } else if (this.k >= 2) {
                this.D.l();
            } else if (this.k >= 1) {
                this.D.k();
            }
        }
        return this.D;
    }

    public final boolean m() {
        return this.C != null && this.v;
    }

    public final boolean n() {
        return this.J;
    }

    public final boolean o() {
        return this.I;
    }

    public void b(boolean z) {
    }

    public void c(boolean z) {
        if (z && this.E != null) {
            throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
        }
        this.K = z;
    }

    public void d(boolean z) {
        if (this.N != z) {
            this.N = z;
            if (this.M && m() && !o()) {
                this.C.c();
            }
        }
    }

    public void e(boolean z) {
        if (!this.U && z && this.k < 4) {
            this.B.b(this);
        }
        this.U = z;
        this.T = !z;
    }

    public void a(Intent intent) {
        a(intent, (Bundle) null);
    }

    public void a(Intent intent, Bundle bundle) {
        if (this.C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.C.a(this, intent, -1, bundle);
    }

    public void a(Intent intent, int i) {
        a(intent, i, (Bundle) null);
    }

    public void a(Intent intent, int i, Bundle bundle) {
        if (this.C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.C.a(this, intent, i, bundle);
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(int i, String[] strArr, int[] iArr) {
    }

    public LayoutInflater b(Bundle bundle) {
        LayoutInflater b = this.C.b();
        l();
        android.support.v4.view.j.a(b, this.D.u());
        return b;
    }

    public void a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.O = true;
        Activity f = this.C == null ? null : this.C.f();
        if (f != null) {
            this.O = false;
            a(f, attributeSet, bundle);
        }
    }

    @Deprecated
    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.O = true;
    }

    public void a(Context context) {
        this.O = true;
        Activity f = this.C == null ? null : this.C.f();
        if (f != null) {
            this.O = false;
            a(f);
        }
    }

    @Deprecated
    public void a(Activity activity) {
        this.O = true;
    }

    public Animation a(int i, boolean z, int i2) {
        return null;
    }

    public void a(Bundle bundle) {
        this.O = true;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void a(View view, Bundle bundle) {
    }

    public View p() {
        return this.R;
    }

    public void d(Bundle bundle) {
        this.O = true;
    }

    public void h(Bundle bundle) {
        this.O = true;
    }

    public void d() {
        this.O = true;
        if (!this.W) {
            this.W = true;
            if (!this.X) {
                this.X = true;
                this.V = this.C.a(this.q, this.W, false);
            }
            if (this.V != null) {
                this.V.b();
            }
        }
    }

    public void q() {
        this.O = true;
    }

    public void e(Bundle bundle) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.O = true;
    }

    public void r() {
        this.O = true;
    }

    public void e() {
        this.O = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.O = true;
    }

    public void f() {
        this.O = true;
    }

    public void s() {
        this.O = true;
        if (!this.X) {
            this.X = true;
            this.V = this.C.a(this.q, this.W, false);
        }
        if (this.V != null) {
            this.V.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        this.p = -1;
        this.q = null;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = 0;
        this.B = null;
        this.D = null;
        this.C = null;
        this.F = 0;
        this.G = 0;
        this.H = null;
        this.I = false;
        this.J = false;
        this.L = false;
        this.V = null;
        this.W = false;
        this.X = false;
    }

    public void c() {
        this.O = true;
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    public void a(Menu menu) {
    }

    public void u() {
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    public void b(Menu menu) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        i().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean b(MenuItem menuItem) {
        return false;
    }

    public Object v() {
        return this.Y;
    }

    public Object w() {
        return this.Z == j ? v() : this.Z;
    }

    public Object x() {
        return this.aa;
    }

    public Object y() {
        return this.ab == j ? x() : this.ab;
    }

    public Object z() {
        return this.ac;
    }

    public Object A() {
        return this.ad == j ? z() : this.ad;
    }

    public boolean B() {
        if (this.af == null) {
            return true;
        }
        return this.af.booleanValue();
    }

    public boolean C() {
        if (this.ae == null) {
            return true;
        }
        return this.ae.booleanValue();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.G));
        printWriter.print(" mTag=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.k);
        printWriter.print(" mIndex=");
        printWriter.print(this.p);
        printWriter.print(" mWho=");
        printWriter.print(this.q);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.v);
        printWriter.print(" mRemoving=");
        printWriter.print(this.w);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.x);
        printWriter.print(" mInLayout=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.I);
        printWriter.print(" mDetached=");
        printWriter.print(this.J);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.N);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.M);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.K);
        printWriter.print(" mRetaining=");
        printWriter.print(this.L);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.U);
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.B);
        }
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.C);
        }
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.E);
        }
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.r);
        }
        if (this.n != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.n);
        }
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.o);
        }
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.s);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.u);
        }
        if (this.P != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.P);
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.Q);
        }
        if (this.R != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.R);
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.R);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.m);
        }
        if (this.V != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.V.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.D + ":");
            this.D.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment a(String str) {
        if (!str.equals(this.q)) {
            if (this.D != null) {
                return this.D.b(str);
            }
            return null;
        }
        return this;
    }

    void D() {
        this.D = new p();
        this.D.a(this.C, new l() { // from class: android.support.v4.app.Fragment.1
            @Override // android.support.v4.app.l
            public View a(int i) {
                if (Fragment.this.R == null) {
                    throw new IllegalStateException("Fragment does not have a view");
                }
                return Fragment.this.R.findViewById(i);
            }

            @Override // android.support.v4.app.l
            public boolean a() {
                return Fragment.this.R != null;
            }
        }, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Bundle bundle) {
        Parcelable parcelable;
        if (this.D != null) {
            this.D.j();
        }
        this.k = 1;
        this.O = false;
        a(bundle);
        if (!this.O) {
            throw new ab("Fragment " + this + " did not call through to super.onCreate()");
        }
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.D == null) {
                D();
            }
            this.D.a(parcelable, (List<Fragment>) null);
            this.D.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.D != null) {
            this.D.j();
        }
        return a(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Bundle bundle) {
        if (this.D != null) {
            this.D.j();
        }
        this.k = 2;
        this.O = false;
        d(bundle);
        if (!this.O) {
            throw new ab("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        if (this.D != null) {
            this.D.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E() {
        if (this.D != null) {
            this.D.j();
            this.D.f();
        }
        this.k = 4;
        this.O = false;
        d();
        if (!this.O) {
            throw new ab("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.D != null) {
            this.D.m();
        }
        if (this.V != null) {
            this.V.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        if (this.D != null) {
            this.D.j();
            this.D.f();
        }
        this.k = 5;
        this.O = false;
        q();
        if (!this.O) {
            throw new ab("Fragment " + this + " did not call through to super.onResume()");
        }
        if (this.D != null) {
            this.D.n();
            this.D.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.D != null) {
            this.D.a(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        onLowMemory();
        if (this.D != null) {
            this.D.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.I) {
            return false;
        }
        if (this.M && this.N) {
            z = true;
            a(menu, menuInflater);
        }
        if (this.D != null) {
            return z | this.D.a(menu, menuInflater);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(Menu menu) {
        boolean z = false;
        if (this.I) {
            return false;
        }
        if (this.M && this.N) {
            z = true;
            a(menu);
        }
        if (this.D != null) {
            return z | this.D.a(menu);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(MenuItem menuItem) {
        if (!this.I) {
            if (this.M && this.N && a(menuItem)) {
                return true;
            }
            if (this.D != null && this.D.a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(MenuItem menuItem) {
        if (!this.I) {
            if (b(menuItem)) {
                return true;
            }
            if (this.D != null && this.D.b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Menu menu) {
        if (!this.I) {
            if (this.M && this.N) {
                b(menu);
            }
            if (this.D != null) {
                this.D.b(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Bundle bundle) {
        Parcelable i;
        e(bundle);
        if (this.D != null && (i = this.D.i()) != null) {
            bundle.putParcelable("android:support:fragments", i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        if (this.D != null) {
            this.D.o();
        }
        this.k = 4;
        this.O = false;
        r();
        if (!this.O) {
            throw new ab("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I() {
        if (this.D != null) {
            this.D.p();
        }
        this.k = 3;
        this.O = false;
        e();
        if (!this.O) {
            throw new ab("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J() {
        if (this.D != null) {
            this.D.q();
        }
        this.k = 2;
        if (this.W) {
            this.W = false;
            if (!this.X) {
                this.X = true;
                this.V = this.C.a(this.q, this.W, false);
            }
            if (this.V != null) {
                if (this.C.j()) {
                    this.V.d();
                } else {
                    this.V.c();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K() {
        if (this.D != null) {
            this.D.r();
        }
        this.k = 1;
        this.O = false;
        f();
        if (!this.O) {
            throw new ab("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        if (this.V != null) {
            this.V.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L() {
        if (this.D != null) {
            this.D.s();
        }
        this.k = 0;
        this.O = false;
        s();
        if (!this.O) {
            throw new ab("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }
}
