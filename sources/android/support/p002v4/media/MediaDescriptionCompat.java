package android.support.p002v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.media.C0205d;
import android.support.p002v4.media.C0207e;
import android.text.TextUtils;
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m13270a(C0205d.m13251a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };

    /* renamed from: a */
    private final String f528a;

    /* renamed from: b */
    private final CharSequence f529b;

    /* renamed from: c */
    private final CharSequence f530c;

    /* renamed from: d */
    private final CharSequence f531d;

    /* renamed from: e */
    private final Bitmap f532e;

    /* renamed from: f */
    private final Uri f533f;

    /* renamed from: g */
    private final Bundle f534g;

    /* renamed from: h */
    private final Uri f535h;

    /* renamed from: i */
    private Object f536i;

    private MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f528a = str;
        this.f529b = charSequence;
        this.f530c = charSequence2;
        this.f531d = charSequence3;
        this.f532e = bitmap;
        this.f533f = uri;
        this.f534g = bundle;
        this.f535h = uri2;
    }

    private MediaDescriptionCompat(Parcel parcel) {
        this.f528a = parcel.readString();
        this.f529b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f530c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f531d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f532e = (Bitmap) parcel.readParcelable(null);
        this.f533f = (Uri) parcel.readParcelable(null);
        this.f534g = parcel.readBundle();
        this.f535h = (Uri) parcel.readParcelable(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f528a);
            TextUtils.writeToParcel(this.f529b, parcel, i);
            TextUtils.writeToParcel(this.f530c, parcel, i);
            TextUtils.writeToParcel(this.f531d, parcel, i);
            parcel.writeParcelable(this.f532e, i);
            parcel.writeParcelable(this.f533f, i);
            parcel.writeBundle(this.f534g);
            parcel.writeParcelable(this.f535h, i);
            return;
        }
        C0205d.m13249a(m13271a(), parcel, i);
    }

    public String toString() {
        return ((Object) this.f529b) + ", " + ((Object) this.f530c) + ", " + ((Object) this.f531d);
    }

    /* renamed from: a */
    public Object m13271a() {
        if (this.f536i != null || Build.VERSION.SDK_INT < 21) {
            return this.f536i;
        }
        Object m13242a = C0205d.C0206a.m13242a();
        C0205d.C0206a.m13236a(m13242a, this.f528a);
        C0205d.C0206a.m13237a(m13242a, this.f529b);
        C0205d.C0206a.m13235b(m13242a, this.f530c);
        C0205d.C0206a.m13234c(m13242a, this.f531d);
        C0205d.C0206a.m13240a(m13242a, this.f532e);
        C0205d.C0206a.m13239a(m13242a, this.f533f);
        Bundle bundle = this.f534g;
        if (Build.VERSION.SDK_INT < 23 && this.f535h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f535h);
        }
        C0205d.C0206a.m13238a(m13242a, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            C0207e.C0208a.m13232b(m13242a, this.f535h);
        }
        this.f536i = C0205d.C0206a.m13241a(m13242a);
        return this.f536i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.p002v4.media.MediaDescriptionCompat m13270a(java.lang.Object r6) {
        /*
            r1 = 0
            if (r6 == 0) goto L9
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 >= r2) goto La
        L9:
            return r1
        La:
            android.support.v4.media.MediaDescriptionCompat$a r4 = new android.support.v4.media.MediaDescriptionCompat$a
            r4.<init>()
            java.lang.String r0 = android.support.p002v4.media.C0205d.m13250a(r6)
            r4.m13262a(r0)
            java.lang.CharSequence r0 = android.support.p002v4.media.C0205d.m13248b(r6)
            r4.m13263a(r0)
            java.lang.CharSequence r0 = android.support.p002v4.media.C0205d.m13247c(r6)
            r4.m13260b(r0)
            java.lang.CharSequence r0 = android.support.p002v4.media.C0205d.m13246d(r6)
            r4.m13259c(r0)
            android.graphics.Bitmap r0 = android.support.p002v4.media.C0205d.m13245e(r6)
            r4.m13266a(r0)
            android.net.Uri r0 = android.support.p002v4.media.C0205d.m13244f(r6)
            r4.m13265a(r0)
            android.os.Bundle r2 = android.support.p002v4.media.C0205d.m13243g(r6)
            if (r2 != 0) goto L61
            r3 = r1
        L40:
            if (r3 == 0) goto L75
            java.lang.String r0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L6b
            int r0 = r2.size()
            r5 = 2
            if (r0 != r5) goto L6b
            r0 = r1
        L52:
            r4.m13264a(r0)
            if (r3 == 0) goto L77
            r4.m13261b(r3)
        L5a:
            android.support.v4.media.MediaDescriptionCompat r1 = r4.m13267a()
            r1.f536i = r6
            goto L9
        L61:
            java.lang.String r0 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r3 = r0
            goto L40
        L6b:
            java.lang.String r0 = "android.support.v4.media.description.MEDIA_URI"
            r2.remove(r0)
            java.lang.String r0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r2.remove(r0)
        L75:
            r0 = r2
            goto L52
        L77:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L5a
            android.net.Uri r0 = android.support.p002v4.media.C0207e.m13233h(r6)
            r4.m13261b(r0)
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.media.MediaDescriptionCompat.m13270a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes.dex */
    public static final class C0198a {

        /* renamed from: a */
        private String f537a;

        /* renamed from: b */
        private CharSequence f538b;

        /* renamed from: c */
        private CharSequence f539c;

        /* renamed from: d */
        private CharSequence f540d;

        /* renamed from: e */
        private Bitmap f541e;

        /* renamed from: f */
        private Uri f542f;

        /* renamed from: g */
        private Bundle f543g;

        /* renamed from: h */
        private Uri f544h;

        /* renamed from: a */
        public C0198a m13262a(String str) {
            this.f537a = str;
            return this;
        }

        /* renamed from: a */
        public C0198a m13263a(CharSequence charSequence) {
            this.f538b = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0198a m13260b(CharSequence charSequence) {
            this.f539c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0198a m13259c(CharSequence charSequence) {
            this.f540d = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0198a m13266a(Bitmap bitmap) {
            this.f541e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0198a m13265a(Uri uri) {
            this.f542f = uri;
            return this;
        }

        /* renamed from: a */
        public C0198a m13264a(Bundle bundle) {
            this.f543g = bundle;
            return this;
        }

        /* renamed from: b */
        public C0198a m13261b(Uri uri) {
            this.f544h = uri;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat m13267a() {
            return new MediaDescriptionCompat(this.f537a, this.f538b, this.f539c, this.f540d, this.f541e, this.f542f, this.f543g, this.f544h);
        }
    }
}
