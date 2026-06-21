package com.tsf.shell.e.i.b.d;

import android.opengl.GLES20;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g extends com.tsf.shell.e.e.f.e {
    private static boolean g = false;
    private static boolean h = false;
    private static float i = 5.0f;
    private static float j = 0.0f;
    private b a;
    private float m;
    private float n;
    private float o;
    private float p;
    private boolean d = true;
    private boolean e = false;
    private boolean k = true;
    private boolean l = true;
    private boolean q = false;
    private ArrayList b = new ArrayList();
    private ArrayList c = new ArrayList();
    private com.tsf.shell.e.i.b.e.b f = new com.tsf.shell.e.i.b.e.j();

    public g(b bVar) {
        this.a = bVar;
        this.f.k.removeFromParent();
        this.f.parent(this);
        p();
    }

    @Override // com.tsf.shell.e.e.f.e
    public com.censivn.C3DEngine.b.f.j d() {
        return com.tsf.shell.manager.a.j.a();
    }

    @Override // com.tsf.shell.e.e.f.e
    public void a(com.tsf.shell.e.i.e eVar) {
        if (eVar instanceof com.tsf.shell.e.i.b.e.b) {
            eVar.mouseEnabled(false);
            Number3d.TEMPNUMBER3D2.reset();
            Number3d localToGlobal = eVar.localToGlobal(Number3d.TEMPNUMBER3D2);
            localToGlobal.y += this.a.aF().m();
            eVar.position().setAllFrom(localToGlobal);
            this.a.b((com.tsf.shell.e.i.b.e.b) eVar);
            com.tsf.shell.manager.r.c.i.a(eVar, (Runnable) null);
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        p();
        w();
        x();
        int numChildren = numChildren();
        for (int i6 = 0; i6 < numChildren; i6++) {
            com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) getChildAt(i6);
            h hVar = (h) this.b.get(i6);
            a(hVar, bVar, (numChildren - i6) - 1);
            if (this.e) {
                bVar.position().setAll(hVar.a, hVar.b, 0.0f);
                bVar.rotation().z = hVar.c;
                bVar.scale().setAll(hVar.d, hVar.d, 0.0f);
                bVar.alpha(hVar.s);
                if (hVar.s == 0.0f) {
                    bVar.visible(false);
                }
                bVar.g(hVar.e);
            }
        }
    }

    public int a(float f, float f2) {
        if (k.N.calTouchCollision(f, f2)) {
            return -3;
        }
        if (k.O.calTouchCollision(f, f2)) {
            return -4;
        }
        return -1;
    }

    public static void a() {
        i = 5.0f;
    }

    public static void a(boolean z) {
        k.N.a(z);
    }

    public static void b(boolean z) {
        k.O.a(z);
    }

    public void b() {
        h = true;
        k.N.visible(true);
        k.N.alpha(k.N.alpha() + ((255.0f - k.N.alpha()) * 0.2f));
        if (k.N.d()) {
            this.p -= i;
            i += 0.5f;
            if (this.p < b.l.x) {
                this.p = b.l.x;
            }
            this.k = false;
            setAnimationObjectState(true);
            invalidate();
        }
    }

    public void c() {
        k.N.a(false);
        if (k.N.visible()) {
            k.N.alpha(k.N.alpha() + ((0.0f - k.N.alpha()) * 0.2f));
            if (Math.abs(k.N.alpha()) < 0.5f) {
                k.N.alpha(0.0f);
                k.N.visible(false);
            }
        }
        if (g) {
            g = false;
        }
    }

    public void e() {
        h = true;
        k.O.visible(true);
        k.O.alpha(k.O.alpha() + ((255.0f - k.O.alpha()) * 0.2f));
        if (k.O.d()) {
            this.p += i;
            i += 0.5f;
            if (this.p > this.n) {
                this.p = this.n;
            }
            this.k = false;
            setAnimationObjectState(true);
            invalidate();
        }
    }

    public void f() {
        k.O.a(false);
        if (k.O.visible()) {
            k.O.alpha(k.O.alpha() + ((0.0f - k.O.alpha()) * 0.2f));
            if (Math.abs(k.O.alpha()) < 0.5f) {
                k.O.alpha(0.0f);
                k.O.visible(false);
            }
        }
        if (h) {
            h = false;
        }
    }

    public void g() {
        this.e = true;
        p();
    }

    public void h() {
        this.e = false;
        float f = this.o - b.l.x;
        int numChildren = numChildren();
        for (int i2 = 0; i2 < numChildren; i2++) {
            com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) getChildAt(i2);
            if (!bVar.o) {
                bVar.position().y += f;
            }
        }
    }

    public void i() {
        p();
    }

    private void p() {
        float f = b.l.c().folder.childContainerY;
        this.p = f;
        this.o = f;
    }

    private void w() {
        if (numChildren() == 0 || numChildren() <= b.l.c) {
            this.n = b.l.x;
        } else {
            this.n = b.l.x + (((((numChildren() - 1) / b.l.a) - b.l.b) + 1) * b.l.j);
        }
        this.k = false;
        setAnimationObjectState(true);
        invalidate();
    }

    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.l) {
            this.l = false;
            float f3 = this.o;
            this.p = f3;
            this.m = f3;
            this.k = false;
            setAnimationObjectState(true);
            invalidate();
        }
        this.p = this.m - (motionEvent2.getY() - motionEvent.getY());
    }

    public void a(float f) {
        this.p -= f / 6.0f;
        k();
        this.l = true;
    }

    public int j() {
        float f = (this.p - b.l.x) % b.l.j;
        float abs = Math.abs(f) / b.l.j;
        float f2 = this.p - f;
        if (abs > 0.5d) {
            if (f > 0.0f) {
                f2 += b.l.j;
            } else {
                f2 -= b.l.j;
            }
        }
        return (int) ((f2 - b.l.x) / b.l.j);
    }

    public void k() {
        float f = (this.p - b.l.x) % b.l.j;
        float abs = Math.abs(f) / b.l.j;
        this.p -= f;
        if (abs > 0.5d) {
            if (f > 0.0f) {
                this.p += b.l.j;
            } else {
                this.p -= b.l.j;
            }
        }
        this.k = false;
        setAnimationObjectState(true);
    }

    public void b(float f) {
        this.p = this.n;
        this.k = false;
        setAnimationObjectState(true);
        if (f > 0.0f) {
            j = f;
        }
    }

    public float l() {
        return this.p - b.l.x;
    }

    public float m() {
        return this.o - b.l.x;
    }

    @Override // com.tsf.shell.e.e.f.e
    public float q() {
        return m();
    }

    public h a(int i2) {
        return (h) this.b.get(i2);
    }

    public void a(com.tsf.shell.e.i.b.e.b bVar) {
        bVar.parent(null);
        this.f.position().setAllFrom(bVar.position());
        this.f.rotation().setAllFrom(bVar.rotation());
        this.f.scale().setAllFrom(bVar.scale());
        this.f.l(bVar.aI());
        int indexOf = children().indexOf(bVar);
        if (indexOf != -1) {
            children().set(indexOf, this.f);
        }
    }

    public int b(com.tsf.shell.e.i.b.e.b bVar) {
        bVar.l(this.f.aI());
        int indexOf = children().indexOf(this.f);
        if (indexOf != -1) {
            bVar.parent(this);
            children().set(indexOf, bVar);
            ((h) this.b.get(indexOf)).q = false;
            this.d = false;
            setAnimationObjectState(true);
            invalidate();
        }
        return indexOf;
    }

    public void n() {
        removeChild(this.f);
    }

    public int a(com.censivn.C3DEngine.b.f.j jVar) {
        if (children().indexOf(jVar) == -1) {
            return -1;
        }
        return (numChildren() - r1) - 1;
    }

    public boolean a(com.censivn.C3DEngine.b.f.j jVar, int i2, int i3) {
        int i4;
        int i5;
        int numChildren = numChildren();
        com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) getChildAt((numChildren - i3) - 1);
        if (!bVar.visible() || bVar.o) {
            return false;
        }
        children().remove(this.f);
        children().add((numChildren - i3) - 1, this.f);
        if (i2 > i3) {
            i4 = i2;
            i5 = i3;
        } else {
            i4 = i3;
            i5 = i2;
        }
        if (i5 > numChildren - 1) {
            i5 = numChildren - 1;
        }
        int i6 = i4 > numChildren + (-1) ? numChildren - 1 : i4;
        while (i5 < i6 + 1) {
            ((h) this.b.get((numChildren - i5) - 1)).q = false;
            i5++;
        }
        this.d = false;
        setAnimationObjectState(true);
        invalidate();
        return true;
    }

    public void o() {
        int numChildren = numChildren();
        for (int i2 = 0; i2 < numChildren; i2++) {
            ((h) this.b.get(i2)).q = false;
        }
        this.d = false;
        setAnimationObjectState(true);
        invalidate();
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void drawMVPMatrix() {
        if (this.e) {
            MatrixStack.glTranslatef(position().x, this.o, position().z);
        } else {
            MatrixStack.glTranslatef(position().x, position().y, position().z);
        }
        com.censivn.C3DEngine.a.g.a(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.AABB_MATRIX, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    @Override // com.tsf.shell.e.e.f.e, com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void dispatchDraw() {
        if (this.e) {
            if (visible()) {
                onDrawStart();
                MatrixStack.glPushMatrix();
                draw();
                MatrixStack.glColor(alpha(), getDefaultColor());
                onDrawChildStart();
                int numChildren = numChildren();
                for (int i2 = 0; i2 < numChildren; i2++) {
                    com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) getChildAt(i2);
                    if (!bVar.o && bVar.aI()) {
                        onDrawChildStart(bVar);
                        bVar.dispatchDraw();
                        onDrawChildEnd(bVar);
                    }
                }
                MatrixStack.glPopMatrix();
                MatrixStack.glPushMatrix();
                boolean z = this.e;
                this.e = false;
                drawMVPMatrix();
                this.e = z;
                MatrixStack.glColor(alpha(), getDefaultColor());
                for (int i3 = 0; i3 < numChildren; i3++) {
                    com.tsf.shell.e.i.b.e.b bVar2 = (com.tsf.shell.e.i.b.e.b) getChildAt(i3);
                    if (bVar2.o && bVar2.aI()) {
                        onDrawChildStart(bVar2);
                        bVar2.dispatchDraw();
                        onDrawChildEnd(bVar2);
                    }
                }
                MatrixStack.glPopMatrix();
                k.N.dispatchDraw();
                k.O.dispatchDraw();
                onDrawEnd();
                return;
            }
            return;
        }
        super.dispatchDraw();
    }

    private void a(com.tsf.shell.e.i.b.e.b bVar, h hVar, int i2, float f, float f2) {
        float f3 = f2 / b.l.j;
        if (!bVar.o) {
            bVar.mouseEnabled(false);
            bVar.o = true;
            bVar.position().y += f;
            ArrayList arrayList = b.l.c().folder.sampleList;
            int size = i2 > arrayList.size() + (-1) ? arrayList.size() - 1 : i2;
            hVar.f = ((b.l.a - i2) - 1) * (0.5f / (b.l.a - 1));
            Number3d number3d = ((ThemeFolderDescription.SystemFolderChild) arrayList.get(size)).position;
            Number3d number3d2 = ((ThemeFolderDescription.SystemFolderChild) arrayList.get(size)).rotation;
            Number3d number3d3 = ((ThemeFolderDescription.SystemFolderChild) arrayList.get(size)).scale;
            hVar.i = number3d.x;
            hVar.j = number3d.y;
            hVar.k = number3d2.z;
            hVar.l = number3d3.x;
            float f4 = b.l.l + (b.l.i * i2);
            hVar.a = f4;
            hVar.m = f4;
            float f5 = b.l.w;
            hVar.b = f5;
            hVar.n = f5;
            hVar.c = 0.0f;
            hVar.o = 0.0f;
            hVar.d = 1.0f;
            hVar.p = 1.0f;
            hVar.q = false;
            this.d = false;
        }
        if (f3 > 1.0f) {
            if (f3 > 2.0f) {
                if (hVar.s != 0.0f) {
                    hVar.s = 0.0f;
                    hVar.e = 0.0f;
                    hVar.q = false;
                    this.d = false;
                    return;
                }
                return;
            }
            hVar.a = hVar.i;
            hVar.b = hVar.j;
            hVar.c = hVar.k;
            hVar.d = hVar.l;
            hVar.e = 0.0f;
            hVar.s = (2.0f - f3) * 255.0f;
            hVar.q = false;
            this.d = false;
            return;
        }
        if (f3 >= hVar.f) {
            float f6 = (f3 - hVar.f) / 0.5f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            hVar.a = hVar.m + ((hVar.i - hVar.m) * f6);
            hVar.b = (hVar.n + ((hVar.j - hVar.n) * f6)) - ((1.0f - f6) * f2);
            hVar.c = hVar.o + ((hVar.k - hVar.o) * f6);
            hVar.d = hVar.p + ((hVar.l - hVar.p) * f6);
            hVar.e = 1.0f - f6;
            hVar.q = false;
            this.d = false;
        } else {
            hVar.a = hVar.m;
            hVar.b = hVar.n - f2;
            hVar.c = hVar.o;
            hVar.d = hVar.p;
            hVar.e = 1.0f;
            hVar.q = false;
            this.d = false;
        }
        if (hVar.s != 255.0f) {
            hVar.s = 255.0f;
            hVar.q = false;
            this.d = false;
        }
    }

    private void a(com.tsf.shell.e.i.b.e.b bVar, h hVar, int i2, float f) {
        if (bVar.o) {
            bVar.mouseEnabled(true);
            bVar.o = false;
            bVar.position().y -= f;
            hVar.a = hVar.g;
            hVar.b = hVar.h;
            hVar.s = 255.0f;
            hVar.c = 0.0f;
            hVar.d = 1.0f;
            hVar.e = 1.0f;
            hVar.q = false;
            this.d = false;
        }
    }

    public void c(boolean z) {
        this.q = z;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        float f;
        if (this.e) {
            if (!this.k || !this.l) {
                if (j == 0.0f) {
                    f = this.l ? 0.1f : 0.3f;
                } else {
                    f = j;
                }
                this.o = (f * (this.p - this.o)) + this.o;
                float f2 = (b.l.r - b.l.o) - (((this.o - b.l.x) / (this.n - b.l.x)) * b.l.t);
                b.l.I.position().y = f2;
                if (b.l.o + f2 > b.l.r) {
                    float f3 = (f2 + b.l.o) - b.l.r;
                    if (f3 < b.l.o) {
                        b.l.I.c(b.l.o - f3);
                        b.l.I.d(b.l.o);
                    } else {
                        b.l.I.c(0.0f);
                        float f4 = b.l.n - f3;
                        if (f4 < b.l.p) {
                            f4 = b.l.p;
                        }
                        b.l.I.d(f4);
                        b.l.I.position().y = b.l.r;
                    }
                } else if (f2 - b.l.o < b.l.s) {
                    float f5 = b.l.s - (f2 - b.l.o);
                    if (f5 < b.l.o) {
                        b.l.I.d(b.l.o - f5);
                        b.l.I.c(b.l.o);
                    } else {
                        b.l.I.d(0.0f);
                        float f6 = b.l.n - f5;
                        if (f6 < b.l.p) {
                            f6 = b.l.p;
                        }
                        b.l.I.c(f6);
                        b.l.I.position().y = b.l.s;
                    }
                }
                b.l.h();
                if (this.l) {
                    if (this.p < b.l.x) {
                        this.p += (b.l.x - this.p) * 0.1f;
                        if (Math.abs(this.p - b.l.x) < 0.2f) {
                            this.p = b.l.x;
                        }
                    } else if (this.p > this.n) {
                        this.p += (this.n - this.p) * 0.1f;
                        if (Math.abs(this.p - this.n) < 0.2f) {
                            this.p = this.n;
                        }
                    } else if (Math.abs(this.p - this.o) < 0.2f) {
                        this.o = this.p;
                        this.k = true;
                        j = 0.0f;
                        b.l.i();
                    }
                }
                float f7 = this.o - b.l.x;
                int size = children().size();
                int i2 = b.l.a;
                for (int i3 = 0; i3 < size; i3++) {
                    com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) children().get((size - 1) - i3);
                    h hVar = (h) this.b.get((size - 1) - i3);
                    if (hVar.h + bVar.maxY() + f7 > b.l.u) {
                        float maxY = ((hVar.h + bVar.maxY()) + f7) - b.l.u;
                        if (maxY >= bVar.maxY()) {
                            hVar.d = 0.0f;
                        } else {
                            hVar.d = (bVar.maxY() - maxY) / bVar.maxY();
                        }
                        bVar.scale().x = hVar.d;
                        bVar.scale().y = hVar.d;
                        if (hVar.d == 0.0f || hVar.s == 0.0f) {
                            bVar.visible(false);
                        } else {
                            bVar.visible(true);
                        }
                        hVar.r = false;
                        a(bVar, hVar, i3 % i2, f7);
                    } else if (hVar.h + f7 < b.l.v) {
                        if (hVar.r) {
                            a(bVar, hVar, i3 % i2, f7);
                            bVar.visible(true);
                            hVar.d = 1.0f;
                            bVar.scale().x = hVar.d;
                            bVar.scale().y = hVar.d;
                        } else {
                            a(bVar, hVar, i3 % i2, f7, b.l.v - (hVar.h + f7));
                        }
                    } else {
                        hVar.r = false;
                        a(bVar, hVar, i3 % i2, f7);
                        bVar.visible(true);
                        hVar.d = 1.0f;
                        bVar.scale().x = hVar.d;
                        bVar.scale().y = hVar.d;
                    }
                }
            }
            if (this.q) {
                if (this.o < this.n) {
                    e();
                } else {
                    f();
                }
                if (this.o > b.l.x) {
                    b();
                } else {
                    c();
                }
            } else {
                if (g || h) {
                    k();
                }
                c();
                f();
            }
            if (!this.d) {
                this.d = true;
                for (int i4 = 0; i4 < children().size(); i4++) {
                    com.tsf.shell.e.i.b.e.b bVar2 = (com.tsf.shell.e.i.b.e.b) children().get(i4);
                    h hVar2 = (h) this.b.get(i4);
                    if (!hVar2.q) {
                        float f8 = hVar2.a;
                        float f9 = hVar2.b;
                        bVar2.position().x += (f8 - bVar2.position().x) * 0.15f;
                        bVar2.position().y += (f9 - bVar2.position().y) * 0.15f;
                        bVar2.rotation().z += (hVar2.c - bVar2.rotation().z) * 0.15f;
                        Number3d scale = bVar2.scale();
                        Number3d scale2 = bVar2.scale();
                        float f10 = scale2.y + ((hVar2.d - bVar2.scale().x) * 0.15f);
                        scale2.y = f10;
                        scale.x = f10;
                        float aJ = bVar2.aJ();
                        bVar2.g(aJ + ((hVar2.e - aJ) * 0.15f));
                        float alpha = bVar2.alpha();
                        bVar2.alpha(alpha + ((hVar2.s - alpha) * 0.15f));
                        if (Math.abs(bVar2.aJ() - hVar2.e) < 0.2f && Math.abs(bVar2.alpha() - hVar2.s) < 0.2f && Math.abs(bVar2.position().x - f8) < 0.2f && Math.abs(bVar2.position().y - f9) < 0.2f && Math.abs(bVar2.scale().x - hVar2.d) < 0.01f && Math.abs(bVar2.rotation().z - hVar2.c) < 0.2f) {
                            bVar2.position().x = f8;
                            bVar2.position().y = f9;
                            bVar2.rotation().z = hVar2.c;
                            Number3d scale3 = bVar2.scale();
                            Number3d scale4 = bVar2.scale();
                            float f11 = hVar2.d;
                            scale4.y = f11;
                            scale3.x = f11;
                            hVar2.q = true;
                            hVar2.r = false;
                            bVar2.alpha(hVar2.s);
                            bVar2.g(hVar2.e);
                        }
                        if (bVar2.alpha() == 0.0f || (bVar2.scale().x == 0.0f && bVar2.scale().y == 0.0f)) {
                            bVar2.visible(false);
                        } else {
                            bVar2.visible(true);
                        }
                    }
                    this.d = hVar2.q && this.d;
                }
            }
            if (this.d && this.k && this.l) {
                mouseEnabled(true);
                setAnimationObjectState(false);
            }
        }
    }

    private void a(h hVar, com.censivn.C3DEngine.b.f.j jVar) {
        a(hVar, jVar, this.b.size() - 1);
    }

    private void a(h hVar, com.censivn.C3DEngine.b.f.j jVar, int i2) {
        ThemeFolderDescription.SystemFolderChild systemFolderChild;
        int j2 = j();
        int i3 = b.l.c;
        ArrayList arrayList = b.l.c().folder.sampleList;
        Number3d d = this.a.d(i2);
        float f = d.x;
        hVar.i = f;
        hVar.g = f;
        hVar.a = f;
        float f2 = d.y;
        hVar.j = f2;
        hVar.h = f2;
        hVar.b = f2;
        hVar.p = 1.0f;
        hVar.l = 1.0f;
        hVar.d = 1.0f;
        hVar.o = 0.0f;
        hVar.k = 0.0f;
        hVar.c = 0.0f;
        hVar.s = 255.0f;
        hVar.e = 1.0f;
        hVar.q = true;
        com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) jVar;
        if (i2 > (j2 * b.l.a) + (i3 - 1) && bVar.aI()) {
            int i4 = i2 - i3;
            if (i4 < arrayList.size()) {
                systemFolderChild = (ThemeFolderDescription.SystemFolderChild) arrayList.get(i4);
            } else {
                systemFolderChild = (ThemeFolderDescription.SystemFolderChild) arrayList.get(i4 % arrayList.size());
                hVar.s = 0.0f;
            }
            hVar.f = ((b.l.a - (i2 % b.l.a)) - 1) * (0.5f / (b.l.a - 1));
            hVar.m = hVar.g;
            hVar.n = b.l.w;
            hVar.o = 0.0f;
            hVar.p = 1.0f;
            float f3 = systemFolderChild.position.x;
            hVar.a = f3;
            hVar.i = f3;
            float f4 = systemFolderChild.position.y;
            hVar.b = f4;
            hVar.j = f4;
            float f5 = systemFolderChild.scale.x;
            hVar.d = f5;
            hVar.l = f5;
            float f6 = systemFolderChild.rotation.z;
            hVar.k = f6;
            hVar.c = f6;
            hVar.e = 0.0f;
            bVar.mouseEnabled(false);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public void addChild(com.censivn.C3DEngine.b.f.j jVar) {
        h y = y();
        this.b.add(0, y);
        super.addChild(jVar);
        a(y, jVar);
        w();
        x();
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void addChildAt(com.censivn.C3DEngine.b.f.j jVar, int i2) {
        h y = y();
        this.b.add(0, y);
        super.addChildAt(jVar, i2);
        a(y, getChildAt(0));
        w();
        o();
        x();
    }

    private void x() {
        if (this.e) {
            b.l.a(numChildren());
        }
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public boolean removeChild(com.censivn.C3DEngine.b.f.j jVar) {
        boolean removeChild = super.removeChild(jVar);
        if (removeChild) {
            a((h) this.b.remove(0));
            w();
            o();
            x();
        }
        return removeChild;
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public com.censivn.C3DEngine.b.f.j removeChildAt(int i2) {
        com.censivn.C3DEngine.b.f.j removeChildAt = super.removeChildAt(i2);
        if (removeChildAt != null) {
            a((h) this.b.remove(0));
            w();
            o();
            x();
        }
        return removeChildAt;
    }

    private h y() {
        if (this.c.isEmpty()) {
            return new h(this);
        }
        h hVar = (h) this.c.remove(0);
        hVar.a();
        return hVar;
    }

    private void a(h hVar) {
        this.c.add(hVar);
    }
}
