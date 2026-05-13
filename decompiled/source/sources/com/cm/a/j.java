package com.cm.a;
/* loaded from: classes.dex */
public class j {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r3 == android.net.NetworkInfo.State.CONNECTING) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r0 == android.net.NetworkInfo.State.CONNECTING) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r5) {
        /*
            r2 = 1
            r1 = 0
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 != 0) goto Le
            r0 = r1
        Ld:
            return r0
        Le:
            r3 = 0
            android.net.NetworkInfo r3 = r0.getNetworkInfo(r3)     // Catch: java.lang.Exception -> L23
            if (r3 == 0) goto L24
            android.net.NetworkInfo$State r3 = r3.getState()     // Catch: java.lang.Exception -> L23
            android.net.NetworkInfo$State r4 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.Exception -> L23
            if (r3 == r4) goto L21
            android.net.NetworkInfo$State r4 = android.net.NetworkInfo.State.CONNECTING     // Catch: java.lang.Exception -> L23
            if (r3 != r4) goto L24
        L21:
            r0 = r2
            goto Ld
        L23:
            r3 = move-exception
        L24:
            r3 = 1
            android.net.NetworkInfo r0 = r0.getNetworkInfo(r3)     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L3a
            android.net.NetworkInfo$State r0 = r0.getState()     // Catch: java.lang.Exception -> L39
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.Exception -> L39
            if (r0 == r3) goto L37
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.CONNECTING     // Catch: java.lang.Exception -> L39
            if (r0 != r3) goto L3a
        L37:
            r0 = r2
            goto Ld
        L39:
            r0 = move-exception
        L3a:
            r0 = r1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cm.a.j.a(android.content.Context):boolean");
    }
}
