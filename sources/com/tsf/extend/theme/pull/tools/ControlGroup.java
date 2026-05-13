package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class ControlGroup implements Parcelable {
    public static final Parcelable.Creator<ControlGroup> CREATOR = new Parcelable.Creator<ControlGroup>() { // from class: com.tsf.extend.theme.pull.tools.ControlGroup.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ControlGroup createFromParcel(Parcel parcel) {
            return new ControlGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ControlGroup[] newArray(int i) {
            return new ControlGroup[i];
        }
    };

    /* renamed from: a */
    public final int f6033a;

    /* renamed from: b */
    public final String f6034b;

    /* renamed from: c */
    public final String f6035c;

    protected ControlGroup(Parcel parcel) {
        this.f6033a = parcel.readInt();
        this.f6034b = parcel.readString();
        this.f6035c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6033a);
        parcel.writeString(this.f6034b);
        parcel.writeString(this.f6035c);
    }
}
