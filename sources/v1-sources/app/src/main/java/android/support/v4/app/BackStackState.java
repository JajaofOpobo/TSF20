package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new c();
    final int[] a;
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;

    public BackStackState(a aVar) {
        int i = 0;
        for (b bVar = aVar.b; bVar != null; bVar = bVar.a) {
            if (bVar.i != null) {
                i += bVar.i.size();
            }
        }
        this.a = new int[i + (aVar.d * 7)];
        if (!aVar.k) {
            throw new IllegalStateException("Not on back stack");
        }
        int i2 = 0;
        for (b bVar2 = aVar.b; bVar2 != null; bVar2 = bVar2.a) {
            int i3 = i2 + 1;
            this.a[i2] = bVar2.c;
            int i4 = i3 + 1;
            this.a[i3] = bVar2.d != null ? bVar2.d.f : -1;
            int i5 = i4 + 1;
            this.a[i4] = bVar2.e;
            int i6 = i5 + 1;
            this.a[i5] = bVar2.f;
            int i7 = i6 + 1;
            this.a[i6] = bVar2.g;
            int i8 = i7 + 1;
            this.a[i7] = bVar2.h;
            if (bVar2.i != null) {
                int size = bVar2.i.size();
                int i9 = i8 + 1;
                this.a[i8] = size;
                int i10 = 0;
                while (i10 < size) {
                    this.a[i9] = ((Fragment) bVar2.i.get(i10)).f;
                    i10++;
                    i9++;
                }
                i2 = i9;
            } else {
                i2 = i8 + 1;
                this.a[i8] = 0;
            }
        }
        this.b = aVar.i;
        this.c = aVar.j;
        this.d = aVar.m;
        this.e = aVar.o;
        this.f = aVar.p;
        this.g = aVar.q;
        this.h = aVar.r;
        this.i = aVar.s;
    }

    public BackStackState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public final a a(m mVar) {
        a aVar = new a(mVar);
        int i = 0;
        int i2 = 0;
        while (i2 < this.a.length) {
            b bVar = new b();
            int i3 = i2 + 1;
            bVar.c = this.a[i2];
            if (m.a) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i + " base fragment #" + this.a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.a[i3];
            if (i5 >= 0) {
                bVar.d = (Fragment) mVar.f.get(i5);
            } else {
                bVar.d = null;
            }
            int i6 = i4 + 1;
            bVar.e = this.a[i4];
            int i7 = i6 + 1;
            bVar.f = this.a[i6];
            int i8 = i7 + 1;
            bVar.g = this.a[i7];
            int i9 = i8 + 1;
            bVar.h = this.a[i8];
            int i10 = i9 + 1;
            int i11 = this.a[i9];
            if (i11 > 0) {
                bVar.i = new ArrayList(i11);
                int i12 = 0;
                while (i12 < i11) {
                    if (m.a) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " set remove fragment #" + this.a[i10]);
                    }
                    bVar.i.add((Fragment) mVar.f.get(this.a[i10]));
                    i12++;
                    i10++;
                }
            }
            aVar.a(bVar);
            i++;
            i2 = i10;
        }
        aVar.i = this.b;
        aVar.j = this.c;
        aVar.m = this.d;
        aVar.o = this.e;
        aVar.k = true;
        aVar.p = this.f;
        aVar.q = this.g;
        aVar.r = this.h;
        aVar.s = this.i;
        aVar.a(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
    }
}
