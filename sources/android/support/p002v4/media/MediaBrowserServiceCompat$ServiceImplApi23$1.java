package android.support.p002v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.support.p002v4.media.C0203c;
import android.support.p002v4.media.MediaBrowserCompat;
import android.support.p002v4.p010os.ResultReceiver;
/* renamed from: android.support.v4.media.MediaBrowserServiceCompat$ServiceImplApi23$1 */
/* loaded from: classes.dex */
class MediaBrowserServiceCompat$ServiceImplApi23$1 extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ C0203c.InterfaceC0204a f527a;

    @Override // android.support.p002v4.p010os.ResultReceiver
    /* renamed from: a */
    protected void mo13219a(int i, Bundle bundle) {
        Parcel parcel;
        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) bundle.getParcelable("media_item");
        if (mediaItem == null) {
            parcel = null;
        } else {
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            parcel = obtain;
        }
        this.f527a.m13252a(i, bundle, parcel);
    }
}
