package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.g;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() { // from class: android.support.v4.app.BackStackState.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
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
    final ArrayList<String> j;
    final ArrayList<String> k;

    public BackStackState(g gVar) {
        int size = 0;
        for (g.a aVar = gVar.c; aVar != null; aVar = aVar.a) {
            if (aVar.i != null) {
                size += aVar.i.size();
            }
        }
        this.a = new int[size + (gVar.e * 7)];
        if (!gVar.l) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (g.a aVar2 = gVar.c; aVar2 != null; aVar2 = aVar2.a) {
            int i2 = i + 1;
            this.a[i] = aVar2.c;
            int i3 = i2 + 1;
            this.a[i2] = aVar2.d != null ? aVar2.d.p : -1;
            int i4 = i3 + 1;
            this.a[i3] = aVar2.e;
            int i5 = i4 + 1;
            this.a[i4] = aVar2.f;
            int i6 = i5 + 1;
            this.a[i5] = aVar2.g;
            int i7 = i6 + 1;
            this.a[i6] = aVar2.h;
            if (aVar2.i != null) {
                int size2 = aVar2.i.size();
                int i8 = i7 + 1;
                this.a[i7] = size2;
                int i9 = 0;
                while (i9 < size2) {
                    this.a[i8] = aVar2.i.get(i9).p;
                    i9++;
                    i8++;
                }
                i = i8;
            } else {
                i = i7 + 1;
                this.a[i7] = 0;
            }
        }
        this.b = gVar.j;
        this.c = gVar.k;
        this.d = gVar.n;
        this.e = gVar.p;
        this.f = gVar.q;
        this.g = gVar.r;
        this.h = gVar.s;
        this.i = gVar.t;
        this.j = gVar.u;
        this.k = gVar.v;
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

    public g a(p pVar) {
        g gVar = new g(pVar);
        int i = 0;
        int i2 = 0;
        while (i2 < this.a.length) {
            g.a aVar = new g.a();
            int i3 = i2 + 1;
            aVar.c = this.a[i2];
            if (p.a) {
                Log.v("FragmentManager", "Instantiate " + gVar + " op #" + i + " base fragment #" + this.a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.a[i3];
            if (i5 >= 0) {
                aVar.d = pVar.f.get(i5);
            } else {
                aVar.d = null;
            }
            int i6 = i4 + 1;
            aVar.e = this.a[i4];
            int i7 = i6 + 1;
            aVar.f = this.a[i6];
            int i8 = i7 + 1;
            aVar.g = this.a[i7];
            int i9 = i8 + 1;
            aVar.h = this.a[i8];
            int i10 = i9 + 1;
            int i11 = this.a[i9];
            if (i11 > 0) {
                aVar.i = new ArrayList<>(i11);
                int i12 = 0;
                while (i12 < i11) {
                    if (p.a) {
                        Log.v("FragmentManager", "Instantiate " + gVar + " set remove fragment #" + this.a[i10]);
                    }
                    aVar.i.add(pVar.f.get(this.a[i10]));
                    i12++;
                    i10++;
                }
            }
            gVar.f = aVar.e;
            gVar.g = aVar.f;
            gVar.h = aVar.g;
            gVar.i = aVar.h;
            gVar.a(aVar);
            i++;
            i2 = i10;
        }
        gVar.j = this.b;
        gVar.k = this.c;
        gVar.n = this.d;
        gVar.p = this.e;
        gVar.l = true;
        gVar.q = this.f;
        gVar.r = this.g;
        gVar.s = this.h;
        gVar.t = this.i;
        gVar.u = this.j;
        gVar.v = this.k;
        gVar.a(1);
        return gVar;
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
