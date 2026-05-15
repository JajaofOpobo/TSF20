package com.tsf.shell.widget.alarm.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tsf.shell.widget.alarm.service.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public interface b extends IInterface {
    void a();

    void a(int i, boolean z, int i2, int i3, int i4, boolean z2, String str, String str2);

    void a(com.tsf.shell.widget.alarm.service.a aVar);

    void a(boolean z);

    void b();

    void b(com.tsf.shell.widget.alarm.service.a aVar);

    public static abstract class a extends Binder implements b {
        public a() {
            attachInterface(this, "com.tsf.shell.widget.alarm.service.AlarmInterface");
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof b)) {
                return (b) iInterfaceQueryLocalInterface;
            }
            return new C0179a(iBinder);
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
                    a(a.AbstractBinderC0177a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    b(a.AbstractBinderC0177a.a(parcel.readStrongBinder()));
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

        /* JADX INFO: renamed from: com.tsf.shell.widget.alarm.service.b$a$a, reason: collision with other inner class name */
        private static class C0179a implements b {
            private IBinder a;

            C0179a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.tsf.shell.widget.alarm.service.b
            public void a(com.tsf.shell.widget.alarm.service.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tsf.shell.widget.alarm.service.b
            public void b(com.tsf.shell.widget.alarm.service.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tsf.shell.widget.alarm.service.b
            public void a(boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tsf.shell.widget.alarm.service.b
            public void a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    this.a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tsf.shell.widget.alarm.service.b
            public void a(int i, boolean z, int i2, int i3, int i4, boolean z2, String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tsf.shell.widget.alarm.service.b
            public void b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tsf.shell.widget.alarm.service.AlarmInterface");
                    this.a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
