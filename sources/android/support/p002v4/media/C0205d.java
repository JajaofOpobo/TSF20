package android.support.p002v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
/* renamed from: android.support.v4.media.d */
/* loaded from: classes.dex */
class C0205d {
    /* renamed from: a */
    public static String m13250a(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: b */
    public static CharSequence m13248b(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: c */
    public static CharSequence m13247c(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: d */
    public static CharSequence m13246d(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: e */
    public static Bitmap m13245e(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: f */
    public static Uri m13244f(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: g */
    public static Bundle m13243g(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: a */
    public static void m13249a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public static Object m13251a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: android.support.v4.media.d$a */
    /* loaded from: classes.dex */
    static class C0206a {
        /* renamed from: a */
        public static Object m13242a() {
            return new MediaDescription.Builder();
        }

        /* renamed from: a */
        public static void m13236a(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        /* renamed from: a */
        public static void m13237a(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }

        /* renamed from: b */
        public static void m13235b(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m13234c(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }

        /* renamed from: a */
        public static void m13240a(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m13239a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m13238a(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static Object m13241a(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }
    }
}
