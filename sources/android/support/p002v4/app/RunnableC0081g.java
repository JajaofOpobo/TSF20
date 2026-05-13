package android.support.p002v4.app;

import android.os.Build;
import android.support.p002v4.app.C0107t;
import android.support.p002v4.p009d.C0160a;
import android.support.p002v4.p009d.C0164d;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.g */
/* loaded from: classes.dex */
public final class RunnableC0081g extends AbstractC0106s implements Runnable {

    /* renamed from: a */
    static final boolean f222a;

    /* renamed from: b */
    final C0096p f223b;

    /* renamed from: c */
    C0085a f224c;

    /* renamed from: d */
    C0085a f225d;

    /* renamed from: e */
    int f226e;

    /* renamed from: f */
    int f227f;

    /* renamed from: g */
    int f228g;

    /* renamed from: h */
    int f229h;

    /* renamed from: i */
    int f230i;

    /* renamed from: j */
    int f231j;

    /* renamed from: k */
    int f232k;

    /* renamed from: l */
    boolean f233l;

    /* renamed from: n */
    String f235n;

    /* renamed from: o */
    boolean f236o;

    /* renamed from: q */
    int f238q;

    /* renamed from: r */
    CharSequence f239r;

    /* renamed from: s */
    int f240s;

    /* renamed from: t */
    CharSequence f241t;

    /* renamed from: u */
    ArrayList<String> f242u;

    /* renamed from: v */
    ArrayList<String> f243v;

    /* renamed from: m */
    boolean f234m = true;

    /* renamed from: p */
    int f237p = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.g$a */
    /* loaded from: classes.dex */
    public static final class C0085a {

        /* renamed from: a */
        C0085a f259a;

        /* renamed from: b */
        C0085a f260b;

        /* renamed from: c */
        int f261c;

        /* renamed from: d */
        Fragment f262d;

        /* renamed from: e */
        int f263e;

        /* renamed from: f */
        int f264f;

        /* renamed from: g */
        int f265g;

        /* renamed from: h */
        int f266h;

        /* renamed from: i */
        ArrayList<Fragment> f267i;
    }

    static {
        f222a = Build.VERSION.SDK_INT >= 21;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) ItemInfo.APP_INTENT);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f237p >= 0) {
            sb.append(" #");
            sb.append(this.f237p);
        }
        if (this.f235n != null) {
            sb.append(" ");
            sb.append(this.f235n);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void m13651a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m13650a(str, printWriter, true);
    }

    /* renamed from: a */
    public void m13650a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f235n);
            printWriter.print(" mIndex=");
            printWriter.print(this.f237p);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f236o);
            if (this.f231j != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f231j));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f232k));
            }
            if (this.f227f != 0 || this.f228g != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f227f));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f228g));
            }
            if (this.f229h != 0 || this.f230i != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f229h));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f230i));
            }
            if (this.f238q != 0 || this.f239r != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f238q));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f239r);
            }
            if (this.f240s != 0 || this.f241t != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f240s));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f241t);
            }
        }
        if (this.f224c != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            int i = 0;
            C0085a c0085a = this.f224c;
            while (c0085a != null) {
                switch (c0085a.f261c) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + c0085a.f261c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c0085a.f262d);
                if (z) {
                    if (c0085a.f263e != 0 || c0085a.f264f != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0085a.f263e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0085a.f264f));
                    }
                    if (c0085a.f265g != 0 || c0085a.f266h != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0085a.f265g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0085a.f266h));
                    }
                }
                if (c0085a.f267i != null && c0085a.f267i.size() > 0) {
                    for (int i2 = 0; i2 < c0085a.f267i.size(); i2++) {
                        printWriter.print(str3);
                        if (c0085a.f267i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str3);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(c0085a.f267i.get(i2));
                    }
                }
                c0085a = c0085a.f259a;
                i++;
            }
        }
    }

    public RunnableC0081g(C0096p c0096p) {
        this.f223b = c0096p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13670a(C0085a c0085a) {
        if (this.f224c == null) {
            this.f225d = c0085a;
            this.f224c = c0085a;
        } else {
            c0085a.f260b = this.f225d;
            this.f225d.f259a = c0085a;
            this.f225d = c0085a;
        }
        c0085a.f263e = this.f227f;
        c0085a.f264f = this.f228g;
        c0085a.f265g = this.f229h;
        c0085a.f266h = this.f230i;
        this.f226e++;
    }

    @Override // android.support.p002v4.app.AbstractC0106s
    /* renamed from: a */
    public AbstractC0106s mo13494a(Fragment fragment, String str) {
        m13674a(0, fragment, str, 1);
        return this;
    }

    @Override // android.support.p002v4.app.AbstractC0106s
    /* renamed from: a */
    public AbstractC0106s mo13497a(int i, Fragment fragment) {
        m13674a(i, fragment, (String) null, 1);
        return this;
    }

    @Override // android.support.p002v4.app.AbstractC0106s
    /* renamed from: a */
    public AbstractC0106s mo13496a(int i, Fragment fragment, String str) {
        m13674a(i, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    private void m13674a(int i, Fragment fragment, String str, int i2) {
        fragment.f120B = this.f223b;
        if (str != null) {
            if (fragment.f126H != null && !str.equals(fragment.f126H)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f126H + " now " + str);
            }
            fragment.f126H = str;
        }
        if (i != 0) {
            if (fragment.f124F != 0 && fragment.f124F != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f124F + " now " + i);
            }
            fragment.f124F = i;
            fragment.f125G = i;
        }
        C0085a c0085a = new C0085a();
        c0085a.f261c = i2;
        c0085a.f262d = fragment;
        m13670a(c0085a);
    }

    @Override // android.support.p002v4.app.AbstractC0106s
    /* renamed from: a */
    public AbstractC0106s mo13495a(Fragment fragment) {
        C0085a c0085a = new C0085a();
        c0085a.f261c = 3;
        c0085a.f262d = fragment;
        m13670a(c0085a);
        return this;
    }

    @Override // android.support.p002v4.app.AbstractC0106s
    /* renamed from: b */
    public AbstractC0106s mo13492b(Fragment fragment) {
        C0085a c0085a = new C0085a();
        c0085a.f261c = 6;
        c0085a.f262d = fragment;
        m13670a(c0085a);
        return this;
    }

    @Override // android.support.p002v4.app.AbstractC0106s
    /* renamed from: c */
    public AbstractC0106s mo13491c(Fragment fragment) {
        C0085a c0085a = new C0085a();
        c0085a.f261c = 7;
        c0085a.f262d = fragment;
        m13670a(c0085a);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13675a(int i) {
        if (this.f233l) {
            if (C0096p.f297a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (C0085a c0085a = this.f224c; c0085a != null; c0085a = c0085a.f259a) {
                if (c0085a.f262d != null) {
                    c0085a.f262d.f119A += i;
                    if (C0096p.f297a) {
                        Log.v("FragmentManager", "Bump nesting of " + c0085a.f262d + " to " + c0085a.f262d.f119A);
                    }
                }
                if (c0085a.f267i != null) {
                    for (int size = c0085a.f267i.size() - 1; size >= 0; size--) {
                        Fragment fragment = c0085a.f267i.get(size);
                        fragment.f119A += i;
                        if (C0096p.f297a) {
                            Log.v("FragmentManager", "Bump nesting of " + fragment + " to " + fragment.f119A);
                        }
                    }
                }
            }
        }
    }

    @Override // android.support.p002v4.app.AbstractC0106s
    /* renamed from: a */
    public int mo13498a() {
        return m13648a(false);
    }

    @Override // android.support.p002v4.app.AbstractC0106s
    /* renamed from: b */
    public int mo13493b() {
        return m13648a(true);
    }

    /* renamed from: a */
    int m13648a(boolean z) {
        if (this.f236o) {
            throw new IllegalStateException("commit already called");
        }
        if (C0096p.f297a) {
            Log.v("FragmentManager", "Commit: " + this);
            m13651a("  ", (FileDescriptor) null, new PrintWriter(new C0164d("FragmentManager")), (String[]) null);
        }
        this.f236o = true;
        if (this.f233l) {
            this.f237p = this.f223b.m13551a(this);
        } else {
            this.f237p = -1;
        }
        this.f223b.m13544a(this, z);
        return this.f237p;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0086b c0086b;
        Fragment fragment;
        if (C0096p.f297a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (this.f233l && this.f237p < 0) {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        m13675a(1);
        if (!f222a || this.f223b.f311n < 1) {
            c0086b = null;
        } else {
            SparseArray<Fragment> sparseArray = new SparseArray<>();
            SparseArray<Fragment> sparseArray2 = new SparseArray<>();
            m13643b(sparseArray, sparseArray2);
            c0086b = m13654a(sparseArray, sparseArray2, false);
        }
        int i = c0086b != null ? 0 : this.f232k;
        int i2 = c0086b != null ? 0 : this.f231j;
        for (C0085a c0085a = this.f224c; c0085a != null; c0085a = c0085a.f259a) {
            int i3 = c0086b != null ? 0 : c0085a.f263e;
            int i4 = c0086b != null ? 0 : c0085a.f264f;
            switch (c0085a.f261c) {
                case 1:
                    Fragment fragment2 = c0085a.f262d;
                    fragment2.f134P = i3;
                    this.f223b.m13552a(fragment2, false);
                    break;
                case 2:
                    Fragment fragment3 = c0085a.f262d;
                    int i5 = fragment3.f125G;
                    if (this.f223b.f304g != null) {
                        int size = this.f223b.f304g.size() - 1;
                        while (size >= 0) {
                            Fragment fragment4 = this.f223b.f304g.get(size);
                            if (C0096p.f297a) {
                                Log.v("FragmentManager", "OP_REPLACE: adding=" + fragment3 + " old=" + fragment4);
                            }
                            if (fragment4.f125G == i5) {
                                if (fragment4 == fragment3) {
                                    fragment = null;
                                    c0085a.f262d = null;
                                    size--;
                                    fragment3 = fragment;
                                } else {
                                    if (c0085a.f267i == null) {
                                        c0085a.f267i = new ArrayList<>();
                                    }
                                    c0085a.f267i.add(fragment4);
                                    fragment4.f134P = i4;
                                    if (this.f233l) {
                                        fragment4.f119A++;
                                        if (C0096p.f297a) {
                                            Log.v("FragmentManager", "Bump nesting of " + fragment4 + " to " + fragment4.f119A);
                                        }
                                    }
                                    this.f223b.m13555a(fragment4, i2, i);
                                }
                            }
                            fragment = fragment3;
                            size--;
                            fragment3 = fragment;
                        }
                    }
                    if (fragment3 != null) {
                        fragment3.f134P = i3;
                        this.f223b.m13552a(fragment3, false);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    Fragment fragment5 = c0085a.f262d;
                    fragment5.f134P = i4;
                    this.f223b.m13555a(fragment5, i2, i);
                    break;
                case 4:
                    Fragment fragment6 = c0085a.f262d;
                    fragment6.f134P = i4;
                    this.f223b.m13536b(fragment6, i2, i);
                    break;
                case 5:
                    Fragment fragment7 = c0085a.f262d;
                    fragment7.f134P = i3;
                    this.f223b.m13527c(fragment7, i2, i);
                    break;
                case 6:
                    Fragment fragment8 = c0085a.f262d;
                    fragment8.f134P = i4;
                    this.f223b.m13524d(fragment8, i2, i);
                    break;
                case 7:
                    Fragment fragment9 = c0085a.f262d;
                    fragment9.f134P = i3;
                    this.f223b.m13521e(fragment9, i2, i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0085a.f261c);
            }
        }
        this.f223b.m13566a(this.f223b.f311n, i2, i, true);
        if (this.f233l) {
            this.f223b.m13535b(this);
        }
    }

    /* renamed from: a */
    private static void m13655a(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2, Fragment fragment) {
        int i;
        if (fragment != null && (i = fragment.f125G) != 0 && !fragment.m13736o()) {
            if (fragment.m13738m() && fragment.m13735p() != null && sparseArray.get(i) == null) {
                sparseArray.put(i, fragment);
            }
            if (sparseArray2.get(i) == fragment) {
                sparseArray2.remove(i);
            }
        }
    }

    /* renamed from: b */
    private void m13642b(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2, Fragment fragment) {
        if (fragment != null) {
            int i = fragment.f125G;
            if (i != 0) {
                if (!fragment.m13738m()) {
                    sparseArray2.put(i, fragment);
                }
                if (sparseArray.get(i) == fragment) {
                    sparseArray.remove(i);
                }
            }
            if (fragment.f153k < 1 && this.f223b.f311n >= 1) {
                this.f223b.m13525d(fragment);
                this.f223b.m13554a(fragment, 1, 0, 0, false);
            }
        }
    }

    /* renamed from: b */
    private void m13643b(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (this.f223b.f313p.mo13594a()) {
            for (C0085a c0085a = this.f224c; c0085a != null; c0085a = c0085a.f259a) {
                switch (c0085a.f261c) {
                    case 1:
                        m13642b(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                    case 2:
                        Fragment fragment = c0085a.f262d;
                        if (this.f223b.f304g != null) {
                            int i = 0;
                            Fragment fragment2 = fragment;
                            while (true) {
                                int i2 = i;
                                if (i2 < this.f223b.f304g.size()) {
                                    Fragment fragment3 = this.f223b.f304g.get(i2);
                                    if (fragment2 == null || fragment3.f125G == fragment2.f125G) {
                                        if (fragment3 == fragment2) {
                                            fragment2 = null;
                                            sparseArray2.remove(fragment3.f125G);
                                        } else {
                                            m13655a(sparseArray, sparseArray2, fragment3);
                                        }
                                    }
                                    i = i2 + 1;
                                }
                            }
                        }
                        m13642b(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                    case 3:
                        m13655a(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                    case 4:
                        m13655a(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                    case 5:
                        m13642b(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                    case 6:
                        m13655a(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                    case 7:
                        m13642b(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                }
            }
        }
    }

    /* renamed from: a */
    public void m13656a(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (this.f223b.f313p.mo13594a()) {
            for (C0085a c0085a = this.f225d; c0085a != null; c0085a = c0085a.f260b) {
                switch (c0085a.f261c) {
                    case 1:
                        m13655a(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                    case 2:
                        if (c0085a.f267i != null) {
                            for (int size = c0085a.f267i.size() - 1; size >= 0; size--) {
                                m13642b(sparseArray, sparseArray2, c0085a.f267i.get(size));
                            }
                        }
                        m13655a(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                    case 3:
                        m13642b(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                    case 4:
                        m13642b(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                    case 5:
                        m13655a(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                    case 6:
                        m13642b(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                    case 7:
                        m13655a(sparseArray, sparseArray2, c0085a.f262d);
                        break;
                }
            }
        }
    }

    /* renamed from: a */
    public C0086b m13647a(boolean z, C0086b c0086b, SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (C0096p.f297a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            m13651a("  ", (FileDescriptor) null, new PrintWriter(new C0164d("FragmentManager")), (String[]) null);
        }
        if (f222a && this.f223b.f311n >= 1) {
            if (c0086b == null) {
                if (sparseArray.size() != 0 || sparseArray2.size() != 0) {
                    c0086b = m13654a(sparseArray, sparseArray2, true);
                }
            } else if (!z) {
                m13664a(c0086b, this.f243v, this.f242u);
            }
        }
        m13675a(-1);
        int i = c0086b != null ? 0 : this.f232k;
        int i2 = c0086b != null ? 0 : this.f231j;
        for (C0085a c0085a = this.f225d; c0085a != null; c0085a = c0085a.f260b) {
            int i3 = c0086b != null ? 0 : c0085a.f265g;
            int i4 = c0086b != null ? 0 : c0085a.f266h;
            switch (c0085a.f261c) {
                case 1:
                    Fragment fragment = c0085a.f262d;
                    fragment.f134P = i4;
                    this.f223b.m13555a(fragment, C0096p.m13529c(i2), i);
                    break;
                case 2:
                    Fragment fragment2 = c0085a.f262d;
                    if (fragment2 != null) {
                        fragment2.f134P = i4;
                        this.f223b.m13555a(fragment2, C0096p.m13529c(i2), i);
                    }
                    if (c0085a.f267i != null) {
                        for (int i5 = 0; i5 < c0085a.f267i.size(); i5++) {
                            Fragment fragment3 = c0085a.f267i.get(i5);
                            fragment3.f134P = i3;
                            this.f223b.m13552a(fragment3, false);
                        }
                        break;
                    } else {
                        break;
                    }
                case 3:
                    Fragment fragment4 = c0085a.f262d;
                    fragment4.f134P = i3;
                    this.f223b.m13552a(fragment4, false);
                    break;
                case 4:
                    Fragment fragment5 = c0085a.f262d;
                    fragment5.f134P = i3;
                    this.f223b.m13527c(fragment5, C0096p.m13529c(i2), i);
                    break;
                case 5:
                    Fragment fragment6 = c0085a.f262d;
                    fragment6.f134P = i4;
                    this.f223b.m13536b(fragment6, C0096p.m13529c(i2), i);
                    break;
                case 6:
                    Fragment fragment7 = c0085a.f262d;
                    fragment7.f134P = i3;
                    this.f223b.m13521e(fragment7, C0096p.m13529c(i2), i);
                    break;
                case 7:
                    Fragment fragment8 = c0085a.f262d;
                    fragment8.f134P = i3;
                    this.f223b.m13524d(fragment8, C0096p.m13529c(i2), i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0085a.f261c);
            }
        }
        if (z) {
            this.f223b.m13566a(this.f223b.f311n, C0096p.m13529c(i2), i, true);
            c0086b = null;
        }
        if (this.f237p >= 0) {
            this.f223b.m13539b(this.f237p);
            this.f237p = -1;
        }
        return c0086b;
    }

    /* renamed from: c */
    public String m13641c() {
        return this.f235n;
    }

    /* renamed from: a */
    private C0086b m13654a(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2, boolean z) {
        C0086b c0086b = new C0086b();
        c0086b.f271d = new View(this.f223b.f312o.m13578g());
        int i = 0;
        boolean z2 = false;
        while (i < sparseArray.size()) {
            boolean z3 = m13673a(sparseArray.keyAt(i), c0086b, z, sparseArray, sparseArray2) ? true : z2;
            i++;
            z2 = z3;
        }
        for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
            int keyAt = sparseArray2.keyAt(i2);
            if (sparseArray.get(keyAt) == null && m13673a(keyAt, c0086b, z, sparseArray, sparseArray2)) {
                z2 = true;
            }
        }
        if (!z2) {
            return null;
        }
        return c0086b;
    }

    /* renamed from: a */
    private static Object m13671a(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return C0107t.m13485a(z ? fragment.m13729y() : fragment.m13732v());
    }

    /* renamed from: b */
    private static Object m13646b(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return C0107t.m13485a(z ? fragment.m13731w() : fragment.m13730x());
    }

    /* renamed from: a */
    private static Object m13672a(Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return C0107t.m13471b(z ? fragment2.m13794A() : fragment.m13728z());
    }

    /* renamed from: a */
    private static Object m13652a(Object obj, Fragment fragment, ArrayList<View> arrayList, C0160a<String, View> c0160a, View view) {
        if (obj != null) {
            return C0107t.m13483a(obj, fragment.m13735p(), arrayList, c0160a, view);
        }
        return obj;
    }

    /* renamed from: a */
    private C0160a<String, View> m13667a(C0086b c0086b, Fragment fragment, boolean z) {
        C0160a<String, View> c0160a = new C0160a<>();
        if (this.f242u != null) {
            C0107t.m13473a((Map<String, View>) c0160a, fragment.m13735p());
            if (z) {
                c0160a.m13379a((Collection<?>) this.f243v);
            } else {
                c0160a = m13649a(this.f242u, this.f243v, c0160a);
            }
        }
        if (z) {
            if (fragment.f151ag != null) {
                fragment.f151ag.m13695a(this.f243v, c0160a);
            }
            m13666a(c0086b, c0160a, false);
        } else {
            if (fragment.f152ah != null) {
                fragment.f152ah.m13695a(this.f243v, c0160a);
            }
            m13644b(c0086b, c0160a, false);
        }
        return c0160a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143 A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m13673a(int r34, android.support.p002v4.app.RunnableC0081g.C0086b r35, boolean r36, android.util.SparseArray<android.support.p002v4.app.Fragment> r37, android.util.SparseArray<android.support.p002v4.app.Fragment> r38) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.app.RunnableC0081g.m13673a(int, android.support.v4.app.g$b, boolean, android.util.SparseArray, android.util.SparseArray):boolean");
    }

    /* renamed from: a */
    private void m13665a(final C0086b c0086b, final View view, final Object obj, final Fragment fragment, final Fragment fragment2, final boolean z, final ArrayList<View> arrayList) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.v4.app.g.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                if (obj != null) {
                    C0107t.m13478a(obj, arrayList);
                    arrayList.clear();
                    C0160a m13663a = RunnableC0081g.this.m13663a(c0086b, z, fragment);
                    C0107t.m13482a(obj, c0086b.f271d, m13663a, arrayList);
                    RunnableC0081g.this.m13658a(m13663a, c0086b);
                    RunnableC0081g.this.m13668a(c0086b, fragment, fragment2, z, m13663a);
                    return true;
                }
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m13668a(C0086b c0086b, Fragment fragment, Fragment fragment2, boolean z, C0160a<String, View> c0160a) {
        AbstractC0065aa abstractC0065aa = z ? fragment2.f151ag : fragment.f151ag;
        if (abstractC0065aa != null) {
            abstractC0065aa.m13694b(new ArrayList(c0160a.keySet()), new ArrayList(c0160a.values()), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m13658a(C0160a<String, View> c0160a, C0086b c0086b) {
        View view;
        if (this.f243v != null && !c0160a.isEmpty() && (view = c0160a.get(this.f243v.get(0))) != null) {
            c0086b.f270c.f364a = view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C0160a<String, View> m13663a(C0086b c0086b, boolean z, Fragment fragment) {
        C0160a<String, View> m13645b = m13645b(c0086b, fragment, z);
        if (z) {
            if (fragment.f152ah != null) {
                fragment.f152ah.m13695a(this.f243v, m13645b);
            }
            m13666a(c0086b, m13645b, true);
        } else {
            if (fragment.f151ag != null) {
                fragment.f151ag.m13695a(this.f243v, m13645b);
            }
            m13644b(c0086b, m13645b, true);
        }
        return m13645b;
    }

    /* renamed from: a */
    private static C0160a<String, View> m13649a(ArrayList<String> arrayList, ArrayList<String> arrayList2, C0160a<String, View> c0160a) {
        if (!c0160a.isEmpty()) {
            C0160a<String, View> c0160a2 = new C0160a<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = c0160a.get(arrayList.get(i));
                if (view != null) {
                    c0160a2.put(arrayList2.get(i), view);
                }
            }
            return c0160a2;
        }
        return c0160a;
    }

    /* renamed from: b */
    private C0160a<String, View> m13645b(C0086b c0086b, Fragment fragment, boolean z) {
        C0160a<String, View> c0160a = new C0160a<>();
        View m13735p = fragment.m13735p();
        if (m13735p != null && this.f242u != null) {
            C0107t.m13473a((Map<String, View>) c0160a, m13735p);
            if (z) {
                return m13649a(this.f242u, this.f243v, c0160a);
            }
            c0160a.m13379a((Collection<?>) this.f243v);
            return c0160a;
        }
        return c0160a;
    }

    /* renamed from: a */
    private void m13653a(final View view, final C0086b c0086b, final int i, final Object obj) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.v4.app.g.3
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                RunnableC0081g.this.m13669a(c0086b, i, obj);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m13669a(C0086b c0086b, int i, Object obj) {
        if (this.f223b.f304g != null) {
            for (int i2 = 0; i2 < this.f223b.f304g.size(); i2++) {
                Fragment fragment = this.f223b.f304g.get(i2);
                if (fragment.f136R != null && fragment.f135Q != null && fragment.f125G == i) {
                    if (fragment.f127I) {
                        if (!c0086b.f269b.contains(fragment.f136R)) {
                            C0107t.m13481a(obj, fragment.f136R, true);
                            c0086b.f269b.add(fragment.f136R);
                        }
                    } else {
                        C0107t.m13481a(obj, fragment.f136R, false);
                        c0086b.f269b.remove(fragment.f136R);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m13657a(C0160a<String, String> c0160a, String str, String str2) {
        if (str != null && str2 != null) {
            for (int i = 0; i < c0160a.size(); i++) {
                if (str.equals(c0160a.m13326c(i))) {
                    c0160a.m13332a(i, (int) str2);
                    return;
                }
            }
            c0160a.put(str, str2);
        }
    }

    /* renamed from: a */
    private static void m13664a(C0086b c0086b, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (arrayList != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < arrayList.size()) {
                    m13657a(c0086b.f268a, arrayList.get(i2), arrayList2.get(i2));
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m13666a(C0086b c0086b, C0160a<String, View> c0160a, boolean z) {
        int size = this.f243v == null ? 0 : this.f243v.size();
        for (int i = 0; i < size; i++) {
            String str = this.f242u.get(i);
            View view = c0160a.get(this.f243v.get(i));
            if (view != null) {
                String m13488a = C0107t.m13488a(view);
                if (z) {
                    m13657a(c0086b.f268a, str, m13488a);
                } else {
                    m13657a(c0086b.f268a, m13488a, str);
                }
            }
        }
    }

    /* renamed from: b */
    private void m13644b(C0086b c0086b, C0160a<String, View> c0160a, boolean z) {
        int size = c0160a.size();
        for (int i = 0; i < size; i++) {
            String b = c0160a.m13328b(i);
            String m13488a = C0107t.m13488a(c0160a.m13326c(i));
            if (z) {
                m13657a(c0086b.f268a, b, m13488a);
            } else {
                m13657a(c0086b.f268a, m13488a, b);
            }
        }
    }

    /* renamed from: android.support.v4.app.g$b */
    /* loaded from: classes.dex */
    public class C0086b {

        /* renamed from: a */
        public C0160a<String, String> f268a = new C0160a<>();

        /* renamed from: b */
        public ArrayList<View> f269b = new ArrayList<>();

        /* renamed from: c */
        public C0107t.C0112a f270c = new C0107t.C0112a();

        /* renamed from: d */
        public View f271d;

        public C0086b() {
        }
    }
}
