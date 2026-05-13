package android.support.p002v4.app;

import android.os.Parcel;
import android.os.Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.FragmentManagerState */
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>() { // from class: android.support.v4.app.FragmentManagerState.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    };

    /* renamed from: a */
    FragmentState[] f188a;

    /* renamed from: b */
    int[] f189b;

    /* renamed from: c */
    BackStackState[] f190c;

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.f188a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f189b = parcel.createIntArray();
        this.f190c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f188a, i);
        parcel.writeIntArray(this.f189b);
        parcel.writeTypedArray(this.f190c, i);
    }
}
