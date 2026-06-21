package com.censivn.C3DEngine.api.message;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class VMessageQueueManager {
    private static HandlerThread mHandlerThread;
    private int appWidgetId;
    private boolean isPaused;
    private a mHandler;
    private HashMap mHashMap;
    private LinkedList mQueue;
    public static int TYPE_MAINUI_THREAD = 0;
    public static int TYPE_GL_THREAD = 1;

    public VMessageQueueManager(int i) {
        this.appWidgetId = 0;
        this.mQueue = new LinkedList();
        this.isPaused = false;
        this.appWidgetId = i;
        init();
    }

    public VMessageQueueManager() {
        this.appWidgetId = 0;
        this.mQueue = new LinkedList();
        this.isPaused = false;
        init();
    }

    private void init() {
        if (mHandlerThread == null) {
            mHandlerThread = new HandlerThread("VMessageQueueManager HandlerThread");
            mHandlerThread.start();
        }
        this.mHashMap = new HashMap();
        this.mHandler = new a(this, mHandlerThread.getLooper());
    }

    public Looper getLooper() {
        return mHandlerThread.getLooper();
    }

    public boolean getStatus() {
        return !this.isPaused;
    }

    public void destroy() {
        synchronized (this.mQueue) {
            this.mQueue.clear();
            this.mQueue = null;
            this.mHandler = null;
        }
    }

    public void pause() {
        if (!this.isPaused) {
            this.isPaused = true;
        }
    }

    public void resume() {
        if (this.isPaused) {
            this.isPaused = false;
            if (this.mQueue.size() > 0) {
                scheduleNextLocked();
            }
        }
    }

    public void post(final Runnable runnable, final int i) {
        synchronized (this.mQueue) {
            Runnable runnable2 = new Runnable() { // from class: com.censivn.C3DEngine.api.message.VMessageQueueManager.1
                @Override // java.lang.Runnable
                public void run() {
                    if (i == VMessageQueueManager.TYPE_GL_THREAD) {
                        com.censivn.C3DEngine.a.a().c(runnable);
                    } else if (i == VMessageQueueManager.TYPE_MAINUI_THREAD) {
                        com.censivn.C3DEngine.a.a().a(runnable);
                    }
                }
            };
            this.mHashMap.put(runnable, runnable2);
            this.mQueue.add(runnable2);
            if (this.mQueue.size() == 1) {
                scheduleNextLocked();
            }
        }
    }

    public void cancelRunnable(Runnable runnable) {
        synchronized (this.mQueue) {
            Runnable runnable2 = (Runnable) this.mHashMap.get(runnable);
            if (runnable2 != null) {
                while (this.mQueue.remove(runnable2)) {
                }
            }
        }
    }

    public void cancel() {
        synchronized (this.mQueue) {
            this.mQueue.clear();
            this.mHashMap.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleNextLocked() {
        if (this.mQueue.size() > 0) {
            this.mHandler.sendEmptyMessage(1);
        }
    }
}
