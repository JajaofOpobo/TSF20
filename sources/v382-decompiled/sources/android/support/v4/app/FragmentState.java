package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: android.support.v4.app.FragmentState.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    };
    final String a;
    final int b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    Bundle j;
    Fragment k;

    public FragmentState(Fragment fragment) {
        this.a = fragment.getClass().getName();
        this.b = fragment.p;
        this.c = fragment.y;
        this.d = fragment.G;
        this.e = fragment.H;
        this.f = fragment.I;
        this.g = fragment.L;
        this.h = fragment.K;
        this.i = fragment.r;
    }

    public FragmentState(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readBundle();
        this.j = parcel.readBundle();
    }

    public Fragment a(FragmentActivity fragmentActivity, Fragment fragment) {
        if (this.k != null) {
            return this.k;
        }
        if (this.i != null) {
            this.i.setClassLoader(fragmentActivity.getClassLoader());
        }
        this.k = Fragment.a(fragmentActivity, this.a, this.i);
        if (this.j != null) {
            this.j.setClassLoader(fragmentActivity.getClassLoader());
            this.k.n = this.j;
        }
        this.k.a(this.b, fragment);
        this.k.y = this.c;
        this.k.A = true;
        this.k.G = this.d;
        this.k.H = this.e;
        this.k.I = this.f;
        this.k.L = this.g;
        this.k.K = this.h;
        this.k.C = fragmentActivity.b;
        if (m.a) {
            Log.v("FragmentManager", "Instantiated fragment " + this.k);
        }
        return this.k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeBundle(this.i);
        parcel.writeBundle(this.j);
    }
}
