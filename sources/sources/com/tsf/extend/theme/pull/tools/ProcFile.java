package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ProcFile extends File implements Parcelable {
    private static final class Creator implements Parcelable.Creator<ProcFile> {

        @Override

        public ProcFile createFromParcel(Parcel parcel) {
            return new ProcFile(parcel);
        }

        @Override

        public ProcFile[] newArray(int i) {
            return new ProcFile[i];
        }
    }
    
    public static final Parcelable.Creator<ProcFile> CREATOR = new Creator();
    public final String b;

    protected ProcFile(Parcel parcel) {
        super(parcel.readString());
        this.b = parcel.readString();
    }

    @Override // java.io.File
    public long length() {
        return this.b.length();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getAbsolutePath());
        parcel.writeString(this.b);
    }
}
