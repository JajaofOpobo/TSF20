package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.c;
import android.support.v4.os.ResultReceiver;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class MediaBrowserServiceCompat$ServiceImplApi23$1 extends ResultReceiver {
    final /* synthetic */ c.a a;

    @Override // android.support.v4.os.ResultReceiver
    protected void a(int i, Bundle bundle) {
        Parcel parcel;
        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) bundle.getParcelable("media_item");
        if (mediaItem == null) {
            parcel = null;
        } else {
            Parcel parcelObtain = Parcel.obtain();
            mediaItem.writeToParcel(parcelObtain, 0);
            parcel = parcelObtain;
        }
        this.a.a(i, bundle, parcel);
    }
}
