package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ControlGroup implements Parcelable {
    private static final class Creator implements Parcelable.Creator<ControlGroup> {

        @Override

        public ControlGroup createFromParcel(Parcel parcel) {
            return new ControlGroup(parcel);
        }

        @Override

        public ControlGroup[] newArray(int i) {
            return new ControlGroup[i];
        }
    }
    
    public static final Parcelable.Creator<ControlGroup> CREATOR = new Creator();
    public final int a;
    public final String b;
    public final String c;

    protected ControlGroup(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
