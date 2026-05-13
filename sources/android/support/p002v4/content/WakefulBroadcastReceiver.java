package android.support.p002v4.content;

import android.content.BroadcastReceiver;
import android.os.PowerManager;
import android.util.SparseArray;
/* renamed from: android.support.v4.content.WakefulBroadcastReceiver */
/* loaded from: classes.dex */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<PowerManager.WakeLock> f415a = new SparseArray<>();

    /* renamed from: b */
    private static int f416b = 1;
}
