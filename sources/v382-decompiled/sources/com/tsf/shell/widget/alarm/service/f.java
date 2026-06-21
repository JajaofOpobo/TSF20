package com.tsf.shell.widget.alarm.service;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
class f implements d {
    private IBinder a;

    f(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }

    @Override // com.tsf.shell.widget.alarm.service.d
    public void a(a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tsf.shell.widget.alarm.service.d
    public void b(a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
            obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tsf.shell.widget.alarm.service.d
    public void a(boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
            obtain.writeInt(z ? 1 : 0);
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tsf.shell.widget.alarm.service.d
    public void a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tsf.shell.widget.alarm.service.d
    public void a(int i, boolean z, int i2, int i3, int i4, boolean z2, String str, String str2) {
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
            this.a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tsf.shell.widget.alarm.service.d
    public void b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
            this.a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
