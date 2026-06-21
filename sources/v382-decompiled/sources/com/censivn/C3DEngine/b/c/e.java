package com.censivn.C3DEngine.b.c;

import android.os.Handler;
import android.os.HandlerThread;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.tsf.shell.Home;
import com.tsf.shell.manager.bind.ShellModel;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes.dex */
public class e {
    private static ArrayList f = new ArrayList();
    private Handler c;
    private HashMap a = new HashMap();
    private boolean d = false;
    private Vector e = new Vector();
    private ArrayList h = new ArrayList();
    private Object g = new Object();
    private HandlerThread b = new HandlerThread("WidgetManager Database Operating");

    public e() {
        this.b.start();
        this.c = new Handler(this.b.getLooper());
    }

    public void a(RenderRunnable renderRunnable) {
        if (this.d) {
            f.add(new f(this, renderRunnable, true));
        } else {
            this.e.addElement(renderRunnable);
        }
        if (renderRunnable.autoInvalidate && com.censivn.C3DEngine.a.e() != null) {
            com.censivn.C3DEngine.a.e().j();
        }
    }

    public void a(Runnable runnable) {
        Home.b().runOnUiThread(runnable);
    }

    public void a(Runnable runnable, long j) {
        com.censivn.C3DEngine.a.f().postDelayed(runnable, j);
    }

    public void b(Runnable runnable) {
        c(runnable);
    }

    public void c(Runnable runnable) {
        if (runnable != null) {
            synchronized (this.g) {
                this.h.add(runnable);
                com.censivn.C3DEngine.a.e().j();
            }
        }
    }

    public void b(final Runnable runnable, long j) {
        Runnable runnable2 = new Runnable() { // from class: com.censivn.C3DEngine.b.c.e.1
            @Override // java.lang.Runnable
            public void run() {
                e.this.a.remove(runnable);
                e.this.c(runnable);
            }
        };
        this.a.put(runnable, runnable2);
        com.censivn.C3DEngine.a.f().postDelayed(runnable2, j);
    }

    public void d(Runnable runnable) {
        this.c.post(runnable);
    }

    public void c(Runnable runnable, long j) {
        this.c.postDelayed(runnable, j);
    }

    public void e(Runnable runnable) {
        ShellModel.a(runnable);
    }

    public void f(Runnable runnable) {
        com.censivn.C3DEngine.a.f().removeCallbacks(runnable);
    }

    public void g(Runnable runnable) {
        if (runnable != null) {
            Runnable runnable2 = (Runnable) this.a.get(runnable);
            if (runnable2 != null) {
                this.a.remove(runnable);
                com.censivn.C3DEngine.a.f().removeCallbacks(runnable2);
            } else {
                synchronized (this.g) {
                    this.h.remove(runnable);
                }
            }
        }
    }

    public void b(RenderRunnable renderRunnable) {
        if (this.d) {
            f.add(new f(this, renderRunnable, false));
        } else {
            this.e.removeElement(renderRunnable);
        }
    }

    public void h(Runnable runnable) {
        this.c.removeCallbacks(runnable);
    }

    public void a() {
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
                if (renderRunnable.frame < 1) {
                    f.add(new f(this, renderRunnable, false));
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
                    com.censivn.C3DEngine.a.e().j();
                }
            }
        }
        this.d = false;
        Iterator it = f.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar != null) {
                if (fVar.b) {
                    this.e.addElement(fVar.a);
                } else {
                    this.e.removeElement(fVar.a);
                }
            }
        }
        f.clear();
    }
}
