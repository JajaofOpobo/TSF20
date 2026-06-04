package com.tsf.shell.plugin.theme;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ThemeElementSubItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new e();
    public Bitmap a;
    public String b;
    public String c;
    public String[] d;
    public String e;
    public boolean f;
    public int g;

    public ThemeElementSubItem(int i, String str, String str2, String[] strArr, String str3, boolean z) {
        this.f = true;
        this.g = i;
        this.b = str;
        this.c = str2;
        this.d = strArr;
        this.e = str3;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.g);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringArray(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
