package com.tsf.shell.widget.alarm.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class e extends Binder implements d {
    public e() {
        attachInterface(this, "com.tsf.shell.widget.alarm.service.AlarmInterface");
    }

    public static d a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
        if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
            return (d) queryLocalInterface;
        }
        return new f(iBinder);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
                a(b.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
                b(b.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
                a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
                a();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
                a(parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
                b();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.tsf.shell.widget.alarm.service.AlarmInterface");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
