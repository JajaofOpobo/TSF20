package com.tsf.shell.p096f.p153i.p155b.p159d;

import android.opengl.GLES20;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.p030a.C0863c;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p187r.p193c.C3743g;
import com.tsf.shell.p096f.p118e.p126f.C2570b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.i.b.d.g */
/* loaded from: classes.dex */
public class C3183g extends C2570b {

    /* renamed from: g */
    private static boolean f10350g = false;

    /* renamed from: h */
    private static boolean f10351h = false;

    /* renamed from: i */
    private static float f10352i = 5.0f;

    /* renamed from: j */
    private static float f10353j = 0.0f;

    /* renamed from: a */
    private C3145b f10354a;

    /* renamed from: m */
    private float f10362m;

    /* renamed from: n */
    private float f10363n;

    /* renamed from: o */
    private float f10364o;

    /* renamed from: p */
    private float f10365p;

    /* renamed from: d */
    private boolean f10357d = true;

    /* renamed from: e */
    private boolean f10358e = false;

    /* renamed from: k */
    private boolean f10360k = true;

    /* renamed from: l */
    private boolean f10361l = true;

    /* renamed from: q */
    private boolean f10366q = false;

    /* renamed from: b */
    private ArrayList<C3184a> f10355b = new ArrayList<>();

    /* renamed from: c */
    private ArrayList<C3184a> f10356c = new ArrayList<>();

    /* renamed from: f */
    private AbstractC3208b f10359f = new C3224h();

    public C3183g(C3145b c3145b) {
        this.f10354a = c3145b;
        this.f10359f.f10495k.removeFromParent();
        this.f10359f.parent(this);
        m3247p();
    }

    @Override // com.tsf.shell.p096f.p118e.p126f.C2570b
    /* renamed from: d */
    public C0975i mo2131d() {
        return C3359a.f11096j.m2236a();
    }

    @Override // com.tsf.shell.p096f.p118e.p126f.C2570b
    /* renamed from: a */
    public void mo2137a(C3231c c3231c) {
        if (c3231c instanceof AbstractC3208b) {
            c3231c.mouseEnabled(false);
            Number3d.TEMPNUMBER3D2.reset();
            Number3d localToGlobal = c3231c.localToGlobal(Number3d.TEMPNUMBER3D2);
            localToGlobal.f2527y += this.f10354a.m3377aF().m3250m();
            c3231c.position().setAllFrom(localToGlobal);
            this.f10354a.m3348b((AbstractC3208b) c3231c);
            C3743g.m1619a(c3231c, (Runnable) null);
        }
    }

    /* renamed from: a */
    public void m3275a(int i, int i2, int i3, int i4) {
        m3247p();
        m3245w();
        m3244x();
        int numChildren = numChildren();
        for (int i5 = 0; i5 < numChildren; i5++) {
            AbstractC3208b abstractC3208b = (AbstractC3208b) getChildAt(i5);
            C3184a c3184a = this.f10355b.get(i5);
            m3269a(c3184a, abstractC3208b, (numChildren - i5) - 1);
            if (this.f10358e) {
                abstractC3208b.position().setAll(c3184a.f10367a, c3184a.f10368b, 0.0f);
                abstractC3208b.rotation().f2528z = c3184a.f10369c;
                abstractC3208b.scale().setAll(c3184a.f10370d, c3184a.f10370d, 0.0f);
                abstractC3208b.alpha(c3184a.f10385s);
                if (c3184a.f10385s == 0.0f) {
                    abstractC3208b.visible(false);
                }
                abstractC3208b.m3136g(c3184a.f10371e);
            }
        }
    }

    /* renamed from: a */
    public int m3277a(float f, float f2) {
        C3187j c3187j = C3145b.f10241l;
        if (C3187j.f10395N.calTouchCollision(f, f2)) {
            return -3;
        }
        C3187j c3187j2 = C3145b.f10241l;
        if (C3187j.f10396O.calTouchCollision(f, f2)) {
            return -4;
        }
        return -1;
    }

    /* renamed from: a */
    public static void m3279a() {
        f10352i = 5.0f;
    }

    /* renamed from: a */
    public static void m3265a(boolean z) {
        C3187j c3187j = C3145b.f10241l;
        C3187j.f10395N.m3237a(z);
    }

    /* renamed from: b */
    public static void m3261b(boolean z) {
        C3187j c3187j = C3145b.f10241l;
        C3187j.f10396O.m3237a(z);
    }

    /* renamed from: b */
    public void m3264b() {
        f10351h = true;
        C3187j c3187j = C3145b.f10241l;
        C3187j.f10395N.visible(true);
        C3187j c3187j2 = C3145b.f10241l;
        float alpha = C3187j.f10395N.alpha();
        C3187j c3187j3 = C3145b.f10241l;
        float alpha2 = alpha + ((255.0f - C3187j.f10395N.alpha()) * 0.2f);
        C3187j c3187j4 = C3145b.f10241l;
        C3187j.f10395N.alpha(alpha2);
        C3187j c3187j5 = C3145b.f10241l;
        if (C3187j.f10395N.m3236d()) {
            this.f10365p -= f10352i;
            f10352i += 0.5f;
            if (this.f10365p < C3145b.f10241l.f10444x) {
                this.f10365p = C3145b.f10241l.f10444x;
            }
            this.f10360k = false;
            setAnimationObjectState(true);
            invalidate();
        }
    }

    /* renamed from: c */
    public void m3260c() {
        C3187j c3187j = C3145b.f10241l;
        C3187j.f10395N.m3237a(false);
        C3187j c3187j2 = C3145b.f10241l;
        if (C3187j.f10395N.visible()) {
            C3187j c3187j3 = C3145b.f10241l;
            float alpha = C3187j.f10395N.alpha();
            C3187j c3187j4 = C3145b.f10241l;
            float alpha2 = alpha + ((0.0f - C3187j.f10395N.alpha()) * 0.2f);
            C3187j c3187j5 = C3145b.f10241l;
            C3187j.f10395N.alpha(alpha2);
            C3187j c3187j6 = C3145b.f10241l;
            if (Math.abs(C3187j.f10395N.alpha()) < 0.5f) {
                C3187j c3187j7 = C3145b.f10241l;
                C3187j.f10395N.alpha(0.0f);
                C3187j c3187j8 = C3145b.f10241l;
                C3187j.f10395N.visible(false);
            }
        }
        if (f10350g) {
            f10350g = false;
        }
    }

    /* renamed from: e */
    public void m3258e() {
        f10351h = true;
        C3187j c3187j = C3145b.f10241l;
        C3187j.f10396O.visible(true);
        C3187j c3187j2 = C3145b.f10241l;
        float alpha = C3187j.f10396O.alpha();
        C3187j c3187j3 = C3145b.f10241l;
        float alpha2 = alpha + ((255.0f - C3187j.f10396O.alpha()) * 0.2f);
        C3187j c3187j4 = C3145b.f10241l;
        C3187j.f10396O.alpha(alpha2);
        C3187j c3187j5 = C3145b.f10241l;
        if (C3187j.f10396O.m3236d()) {
            this.f10365p += f10352i;
            f10352i += 0.5f;
            if (this.f10365p > this.f10363n) {
                this.f10365p = this.f10363n;
            }
            this.f10360k = false;
            setAnimationObjectState(true);
            invalidate();
        }
    }

    /* renamed from: f */
    public void m3257f() {
        C3187j c3187j = C3145b.f10241l;
        C3187j.f10396O.m3237a(false);
        C3187j c3187j2 = C3145b.f10241l;
        if (C3187j.f10396O.visible()) {
            C3187j c3187j3 = C3145b.f10241l;
            float alpha = C3187j.f10396O.alpha();
            C3187j c3187j4 = C3145b.f10241l;
            float alpha2 = alpha + ((0.0f - C3187j.f10396O.alpha()) * 0.2f);
            C3187j c3187j5 = C3145b.f10241l;
            C3187j.f10396O.alpha(alpha2);
            C3187j c3187j6 = C3145b.f10241l;
            if (Math.abs(C3187j.f10396O.alpha()) < 0.5f) {
                C3187j c3187j7 = C3145b.f10241l;
                C3187j.f10396O.alpha(0.0f);
                C3187j c3187j8 = C3145b.f10241l;
                C3187j.f10396O.visible(false);
            }
        }
        if (f10351h) {
            f10351h = false;
        }
    }

    /* renamed from: g */
    public void m3256g() {
        this.f10358e = true;
        m3247p();
    }

    /* renamed from: h */
    public void m3255h() {
        this.f10358e = false;
        float f = this.f10364o - C3145b.f10241l.f10444x;
        int numChildren = numChildren();
        for (int i = 0; i < numChildren; i++) {
            AbstractC3208b abstractC3208b = (AbstractC3208b) getChildAt(i);
            if (!abstractC3208b.f10499o) {
                abstractC3208b.position().f2527y += f;
            }
        }
    }

    /* renamed from: i */
    public void m3254i() {
        m3247p();
    }

    /* renamed from: p */
    private void m3247p() {
        float f = C3145b.f10241l.m3224c().folder.childContainerY;
        this.f10365p = f;
        this.f10364o = f;
    }

    /* renamed from: w */
    private void m3245w() {
        if (numChildren() == 0 || numChildren() <= C3145b.f10241l.f10423c) {
            this.f10363n = C3145b.f10241l.f10444x;
        } else {
            this.f10363n = C3145b.f10241l.f10444x + (((((numChildren() - 1) / C3145b.f10241l.f10421a) - C3145b.f10241l.f10422b) + 1) * C3145b.f10241l.f10430j);
        }
        this.f10360k = false;
        setAnimationObjectState(true);
        invalidate();
    }

    /* renamed from: a */
    public void m3274a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f10361l) {
            this.f10361l = false;
            float f3 = this.f10364o;
            this.f10365p = f3;
            this.f10362m = f3;
            this.f10360k = false;
            setAnimationObjectState(true);
            invalidate();
        }
        this.f10365p = this.f10362m - (motionEvent2.getY() - motionEvent.getY());
    }

    /* renamed from: a */
    public void m3278a(float f) {
        this.f10365p -= f / 6.0f;
        m3252k();
        this.f10361l = true;
    }

    /* renamed from: j */
    public int m3253j() {
        float f = (this.f10365p - C3145b.f10241l.f10444x) % C3145b.f10241l.f10430j;
        float abs = Math.abs(f) / C3145b.f10241l.f10430j;
        float f2 = this.f10365p - f;
        if (abs > 0.5d) {
            if (f > 0.0f) {
                f2 += C3145b.f10241l.f10430j;
            } else {
                f2 -= C3145b.f10241l.f10430j;
            }
        }
        return (int) ((f2 - C3145b.f10241l.f10444x) / C3145b.f10241l.f10430j);
    }

    /* renamed from: k */
    public void m3252k() {
        float f = (this.f10365p - C3145b.f10241l.f10444x) % C3145b.f10241l.f10430j;
        float abs = Math.abs(f) / C3145b.f10241l.f10430j;
        this.f10365p -= f;
        if (abs > 0.5d) {
            if (f > 0.0f) {
                this.f10365p += C3145b.f10241l.f10430j;
            } else {
                this.f10365p -= C3145b.f10241l.f10430j;
            }
        }
        this.f10360k = false;
        setAnimationObjectState(true);
    }

    /* renamed from: b */
    public void m3263b(float f) {
        this.f10365p = this.f10363n;
        this.f10360k = false;
        setAnimationObjectState(true);
        if (f > 0.0f) {
            f10353j = f;
        }
    }

    /* renamed from: l */
    public float m3251l() {
        return this.f10365p - C3145b.f10241l.f10444x;
    }

    /* renamed from: m */
    public float m3250m() {
        return this.f10364o - C3145b.f10241l.f10444x;
    }

    @Override // com.tsf.shell.p096f.p118e.p126f.C2570b
    /* renamed from: q */
    public float mo3246q() {
        return m3250m();
    }

    /* renamed from: a */
    public C3184a m3276a(int i) {
        return this.f10355b.get(i);
    }

    /* renamed from: a */
    public void m3268a(AbstractC3208b abstractC3208b) {
        abstractC3208b.parent(null);
        this.f10359f.position().setAllFrom(abstractC3208b.position());
        this.f10359f.rotation().setAllFrom(abstractC3208b.rotation());
        this.f10359f.scale().setAllFrom(abstractC3208b.scale());
        this.f10359f.m3134l(abstractC3208b.m3157aI());
        int indexOf = children().indexOf(abstractC3208b);
        if (indexOf != -1) {
            children().set(indexOf, this.f10359f);
        }
    }

    /* renamed from: b */
    public int m3262b(AbstractC3208b abstractC3208b) {
        abstractC3208b.m3134l(this.f10359f.m3157aI());
        int indexOf = children().indexOf(this.f10359f);
        if (indexOf != -1) {
            abstractC3208b.parent(this);
            children().set(indexOf, abstractC3208b);
            this.f10355b.get(indexOf).f10383q = false;
            this.f10357d = false;
            setAnimationObjectState(true);
            invalidate();
        }
        return indexOf;
    }

    /* renamed from: n */
    public void m3249n() {
        removeChild(this.f10359f);
    }

    /* renamed from: a */
    public int m3273a(C0975i c0975i) {
        int indexOf = children().indexOf(c0975i);
        if (indexOf == -1) {
            return -1;
        }
        return (numChildren() - indexOf) - 1;
    }

    /* renamed from: a */
    public boolean m3272a(C0975i c0975i, int i, int i2) {
        int i3;
        int i4;
        int numChildren = numChildren();
        this.f10355b.get((numChildren - i2) - 1);
        AbstractC3208b abstractC3208b = (AbstractC3208b) getChildAt((numChildren - i2) - 1);
        if (!abstractC3208b.visible() || abstractC3208b.f10499o) {
            return false;
        }
        children().remove(this.f10359f);
        children().add((numChildren - i2) - 1, this.f10359f);
        if (i > i2) {
            i3 = i;
            i4 = i2;
        } else {
            i3 = i2;
            i4 = i;
        }
        if (i4 > numChildren - 1) {
            i4 = numChildren - 1;
        }
        int i5 = i3 > numChildren + (-1) ? numChildren - 1 : i3;
        while (i4 < i5 + 1) {
            this.f10355b.get((numChildren - i4) - 1).f10383q = false;
            i4++;
        }
        this.f10357d = false;
        setAnimationObjectState(true);
        invalidate();
        return true;
    }

    /* renamed from: o */
    public void m3248o() {
        int numChildren = numChildren();
        for (int i = 0; i < numChildren; i++) {
            this.f10355b.get(i).f10383q = false;
        }
        this.f10357d = false;
        setAnimationObjectState(true);
        invalidate();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void drawMVPMatrix() {
        if (this.f10358e) {
            MatrixStack.glTranslatef(position().f2526x, this.f10364o, position().f2528z);
        } else {
            MatrixStack.glTranslatef(position().f2526x, position().f2527y, position().f2528z);
        }
        C0863c.m10829a(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.AABB_MATRIX, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    @Override // com.tsf.shell.p096f.p118e.p126f.C2570b, com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void dispatchDraw() {
        if (this.f10358e) {
            if (visible()) {
                onDrawStart();
                MatrixStack.glPushMatrix();
                draw();
                MatrixStack.glColor(alpha(), getDefaultColor());
                onDrawChildStart();
                int numChildren = numChildren();
                for (int i = 0; i < numChildren; i++) {
                    AbstractC3208b abstractC3208b = (AbstractC3208b) getChildAt(i);
                    if (!abstractC3208b.f10499o && abstractC3208b.m3157aI()) {
                        onDrawChildStart(abstractC3208b);
                        abstractC3208b.dispatchDraw();
                        onDrawChildEnd(abstractC3208b);
                    }
                }
                MatrixStack.glPopMatrix();
                MatrixStack.glPushMatrix();
                boolean z = this.f10358e;
                this.f10358e = false;
                drawMVPMatrix();
                this.f10358e = z;
                MatrixStack.glColor(alpha(), getDefaultColor());
                for (int i2 = 0; i2 < numChildren; i2++) {
                    AbstractC3208b abstractC3208b2 = (AbstractC3208b) getChildAt(i2);
                    if (abstractC3208b2.f10499o && abstractC3208b2.m3157aI()) {
                        onDrawChildStart(abstractC3208b2);
                        abstractC3208b2.dispatchDraw();
                        onDrawChildEnd(abstractC3208b2);
                    }
                }
                MatrixStack.glPopMatrix();
                C3187j c3187j = C3145b.f10241l;
                C3187j.f10395N.dispatchDraw();
                C3187j c3187j2 = C3145b.f10241l;
                C3187j.f10396O.dispatchDraw();
                onDrawEnd();
                return;
            }
            return;
        }
        super.dispatchDraw();
    }

    /* renamed from: a */
    private void m3266a(AbstractC3208b abstractC3208b, C3184a c3184a, int i, float f, float f2) {
        float f3 = f2 / C3145b.f10241l.f10430j;
        if (!abstractC3208b.f10499o) {
            abstractC3208b.mouseEnabled(false);
            abstractC3208b.f10499o = true;
            abstractC3208b.position().f2527y += f;
            ArrayList<ThemeFolderDescription.SystemFolderChild> arrayList = C3145b.f10241l.m3224c().folder.sampleList;
            int size = i > arrayList.size() + (-1) ? arrayList.size() - 1 : i;
            c3184a.f10372f = ((C3145b.f10241l.f10421a - i) - 1) * (0.5f / (C3145b.f10241l.f10421a - 1));
            Number3d number3d = arrayList.get(size).position;
            Number3d number3d2 = arrayList.get(size).rotation;
            Number3d number3d3 = arrayList.get(size).scale;
            c3184a.f10375i = number3d.f2526x;
            c3184a.f10376j = number3d.f2527y;
            c3184a.f10377k = number3d2.f2528z;
            c3184a.f10378l = number3d3.f2526x;
            float f4 = C3145b.f10241l.f10432l + (C3145b.f10241l.f10429i * i);
            c3184a.f10367a = f4;
            c3184a.f10379m = f4;
            float f5 = C3145b.f10241l.f10443w;
            c3184a.f10368b = f5;
            c3184a.f10380n = f5;
            c3184a.f10369c = 0.0f;
            c3184a.f10381o = 0.0f;
            c3184a.f10370d = 1.0f;
            c3184a.f10382p = 1.0f;
            c3184a.f10383q = false;
            this.f10357d = false;
        }
        if (f3 > 1.0f) {
            if (f3 > 2.0f) {
                if (c3184a.f10385s != 0.0f) {
                    c3184a.f10385s = 0.0f;
                    c3184a.f10371e = 0.0f;
                    c3184a.f10383q = false;
                    this.f10357d = false;
                    return;
                }
                return;
            }
            c3184a.f10367a = c3184a.f10375i;
            c3184a.f10368b = c3184a.f10376j;
            c3184a.f10369c = c3184a.f10377k;
            c3184a.f10370d = c3184a.f10378l;
            c3184a.f10371e = 0.0f;
            c3184a.f10385s = (2.0f - f3) * 255.0f;
            c3184a.f10383q = false;
            this.f10357d = false;
            return;
        }
        if (f3 >= c3184a.f10372f) {
            float f6 = (f3 - c3184a.f10372f) / 0.5f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            c3184a.f10367a = c3184a.f10379m + ((c3184a.f10375i - c3184a.f10379m) * f6);
            c3184a.f10368b = (c3184a.f10380n + ((c3184a.f10376j - c3184a.f10380n) * f6)) - ((1.0f - f6) * f2);
            c3184a.f10369c = c3184a.f10381o + ((c3184a.f10377k - c3184a.f10381o) * f6);
            c3184a.f10370d = c3184a.f10382p + ((c3184a.f10378l - c3184a.f10382p) * f6);
            c3184a.f10371e = 1.0f - f6;
            c3184a.f10383q = false;
            this.f10357d = false;
        } else {
            c3184a.f10367a = c3184a.f10379m;
            c3184a.f10368b = c3184a.f10380n - f2;
            c3184a.f10369c = c3184a.f10381o;
            c3184a.f10370d = c3184a.f10382p;
            c3184a.f10371e = 1.0f;
            c3184a.f10383q = false;
            this.f10357d = false;
        }
        if (c3184a.f10385s != 255.0f) {
            c3184a.f10385s = 255.0f;
            c3184a.f10383q = false;
            this.f10357d = false;
        }
    }

    /* renamed from: a */
    private void m3267a(AbstractC3208b abstractC3208b, C3184a c3184a, int i, float f) {
        if (abstractC3208b.f10499o) {
            abstractC3208b.mouseEnabled(true);
            abstractC3208b.f10499o = false;
            abstractC3208b.position().f2527y -= f;
            c3184a.f10367a = c3184a.f10373g;
            c3184a.f10368b = c3184a.f10374h;
            c3184a.f10385s = 255.0f;
            c3184a.f10369c = 0.0f;
            c3184a.f10370d = 1.0f;
            c3184a.f10371e = 1.0f;
            c3184a.f10383q = false;
            this.f10357d = false;
        }
    }

    /* renamed from: c */
    public void m3259c(boolean z) {
        this.f10366q = z;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        float f;
        if (this.f10358e) {
            if (!this.f10360k || !this.f10361l) {
                if (f10353j == 0.0f) {
                    f = this.f10361l ? 0.1f : 0.3f;
                } else {
                    f = f10353j;
                }
                this.f10364o = (f * (this.f10365p - this.f10364o)) + this.f10364o;
                float f2 = (C3145b.f10241l.f10438r - C3145b.f10241l.f10435o) - (((this.f10364o - C3145b.f10241l.f10444x) / (this.f10363n - C3145b.f10241l.f10444x)) * C3145b.f10241l.f10440t);
                C3145b.f10241l.f10410I.position().f2527y = f2;
                if (C3145b.f10241l.f10435o + f2 > C3145b.f10241l.f10438r) {
                    float f3 = (f2 + C3145b.f10241l.f10435o) - C3145b.f10241l.f10438r;
                    if (f3 < C3145b.f10241l.f10435o) {
                        C3145b.f10241l.f10410I.m3241c(C3145b.f10241l.f10435o - f3);
                        C3145b.f10241l.f10410I.m3240d(C3145b.f10241l.f10435o);
                    } else {
                        C3145b.f10241l.f10410I.m3241c(0.0f);
                        float f4 = C3145b.f10241l.f10434n - f3;
                        if (f4 < C3145b.f10241l.f10436p) {
                            f4 = C3145b.f10241l.f10436p;
                        }
                        C3145b.f10241l.f10410I.m3240d(f4);
                        C3145b.f10241l.f10410I.position().f2527y = C3145b.f10241l.f10438r;
                    }
                } else if (f2 - C3145b.f10241l.f10435o < C3145b.f10241l.f10439s) {
                    float f5 = C3145b.f10241l.f10439s - (f2 - C3145b.f10241l.f10435o);
                    if (f5 < C3145b.f10241l.f10435o) {
                        C3145b.f10241l.f10410I.m3240d(C3145b.f10241l.f10435o - f5);
                        C3145b.f10241l.f10410I.m3241c(C3145b.f10241l.f10435o);
                    } else {
                        C3145b.f10241l.f10410I.m3240d(0.0f);
                        float f6 = C3145b.f10241l.f10434n - f5;
                        if (f6 < C3145b.f10241l.f10436p) {
                            f6 = C3145b.f10241l.f10436p;
                        }
                        C3145b.f10241l.f10410I.m3241c(f6);
                        C3145b.f10241l.f10410I.position().f2527y = C3145b.f10241l.f10439s;
                    }
                }
                C3145b.f10241l.m3219h();
                if (this.f10361l) {
                    if (this.f10365p < C3145b.f10241l.f10444x) {
                        this.f10365p += (C3145b.f10241l.f10444x - this.f10365p) * 0.1f;
                        if (Math.abs(this.f10365p - C3145b.f10241l.f10444x) < 0.2f) {
                            this.f10365p = C3145b.f10241l.f10444x;
                        }
                    } else if (this.f10365p > this.f10363n) {
                        this.f10365p += (this.f10363n - this.f10365p) * 0.1f;
                        if (Math.abs(this.f10365p - this.f10363n) < 0.2f) {
                            this.f10365p = this.f10363n;
                        }
                    } else if (Math.abs(this.f10365p - this.f10364o) < 0.2f) {
                        this.f10364o = this.f10365p;
                        this.f10360k = true;
                        f10353j = 0.0f;
                        C3145b.f10241l.m3218i();
                    }
                }
                float f7 = this.f10364o - C3145b.f10241l.f10444x;
                int size = children().size();
                int i = C3145b.f10241l.f10421a;
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC3208b abstractC3208b = (AbstractC3208b) children().get((size - 1) - i2);
                    C3184a c3184a = this.f10355b.get((size - 1) - i2);
                    if (c3184a.f10374h + abstractC3208b.maxY() + f7 > C3145b.f10241l.f10441u) {
                        float maxY = ((c3184a.f10374h + abstractC3208b.maxY()) + f7) - C3145b.f10241l.f10441u;
                        if (maxY >= abstractC3208b.maxY()) {
                            c3184a.f10370d = 0.0f;
                        } else {
                            c3184a.f10370d = (abstractC3208b.maxY() - maxY) / abstractC3208b.maxY();
                        }
                        abstractC3208b.scale().f2526x = c3184a.f10370d;
                        abstractC3208b.scale().f2527y = c3184a.f10370d;
                        if (c3184a.f10370d == 0.0f || c3184a.f10385s == 0.0f) {
                            abstractC3208b.visible(false);
                        } else {
                            abstractC3208b.visible(true);
                        }
                        c3184a.f10384r = false;
                        m3267a(abstractC3208b, c3184a, i2 % i, f7);
                    } else if (c3184a.f10374h + f7 < C3145b.f10241l.f10442v) {
                        if (c3184a.f10384r) {
                            m3267a(abstractC3208b, c3184a, i2 % i, f7);
                            abstractC3208b.visible(true);
                            c3184a.f10370d = 1.0f;
                            abstractC3208b.scale().f2526x = c3184a.f10370d;
                            abstractC3208b.scale().f2527y = c3184a.f10370d;
                        } else {
                            m3266a(abstractC3208b, c3184a, i2 % i, f7, C3145b.f10241l.f10442v - (c3184a.f10374h + f7));
                        }
                    } else {
                        c3184a.f10384r = false;
                        m3267a(abstractC3208b, c3184a, i2 % i, f7);
                        abstractC3208b.visible(true);
                        c3184a.f10370d = 1.0f;
                        abstractC3208b.scale().f2526x = c3184a.f10370d;
                        abstractC3208b.scale().f2527y = c3184a.f10370d;
                    }
                }
            }
            if (this.f10366q) {
                if (this.f10364o < this.f10363n) {
                    m3258e();
                } else {
                    m3257f();
                }
                if (this.f10364o > C3145b.f10241l.f10444x) {
                    m3264b();
                } else {
                    m3260c();
                }
            } else {
                if (f10350g || f10351h) {
                    m3252k();
                }
                m3260c();
                m3257f();
            }
            if (!this.f10357d) {
                this.f10357d = true;
                for (int i3 = 0; i3 < children().size(); i3++) {
                    AbstractC3208b abstractC3208b2 = (AbstractC3208b) children().get(i3);
                    C3184a c3184a2 = this.f10355b.get(i3);
                    if (!c3184a2.f10383q) {
                        float f8 = c3184a2.f10367a;
                        float f9 = c3184a2.f10368b;
                        abstractC3208b2.position().f2526x += (f8 - abstractC3208b2.position().f2526x) * 0.15f;
                        abstractC3208b2.position().f2527y += (f9 - abstractC3208b2.position().f2527y) * 0.15f;
                        abstractC3208b2.rotation().f2528z += (c3184a2.f10369c - abstractC3208b2.rotation().f2528z) * 0.15f;
                        Number3d scale = abstractC3208b2.scale();
                        Number3d scale2 = abstractC3208b2.scale();
                        float f10 = scale2.f2527y + ((c3184a2.f10370d - abstractC3208b2.scale().f2526x) * 0.15f);
                        scale2.f2527y = f10;
                        scale.f2526x = f10;
                        float m3156aJ = abstractC3208b2.m3156aJ();
                        abstractC3208b2.m3136g(m3156aJ + ((c3184a2.f10371e - m3156aJ) * 0.15f));
                        float alpha = abstractC3208b2.alpha();
                        abstractC3208b2.alpha(alpha + ((c3184a2.f10385s - alpha) * 0.15f));
                        if (Math.abs(abstractC3208b2.m3156aJ() - c3184a2.f10371e) < 0.2f && Math.abs(abstractC3208b2.alpha() - c3184a2.f10385s) < 0.2f && Math.abs(abstractC3208b2.position().f2526x - f8) < 0.2f && Math.abs(abstractC3208b2.position().f2527y - f9) < 0.2f && Math.abs(abstractC3208b2.scale().f2526x - c3184a2.f10370d) < 0.01f && Math.abs(abstractC3208b2.rotation().f2528z - c3184a2.f10369c) < 0.2f) {
                            abstractC3208b2.position().f2526x = f8;
                            abstractC3208b2.position().f2527y = f9;
                            abstractC3208b2.rotation().f2528z = c3184a2.f10369c;
                            Number3d scale3 = abstractC3208b2.scale();
                            Number3d scale4 = abstractC3208b2.scale();
                            float f11 = c3184a2.f10370d;
                            scale4.f2527y = f11;
                            scale3.f2526x = f11;
                            c3184a2.f10383q = true;
                            c3184a2.f10384r = false;
                            abstractC3208b2.alpha(c3184a2.f10385s);
                            abstractC3208b2.m3136g(c3184a2.f10371e);
                        }
                        if (abstractC3208b2.alpha() == 0.0f || (abstractC3208b2.scale().f2526x == 0.0f && abstractC3208b2.scale().f2527y == 0.0f)) {
                            abstractC3208b2.visible(false);
                        } else {
                            abstractC3208b2.visible(true);
                        }
                    }
                    this.f10357d = c3184a2.f10383q && this.f10357d;
                }
            }
            if (this.f10357d && this.f10360k && this.f10361l) {
                mouseEnabled(true);
                setAnimationObjectState(false);
            }
        }
    }

    /* renamed from: a */
    private void m3270a(C3184a c3184a, C0975i c0975i) {
        m3269a(c3184a, c0975i, this.f10355b.size() - 1);
    }

    /* renamed from: a */
    private void m3269a(C3184a c3184a, C0975i c0975i, int i) {
        ThemeFolderDescription.SystemFolderChild systemFolderChild;
        int m3253j = m3253j();
        int i2 = C3145b.f10241l.f10423c;
        ArrayList<ThemeFolderDescription.SystemFolderChild> arrayList = C3145b.f10241l.m3224c().folder.sampleList;
        Number3d m3327d = this.f10354a.m3327d(i);
        float f = m3327d.f2526x;
        c3184a.f10375i = f;
        c3184a.f10373g = f;
        c3184a.f10367a = f;
        float f2 = m3327d.f2527y;
        c3184a.f10376j = f2;
        c3184a.f10374h = f2;
        c3184a.f10368b = f2;
        c3184a.f10382p = 1.0f;
        c3184a.f10378l = 1.0f;
        c3184a.f10370d = 1.0f;
        c3184a.f10381o = 0.0f;
        c3184a.f10377k = 0.0f;
        c3184a.f10369c = 0.0f;
        c3184a.f10385s = 255.0f;
        c3184a.f10371e = 1.0f;
        c3184a.f10383q = true;
        AbstractC3208b abstractC3208b = (AbstractC3208b) c0975i;
        if (i > (m3253j * C3145b.f10241l.f10421a) + (i2 - 1) && abstractC3208b.m3157aI()) {
            int i3 = i - i2;
            if (i3 < arrayList.size()) {
                systemFolderChild = arrayList.get(i3);
            } else {
                systemFolderChild = arrayList.get(i3 % arrayList.size());
                c3184a.f10385s = 0.0f;
            }
            c3184a.f10372f = ((C3145b.f10241l.f10421a - (i % C3145b.f10241l.f10421a)) - 1) * (0.5f / (C3145b.f10241l.f10421a - 1));
            c3184a.f10379m = c3184a.f10373g;
            c3184a.f10380n = C3145b.f10241l.f10443w;
            c3184a.f10381o = 0.0f;
            c3184a.f10382p = 1.0f;
            float f3 = systemFolderChild.position.f2526x;
            c3184a.f10367a = f3;
            c3184a.f10375i = f3;
            float f4 = systemFolderChild.position.f2527y;
            c3184a.f10368b = f4;
            c3184a.f10376j = f4;
            float f5 = systemFolderChild.scale.f2526x;
            c3184a.f10370d = f5;
            c3184a.f10378l = f5;
            float f6 = systemFolderChild.rotation.f2528z;
            c3184a.f10377k = f6;
            c3184a.f10369c = f6;
            c3184a.f10371e = 0.0f;
            abstractC3208b.mouseEnabled(false);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public void addChild(C0975i c0975i) {
        C3184a m3243y = m3243y();
        this.f10355b.add(0, m3243y);
        super.addChild(c0975i);
        m3270a(m3243y, c0975i);
        m3245w();
        m3244x();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void addChildAt(C0975i c0975i, int i) {
        C3184a m3243y = m3243y();
        this.f10355b.add(0, m3243y);
        super.addChildAt(c0975i, i);
        m3270a(m3243y, getChildAt(0));
        m3245w();
        m3248o();
        m3244x();
    }

    /* renamed from: x */
    private void m3244x() {
        if (this.f10358e) {
            C3145b.f10241l.m3232a(numChildren());
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public boolean removeChild(C0975i c0975i) {
        boolean removeChild = super.removeChild(c0975i);
        if (removeChild) {
            m3271a(this.f10355b.remove(0));
            m3245w();
            m3248o();
            m3244x();
        }
        return removeChild;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public C0975i removeChildAt(int i) {
        C0975i removeChildAt = super.removeChildAt(i);
        if (removeChildAt != null) {
            m3271a(this.f10355b.remove(0));
            m3245w();
            m3248o();
            m3244x();
        }
        return removeChildAt;
    }

    /* renamed from: y */
    private C3184a m3243y() {
        if (this.f10356c.isEmpty()) {
            return new C3184a();
        }
        C3184a remove = this.f10356c.remove(0);
        remove.m3242a();
        return remove;
    }

    /* renamed from: a */
    private void m3271a(C3184a c3184a) {
        this.f10356c.add(c3184a);
    }

    /* renamed from: com.tsf.shell.f.i.b.d.g$a */
    /* loaded from: classes.dex */
    public class C3184a {

        /* renamed from: f */
        public float f10372f;

        /* renamed from: a */
        public float f10367a = 0.0f;

        /* renamed from: b */
        public float f10368b = 0.0f;

        /* renamed from: c */
        public float f10369c = 0.0f;

        /* renamed from: d */
        public float f10370d = 1.0f;

        /* renamed from: e */
        public float f10371e = 1.0f;

        /* renamed from: g */
        public float f10373g = 0.0f;

        /* renamed from: h */
        public float f10374h = 0.0f;

        /* renamed from: i */
        public float f10375i = 0.0f;

        /* renamed from: j */
        public float f10376j = 0.0f;

        /* renamed from: k */
        public float f10377k = 0.0f;

        /* renamed from: l */
        public float f10378l = 0.0f;

        /* renamed from: m */
        public float f10379m = 0.0f;

        /* renamed from: n */
        public float f10380n = 0.0f;

        /* renamed from: o */
        public float f10381o = 0.0f;

        /* renamed from: p */
        public float f10382p = 0.0f;

        /* renamed from: q */
        public boolean f10383q = false;

        /* renamed from: r */
        public boolean f10384r = false;

        /* renamed from: s */
        public float f10385s = 255.0f;

        public C3184a() {
        }

        /* renamed from: a */
        public void m3242a() {
            this.f10367a = 0.0f;
            this.f10368b = 0.0f;
            this.f10370d = 1.0f;
            this.f10385s = 255.0f;
            this.f10383q = false;
        }
    }
}
