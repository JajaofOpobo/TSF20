package android.support.p002v4.media;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: android.support.v4.media.RatingCompat */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };

    /* renamed from: a */
    private final int f550a;

    /* renamed from: b */
    private final float f551b;

    private RatingCompat(int i, float f) {
        this.f550a = i;
        this.f551b = f;
    }

    public String toString() {
        return "Rating:style=" + this.f550a + " rating=" + (this.f551b < 0.0f ? "unrated" : String.valueOf(this.f551b));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f550a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f550a);
        parcel.writeFloat(this.f551b);
    }
}
