package com.tsf.shell.widget.alarm.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tsf.shell.widget.alarm.service.InterfaceC4337a;
/* renamed from: com.tsf.shell.widget.alarm.service.b */
/* loaded from: classes.dex */
public interface InterfaceC4340b extends IInterface {
    /* renamed from: a */
    void mo198a();

    /* renamed from: a */
    void mo197a(int i, boolean z, int i2, int i3, int i4, boolean z2, String str, String str2);

    /* renamed from: a */
    void mo196a(InterfaceC4337a interfaceC4337a);

    /* renamed from: a */
    void mo195a(boolean z);

    /* renamed from: b */
    void mo194b();

    /* renamed from: b */
    void mo193b(InterfaceC4337a interfaceC4337a);

    /* renamed from: com.tsf.shell.widget.alarm.service.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC4341a extends Binder implements InterfaceC4340b {
        public AbstractBinderC4341a() {
            attachInterface(this, "com.tsf.shell.widget.alarm.service.AlarmInterface");
        }

        /* renamed from: a */
        public static InterfaceC4340b m199a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC4340b)) {
                return (InterfaceC4340b) queryLocalInterface;
            }
            return new C4342a(iBinder);
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
                    mo196a(InterfaceC4337a.AbstractBinderC4338a.m200a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    mo193b(InterfaceC4337a.AbstractBinderC4338a.m200a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    mo195a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    mo198a();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    mo197a(parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    mo194b();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* renamed from: com.tsf.shell.widget.alarm.service.b$a$a */
        /* loaded from: classes.dex */
        private static class C4342a implements InterfaceC4340b {

            /* renamed from: a */
            private IBinder f14069a;

            C4342a(IBinder iBinder) {
                this.f14069a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14069a;
            }

            @Override // com.tsf.shell.widget.alarm.service.InterfaceC4340b
            /* renamed from: a */
            public void mo196a(InterfaceC4337a interfaceC4337a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    obtain.writeStrongBinder(interfaceC4337a != null ? interfaceC4337a.asBinder() : null);
                    this.f14069a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tsf.shell.widget.alarm.service.InterfaceC4340b
            /* renamed from: b */
            public void mo193b(InterfaceC4337a interfaceC4337a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    obtain.writeStrongBinder(interfaceC4337a != null ? interfaceC4337a.asBinder() : null);
                    this.f14069a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tsf.shell.widget.alarm.service.InterfaceC4340b
            /* renamed from: a */
            public void mo195a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    obtain.writeInt(z ? 1 : 0);
                    this.f14069a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tsf.shell.widget.alarm.service.InterfaceC4340b
            /* renamed from: a */
            public void mo198a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    this.f14069a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tsf.shell.widget.alarm.service.InterfaceC4340b
            /* renamed from: a */
            public void mo197a(int i, boolean z, int i2, int i3, int i4, boolean z2, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f14069a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tsf.shell.widget.alarm.service.InterfaceC4340b
            /* renamed from: b */
            public void mo194b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    this.f14069a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
