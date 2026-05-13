package android.support.p002v4.p010os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p002v4.p010os.InterfaceC0221c;
/* renamed from: android.support.v4.os.ResultReceiver */
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() { // from class: android.support.v4.os.ResultReceiver.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    };

    /* renamed from: b */
    final boolean f575b = false;

    /* renamed from: c */
    final Handler f576c = null;

    /* renamed from: d */
    InterfaceC0221c f577d;

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    /* loaded from: classes.dex */
    class RunnableC0218b implements Runnable {

        /* renamed from: a */
        final int f579a;

        /* renamed from: b */
        final Bundle f580b;

        RunnableC0218b(int i, Bundle bundle) {
            this.f579a = i;
            this.f580b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.mo13219a(this.f579a, this.f580b);
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    /* loaded from: classes.dex */
    class BinderC0217a extends InterfaceC0221c.AbstractBinderC0222a {
        BinderC0217a() {
        }

        @Override // android.support.p002v4.p010os.InterfaceC0221c
        /* renamed from: a */
        public void mo13212a(int i, Bundle bundle) {
            if (ResultReceiver.this.f576c != null) {
                ResultReceiver.this.f576c.post(new RunnableC0218b(i, bundle));
            } else {
                ResultReceiver.this.mo13219a(i, bundle);
            }
        }
    }

    /* renamed from: b */
    public void m13218b(int i, Bundle bundle) {
        if (this.f575b) {
            if (this.f576c != null) {
                this.f576c.post(new RunnableC0218b(i, bundle));
            } else {
                mo13219a(i, bundle);
            }
        } else if (this.f577d != null) {
            try {
                this.f577d.mo13212a(i, bundle);
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: a */
    protected void mo13219a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f577d == null) {
                this.f577d = new BinderC0217a();
            }
            parcel.writeStrongBinder(this.f577d.asBinder());
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f577d = InterfaceC0221c.AbstractBinderC0222a.m13213a(parcel.readStrongBinder());
    }
}
