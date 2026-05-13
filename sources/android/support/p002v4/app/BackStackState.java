package android.support.p002v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.app.RunnableC0081g;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.BackStackState */
/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() { // from class: android.support.v4.app.BackStackState.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    };

    /* renamed from: a */
    final int[] f106a;

    /* renamed from: b */
    final int f107b;

    /* renamed from: c */
    final int f108c;

    /* renamed from: d */
    final String f109d;

    /* renamed from: e */
    final int f110e;

    /* renamed from: f */
    final int f111f;

    /* renamed from: g */
    final CharSequence f112g;

    /* renamed from: h */
    final int f113h;

    /* renamed from: i */
    final CharSequence f114i;

    /* renamed from: j */
    final ArrayList<String> f115j;

    /* renamed from: k */
    final ArrayList<String> f116k;

    public BackStackState(RunnableC0081g runnableC0081g) {
        int i = 0;
        for (RunnableC0081g.C0085a c0085a = runnableC0081g.f224c; c0085a != null; c0085a = c0085a.f259a) {
            if (c0085a.f267i != null) {
                i += c0085a.f267i.size();
            }
        }
        this.f106a = new int[i + (runnableC0081g.f226e * 7)];
        if (!runnableC0081g.f233l) {
            throw new IllegalStateException("Not on back stack");
        }
        int i2 = 0;
        for (RunnableC0081g.C0085a c0085a2 = runnableC0081g.f224c; c0085a2 != null; c0085a2 = c0085a2.f259a) {
            int i3 = i2 + 1;
            this.f106a[i2] = c0085a2.f261c;
            int i4 = i3 + 1;
            this.f106a[i3] = c0085a2.f262d != null ? c0085a2.f262d.f158p : -1;
            int i5 = i4 + 1;
            this.f106a[i4] = c0085a2.f263e;
            int i6 = i5 + 1;
            this.f106a[i5] = c0085a2.f264f;
            int i7 = i6 + 1;
            this.f106a[i6] = c0085a2.f265g;
            int i8 = i7 + 1;
            this.f106a[i7] = c0085a2.f266h;
            if (c0085a2.f267i != null) {
                int size = c0085a2.f267i.size();
                int i9 = i8 + 1;
                this.f106a[i8] = size;
                int i10 = 0;
                while (i10 < size) {
                    this.f106a[i9] = c0085a2.f267i.get(i10).f158p;
                    i10++;
                    i9++;
                }
                i2 = i9;
            } else {
                i2 = i8 + 1;
                this.f106a[i8] = 0;
            }
        }
        this.f107b = runnableC0081g.f231j;
        this.f108c = runnableC0081g.f232k;
        this.f109d = runnableC0081g.f235n;
        this.f110e = runnableC0081g.f237p;
        this.f111f = runnableC0081g.f238q;
        this.f112g = runnableC0081g.f239r;
        this.f113h = runnableC0081g.f240s;
        this.f114i = runnableC0081g.f241t;
        this.f115j = runnableC0081g.f242u;
        this.f116k = runnableC0081g.f243v;
    }

    public BackStackState(Parcel parcel) {
        this.f106a = parcel.createIntArray();
        this.f107b = parcel.readInt();
        this.f108c = parcel.readInt();
        this.f109d = parcel.readString();
        this.f110e = parcel.readInt();
        this.f111f = parcel.readInt();
        this.f112g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f113h = parcel.readInt();
        this.f114i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f115j = parcel.createStringArrayList();
        this.f116k = parcel.createStringArrayList();
    }

    /* renamed from: a */
    public RunnableC0081g m13797a(C0096p c0096p) {
        RunnableC0081g runnableC0081g = new RunnableC0081g(c0096p);
        int i = 0;
        int i2 = 0;
        while (i2 < this.f106a.length) {
            RunnableC0081g.C0085a c0085a = new RunnableC0081g.C0085a();
            int i3 = i2 + 1;
            c0085a.f261c = this.f106a[i2];
            if (C0096p.f297a) {
                Log.v("FragmentManager", "Instantiate " + runnableC0081g + " op #" + i + " base fragment #" + this.f106a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f106a[i3];
            if (i5 >= 0) {
                c0085a.f262d = c0096p.f303f.get(i5);
            } else {
                c0085a.f262d = null;
            }
            int i6 = i4 + 1;
            c0085a.f263e = this.f106a[i4];
            int i7 = i6 + 1;
            c0085a.f264f = this.f106a[i6];
            int i8 = i7 + 1;
            c0085a.f265g = this.f106a[i7];
            int i9 = i8 + 1;
            c0085a.f266h = this.f106a[i8];
            int i10 = i9 + 1;
            int i11 = this.f106a[i9];
            if (i11 > 0) {
                c0085a.f267i = new ArrayList<>(i11);
                int i12 = 0;
                while (i12 < i11) {
                    if (C0096p.f297a) {
                        Log.v("FragmentManager", "Instantiate " + runnableC0081g + " set remove fragment #" + this.f106a[i10]);
                    }
                    c0085a.f267i.add(c0096p.f303f.get(this.f106a[i10]));
                    i12++;
                    i10++;
                }
            }
            runnableC0081g.f227f = c0085a.f263e;
            runnableC0081g.f228g = c0085a.f264f;
            runnableC0081g.f229h = c0085a.f265g;
            runnableC0081g.f230i = c0085a.f266h;
            runnableC0081g.m13670a(c0085a);
            i++;
            i2 = i10;
        }
        runnableC0081g.f231j = this.f107b;
        runnableC0081g.f232k = this.f108c;
        runnableC0081g.f235n = this.f109d;
        runnableC0081g.f237p = this.f110e;
        runnableC0081g.f233l = true;
        runnableC0081g.f238q = this.f111f;
        runnableC0081g.f239r = this.f112g;
        runnableC0081g.f240s = this.f113h;
        runnableC0081g.f241t = this.f114i;
        runnableC0081g.f242u = this.f115j;
        runnableC0081g.f243v = this.f116k;
        runnableC0081g.m13675a(1);
        return runnableC0081g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f106a);
        parcel.writeInt(this.f107b);
        parcel.writeInt(this.f108c);
        parcel.writeString(this.f109d);
        parcel.writeInt(this.f110e);
        parcel.writeInt(this.f111f);
        TextUtils.writeToParcel(this.f112g, parcel, 0);
        parcel.writeInt(this.f113h);
        TextUtils.writeToParcel(this.f114i, parcel, 0);
        parcel.writeStringList(this.f115j);
        parcel.writeStringList(this.f116k);
    }
}
