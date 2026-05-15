package com.censivn.C3DEngine.b.f;

import com.censivn.C3DEngine.api.element.FacesBufferedList;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureList;
import com.censivn.C3DEngine.api.element.Vertices;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class j extends i implements f {
    private static Number3d mTempdisplaceNumber3d = new Number3d();
    private boolean isRenderChildren;
    private ArrayList<i> mChildren;

    public j() {
        super(0, 0, false, false, false);
        this.mChildren = new ArrayList<>();
        this.isRenderChildren = true;
        useVBO(false);
    }

    public j(int i, int i2) {
        super(i, i2, true, true, false);
        this.mChildren = new ArrayList<>();
        this.isRenderChildren = true;
    }

    public j(int i, int i2, Boolean bool, Boolean bool2, Boolean bool3) {
        super(i, i2, bool, bool2, bool3);
        this.mChildren = new ArrayList<>();
        this.isRenderChildren = true;
    }

    public j(Vertices vertices, FacesBufferedList facesBufferedList, TextureList textureList) {
        super(vertices, facesBufferedList, textureList);
        this.mChildren = new ArrayList<>();
        this.isRenderChildren = true;
    }

    public void addChild(i iVar) {
        if (iVar.parent() != null) {
            com.tsf.shell.utils.l.a(this, "addChild error , target parent is not null :" + iVar.parent());
        }
        this.mChildren.add(iVar);
        iVar.parent(this);
        invalidate();
    }

    public void addChildAt(i iVar, int i) {
        this.mChildren.add(i, iVar);
        iVar.parent(this);
        invalidate();
    }

    public void replaceChild(i iVar, i iVar2) {
        int iIndexOf = this.mChildren.indexOf(iVar);
        if (iIndexOf == -1) {
            com.tsf.shell.utils.l.a(this, "replaceChild error , target is not exist :" + iVar + "   container:" + this);
        }
        this.mChildren.set(iIndexOf, iVar2);
        iVar2.parent(this);
        iVar2.position().setAllFrom(iVar.position());
        iVar2.rotation().setAllFrom(iVar.rotation());
        iVar2.scale().setAllFrom(iVar.scale());
        iVar.parent(null);
        invalidate();
    }

    public boolean removeChild(i iVar) {
        boolean zRemove = this.mChildren.remove(iVar);
        if (zRemove) {
            iVar.parent(null);
        }
        invalidate();
        return zRemove;
    }

    public i removeChildAt(int i) {
        i iVarRemove = this.mChildren.remove(i);
        if (iVarRemove != null) {
            iVarRemove.parent(null);
        }
        invalidate();
        return iVarRemove;
    }

    @Override // com.censivn.C3DEngine.b.f.f
    public i getChildAt(int i) {
        return this.mChildren.get(i);
    }

    public i getChildByName(String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.mChildren.size()) {
                if (!this.mChildren.get(i2).name().equals(str)) {
                    i = i2 + 1;
                } else {
                    return this.mChildren.get(i2);
                }
            } else {
                return null;
            }
        }
    }

    public int getChildIndexOf(i iVar) {
        return this.mChildren.indexOf(iVar);
    }

    @Override // com.censivn.C3DEngine.b.f.f
    public int numChildren() {
        return this.mChildren.size();
    }

    public boolean containsChild(i iVar) {
        return this.mChildren.contains(iVar);
    }

    public void renderChildren(boolean z) {
        this.isRenderChildren = z;
    }

    public boolean renderChildren() {
        return this.isRenderChildren;
    }

    public ArrayList<i> children() {
        return this.mChildren;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public j m9clone() {
        j jVar = new j(this.mVertices.m8clone(), this.mFaces.m3clone(), this.mTextures);
        jVar.position().x = position().x;
        jVar.position().y = position().y;
        jVar.position().z = position().z;
        jVar.rotation().x = rotation().x;
        jVar.rotation().y = rotation().y;
        jVar.rotation().z = rotation().z;
        jVar.scale().x = scale().x;
        jVar.scale().y = scale().y;
        jVar.scale().z = scale().z;
        for (int i = 0; i < numChildren(); i++) {
            jVar.addChild(getChildAt(i));
        }
        return jVar;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void destroy() {
        for (int i = 0; i < numChildren(); i++) {
            getChildAt(i).destroy();
        }
        super.destroy();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void drawQuietly() {
        if (visible()) {
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            if (renderChildren()) {
                int size = this.mChildren.size();
                for (int i = 0; i < size; i++) {
                    this.mChildren.get(i).dispatchDraw();
                }
            }
            MatrixStack.glPopMatrix();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
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
                    i iVar = this.mChildren.get(i);
                    onDrawChildStart(iVar);
                    iVar.dispatchDraw();
                    onDrawChildEnd(iVar);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
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
                    i iVar = this.mChildren.get(i);
                    onDrawChildStart(iVar);
                    iVar.dispatchDraw();
                    onDrawChildEnd(iVar);
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

    public void onDrawChildStart(i iVar) {
    }

    public void onDrawChildEnd(i iVar) {
    }
}
