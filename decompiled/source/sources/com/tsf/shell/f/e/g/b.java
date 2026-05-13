package com.tsf.shell.f.e.g;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.e.g.a.a;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b extends j {
    private float c = 26.0f * com.censivn.C3DEngine.b.b.a.c;
    private ArrayList<a> a = new ArrayList<>();
    private ArrayList<a> b = new ArrayList<>();

    @Override // com.censivn.C3DEngine.b.f.i
    public void measure() {
        a();
        b();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        boolean z;
        int numChildren = numChildren();
        if (getAnimationObjectState()) {
            boolean z2 = true;
            int i = 0;
            while (i < numChildren) {
                a aVar = this.a.get(i);
                if (aVar.c) {
                    a.C0095a c0095a = (a.C0095a) getChildAt(i);
                    c0095a.position().x += (aVar.a - c0095a.position().x) * 0.15f;
                    c0095a.position().y += (aVar.b - c0095a.position().y) * 0.15f;
                    if (Math.abs(c0095a.position().x - aVar.a) >= 0.2f || Math.abs(c0095a.position().y - aVar.b) >= 0.2f) {
                        z = false;
                    } else {
                        c0095a.position().x = aVar.a;
                        c0095a.position().y = aVar.b;
                        aVar.c = false;
                        if (!c0095a.f()) {
                            c0095a.visible(false);
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

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public void addChild(i iVar) {
        super.addChild(iVar);
        this.a.add(c());
        a();
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public boolean removeChild(i iVar) {
        boolean removeChild = super.removeChild(iVar);
        a(this.a.remove(0));
        a();
        return removeChild;
    }

    public void a() {
        float f;
        int numChildren = numChildren();
        int i = 0;
        float f2 = 0.0f;
        while (i < numChildren) {
            a.C0095a c0095a = (a.C0095a) getChildAt(i);
            i++;
            f2 = c0095a.f() ? (c0095a.maxX() - c0095a.minX()) + this.c + f2 : f2;
        }
        int i2 = 0;
        float f3 = (-(f2 - this.c)) / 2.0f;
        while (i2 < numChildren) {
            a.C0095a c0095a2 = (a.C0095a) getChildAt(i2);
            a aVar = this.a.get(i2);
            c0095a2.visible(true);
            if (c0095a2.f()) {
                aVar.a = f3 - c0095a2.minX();
                aVar.b = 0.0f;
                f = c0095a2.maxX() + aVar.a + this.c;
                aVar.c = true;
            } else {
                aVar.b = -d.MENU_HEIGHT;
                aVar.c = true;
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
            a.C0095a c0095a = (a.C0095a) getChildAt(i);
            a aVar = this.a.get(i);
            aVar.c = false;
            c0095a.position().x = aVar.a;
            c0095a.position().y = aVar.b;
            if (!c0095a.f()) {
                c0095a.visible(false);
            } else {
                c0095a.visible(true);
            }
        }
        setAnimationObjectState(false);
    }

    private a c() {
        return this.b.isEmpty() ? new a() : this.b.remove(0);
    }

    private void a(a aVar) {
        this.b.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a {
        public float a;
        public float b;
        public boolean c = false;

        a() {
        }
    }
}
