package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.c;
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
    final boolean b = false;
    final Handler c = null;
    c d;

    /* loaded from: classes.dex */
    class b implements Runnable {
        final int a;
        final Bundle b;

        b(int i, Bundle bundle) {
            this.a = i;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.a(this.a, this.b);
        }
    }

    /* loaded from: classes.dex */
    class a extends c.a {
        a() {
        }

        @Override // android.support.v4.os.c
        public void a(int i, Bundle bundle) {
            if (ResultReceiver.this.c != null) {
                ResultReceiver.this.c.post(new b(i, bundle));
            } else {
                ResultReceiver.this.a(i, bundle);
            }
        }
    }

    public void b(int i, Bundle bundle) {
        if (this.b) {
            if (this.c != null) {
                this.c.post(new b(i, bundle));
            } else {
                a(i, bundle);
            }
        } else if (this.d != null) {
            try {
                this.d.a(i, bundle);
            } catch (RemoteException e) {
            }
        }
    }

    protected void a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.d == null) {
                this.d = new a();
            }
            parcel.writeStrongBinder(this.d.asBinder());
        }
    }

    ResultReceiver(Parcel parcel) {
        this.d = c.a.a(parcel.readStrongBinder());
    }
}
