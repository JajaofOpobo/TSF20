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
    public final String b;
    public final int c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AndroidProcess(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readInt();
    }
}
