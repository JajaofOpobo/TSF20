package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class Stat extends ProcFile {
    public static final Parcelable.Creator<Stat> CREATOR = new Parcelable.Creator<Stat>() { // from class: com.tsf.extend.theme.pull.tools.Stat.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Stat createFromParcel(Parcel parcel) {
            return new Stat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Stat[] newArray(int i) {
            return new Stat[i];
        }
    };
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
