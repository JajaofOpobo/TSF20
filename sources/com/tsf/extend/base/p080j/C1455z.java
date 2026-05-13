package com.tsf.extend.base.p080j;

import android.os.Handler;
import android.os.HandlerThread;
import java.security.InvalidParameterException;
/* renamed from: com.tsf.extend.base.j.z */
/* loaded from: classes.dex */
public class C1455z {

    /* renamed from: a */
    private static final Handler[] f4462a = new Handler[9];

    /* renamed from: b */
    private static final String[] f4463b = {"thread_ui", "thread_db", "thread_data", "thread_settings", "thread_load_weather_data", "thread_check_security", "thread_background", "thread_content_obtaion", "thread_worker"};

    /* renamed from: a */
    public static void m8566a() {
        f4462a[0] = new Handler();
    }

    /* renamed from: a */
    public static void m8564a(int i, Runnable runnable) {
        m8563a(i, runnable, 0L);
    }

    /* renamed from: a */
    public static void m8563a(int i, Runnable runnable, long j) {
        m8565a(i).postDelayed(runnable, j);
    }

    /* renamed from: b */
    public static void m8562b(int i, Runnable runnable) {
        m8565a(i).removeCallbacks(runnable);
    }

    /* renamed from: a */
    public static Handler m8565a(int i) {
        if (i < 0 || i >= 9) {
            throw new InvalidParameterException();
        }
        if (f4462a[i] == null) {
            synchronized (f4462a) {
                if (f4462a[i] == null) {
                    HandlerThread handlerThread = new HandlerThread(f4463b[i]);
                    if (i != 0) {
                        handlerThread.setPriority(1);
                    }
                    handlerThread.start();
                    f4462a[i] = new Handler(handlerThread.getLooper());
                }
            }
        }
        return f4462a[i];
    }
}
