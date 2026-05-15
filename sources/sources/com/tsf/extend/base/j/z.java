package com.tsf.extend.base.j;

import android.os.Handler;
import android.os.HandlerThread;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class z {
    private static final Handler[] a = new Handler[9];
    private static final String[] b = {"thread_ui", "thread_db", "thread_data", "thread_settings", "thread_load_weather_data", "thread_check_security", "thread_background", "thread_content_obtaion", "thread_worker"};

    public static void a() {
        a[0] = new Handler();
    }

    public static void a(int i, Runnable runnable) {
        a(i, runnable, 0L);
    }

    public static void a(int i, Runnable runnable, long j) {
        a(i).postDelayed(runnable, j);
    }

    public static void b(int i, Runnable runnable) {
        a(i).removeCallbacks(runnable);
    }

    public static Handler a(int i) {
        if (i < 0 || i >= 9) {
            throw new InvalidParameterException();
        }
        if (a[i] == null) {
            synchronized (a) {
                if (a[i] == null) {
                    HandlerThread handlerThread = new HandlerThread(b[i]);
                    if (i != 0) {
                        handlerThread.setPriority(1);
                    }
                    handlerThread.start();
                    a[i] = new Handler(handlerThread.getLooper());
                }
            }
        }
        return a[i];
    }
}
