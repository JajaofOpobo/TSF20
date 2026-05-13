package com.tsf.extend.theme.pull.tools;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
/* loaded from: classes.dex */
public class ProcFile extends File implements Parcelable {
    public static final Parcelable.Creator<ProcFile> CREATOR = new Parcelable.Creator<ProcFile>() { // from class: com.tsf.extend.theme.pull.tools.ProcFile.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ProcFile createFromParcel(Parcel parcel) {
            return new ProcFile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ProcFile[] newArray(int i) {
            return new ProcFile[i];
        }
    };

    /* renamed from: b */
    public final String f6036b;

    /* JADX INFO: Access modifiers changed from: protected */
    public ProcFile(Parcel parcel) {
        super(parcel.readString());
        this.f6036b = parcel.readString();
    }

    @Override // java.io.File
    public long length() {
        return this.f6036b.length();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getAbsolutePath());
        parcel.writeString(this.f6036b);
    }
}
