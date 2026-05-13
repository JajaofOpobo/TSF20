package com.tsf.shell.plugin.widget;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class TSFsequence implements Parcelable {
    public static final Parcelable.Creator<TSFsequence> CREATOR = new Parcelable.Creator<TSFsequence>() { // from class: com.tsf.shell.plugin.widget.TSFsequence.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TSFsequence createFromParcel(Parcel parcel) {
            return new TSFsequence(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TSFsequence[] newArray(int i) {
            return new TSFsequence[i];
        }
    };

    /* renamed from: a */
    public String f13052a;

    /* renamed from: b */
    public int f13053b;

    /* renamed from: c */
    public int f13054c;

    /* renamed from: d */
    public int f13055d;

    /* renamed from: e */
    public int f13056e;

    public TSFsequence() {
    }

    private TSFsequence(Parcel parcel) {
        this.f13053b = parcel.readInt();
        this.f13054c = parcel.readInt();
        this.f13055d = parcel.readInt();
        this.f13056e = parcel.readInt();
        this.f13052a = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13053b);
        parcel.writeInt(this.f13054c);
        parcel.writeInt(this.f13055d);
        parcel.writeInt(this.f13056e);
        parcel.writeString(this.f13052a);
    }
}
