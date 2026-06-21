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
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener {
    private static final android.support.v4.f.l a = new android.support.v4.f.l();
    static final Object j = new Object();
    boolean A;
    int B;
    m C;
    FragmentActivity D;
    m E;
    Fragment F;
    int G;
    int H;
    String I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    boolean N;
    boolean P;
    int Q;
    ViewGroup R;
    View S;
    View T;
    boolean U;
    x W;
    boolean X;
    boolean Y;
    Boolean af;
    Boolean ag;
    View l;
    int m;
    Bundle n;
    SparseArray o;
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
    boolean O = true;
    boolean V = true;
    Object Z = null;
    Object aa = j;
    Object ab = null;
    Object ac = j;
    Object ad = null;
    Object ae = j;
    bq ah = null;
    bq ai = null;

    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: android.support.v4.app.Fragment.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        final Bundle a;

        SavedState(Bundle bundle) {
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

    public static Fragment a(Context context, String str) {
        return a(context, str, (Bundle) null);
    }

    public static Fragment a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = (Class) a.get(str);
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
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        }
    }

    static boolean b(Context context, String str) {
        try {
            Class<?> cls = (Class) a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                a.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    final void f(Bundle bundle) {
        if (this.o != null) {
            this.T.restoreHierarchyState(this.o);
            this.o = null;
        }
        this.P = false;
        h(bundle);
        if (!this.P) {
            throw new br("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    final void a(int i, Fragment fragment) {
        this.p = i;
        if (fragment != null) {
            this.q = String.valueOf(fragment.q) + ":" + this.p;
        } else {
            this.q = "android:fragment:" + this.p;
        }
    }

    final boolean g() {
        return this.B > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ItemInfo.APP_INTENT);
        android.support.v4.f.c.a(this, sb);
        if (this.p >= 0) {
            sb.append(" #");
            sb.append(this.p);
        }
        if (this.G != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.G));
        }
        if (this.I != null) {
            sb.append(" ");
            sb.append(this.I);
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
        return this.D;
    }

    public final Resources j() {
        if (this.D == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        return this.D.getResources();
    }

    public final k k() {
        return this.C;
    }

    public final k l() {
        if (this.E == null) {
            C();
            if (this.k >= 5) {
                this.E.n();
            } else if (this.k >= 4) {
                this.E.m();
            } else if (this.k >= 2) {
                this.E.l();
            } else if (this.k >= 1) {
                this.E.k();
            }
        }
        return this.E;
    }

    public final boolean m() {
        return this.D != null && this.v;
    }

    public final boolean n() {
        return this.J;
    }

    public void b(boolean z) {
    }

    public void c(boolean z) {
        if (z && this.F != null) {
            throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
        }
        this.L = z;
    }

    public void d(boolean z) {
        if (this.O != z) {
            this.O = z;
            if (this.N && m() && !n()) {
                this.D.d();
            }
        }
    }

    public void e(boolean z) {
        if (!this.V && z && this.k < 4) {
            this.C.b(this);
        }
        this.V = z;
        this.U = !z;
    }

    public void a(Intent intent) {
        if (this.D == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.D.a(this, intent, -1);
    }

    public void a(Intent intent, int i) {
        if (this.D == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.D.a(this, intent, i);
    }

    public void a(int i, int i2, Intent intent) {
    }

    public LayoutInflater b(Bundle bundle) {
        LayoutInflater cloneInContext = this.D.getLayoutInflater().cloneInContext(this.D);
        l();
        cloneInContext.setFactory(this.E.u());
        return cloneInContext;
    }

    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.P = true;
    }

    public void a(Activity activity) {
        this.P = true;
    }

    public Animation a(int i, boolean z, int i2) {
        return null;
    }

    public void a(Bundle bundle) {
        this.P = true;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void a(View view, Bundle bundle) {
    }

    public View o() {
        return this.S;
    }

    public void d(Bundle bundle) {
        this.P = true;
    }

    public void h(Bundle bundle) {
        this.P = true;
    }

    public void d() {
        this.P = true;
        if (!this.X) {
            this.X = true;
            if (!this.Y) {
                this.Y = true;
                this.W = this.D.a(this.q, this.X, false);
            }
            if (this.W != null) {
                this.W.b();
            }
        }
    }

    public void p() {
        this.P = true;
    }

    public void e(Bundle bundle) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.P = true;
    }

    public void q() {
        this.P = true;
    }

    public void e() {
        this.P = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.P = true;
    }

    public void f() {
        this.P = true;
    }

    public void r() {
        this.P = true;
        if (!this.Y) {
            this.Y = true;
            this.W = this.D.a(this.q, this.X, false);
        }
        if (this.W != null) {
            this.W.h();
        }
    }

    void s() {
        this.p = -1;
        this.q = null;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = 0;
        this.C = null;
        this.E = null;
        this.D = null;
        this.G = 0;
        this.H = 0;
        this.I = null;
        this.J = false;
        this.K = false;
        this.M = false;
        this.W = null;
        this.X = false;
        this.Y = false;
    }

    public void c() {
        this.P = true;
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    public void a(Menu menu) {
    }

    public void t() {
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

    public Object u() {
        return this.Z;
    }

    public Object v() {
        return this.aa == j ? u() : this.aa;
    }

    public Object w() {
        return this.ab;
    }

    public Object x() {
        return this.ac == j ? w() : this.ac;
    }

    public Object y() {
        return this.ad;
    }

    public Object z() {
        return this.ae == j ? y() : this.ae;
    }

    public boolean A() {
        if (this.ag == null) {
            return true;
        }
        return this.ag.booleanValue();
    }

    public boolean B() {
        if (this.af == null) {
            return true;
        }
        return this.af.booleanValue();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.G));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.H));
        printWriter.print(" mTag=");
        printWriter.println(this.I);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.k);
        printWriter.print(" mIndex=");
        printWriter.print(this.p);
        printWriter.print(" mWho=");
        printWriter.print(this.q);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.v);
        printWriter.print(" mRemoving=");
        printWriter.print(this.w);
        printWriter.print(" mResumed=");
        printWriter.print(this.x);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.y);
        printWriter.print(" mInLayout=");
        printWriter.println(this.z);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.J);
        printWriter.print(" mDetached=");
        printWriter.print(this.K);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.O);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.N);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.L);
        printWriter.print(" mRetaining=");
        printWriter.print(this.M);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.V);
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.C);
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.print("mActivity=");
            printWriter.println(this.D);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.F);
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
        if (this.Q != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.Q);
        }
        if (this.R != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.R);
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.S);
        }
        if (this.T != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.S);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.m);
        }
        if (this.W != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.W.a(String.valueOf(str) + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.E != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.E + ":");
            this.E.a(String.valueOf(str) + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    void C() {
        this.E = new m();
        this.E.a(this.D, new j() { // from class: android.support.v4.app.Fragment.1
            @Override // android.support.v4.app.j
            public View a(int i) {
                if (Fragment.this.S == null) {
                    throw new IllegalStateException("Fragment does not have a view");
                }
                return Fragment.this.S.findViewById(i);
            }

            @Override // android.support.v4.app.j
            public boolean a() {
                return Fragment.this.S != null;
            }
        }, this);
    }

    void i(Bundle bundle) {
        Parcelable parcelable;
        if (this.E != null) {
            this.E.j();
        }
        this.P = false;
        a(bundle);
        if (!this.P) {
            throw new br("Fragment " + this + " did not call through to super.onCreate()");
        }
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.E == null) {
                C();
            }
            this.E.a(parcelable, (ArrayList) null);
            this.E.k();
        }
    }

    View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.E != null) {
            this.E.j();
        }
        return a(layoutInflater, viewGroup, bundle);
    }

    void j(Bundle bundle) {
        if (this.E != null) {
            this.E.j();
        }
        this.P = false;
        d(bundle);
        if (!this.P) {
            throw new br("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        if (this.E != null) {
            this.E.l();
        }
    }

    void D() {
        if (this.E != null) {
            this.E.j();
            this.E.f();
        }
        this.P = false;
        d();
        if (!this.P) {
            throw new br("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.E != null) {
            this.E.m();
        }
        if (this.W != null) {
            this.W.g();
        }
    }

    void E() {
        if (this.E != null) {
            this.E.j();
            this.E.f();
        }
        this.P = false;
        p();
        if (!this.P) {
            throw new br("Fragment " + this + " did not call through to super.onResume()");
        }
        if (this.E != null) {
            this.E.n();
            this.E.f();
        }
    }

    void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.E != null) {
            this.E.a(configuration);
        }
    }

    void F() {
        onLowMemory();
        if (this.E != null) {
            this.E.t();
        }
    }

    boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.J) {
            return false;
        }
        if (this.N && this.O) {
            z = true;
            a(menu, menuInflater);
        }
        if (this.E != null) {
            return z | this.E.a(menu, menuInflater);
        }
        return z;
    }

    boolean c(Menu menu) {
        boolean z = false;
        if (this.J) {
            return false;
        }
        if (this.N && this.O) {
            z = true;
            a(menu);
        }
        if (this.E != null) {
            return z | this.E.a(menu);
        }
        return z;
    }

    boolean c(MenuItem menuItem) {
        if (!this.J) {
            if (this.N && this.O && a(menuItem)) {
                return true;
            }
            if (this.E != null && this.E.a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean d(MenuItem menuItem) {
        if (!this.J) {
            if (b(menuItem)) {
                return true;
            }
            if (this.E != null && this.E.b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void d(Menu menu) {
        if (!this.J) {
            if (this.N && this.O) {
                b(menu);
            }
            if (this.E != null) {
                this.E.b(menu);
            }
        }
    }

    void k(Bundle bundle) {
        Parcelable i;
        e(bundle);
        if (this.E != null && (i = this.E.i()) != null) {
            bundle.putParcelable("android:support:fragments", i);
        }
    }

    void G() {
        if (this.E != null) {
            this.E.o();
        }
        this.P = false;
        q();
        if (!this.P) {
            throw new br("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void H() {
        if (this.E != null) {
            this.E.p();
        }
        this.P = false;
        e();
        if (!this.P) {
            throw new br("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void I() {
        if (this.E != null) {
            this.E.q();
        }
        if (this.X) {
            this.X = false;
            if (!this.Y) {
                this.Y = true;
                this.W = this.D.a(this.q, this.X, false);
            }
            if (this.W != null) {
                if (!this.D.h) {
                    this.W.c();
                } else {
                    this.W.d();
                }
            }
        }
    }

    void J() {
        if (this.E != null) {
            this.E.r();
        }
        this.P = false;
        f();
        if (!this.P) {
            throw new br("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        if (this.W != null) {
            this.W.f();
        }
    }

    void K() {
        if (this.E != null) {
            this.E.s();
        }
        this.P = false;
        r();
        if (!this.P) {
            throw new br("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }
}
