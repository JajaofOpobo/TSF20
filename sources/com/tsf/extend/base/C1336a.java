package com.tsf.extend.base;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: com.tsf.extend.base.a */
/* loaded from: classes.dex */
public final class C1336a {

    /* renamed from: com.tsf.extend.base.a$a */
    /* loaded from: classes.dex */
    public static final class C1338a {

        /* renamed from: a */
        private final String f4222a;

        /* renamed from: b */
        private final boolean f4223b;

        C1338a(String str, boolean z) {
            this.f4222a = str;
            this.f4223b = z;
        }

        /* renamed from: a */
        public String m8953a() {
            return this.f4222a;
        }
    }

    /* renamed from: a */
    public static C1338a m8954a(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            ServiceConnectionC1339b serviceConnectionC1339b = new ServiceConnectionC1339b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, serviceConnectionC1339b, 1)) {
                    try {
                        C1340c c1340c = new C1340c(serviceConnectionC1339b.m8947a());
                        return new C1338a(c1340c.m8945a(), c1340c.m8944a(true));
                    } catch (Exception e) {
                        throw e;
                    }
                }
                throw new IOException("Google Play connection failed");
            } finally {
                context.unbindService(serviceConnectionC1339b);
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: com.tsf.extend.base.a$b */
    /* loaded from: classes.dex */
    private static final class ServiceConnectionC1339b implements ServiceConnection {

        /* renamed from: a */
        boolean f4224a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f4225b;

        private ServiceConnectionC1339b() {
            this.f4224a = false;
            this.f4225b = new LinkedBlockingQueue<>(1);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f4225b.put(iBinder);
            } catch (InterruptedException e) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        /* renamed from: a */
        public IBinder m8947a() {
            if (this.f4224a) {
                throw new IllegalStateException();
            }
            this.f4224a = true;
            return this.f4225b.take();
        }
    }

    /* renamed from: com.tsf.extend.base.a$c */
    /* loaded from: classes.dex */
    private static final class C1340c implements IInterface {

        /* renamed from: a */
        private IBinder f4226a;

        public C1340c(IBinder iBinder) {
            this.f4226a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f4226a;
        }

        /* renamed from: a */
        public String m8945a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f4226a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: a */
        public boolean m8944a(boolean z) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                this.f4226a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
