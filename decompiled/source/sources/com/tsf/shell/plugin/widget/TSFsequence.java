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
    public String a;
    public int b;
    public int c;
    public int d;
    public int e;

    public TSFsequence() {
    }

    private TSFsequence(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.a = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.a);
    }
}
