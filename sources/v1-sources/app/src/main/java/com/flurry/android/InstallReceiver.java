package com.flurry.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class InstallReceiver extends BroadcastReceiver {
    private final Handler a;
    private File b = null;

    public InstallReceiver() {
        HandlerThread handlerThread = new HandlerThread("InstallReceiver");
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Cdo.c("InstallReceiver", "Received an Install nofication of " + intent.getAction());
        this.b = context.getFileStreamPath(".flurryinstallreceiver.");
        Cdo.c("InstallReceiver", "fInstallReceiverFile is " + this.b);
        if (t.d()) {
            Thread.setDefaultUncaughtExceptionHandler(new u());
        }
        String string = intent.getExtras().getString("referrer");
        Cdo.c("InstallReceiver", "Received an Install referrer of " + string);
        if (string == null || !"com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            Cdo.c("InstallReceiver", "referrer is null");
            return;
        }
        if (!string.contains("=")) {
            Cdo.c("InstallReceiver", "referrer is before decoding: " + string);
            string = URLDecoder.decode(string);
            Cdo.c("InstallReceiver", "referrer is: " + string);
        }
        b(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(File file) {
        FileInputStream fileInputStream;
        Throwable th;
        StringBuffer stringBuffer;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    stringBuffer = new StringBuffer();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            stringBuffer.append(new String(bArr, 0, read));
                        }
                        bp.a(fileInputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        Cdo.b("InstallReceiver", "Error when loading persistent file", th);
                        bp.a(fileInputStream);
                        if (stringBuffer == null) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    stringBuffer = null;
                }
            } catch (Throwable th4) {
                th = th4;
                bp.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th5) {
            fileInputStream = null;
            th = th5;
            bp.a(fileInputStream);
            throw th;
        }
        if (stringBuffer == null) {
            return stringBuffer.toString();
        }
        return null;
    }

    static Map a(String str) {
        HashMap hashMap = new HashMap();
        String[] split = str.split("&");
        int length = split.length;
        for (int i = 0; i < length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                Cdo.a("InstallReceiver", "Invalid referrer Element: " + split[i] + " in referrer tag " + str);
            } else {
                String decode = URLDecoder.decode(split2[0]);
                String decode2 = URLDecoder.decode(split2[1]);
                if (hashMap.get(decode) == null) {
                    hashMap.put(decode, new ArrayList());
                }
                ((List) hashMap.get(decode)).add(decode2);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (hashMap.get("utm_source") == null) {
            sb.append("Campaign Source is missing.\n");
        }
        if (hashMap.get("utm_medium") == null) {
            sb.append("Campaign Medium is missing.\n");
        }
        if (hashMap.get("utm_campaign") == null) {
            sb.append("Campaign Name is missing.\n");
        }
        if (sb.length() > 0) {
            Log.w("Detected missing referrer keys", sb.toString());
        }
        return hashMap;
    }

    private synchronized void b(String str) {
        this.a.post(new cw(this, str));
    }
}
