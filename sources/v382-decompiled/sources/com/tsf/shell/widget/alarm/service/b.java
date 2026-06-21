package com.tsf.shell.widget.alarm.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class b extends Binder implements a {
    public b() {
        attachInterface(this, "com.tsf.shell.widget.alarm.service.AlarmCallBack");
    }

    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tsf.shell.widget.alarm.service.AlarmCallBack");
        if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
            return (a) queryLocalInterface;
        }
        return new c(iBinder);
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
}
