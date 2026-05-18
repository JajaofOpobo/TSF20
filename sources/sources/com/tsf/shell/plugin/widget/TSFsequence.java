package com.tsf.shell.plugin.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TSFsequence implements Parcelable {
    private static final class Creator implements Parcelable.Creator<TSFsequence> {

        @Override

        public TSFsequence createFromParcel(Parcel parcel) {
            return new TSFsequence(parcel);
        }

        @Override

        public TSFsequence[] newArray(int i) {
            return new TSFsequence[i];
        }
    }
    
    public static final Parcelable.Creator<TSFsequence> CREATOR = new Creator();
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
