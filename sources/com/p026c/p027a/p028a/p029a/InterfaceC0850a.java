package com.p026c.p027a.p028a.p029a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.c.a.a.a.a */
/* loaded from: classes.dex */
public interface InterfaceC0850a extends IInterface {
    /* renamed from: A */
    void mo10896A();

    /* renamed from: B */
    void mo10895B();

    /* renamed from: C */
    int mo10894C();

    /* renamed from: D */
    String mo10893D();

    /* renamed from: E */
    int mo10892E();

    /* renamed from: a */
    void mo10891a();

    /* renamed from: b */
    void mo10890b();

    /* renamed from: c */
    void mo10889c();

    /* renamed from: d */
    void mo10888d();

    /* renamed from: e */
    void mo10887e();

    /* renamed from: f */
    void mo10886f();

    /* renamed from: g */
    void mo10885g();

    /* renamed from: h */
    void mo10884h();

    /* renamed from: i */
    void mo10883i();

    /* renamed from: j */
    void mo10882j();

    /* renamed from: k */
    void mo10881k();

    /* renamed from: l */
    int mo10880l();

    /* renamed from: m */
    int mo10879m();

    /* renamed from: n */
    int mo10878n();

    /* renamed from: o */
    int mo10877o();

    /* renamed from: p */
    int mo10876p();

    /* renamed from: q */
    int mo10875q();

    /* renamed from: r */
    void mo10874r();

    /* renamed from: s */
    void mo10873s();

    /* renamed from: t */
    void mo10872t();

    /* renamed from: u */
    void mo10871u();

    /* renamed from: v */
    void mo10870v();

    /* renamed from: w */
    void mo10869w();

    /* renamed from: x */
    void mo10868x();

    /* renamed from: y */
    void mo10867y();

    /* renamed from: z */
    void mo10866z();

    /* renamed from: com.c.a.a.a.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0851a extends Binder implements InterfaceC0850a {
        /* renamed from: a */
        public static InterfaceC0850a m10897a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.seal.plugin.services.toggle.ToggleInterface");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0850a)) {
                return (InterfaceC0850a) queryLocalInterface;
            }
            return new C0852a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10891a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10890b();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10889c();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10888d();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10887e();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10886f();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10885g();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10884h();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10883i();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10882j();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10881k();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int l = mo10880l();
                    parcel2.writeNoException();
                    parcel2.writeInt(l);
                    return true;
                case 13:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int m = mo10879m();
                    parcel2.writeNoException();
                    parcel2.writeInt(m);
                    return true;
                case 14:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int n = mo10878n();
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    return true;
                case 15:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int o = mo10877o();
                    parcel2.writeNoException();
                    parcel2.writeInt(o);
                    return true;
                case 16:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int p = mo10876p();
                    parcel2.writeNoException();
                    parcel2.writeInt(p);
                    return true;
                case 17:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int q = mo10875q();
                    parcel2.writeNoException();
                    parcel2.writeInt(q);
                    return true;
                case 18:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10874r();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10873s();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10872t();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10871u();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10870v();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10869w();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10868x();
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10867y();
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10866z();
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10896A();
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    mo10895B();
                    parcel2.writeNoException();
                    return true;
                case 29:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int C = mo10894C();
                    parcel2.writeNoException();
                    parcel2.writeInt(C);
                    return true;
                case 30:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    String D = mo10893D();
                    parcel2.writeNoException();
                    parcel2.writeString(D);
                    return true;
                case 31:
                    parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                    int E = mo10892E();
                    parcel2.writeNoException();
                    parcel2.writeInt(E);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.seal.plugin.services.toggle.ToggleInterface");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* renamed from: com.c.a.a.a.a$a$a */
        /* loaded from: classes.dex */
        private static class C0852a implements InterfaceC0850a {

            /* renamed from: a */
            private IBinder f2407a;

            C0852a(IBinder iBinder) {
                this.f2407a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2407a;
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: a */
            public void mo10891a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: b */
            public void mo10890b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: c */
            public void mo10889c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: d */
            public void mo10888d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: e */
            public void mo10887e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: f */
            public void mo10886f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: g */
            public void mo10885g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: h */
            public void mo10884h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: i */
            public void mo10883i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: j */
            public void mo10882j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: k */
            public void mo10881k() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: l */
            public int mo10880l() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: m */
            public int mo10879m() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: n */
            public int mo10878n() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: o */
            public int mo10877o() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: p */
            public int mo10876p() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: q */
            public int mo10875q() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: r */
            public void mo10874r() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: s */
            public void mo10873s() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: t */
            public void mo10872t() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: u */
            public void mo10871u() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: v */
            public void mo10870v() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: w */
            public void mo10869w() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: x */
            public void mo10868x() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: y */
            public void mo10867y() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: z */
            public void mo10866z() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: A */
            public void mo10896A() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: B */
            public void mo10895B() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: C */
            public int mo10894C() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: D */
            public String mo10893D() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p026c.p027a.p028a.p029a.InterfaceC0850a
            /* renamed from: E */
            public int mo10892E() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.seal.plugin.services.toggle.ToggleInterface");
                    this.f2407a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
