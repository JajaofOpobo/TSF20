package com.p060cm.kinfoc;

import android.util.Log;
import com.p060cm.kinfoc.InterfaceC1138c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.cm.kinfoc.h */
/* loaded from: classes.dex */
public class C1145h implements InterfaceC1138c {

    /* renamed from: a */
    private ThreadPoolExecutor f3621a = new ThreadPoolExecutor(1, 5, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    /* renamed from: a */
    public void m9717a(C1144g c1144g, String str, InterfaceC1138c.InterfaceC1139a interfaceC1139a) {
        if (c1144g.m9721f() <= -1 || c1144g.m9721f() >= 1) {
            throw new RuntimeException("server priority is out of range");
        }
        if (C1171q.f3721a) {
            Log.d("KInfoc", "Post data on " + str);
        }
        C1147a c1147a = new C1147a(c1144g, str, interfaceC1139a);
        if (this.f3621a == null) {
            c1147a.start();
        } else {
            this.f3621a.submit(c1147a);
        }
    }

    /* renamed from: com.cm.kinfoc.h$a */
    /* loaded from: classes.dex */
    private class C1147a extends Thread {

        /* renamed from: b */
        private final String f3623b;

        /* renamed from: c */
        private final C1144g f3624c;

        /* renamed from: d */
        private final InterfaceC1138c.InterfaceC1139a f3625d;

        private C1147a(C1144g c1144g, String str, InterfaceC1138c.InterfaceC1139a interfaceC1139a) {
            this.f3623b = str;
            this.f3624c = c1144g;
            this.f3625d = interfaceC1139a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C1145h.this.m9716b(this.f3624c, this.f3623b, this.f3625d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
        if (r2.f3609b == 1) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m9716b(com.p060cm.kinfoc.C1144g r10, java.lang.String r11, com.p060cm.kinfoc.InterfaceC1138c.InterfaceC1139a r12) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            org.apache.http.params.BasicHttpParams r2 = new org.apache.http.params.BasicHttpParams
            r2.<init>()
            r3 = 60000(0xea60, float:8.4078E-41)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r2, r3)
            org.apache.http.impl.client.DefaultHttpClient r3 = new org.apache.http.impl.client.DefaultHttpClient
            r3.<init>(r2)
            org.apache.http.client.methods.HttpPost r4 = new org.apache.http.client.methods.HttpPost
            r4.<init>(r11)
            r2 = 0
            org.apache.http.entity.ByteArrayEntity r5 = new org.apache.http.entity.ByteArrayEntity     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            byte[] r6 = r10.m9733a()     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            r5.<init>(r6)     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            r4.setEntity(r5)     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            org.apache.http.HttpResponse r3 = r3.execute(r4)     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            org.apache.http.HttpEntity r3 = r3.getEntity()     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            java.io.InputStream r3 = r3.getContent()     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            r4.<init>(r3)     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            r5.<init>(r4)     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r4 = r1
        L3f:
            java.lang.String r6 = r5.readLine()     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            if (r6 == 0) goto L6e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            r7.<init>()     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            java.lang.StringBuilder r3 = r7.append(r3)     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            r6.<init>()     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            java.lang.StringBuilder r3 = r6.append(r3)     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            java.lang.String r6 = "\r\n"
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            int r4 = r4 + 1
            r6 = 4
            if (r4 <= r6) goto L3f
        L6e:
            com.cm.kinfoc.b r2 = com.p060cm.kinfoc.C1137b.m9740a(r3)     // Catch: java.lang.Exception -> L8d java.lang.Error -> L95
            if (r2 == 0) goto Lab
            int r3 = r2.f3609b     // Catch: java.lang.Error -> La1 java.lang.Exception -> La6
            if (r3 != r0) goto Lab
        L78:
            r1 = r0
            r0 = r2
        L7a:
            com.cm.kinfoc.i r2 = r10.m9720g()
            if (r2 == 0) goto L83
            r2.m9715a(r0)
        L83:
            if (r12 == 0) goto L8c
            if (r1 == 0) goto L9d
            long r2 = r0.f3608a
            r12.mo9615a(r2, r10)
        L8c:
            return r1
        L8d:
            r0 = move-exception
            r8 = r0
            r0 = r2
            r2 = r8
        L91:
            r2.printStackTrace()
            goto L7a
        L95:
            r0 = move-exception
            r8 = r0
            r0 = r2
            r2 = r8
        L99:
            r2.printStackTrace()
            goto L7a
        L9d:
            r12.mo9614a(r10)
            goto L8c
        La1:
            r0 = move-exception
            r8 = r0
            r0 = r2
            r2 = r8
            goto L99
        La6:
            r0 = move-exception
            r8 = r0
            r0 = r2
            r2 = r8
            goto L91
        Lab:
            r0 = r1
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p060cm.kinfoc.C1145h.m9716b(com.cm.kinfoc.g, java.lang.String, com.cm.kinfoc.c$a):boolean");
    }
}
