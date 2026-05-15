package com.tsf.shell.services.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public interface a extends IInterface {
    int a();

    void a(String str, boolean z);

    int b();

    int c();

    int d();

    int e();

    int f();

    /* JADX INFO: renamed from: com.tsf.shell.services.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0166a extends Binder implements a {
        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.tsf.shell.services.notifier.Counter");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof a)) {
                return (a) iInterfaceQueryLocalInterface;
            }
            return new C0167a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    int iA = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(iA);
                    return true;
                case 2:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    int iB = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(iB);
                    return true;
                case 3:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    int iC = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(iC);
                    return true;
                case 4:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    int iD = d();
                    parcel2.writeNoException();
                    parcel2.writeInt(iD);
                    return true;
                case 5:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    a(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    int iE = e();
                    parcel2.writeNoException();
                    parcel2.writeInt(iE);
                    return true;
                case 7:
                    parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                    int iF = f();
                    parcel2.writeNoException();
                    parcel2.writeInt(iF);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.tsf.shell.services.notifier.Counter");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: renamed from: com.tsf.shell.services.a.a$a$a, reason: collision with other inner class name */
        private static class C0167a implements a {
            private IBinder a;

            C0167a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.tsf.shell.services.a.a
            public int a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tsf.shell.services.a.a
            public int b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tsf.shell.services.a.a
            public int c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tsf.shell.services.a.a
            public int d() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    this.a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tsf.shell.services.a.a
            public void a(String str, boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tsf.shell.services.a.a
            public int e() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    this.a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tsf.shell.services.a.a
            public int f() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.services.notifier.Counter");
                    this.a.transact(7, parcelObtain, parcelObtain2, 0);
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
