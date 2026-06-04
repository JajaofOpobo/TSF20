package android.support.v4.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener {
    private static final HashMap P = new HashMap();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean F;
    int G;
    ViewGroup H;
    View I;
    View J;
    boolean K;
    ab M;
    boolean N;
    boolean O;
    View b;
    int c;
    Bundle d;
    SparseArray e;
    String g;
    Bundle h;
    Fragment i;
    int k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    m s;
    FragmentActivity t;
    m u;
    Fragment v;
    int w;
    int x;
    String y;
    boolean z;
    int a = 0;
    int f = -1;
    int j = -1;
    boolean E = true;
    boolean L = true;

    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new f();
        final Bundle a;

        SavedState(Bundle bundle) {
            this.a = bundle;
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readBundle();
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
            Class<?> cls = (Class) P.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                P.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.h = bundle;
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        }
    }

    final void a() {
        if (this.e != null) {
            this.J.restoreHierarchyState(this.e);
            this.e = null;
        }
        this.F = false;
        this.F = true;
        if (!this.F) {
            throw new ae("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    final void a(int i, Fragment fragment) {
        this.f = i;
        if (fragment != null) {
            this.g = fragment.g + ":" + this.f;
        } else {
            this.g = "android:fragment:" + this.f;
        }
    }

    final boolean b() {
        return this.r > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        android.support.v4.c.a.a(this, sb);
        if (this.f >= 0) {
            sb.append(" #");
            sb.append(this.f);
        }
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" ");
            sb.append(this.y);
        }
        sb.append('}');
        return sb.toString();
    }

    public final void a(Bundle bundle) {
        if (this.f >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.h = bundle;
    }

    public final Bundle c() {
        return this.h;
    }

    public final void a(SavedState savedState) {
        if (this.f >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.d = (savedState == null || savedState.a == null) ? null : savedState.a;
    }

    public final FragmentActivity d() {
        return this.t;
    }

    public final Resources e() {
        if (this.t == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        return this.t.getResources();
    }

    public final boolean f() {
        return this.A;
    }

    public static void g() {
    }

    public final void a(boolean z) {
        if (this.E != z) {
            this.E = z;
            if (this.D) {
                if ((this.t != null && this.l) && !this.z) {
                    this.t.b();
                }
            }
        }
    }

    public final void b(boolean z) {
        if (!this.L && z && this.a < 4) {
            this.s.b(this);
        }
        this.L = z;
        this.K = !z;
    }

    public static void h() {
    }

    public final LayoutInflater i() {
        return this.t.getLayoutInflater();
    }

    public final void j() {
        this.F = true;
    }

    public final void k() {
        this.F = true;
    }

    public static Animation l() {
        return null;
    }

    public void b(Bundle bundle) {
        this.F = true;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void a(View view, Bundle bundle) {
    }

    public final View m() {
        return this.I;
    }

    public void c(Bundle bundle) {
        this.F = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.F = true;
    }

    public void n() {
        this.F = true;
    }

    final void o() {
        this.f = -1;
        this.g = null;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = 0;
        this.s = null;
        this.t = null;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.z = false;
        this.A = false;
        this.C = false;
        this.M = null;
        this.N = false;
        this.O = false;
    }

    public final void p() {
        this.F = true;
    }

    public static void q() {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.t.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mTag=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mIndex=");
        printWriter.print(this.f);
        printWriter.print(" mWho=");
        printWriter.print(this.g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mResumed=");
        printWriter.print(this.n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mRetaining=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.L);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.s);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mActivity=");
            printWriter.println(this.t);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.v);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.h);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.d);
        }
        if (this.e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.e);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.k);
        }
        if (this.G != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.I);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.b);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.c);
        }
        if (this.M != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.M.a(str + "  ", printWriter);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.u + ":");
            this.u.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    final void d(Bundle bundle) {
        Parcelable parcelable;
        if (this.u != null) {
            this.u.g();
        }
        this.F = false;
        b(bundle);
        if (!this.F) {
            throw new ae("Fragment " + this + " did not call through to super.onCreate()");
        }
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.u == null) {
                this.u = new m();
                this.u.a(this.t, new d(this), this);
            }
            this.u.a(parcelable, (ArrayList) null);
            this.u.h();
        }
    }

    final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.u != null) {
            this.u.g();
        }
        return a(layoutInflater, viewGroup, bundle);
    }

    final void e(Bundle bundle) {
        if (this.u != null) {
            this.u.g();
        }
        this.F = false;
        c(bundle);
        if (!this.F) {
            throw new ae("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        if (this.u != null) {
            this.u.i();
        }
    }

    final void r() {
        if (this.u != null) {
            this.u.g();
            this.u.d();
        }
        this.F = false;
        this.F = true;
        if (!this.N) {
            this.N = true;
            if (!this.O) {
                this.O = true;
                FragmentActivity fragmentActivity = this.t;
                String str = this.g;
                boolean z = this.N;
                this.M = fragmentActivity.b(str);
            }
            if (this.M != null) {
                this.M.b();
            }
        }
        if (!this.F) {
            throw new ae("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.u != null) {
            this.u.j();
        }
        if (this.M != null) {
            this.M.g();
        }
    }

    final void s() {
        if (this.u != null) {
            this.u.g();
            this.u.d();
        }
        this.F = false;
        this.F = true;
        if (!this.F) {
            throw new ae("Fragment " + this + " did not call through to super.onResume()");
        }
        if (this.u != null) {
            this.u.k();
            this.u.d();
        }
    }

    final void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.u != null) {
            this.u.a(configuration);
        }
    }

    final void t() {
        onLowMemory();
        if (this.u != null) {
            this.u.q();
        }
    }

    final boolean a(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z = true;
        }
        if (this.u != null) {
            return z | this.u.a(menu, menuInflater);
        }
        return z;
    }

    final boolean a(Menu menu) {
        boolean z = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z = true;
        }
        if (this.u != null) {
            return z | this.u.a(menu);
        }
        return z;
    }

    final boolean a(MenuItem menuItem) {
        if (!this.z) {
            if (this.D) {
                boolean z = this.E;
            }
            if (this.u != null && this.u.a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final boolean b(MenuItem menuItem) {
        return (this.z || this.u == null || !this.u.b(menuItem)) ? false : true;
    }

    final void b(Menu menu) {
        if (!this.z) {
            if (this.D) {
                boolean z = this.E;
            }
            if (this.u != null) {
                this.u.b(menu);
            }
        }
    }

    final void f(Bundle bundle) {
        Parcelable f;
        if (this.u != null && (f = this.u.f()) != null) {
            bundle.putParcelable("android:support:fragments", f);
        }
    }

    final void u() {
        if (this.u != null) {
            this.u.l();
        }
        this.F = false;
        this.F = true;
        if (!this.F) {
            throw new ae("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    final void v() {
        if (this.u != null) {
            this.u.m();
        }
        this.F = false;
        this.F = true;
        if (!this.F) {
            throw new ae("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    final void w() {
        if (this.u != null) {
            this.u.n();
        }
        if (this.N) {
            this.N = false;
            if (!this.O) {
                this.O = true;
                FragmentActivity fragmentActivity = this.t;
                String str = this.g;
                boolean z = this.N;
                this.M = fragmentActivity.b(str);
            }
            if (this.M != null) {
                if (!this.t.h) {
                    this.M.c();
                } else {
                    this.M.d();
                }
            }
        }
    }

    final void x() {
        if (this.u != null) {
            this.u.o();
        }
        this.F = false;
        n();
        if (!this.F) {
            throw new ae("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        if (this.M != null) {
            this.M.f();
        }
    }

    final void y() {
        if (this.u != null) {
            this.u.p();
        }
        this.F = false;
        this.F = true;
        if (!this.O) {
            this.O = true;
            FragmentActivity fragmentActivity = this.t;
            String str = this.g;
            boolean z = this.N;
            this.M = fragmentActivity.b(str);
        }
        if (this.M != null) {
            this.M.h();
        }
        if (!this.F) {
            throw new ae("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }
}
