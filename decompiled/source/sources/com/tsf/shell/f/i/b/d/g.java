package com.tsf.shell.f.i.b.d;

import android.opengl.GLES20;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class g extends com.tsf.shell.f.e.f.b {
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
    private ArrayList<a> b = new ArrayList<>();
    private ArrayList<a> c = new ArrayList<>();
    private com.tsf.shell.f.i.b.e.b f = new com.tsf.shell.f.i.b.e.h();

    public g(b bVar) {
        this.a = bVar;
        this.f.k.removeFromParent();
        this.f.parent(this);
        p();
    }

    @Override // com.tsf.shell.f.e.f.b
    public com.censivn.C3DEngine.b.f.i d() {
        return com.tsf.shell.manager.a.j.a();
    }

    @Override // com.tsf.shell.f.e.f.b
    public void a(com.tsf.shell.f.i.c cVar) {
        if (cVar instanceof com.tsf.shell.f.i.b.e.b) {
            cVar.mouseEnabled(false);
            Number3d.TEMPNUMBER3D2.reset();
            Number3d localToGlobal = cVar.localToGlobal(Number3d.TEMPNUMBER3D2);
            localToGlobal.y += this.a.aF().m();
            cVar.position().setAllFrom(localToGlobal);
            this.a.b((com.tsf.shell.f.i.b.e.b) cVar);
            com.tsf.shell.manager.r.c.g.a(cVar, (Runnable) null);
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        p();
        w();
        x();
        int numChildren = numChildren();
        for (int i6 = 0; i6 < numChildren; i6++) {
            com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) getChildAt(i6);
            a aVar = this.b.get(i6);
            a(aVar, bVar, (numChildren - i6) - 1);
            if (this.e) {
                bVar.position().setAll(aVar.a, aVar.b, 0.0f);
                bVar.rotation().z = aVar.c;
                bVar.scale().setAll(aVar.d, aVar.d, 0.0f);
                bVar.alpha(aVar.s);
                if (aVar.s == 0.0f) {
                    bVar.visible(false);
                }
                bVar.g(aVar.e);
            }
        }
    }

    public int a(float f, float f2) {
        j jVar = b.l;
        if (j.N.calTouchCollision(f, f2)) {
            return -3;
        }
        j jVar2 = b.l;
        if (j.O.calTouchCollision(f, f2)) {
            return -4;
        }
        return -1;
    }

    public static void a() {
        i = 5.0f;
    }

    public static void a(boolean z) {
        j jVar = b.l;
        j.N.a(z);
    }

    public static void b(boolean z) {
        j jVar = b.l;
        j.O.a(z);
    }

    public void b() {
        h = true;
        j jVar = b.l;
        j.N.visible(true);
        j jVar2 = b.l;
        float alpha = j.N.alpha();
        j jVar3 = b.l;
        float alpha2 = alpha + ((255.0f - j.N.alpha()) * 0.2f);
        j jVar4 = b.l;
        j.N.alpha(alpha2);
        j jVar5 = b.l;
        if (j.N.d()) {
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
        j jVar = b.l;
        j.N.a(false);
        j jVar2 = b.l;
        if (j.N.visible()) {
            j jVar3 = b.l;
            float alpha = j.N.alpha();
            j jVar4 = b.l;
            float alpha2 = alpha + ((0.0f - j.N.alpha()) * 0.2f);
            j jVar5 = b.l;
            j.N.alpha(alpha2);
            j jVar6 = b.l;
            if (Math.abs(j.N.alpha()) < 0.5f) {
                j jVar7 = b.l;
                j.N.alpha(0.0f);
                j jVar8 = b.l;
                j.N.visible(false);
            }
        }
        if (g) {
            g = false;
        }
    }

    public void e() {
        h = true;
        j jVar = b.l;
        j.O.visible(true);
        j jVar2 = b.l;
        float alpha = j.O.alpha();
        j jVar3 = b.l;
        float alpha2 = alpha + ((255.0f - j.O.alpha()) * 0.2f);
        j jVar4 = b.l;
        j.O.alpha(alpha2);
        j jVar5 = b.l;
        if (j.O.d()) {
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
        j jVar = b.l;
        j.O.a(false);
        j jVar2 = b.l;
        if (j.O.visible()) {
            j jVar3 = b.l;
            float alpha = j.O.alpha();
            j jVar4 = b.l;
            float alpha2 = alpha + ((0.0f - j.O.alpha()) * 0.2f);
            j jVar5 = b.l;
            j.O.alpha(alpha2);
            j jVar6 = b.l;
            if (Math.abs(j.O.alpha()) < 0.5f) {
                j jVar7 = b.l;
                j.O.alpha(0.0f);
                j jVar8 = b.l;
                j.O.visible(false);
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
            com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) getChildAt(i2);
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

    @Override // com.tsf.shell.f.e.f.b
    public float q() {
        return m();
    }

    public a a(int i2) {
        return this.b.get(i2);
    }

    public void a(com.tsf.shell.f.i.b.e.b bVar) {
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

    public int b(com.tsf.shell.f.i.b.e.b bVar) {
        bVar.l(this.f.aI());
        int indexOf = children().indexOf(this.f);
        if (indexOf != -1) {
            bVar.parent(this);
            children().set(indexOf, bVar);
            this.b.get(indexOf).q = false;
            this.d = false;
            setAnimationObjectState(true);
            invalidate();
        }
        return indexOf;
    }

    public void n() {
        removeChild(this.f);
    }

    public int a(com.censivn.C3DEngine.b.f.i iVar) {
        int indexOf = children().indexOf(iVar);
        if (indexOf == -1) {
            return -1;
        }
        return (numChildren() - indexOf) - 1;
    }

    public boolean a(com.censivn.C3DEngine.b.f.i iVar, int i2, int i3) {
        int i4;
        int i5;
        int numChildren = numChildren();
        this.b.get((numChildren - i3) - 1);
        com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) getChildAt((numChildren - i3) - 1);
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
            this.b.get((numChildren - i5) - 1).q = false;
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
            this.b.get(i2).q = false;
        }
        this.d = false;
        setAnimationObjectState(true);
        invalidate();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void drawMVPMatrix() {
        if (this.e) {
            MatrixStack.glTranslatef(position().x, this.o, position().z);
        } else {
            MatrixStack.glTranslatef(position().x, position().y, position().z);
        }
        com.censivn.C3DEngine.a.c.a(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.AABB_MATRIX, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    @Override // com.tsf.shell.f.e.f.b, com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
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
                    com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) getChildAt(i2);
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
                    com.tsf.shell.f.i.b.e.b bVar2 = (com.tsf.shell.f.i.b.e.b) getChildAt(i3);
                    if (bVar2.o && bVar2.aI()) {
                        onDrawChildStart(bVar2);
                        bVar2.dispatchDraw();
                        onDrawChildEnd(bVar2);
                    }
                }
                MatrixStack.glPopMatrix();
                j jVar = b.l;
                j.N.dispatchDraw();
                j jVar2 = b.l;
                j.O.dispatchDraw();
                onDrawEnd();
                return;
            }
            return;
        }
        super.dispatchDraw();
    }

    private void a(com.tsf.shell.f.i.b.e.b bVar, a aVar, int i2, float f, float f2) {
        float f3 = f2 / b.l.j;
        if (!bVar.o) {
            bVar.mouseEnabled(false);
            bVar.o = true;
            bVar.position().y += f;
            ArrayList<ThemeFolderDescription.SystemFolderChild> arrayList = b.l.c().folder.sampleList;
            int size = i2 > arrayList.size() + (-1) ? arrayList.size() - 1 : i2;
            aVar.f = ((b.l.a - i2) - 1) * (0.5f / (b.l.a - 1));
            Number3d number3d = arrayList.get(size).position;
            Number3d number3d2 = arrayList.get(size).rotation;
            Number3d number3d3 = arrayList.get(size).scale;
            aVar.i = number3d.x;
            aVar.j = number3d.y;
            aVar.k = number3d2.z;
            aVar.l = number3d3.x;
            float f4 = b.l.l + (b.l.i * i2);
            aVar.a = f4;
            aVar.m = f4;
            float f5 = b.l.w;
            aVar.b = f5;
            aVar.n = f5;
            aVar.c = 0.0f;
            aVar.o = 0.0f;
            aVar.d = 1.0f;
            aVar.p = 1.0f;
            aVar.q = false;
            this.d = false;
        }
        if (f3 > 1.0f) {
            if (f3 > 2.0f) {
                if (aVar.s != 0.0f) {
                    aVar.s = 0.0f;
                    aVar.e = 0.0f;
                    aVar.q = false;
                    this.d = false;
                    return;
                }
                return;
            }
            aVar.a = aVar.i;
            aVar.b = aVar.j;
            aVar.c = aVar.k;
            aVar.d = aVar.l;
            aVar.e = 0.0f;
            aVar.s = (2.0f - f3) * 255.0f;
            aVar.q = false;
            this.d = false;
            return;
        }
        if (f3 >= aVar.f) {
            float f6 = (f3 - aVar.f) / 0.5f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            aVar.a = aVar.m + ((aVar.i - aVar.m) * f6);
            aVar.b = (aVar.n + ((aVar.j - aVar.n) * f6)) - ((1.0f - f6) * f2);
            aVar.c = aVar.o + ((aVar.k - aVar.o) * f6);
            aVar.d = aVar.p + ((aVar.l - aVar.p) * f6);
            aVar.e = 1.0f - f6;
            aVar.q = false;
            this.d = false;
        } else {
            aVar.a = aVar.m;
            aVar.b = aVar.n - f2;
            aVar.c = aVar.o;
            aVar.d = aVar.p;
            aVar.e = 1.0f;
            aVar.q = false;
            this.d = false;
        }
        if (aVar.s != 255.0f) {
            aVar.s = 255.0f;
            aVar.q = false;
            this.d = false;
        }
    }

    private void a(com.tsf.shell.f.i.b.e.b bVar, a aVar, int i2, float f) {
        if (bVar.o) {
            bVar.mouseEnabled(true);
            bVar.o = false;
            bVar.position().y -= f;
            aVar.a = aVar.g;
            aVar.b = aVar.h;
            aVar.s = 255.0f;
            aVar.c = 0.0f;
            aVar.d = 1.0f;
            aVar.e = 1.0f;
            aVar.q = false;
            this.d = false;
        }
    }

    public void c(boolean z) {
        this.q = z;
    }

    @Override // com.censivn.C3DEngine.b.f.i
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
                    com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) children().get((size - 1) - i3);
                    a aVar = this.b.get((size - 1) - i3);
                    if (aVar.h + bVar.maxY() + f7 > b.l.u) {
                        float maxY = ((aVar.h + bVar.maxY()) + f7) - b.l.u;
                        if (maxY >= bVar.maxY()) {
                            aVar.d = 0.0f;
                        } else {
                            aVar.d = (bVar.maxY() - maxY) / bVar.maxY();
                        }
                        bVar.scale().x = aVar.d;
                        bVar.scale().y = aVar.d;
                        if (aVar.d == 0.0f || aVar.s == 0.0f) {
                            bVar.visible(false);
                        } else {
                            bVar.visible(true);
                        }
                        aVar.r = false;
                        a(bVar, aVar, i3 % i2, f7);
                    } else if (aVar.h + f7 < b.l.v) {
                        if (aVar.r) {
                            a(bVar, aVar, i3 % i2, f7);
                            bVar.visible(true);
                            aVar.d = 1.0f;
                            bVar.scale().x = aVar.d;
                            bVar.scale().y = aVar.d;
                        } else {
                            a(bVar, aVar, i3 % i2, f7, b.l.v - (aVar.h + f7));
                        }
                    } else {
                        aVar.r = false;
                        a(bVar, aVar, i3 % i2, f7);
                        bVar.visible(true);
                        aVar.d = 1.0f;
                        bVar.scale().x = aVar.d;
                        bVar.scale().y = aVar.d;
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
                    com.tsf.shell.f.i.b.e.b bVar2 = (com.tsf.shell.f.i.b.e.b) children().get(i4);
                    a aVar2 = this.b.get(i4);
                    if (!aVar2.q) {
                        float f8 = aVar2.a;
                        float f9 = aVar2.b;
                        bVar2.position().x += (f8 - bVar2.position().x) * 0.15f;
                        bVar2.position().y += (f9 - bVar2.position().y) * 0.15f;
                        bVar2.rotation().z += (aVar2.c - bVar2.rotation().z) * 0.15f;
                        Number3d scale = bVar2.scale();
                        Number3d scale2 = bVar2.scale();
                        float f10 = scale2.y + ((aVar2.d - bVar2.scale().x) * 0.15f);
                        scale2.y = f10;
                        scale.x = f10;
                        float aJ = bVar2.aJ();
                        bVar2.g(aJ + ((aVar2.e - aJ) * 0.15f));
                        float alpha = bVar2.alpha();
                        bVar2.alpha(alpha + ((aVar2.s - alpha) * 0.15f));
                        if (Math.abs(bVar2.aJ() - aVar2.e) < 0.2f && Math.abs(bVar2.alpha() - aVar2.s) < 0.2f && Math.abs(bVar2.position().x - f8) < 0.2f && Math.abs(bVar2.position().y - f9) < 0.2f && Math.abs(bVar2.scale().x - aVar2.d) < 0.01f && Math.abs(bVar2.rotation().z - aVar2.c) < 0.2f) {
                            bVar2.position().x = f8;
                            bVar2.position().y = f9;
                            bVar2.rotation().z = aVar2.c;
                            Number3d scale3 = bVar2.scale();
                            Number3d scale4 = bVar2.scale();
                            float f11 = aVar2.d;
                            scale4.y = f11;
                            scale3.x = f11;
                            aVar2.q = true;
                            aVar2.r = false;
                            bVar2.alpha(aVar2.s);
                            bVar2.g(aVar2.e);
                        }
                        if (bVar2.alpha() == 0.0f || (bVar2.scale().x == 0.0f && bVar2.scale().y == 0.0f)) {
                            bVar2.visible(false);
                        } else {
                            bVar2.visible(true);
                        }
                    }
                    this.d = aVar2.q && this.d;
                }
            }
            if (this.d && this.k && this.l) {
                mouseEnabled(true);
                setAnimationObjectState(false);
            }
        }
    }

    private void a(a aVar, com.censivn.C3DEngine.b.f.i iVar) {
        a(aVar, iVar, this.b.size() - 1);
    }

    private void a(a aVar, com.censivn.C3DEngine.b.f.i iVar, int i2) {
        ThemeFolderDescription.SystemFolderChild systemFolderChild;
        int j2 = j();
        int i3 = b.l.c;
        ArrayList<ThemeFolderDescription.SystemFolderChild> arrayList = b.l.c().folder.sampleList;
        Number3d d = this.a.d(i2);
        float f = d.x;
        aVar.i = f;
        aVar.g = f;
        aVar.a = f;
        float f2 = d.y;
        aVar.j = f2;
        aVar.h = f2;
        aVar.b = f2;
        aVar.p = 1.0f;
        aVar.l = 1.0f;
        aVar.d = 1.0f;
        aVar.o = 0.0f;
        aVar.k = 0.0f;
        aVar.c = 0.0f;
        aVar.s = 255.0f;
        aVar.e = 1.0f;
        aVar.q = true;
        com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) iVar;
        if (i2 > (j2 * b.l.a) + (i3 - 1) && bVar.aI()) {
            int i4 = i2 - i3;
            if (i4 < arrayList.size()) {
                systemFolderChild = arrayList.get(i4);
            } else {
                systemFolderChild = arrayList.get(i4 % arrayList.size());
                aVar.s = 0.0f;
            }
            aVar.f = ((b.l.a - (i2 % b.l.a)) - 1) * (0.5f / (b.l.a - 1));
            aVar.m = aVar.g;
            aVar.n = b.l.w;
            aVar.o = 0.0f;
            aVar.p = 1.0f;
            float f3 = systemFolderChild.position.x;
            aVar.a = f3;
            aVar.i = f3;
            float f4 = systemFolderChild.position.y;
            aVar.b = f4;
            aVar.j = f4;
            float f5 = systemFolderChild.scale.x;
            aVar.d = f5;
            aVar.l = f5;
            float f6 = systemFolderChild.rotation.z;
            aVar.k = f6;
            aVar.c = f6;
            aVar.e = 0.0f;
            bVar.mouseEnabled(false);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public void addChild(com.censivn.C3DEngine.b.f.i iVar) {
        a y = y();
        this.b.add(0, y);
        super.addChild(iVar);
        a(y, iVar);
        w();
        x();
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void addChildAt(com.censivn.C3DEngine.b.f.i iVar, int i2) {
        a y = y();
        this.b.add(0, y);
        super.addChildAt(iVar, i2);
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

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public boolean removeChild(com.censivn.C3DEngine.b.f.i iVar) {
        boolean removeChild = super.removeChild(iVar);
        if (removeChild) {
            a(this.b.remove(0));
            w();
            o();
            x();
        }
        return removeChild;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public com.censivn.C3DEngine.b.f.i removeChildAt(int i2) {
        com.censivn.C3DEngine.b.f.i removeChildAt = super.removeChildAt(i2);
        if (removeChildAt != null) {
            a(this.b.remove(0));
            w();
            o();
            x();
        }
        return removeChildAt;
    }

    private a y() {
        if (this.c.isEmpty()) {
            return new a();
        }
        a remove = this.c.remove(0);
        remove.a();
        return remove;
    }

    private void a(a aVar) {
        this.c.add(aVar);
    }

    /* loaded from: classes.dex */
    public class a {
        public float f;
        public float a = 0.0f;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 1.0f;
        public float e = 1.0f;
        public float g = 0.0f;
        public float h = 0.0f;
        public float i = 0.0f;
        public float j = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public float m = 0.0f;
        public float n = 0.0f;
        public float o = 0.0f;
        public float p = 0.0f;
        public boolean q = false;
        public boolean r = false;
        public float s = 255.0f;

        public a() {
        }

        public void a() {
            this.a = 0.0f;
            this.b = 0.0f;
            this.d = 1.0f;
            this.s = 255.0f;
            this.q = false;
        }
    }
}
