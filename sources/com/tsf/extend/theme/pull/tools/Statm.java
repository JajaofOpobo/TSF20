package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class Statm extends ProcFile {
    public static final Parcelable.Creator<Statm> CREATOR = new Parcelable.Creator<Statm>() { // from class: com.tsf.extend.theme.pull.tools.Statm.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Statm createFromParcel(Parcel parcel) {
            return new Statm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Statm[] newArray(int i) {
            return new Statm[i];
        }
    };

    /* renamed from: a */
    public final String[] f6038a;

    private Statm(Parcel parcel) {
        super(parcel);
        this.f6038a = parcel.createStringArray();
    }

    @Override // com.tsf.extend.theme.pull.tools.ProcFile, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tsf.extend.theme.pull.tools.ProcFile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringArray(this.f6038a);
    }
}
