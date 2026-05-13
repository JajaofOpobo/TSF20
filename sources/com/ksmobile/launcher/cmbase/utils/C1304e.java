package com.ksmobile.launcher.cmbase.utils;

import android.os.Handler;
import android.os.HandlerThread;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
/* renamed from: com.ksmobile.launcher.cmbase.utils.e */
/* loaded from: classes.dex */
public class C1304e {

    /* renamed from: a */
    private static final ArrayList<Handler> f4112a = new ArrayList<>(Collections.nCopies(7, null));

    /* renamed from: b */
    private static final String[] f4113b = {"thread_ui", "thread_db", "thread_data", "thread_settings", "thread_load_weather_data", "thread_check_security", "thread_background"};

    /* renamed from: a */
    public static void m9044a() {
        f4112a.set(0, new Handler());
    }

    /* renamed from: a */
    public static void m9042a(int i, Runnable runnable) {
        m9041a(i, runnable, 0L);
    }

    /* renamed from: a */
    public static void m9041a(int i, Runnable runnable, long j) {
        if (i < 0 || i >= 7) {
            throw new InvalidParameterException();
        }
        m9043a(i).postDelayed(runnable, j);
    }

    /* renamed from: a */
    public static Handler m9043a(int i) {
        if (i < 0 || i >= 7) {
            throw new InvalidParameterException();
        }
        if (f4112a.get(i) == null) {
            synchronized (f4112a) {
                if (f4112a.get(i) == null) {
                    HandlerThread handlerThread = new HandlerThread(f4113b[i]);
                    if (i != 0) {
                        handlerThread.setPriority(1);
                    }
                    handlerThread.start();
                    f4112a.set(i, new Handler(handlerThread.getLooper()));
                }
            }
        }
        return f4112a.get(i);
    }
}
