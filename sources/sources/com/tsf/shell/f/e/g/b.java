package com.tsf.shell.f.e.g;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.e.g.a.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends j {
    private float c = 26.0f * com.censivn.C3DEngine.b.b.a.c;
    private ArrayList<a> a = new ArrayList<>();
    private ArrayList<a> b = new ArrayList<>();

    @Override // com.censivn.C3DEngine.b.f.i
    public void measure() {
        a();
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    @Override // com.censivn.C3DEngine.b.f.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDrawStart() {
        /*
            r12 = this;
            r11 = 1045220557(0x3e4ccccd, float:0.2)
            r10 = 1041865114(0x3e19999a, float:0.15)
            r3 = 0
            int r5 = r12.numChildren()
            boolean r0 = r12.getAnimationObjectState()
            if (r0 == 0) goto L9b
            r2 = 1
            r4 = r3
        L13:
            if (r4 >= r5) goto L96
            java.util.ArrayList<com.tsf.shell.f.e.g.b$a> r0 = r12.a
            java.lang.Object r0 = r0.get(r4)
            com.tsf.shell.f.e.g.b$a r0 = (com.tsf.shell.f.e.g.b.a) r0
            boolean r1 = r0.c
            if (r1 == 0) goto L9c
            com.censivn.C3DEngine.b.f.i r1 = r12.getChildAt(r4)
            com.tsf.shell.f.e.g.a.a$a r1 = (com.tsf.shell.f.e.g.a.a.C0095a) r1
            com.censivn.C3DEngine.api.element.PositionNumber3d r6 = r1.position()
            float r7 = r6.x
            float r8 = r0.a
            com.censivn.C3DEngine.api.element.PositionNumber3d r9 = r1.position()
            float r9 = r9.x
            float r8 = r8 - r9
            float r8 = r8 * r10
            float r7 = r7 + r8
            r6.x = r7
            com.censivn.C3DEngine.api.element.PositionNumber3d r6 = r1.position()
            float r7 = r6.y
            float r8 = r0.b
            com.censivn.C3DEngine.api.element.PositionNumber3d r9 = r1.position()
            float r9 = r9.y
            float r8 = r8 - r9
            float r8 = r8 * r10
            float r7 = r7 + r8
            r6.y = r7
            com.censivn.C3DEngine.api.element.PositionNumber3d r6 = r1.position()
            float r6 = r6.x
            float r7 = r0.a
            float r6 = r6 - r7
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L94
            com.censivn.C3DEngine.api.element.PositionNumber3d r6 = r1.position()
            float r6 = r6.y
            float r7 = r0.b
            float r6 = r6 - r7
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L94
            com.censivn.C3DEngine.api.element.PositionNumber3d r6 = r1.position()
            float r7 = r0.a
            r6.x = r7
            com.censivn.C3DEngine.api.element.PositionNumber3d r6 = r1.position()
            float r7 = r0.b
            r6.y = r7
            r0.c = r3
            boolean r0 = r1.f()
            if (r0 != 0) goto L9c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.visible(r0)
            r0 = r2
        L8f:
            int r1 = r4 + 1
            r4 = r1
            r2 = r0
            goto L13
        L94:
            r0 = r3
            goto L8f
        L96:
            if (r2 == 0) goto L9b
            r12.setAnimationObjectState(r3)
        L9b:
            return
        L9c:
            r0 = r2
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.e.g.b.onDrawStart():void");
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public void addChild(i iVar) {
        super.addChild(iVar);
        this.a.add(c());
        a();
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public boolean removeChild(i iVar) {
        boolean zRemoveChild = super.removeChild(iVar);
        a(this.a.remove(0));
        a();
        return zRemoveChild;
    }

    public void a() {
        float fMaxX;
        int iNumChildren = numChildren();
        int i = 0;
        float fMaxX2 = 0.0f;
        while (i < iNumChildren) {
            a.C0095a c0095a = (a.C0095a) getChildAt(i);
            i++;
            fMaxX2 = c0095a.f() ? (c0095a.maxX() - c0095a.minX()) + this.c + fMaxX2 : fMaxX2;
        }
        int i2 = 0;
        float f = (-(fMaxX2 - this.c)) / 2.0f;
        while (i2 < iNumChildren) {
            a.C0095a c0095a2 = (a.C0095a) getChildAt(i2);
            a aVar = this.a.get(i2);
            c0095a2.visible(true);
            if (c0095a2.f()) {
                aVar.a = f - c0095a2.minX();
                aVar.b = 0.0f;
                fMaxX = c0095a2.maxX() + aVar.a + this.c;
                aVar.c = true;
            } else {
                aVar.b = -d.MENU_HEIGHT;
                aVar.c = true;
                fMaxX = f;
            }
            i2++;
            f = fMaxX;
        }
        setAnimationObjectState(true);
    }

    public void b() {
        int iNumChildren = numChildren();
        for (int i = 0; i < iNumChildren; i++) {
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

    class a {
        public float a;
        public float b;
        public boolean c = false;

        a() {
        }
    }
}
