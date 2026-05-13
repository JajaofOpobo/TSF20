package android.support.p002v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.p009d.C0163c;
import android.support.p002v4.p009d.C0173h;
import android.support.p002v4.view.C0403j;
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
/* renamed from: android.support.v4.app.Fragment */
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener {

    /* renamed from: a */
    private static final C0173h<String, Class<?>> f117a = new C0173h<>();

    /* renamed from: j */
    static final Object f118j = new Object();

    /* renamed from: A */
    int f119A;

    /* renamed from: B */
    C0096p f120B;

    /* renamed from: C */
    AbstractC0093n f121C;

    /* renamed from: D */
    C0096p f122D;

    /* renamed from: E */
    Fragment f123E;

    /* renamed from: F */
    int f124F;

    /* renamed from: G */
    int f125G;

    /* renamed from: H */
    String f126H;

    /* renamed from: I */
    boolean f127I;

    /* renamed from: J */
    boolean f128J;

    /* renamed from: K */
    boolean f129K;

    /* renamed from: L */
    boolean f130L;

    /* renamed from: M */
    boolean f131M;

    /* renamed from: O */
    boolean f133O;

    /* renamed from: P */
    int f134P;

    /* renamed from: Q */
    ViewGroup f135Q;

    /* renamed from: R */
    View f136R;

    /* renamed from: S */
    View f137S;

    /* renamed from: T */
    boolean f138T;

    /* renamed from: V */
    C0119w f140V;

    /* renamed from: W */
    boolean f141W;

    /* renamed from: X */
    boolean f142X;

    /* renamed from: ae */
    Boolean f149ae;

    /* renamed from: af */
    Boolean f150af;

    /* renamed from: l */
    View f154l;

    /* renamed from: m */
    int f155m;

    /* renamed from: n */
    Bundle f156n;

    /* renamed from: o */
    SparseArray<Parcelable> f157o;

    /* renamed from: q */
    String f159q;

    /* renamed from: r */
    Bundle f160r;

    /* renamed from: s */
    Fragment f161s;

    /* renamed from: u */
    int f163u;

    /* renamed from: v */
    boolean f164v;

    /* renamed from: w */
    boolean f165w;

    /* renamed from: x */
    boolean f166x;

    /* renamed from: y */
    boolean f167y;

    /* renamed from: z */
    boolean f168z;

    /* renamed from: k */
    int f153k = 0;

    /* renamed from: p */
    int f158p = -1;

    /* renamed from: t */
    int f162t = -1;

    /* renamed from: N */
    boolean f132N = true;

    /* renamed from: U */
    boolean f139U = true;

    /* renamed from: Y */
    Object f143Y = null;

    /* renamed from: Z */
    Object f144Z = f118j;

    /* renamed from: aa */
    Object f145aa = null;

    /* renamed from: ab */
    Object f146ab = f118j;

    /* renamed from: ac */
    Object f147ac = null;

    /* renamed from: ad */
    Object f148ad = f118j;

    /* renamed from: ag */
    AbstractC0065aa f151ag = null;

    /* renamed from: ah */
    AbstractC0065aa f152ah = null;

    /* renamed from: android.support.v4.app.Fragment$SavedState */
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

        /* renamed from: a */
        final Bundle f170a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SavedState(Bundle bundle) {
            this.f170a = bundle;
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f170a = parcel.readBundle();
            if (classLoader != null && this.f170a != null) {
                this.f170a.setClassLoader(classLoader);
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f170a);
        }
    }

    /* renamed from: android.support.v4.app.Fragment$a */
    /* loaded from: classes.dex */
    public static class C0053a extends RuntimeException {
        public C0053a(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: a */
    public static Fragment m13776a(Context context, String str) {
        return m13775a(context, str, (Bundle) null);
    }

    /* renamed from: a */
    public static Fragment m13775a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = f117a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f117a.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.f160r = bundle;
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw new C0053a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0053a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new C0053a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m13763b(Context context, String str) {
        try {
            Class<?> cls = f117a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f117a.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m13750f(Bundle bundle) {
        if (this.f157o != null) {
            this.f137S.restoreHierarchyState(this.f157o);
            this.f157o = null;
        }
        this.f133O = false;
        m13746h(bundle);
        if (!this.f133O) {
            throw new C0066ab("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m13782a(int i, Fragment fragment) {
        this.f158p = i;
        if (fragment != null) {
            this.f159q = fragment.f159q + ":" + this.f158p;
        } else {
            this.f159q = "android:fragment:" + this.f158p;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m13749g() {
        return this.f119A > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) ItemInfo.APP_INTENT);
        C0163c.m13371a(this, sb);
        if (this.f158p >= 0) {
            sb.append(" #");
            sb.append(this.f158p);
        }
        if (this.f124F != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f124F));
        }
        if (this.f126H != null) {
            sb.append(" ");
            sb.append(this.f126H);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: g */
    public void m13748g(Bundle bundle) {
        if (this.f158p >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.f160r = bundle;
    }

    /* renamed from: h */
    public final Bundle m13747h() {
        return this.f160r;
    }

    /* renamed from: a */
    public void m13769a(SavedState savedState) {
        if (this.f158p >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.f156n = (savedState == null || savedState.f170a == null) ? null : savedState.f170a;
    }

    /* renamed from: i */
    public final FragmentActivity m13745i() {
        if (this.f121C == null) {
            return null;
        }
        return (FragmentActivity) this.f121C.m13579f();
    }

    /* renamed from: j */
    public final Resources m13743j() {
        if (this.f121C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        return this.f121C.m13578g().getResources();
    }

    /* renamed from: k */
    public final AbstractC0094o m13741k() {
        return this.f120B;
    }

    /* renamed from: l */
    public final AbstractC0094o m13739l() {
        if (this.f122D == null) {
            m13791D();
            if (this.f153k >= 5) {
                this.f122D.m13510n();
            } else if (this.f153k >= 4) {
                this.f122D.m13511m();
            } else if (this.f153k >= 2) {
                this.f122D.m13512l();
            } else if (this.f153k >= 1) {
                this.f122D.m13513k();
            }
        }
        return this.f122D;
    }

    /* renamed from: m */
    public final boolean m13738m() {
        return this.f121C != null && this.f164v;
    }

    /* renamed from: n */
    public final boolean m13737n() {
        return this.f128J;
    }

    /* renamed from: o */
    public final boolean m13736o() {
        return this.f127I;
    }

    /* renamed from: b */
    public void m13758b(boolean z) {
    }

    /* renamed from: c */
    public void m13755c(boolean z) {
        if (z && this.f123E != null) {
            throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
        }
        this.f129K = z;
    }

    /* renamed from: d */
    public void m13752d(boolean z) {
        if (this.f132N != z) {
            this.f132N = z;
            if (this.f131M && m13738m() && !m13736o()) {
                this.f121C.mo13582c();
            }
        }
    }

    /* renamed from: e */
    public void m13751e(boolean z) {
        if (!this.f139U && z && this.f153k < 4) {
            this.f120B.m13537b(this);
        }
        this.f139U = z;
        this.f138T = !z;
    }

    /* renamed from: a */
    public void m13774a(Intent intent) {
        m13771a(intent, (Bundle) null);
    }

    /* renamed from: a */
    public void m13771a(Intent intent, Bundle bundle) {
        if (this.f121C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f121C.mo13591a(this, intent, -1, bundle);
    }

    /* renamed from: a */
    public void m13773a(Intent intent, int i) {
        m13772a(intent, i, (Bundle) null);
    }

    /* renamed from: a */
    public void m13772a(Intent intent, int i, Bundle bundle) {
        if (this.f121C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f121C.mo13591a(this, intent, i, bundle);
    }

    /* renamed from: a */
    public void mo1168a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void m13780a(int i, String[] strArr, int[] iArr) {
    }

    /* renamed from: b */
    public LayoutInflater mo13631b(Bundle bundle) {
        LayoutInflater mo13585b = this.f121C.mo13585b();
        m13739l();
        C0403j.m12632a(mo13585b, this.f122D.m13503u());
        return mo13585b;
    }

    /* renamed from: a */
    public void m13777a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f133O = true;
        Activity m13579f = this.f121C == null ? null : this.f121C.m13579f();
        if (m13579f != null) {
            this.f133O = false;
            m13779a(m13579f, attributeSet, bundle);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void m13779a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f133O = true;
    }

    /* renamed from: a */
    public void m13778a(Context context) {
        this.f133O = true;
        Activity m13579f = this.f121C == null ? null : this.f121C.m13579f();
        if (m13579f != null) {
            this.f133O = false;
            mo13636a(m13579f);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo13636a(Activity activity) {
        this.f133O = true;
    }

    /* renamed from: a */
    public Animation m13781a(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: a */
    public void mo782a(Bundle bundle) {
        this.f133O = true;
    }

    /* renamed from: a */
    public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public void mo13465a(View view, Bundle bundle) {
    }

    /* renamed from: p */
    public View m13735p() {
        return this.f136R;
    }

    /* renamed from: d */
    public void mo6071d(Bundle bundle) {
        this.f133O = true;
    }

    /* renamed from: h */
    public void m13746h(Bundle bundle) {
        this.f133O = true;
    }

    /* renamed from: d */
    public void mo13629d() {
        this.f133O = true;
        if (!this.f141W) {
            this.f141W = true;
            if (!this.f142X) {
                this.f142X = true;
                this.f140V = this.f121C.m13587a(this.f159q, this.f141W, false);
            }
            if (this.f140V != null) {
                this.f140V.m13454b();
            }
        }
    }

    /* renamed from: q */
    public void mo976q() {
        this.f133O = true;
    }

    /* renamed from: e */
    public void mo13627e(Bundle bundle) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f133O = true;
    }

    /* renamed from: r */
    public void mo975r() {
        this.f133O = true;
    }

    /* renamed from: e */
    public void mo13628e() {
        this.f133O = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f133O = true;
    }

    /* renamed from: f */
    public void mo13462f() {
        this.f133O = true;
    }

    /* renamed from: s */
    public void mo974s() {
        this.f133O = true;
        if (!this.f142X) {
            this.f142X = true;
            this.f140V = this.f121C.m13587a(this.f159q, this.f141W, false);
        }
        if (this.f140V != null) {
            this.f140V.m13448h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m13734t() {
        this.f158p = -1;
        this.f159q = null;
        this.f164v = false;
        this.f165w = false;
        this.f166x = false;
        this.f167y = false;
        this.f168z = false;
        this.f119A = 0;
        this.f120B = null;
        this.f122D = null;
        this.f121C = null;
        this.f124F = 0;
        this.f125G = 0;
        this.f126H = null;
        this.f127I = false;
        this.f128J = false;
        this.f130L = false;
        this.f140V = null;
        this.f141W = false;
        this.f142X = false;
    }

    /* renamed from: c */
    public void mo983c() {
        this.f133O = true;
    }

    /* renamed from: a */
    public void m13767a(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: a */
    public void m13768a(Menu menu) {
    }

    /* renamed from: u */
    public void m13733u() {
    }

    /* renamed from: a */
    public boolean m13766a(MenuItem menuItem) {
        return false;
    }

    /* renamed from: b */
    public void m13761b(Menu menu) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m13745i().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    /* renamed from: b */
    public boolean m13759b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: v */
    public Object m13732v() {
        return this.f143Y;
    }

    /* renamed from: w */
    public Object m13731w() {
        return this.f144Z == f118j ? m13732v() : this.f144Z;
    }

    /* renamed from: x */
    public Object m13730x() {
        return this.f145aa;
    }

    /* renamed from: y */
    public Object m13729y() {
        return this.f146ab == f118j ? m13730x() : this.f146ab;
    }

    /* renamed from: z */
    public Object m13728z() {
        return this.f147ac;
    }

    /* renamed from: A */
    public Object m13794A() {
        return this.f148ad == f118j ? m13728z() : this.f148ad;
    }

    /* renamed from: B */
    public boolean m13793B() {
        if (this.f150af == null) {
            return true;
        }
        return this.f150af.booleanValue();
    }

    /* renamed from: C */
    public boolean m13792C() {
        if (this.f149ae == null) {
            return true;
        }
        return this.f149ae.booleanValue();
    }

    /* renamed from: a */
    public void m13764a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f124F));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f125G));
        printWriter.print(" mTag=");
        printWriter.println(this.f126H);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f153k);
        printWriter.print(" mIndex=");
        printWriter.print(this.f158p);
        printWriter.print(" mWho=");
        printWriter.print(this.f159q);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f119A);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f164v);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f165w);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f166x);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f167y);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f127I);
        printWriter.print(" mDetached=");
        printWriter.print(this.f128J);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f132N);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f131M);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f129K);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f130L);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f139U);
        if (this.f120B != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f120B);
        }
        if (this.f121C != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f121C);
        }
        if (this.f123E != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f123E);
        }
        if (this.f160r != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f160r);
        }
        if (this.f156n != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f156n);
        }
        if (this.f157o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f157o);
        }
        if (this.f161s != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f161s);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f163u);
        }
        if (this.f134P != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.f134P);
        }
        if (this.f135Q != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f135Q);
        }
        if (this.f136R != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f136R);
        }
        if (this.f137S != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f136R);
        }
        if (this.f154l != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.f154l);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.f155m);
        }
        if (this.f140V != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.f140V.m13455a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f122D != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f122D + ":");
            this.f122D.mo13541a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment m13765a(String str) {
        if (!str.equals(this.f159q)) {
            if (this.f122D != null) {
                return this.f122D.m13531b(str);
            }
            return null;
        }
        return this;
    }

    /* renamed from: D */
    void m13791D() {
        this.f122D = new C0096p();
        this.f122D.m13550a(this.f121C, new AbstractC0091l() { // from class: android.support.v4.app.Fragment.1
            @Override // android.support.p002v4.app.AbstractC0091l
            /* renamed from: a */
            public View mo13593a(int i) {
                if (Fragment.this.f136R == null) {
                    throw new IllegalStateException("Fragment does not have a view");
                }
                return Fragment.this.f136R.findViewById(i);
            }

            @Override // android.support.p002v4.app.AbstractC0091l
            /* renamed from: a */
            public boolean mo13594a() {
                return Fragment.this.f136R != null;
            }
        }, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m13744i(Bundle bundle) {
        Parcelable parcelable;
        if (this.f122D != null) {
            this.f122D.m13514j();
        }
        this.f153k = 1;
        this.f133O = false;
        mo782a(bundle);
        if (!this.f133O) {
            throw new C0066ab("Fragment " + this + " did not call through to super.onCreate()");
        }
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.f122D == null) {
                m13791D();
            }
            this.f122D.m13557a(parcelable, (List<Fragment>) null);
            this.f122D.m13513k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public View m13762b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f122D != null) {
            this.f122D.m13514j();
        }
        return mo781a(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m13742j(Bundle bundle) {
        if (this.f122D != null) {
            this.f122D.m13514j();
        }
        this.f153k = 2;
        this.f133O = false;
        mo6071d(bundle);
        if (!this.f133O) {
            throw new C0066ab("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        if (this.f122D != null) {
            this.f122D.m13512l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m13790E() {
        if (this.f122D != null) {
            this.f122D.m13514j();
            this.f122D.m13520f();
        }
        this.f153k = 4;
        this.f133O = false;
        mo13629d();
        if (!this.f133O) {
            throw new C0066ab("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.f122D != null) {
            this.f122D.m13511m();
        }
        if (this.f140V != null) {
            this.f140V.m13449g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m13789F() {
        if (this.f122D != null) {
            this.f122D.m13514j();
            this.f122D.m13520f();
        }
        this.f153k = 5;
        this.f133O = false;
        mo976q();
        if (!this.f133O) {
            throw new C0066ab("Fragment " + this + " did not call through to super.onResume()");
        }
        if (this.f122D != null) {
            this.f122D.m13510n();
            this.f122D.m13520f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13770a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f122D != null) {
            this.f122D.m13561a(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m13788G() {
        onLowMemory();
        if (this.f122D != null) {
            this.f122D.m13504t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m13760b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f127I) {
            return false;
        }
        if (this.f131M && this.f132N) {
            z = true;
            m13767a(menu, menuInflater);
        }
        if (this.f122D != null) {
            return z | this.f122D.m13548a(menu, menuInflater);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m13757c(Menu menu) {
        boolean z = false;
        if (this.f127I) {
            return false;
        }
        if (this.f131M && this.f132N) {
            z = true;
            m13768a(menu);
        }
        if (this.f122D != null) {
            return z | this.f122D.m13549a(menu);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m13756c(MenuItem menuItem) {
        if (!this.f127I) {
            if (this.f131M && this.f132N && m13766a(menuItem)) {
                return true;
            }
            if (this.f122D != null && this.f122D.m13547a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m13753d(MenuItem menuItem) {
        if (!this.f127I) {
            if (m13759b(menuItem)) {
                return true;
            }
            if (this.f122D != null && this.f122D.m13533b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m13754d(Menu menu) {
        if (!this.f127I) {
            if (this.f131M && this.f132N) {
                m13761b(menu);
            }
            if (this.f122D != null) {
                this.f122D.m13534b(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m13740k(Bundle bundle) {
        Parcelable m13515i;
        mo13627e(bundle);
        if (this.f122D != null && (m13515i = this.f122D.m13515i()) != null) {
            bundle.putParcelable("android:support:fragments", m13515i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m13787H() {
        if (this.f122D != null) {
            this.f122D.m13509o();
        }
        this.f153k = 4;
        this.f133O = false;
        mo975r();
        if (!this.f133O) {
            throw new C0066ab("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m13786I() {
        if (this.f122D != null) {
            this.f122D.m13508p();
        }
        this.f153k = 3;
        this.f133O = false;
        mo13628e();
        if (!this.f133O) {
            throw new C0066ab("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m13785J() {
        if (this.f122D != null) {
            this.f122D.m13507q();
        }
        this.f153k = 2;
        if (this.f141W) {
            this.f141W = false;
            if (!this.f142X) {
                this.f142X = true;
                this.f140V = this.f121C.m13587a(this.f159q, this.f141W, false);
            }
            if (this.f140V != null) {
                if (this.f121C.m13575j()) {
                    this.f140V.m13452d();
                } else {
                    this.f140V.m13453c();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m13784K() {
        if (this.f122D != null) {
            this.f122D.m13506r();
        }
        this.f153k = 1;
        this.f133O = false;
        mo13462f();
        if (!this.f133O) {
            throw new C0066ab("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        if (this.f140V != null) {
            this.f140V.m13450f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m13783L() {
        if (this.f122D != null) {
            this.f122D.m13505s();
        }
        this.f153k = 0;
        this.f133O = false;
        mo974s();
        if (!this.f133O) {
            throw new C0066ab("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }
}
