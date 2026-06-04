package com.tsf.shell.plugin.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TSFsequence(parcel, (byte) 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TSFsequence[i];
    }

    g() {
    }
}
