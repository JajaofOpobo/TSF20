package android.support.p002v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.FragmentState */
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>() { // from class: android.support.v4.app.FragmentState.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    };

    /* renamed from: a */
    final String f191a;

    /* renamed from: b */
    final int f192b;

    /* renamed from: c */
    final boolean f193c;

    /* renamed from: d */
    final int f194d;

    /* renamed from: e */
    final int f195e;

    /* renamed from: f */
    final String f196f;

    /* renamed from: g */
    final boolean f197g;

    /* renamed from: h */
    final boolean f198h;

    /* renamed from: i */
    final Bundle f199i;

    /* renamed from: j */
    Bundle f200j;

    /* renamed from: k */
    Fragment f201k;

    public FragmentState(Fragment fragment) {
        this.f191a = fragment.getClass().getName();
        this.f192b = fragment.f158p;
        this.f193c = fragment.f166x;
        this.f194d = fragment.f124F;
        this.f195e = fragment.f125G;
        this.f196f = fragment.f126H;
        this.f197g = fragment.f129K;
        this.f198h = fragment.f128J;
        this.f199i = fragment.f160r;
    }

    public FragmentState(Parcel parcel) {
        this.f191a = parcel.readString();
        this.f192b = parcel.readInt();
        this.f193c = parcel.readInt() != 0;
        this.f194d = parcel.readInt();
        this.f195e = parcel.readInt();
        this.f196f = parcel.readString();
        this.f197g = parcel.readInt() != 0;
        this.f198h = parcel.readInt() != 0;
        this.f199i = parcel.readBundle();
        this.f200j = parcel.readBundle();
    }

    /* renamed from: a */
    public Fragment m13712a(AbstractC0093n abstractC0093n, Fragment fragment) {
        if (this.f201k != null) {
            return this.f201k;
        }
        Context m13578g = abstractC0093n.m13578g();
        if (this.f199i != null) {
            this.f199i.setClassLoader(m13578g.getClassLoader());
        }
        this.f201k = Fragment.m13775a(m13578g, this.f191a, this.f199i);
        if (this.f200j != null) {
            this.f200j.setClassLoader(m13578g.getClassLoader());
            this.f201k.f156n = this.f200j;
        }
        this.f201k.m13782a(this.f192b, fragment);
        this.f201k.f166x = this.f193c;
        this.f201k.f168z = true;
        this.f201k.f124F = this.f194d;
        this.f201k.f125G = this.f195e;
        this.f201k.f126H = this.f196f;
        this.f201k.f129K = this.f197g;
        this.f201k.f128J = this.f198h;
        this.f201k.f120B = abstractC0093n.f286d;
        if (C0096p.f297a) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f201k);
        }
        return this.f201k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f191a);
        parcel.writeInt(this.f192b);
        parcel.writeInt(this.f193c ? 1 : 0);
        parcel.writeInt(this.f194d);
        parcel.writeInt(this.f195e);
        parcel.writeString(this.f196f);
        parcel.writeInt(this.f197g ? 1 : 0);
        parcel.writeInt(this.f198h ? 1 : 0);
        parcel.writeBundle(this.f199i);
        parcel.writeBundle(this.f200j);
    }
}
