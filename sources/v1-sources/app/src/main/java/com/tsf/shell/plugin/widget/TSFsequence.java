package com.tsf.shell.plugin.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class TSFsequence implements Parcelable {
    public static final Parcelable.Creator CREATOR = new g();
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

    /* synthetic */ TSFsequence(Parcel parcel, byte b) {
        this(parcel);
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
