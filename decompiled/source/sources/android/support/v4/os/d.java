package android.support.v4.os;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d {
    public static <T> Parcelable.Creator<T> a(e<T> eVar) {
        return Build.VERSION.SDK_INT >= 13 ? g.a(eVar) : new a(eVar);
    }

    /* loaded from: classes.dex */
    static class a<T> implements Parcelable.Creator<T> {
        final e<T> a;

        public a(e<T> eVar) {
            this.a = eVar;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.a.a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.a.a(i);
        }
    }
}
