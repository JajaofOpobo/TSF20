package com.tsf.shell.manager.r.b.c;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.b;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends com.tsf.shell.manager.r.b.b.a {
    private d a;
    private com.censivn.C3DEngine.b.h.b.h b;
    private PackageManager e;
    private AppWidgetManager f;
    private boolean g;
    private ArrayList<a> h;
    private com.censivn.C3DEngine.b.h.c.a i;

    public b(com.tsf.shell.f.e.g.d dVar, d dVar2) {
        super(dVar);
        this.g = false;
        this.h = new ArrayList<>();
        this.a = dVar2;
        i();
    }

    private void i() {
        this.e = com.censivn.C3DEngine.a.d().getPackageManager();
        this.f = AppWidgetManager.getInstance(com.censivn.C3DEngine.a.d());
        this.i = new com.censivn.C3DEngine.b.h.c.a();
        this.b = new com.censivn.C3DEngine.b.h.b.h(com.censivn.C3DEngine.b.b.a.D, this.d.getHeight(), com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.tsf.shell.manager.o.b.c.T + (com.censivn.C3DEngine.b.b.a.c * 20.0f), com.tsf.shell.manager.o.b.c.U + (com.censivn.C3DEngine.b.b.a.c * 20.0f));
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.c.b.1
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return b.this.h.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                i iVar2;
                if (iVar == null) {
                    com.tsf.shell.manager.r.b.a.c cVar = new com.tsf.shell.manager.r.b.a.c();
                    cVar.k.visible(true);
                    cVar.aO();
                    cVar.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(cVar));
                    iVar2 = cVar;
                } else {
                    iVar2 = iVar;
                }
                a aVar = (a) b.this.h.get(i);
                com.tsf.shell.manager.r.b.a.c cVar2 = (com.tsf.shell.manager.r.b.a.c) iVar2;
                cVar2.k.textures().clear();
                cVar2.k.textures().addElement(aVar.a());
                return iVar2;
            }
        });
        this.b.a(new com.censivn.C3DEngine.b.h.b.f() { // from class: com.tsf.shell.manager.r.b.c.b.2
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                w.b();
                b.this.a.a((a) b.this.h.get(i));
            }
        });
        this.c.addChild(this.b);
    }

    public void g() {
        this.b.d();
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void e() {
        Iterator<a> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.h.clear();
        this.g = false;
        this.b.b();
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void a(float f, float f2, float f3, float f4) {
        this.b.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void c() {
        if (!this.g) {
            this.i.removeFromParent();
            this.i.a(false);
            this.c.addChild(this.i);
        }
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void d() {
    }

    public void h() {
        if (!this.g) {
            this.g = true;
            com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.manager.r.b.c.b.3
                @Override // java.lang.Runnable
                public void run() {
                    for (AppWidgetProviderInfo appWidgetProviderInfo : b.this.f.getInstalledProviders()) {
                        try {
                            b.this.a(b.this.e.getApplicationInfo(appWidgetProviderInfo.provider.getPackageName(), 0), appWidgetProviderInfo);
                        } catch (PackageManager.NameNotFoundException e) {
                        }
                    }
                    final Collator collator = Collator.getInstance(Locale.getDefault());
                    Collections.sort(b.this.h, new Comparator<a>() { // from class: com.tsf.shell.manager.r.b.c.b.3.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final int compare(a aVar, a aVar2) {
                            return collator.compare(aVar.a, aVar2.a);
                        }
                    });
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.b.c.b.3.2
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.g();
                            b.this.i.b(true);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ApplicationInfo applicationInfo, AppWidgetProviderInfo appWidgetProviderInfo) {
        a aVarA = a(applicationInfo.packageName, applicationInfo);
        C0145b c0145b = new C0145b();
        c0145b.b = applicationInfo;
        c0145b.a = appWidgetProviderInfo;
        aVarA.a(c0145b);
    }

    private a a(String str, ApplicationInfo applicationInfo) {
        for (a aVar : this.h) {
            if (aVar.b.equals(str)) {
                return aVar;
            }
        }
        a aVar2 = new a(str);
        aVar2.a = (String) this.e.getApplicationLabel(applicationInfo);
        aVar2.e = applicationInfo;
        this.h.add(aVar2);
        return aVar2;
    }

    /* JADX INFO: renamed from: com.tsf.shell.manager.r.b.c.b$b, reason: collision with other inner class name */
    class C0145b {
        public AppWidgetProviderInfo a;
        public ApplicationInfo b;

        C0145b() {
        }
    }

    class a {
        public String a;
        public String b;
        public ApplicationInfo e;
        public TextureElement d = new TextureElement(0, false);
        public ArrayList<C0145b> c = new ArrayList<>();

        public a(String str) {
            this.b = str;
        }

        public TextureElement a() {
            Resources resourcesForApplication;
            int i;
            Bitmap bitmapA = null;
            if (this.d.id == 0) {
                try {
                    resourcesForApplication = b.this.e.getResourcesForApplication(this.e);
                } catch (PackageManager.NameNotFoundException e) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null && (i = this.e.icon) != 0) {
                    bitmapA = com.tsf.shell.manager.r.c.a.a(resourcesForApplication, i);
                }
                if (bitmapA == null) {
                    bitmapA = x.a(b.d.sym_def_app_icon);
                }
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I, true);
                if (bitmapCreateScaledBitmap != bitmapA) {
                    bitmapA.recycle();
                }
                Bitmap bitmapA2 = com.tsf.shell.manager.o.b.c.a(this.a);
                Bitmap bitmapA3 = com.tsf.shell.manager.o.b.c.a();
                Canvas canvas = new Canvas(bitmapA3);
                canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
                com.tsf.shell.manager.o.b.c.a(canvas, bitmapCreateScaledBitmap);
                if (bitmapA2 != null) {
                    com.tsf.shell.manager.o.b.c.b(canvas, bitmapA2, true);
                }
                com.censivn.C3DEngine.a.g().a(this.d, bitmapA3);
            }
            return this.d;
        }

        public void a(C0145b c0145b) {
            this.c.add(c0145b);
        }

        public void b() {
            com.censivn.C3DEngine.a.g().a(this.d);
        }
    }
}
