package android.support.v4.app;

import android.util.Log;
import com.tsf.shell.R;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class a extends v implements Runnable {
    final m a;
    b b;
    b c;
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
    boolean l = true;
    int o = -1;

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
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

    public final void a(String str, PrintWriter printWriter) {
        a(str, printWriter, true);
    }

    public final void a(String str, PrintWriter printWriter, boolean z) {
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
            String str3 = str + "    ";
            int i = 0;
            b bVar = this.b;
            while (bVar != null) {
                switch (bVar.c) {
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
                    case R.styleable.CellLayout_longAxisCells /* 7 */:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + bVar.c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(bVar.d);
                if (z) {
                    if (bVar.e != 0 || bVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(bVar.e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(bVar.f));
                    }
                    if (bVar.g != 0 || bVar.h != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(bVar.g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(bVar.h));
                    }
                }
                if (bVar.i != null && bVar.i.size() > 0) {
                    for (int i2 = 0; i2 < bVar.i.size(); i2++) {
                        printWriter.print(str3);
                        if (bVar.i.size() == 1) {
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
                        printWriter.println(bVar.i.get(i2));
                    }
                }
                bVar = bVar.a;
                i++;
            }
        }
    }

    public a(m mVar) {
        this.a = mVar;
    }

    final void a(b bVar) {
        if (this.b == null) {
            this.c = bVar;
            this.b = bVar;
        } else {
            bVar.b = this.c;
            this.c.a = bVar;
            this.c = bVar;
        }
        bVar.e = this.e;
        bVar.f = this.f;
        bVar.g = this.g;
        bVar.h = this.h;
        this.d++;
    }

    @Override // android.support.v4.app.v
    public final v a(int i, Fragment fragment) {
        b(i, fragment, null);
        return this;
    }

    @Override // android.support.v4.app.v
    public final v a(int i, Fragment fragment, String str) {
        b(i, fragment, str);
        return this;
    }

    private void b(int i, Fragment fragment, String str) {
        fragment.s = this.a;
        if (str != null) {
            if (fragment.y != null && !str.equals(fragment.y)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.y + " now " + str);
            }
            fragment.y = str;
        }
        if (i != 0) {
            if (fragment.w != 0 && fragment.w != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.w + " now " + i);
            }
            fragment.w = i;
            fragment.x = i;
        }
        b bVar = new b();
        bVar.c = 1;
        bVar.d = fragment;
        a(bVar);
    }

    @Override // android.support.v4.app.v
    public final v a(Fragment fragment) {
        b bVar = new b();
        bVar.c = 3;
        bVar.d = fragment;
        a(bVar);
        return this;
    }

    @Override // android.support.v4.app.v
    public final v b(Fragment fragment) {
        b bVar = new b();
        bVar.c = 6;
        bVar.d = fragment;
        a(bVar);
        return this;
    }

    @Override // android.support.v4.app.v
    public final v c(Fragment fragment) {
        b bVar = new b();
        bVar.c = 7;
        bVar.d = fragment;
        a(bVar);
        return this;
    }

    final void a(int i) {
        if (this.k) {
            if (m.a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (b bVar = this.b; bVar != null; bVar = bVar.a) {
                if (bVar.d != null) {
                    bVar.d.r += i;
                    if (m.a) {
                        Log.v("FragmentManager", "Bump nesting of " + bVar.d + " to " + bVar.d.r);
                    }
                }
                if (bVar.i != null) {
                    for (int size = bVar.i.size() - 1; size >= 0; size--) {
                        Fragment fragment = (Fragment) bVar.i.get(size);
                        fragment.r += i;
                        if (m.a) {
                            Log.v("FragmentManager", "Bump nesting of " + fragment + " to " + fragment.r);
                        }
                    }
                }
            }
        }
    }

    @Override // android.support.v4.app.v
    public final int a() {
        return a(false);
    }

    @Override // android.support.v4.app.v
    public final int b() {
        return a(true);
    }

    private int a(boolean z) {
        if (this.n) {
            throw new IllegalStateException("commit already called");
        }
        if (m.a) {
            Log.v("FragmentManager", "Commit: " + this);
            a("  ", new PrintWriter(new android.support.v4.c.b("FragmentManager")));
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
    public final void run() {
        Fragment fragment;
        if (m.a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (this.k && this.o < 0) {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        a(1);
        for (b bVar = this.b; bVar != null; bVar = bVar.a) {
            switch (bVar.c) {
                case 1:
                    Fragment fragment2 = bVar.d;
                    fragment2.G = bVar.e;
                    this.a.a(fragment2, false);
                    break;
                case 2:
                    Fragment fragment3 = bVar.d;
                    if (this.a.g != null) {
                        fragment = fragment3;
                        for (int i = 0; i < this.a.g.size(); i++) {
                            Fragment fragment4 = (Fragment) this.a.g.get(i);
                            if (m.a) {
                                Log.v("FragmentManager", "OP_REPLACE: adding=" + fragment + " old=" + fragment4);
                            }
                            if (fragment == null || fragment4.x == fragment.x) {
                                if (fragment4 == fragment) {
                                    fragment = null;
                                    bVar.d = null;
                                } else {
                                    if (bVar.i == null) {
                                        bVar.i = new ArrayList();
                                    }
                                    bVar.i.add(fragment4);
                                    fragment4.G = bVar.f;
                                    if (this.k) {
                                        fragment4.r++;
                                        if (m.a) {
                                            Log.v("FragmentManager", "Bump nesting of " + fragment4 + " to " + fragment4.r);
                                        }
                                    }
                                    this.a.a(fragment4, this.i, this.j);
                                }
                            }
                        }
                    } else {
                        fragment = fragment3;
                    }
                    if (fragment != null) {
                        fragment.G = bVar.e;
                        this.a.a(fragment, false);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    Fragment fragment5 = bVar.d;
                    fragment5.G = bVar.f;
                    this.a.a(fragment5, this.i, this.j);
                    break;
                case 4:
                    Fragment fragment6 = bVar.d;
                    fragment6.G = bVar.f;
                    this.a.b(fragment6, this.i, this.j);
                    break;
                case 5:
                    Fragment fragment7 = bVar.d;
                    fragment7.G = bVar.e;
                    this.a.c(fragment7, this.i, this.j);
                    break;
                case 6:
                    Fragment fragment8 = bVar.d;
                    fragment8.G = bVar.f;
                    this.a.d(fragment8, this.i, this.j);
                    break;
                case R.styleable.CellLayout_longAxisCells /* 7 */:
                    Fragment fragment9 = bVar.d;
                    fragment9.G = bVar.e;
                    this.a.e(fragment9, this.i, this.j);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + bVar.c);
            }
        }
        this.a.a(this.a.n, this.i, this.j, true);
        if (this.k) {
            this.a.b(this);
        }
    }

    public final void c() {
        if (m.a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            a("  ", new PrintWriter(new android.support.v4.c.b("FragmentManager")));
        }
        a(-1);
        for (b bVar = this.c; bVar != null; bVar = bVar.b) {
            switch (bVar.c) {
                case 1:
                    Fragment fragment = bVar.d;
                    fragment.G = bVar.h;
                    this.a.a(fragment, m.c(this.i), this.j);
                    break;
                case 2:
                    Fragment fragment2 = bVar.d;
                    if (fragment2 != null) {
                        fragment2.G = bVar.h;
                        this.a.a(fragment2, m.c(this.i), this.j);
                    }
                    if (bVar.i != null) {
                        for (int i = 0; i < bVar.i.size(); i++) {
                            Fragment fragment3 = (Fragment) bVar.i.get(i);
                            fragment3.G = bVar.g;
                            this.a.a(fragment3, false);
                        }
                        break;
                    } else {
                        break;
                    }
                case 3:
                    Fragment fragment4 = bVar.d;
                    fragment4.G = bVar.g;
                    this.a.a(fragment4, false);
                    break;
                case 4:
                    Fragment fragment5 = bVar.d;
                    fragment5.G = bVar.g;
                    this.a.c(fragment5, m.c(this.i), this.j);
                    break;
                case 5:
                    Fragment fragment6 = bVar.d;
                    fragment6.G = bVar.h;
                    this.a.b(fragment6, m.c(this.i), this.j);
                    break;
                case 6:
                    Fragment fragment7 = bVar.d;
                    fragment7.G = bVar.g;
                    this.a.e(fragment7, m.c(this.i), this.j);
                    break;
                case R.styleable.CellLayout_longAxisCells /* 7 */:
                    Fragment fragment8 = bVar.d;
                    fragment8.G = bVar.g;
                    this.a.d(fragment8, m.c(this.i), this.j);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + bVar.c);
            }
        }
        this.a.a(this.a.n, m.c(this.i), this.j, true);
        if (this.o >= 0) {
            this.a.b(this.o);
            this.o = -1;
        }
    }
}
