package android.support.p002v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import android.support.p002v4.media.C0205d;
/* renamed from: android.support.v4.media.e */
/* loaded from: classes.dex */
class C0207e extends C0205d {
    /* renamed from: h */
    public static Uri m13233h(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }

    /* renamed from: android.support.v4.media.e$a */
    /* loaded from: classes.dex */
    static class C0208a extends C0205d.C0206a {
        /* renamed from: b */
        public static void m13232b(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }
}
