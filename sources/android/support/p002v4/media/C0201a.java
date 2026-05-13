package android.support.p002v4.media;

import android.os.Bundle;
import android.support.p002v4.media.MediaBrowserCompat;
import java.util.List;
/* renamed from: android.support.v4.media.a */
/* loaded from: classes.dex */
public class C0201a {
    /* renamed from: a */
    public static boolean m13254a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle2 == null ? bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    /* renamed from: a */
    public static List<MediaBrowserCompat.MediaItem> m13253a(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i != -1 || i2 != -1) {
            int i3 = i2 * (i - 1);
            int i4 = i3 + i2;
            if (i < 1 || i2 < 1 || i3 >= list.size()) {
                return null;
            }
            if (i4 > list.size()) {
                i4 = list.size();
            }
            return list.subList(i3, i4);
        }
        return list;
    }
}
