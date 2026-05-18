package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AndroidAppProcess extends AndroidProcess {
    private static final class Creator implements Parcelable.Creator<AndroidAppProcess> {

        @Override

        public AndroidAppProcess createFromParcel(Parcel parcel) {
            return new AndroidAppProcess(parcel);
        }

        @Override

        public AndroidAppProcess[] newArray(int i) {
            return new AndroidAppProcess[i];
        }
    }
    
    public static final Parcelable.Creator<AndroidAppProcess> CREATOR = new Creator();
    public boolean a;
    private final Cgroup d;

    @Override // com.tsf.extend.theme.pull.tools.AndroidProcess, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeByte((byte) (this.a ? 1 : 0));
    }

    protected AndroidAppProcess(Parcel parcel) {
        super(parcel);
        this.d = (Cgroup) parcel.readParcelable(Cgroup.class.getClassLoader());
        this.a = parcel.readByte() != 0;
    }
}
