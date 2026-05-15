package com.censivn.C3DEngine.b.f;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends j {
    private static com.tsf.shell.f.e.d<Number3d> a;
    private ArrayList<Number3d> b = new ArrayList<>();
    private Number3d c = new Number3d();
    private Number3d d = new Number3d();
    private Number3d e = new Number3d();

    public b() {
        if (a == null) {
            a = new com.tsf.shell.f.e.d<Number3d>() { // from class: com.censivn.C3DEngine.b.f.b.1
                @Override // com.tsf.shell.f.e.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
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
                a(this.b.get(i), i);
                i++;
            }
        }
    }

    public Number3d b(int i) {
        return this.b.get(i);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public void addChild(i iVar) {
        children().add(iVar);
        invalidate();
        Number3d number3dC = a.c();
        this.b.add(number3dC);
        a(number3dC, numChildren() - 1);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void addChildAt(i iVar, int i) {
        children().add(i, iVar);
        invalidate();
        this.b.add(i, a.c());
        a(i);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public boolean removeChild(i iVar) {
        int iIndexOf = children().indexOf(iVar);
        if (iIndexOf == -1) {
            return false;
        }
        children().remove(iIndexOf);
        a.a(this.b.remove(iIndexOf));
        a(iIndexOf);
        invalidate();
        return true;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public i removeChildAt(int i) {
        i iVarRemove = children().remove(i);
        a.a(this.b.remove(i));
        a(i);
        invalidate();
        return iVarRemove;
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
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
                    i iVar = children().get(i);
                    onDrawChildStart(iVar);
                    this.c.setAllFrom(iVar.position());
                    this.d.setAllFrom(iVar.rotation());
                    this.e.setAllFrom(iVar.scale());
                    float fAlpha = iVar.alpha();
                    boolean zVisible = iVar.visible();
                    iVar.alpha(255.0f);
                    iVar.visible(true);
                    iVar.position().setAllFrom(this.b.get(i));
                    iVar.rotation().reset();
                    iVar.scale().setAll(1.0f, 1.0f, 1.0f);
                    iVar.dispatchDraw();
                    iVar.position().setAllFrom(this.c);
                    iVar.rotation().setAllFrom(this.d);
                    iVar.scale().setAllFrom(this.e);
                    iVar.alpha(fAlpha);
                    iVar.visible(Boolean.valueOf(zVisible));
                    onDrawChildEnd(iVar);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }
}
