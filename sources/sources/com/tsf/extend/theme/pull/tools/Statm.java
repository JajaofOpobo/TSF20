package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class Statm extends ProcFile {
    private static final class Creator implements Parcelable.Creator<Statm> {

        @Override

        public Statm createFromParcel(Parcel parcel) {
            return new Statm(parcel);
        }

        @Override

        public Statm[] newArray(int i) {
            return new Statm[i];
        }
    }
    
    public static final Parcelable.Creator<Statm> CREATOR = new Creator();
    public final String[] a;

    private Statm(Parcel parcel) {
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
