package com.censivn.C3DEngine.p031b.p035c;

import android.os.Handler;
import android.os.HandlerThread;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.tsf.shell.Home;
import com.tsf.shell.manager.bind.ShellModel;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
/* renamed from: com.censivn.C3DEngine.b.c.c */
/* loaded from: classes.dex */
public class C0919c {

    /* renamed from: f */
    private static ArrayList<C0921a> f2701f = new ArrayList<>();

    /* renamed from: c */
    private Handler f2704c;

    /* renamed from: a */
    private HashMap<Runnable, Runnable> f2702a = new HashMap<>();

    /* renamed from: d */
    private boolean f2705d = false;

    /* renamed from: e */
    private Vector<RenderRunnable> f2706e = new Vector<>();

    /* renamed from: h */
    private ArrayList<Runnable> f2708h = new ArrayList<>();

    /* renamed from: g */
    private Object f2707g = new Object();

    /* renamed from: b */
    private HandlerThread f2703b = new HandlerThread("WidgetManager Database Operating");

    public C0919c() {
        this.f2703b.start();
        this.f2704c = new Handler(this.f2703b.getLooper());
    }

    /* renamed from: a */
    public void m10590a(RenderRunnable renderRunnable) {
        if (this.f2705d) {
            f2701f.add(new C0921a(renderRunnable, true));
        } else {
            this.f2706e.addElement(renderRunnable);
        }
        if (renderRunnable.autoInvalidate && C0853a.m10855e() != null) {
            C0853a.m10855e().m10760j();
        }
    }

    /* renamed from: a */
    public void m10588a(Runnable runnable) {
        Home.m6177b().runOnUiThread(runnable);
    }

    /* renamed from: a */
    public void m10587a(Runnable runnable, long j) {
        C0853a.m10854f().postDelayed(runnable, j);
    }

    /* renamed from: b */
    public void m10585b(Runnable runnable) {
        m10583c(runnable);
    }

    /* renamed from: c */
    public void m10583c(Runnable runnable) {
        if (runnable != null) {
            synchronized (this.f2707g) {
                this.f2708h.add(runnable);
                C0853a.m10855e().m10760j();
            }
        }
    }

    /* renamed from: b */
    public void m10584b(final Runnable runnable, long j) {
        Runnable runnable2 = new Runnable() { // from class: com.censivn.C3DEngine.b.c.c.1
            @Override // java.lang.Runnable
            public void run() {
                C0919c.this.f2702a.remove(runnable);
                C0919c.this.m10583c(runnable);
            }
        };
        this.f2702a.put(runnable, runnable2);
        C0853a.m10854f().postDelayed(runnable2, j);
    }

    /* renamed from: d */
    public void m10581d(Runnable runnable) {
        this.f2704c.post(runnable);
    }

    /* renamed from: c */
    public void m10582c(Runnable runnable, long j) {
        this.f2704c.postDelayed(runnable, j);
    }

    /* renamed from: e */
    public void m10580e(Runnable runnable) {
        ShellModel.m2389a(runnable);
    }

    /* renamed from: f */
    public void m10579f(Runnable runnable) {
        C0853a.m10854f().removeCallbacks(runnable);
    }

    /* renamed from: g */
    public void m10578g(Runnable runnable) {
        if (runnable != null) {
            Runnable runnable2 = this.f2702a.get(runnable);
            if (runnable2 != null) {
                this.f2702a.remove(runnable);
                C0853a.m10854f().removeCallbacks(runnable2);
                return;
            }
            synchronized (this.f2707g) {
                this.f2708h.remove(runnable);
            }
        }
    }

    /* renamed from: b */
    public void m10586b(RenderRunnable renderRunnable) {
        if (this.f2705d) {
            f2701f.add(new C0921a(renderRunnable, false));
        } else {
            this.f2706e.removeElement(renderRunnable);
        }
    }

    /* renamed from: h */
    public void m10577h(Runnable runnable) {
        this.f2704c.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public void m10591a() {
        this.f2705d = true;
        while (true) {
            synchronized (this.f2707g) {
                if (this.f2708h.isEmpty()) {
                    break;
                }
                this.f2708h.remove(0).run();
            }
        }
        if (this.f2706e.size() > 0) {
            Enumeration<RenderRunnable> elements = this.f2706e.elements();
            while (elements.hasMoreElements()) {
                RenderRunnable nextElement = elements.nextElement();
                nextElement.frame--;
                if (nextElement.frame < 1) {
                    f2701f.add(new C0921a(nextElement, false));
                    switch (nextElement.type) {
                        case 0:
                            m10588a((Runnable) nextElement);
                            continue;
                        case 1:
                            nextElement.run();
                            continue;
                        case 2:
                            m10581d(nextElement);
                            continue;
                    }
                } else if (nextElement.autoInvalidate) {
                    C0853a.m10855e().m10760j();
                }
            }
        }
        this.f2705d = false;
        Iterator<C0921a> it = f2701f.iterator();
        while (it.hasNext()) {
            C0921a next = it.next();
            if (next != null) {
                if (next.f2712b) {
                    this.f2706e.addElement(next.f2711a);
                } else {
                    this.f2706e.removeElement(next.f2711a);
                }
            }
        }
        f2701f.clear();
    }

    /* renamed from: com.censivn.C3DEngine.b.c.c$a */
    /* loaded from: classes.dex */
    class C0921a {

        /* renamed from: a */
        public RenderRunnable f2711a;

        /* renamed from: b */
        public boolean f2712b;

        public C0921a(RenderRunnable renderRunnable, boolean z) {
            this.f2711a = renderRunnable;
            this.f2712b = z;
        }
    }
}
