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
/* loaded from: classes.dex */
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
                com.tsf.shell.manager.r.b.a.c cVar;
                if (iVar == null) {
                    com.tsf.shell.manager.r.b.a.c cVar2 = new com.tsf.shell.manager.r.b.a.c();
                    cVar2.k.visible(true);
                    cVar2.aO();
                    cVar2.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(cVar2));
                    cVar = cVar2;
                } else {
                    cVar = iVar;
                }
                com.tsf.shell.manager.r.b.a.c cVar3 = (com.tsf.shell.manager.r.b.a.c) cVar;
                cVar3.k.textures().clear();
                cVar3.k.textures().addElement(((a) b.this.h.get(i)).a());
                return cVar;
            }
        });
        this.b.a(new com.censivn.C3DEngine.b.h.b.f() { // from class: com.tsf.shell.manager.r.b.c.b.2
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                w.b();
                com.tsf.shell.manager.r.b.a.c cVar = (com.tsf.shell.manager.r.b.a.c) iVar;
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
                        /* renamed from: a */
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
        a a2 = a(applicationInfo.packageName, applicationInfo);
        C0145b c0145b = new C0145b();
        c0145b.b = applicationInfo;
        c0145b.a = appWidgetProviderInfo;
        a2.a(c0145b);
    }

    private a a(String str, ApplicationInfo applicationInfo) {
        Iterator<a> it = this.h.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.b.equals(str)) {
                return next;
            }
        }
        a aVar = new a(str);
        aVar.a = (String) this.e.getApplicationLabel(applicationInfo);
        aVar.e = applicationInfo;
        this.h.add(aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.r.b.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0145b {
        public AppWidgetProviderInfo a;
        public ApplicationInfo b;

        C0145b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a {
        public String a;
        public String b;
        public ApplicationInfo e;
        public TextureElement d = new TextureElement(0, false);
        public ArrayList<C0145b> c = new ArrayList<>();

        public a(String str) {
            this.b = str;
        }

        public TextureElement a() {
            Resources resources;
            int i;
            Bitmap bitmap = null;
            if (this.d.id == 0) {
                try {
                    resources = b.this.e.getResourcesForApplication(this.e);
                } catch (PackageManager.NameNotFoundException e) {
                    resources = null;
                }
                if (resources != null && (i = this.e.icon) != 0) {
                    bitmap = com.tsf.shell.manager.r.c.a.a(resources, i);
                }
                if (bitmap == null) {
                    bitmap = x.a(b.d.sym_def_app_icon);
                }
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I, true);
                if (createScaledBitmap != bitmap) {
                    bitmap.recycle();
                }
                Bitmap a = com.tsf.shell.manager.o.b.c.a(this.a);
                Bitmap a2 = com.tsf.shell.manager.o.b.c.a();
                Canvas canvas = new Canvas(a2);
                canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
                com.tsf.shell.manager.o.b.c.a(canvas, createScaledBitmap);
                if (a != null) {
                    com.tsf.shell.manager.o.b.c.b(canvas, a, true);
                }
                com.censivn.C3DEngine.a.g().a(this.d, a2);
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
