package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.c;
import android.support.v4.os.ResultReceiver;
/* loaded from: classes.dex */
class MediaBrowserServiceCompat$ServiceImplApi23$1 extends ResultReceiver {
    final /* synthetic */ c.a a;

    @Override // android.support.v4.os.ResultReceiver
    protected void a(int i, Bundle bundle) {
        Parcel parcel;
        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) bundle.getParcelable("media_item");
        if (mediaItem == null) {
            parcel = null;
        } else {
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            parcel = obtain;
        }
        this.a.a(i, bundle, parcel);
    }
}
