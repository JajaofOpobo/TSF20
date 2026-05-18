package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class MediaBrowserCompat {

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        private final int a;
        private final MediaDescriptionCompat b;

        private MediaItem(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            this.b.writeToParcel(parcel, i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=").append(this.a);
            sb.append(", mDescription=").append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    public static abstract class a {
        public void a(MediaItem mediaItem) {
        }

        public void a(String str) {
        }
    }

    private static class ItemReceiver extends ResultReceiver {
        private final String a;
        private final a e;

        @Override // android.support.v4.os.ResultReceiver
        protected void a(int i, Bundle bundle) {
            bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.e.a(this.a);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable instanceof MediaItem) {
                this.e.a((MediaItem) parcelable);
            } else {
                this.e.a(this.a);
            }
        }
    }
}
