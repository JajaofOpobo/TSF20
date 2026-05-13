package com.tsf.shell.widget.alarm.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: com.tsf.shell.widget.alarm.service.a */
/* loaded from: classes.dex */
public interface InterfaceC4337a extends IInterface {
    /* renamed from: a */
    void mo187a(int i, byte[] bArr);

    /* renamed from: com.tsf.shell.widget.alarm.service.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC4338a extends Binder implements InterfaceC4337a {
        public AbstractBinderC4338a() {
            attachInterface(this, "com.tsf.shell.widget.alarm.service.AlarmCallBack");
        }

        /* renamed from: a */
        public static InterfaceC4337a m200a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tsf.shell.widget.alarm.service.AlarmCallBack");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC4337a)) {
                return (InterfaceC4337a) queryLocalInterface;
            }
            return new C4339a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.tsf.shell.widget.alarm.service.AlarmCallBack");
                    mo187a(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.tsf.shell.widget.alarm.service.AlarmCallBack");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* renamed from: com.tsf.shell.widget.alarm.service.a$a$a */
        /* loaded from: classes.dex */
        private static class C4339a implements InterfaceC4337a {

            /* renamed from: a */
            private IBinder f14068a;

            C4339a(IBinder iBinder) {
                this.f14068a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14068a;
            }

            @Override // com.tsf.shell.widget.alarm.service.InterfaceC4337a
            /* renamed from: a */
            public void mo187a(int i, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmCallBack");
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    this.f14068a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
