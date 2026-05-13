package com.ksmobile.a.b;
/* loaded from: classes.dex */
public class g {
    private static int a = -1;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a() {
        /*
            java.lang.String r0 = "^MemTotal:\\s+([0-9]+) kB$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Exception -> L66
            java.lang.String r2 = "/proc/meminfo"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L66
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L61
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L61
        L12:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L5c
            if (r3 != 0) goto L27
            java.lang.String r0 = "SysUtils"
            java.lang.String r3 = "/proc/meminfo lacks a MemTotal entry?"
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> L5c
        L1f:
            r2.close()     // Catch: java.lang.Throwable -> L61
            r1.close()     // Catch: java.lang.Exception -> L66
        L25:
            r0 = 0
        L26:
            return r0
        L27:
            java.util.regex.Matcher r3 = r0.matcher(r3)     // Catch: java.lang.Throwable -> L5c
            boolean r4 = r3.find()     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L12
            r0 = 1
            java.lang.String r0 = r3.group(r0)     // Catch: java.lang.Throwable -> L5c
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L5c
            r4 = 1024(0x400, float:1.435E-42)
            if (r0 > r4) goto L6f
            java.lang.String r0 = "SysUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r4.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = "Invalid /proc/meminfo total size in kB: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L5c
            r5 = 1
            java.lang.String r3 = r3.group(r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5c
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> L5c
            goto L1f
        L5c:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L61
            throw r0     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Exception -> L66
            throw r0     // Catch: java.lang.Exception -> L66
        L66:
            r0 = move-exception
            java.lang.String r1 = "SysUtils"
            java.lang.String r2 = "Cannot get total physical size from /proc/meminfo"
            android.util.Log.w(r1, r2, r0)
            goto L25
        L6f:
            r2.close()     // Catch: java.lang.Throwable -> L61
            r1.close()     // Catch: java.lang.Exception -> L66
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ksmobile.a.b.g.a():int");
    }
}
