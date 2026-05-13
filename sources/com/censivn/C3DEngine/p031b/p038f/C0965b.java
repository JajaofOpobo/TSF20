package com.censivn.C3DEngine.p031b.p038f;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.p096f.p118e.C2502d;
import java.util.ArrayList;
/* renamed from: com.censivn.C3DEngine.b.f.b */
/* loaded from: classes.dex */
public class C0965b extends C0980j {

    /* renamed from: a */
    private static C2502d<Number3d> f2867a;

    /* renamed from: b */
    private ArrayList<Number3d> f2868b = new ArrayList<>();

    /* renamed from: c */
    private Number3d f2869c = new Number3d();

    /* renamed from: d */
    private Number3d f2870d = new Number3d();

    /* renamed from: e */
    private Number3d f2871e = new Number3d();

    public C0965b() {
        if (f2867a == null) {
            f2867a = new C2502d<Number3d>() { // from class: com.censivn.C3DEngine.b.f.b.1
                @Override // com.tsf.shell.p096f.p118e.C2502d
                /* renamed from: a */
                public Number3d mo718b() {
                    return new Number3d();
                }
            };
        }
    }

    /* renamed from: a */
    public void mo4950a(Number3d number3d, int i) {
    }

    /* renamed from: a */
    public void m10395a(int i) {
        if (i < this.f2868b.size()) {
            while (i < this.f2868b.size()) {
                mo4950a(this.f2868b.get(i), i);
                i++;
            }
        }
    }

    /* renamed from: b */
    public Number3d m10394b(int i) {
        return this.f2868b.get(i);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public void addChild(C0975i c0975i) {
        children().add(c0975i);
        invalidate();
        Number3d m5383c = f2867a.m5383c();
        this.f2868b.add(m5383c);
        mo4950a(m5383c, numChildren() - 1);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void addChildAt(C0975i c0975i, int i) {
        children().add(i, c0975i);
        invalidate();
        this.f2868b.add(i, f2867a.m5383c());
        m10395a(i);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public boolean removeChild(C0975i c0975i) {
        int indexOf = children().indexOf(c0975i);
        if (indexOf != -1) {
            children().remove(indexOf);
            f2867a.m5384a(this.f2868b.remove(indexOf));
            m10395a(indexOf);
            invalidate();
            return true;
        }
        return false;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public C0975i removeChildAt(int i) {
        C0975i remove = children().remove(i);
        f2867a.m5384a(this.f2868b.remove(i));
        m10395a(i);
        invalidate();
        return remove;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void dispatchDraw() {
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                int size = children().size();
                for (int i = 0; i < size; i++) {
                    C0975i c0975i = children().get(i);
                    onDrawChildStart(c0975i);
                    this.f2869c.setAllFrom(c0975i.position());
                    this.f2870d.setAllFrom(c0975i.rotation());
                    this.f2871e.setAllFrom(c0975i.scale());
                    float alpha = c0975i.alpha();
                    boolean visible = c0975i.visible();
                    c0975i.alpha(255.0f);
                    c0975i.visible(true);
                    c0975i.position().setAllFrom(this.f2868b.get(i));
                    c0975i.rotation().reset();
                    c0975i.scale().setAll(1.0f, 1.0f, 1.0f);
                    c0975i.dispatchDraw();
                    c0975i.position().setAllFrom(this.f2869c);
                    c0975i.rotation().setAllFrom(this.f2870d);
                    c0975i.scale().setAllFrom(this.f2871e);
                    c0975i.alpha(alpha);
                    c0975i.visible(Boolean.valueOf(visible));
                    onDrawChildEnd(c0975i);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }
}
