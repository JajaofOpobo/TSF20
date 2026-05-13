package android.support.p002v4.content;

import android.content.Context;
import android.os.Process;
import android.support.p002v4.app.C0076e;
/* renamed from: android.support.v4.content.h */
/* loaded from: classes.dex */
public final class C0159h {
    /* renamed from: a */
    public static int m13380a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String m13680a = C0076e.m13680a(str);
        if (m13680a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0076e.m13681a(context, m13680a, str2) != 0 ? -2 : 0;
    }

    /* renamed from: a */
    public static int m13381a(Context context, String str) {
        return m13380a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
