package com.ksmobile.launcher.cmbase.utils;

import android.os.Handler;
import android.os.HandlerThread;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes.dex */
public class e {
    private static final ArrayList<Handler> a = new ArrayList<>(Collections.nCopies(7, null));
    private static final String[] b = {"thread_ui", "thread_db", "thread_data", "thread_settings", "thread_load_weather_data", "thread_check_security", "thread_background"};

    public static void a() {
        a.set(0, new Handler());
    }

    public static void a(int i, Runnable runnable) {
        a(i, runnable, 0L);
    }

    public static void a(int i, Runnable runnable, long j) {
        if (i < 0 || i >= 7) {
            throw new InvalidParameterException();
        }
        a(i).postDelayed(runnable, j);
    }

    public static Handler a(int i) {
        if (i < 0 || i >= 7) {
            throw new InvalidParameterException();
        }
        if (a.get(i) == null) {
            synchronized (a) {
                if (a.get(i) == null) {
                    HandlerThread handlerThread = new HandlerThread(b[i]);
                    if (i != 0) {
                        handlerThread.setPriority(1);
                    }
                    handlerThread.start();
                    a.set(i, new Handler(handlerThread.getLooper()));
                }
            }
        }
        return a.get(i);
    }
}
