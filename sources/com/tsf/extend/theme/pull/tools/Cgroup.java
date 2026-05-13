package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class Cgroup extends ProcFile {
    public static final Parcelable.Creator<Cgroup> CREATOR = new Parcelable.Creator<Cgroup>() { // from class: com.tsf.extend.theme.pull.tools.Cgroup.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Cgroup createFromParcel(Parcel parcel) {
            return new Cgroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Cgroup[] newArray(int i) {
            return new Cgroup[i];
        }
    };

    /* renamed from: a */
    public final ArrayList<ControlGroup> f6032a;

    private Cgroup(Parcel parcel) {
        super(parcel);
        this.f6032a = parcel.createTypedArrayList(ControlGroup.CREATOR);
    }

    @Override // com.tsf.extend.theme.pull.tools.ProcFile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f6032a);
    }
}
