package com.tsf.shell.e.e.g;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b extends l {
    private float c = 26.0f * com.censivn.C3DEngine.b.b.a.c;
    private ArrayList a = new ArrayList();
    private ArrayList b = new ArrayList();

    @Override // com.censivn.C3DEngine.b.f.j
    public void measure() {
        a();
        b();
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        boolean z;
        int numChildren = numChildren();
        if (getAnimationObjectState()) {
            boolean z2 = true;
            int i = 0;
            while (i < numChildren) {
                c cVar = (c) this.a.get(i);
                if (cVar.c) {
                    com.tsf.shell.e.e.g.a.b bVar = (com.tsf.shell.e.e.g.a.b) getChildAt(i);
                    bVar.position().x += (cVar.a - bVar.position().x) * 0.15f;
                    bVar.position().y += (cVar.b - bVar.position().y) * 0.15f;
                    if (Math.abs(bVar.position().x - cVar.a) >= 0.2f || Math.abs(bVar.position().y - cVar.b) >= 0.2f) {
                        z = false;
                    } else {
                        bVar.position().x = cVar.a;
                        bVar.position().y = cVar.b;
                        cVar.c = false;
                        if (!bVar.f()) {
                            bVar.visible(false);
                            z = z2;
                        }
                    }
                    i++;
                    z2 = z;
                }
                z = z2;
                i++;
                z2 = z;
            }
            if (z2) {
                setAnimationObjectState(false);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public void addChild(j jVar) {
        super.addChild(jVar);
        this.a.add(c());
        a();
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public boolean removeChild(j jVar) {
        boolean removeChild = super.removeChild(jVar);
        a((c) this.a.remove(0));
        a();
        return removeChild;
    }

    public void a() {
        float f;
        int numChildren = numChildren();
        int i = 0;
        float f2 = 0.0f;
        while (i < numChildren) {
            com.tsf.shell.e.e.g.a.b bVar = (com.tsf.shell.e.e.g.a.b) getChildAt(i);
            i++;
            f2 = bVar.f() ? (bVar.maxX() - bVar.minX()) + this.c + f2 : f2;
        }
        int i2 = 0;
        float f3 = (-(f2 - this.c)) / 2.0f;
        while (i2 < numChildren) {
            com.tsf.shell.e.e.g.a.b bVar2 = (com.tsf.shell.e.e.g.a.b) getChildAt(i2);
            c cVar = (c) this.a.get(i2);
            bVar2.visible(true);
            if (bVar2.f()) {
                cVar.a = f3 - bVar2.minX();
                cVar.b = 0.0f;
                f = bVar2.maxX() + cVar.a + this.c;
                cVar.c = true;
            } else {
                cVar.b = -e.MENU_HEIGHT;
                cVar.c = true;
                f = f3;
            }
            i2++;
            f3 = f;
        }
        setAnimationObjectState(true);
    }

    public void b() {
        int numChildren = numChildren();
        for (int i = 0; i < numChildren; i++) {
            com.tsf.shell.e.e.g.a.b bVar = (com.tsf.shell.e.e.g.a.b) getChildAt(i);
            c cVar = (c) this.a.get(i);
            cVar.c = false;
            bVar.position().x = cVar.a;
            bVar.position().y = cVar.b;
            if (!bVar.f()) {
                bVar.visible(false);
            } else {
                bVar.visible(true);
            }
        }
        setAnimationObjectState(false);
    }

    private c c() {
        return this.b.isEmpty() ? new c(this) : (c) this.b.remove(0);
    }

    private void a(c cVar) {
        this.b.add(cVar);
    }
}
