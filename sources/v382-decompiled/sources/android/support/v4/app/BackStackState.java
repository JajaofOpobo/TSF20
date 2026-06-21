package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: android.support.v4.app.BackStackState.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    };
    final int[] a;
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    final ArrayList j;
    final ArrayList k;

    public BackStackState(m mVar, d dVar) {
        int i = 0;
        for (e eVar = dVar.b; eVar != null; eVar = eVar.a) {
            if (eVar.i != null) {
                i += eVar.i.size();
            }
        }
        this.a = new int[i + (dVar.d * 7)];
        if (!dVar.k) {
            throw new IllegalStateException("Not on back stack");
        }
        int i2 = 0;
        for (e eVar2 = dVar.b; eVar2 != null; eVar2 = eVar2.a) {
            int i3 = i2 + 1;
            this.a[i2] = eVar2.c;
            int i4 = i3 + 1;
            this.a[i3] = eVar2.d != null ? eVar2.d.p : -1;
            int i5 = i4 + 1;
            this.a[i4] = eVar2.e;
            int i6 = i5 + 1;
            this.a[i5] = eVar2.f;
            int i7 = i6 + 1;
            this.a[i6] = eVar2.g;
            int i8 = i7 + 1;
            this.a[i7] = eVar2.h;
            if (eVar2.i != null) {
                int size = eVar2.i.size();
                int i9 = i8 + 1;
                this.a[i8] = size;
                int i10 = 0;
                while (i10 < size) {
                    this.a[i9] = ((Fragment) eVar2.i.get(i10)).p;
                    i10++;
                    i9++;
                }
                i2 = i9;
            } else {
                i2 = i8 + 1;
                this.a[i8] = 0;
            }
        }
        this.b = dVar.i;
        this.c = dVar.j;
        this.d = dVar.m;
        this.e = dVar.o;
        this.f = dVar.p;
        this.g = dVar.q;
        this.h = dVar.r;
        this.i = dVar.s;
        this.j = dVar.t;
        this.k = dVar.u;
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
        this.j = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
    }

    public d a(m mVar) {
        d dVar = new d(mVar);
        int i = 0;
        int i2 = 0;
        while (i2 < this.a.length) {
            e eVar = new e();
            int i3 = i2 + 1;
            eVar.c = this.a[i2];
            if (m.a) {
                Log.v("FragmentManager", "Instantiate " + dVar + " op #" + i + " base fragment #" + this.a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.a[i3];
            if (i5 >= 0) {
                eVar.d = (Fragment) mVar.f.get(i5);
            } else {
                eVar.d = null;
            }
            int i6 = i4 + 1;
            eVar.e = this.a[i4];
            int i7 = i6 + 1;
            eVar.f = this.a[i6];
            int i8 = i7 + 1;
            eVar.g = this.a[i7];
            int i9 = i8 + 1;
            eVar.h = this.a[i8];
            int i10 = i9 + 1;
            int i11 = this.a[i9];
            if (i11 > 0) {
                eVar.i = new ArrayList(i11);
                int i12 = 0;
                while (i12 < i11) {
                    if (m.a) {
                        Log.v("FragmentManager", "Instantiate " + dVar + " set remove fragment #" + this.a[i10]);
                    }
                    eVar.i.add((Fragment) mVar.f.get(this.a[i10]));
                    i12++;
                    i10++;
                }
            }
            dVar.a(eVar);
            i++;
            i2 = i10;
        }
        dVar.i = this.b;
        dVar.j = this.c;
        dVar.m = this.d;
        dVar.o = this.e;
        dVar.k = true;
        dVar.p = this.f;
        dVar.q = this.g;
        dVar.r = this.h;
        dVar.s = this.i;
        dVar.t = this.j;
        dVar.u = this.k;
        dVar.a(1);
        return dVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
    }
}
