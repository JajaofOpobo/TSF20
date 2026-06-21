package com.tsf.shell.widget.alarm.service;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
class c implements a {
    private IBinder a;

    c(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }

    @Override // com.tsf.shell.widget.alarm.service.a
    public void a(int i, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmCallBack");
            obtain.writeInt(i);
            obtain.writeByteArray(bArr);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
