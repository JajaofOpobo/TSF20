package android.support.p002v4.p010os;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: android.support.v4.os.d */
/* loaded from: classes.dex */
public final class C0224d {
    /* renamed from: a */
    public static <T> Parcelable.Creator<T> m13211a(InterfaceC0226e<T> interfaceC0226e) {
        return Build.VERSION.SDK_INT >= 13 ? C0228g.m13210a(interfaceC0226e) : new C0225a(interfaceC0226e);
    }

    /* renamed from: android.support.v4.os.d$a */
    /* loaded from: classes.dex */
    static class C0225a<T> implements Parcelable.Creator<T> {

        /* renamed from: a */
        final InterfaceC0226e<T> f583a;

        public C0225a(InterfaceC0226e<T> interfaceC0226e) {
            this.f583a = interfaceC0226e;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.f583a.mo12052a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.f583a.mo12053a(i);
        }
    }
}
