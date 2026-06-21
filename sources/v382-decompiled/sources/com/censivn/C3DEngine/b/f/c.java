package com.censivn.C3DEngine.b.f;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends l {
    private static com.tsf.shell.e.e.e a;
    private ArrayList b = new ArrayList();
    private Number3d c = new Number3d();
    private Number3d d = new Number3d();
    private Number3d e = new Number3d();

    public c() {
        if (a == null) {
            a = new com.tsf.shell.e.e.e() { // from class: com.censivn.C3DEngine.b.f.c.1
                @Override // com.tsf.shell.e.e.e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Number3d b() {
                    return new Number3d();
                }
            };
        }
    }

    public void a(Number3d number3d, int i) {
    }

    public void a(int i) {
        if (i < this.b.size()) {
            while (i < this.b.size()) {
                a((Number3d) this.b.get(i), i);
                i++;
            }
        }
    }

    public Number3d b(int i) {
        return (Number3d) this.b.get(i);
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public void addChild(j jVar) {
        children().add(jVar);
        invalidate();
        Number3d number3d = (Number3d) a.c();
        this.b.add(number3d);
        a(number3d, numChildren() - 1);
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void addChildAt(j jVar, int i) {
        children().add(i, jVar);
        invalidate();
        this.b.add(i, (Number3d) a.c());
        a(i);
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public boolean removeChild(j jVar) {
        int indexOf = children().indexOf(jVar);
        if (indexOf == -1) {
            return false;
        }
        children().remove(indexOf);
        a.a((Number3d) this.b.remove(indexOf));
        a(indexOf);
        invalidate();
        return true;
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public j removeChildAt(int i) {
        j jVar = (j) children().remove(i);
        a.a((Number3d) this.b.remove(i));
        a(i);
        invalidate();
        return jVar;
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
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
                    j jVar = (j) children().get(i);
                    onDrawChildStart(jVar);
                    this.c.setAllFrom(jVar.position());
                    this.d.setAllFrom(jVar.rotation());
                    this.e.setAllFrom(jVar.scale());
                    float alpha = jVar.alpha();
                    boolean visible = jVar.visible();
                    jVar.alpha(255.0f);
                    jVar.visible(true);
                    jVar.position().setAllFrom((Number3d) this.b.get(i));
                    jVar.rotation().reset();
                    jVar.scale().setAll(1.0f, 1.0f, 1.0f);
                    jVar.dispatchDraw();
                    jVar.position().setAllFrom(this.c);
                    jVar.rotation().setAllFrom(this.d);
                    jVar.scale().setAllFrom(this.e);
                    jVar.alpha(alpha);
                    jVar.visible(Boolean.valueOf(visible));
                    onDrawChildEnd(jVar);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }
}
