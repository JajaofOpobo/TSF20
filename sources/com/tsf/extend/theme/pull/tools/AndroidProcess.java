package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class AndroidProcess implements Parcelable {
    public static final Parcelable.Creator<AndroidProcess> CREATOR = new Parcelable.Creator<AndroidProcess>() { // from class: com.tsf.extend.theme.pull.tools.AndroidProcess.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AndroidProcess createFromParcel(Parcel parcel) {
            return new AndroidProcess(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AndroidProcess[] newArray(int i) {
            return new AndroidProcess[i];
        }
    };

    /* renamed from: b */
    public final String f6030b;

    /* renamed from: c */
    public final int f6031c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6030b);
        parcel.writeInt(this.f6031c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AndroidProcess(Parcel parcel) {
        this.f6030b = parcel.readString();
        this.f6031c = parcel.readInt();
    }
}
