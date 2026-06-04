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
    private b mHandler;
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
            HandlerThread handlerThread = new HandlerThread("VMessageQueueManager HandlerThread");
            mHandlerThread = handlerThread;
            handlerThread.start();
        }
        this.mHashMap = new HashMap();
        this.mHandler = new b(this, mHandlerThread.getLooper());
        String str = "create VMessageQueueManager  loop:" + Looper.myLooper();
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
            String str = "widget:" + this.appWidgetId + "    destroy";
        }
    }

    public void pause() {
        if (!this.isPaused) {
            String str = "widget:" + this.appWidgetId + "    pause ";
            this.isPaused = true;
        }
    }

    public void resume() {
        if (this.isPaused) {
            String str = "widget:" + this.appWidgetId + "   resume";
            this.isPaused = false;
            if (this.mQueue.size() > 0) {
                scheduleNextLocked();
            }
        }
    }

    public void post(Runnable runnable, int i) {
        synchronized (this.mQueue) {
            a aVar = new a(this, i, runnable);
            this.mHashMap.put(runnable, aVar);
            this.mQueue.add(aVar);
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
