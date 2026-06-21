package com.censivn.C3DEngine.b.f;

import com.censivn.C3DEngine.api.element.FacesBufferedList;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureList;
import com.censivn.C3DEngine.api.element.Vertices;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class l extends j implements g {
    private static Number3d mTempdisplaceNumber3d = new Number3d();
    private boolean isRenderChildren;
    private ArrayList mChildren;

    public l() {
        super(0, 0, false, false, false);
        this.mChildren = new ArrayList();
        this.isRenderChildren = true;
        useVBO(false);
    }

    public l(int i, int i2) {
        super(i, i2, true, true, false);
        this.mChildren = new ArrayList();
        this.isRenderChildren = true;
    }

    public l(int i, int i2, Boolean bool, Boolean bool2, Boolean bool3) {
        super(i, i2, bool, bool2, bool3);
        this.mChildren = new ArrayList();
        this.isRenderChildren = true;
    }

    public l(Vertices vertices, FacesBufferedList facesBufferedList, TextureList textureList) {
        super(vertices, facesBufferedList, textureList);
        this.mChildren = new ArrayList();
        this.isRenderChildren = true;
    }

    public void addChild(j jVar) {
        if (jVar.parent() != null) {
            com.tsf.shell.utils.m.a(this, "addChild error , target parent is not null :" + jVar.parent());
        }
        this.mChildren.add(jVar);
        jVar.parent(this);
        invalidate();
    }

    public void addChildAt(j jVar, int i) {
        this.mChildren.add(i, jVar);
        jVar.parent(this);
        invalidate();
    }

    public void replaceChild(j jVar, j jVar2) {
        int indexOf = this.mChildren.indexOf(jVar);
        if (indexOf == -1) {
            com.tsf.shell.utils.m.a(this, "replaceChild error , target is not exist :" + jVar + "   container:" + this);
        }
        this.mChildren.set(indexOf, jVar2);
        jVar2.parent(this);
        jVar2.position().setAllFrom(jVar.position());
        jVar2.rotation().setAllFrom(jVar.rotation());
        jVar2.scale().setAllFrom(jVar.scale());
        jVar.parent(null);
        invalidate();
    }

    public boolean removeChild(j jVar) {
        boolean remove = this.mChildren.remove(jVar);
        if (remove) {
            jVar.parent(null);
        }
        invalidate();
        return remove;
    }

    public j removeChildAt(int i) {
        j jVar = (j) this.mChildren.remove(i);
        if (jVar != null) {
            jVar.parent(null);
        }
        invalidate();
        return jVar;
    }

    @Override // com.censivn.C3DEngine.b.f.g
    public j getChildAt(int i) {
        return (j) this.mChildren.get(i);
    }

    public j getChildByName(String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.mChildren.size()) {
                if (!((j) this.mChildren.get(i2)).name().equals(str)) {
                    i = i2 + 1;
                } else {
                    return (j) this.mChildren.get(i2);
                }
            } else {
                return null;
            }
        }
    }

    public int getChildIndexOf(j jVar) {
        return this.mChildren.indexOf(jVar);
    }

    @Override // com.censivn.C3DEngine.b.f.g
    public int numChildren() {
        return this.mChildren.size();
    }

    public boolean containsChild(j jVar) {
        return this.mChildren.contains(jVar);
    }

    public void renderChildren(boolean z) {
        this.isRenderChildren = z;
    }

    public boolean renderChildren() {
        return this.isRenderChildren;
    }

    public ArrayList children() {
        return this.mChildren;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public l m9clone() {
        l lVar = new l(this.mVertices.m8clone(), this.mFaces.m3clone(), this.mTextures);
        lVar.position().x = position().x;
        lVar.position().y = position().y;
        lVar.position().z = position().z;
        lVar.rotation().x = rotation().x;
        lVar.rotation().y = rotation().y;
        lVar.rotation().z = rotation().z;
        lVar.scale().x = scale().x;
        lVar.scale().y = scale().y;
        lVar.scale().z = scale().z;
        for (int i = 0; i < numChildren(); i++) {
            lVar.addChild(getChildAt(i));
        }
        return lVar;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void destroy() {
        for (int i = 0; i < numChildren(); i++) {
            getChildAt(i).destroy();
        }
        super.destroy();
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void drawQuietly() {
        if (visible()) {
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            if (renderChildren()) {
                int size = this.mChildren.size();
                for (int i = 0; i < size; i++) {
                    ((j) this.mChildren.get(i)).dispatchDraw();
                }
            }
            MatrixStack.glPopMatrix();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void superDispatchDraw() {
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                int size = this.mChildren.size();
                for (int i = 0; i < size; i++) {
                    j jVar = (j) this.mChildren.get(i);
                    onDrawChildStart(jVar);
                    jVar.dispatchDraw();
                    onDrawChildEnd(jVar);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void dispatchDraw() {
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                int size = this.mChildren.size();
                for (int i = 0; i < size; i++) {
                    j jVar = (j) this.mChildren.get(i);
                    onDrawChildStart(jVar);
                    jVar.dispatchDraw();
                    onDrawChildEnd(jVar);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }

    public void onDrawChildStart() {
    }

    public void onDrawChildEnd() {
    }

    public void onDrawChildStart(j jVar) {
    }

    public void onDrawChildEnd(j jVar) {
    }
}
