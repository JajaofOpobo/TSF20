package com.c.a.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public interface a extends IInterface {
    void A();

    void B();

    int C();

    String D();

    int E();

    void a();

    void b();

    void c();

    void d();

    void e();

    void f();

    void g();

    void h();

    void i();

    void j();

    void k();

    int l();

    int m();

    int n();

    int o();

    int p();

    int q();

    void r();

    void s();

    void t();

    void u();

    void v();

    void w();

    void x();

    void y();

    void z();

    /* JADX INFO: renamed from: com.c.a.a.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0021a extends Binder implements a {
        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.seal.plugin.services.toggle.ToggleInterface");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof a)) {
                return (a) iInterfaceQueryLocalInterface;
            }
            return new C0022a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    c();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    d();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    e();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    f();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    g();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    h();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    i();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    j();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    k();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int iL = l();
                    parcel2.writeNoException();
                    parcel2.writeInt(iL);
                    return true;
                case 13:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int iM = m();
                    parcel2.writeNoException();
                    parcel2.writeInt(iM);
                    return true;
                case 14:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int iN = n();
                    parcel2.writeNoException();
                    parcel2.writeInt(iN);
                    return true;
                case 15:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int iO = o();
                    parcel2.writeNoException();
                    parcel2.writeInt(iO);
                    return true;
                case 16:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int iP = p();
                    parcel2.writeNoException();
                    parcel2.writeInt(iP);
                    return true;
                case 17:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int iQ = q();
                    parcel2.writeNoException();
                    parcel2.writeInt(iQ);
                    return true;
                case 18:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    r();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    s();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    t();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    u();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    v();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    w();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    x();
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    y();
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    z();
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    A();
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    B();
                    parcel2.writeNoException();
                    return true;
                case 29:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int iC = C();
                    parcel2.writeNoException();
                    parcel2.writeInt(iC);
                    return true;
                case 30:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    String strD = D();
                    parcel2.writeNoException();
                    parcel2.writeString(strD);
                    return true;
                case 31:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int iE = E();
                    parcel2.writeNoException();
                    parcel2.writeInt(iE);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.seal.plugin.services.toggle.ToggleInterface");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: renamed from: com.c.a.a.a.a$a$a, reason: collision with other inner class name */
        private static class C0022a implements a {
            private IBinder a;

            C0022a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.c.a.a.a.a
            public void a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void d() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void e() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void f() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void g() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void h() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void i() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void j() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void k() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public int l() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public int m() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public int n() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public int o() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public int p() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public int q() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void r() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void s() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void t() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void u() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void v() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void w() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void x() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void y() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void z() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void A() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public void B() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public int C() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public String D() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.c.a.a.a.a
            public int E() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.a.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
