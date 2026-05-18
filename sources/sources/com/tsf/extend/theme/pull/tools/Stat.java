package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class Stat extends ProcFile {
    private static final class Creator implements Parcelable.Creator<Stat> {

        @Override

        public Stat createFromParcel(Parcel parcel) {
            return new Stat(parcel);
        }

        @Override

        public Stat[] newArray(int i) {
            return new Stat[i];
        }
    }
    
    public static final Parcelable.Creator<Stat> CREATOR = new Creator();
    private final String[] a;

    private Stat(Parcel parcel) {
        super(parcel);
        this.a = parcel.createStringArray();
    }

    @Override // com.tsf.extend.theme.pull.tools.ProcFile, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tsf.extend.theme.pull.tools.ProcFile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringArray(this.a);
    }
}
