package com.ksmobile.launcher.cmbase.utils;

import android.content.BroadcastReceiver;
import android.text.TextUtils;
import java.util.HashMap;
/* loaded from: classes.dex */
public class CampaignTrackingReceiver extends BroadcastReceiver {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        r1 = r5[1];
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r12, android.content.Intent r13) {
        /*
            r11 = this;
            r1 = 0
            r9 = 2
            r8 = 1
            r3 = 0
            java.lang.String r0 = "Channel"
            java.lang.String r2 = "CampaignTrackingReceiver onreceive"
            com.ksmobile.a.b.d.a(r0, r2)
            java.lang.String r0 = "referrer"
            java.lang.String r0 = r13.getStringExtra(r0)
            java.lang.String r2 = "com.android.vending.INSTALL_REFERRER"
            java.lang.String r4 = r13.getAction()
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L1e
        L1d:
            return
        L1e:
            if (r0 == 0) goto Lc1
            java.lang.String r2 = "GBK"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r2)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L96
            java.lang.String r2 = "&"
            java.lang.String[] r4 = r0.split(r2)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lbc
            int r2 = r4.length     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lbc
            if (r2 <= 0) goto L54
            r2 = r3
        L30:
            int r5 = r4.length     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lbc
            if (r2 >= r5) goto L54
            r5 = r4[r2]     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lbc
            java.lang.String r6 = "="
            java.lang.String[] r5 = r5.split(r6)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lbc
            int r6 = r5.length     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lbc
            if (r6 != r9) goto L71
            java.lang.String r6 = "utm_source"
            r7 = 0
            r7 = r5[r7]     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lbc
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lbc
            java.lang.String r7 = r7.toLowerCase()     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lbc
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lbc
            if (r6 == 0) goto L71
            r2 = 1
            r1 = r5[r2]     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lbc
        L54:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L5c
            java.lang.String r1 = "10000000"
        L5c:
            java.lang.String r0 = r11.a(r0)
            java.lang.String r2 = "Channel"
            java.lang.String r4 = "CampaignTrackingReceiver cn %s   cn2 %s"
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r5[r3] = r1
            r5[r8] = r0
            com.ksmobile.a.b.d.a(r2, r4, r5)
            com.ksmobile.launcher.cmbase.utils.b.a(r12, r1, r0)
            goto L1d
        L71:
            int r2 = r2 + 1
            goto L30
        L74:
            r0 = move-exception
            r2 = r1
        L76:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Lba
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L81
            java.lang.String r1 = "10000000"
        L81:
            java.lang.String r0 = r11.a(r2)
            java.lang.String r2 = "Channel"
            java.lang.String r4 = "CampaignTrackingReceiver cn %s   cn2 %s"
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r5[r3] = r1
            r5[r8] = r0
            com.ksmobile.a.b.d.a(r2, r4, r5)
            com.ksmobile.launcher.cmbase.utils.b.a(r12, r1, r0)
            goto L1d
        L96:
            r0 = move-exception
            r2 = r1
        L98:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto La0
            java.lang.String r1 = "10000000"
        La0:
            java.lang.String r2 = r11.a(r2)
            java.lang.String r4 = "Channel"
            java.lang.String r5 = "CampaignTrackingReceiver cn %s   cn2 %s"
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r3] = r1
            r6[r8] = r2
            com.ksmobile.a.b.d.a(r4, r5, r6)
            com.ksmobile.launcher.cmbase.utils.b.a(r12, r1, r2)
            throw r0
        Lb5:
            r2 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
            goto L98
        Lba:
            r0 = move-exception
            goto L98
        Lbc:
            r2 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
            goto L76
        Lc1:
            r0 = r1
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ksmobile.launcher.cmbase.utils.CampaignTrackingReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    private String a(String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        try {
            String[] split = str.split("&");
            while (split != null) {
                if (i >= split.length) {
                    break;
                }
                String[] split2 = split[i].split("=");
                if (split2 != null && split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
                i++;
            }
        } catch (Exception e) {
        }
        if (hashMap.containsKey("pid")) {
            sb.append((String) hashMap.get("pid"));
            sb.append("#");
        }
        if (hashMap.containsKey("af_siteid")) {
            sb.append((String) hashMap.get("af_siteid"));
            sb.append("#");
        }
        if (hashMap.containsKey("clickid")) {
            sb.append((String) hashMap.get("clickid"));
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            sb2 = null;
        }
        return sb2;
    }
}
