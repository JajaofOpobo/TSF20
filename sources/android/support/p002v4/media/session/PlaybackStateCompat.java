package android.support.p002v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() { // from class: android.support.v4.media.session.PlaybackStateCompat.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };

    /* renamed from: a */
    private final int f561a;

    /* renamed from: b */
    private final long f562b;

    /* renamed from: c */
    private final long f563c;

    /* renamed from: d */
    private final float f564d;

    /* renamed from: e */
    private final long f565e;

    /* renamed from: f */
    private final CharSequence f566f;

    /* renamed from: g */
    private final long f567g;

    /* renamed from: h */
    private List<CustomAction> f568h;

    /* renamed from: i */
    private final long f569i;

    /* renamed from: j */
    private final Bundle f570j;

    private PlaybackStateCompat(Parcel parcel) {
        this.f561a = parcel.readInt();
        this.f562b = parcel.readLong();
        this.f564d = parcel.readFloat();
        this.f567g = parcel.readLong();
        this.f563c = parcel.readLong();
        this.f565e = parcel.readLong();
        this.f566f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f568h = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f569i = parcel.readLong();
        this.f570j = parcel.readBundle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=").append(this.f561a);
        sb.append(", position=").append(this.f562b);
        sb.append(", buffered position=").append(this.f563c);
        sb.append(", speed=").append(this.f564d);
        sb.append(", updated=").append(this.f567g);
        sb.append(", actions=").append(this.f565e);
        sb.append(", error=").append(this.f566f);
        sb.append(", custom actions=").append(this.f568h);
        sb.append(", active item id=").append(this.f569i);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f561a);
        parcel.writeLong(this.f562b);
        parcel.writeFloat(this.f564d);
        parcel.writeLong(this.f567g);
        parcel.writeLong(this.f563c);
        parcel.writeLong(this.f565e);
        TextUtils.writeToParcel(this.f566f, parcel, i);
        parcel.writeTypedList(this.f568h);
        parcel.writeLong(this.f569i);
        parcel.writeBundle(this.f570j);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() { // from class: android.support.v4.media.session.PlaybackStateCompat.CustomAction.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };

        /* renamed from: a */
        private final String f571a;

        /* renamed from: b */
        private final CharSequence f572b;

        /* renamed from: c */
        private final int f573c;

        /* renamed from: d */
        private final Bundle f574d;

        private CustomAction(Parcel parcel) {
            this.f571a = parcel.readString();
            this.f572b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f573c = parcel.readInt();
            this.f574d = parcel.readBundle();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f571a);
            TextUtils.writeToParcel(this.f572b, parcel, i);
            parcel.writeInt(this.f573c);
            parcel.writeBundle(this.f574d);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f572b) + ", mIcon=" + this.f573c + ", mExtras=" + this.f574d;
        }
    }
}
