package com.tsf.shell.services.p199a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.tsf.shell.services.a.a */
/* loaded from: classes.dex */
public interface InterfaceC4095a extends IInterface {
    /* renamed from: a */
    int mo761a();

    /* renamed from: a */
    void mo760a(String str, boolean z);

    /* renamed from: b */
    int mo759b();

    /* renamed from: c */
    int mo758c();

    /* renamed from: d */
    int mo757d();

    /* renamed from: e */
    int mo756e();

    /* renamed from: f */
    int mo755f();

    /* renamed from: com.tsf.shell.services.a.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC4096a extends Binder implements InterfaceC4095a {
        /* renamed from: a */
        public static InterfaceC4095a m762a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tsf.shell.services.notifier.Counter");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC4095a)) {
                return (InterfaceC4095a) queryLocalInterface;
            }
            return new C4097a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    int a = mo761a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 2:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    int b = mo759b();
                    parcel2.writeNoException();
                    parcel2.writeInt(b);
                    return true;
                case 3:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    int c = mo758c();
                    parcel2.writeNoException();
                    parcel2.writeInt(c);
                    return true;
                case 4:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    int d = mo757d();
                    parcel2.writeNoException();
                    parcel2.writeInt(d);
                    return true;
                case 5:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    mo760a(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    int e = mo756e();
                    parcel2.writeNoException();
                    parcel2.writeInt(e);
                    return true;
                case 7:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    int f = mo755f();
                    parcel2.writeNoException();
                    parcel2.writeInt(f);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.tsf.shell.services.notifier.Counter");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* renamed from: com.tsf.shell.services.a.a$a$a */
        /* loaded from: classes.dex */
        private static class C4097a implements InterfaceC4095a {

            /* renamed from: a */
            private IBinder f13357a;

            C4097a(IBinder iBinder) {
                this.f13357a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13357a;
            }

            @Override // com.tsf.shell.services.p199a.InterfaceC4095a
            /* renamed from: a */
            public int mo761a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    this.f13357a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tsf.shell.services.p199a.InterfaceC4095a
            /* renamed from: b */
            public int mo759b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    this.f13357a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tsf.shell.services.p199a.InterfaceC4095a
            /* renamed from: c */
            public int mo758c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    this.f13357a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tsf.shell.services.p199a.InterfaceC4095a
            /* renamed from: d */
            public int mo757d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    this.f13357a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tsf.shell.services.p199a.InterfaceC4095a
            /* renamed from: a */
            public void mo760a(String str, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f13357a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tsf.shell.services.p199a.InterfaceC4095a
            /* renamed from: e */
            public int mo756e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    this.f13357a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tsf.shell.services.p199a.InterfaceC4095a
            /* renamed from: f */
            public int mo755f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    this.f13357a.transact(7, obtain, obtain2, 0);
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
