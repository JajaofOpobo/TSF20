package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class AndroidAppProcess extends AndroidProcess {
    public static final Parcelable.Creator<AndroidAppProcess> CREATOR = new Parcelable.Creator<AndroidAppProcess>() { // from class: com.tsf.extend.theme.pull.tools.AndroidAppProcess.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AndroidAppProcess createFromParcel(Parcel parcel) {
            return new AndroidAppProcess(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AndroidAppProcess[] newArray(int i) {
            return new AndroidAppProcess[i];
        }
    };

    /* renamed from: a */
    public boolean f6028a;

    /* renamed from: d */
    private final Cgroup f6029d;

    @Override // com.tsf.extend.theme.pull.tools.AndroidProcess, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f6029d, i);
        parcel.writeByte((byte) (this.f6028a ? 1 : 0));
    }

    protected AndroidAppProcess(Parcel parcel) {
        super(parcel);
        this.f6029d = (Cgroup) parcel.readParcelable(Cgroup.class.getClassLoader());
        this.f6028a = parcel.readByte() != 0;
    }
}
