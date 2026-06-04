package com.tsf.shell.services.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class b extends Binder implements a {
    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tsf.shell.services.notifier.Counter");
        if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
            return (a) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                int a = a();
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case 2:
                parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                int b = b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            case 3:
                parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                int c = c();
                parcel2.writeNoException();
                parcel2.writeInt(c);
                return true;
            case 4:
                parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                int d = d();
                parcel2.writeNoException();
                parcel2.writeInt(d);
                return true;
            case 5:
                parcel.enforceInterface("com.tsf.shell.services.notifier.Counter");
                a(parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.tsf.shell.services.notifier.Counter");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
