package com.tsf.shell.plugin.widget;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class Animation implements Parcelable {
    public static final Parcelable.Creator<Animation> CREATOR = new Parcelable.Creator<Animation>() { // from class: com.tsf.shell.plugin.widget.Animation.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Animation createFromParcel(Parcel parcel) {
            return new Animation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Animation[] newArray(int i) {
            return new Animation[i];
        }
    };

    /* renamed from: a */
    public String f13018a;

    /* renamed from: b */
    public float f13019b;

    /* renamed from: c */
    public float f13020c;

    /* renamed from: d */
    public boolean f13021d;

    /* renamed from: e */
    public float f13022e;

    public Animation() {
        this.f13021d = false;
        this.f13022e = 0.0f;
    }

    /* renamed from: a */
    public static Animation m968a(Animation animation) {
        Animation animation2 = new Animation();
        animation2.f13018a = animation.f13018a;
        animation2.f13019b = animation.f13019b;
        animation2.f13020c = animation.f13020c;
        animation2.f13021d = animation.f13021d;
        animation2.f13022e = animation.f13022e;
        return animation2;
    }

    private Animation(Parcel parcel) {
        this.f13021d = false;
        this.f13022e = 0.0f;
        this.f13018a = parcel.readString();
        this.f13019b = parcel.readFloat();
        this.f13020c = parcel.readFloat();
        this.f13021d = parcel.readByte() == 1;
        this.f13022e = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13018a);
        parcel.writeFloat(this.f13019b);
        parcel.writeFloat(this.f13020c);
        parcel.writeByte((byte) (this.f13021d ? 1 : 0));
        parcel.writeFloat(this.f13022e);
    }
}
