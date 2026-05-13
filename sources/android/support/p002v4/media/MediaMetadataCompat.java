package android.support.p002v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.p009d.C0160a;
/* renamed from: android.support.v4.media.MediaMetadataCompat */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: a */
    private static final C0160a<String, Integer> f545a = new C0160a<>();

    /* renamed from: b */
    private static final String[] f546b;

    /* renamed from: c */
    private static final String[] f547c;

    /* renamed from: d */
    private static final String[] f548d;

    /* renamed from: e */
    private final Bundle f549e;

    static {
        f545a.put("android.media.metadata.TITLE", 1);
        f545a.put("android.media.metadata.ARTIST", 1);
        f545a.put("android.media.metadata.DURATION", 0);
        f545a.put("android.media.metadata.ALBUM", 1);
        f545a.put("android.media.metadata.AUTHOR", 1);
        f545a.put("android.media.metadata.WRITER", 1);
        f545a.put("android.media.metadata.COMPOSER", 1);
        f545a.put("android.media.metadata.COMPILATION", 1);
        f545a.put("android.media.metadata.DATE", 1);
        f545a.put("android.media.metadata.YEAR", 0);
        f545a.put("android.media.metadata.GENRE", 1);
        f545a.put("android.media.metadata.TRACK_NUMBER", 0);
        f545a.put("android.media.metadata.NUM_TRACKS", 0);
        f545a.put("android.media.metadata.DISC_NUMBER", 0);
        f545a.put("android.media.metadata.ALBUM_ARTIST", 1);
        f545a.put("android.media.metadata.ART", 2);
        f545a.put("android.media.metadata.ART_URI", 1);
        f545a.put("android.media.metadata.ALBUM_ART", 2);
        f545a.put("android.media.metadata.ALBUM_ART_URI", 1);
        f545a.put("android.media.metadata.USER_RATING", 3);
        f545a.put("android.media.metadata.RATING", 3);
        f545a.put("android.media.metadata.DISPLAY_TITLE", 1);
        f545a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        f545a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        f545a.put("android.media.metadata.DISPLAY_ICON", 2);
        f545a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        f545a.put("android.media.metadata.MEDIA_ID", 1);
        f546b = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f547c = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f548d = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new Parcelable.Creator<MediaMetadataCompat>() { // from class: android.support.v4.media.MediaMetadataCompat.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public MediaMetadataCompat createFromParcel(Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public MediaMetadataCompat[] newArray(int i) {
                return new MediaMetadataCompat[i];
            }
        };
    }

    private MediaMetadataCompat(Parcel parcel) {
        this.f549e = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f549e);
    }
}
