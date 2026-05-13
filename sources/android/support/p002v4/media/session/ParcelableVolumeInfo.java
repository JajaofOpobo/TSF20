package android.support.p002v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() { // from class: android.support.v4.media.session.ParcelableVolumeInfo.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    };

    /* renamed from: a */
    public int f556a;

    /* renamed from: b */
    public int f557b;

    /* renamed from: c */
    public int f558c;

    /* renamed from: d */
    public int f559d;

    /* renamed from: e */
    public int f560e;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f556a = parcel.readInt();
        this.f558c = parcel.readInt();
        this.f559d = parcel.readInt();
        this.f560e = parcel.readInt();
        this.f557b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f556a);
        parcel.writeInt(this.f558c);
        parcel.writeInt(this.f559d);
        parcel.writeInt(this.f560e);
        parcel.writeInt(this.f557b);
    }
}
