package com.c.a.a.a;

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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.seal.plugin.services.toggle.ToggleInterface");
        if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
            return (a) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                b();
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                c();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                d();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                e();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                f();
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                g();
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                h();
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                i();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                j();
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                k();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                int l = l();
                parcel2.writeNoException();
                parcel2.writeInt(l);
                return true;
            case 13:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                int m = m();
                parcel2.writeNoException();
                parcel2.writeInt(m);
                return true;
            case 14:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                int n = n();
                parcel2.writeNoException();
                parcel2.writeInt(n);
                return true;
            case 15:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                int o = o();
                parcel2.writeNoException();
                parcel2.writeInt(o);
                return true;
            case 16:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                int p = p();
                parcel2.writeNoException();
                parcel2.writeInt(p);
                return true;
            case 17:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                int q = q();
                parcel2.writeNoException();
                parcel2.writeInt(q);
                return true;
            case 18:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                r();
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                s();
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                t();
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                u();
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                v();
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                w();
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                x();
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                y();
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                z();
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                A();
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                B();
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                int C = C();
                parcel2.writeNoException();
                parcel2.writeInt(C);
                return true;
            case 30:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                String D = D();
                parcel2.writeNoException();
                parcel2.writeString(D);
                return true;
            case 31:
                parcel.enforceInterface("com.seal.plugin.services.toggle.ToggleInterface");
                int E = E();
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
}
