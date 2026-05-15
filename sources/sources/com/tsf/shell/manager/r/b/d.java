package com.tsf.shell.manager.r.b;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.b;
import com.tsf.shell.f.e.g.a.a;
import com.tsf.shell.f.i.b.e.h;
import com.tsf.shell.manager.action.b;
import com.tsf.shell.manager.l.a;
import com.tsf.shell.manager.r.b.c;
import com.tsf.shell.utils.q;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends com.tsf.shell.manager.r.b.c<a> {
    public com.tsf.shell.manager.r.b.a b;
    private PackageManager c;
    private a.C0095a d;
    private a.C0095a e;
    private ArrayList<a> f;
    private ArrayList<a> g;
    private boolean h;
    private boolean i;
    private ArrayList<a> j;
    private c.a<a> k;
    private c.a<a> l;
    private h m;

    public d(com.tsf.shell.manager.r.b.a aVar, String str) {
        super(str);
        this.b = aVar;
        this.m = new h();
        this.c = com.censivn.C3DEngine.a.d().getPackageManager();
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = new c.a<a>() { // from class: com.tsf.shell.manager.r.b.d.1
            @Override // com.tsf.shell.manager.r.b.c.a
            public ArrayList<a> a() {
                d.this.b();
                return d.this.f;
            }
        };
        this.l = new c.a<a>() { // from class: com.tsf.shell.manager.r.b.d.2
            @Override // com.tsf.shell.manager.r.b.c.a
            public ArrayList<a> a() {
                d.this.c();
                return d.this.g;
            }
        };
        ArrayList<a.C0095a> arrayList = new ArrayList<>();
        a.C0095a c0095a = new a.C0095a(b.d.widget_menu_shortcut_tsf, x.c(b.i.group_tsf_shortcut), new a.C0095a.C0096a() { // from class: com.tsf.shell.manager.r.b.d.3
            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public boolean a() {
                return d.this.a(d.this.k);
            }

            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public void b() {
                d.this.b(d.this.k);
                d.this.e.a();
                d.this.d.a();
            }
        });
        com.tsf.shell.manager.r.c.b.e = c0095a;
        this.d = c0095a;
        a.C0095a c0095a2 = new a.C0095a(b.d.widget_menu_shortcut_system, x.c(b.i.group_system_shortcuts), new a.C0095a.C0096a() { // from class: com.tsf.shell.manager.r.b.d.4
            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public boolean a() {
                return d.this.a(d.this.l);
            }

            @Override // com.tsf.shell.f.e.g.a.a.C0095a.C0096a
            public void b() {
                d.this.c();
                d.this.b(d.this.l);
                d.this.e.a();
                d.this.d.a();
            }
        });
        com.tsf.shell.manager.r.c.b.f = c0095a2;
        this.e = c0095a2;
        arrayList.add(this.d);
        arrayList.add(this.e);
        a(aVar, arrayList, 20.0f * com.censivn.C3DEngine.b.b.a.c, 20.0f * com.censivn.C3DEngine.b.b.a.c, com.tsf.shell.manager.o.b.c.T + (com.censivn.C3DEngine.b.b.a.c * 20.0f), com.tsf.shell.manager.o.b.c.U + (com.censivn.C3DEngine.b.b.a.c * 20.0f));
        b((c.a) this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (!this.h) {
            this.h = true;
            for (b.a aVar : com.tsf.shell.manager.a.d.a()) {
                c cVar = new c();
                cVar.c = aVar.a;
                this.f.add(cVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        int i = 0;
        if (!this.i) {
            this.i = true;
            Intent intent = new Intent("android.intent.action.CREATE_SHORTCUT");
            List<ResolveInfo> listQueryIntentActivities = this.c.queryIntentActivities(intent, 0);
            if (listQueryIntentActivities == null) {
                return;
            }
            while (true) {
                int i2 = i;
                if (i2 < listQueryIntentActivities.size()) {
                    b bVar = (b) d();
                    ActivityInfo activityInfo = listQueryIntentActivities.get(i2).activityInfo;
                    bVar.e = activityInfo;
                    bVar.c = activityInfo.loadLabel(this.c).toString();
                    String str = activityInfo.applicationInfo.packageName;
                    String str2 = activityInfo.name;
                    Intent intent2 = new Intent(intent);
                    if (str != null && str2 != null) {
                        intent2.setClassName(str, str2);
                    } else {
                        intent2.setAction("android.intent.action.CREATE_SHORTCUT");
                        intent2.putExtra("android.intent.extra.shortcut.NAME", bVar.c);
                    }
                    bVar.d = intent2;
                    this.g.add(bVar);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    private a d() {
        if (this.j.isEmpty()) {
            return new b();
        }
        return this.j.remove(0);
    }

    @Override // com.tsf.shell.manager.r.b.c
    public i a(a aVar, int i, i iVar) {
        return aVar.a(iVar);
    }

    @Override // com.tsf.shell.manager.r.b.c
    public i a(a aVar) {
        return aVar.a();
    }

    @Override // com.tsf.shell.manager.r.b.c
    public void b(a aVar) {
        aVar.b();
    }

    @Override // com.tsf.shell.manager.r.b.c
    public void c(a aVar) {
        aVar.a(aVar);
    }

    @Override // com.tsf.shell.manager.r.b.c
    public void a(MotionEvent motionEvent, a aVar, i iVar) {
        aVar.a(motionEvent, aVar, iVar);
    }

    @Override // com.tsf.shell.manager.r.b.c
    public boolean b(MotionEvent motionEvent, a aVar, i iVar) {
        aVar.b(motionEvent, aVar, iVar);
        return true;
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onShow() {
        a();
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onRecycle() {
        Iterator<a> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        for (a aVar : this.g) {
            aVar.c();
            this.j.add(aVar);
        }
        this.g.clear();
        this.i = false;
    }

    class b extends a {
        protected com.tsf.shell.f.i.b.e.b b;
        public String c;
        public Intent d;
        public ActivityInfo e;
        public TextureElement f;

        b() {
            super();
            this.f = new TextureElement(0, false);
        }

        @Override // com.tsf.shell.manager.r.b.d.a
        public com.tsf.shell.f.i.b.e.b a(i iVar) {
            if (this.b == null) {
                this.b = new h();
                this.b.k.textures().addElement(this.f);
            }
            if (this.f.id == 0) {
                Bitmap bitmapA = com.tsf.shell.manager.o.b.c.a();
                Canvas canvas = new Canvas(bitmapA);
                canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
                Bitmap bitmapA2 = com.tsf.shell.manager.r.c.a.a(this.e);
                if (bitmapA2 != null) {
                    bitmapA2 = q.a(bitmapA2, com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I);
                }
                com.tsf.shell.manager.o.b.c.a(canvas, bitmapA2);
                Bitmap bitmapA3 = com.tsf.shell.manager.o.b.c.a(this.c);
                if (bitmapA3 != null) {
                    com.tsf.shell.manager.o.b.c.b(canvas, bitmapA3, true);
                }
                com.censivn.C3DEngine.a.g().a(this.f, bitmapA);
            }
            return this.b;
        }

        @Override // com.tsf.shell.manager.r.b.d.a
        public void b() {
            com.tsf.shell.manager.a.x.a.a(this.d, 0.0f, 0.0f, new a.C0130a() { // from class: com.tsf.shell.manager.r.b.d.b.1
                @Override // com.tsf.shell.manager.l.a.C0130a
                public void a(com.tsf.shell.f.i.b.e.b bVar) {
                    d.this.b.b().a(bVar);
                }

                @Override // com.tsf.shell.manager.l.a.C0130a
                public com.tsf.shell.manager.o.a a() {
                    return com.tsf.shell.manager.o.b.b;
                }
            });
        }

        @Override // com.tsf.shell.manager.r.b.d.a
        public i a() {
            d.this.m.k.textures().clear();
            d.this.m.k.textures().addElement(this.f);
            return d.this.m;
        }

        @Override // com.tsf.shell.manager.r.b.d.a
        public boolean b(MotionEvent motionEvent, a aVar, final i iVar) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.r.b.d.b.2
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    iVar.removeFromParent();
                    iVar.alpha(255.0f);
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.c.a(iVar);
            com.censivn.C3DEngine.b.g.c.a(iVar, 250, dVar);
            com.tsf.shell.manager.a.x.a.a(this.d, iVar.position().x, iVar.position().y);
            return true;
        }

        @Override // com.tsf.shell.manager.r.b.d.a
        public void a(a aVar) {
            com.tsf.shell.manager.a.x.a.a(this.d, 0.0f, d.this.b.getScreenFreeSpaceCenter());
        }

        @Override // com.tsf.shell.manager.r.b.d.a
        public void c() {
            com.censivn.C3DEngine.a.g().a(this.f);
        }
    }

    class c extends a {
        protected com.tsf.shell.f.i.b.e.b b;
        public int c;

        c() {
            super();
            this.c = -1;
        }

        @Override // com.tsf.shell.manager.r.b.d.a
        public com.tsf.shell.f.i.b.e.b a(i iVar) {
            if (this.b == null) {
                this.b = com.tsf.shell.manager.l.a.a(this.c, com.tsf.shell.manager.o.b.c);
            }
            if (((LauncherShortcutStandardInfo) this.b.K()).texture.id == 0) {
                this.b.aA();
            }
            return this.b;
        }

        @Override // com.tsf.shell.manager.r.b.d.a
        public void a(MotionEvent motionEvent, a aVar, i iVar) {
            iVar.getMouseEventListener().c(motionEvent);
        }

        @Override // com.tsf.shell.manager.r.b.d.a
        public void a(a aVar) {
            com.tsf.shell.f.i.b.e.b bVarA = com.tsf.shell.manager.l.a.a(this.c, com.tsf.shell.manager.o.b.a);
            bVarA.position().y = d.this.b.getScreenFreeSpaceCenter();
            com.tsf.shell.manager.a.h.n().a(bVarA);
            bVarA.ah();
            bVarA.K().onUpdatePhoto(null, null);
            bVarA.ad();
        }

        @Override // com.tsf.shell.manager.r.b.d.a
        public boolean b(MotionEvent motionEvent, a aVar, i iVar) {
            ((com.tsf.shell.f.i.b.e.b) iVar).ah();
            ((com.tsf.shell.f.i.b.e.b) iVar).K().onUpdatePhoto(null, null);
            ((com.tsf.shell.f.i.b.e.b) iVar).getMouseEventListener().d(motionEvent);
            return true;
        }

        @Override // com.tsf.shell.manager.r.b.d.a
        public i a() {
            return com.tsf.shell.manager.l.a.a(this.c, com.tsf.shell.manager.o.b.a);
        }

        @Override // com.tsf.shell.manager.r.b.d.a
        public void b() {
            com.tsf.shell.f.i.b.e.b bVarA = com.tsf.shell.manager.l.a.a(this.c, d.this.b.b().b());
            bVarA.K().onUpdatePhoto(null, null);
            d.this.b.b().a(bVarA);
        }

        @Override // com.tsf.shell.manager.r.b.d.a
        public void c() {
            if (this.b != null && this.b.K() != null) {
                com.censivn.C3DEngine.a.g().a(((LauncherShortcutStandardInfo) this.b.K()).texture);
                this.b.aD();
            }
        }
    }

    class a {
        a() {
        }

        public com.tsf.shell.f.i.b.e.b a(i iVar) {
            return null;
        }

        public i a() {
            return null;
        }

        public void a(a aVar) {
        }

        public void a(MotionEvent motionEvent, a aVar, i iVar) {
        }

        public boolean b(MotionEvent motionEvent, a aVar, i iVar) {
            return true;
        }

        public void b() {
        }

        public void c() {
        }
    }
}
