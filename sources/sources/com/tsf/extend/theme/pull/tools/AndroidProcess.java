package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AndroidProcess implements Parcelable {
    public static final Parcelable.Creator<AndroidProcess> CREATOR = new Parcelable.Creator<AndroidProcess>() { // from class: com.tsf.extend.theme.pull.tools.AndroidProcess.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AndroidProcess createFromParcel(Parcel parcel) {
            return new AndroidProcess(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
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

    protected AndroidProcess(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readInt();
    }
}
