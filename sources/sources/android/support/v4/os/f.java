package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class f<T> implements Parcelable.ClassLoaderCreator<T> {
    private final e<T> a;

    public f(e<T> eVar) {
        this.a = eVar;
    }

    @Override // android.os.Parcelable.Creator
    public T createFromParcel(Parcel parcel) {
        return this.a.a(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.a.a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public T[] newArray(int i) {
        return this.a.a(i);
    }
}
