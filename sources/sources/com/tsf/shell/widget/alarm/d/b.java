package com.tsf.shell.widget.alarm.d;

import java.io.Serializable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class b implements Serializable {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] a() throws java.lang.Throwable {
        /*
            r4 = this;
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r2 = 0
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L25
            r1.<init>(r3)     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L25
            r1.writeObject(r4)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            if (r1 == 0) goto L13
            r1.close()     // Catch: java.io.IOException -> L2d
        L13:
            byte[] r0 = r3.toByteArray()
            return r0
        L18:
            r0 = move-exception
            r1 = r2
        L1a:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L13
            r1.close()     // Catch: java.io.IOException -> L23
            goto L13
        L23:
            r0 = move-exception
            goto L13
        L25:
            r0 = move-exception
            r1 = r2
        L27:
            if (r1 == 0) goto L2c
            r1.close()     // Catch: java.io.IOException -> L2f
        L2c:
            throw r0
        L2d:
            r0 = move-exception
            goto L13
        L2f:
            r1 = move-exception
            goto L2c
        L31:
            r0 = move-exception
            goto L27
        L33:
            r0 = move-exception
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.widget.alarm.d.b.a():byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(byte[] r4) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r4)
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Exception -> L1a java.lang.Throwable -> L2c
            r2.<init>(r3)     // Catch: java.lang.Exception -> L1a java.lang.Throwable -> L2c
            java.lang.Object r0 = r2.readObject()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r3 == 0) goto L14
            r3.close()     // Catch: java.io.IOException -> L3a
        L14:
            if (r2 == 0) goto L19
            r2.close()     // Catch: java.io.IOException -> L3c
        L19:
            return r0
        L1a:
            r1 = move-exception
            r2 = r0
        L1c:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L24
            r3.close()     // Catch: java.io.IOException -> L3e
        L24:
            if (r2 == 0) goto L19
            r2.close()     // Catch: java.io.IOException -> L2a
            goto L19
        L2a:
            r1 = move-exception
            goto L19
        L2c:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L2f:
            if (r3 == 0) goto L34
            r3.close()     // Catch: java.io.IOException -> L40
        L34:
            if (r2 == 0) goto L39
            r2.close()     // Catch: java.io.IOException -> L42
        L39:
            throw r0
        L3a:
            r1 = move-exception
            goto L14
        L3c:
            r1 = move-exception
            goto L19
        L3e:
            r1 = move-exception
            goto L24
        L40:
            r1 = move-exception
            goto L34
        L42:
            r1 = move-exception
            goto L39
        L44:
            r0 = move-exception
            goto L2f
        L46:
            r1 = move-exception
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.widget.alarm.d.b.a(byte[]):java.lang.Object");
    }
}
