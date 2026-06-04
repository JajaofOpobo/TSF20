package com.censivn.C3DEngine.b;

import android.os.Handler;
import android.os.HandlerThread;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes.dex */
public final class w {
    private static ArrayList f = new ArrayList();
    private Handler c;
    private HashMap a = new HashMap();
    private boolean d = false;
    private Vector e = new Vector();
    private ArrayList h = new ArrayList();
    private Object g = new Object();
    private HandlerThread b = new HandlerThread("WidgetManager Database Operating");

    public w() {
        this.b.start();
        this.c = new Handler(this.b.getLooper());
    }

    public final void a(RenderRunnable renderRunnable) {
        if (this.d) {
            f.add(new y(this, renderRunnable, true));
        } else {
            this.e.addElement(renderRunnable);
        }
        if (renderRunnable.autoInvalidate) {
            com.censivn.C3DEngine.a.d().g();
        }
    }

    public static void a(Runnable runnable) {
        com.censivn.C3DEngine.a.e().post(runnable);
    }

    public static void a(Runnable runnable, long j) {
        com.censivn.C3DEngine.a.e().postDelayed(runnable, j);
    }

    public final void b(Runnable runnable) {
        c(runnable);
    }

    public final void c(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        synchronized (this.g) {
            this.h.add(runnable);
            com.censivn.C3DEngine.a.d().g();
        }
    }

    public final void b(Runnable runnable, long j) {
        x xVar = new x(this, runnable);
        this.a.put(runnable, xVar);
        com.censivn.C3DEngine.a.e().postDelayed(xVar, j);
    }

    public final void d(Runnable runnable) {
        this.c.post(runnable);
    }

    public final void c(Runnable runnable, long j) {
        this.c.postDelayed(runnable, j);
    }

    public static void e(Runnable runnable) {
        com.censivn.C3DEngine.a.e().removeCallbacks(runnable);
    }

    public final void f(Runnable runnable) {
        if (runnable != null) {
            Runnable runnable2 = (Runnable) this.a.get(runnable);
            if (runnable2 != null) {
                this.a.remove(runnable);
                com.censivn.C3DEngine.a.e().removeCallbacks(runnable2);
            } else {
                synchronized (this.g) {
                    this.h.remove(runnable);
                }
            }
        }
    }

    public final void b(RenderRunnable renderRunnable) {
        if (this.d) {
            f.add(new y(this, renderRunnable, false));
        } else {
            this.e.removeElement(renderRunnable);
        }
    }

    public final void g(Runnable runnable) {
        this.c.removeCallbacks(runnable);
    }

    public final void a() {
        this.d = true;
        while (true) {
            synchronized (this.g) {
                if (this.h.isEmpty()) {
                    break;
                } else {
                    ((Runnable) this.h.remove(0)).run();
                }
            }
        }
        if (this.e.size() > 0) {
            Enumeration elements = this.e.elements();
            while (elements.hasMoreElements()) {
                RenderRunnable renderRunnable = (RenderRunnable) elements.nextElement();
                renderRunnable.frame--;
                if (renderRunnable.frame <= 0) {
                    f.add(new y(this, renderRunnable, false));
                    switch (renderRunnable.type) {
                        case 0:
                            a((Runnable) renderRunnable);
                            break;
                        case 1:
                            renderRunnable.run();
                            break;
                        case 2:
                            d(renderRunnable);
                            break;
                    }
                } else if (renderRunnable.autoInvalidate) {
                    com.censivn.C3DEngine.a.d().g();
                }
            }
        }
        this.d = false;
        Iterator it = f.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar != null) {
                if (yVar.b) {
                    this.e.addElement(yVar.a);
                } else {
                    this.e.removeElement(yVar.a);
                }
            }
        }
        f.clear();
    }
}
