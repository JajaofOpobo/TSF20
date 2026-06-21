package android.support.v4.d;

import android.os.Build;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class a {
    public static Parcelable.Creator a(c cVar) {
        return Build.VERSION.SDK_INT >= 13 ? e.a(cVar) : new b(cVar);
    }
}
