package android.support.p002v4.p010os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: android.support.v4.os.c */
/* loaded from: classes.dex */
public interface InterfaceC0221c extends IInterface {
    /* renamed from: a */
    void mo13212a(int i, Bundle bundle);

    /* renamed from: android.support.v4.os.c$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0222a extends Binder implements InterfaceC0221c {
        public AbstractBinderC0222a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: a */
        public static InterfaceC0221c m13213a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0221c)) {
                return (InterfaceC0221c) queryLocalInterface;
            }
            return new C0223a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle;
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    } else {
                        bundle = null;
                    }
                    mo13212a(readInt, bundle);
                    return true;
                case 1598968902:
                    parcel2.writeString("android.support.v4.os.IResultReceiver");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* renamed from: android.support.v4.os.c$a$a */
        /* loaded from: classes.dex */
        private static class C0223a implements InterfaceC0221c {

            /* renamed from: a */
            private IBinder f582a;

            C0223a(IBinder iBinder) {
                this.f582a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f582a;
            }

            @Override // android.support.p002v4.p010os.InterfaceC0221c
            /* renamed from: a */
            public void mo13212a(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f582a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
