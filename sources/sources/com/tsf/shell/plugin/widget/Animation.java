package com.tsf.shell.plugin.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class Animation implements Parcelable {
    private static final class Creator implements Parcelable.Creator<Animation> {

        @Override

        public Animation createFromParcel(Parcel parcel) {
            return new Animation(parcel);
        }

        @Override

        public Animation[] newArray(int i) {
            return new Animation[i];
        }
    }
    
    public static final Parcelable.Creator<Animation> CREATOR = new Creator();
    public String a;
    public float b;
    public float c;
    public boolean d;
    public float e;

    public Animation() {
        this.d = false;
        this.e = 0.0f;
    }

    public static Animation a(Animation animation) {
        Animation animation2 = new Animation();
        animation2.a = animation.a;
        animation2.b = animation.b;
        animation2.c = animation.c;
        animation2.d = animation.d;
        animation2.e = animation.e;
        return animation2;
    }

    private Animation(Parcel parcel) {
        this.d = false;
        this.e = 0.0f;
        this.a = parcel.readString();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readByte() == 1;
        this.e = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeByte((byte) (this.d ? 1 : 0));
        parcel.writeFloat(this.e);
    }
}
