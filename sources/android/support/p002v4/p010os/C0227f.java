package android.support.p002v4.p010os;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: android.support.v4.os.f */
/* loaded from: classes.dex */
class C0227f<T> implements Parcelable.ClassLoaderCreator<T> {

    /* renamed from: a */
    private final InterfaceC0226e<T> f584a;

    public C0227f(InterfaceC0226e<T> interfaceC0226e) {
        this.f584a = interfaceC0226e;
    }

    @Override // android.os.Parcelable.Creator
    public T createFromParcel(Parcel parcel) {
        return this.f584a.mo12052a(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f584a.mo12052a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public T[] newArray(int i) {
        return this.f584a.mo12053a(i);
    }
}
