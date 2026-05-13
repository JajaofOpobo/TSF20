package android.support.p002v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.p010os.ResultReceiver;
/* renamed from: android.support.v4.media.MediaBrowserCompat */
/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };

        /* renamed from: a */
        private final int f475a;

        /* renamed from: b */
        private final MediaDescriptionCompat f476b;

        private MediaItem(Parcel parcel) {
            this.f475a = parcel.readInt();
            this.f476b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f475a);
            this.f476b.writeToParcel(parcel, i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=").append(this.f475a);
            sb.append(", mDescription=").append(this.f476b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0177a {
        /* renamed from: a */
        public void m13309a(MediaItem mediaItem) {
        }

        /* renamed from: a */
        public void m13308a(String str) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    /* loaded from: classes.dex */
    private static class ItemReceiver extends ResultReceiver {

        /* renamed from: a */
        private final String f473a;

        /* renamed from: e */
        private final AbstractC0177a f474e;

        @Override // android.support.p002v4.p010os.ResultReceiver
        /* renamed from: a */
        protected void mo13219a(int i, Bundle bundle) {
            bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.f474e.m13308a(this.f473a);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable instanceof MediaItem) {
                this.f474e.m13309a((MediaItem) parcelable);
            } else {
                this.f474e.m13308a(this.f473a);
            }
        }
    }
}
