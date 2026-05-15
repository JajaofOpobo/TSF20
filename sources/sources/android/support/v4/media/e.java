package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import android.support.v4.media.d;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class e extends d {
    public static Uri h(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }

    static class a extends d.a {
        public static void b(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }
}
