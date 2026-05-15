package com.tsf.shell.widget.alarm.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public interface a extends IInterface {
    void a(int i, byte[] bArr);

    /* JADX INFO: renamed from: com.tsf.shell.widget.alarm.service.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0177a extends Binder implements a {
        public AbstractBinderC0177a() {
            attachInterface(this, "com.tsf.shell.widget.alarm.service.AlarmCallBack");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.tsf.shell.widget.alarm.service.AlarmCallBack");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof a)) {
                return (a) iInterfaceQueryLocalInterface;
            }
            return new C0178a(iBinder);
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
                    a(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.tsf.shell.widget.alarm.service.AlarmCallBack");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: renamed from: com.tsf.shell.widget.alarm.service.a$a$a, reason: collision with other inner class name */
        private static class C0178a implements a {
            private IBinder a;

            C0178a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.tsf.shell.widget.alarm.service.a
            public void a(int i, byte[] bArr) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmCallBack");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
