package android.support.v4.app;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
final class d extends q implements Runnable {
    final m a;
    e b;
    e c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    boolean k;
    String m;
    boolean n;
    int p;
    CharSequence q;
    int r;
    CharSequence s;
    ArrayList t;
    ArrayList u;
    boolean l = true;
    int o = -1;

    public String toString() {
        StringBuilder sb = new StringBuilder(ItemInfo.APP_INTENT);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.o >= 0) {
            sb.append(" #");
            sb.append(this.o);
        }
        if (this.m != null) {
            sb.append(" ");
            sb.append(this.m);
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
            printWriter.print(this.m);
            printWriter.print(" mIndex=");
            printWriter.print(this.o);
            printWriter.print(" mCommitted=");
            printWriter.println(this.n);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.j));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.p != 0 || this.q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.q);
            }
            if (this.r != 0 || this.s != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.r));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.s);
            }
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = String.valueOf(str) + "    ";
            int i = 0;
            e eVar = this.b;
            while (eVar != null) {
                switch (eVar.c) {
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
                        str2 = "cmd=" + eVar.c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(eVar.d);
                if (z) {
                    if (eVar.e != 0 || eVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(eVar.e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(eVar.f));
                    }
                    if (eVar.g != 0 || eVar.h != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(eVar.g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(eVar.h));
                    }
                }
                if (eVar.i != null && eVar.i.size() > 0) {
                    for (int i2 = 0; i2 < eVar.i.size(); i2++) {
                        printWriter.print(str3);
                        if (eVar.i.size() == 1) {
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
                        printWriter.println(eVar.i.get(i2));
                    }
                }
                eVar = eVar.a;
                i++;
            }
        }
    }

    public d(m mVar) {
        this.a = mVar;
    }

    void a(e eVar) {
        if (this.b == null) {
            this.c = eVar;
            this.b = eVar;
        } else {
            eVar.b = this.c;
            this.c.a = eVar;
            this.c = eVar;
        }
        eVar.e = this.e;
        eVar.f = this.f;
        eVar.g = this.g;
        eVar.h = this.h;
        this.d++;
    }

    @Override // android.support.v4.app.q
    public q a(Fragment fragment, String str) {
        a(0, fragment, str, 1);
        return this;
    }

    @Override // android.support.v4.app.q
    public q a(int i, Fragment fragment) {
        a(i, fragment, (String) null, 1);
        return this;
    }

    @Override // android.support.v4.app.q
    public q a(int i, Fragment fragment, String str) {
        a(i, fragment, str, 1);
        return this;
    }

    private void a(int i, Fragment fragment, String str, int i2) {
        fragment.C = this.a;
        if (str != null) {
            if (fragment.I != null && !str.equals(fragment.I)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.I + " now " + str);
            }
            fragment.I = str;
        }
        if (i != 0) {
            if (fragment.G != 0 && fragment.G != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.G + " now " + i);
            }
            fragment.G = i;
            fragment.H = i;
        }
        e eVar = new e();
        eVar.c = i2;
        eVar.d = fragment;
        a(eVar);
    }

    @Override // android.support.v4.app.q
    public q a(Fragment fragment) {
        e eVar = new e();
        eVar.c = 3;
        eVar.d = fragment;
        a(eVar);
        return this;
    }

    @Override // android.support.v4.app.q
    public q b(Fragment fragment) {
        e eVar = new e();
        eVar.c = 6;
        eVar.d = fragment;
        a(eVar);
        return this;
    }

    @Override // android.support.v4.app.q
    public q c(Fragment fragment) {
        e eVar = new e();
        eVar.c = 7;
        eVar.d = fragment;
        a(eVar);
        return this;
    }

    void a(int i) {
        if (this.k) {
            if (m.a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (e eVar = this.b; eVar != null; eVar = eVar.a) {
                if (eVar.d != null) {
                    eVar.d.B += i;
                    if (m.a) {
                        Log.v("FragmentManager", "Bump nesting of " + eVar.d + " to " + eVar.d.B);
                    }
                }
                if (eVar.i != null) {
                    for (int size = eVar.i.size() - 1; size >= 0; size--) {
                        Fragment fragment = (Fragment) eVar.i.get(size);
                        fragment.B += i;
                        if (m.a) {
                            Log.v("FragmentManager", "Bump nesting of " + fragment + " to " + fragment.B);
                        }
                    }
                }
            }
        }
    }

    @Override // android.support.v4.app.q
    public int a() {
        return a(false);
    }

    @Override // android.support.v4.app.q
    public int b() {
        return a(true);
    }

    int a(boolean z) {
        if (this.n) {
            throw new IllegalStateException("commit already called");
        }
        if (m.a) {
            Log.v("FragmentManager", "Commit: " + this);
            a("  ", (FileDescriptor) null, new PrintWriter(new android.support.v4.f.d("FragmentManager")), (String[]) null);
        }
        this.n = true;
        if (this.k) {
            this.o = this.a.a(this);
        } else {
            this.o = -1;
        }
        this.a.a(this, z);
        return this.o;
    }

    @Override // java.lang.Runnable
    public void run() {
        f fVar;
        Fragment fragment;
        if (m.a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (this.k && this.o < 0) {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        a(1);
        if (Build.VERSION.SDK_INT >= 21) {
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            b(sparseArray, sparseArray2);
            fVar = a(sparseArray, sparseArray2, false);
        } else {
            fVar = null;
        }
        int i = fVar != null ? 0 : this.j;
        int i2 = fVar != null ? 0 : this.i;
        for (e eVar = this.b; eVar != null; eVar = eVar.a) {
            int i3 = fVar != null ? 0 : eVar.e;
            int i4 = fVar != null ? 0 : eVar.f;
            switch (eVar.c) {
                case 1:
                    Fragment fragment2 = eVar.d;
                    fragment2.Q = i3;
                    this.a.a(fragment2, false);
                    break;
                case 2:
                    Fragment fragment3 = eVar.d;
                    if (this.a.g != null) {
                        fragment = fragment3;
                        for (int i5 = 0; i5 < this.a.g.size(); i5++) {
                            Fragment fragment4 = (Fragment) this.a.g.get(i5);
                            if (m.a) {
                                Log.v("FragmentManager", "OP_REPLACE: adding=" + fragment + " old=" + fragment4);
                            }
                            if (fragment == null || fragment4.H == fragment.H) {
                                if (fragment4 == fragment) {
                                    eVar.d = null;
                                    fragment = null;
                                } else {
                                    if (eVar.i == null) {
                                        eVar.i = new ArrayList();
                                    }
                                    eVar.i.add(fragment4);
                                    fragment4.Q = i4;
                                    if (this.k) {
                                        fragment4.B++;
                                        if (m.a) {
                                            Log.v("FragmentManager", "Bump nesting of " + fragment4 + " to " + fragment4.B);
                                        }
                                    }
                                    this.a.a(fragment4, i2, i);
                                }
                            }
                        }
                    } else {
                        fragment = fragment3;
                    }
                    if (fragment != null) {
                        fragment.Q = i3;
                        this.a.a(fragment, false);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    Fragment fragment5 = eVar.d;
                    fragment5.Q = i4;
                    this.a.a(fragment5, i2, i);
                    break;
                case 4:
                    Fragment fragment6 = eVar.d;
                    fragment6.Q = i4;
                    this.a.b(fragment6, i2, i);
                    break;
                case 5:
                    Fragment fragment7 = eVar.d;
                    fragment7.Q = i3;
                    this.a.c(fragment7, i2, i);
                    break;
                case 6:
                    Fragment fragment8 = eVar.d;
                    fragment8.Q = i4;
                    this.a.d(fragment8, i2, i);
                    break;
                case 7:
                    Fragment fragment9 = eVar.d;
                    fragment9.Q = i3;
                    this.a.e(fragment9, i2, i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + eVar.c);
            }
        }
        this.a.a(this.a.n, i2, i, true);
        if (this.k) {
            this.a.b(this);
        }
    }

    private static void a(SparseArray sparseArray, Fragment fragment) {
        int i;
        if (fragment != null && (i = fragment.H) != 0 && !fragment.n() && fragment.m() && fragment.o() != null && sparseArray.get(i) == null) {
            sparseArray.put(i, fragment);
        }
    }

    private void b(SparseArray sparseArray, Fragment fragment) {
        int i;
        if (fragment != null && (i = fragment.H) != 0) {
            sparseArray.put(i, fragment);
        }
    }

    private void b(SparseArray sparseArray, SparseArray sparseArray2) {
        Fragment fragment;
        if (this.a.p.a()) {
            for (e eVar = this.b; eVar != null; eVar = eVar.a) {
                switch (eVar.c) {
                    case 1:
                        b(sparseArray2, eVar.d);
                        break;
                    case 2:
                        Fragment fragment2 = eVar.d;
                        if (this.a.g != null) {
                            int i = 0;
                            fragment = fragment2;
                            while (true) {
                                int i2 = i;
                                if (i2 < this.a.g.size()) {
                                    Fragment fragment3 = (Fragment) this.a.g.get(i2);
                                    if (fragment == null || fragment3.H == fragment.H) {
                                        if (fragment3 == fragment) {
                                            fragment = null;
                                        } else {
                                            a(sparseArray, fragment3);
                                        }
                                    }
                                    i = i2 + 1;
                                }
                            }
                        } else {
                            fragment = fragment2;
                        }
                        b(sparseArray2, fragment);
                        break;
                    case 3:
                        a(sparseArray, eVar.d);
                        break;
                    case 4:
                        a(sparseArray, eVar.d);
                        break;
                    case 5:
                        b(sparseArray2, eVar.d);
                        break;
                    case 6:
                        a(sparseArray, eVar.d);
                        break;
                    case 7:
                        b(sparseArray2, eVar.d);
                        break;
                }
            }
        }
    }

    public void a(SparseArray sparseArray, SparseArray sparseArray2) {
        if (this.a.p.a()) {
            for (e eVar = this.b; eVar != null; eVar = eVar.a) {
                switch (eVar.c) {
                    case 1:
                        a(sparseArray, eVar.d);
                        break;
                    case 2:
                        if (eVar.i != null) {
                            for (int size = eVar.i.size() - 1; size >= 0; size--) {
                                b(sparseArray2, (Fragment) eVar.i.get(size));
                            }
                        }
                        a(sparseArray, eVar.d);
                        break;
                    case 3:
                        b(sparseArray2, eVar.d);
                        break;
                    case 4:
                        b(sparseArray2, eVar.d);
                        break;
                    case 5:
                        a(sparseArray, eVar.d);
                        break;
                    case 6:
                        b(sparseArray2, eVar.d);
                        break;
                    case 7:
                        a(sparseArray, eVar.d);
                        break;
                }
            }
        }
    }

    public f a(boolean z, f fVar, SparseArray sparseArray, SparseArray sparseArray2) {
        if (m.a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            a("  ", (FileDescriptor) null, new PrintWriter(new android.support.v4.f.d("FragmentManager")), (String[]) null);
        }
        if (fVar == null) {
            if (sparseArray.size() != 0 || sparseArray2.size() != 0) {
                fVar = a(sparseArray, sparseArray2, true);
            }
        } else if (!z) {
            a(fVar, this.u, this.t);
        }
        a(-1);
        int i = fVar != null ? 0 : this.j;
        int i2 = fVar != null ? 0 : this.i;
        for (e eVar = this.c; eVar != null; eVar = eVar.b) {
            int i3 = fVar != null ? 0 : eVar.g;
            int i4 = fVar != null ? 0 : eVar.h;
            switch (eVar.c) {
                case 1:
                    Fragment fragment = eVar.d;
                    fragment.Q = i4;
                    this.a.a(fragment, m.c(i2), i);
                    break;
                case 2:
                    Fragment fragment2 = eVar.d;
                    if (fragment2 != null) {
                        fragment2.Q = i4;
                        this.a.a(fragment2, m.c(i2), i);
                    }
                    if (eVar.i != null) {
                        for (int i5 = 0; i5 < eVar.i.size(); i5++) {
                            Fragment fragment3 = (Fragment) eVar.i.get(i5);
                            fragment3.Q = i3;
                            this.a.a(fragment3, false);
                        }
                        break;
                    } else {
                        break;
                    }
                case 3:
                    Fragment fragment4 = eVar.d;
                    fragment4.Q = i3;
                    this.a.a(fragment4, false);
                    break;
                case 4:
                    Fragment fragment5 = eVar.d;
                    fragment5.Q = i3;
                    this.a.c(fragment5, m.c(i2), i);
                    break;
                case 5:
                    Fragment fragment6 = eVar.d;
                    fragment6.Q = i4;
                    this.a.b(fragment6, m.c(i2), i);
                    break;
                case 6:
                    Fragment fragment7 = eVar.d;
                    fragment7.Q = i3;
                    this.a.e(fragment7, m.c(i2), i);
                    break;
                case 7:
                    Fragment fragment8 = eVar.d;
                    fragment8.Q = i3;
                    this.a.d(fragment8, m.c(i2), i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + eVar.c);
            }
        }
        if (z) {
            this.a.a(this.a.n, m.c(i2), i, true);
            fVar = null;
        }
        if (this.o >= 0) {
            this.a.b(this.o);
            this.o = -1;
        }
        return fVar;
    }

    public String c() {
        return this.m;
    }

    private f a(SparseArray sparseArray, SparseArray sparseArray2, boolean z) {
        f fVar = new f(this);
        fVar.d = new View(this.a.o);
        int i = 0;
        boolean z2 = false;
        while (i < sparseArray.size()) {
            boolean z3 = a(sparseArray.keyAt(i), fVar, z, sparseArray, sparseArray2) ? true : z2;
            i++;
            z2 = z3;
        }
        for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
            int keyAt = sparseArray2.keyAt(i2);
            if (sparseArray.get(keyAt) == null && a(keyAt, fVar, z, sparseArray, sparseArray2)) {
                z2 = true;
            }
        }
        if (!z2) {
            return null;
        }
        return fVar;
    }

    private static Object a(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return r.a(z ? fragment.x() : fragment.u());
    }

    private static Object b(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return r.a(z ? fragment.v() : fragment.w());
    }

    private static Object a(Fragment fragment, Fragment fragment2, boolean z) {
        Object y;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            y = fragment2.z();
        } else {
            y = fragment.y();
        }
        return r.a(y);
    }

    private static Object a(Object obj, Fragment fragment, ArrayList arrayList, android.support.v4.f.a aVar, View view) {
        if (obj != null) {
            return r.a(obj, fragment.o(), arrayList, aVar, view);
        }
        return obj;
    }

    private android.support.v4.f.a a(f fVar, Fragment fragment, boolean z) {
        android.support.v4.f.a aVar = new android.support.v4.f.a();
        if (this.t != null) {
            r.a((Map) aVar, fragment.o());
            if (z) {
                aVar.a((Collection) this.u);
            } else {
                aVar = a(this.t, this.u, aVar);
            }
        }
        if (z) {
            if (fragment.ah != null) {
                fragment.ah.a(this.u, aVar);
            }
            a(fVar, aVar, false);
        } else {
            if (fragment.ai != null) {
                fragment.ai.a(this.u, aVar);
            }
            b(fVar, aVar, false);
        }
        return aVar;
    }

    private boolean a(int i, f fVar, boolean z, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        bq bqVar;
        ViewGroup viewGroup = (ViewGroup) this.a.p.a(i);
        if (viewGroup == null) {
            return false;
        }
        final Fragment fragment = (Fragment) sparseArray2.get(i);
        Fragment fragment2 = (Fragment) sparseArray.get(i);
        Object a = a(fragment, z);
        Object a2 = a(fragment, fragment2, z);
        Object b = b(fragment2, z);
        if (a == null && a2 == null && b == null) {
            return false;
        }
        android.support.v4.f.a aVar = null;
        ArrayList arrayList = new ArrayList();
        if (a2 != null) {
            aVar = a(fVar, fragment2, z);
            arrayList.add(fVar.d);
            arrayList.addAll(aVar.values());
            if (z) {
                bqVar = fragment2.ah;
            } else {
                bqVar = fragment.ah;
            }
            if (bqVar != null) {
                bqVar.a(new ArrayList(aVar.keySet()), new ArrayList(aVar.values()), null);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Object a3 = a(b, fragment2, arrayList2, aVar, fVar.d);
        if (this.u != null && aVar != null && (view = (View) aVar.get(this.u.get(0))) != null) {
            if (a3 != null) {
                r.a(a3, view);
            }
            if (a2 != null) {
                r.a(a2, view);
            }
        }
        t tVar = new t() { // from class: android.support.v4.app.d.1
            @Override // android.support.v4.app.t
            public View a() {
                return fragment.o();
            }
        };
        if (a2 != null) {
            a(fVar, viewGroup, a2, fragment, fragment2, z, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        android.support.v4.f.a aVar2 = new android.support.v4.f.a();
        Object a4 = r.a(a, a3, a2, z ? fragment.B() : fragment.A());
        if (a4 != null) {
            r.a(a, a2, viewGroup, tVar, fVar.d, fVar.c, fVar.a, arrayList3, aVar2, arrayList);
            a(viewGroup, fVar, i, a4);
            r.a(a4, fVar.d, true);
            a(fVar, i, a4);
            r.a(viewGroup, a4);
            r.a(viewGroup, fVar.d, a, arrayList3, a3, arrayList2, a2, arrayList, a4, fVar.b, aVar2);
        }
        return a4 != null;
    }

    private void a(final f fVar, final View view, final Object obj, final Fragment fragment, final Fragment fragment2, final boolean z, final ArrayList arrayList) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.v4.app.d.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                if (obj != null) {
                    r.a(obj, arrayList);
                    arrayList.clear();
                    android.support.v4.f.a a = d.this.a(fVar, z, fragment);
                    arrayList.add(fVar.d);
                    arrayList.addAll(a.values());
                    r.b(obj, arrayList);
                    d.this.a(a, fVar);
                    d.this.a(fVar, fragment, fragment2, z, a);
                    return true;
                }
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(f fVar, Fragment fragment, Fragment fragment2, boolean z, android.support.v4.f.a aVar) {
        bq bqVar;
        if (z) {
            bqVar = fragment2.ah;
        } else {
            bqVar = fragment.ah;
        }
        if (bqVar != null) {
            bqVar.b(new ArrayList(aVar.keySet()), new ArrayList(aVar.values()), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.support.v4.f.a aVar, f fVar) {
        View view;
        if (this.u != null && !aVar.isEmpty() && (view = (View) aVar.get(this.u.get(0))) != null) {
            fVar.c.a = view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.support.v4.f.a a(f fVar, boolean z, Fragment fragment) {
        android.support.v4.f.a b = b(fVar, fragment, z);
        if (z) {
            if (fragment.ai != null) {
                fragment.ai.a(this.u, b);
            }
            a(fVar, b, true);
        } else {
            if (fragment.ah != null) {
                fragment.ah.a(this.u, b);
            }
            b(fVar, b, true);
        }
        return b;
    }

    private static android.support.v4.f.a a(ArrayList arrayList, ArrayList arrayList2, android.support.v4.f.a aVar) {
        if (!aVar.isEmpty()) {
            android.support.v4.f.a aVar2 = new android.support.v4.f.a();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) aVar.get(arrayList.get(i));
                if (view != null) {
                    aVar2.put((String) arrayList2.get(i), view);
                }
            }
            return aVar2;
        }
        return aVar;
    }

    private android.support.v4.f.a b(f fVar, Fragment fragment, boolean z) {
        android.support.v4.f.a aVar = new android.support.v4.f.a();
        View o = fragment.o();
        if (o != null && this.t != null) {
            r.a((Map) aVar, o);
            if (z) {
                return a(this.t, this.u, aVar);
            }
            aVar.a((Collection) this.u);
            return aVar;
        }
        return aVar;
    }

    private void a(final View view, final f fVar, final int i, final Object obj) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.v4.app.d.3
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                d.this.a(fVar, i, obj);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(f fVar, int i, Object obj) {
        if (this.a.g != null) {
            for (int i2 = 0; i2 < this.a.g.size(); i2++) {
                Fragment fragment = (Fragment) this.a.g.get(i2);
                if (fragment.S != null && fragment.R != null && fragment.H == i) {
                    if (fragment.J) {
                        if (!fVar.b.contains(fragment.S)) {
                            r.a(obj, fragment.S, true);
                            fVar.b.add(fragment.S);
                        }
                    } else {
                        r.a(obj, fragment.S, false);
                        fVar.b.remove(fragment.S);
                    }
                }
            }
        }
    }

    private static void a(android.support.v4.f.a aVar, String str, String str2) {
        if (str != null && str2 != null && !str.equals(str2)) {
            for (int i = 0; i < aVar.size(); i++) {
                if (str.equals(aVar.c(i))) {
                    aVar.a(i, str2);
                    return;
                }
            }
            aVar.put(str, str2);
        }
    }

    private static void a(f fVar, ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < arrayList.size()) {
                    a(fVar.a, (String) arrayList.get(i2), (String) arrayList2.get(i2));
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    private void a(f fVar, android.support.v4.f.a aVar, boolean z) {
        int size = this.u == null ? 0 : this.u.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.t.get(i);
            View view = (View) aVar.get((String) this.u.get(i));
            if (view != null) {
                String a = r.a(view);
                if (z) {
                    a(fVar.a, str, a);
                } else {
                    a(fVar.a, a, str);
                }
            }
        }
    }

    private void b(f fVar, android.support.v4.f.a aVar, boolean z) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            String str = (String) aVar.b(i);
            String a = r.a((View) aVar.c(i));
            if (z) {
                a(fVar.a, str, a);
            } else {
                a(fVar.a, a, str);
            }
        }
    }
}
