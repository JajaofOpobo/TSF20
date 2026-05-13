package com.tsf.shell.manager.p187r.p189b.p192c;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1024b;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1036f;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1040h;
import com.censivn.C3DEngine.p031b.p046h.p049c.C1049a;
import com.tsf.C1306b;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p187r.p189b.p190a.C3636c;
import com.tsf.shell.manager.p187r.p189b.p191b.C3644a;
import com.tsf.shell.manager.p187r.p193c.C3695a;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: com.tsf.shell.manager.r.b.c.b */
/* loaded from: classes.dex */
public class C3655b extends C3644a {

    /* renamed from: a */
    private C3667d f12074a;

    /* renamed from: b */
    private C1040h f12075b;

    /* renamed from: e */
    private PackageManager f12076e;

    /* renamed from: f */
    private AppWidgetManager f12077f;

    /* renamed from: g */
    private boolean f12078g;

    /* renamed from: h */
    private ArrayList<C3661a> f12079h;

    /* renamed from: i */
    private C1049a f12080i;

    public C3655b(AbstractC2593d abstractC2593d, C3667d c3667d) {
        super(abstractC2593d);
        this.f12078g = false;
        this.f12079h = new ArrayList<>();
        this.f12074a = c3667d;
        m1795i();
    }

    /* renamed from: i */
    private void m1795i() {
        this.f12076e = C0853a.m10856d().getPackageManager();
        this.f12077f = AppWidgetManager.getInstance(C0853a.m10856d());
        this.f12080i = new C1049a();
        this.f12075b = new C1040h(C0892a.f2553D, this.f12054d.getHeight(), C0892a.f2567c * 20.0f, C0892a.f2567c * 20.0f, C3566b.f11841c.f11762T + (C0892a.f2567c * 20.0f), C3566b.f11841c.f11763U + (C0892a.f2567c * 20.0f));
        this.f12075b.m10160a(new C1024b() { // from class: com.tsf.shell.manager.r.b.c.b.1
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                return C3655b.this.f12079h.size();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                C3636c c3636c;
                if (c0975i == null) {
                    C3636c c3636c2 = new C3636c();
                    c3636c2.f10495k.visible(true);
                    c3636c2.mo3129aO();
                    c3636c2.setMouseEventListener(new C0937a(c3636c2));
                    c3636c = c3636c2;
                } else {
                    c3636c = c0975i;
                }
                C3636c c3636c3 = (C3636c) c3636c;
                c3636c3.f10495k.textures().clear();
                c3636c3.f10495k.textures().addElement(((C3661a) C3655b.this.f12079h.get(i)).m1793a());
                return c3636c;
            }
        });
        this.f12075b.m10159a(new C1036f() { // from class: com.tsf.shell.manager.r.b.c.b.2
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                C4187w.m614b();
                C3636c c3636c = (C3636c) c0975i;
                C3655b.this.f12074a.m1776a((C3661a) C3655b.this.f12079h.get(i));
            }
        });
        this.f12053c.addChild(this.f12075b);
    }

    /* renamed from: g */
    public void m1797g() {
        this.f12075b.m10143d();
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: e */
    public void mo1763e() {
        Iterator<C3661a> it = this.f12079h.iterator();
        while (it.hasNext()) {
            it.next().m1791b();
        }
        this.f12079h.clear();
        this.f12078g = false;
        this.f12075b.m10152b();
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: a */
    public void mo1771a(float f, float f2, float f3, float f4) {
        this.f12075b.m10166a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: c */
    public void mo1766c() {
        if (!this.f12078g) {
            this.f12080i.removeFromParent();
            this.f12080i.m10115a(false);
            this.f12053c.addChild(this.f12080i);
        }
    }

    @Override // com.tsf.shell.manager.p187r.p189b.p191b.C3644a
    /* renamed from: d */
    public void mo1774d() {
    }

    /* renamed from: h */
    public void m1796h() {
        if (!this.f12078g) {
            this.f12078g = true;
            C0853a.m10865a().m10581d(new Runnable() { // from class: com.tsf.shell.manager.r.b.c.b.3
                @Override // java.lang.Runnable
                public void run() {
                    for (AppWidgetProviderInfo appWidgetProviderInfo : C3655b.this.f12077f.getInstalledProviders()) {
                        try {
                            C3655b.this.m1805a(C3655b.this.f12076e.getApplicationInfo(appWidgetProviderInfo.provider.getPackageName(), 0), appWidgetProviderInfo);
                        } catch (PackageManager.NameNotFoundException e) {
                        }
                    }
                    final Collator collator = Collator.getInstance(Locale.getDefault());
                    Collections.sort(C3655b.this.f12079h, new Comparator<C3661a>() { // from class: com.tsf.shell.manager.r.b.c.b.3.1
                        @Override // java.util.Comparator
                        /* renamed from: a */
                        public final int compare(C3661a c3661a, C3661a c3661a2) {
                            return collator.compare(c3661a.f12087a, c3661a2.f12087a);
                        }
                    });
                    C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.b.c.b.3.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C3655b.this.m1797g();
                            C3655b.this.f12080i.m10114b(true);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m1805a(ApplicationInfo applicationInfo, AppWidgetProviderInfo appWidgetProviderInfo) {
        C3661a m1802a = m1802a(applicationInfo.packageName, applicationInfo);
        C3662b c3662b = new C3662b();
        c3662b.f12094b = applicationInfo;
        c3662b.f12093a = appWidgetProviderInfo;
        m1802a.m1792a(c3662b);
    }

    /* renamed from: a */
    private C3661a m1802a(String str, ApplicationInfo applicationInfo) {
        Iterator<C3661a> it = this.f12079h.iterator();
        while (it.hasNext()) {
            C3661a next = it.next();
            if (next.f12088b.equals(str)) {
                return next;
            }
        }
        C3661a c3661a = new C3661a(str);
        c3661a.f12087a = (String) this.f12076e.getApplicationLabel(applicationInfo);
        c3661a.f12091e = applicationInfo;
        this.f12079h.add(c3661a);
        return c3661a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.r.b.c.b$b */
    /* loaded from: classes.dex */
    public class C3662b {

        /* renamed from: a */
        public AppWidgetProviderInfo f12093a;

        /* renamed from: b */
        public ApplicationInfo f12094b;

        C3662b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.r.b.c.b$a */
    /* loaded from: classes.dex */
    public class C3661a {

        /* renamed from: a */
        public String f12087a;

        /* renamed from: b */
        public String f12088b;

        /* renamed from: e */
        public ApplicationInfo f12091e;

        /* renamed from: d */
        public TextureElement f12090d = new TextureElement(0, false);

        /* renamed from: c */
        public ArrayList<C3662b> f12089c = new ArrayList<>();

        public C3661a(String str) {
            this.f12088b = str;
        }

        /* renamed from: a */
        public TextureElement m1793a() {
            Resources resources;
            int i;
            Bitmap bitmap = null;
            if (this.f12090d.f2529id == 0) {
                try {
                    resources = C3655b.this.f12076e.getResourcesForApplication(this.f12091e);
                } catch (PackageManager.NameNotFoundException e) {
                    resources = null;
                }
                if (resources != null && (i = this.f12091e.icon) != 0) {
                    bitmap = C3695a.m1691a(resources, i);
                }
                if (bitmap == null) {
                    bitmap = C4189x.m609a(C1306b.C1310d.sym_def_app_icon);
                }
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, C3566b.f11841c.f11750H, C3566b.f11841c.f11751I, true);
                if (createScaledBitmap != bitmap) {
                    bitmap.recycle();
                }
                Bitmap m2011a = C3566b.f11841c.m2011a(this.f12087a);
                Bitmap m2022a = C3566b.f11841c.m2022a();
                Canvas canvas = new Canvas(m2022a);
                canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
                C3566b.f11841c.m2018a(canvas, createScaledBitmap);
                if (m2011a != null) {
                    C3566b.f11841c.m2009b(canvas, m2011a, true);
                }
                C0853a.m10853g().m10540a(this.f12090d, m2022a);
            }
            return this.f12090d;
        }

        /* renamed from: a */
        public void m1792a(C3662b c3662b) {
            this.f12089c.add(c3662b);
        }

        /* renamed from: b */
        public void m1791b() {
            C0853a.m10853g().m10543a(this.f12090d);
        }
    }
}
