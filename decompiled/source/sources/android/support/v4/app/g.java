package android.support.v4.app;

import android.os.Build;
import android.support.v4.app.t;
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
/* loaded from: classes.dex */
public final class g extends s implements Runnable {
    static final boolean a;
    final p b;
    a c;
    a d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    boolean l;
    String n;
    boolean o;
    int q;
    CharSequence r;
    int s;
    CharSequence t;
    ArrayList<String> u;
    ArrayList<String> v;
    boolean m = true;
    int p = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        a a;
        a b;
        int c;
        Fragment d;
        int e;
        int f;
        int g;
        int h;
        ArrayList<Fragment> i;
    }

    static {
        a = Build.VERSION.SDK_INT >= 21;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) ItemInfo.APP_INTENT);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.p >= 0) {
            sb.append(" #");
            sb.append(this.p);
        }
        if (this.n != null) {
            sb.append(" ");
            sb.append(this.n);
        }
        sb.append("}");
        return sb.toString();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.n);
            printWriter.print(" mIndex=");
            printWriter.print(this.p);
            printWriter.print(" mCommitted=");
            printWriter.println(this.o);
            if (this.j != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.k));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.h != 0 || this.i != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.h));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.i));
            }
            if (this.q != 0 || this.r != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.q));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.r);
            }
            if (this.s != 0 || this.t != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.s));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.t);
            }
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            int i = 0;
            a aVar = this.c;
            while (aVar != null) {
                switch (aVar.c) {
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
                        str2 = "cmd=" + aVar.c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.d);
                if (z) {
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                    if (aVar.g != 0 || aVar.h != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.h));
                    }
                }
                if (aVar.i != null && aVar.i.size() > 0) {
                    for (int i2 = 0; i2 < aVar.i.size(); i2++) {
                        printWriter.print(str3);
                        if (aVar.i.size() == 1) {
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
                        printWriter.println(aVar.i.get(i2));
                    }
                }
                aVar = aVar.a;
                i++;
            }
        }
    }

    public g(p pVar) {
        this.b = pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        if (this.c == null) {
            this.d = aVar;
            this.c = aVar;
        } else {
            aVar.b = this.d;
            this.d.a = aVar;
            this.d = aVar;
        }
        aVar.e = this.f;
        aVar.f = this.g;
        aVar.g = this.h;
        aVar.h = this.i;
        this.e++;
    }

    @Override // android.support.v4.app.s
    public s a(Fragment fragment, String str) {
        a(0, fragment, str, 1);
        return this;
    }

    @Override // android.support.v4.app.s
    public s a(int i, Fragment fragment) {
        a(i, fragment, (String) null, 1);
        return this;
    }

    @Override // android.support.v4.app.s
    public s a(int i, Fragment fragment, String str) {
        a(i, fragment, str, 1);
        return this;
    }

    private void a(int i, Fragment fragment, String str, int i2) {
        fragment.B = this.b;
        if (str != null) {
            if (fragment.H != null && !str.equals(fragment.H)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.H + " now " + str);
            }
            fragment.H = str;
        }
        if (i != 0) {
            if (fragment.F != 0 && fragment.F != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.F + " now " + i);
            }
            fragment.F = i;
            fragment.G = i;
        }
        a aVar = new a();
        aVar.c = i2;
        aVar.d = fragment;
        a(aVar);
    }

    @Override // android.support.v4.app.s
    public s a(Fragment fragment) {
        a aVar = new a();
        aVar.c = 3;
        aVar.d = fragment;
        a(aVar);
        return this;
    }

    @Override // android.support.v4.app.s
    public s b(Fragment fragment) {
        a aVar = new a();
        aVar.c = 6;
        aVar.d = fragment;
        a(aVar);
        return this;
    }

    @Override // android.support.v4.app.s
    public s c(Fragment fragment) {
        a aVar = new a();
        aVar.c = 7;
        aVar.d = fragment;
        a(aVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        if (this.l) {
            if (p.a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (a aVar = this.c; aVar != null; aVar = aVar.a) {
                if (aVar.d != null) {
                    aVar.d.A += i;
                    if (p.a) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.d + " to " + aVar.d.A);
                    }
                }
                if (aVar.i != null) {
                    for (int size = aVar.i.size() - 1; size >= 0; size--) {
                        Fragment fragment = aVar.i.get(size);
                        fragment.A += i;
                        if (p.a) {
                            Log.v("FragmentManager", "Bump nesting of " + fragment + " to " + fragment.A);
                        }
                    }
                }
            }
        }
    }

    @Override // android.support.v4.app.s
    public int a() {
        return a(false);
    }

    @Override // android.support.v4.app.s
    public int b() {
        return a(true);
    }

    int a(boolean z) {
        if (this.o) {
            throw new IllegalStateException("commit already called");
        }
        if (p.a) {
            Log.v("FragmentManager", "Commit: " + this);
            a("  ", (FileDescriptor) null, new PrintWriter(new android.support.v4.d.d("FragmentManager")), (String[]) null);
        }
        this.o = true;
        if (this.l) {
            this.p = this.b.a(this);
        } else {
            this.p = -1;
        }
        this.b.a(this, z);
        return this.p;
    }

    @Override // java.lang.Runnable
    public void run() {
        b bVar;
        Fragment fragment;
        if (p.a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (this.l && this.p < 0) {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        a(1);
        if (!a || this.b.n < 1) {
            bVar = null;
        } else {
            SparseArray<Fragment> sparseArray = new SparseArray<>();
            SparseArray<Fragment> sparseArray2 = new SparseArray<>();
            b(sparseArray, sparseArray2);
            bVar = a(sparseArray, sparseArray2, false);
        }
        int i = bVar != null ? 0 : this.k;
        int i2 = bVar != null ? 0 : this.j;
        for (a aVar = this.c; aVar != null; aVar = aVar.a) {
            int i3 = bVar != null ? 0 : aVar.e;
            int i4 = bVar != null ? 0 : aVar.f;
            switch (aVar.c) {
                case 1:
                    Fragment fragment2 = aVar.d;
                    fragment2.P = i3;
                    this.b.a(fragment2, false);
                    break;
                case 2:
                    Fragment fragment3 = aVar.d;
                    int i5 = fragment3.G;
                    if (this.b.g != null) {
                        int size = this.b.g.size() - 1;
                        while (size >= 0) {
                            Fragment fragment4 = this.b.g.get(size);
                            if (p.a) {
                                Log.v("FragmentManager", "OP_REPLACE: adding=" + fragment3 + " old=" + fragment4);
                            }
                            if (fragment4.G == i5) {
                                if (fragment4 == fragment3) {
                                    fragment = null;
                                    aVar.d = null;
                                    size--;
                                    fragment3 = fragment;
                                } else {
                                    if (aVar.i == null) {
                                        aVar.i = new ArrayList<>();
                                    }
                                    aVar.i.add(fragment4);
                                    fragment4.P = i4;
                                    if (this.l) {
                                        fragment4.A++;
                                        if (p.a) {
                                            Log.v("FragmentManager", "Bump nesting of " + fragment4 + " to " + fragment4.A);
                                        }
                                    }
                                    this.b.a(fragment4, i2, i);
                                }
                            }
                            fragment = fragment3;
                            size--;
                            fragment3 = fragment;
                        }
                    }
                    if (fragment3 != null) {
                        fragment3.P = i3;
                        this.b.a(fragment3, false);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    Fragment fragment5 = aVar.d;
                    fragment5.P = i4;
                    this.b.a(fragment5, i2, i);
                    break;
                case 4:
                    Fragment fragment6 = aVar.d;
                    fragment6.P = i4;
                    this.b.b(fragment6, i2, i);
                    break;
                case 5:
                    Fragment fragment7 = aVar.d;
                    fragment7.P = i3;
                    this.b.c(fragment7, i2, i);
                    break;
                case 6:
                    Fragment fragment8 = aVar.d;
                    fragment8.P = i4;
                    this.b.d(fragment8, i2, i);
                    break;
                case 7:
                    Fragment fragment9 = aVar.d;
                    fragment9.P = i3;
                    this.b.e(fragment9, i2, i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.c);
            }
        }
        this.b.a(this.b.n, i2, i, true);
        if (this.l) {
            this.b.b(this);
        }
    }

    private static void a(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2, Fragment fragment) {
        int i;
        if (fragment != null && (i = fragment.G) != 0 && !fragment.o()) {
            if (fragment.m() && fragment.p() != null && sparseArray.get(i) == null) {
                sparseArray.put(i, fragment);
            }
            if (sparseArray2.get(i) == fragment) {
                sparseArray2.remove(i);
            }
        }
    }

    private void b(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2, Fragment fragment) {
        if (fragment != null) {
            int i = fragment.G;
            if (i != 0) {
                if (!fragment.m()) {
                    sparseArray2.put(i, fragment);
                }
                if (sparseArray.get(i) == fragment) {
                    sparseArray.remove(i);
                }
            }
            if (fragment.k < 1 && this.b.n >= 1) {
                this.b.d(fragment);
                this.b.a(fragment, 1, 0, 0, false);
            }
        }
    }

    private void b(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (this.b.p.a()) {
            for (a aVar = this.c; aVar != null; aVar = aVar.a) {
                switch (aVar.c) {
                    case 1:
                        b(sparseArray, sparseArray2, aVar.d);
                        break;
                    case 2:
                        Fragment fragment = aVar.d;
                        if (this.b.g != null) {
                            int i = 0;
                            Fragment fragment2 = fragment;
                            while (true) {
                                int i2 = i;
                                if (i2 < this.b.g.size()) {
                                    Fragment fragment3 = this.b.g.get(i2);
                                    if (fragment2 == null || fragment3.G == fragment2.G) {
                                        if (fragment3 == fragment2) {
                                            fragment2 = null;
                                            sparseArray2.remove(fragment3.G);
                                        } else {
                                            a(sparseArray, sparseArray2, fragment3);
                                        }
                                    }
                                    i = i2 + 1;
                                }
                            }
                        }
                        b(sparseArray, sparseArray2, aVar.d);
                        break;
                    case 3:
                        a(sparseArray, sparseArray2, aVar.d);
                        break;
                    case 4:
                        a(sparseArray, sparseArray2, aVar.d);
                        break;
                    case 5:
                        b(sparseArray, sparseArray2, aVar.d);
                        break;
                    case 6:
                        a(sparseArray, sparseArray2, aVar.d);
                        break;
                    case 7:
                        b(sparseArray, sparseArray2, aVar.d);
                        break;
                }
            }
        }
    }

    public void a(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (this.b.p.a()) {
            for (a aVar = this.d; aVar != null; aVar = aVar.b) {
                switch (aVar.c) {
                    case 1:
                        a(sparseArray, sparseArray2, aVar.d);
                        break;
                    case 2:
                        if (aVar.i != null) {
                            for (int size = aVar.i.size() - 1; size >= 0; size--) {
                                b(sparseArray, sparseArray2, aVar.i.get(size));
                            }
                        }
                        a(sparseArray, sparseArray2, aVar.d);
                        break;
                    case 3:
                        b(sparseArray, sparseArray2, aVar.d);
                        break;
                    case 4:
                        b(sparseArray, sparseArray2, aVar.d);
                        break;
                    case 5:
                        a(sparseArray, sparseArray2, aVar.d);
                        break;
                    case 6:
                        b(sparseArray, sparseArray2, aVar.d);
                        break;
                    case 7:
                        a(sparseArray, sparseArray2, aVar.d);
                        break;
                }
            }
        }
    }

    public b a(boolean z, b bVar, SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (p.a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            a("  ", (FileDescriptor) null, new PrintWriter(new android.support.v4.d.d("FragmentManager")), (String[]) null);
        }
        if (a && this.b.n >= 1) {
            if (bVar == null) {
                if (sparseArray.size() != 0 || sparseArray2.size() != 0) {
                    bVar = a(sparseArray, sparseArray2, true);
                }
            } else if (!z) {
                a(bVar, this.v, this.u);
            }
        }
        a(-1);
        int i = bVar != null ? 0 : this.k;
        int i2 = bVar != null ? 0 : this.j;
        for (a aVar = this.d; aVar != null; aVar = aVar.b) {
            int i3 = bVar != null ? 0 : aVar.g;
            int i4 = bVar != null ? 0 : aVar.h;
            switch (aVar.c) {
                case 1:
                    Fragment fragment = aVar.d;
                    fragment.P = i4;
                    this.b.a(fragment, p.c(i2), i);
                    break;
                case 2:
                    Fragment fragment2 = aVar.d;
                    if (fragment2 != null) {
                        fragment2.P = i4;
                        this.b.a(fragment2, p.c(i2), i);
                    }
                    if (aVar.i != null) {
                        for (int i5 = 0; i5 < aVar.i.size(); i5++) {
                            Fragment fragment3 = aVar.i.get(i5);
                            fragment3.P = i3;
                            this.b.a(fragment3, false);
                        }
                        break;
                    } else {
                        break;
                    }
                case 3:
                    Fragment fragment4 = aVar.d;
                    fragment4.P = i3;
                    this.b.a(fragment4, false);
                    break;
                case 4:
                    Fragment fragment5 = aVar.d;
                    fragment5.P = i3;
                    this.b.c(fragment5, p.c(i2), i);
                    break;
                case 5:
                    Fragment fragment6 = aVar.d;
                    fragment6.P = i4;
                    this.b.b(fragment6, p.c(i2), i);
                    break;
                case 6:
                    Fragment fragment7 = aVar.d;
                    fragment7.P = i3;
                    this.b.e(fragment7, p.c(i2), i);
                    break;
                case 7:
                    Fragment fragment8 = aVar.d;
                    fragment8.P = i3;
                    this.b.d(fragment8, p.c(i2), i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.c);
            }
        }
        if (z) {
            this.b.a(this.b.n, p.c(i2), i, true);
            bVar = null;
        }
        if (this.p >= 0) {
            this.b.b(this.p);
            this.p = -1;
        }
        return bVar;
    }

    public String c() {
        return this.n;
    }

    private b a(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2, boolean z) {
        b bVar = new b();
        bVar.d = new View(this.b.o.g());
        int i = 0;
        boolean z2 = false;
        while (i < sparseArray.size()) {
            boolean z3 = a(sparseArray.keyAt(i), bVar, z, sparseArray, sparseArray2) ? true : z2;
            i++;
            z2 = z3;
        }
        for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
            int keyAt = sparseArray2.keyAt(i2);
            if (sparseArray.get(keyAt) == null && a(keyAt, bVar, z, sparseArray, sparseArray2)) {
                z2 = true;
            }
        }
        if (!z2) {
            return null;
        }
        return bVar;
    }

    private static Object a(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return t.a(z ? fragment.y() : fragment.v());
    }

    private static Object b(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return t.a(z ? fragment.w() : fragment.x());
    }

    private static Object a(Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return t.b(z ? fragment2.A() : fragment.z());
    }

    private static Object a(Object obj, Fragment fragment, ArrayList<View> arrayList, android.support.v4.d.a<String, View> aVar, View view) {
        if (obj != null) {
            return t.a(obj, fragment.p(), arrayList, aVar, view);
        }
        return obj;
    }

    private android.support.v4.d.a<String, View> a(b bVar, Fragment fragment, boolean z) {
        android.support.v4.d.a<String, View> aVar = new android.support.v4.d.a<>();
        if (this.u != null) {
            t.a((Map<String, View>) aVar, fragment.p());
            if (z) {
                aVar.a((Collection<?>) this.v);
            } else {
                aVar = a(this.u, this.v, aVar);
            }
        }
        if (z) {
            if (fragment.ag != null) {
                fragment.ag.a(this.v, aVar);
            }
            a(bVar, aVar, false);
        } else {
            if (fragment.ah != null) {
                fragment.ah.a(this.v, aVar);
            }
            b(bVar, aVar, false);
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(int r34, android.support.v4.app.g.b r35, boolean r36, android.util.SparseArray<android.support.v4.app.Fragment> r37, android.util.SparseArray<android.support.v4.app.Fragment> r38) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.g.a(int, android.support.v4.app.g$b, boolean, android.util.SparseArray, android.util.SparseArray):boolean");
    }

    private void a(final b bVar, final View view, final Object obj, final Fragment fragment, final Fragment fragment2, final boolean z, final ArrayList<View> arrayList) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.v4.app.g.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                if (obj != null) {
                    t.a(obj, arrayList);
                    arrayList.clear();
                    android.support.v4.d.a a2 = g.this.a(bVar, z, fragment);
                    t.a(obj, bVar.d, a2, arrayList);
                    g.this.a(a2, bVar);
                    g.this.a(bVar, fragment, fragment2, z, a2);
                    return true;
                }
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Fragment fragment, Fragment fragment2, boolean z, android.support.v4.d.a<String, View> aVar) {
        aa aaVar = z ? fragment2.ag : fragment.ag;
        if (aaVar != null) {
            aaVar.b(new ArrayList(aVar.keySet()), new ArrayList(aVar.values()), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.support.v4.d.a<String, View> aVar, b bVar) {
        View view;
        if (this.v != null && !aVar.isEmpty() && (view = aVar.get(this.v.get(0))) != null) {
            bVar.c.a = view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.support.v4.d.a<String, View> a(b bVar, boolean z, Fragment fragment) {
        android.support.v4.d.a<String, View> b2 = b(bVar, fragment, z);
        if (z) {
            if (fragment.ah != null) {
                fragment.ah.a(this.v, b2);
            }
            a(bVar, b2, true);
        } else {
            if (fragment.ag != null) {
                fragment.ag.a(this.v, b2);
            }
            b(bVar, b2, true);
        }
        return b2;
    }

    private static android.support.v4.d.a<String, View> a(ArrayList<String> arrayList, ArrayList<String> arrayList2, android.support.v4.d.a<String, View> aVar) {
        if (!aVar.isEmpty()) {
            android.support.v4.d.a<String, View> aVar2 = new android.support.v4.d.a<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = aVar.get(arrayList.get(i));
                if (view != null) {
                    aVar2.put(arrayList2.get(i), view);
                }
            }
            return aVar2;
        }
        return aVar;
    }

    private android.support.v4.d.a<String, View> b(b bVar, Fragment fragment, boolean z) {
        android.support.v4.d.a<String, View> aVar = new android.support.v4.d.a<>();
        View p = fragment.p();
        if (p != null && this.u != null) {
            t.a((Map<String, View>) aVar, p);
            if (z) {
                return a(this.u, this.v, aVar);
            }
            aVar.a((Collection<?>) this.v);
            return aVar;
        }
        return aVar;
    }

    private void a(final View view, final b bVar, final int i, final Object obj) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.v4.app.g.3
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                g.this.a(bVar, i, obj);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, int i, Object obj) {
        if (this.b.g != null) {
            for (int i2 = 0; i2 < this.b.g.size(); i2++) {
                Fragment fragment = this.b.g.get(i2);
                if (fragment.R != null && fragment.Q != null && fragment.G == i) {
                    if (fragment.I) {
                        if (!bVar.b.contains(fragment.R)) {
                            t.a(obj, fragment.R, true);
                            bVar.b.add(fragment.R);
                        }
                    } else {
                        t.a(obj, fragment.R, false);
                        bVar.b.remove(fragment.R);
                    }
                }
            }
        }
    }

    private static void a(android.support.v4.d.a<String, String> aVar, String str, String str2) {
        if (str != null && str2 != null) {
            for (int i = 0; i < aVar.size(); i++) {
                if (str.equals(aVar.c(i))) {
                    aVar.a(i, (int) str2);
                    return;
                }
            }
            aVar.put(str, str2);
        }
    }

    private static void a(b bVar, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (arrayList != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < arrayList.size()) {
                    a(bVar.a, arrayList.get(i2), arrayList2.get(i2));
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    private void a(b bVar, android.support.v4.d.a<String, View> aVar, boolean z) {
        int size = this.v == null ? 0 : this.v.size();
        for (int i = 0; i < size; i++) {
            String str = this.u.get(i);
            View view = aVar.get(this.v.get(i));
            if (view != null) {
                String a2 = t.a(view);
                if (z) {
                    a(bVar.a, str, a2);
                } else {
                    a(bVar.a, a2, str);
                }
            }
        }
    }

    private void b(b bVar, android.support.v4.d.a<String, View> aVar, boolean z) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            String b2 = aVar.b(i);
            String a2 = t.a(aVar.c(i));
            if (z) {
                a(bVar.a, b2, a2);
            } else {
                a(bVar.a, a2, b2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public android.support.v4.d.a<String, String> a = new android.support.v4.d.a<>();
        public ArrayList<View> b = new ArrayList<>();
        public t.a c = new t.a();
        public View d;

        public b() {
        }
    }
}
