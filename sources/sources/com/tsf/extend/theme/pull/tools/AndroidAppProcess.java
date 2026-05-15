package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AndroidAppProcess extends AndroidProcess {
    public static final Parcelable.Creator<AndroidAppProcess> CREATOR = new Parcelable.Creator<AndroidAppProcess>() { // from class: com.tsf.extend.theme.pull.tools.AndroidAppProcess.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AndroidAppProcess createFromParcel(Parcel parcel) {
            return new AndroidAppProcess(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AndroidAppProcess[] newArray(int i) {
            return new AndroidAppProcess[i];
        }
    };
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
