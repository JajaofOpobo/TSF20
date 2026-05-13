package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class Stat extends ProcFile {
    public static final Parcelable.Creator<Stat> CREATOR = new Parcelable.Creator<Stat>() { // from class: com.tsf.extend.theme.pull.tools.Stat.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Stat createFromParcel(Parcel parcel) {
            return new Stat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Stat[] newArray(int i) {
            return new Stat[i];
        }
    };

    /* renamed from: a */
    private final String[] f6037a;

    private Stat(Parcel parcel) {
        super(parcel);
        this.f6037a = parcel.createStringArray();
    }

    @Override // com.tsf.extend.theme.pull.tools.ProcFile, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tsf.extend.theme.pull.tools.ProcFile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringArray(this.f6037a);
    }
}
