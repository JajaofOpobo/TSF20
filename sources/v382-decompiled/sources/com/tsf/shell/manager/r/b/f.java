package com.tsf.shell.manager.r.b;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.MotionEvent;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f extends d {
    public a b;
    private PackageManager c;
    private com.tsf.shell.e.e.g.a.b d;
    private com.tsf.shell.e.e.g.a.b e;
    private ArrayList f;
    private ArrayList g;
    private boolean h;
    private boolean i;
    private ArrayList j;
    private e k;
    private e l;
    private com.tsf.shell.e.i.b.e.j m;

    public f(a aVar, String str) {
        super(str);
        this.b = aVar;
        this.m = new com.tsf.shell.e.i.b.e.j();
        this.c = com.censivn.C3DEngine.a.d().getPackageManager();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.j = new ArrayList();
        this.k = new e() { // from class: com.tsf.shell.manager.r.b.f.1
            @Override // com.tsf.shell.manager.r.b.e
            public ArrayList a() {
                f.this.b();
                return f.this.f;
            }
        };
        this.l = new e() { // from class: com.tsf.shell.manager.r.b.f.2
            @Override // com.tsf.shell.manager.r.b.e
            public ArrayList a() {
                f.this.c();
                return f.this.g;
            }
        };
        ArrayList arrayList = new ArrayList();
        com.tsf.shell.e.e.g.a.b bVar = new com.tsf.shell.e.e.g.a.b(R.drawable.widget_menu_shortcut_tsf, x.c(R.string.group_tsf_shortcut), new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.manager.r.b.f.3
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return f.this.a(f.this.k);
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                f.this.b(f.this.k);
                f.this.e.a();
                f.this.d.a();
            }
        });
        com.tsf.shell.manager.r.c.b.e = bVar;
        this.d = bVar;
        com.tsf.shell.e.e.g.a.b bVar2 = new com.tsf.shell.e.e.g.a.b(R.drawable.widget_menu_shortcut_system, x.c(R.string.group_system_shortcuts), new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.manager.r.b.f.4
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return f.this.a(f.this.l);
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                f.this.c();
                f.this.b(f.this.l);
                f.this.e.a();
                f.this.d.a();
            }
        });
        com.tsf.shell.manager.r.c.b.f = bVar2;
        this.e = bVar2;
        arrayList.add(this.d);
        arrayList.add(this.e);
        a(aVar, arrayList, 20.0f * com.censivn.C3DEngine.b.b.a.c, 20.0f * com.censivn.C3DEngine.b.b.a.c, com.tsf.shell.manager.o.b.c.T + (com.censivn.C3DEngine.b.b.a.c * 20.0f), com.tsf.shell.manager.o.b.c.U + (com.censivn.C3DEngine.b.b.a.c * 20.0f));
        b(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (!this.h) {
            this.h = true;
            Iterator it = com.tsf.shell.manager.a.d.a().iterator();
            while (it.hasNext()) {
                com.tsf.shell.manager.action.c cVar = (com.tsf.shell.manager.action.c) it.next();
                i iVar = new i(this);
                iVar.c = cVar.a;
                this.f.add(iVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        int i = 0;
        if (!this.i) {
            this.i = true;
            Intent intent = new Intent("android.intent.action.CREATE_SHORTCUT");
            List<ResolveInfo> queryIntentActivities = this.c.queryIntentActivities(intent, 0);
            if (queryIntentActivities == null) {
                return;
            }
            while (true) {
                int i2 = i;
                if (i2 < queryIntentActivities.size()) {
                    h hVar = (h) d();
                    ActivityInfo activityInfo = queryIntentActivities.get(i2).activityInfo;
                    hVar.e = activityInfo;
                    hVar.c = activityInfo.loadLabel(this.c).toString();
                    String str = activityInfo.applicationInfo.packageName;
                    String str2 = activityInfo.name;
                    Intent intent2 = new Intent(intent);
                    if (str != null && str2 != null) {
                        intent2.setClassName(str, str2);
                    } else {
                        intent2.setAction("android.intent.action.CREATE_SHORTCUT");
                        intent2.putExtra("android.intent.extra.shortcut.NAME", hVar.c);
                    }
                    hVar.d = intent2;
                    this.g.add(hVar);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    private g d() {
        if (this.j.isEmpty()) {
            return new h(this);
        }
        return (g) this.j.remove(0);
    }

    @Override // com.tsf.shell.manager.r.b.d
    public com.censivn.C3DEngine.b.f.j a(g gVar, int i, com.censivn.C3DEngine.b.f.j jVar) {
        return gVar.a(jVar);
    }

    @Override // com.tsf.shell.manager.r.b.d
    public com.censivn.C3DEngine.b.f.j a(g gVar) {
        return gVar.a();
    }

    @Override // com.tsf.shell.manager.r.b.d
    public void b(g gVar) {
        gVar.b();
    }

    @Override // com.tsf.shell.manager.r.b.d
    public void c(g gVar) {
        gVar.a(gVar);
    }

    @Override // com.tsf.shell.manager.r.b.d
    public void a(MotionEvent motionEvent, g gVar, com.censivn.C3DEngine.b.f.j jVar) {
        gVar.a(motionEvent, gVar, jVar);
    }

    @Override // com.tsf.shell.manager.r.b.d
    public boolean b(MotionEvent motionEvent, g gVar, com.censivn.C3DEngine.b.f.j jVar) {
        gVar.b(motionEvent, gVar, jVar);
        return true;
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onShow() {
        a();
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onRecycle() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c();
        }
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            g gVar = (g) it2.next();
            gVar.c();
            this.j.add(gVar);
        }
        this.g.clear();
        this.i = false;
    }
}
