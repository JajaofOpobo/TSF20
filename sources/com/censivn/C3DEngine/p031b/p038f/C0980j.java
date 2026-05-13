package com.censivn.C3DEngine.p031b.p038f;

import com.censivn.C3DEngine.api.element.FacesBufferedList;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureList;
import com.censivn.C3DEngine.api.element.Vertices;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.utils.C4176l;
import java.util.ArrayList;
/* renamed from: com.censivn.C3DEngine.b.f.j */
/* loaded from: classes.dex */
public class C0980j extends C0975i implements InterfaceC0972f {
    private static Number3d mTempdisplaceNumber3d = new Number3d();
    private boolean isRenderChildren;
    private ArrayList<C0975i> mChildren;

    public C0980j() {
        super(0, 0, false, false, false);
        this.mChildren = new ArrayList<>();
        this.isRenderChildren = true;
        useVBO(false);
    }

    public C0980j(int i, int i2) {
        super(i, i2, true, true, false);
        this.mChildren = new ArrayList<>();
        this.isRenderChildren = true;
    }

    public C0980j(int i, int i2, Boolean bool, Boolean bool2, Boolean bool3) {
        super(i, i2, bool, bool2, bool3);
        this.mChildren = new ArrayList<>();
        this.isRenderChildren = true;
    }

    public C0980j(Vertices vertices, FacesBufferedList facesBufferedList, TextureList textureList) {
        super(vertices, facesBufferedList, textureList);
        this.mChildren = new ArrayList<>();
        this.isRenderChildren = true;
    }

    public void addChild(C0975i c0975i) {
        if (c0975i.parent() != null) {
            C4176l.m668a(this, "addChild error , target parent is not null :" + c0975i.parent());
        }
        this.mChildren.add(c0975i);
        c0975i.parent(this);
        invalidate();
    }

    public void addChildAt(C0975i c0975i, int i) {
        this.mChildren.add(i, c0975i);
        c0975i.parent(this);
        invalidate();
    }

    public void replaceChild(C0975i c0975i, C0975i c0975i2) {
        int indexOf = this.mChildren.indexOf(c0975i);
        if (indexOf == -1) {
            C4176l.m668a(this, "replaceChild error , target is not exist :" + c0975i + "   container:" + this);
        }
        this.mChildren.set(indexOf, c0975i2);
        c0975i2.parent(this);
        c0975i2.position().setAllFrom(c0975i.position());
        c0975i2.rotation().setAllFrom(c0975i.rotation());
        c0975i2.scale().setAllFrom(c0975i.scale());
        c0975i.parent(null);
        invalidate();
    }

    public boolean removeChild(C0975i c0975i) {
        boolean remove = this.mChildren.remove(c0975i);
        if (remove) {
            c0975i.parent(null);
        }
        invalidate();
        return remove;
    }

    public C0975i removeChildAt(int i) {
        C0975i remove = this.mChildren.remove(i);
        if (remove != null) {
            remove.parent(null);
        }
        invalidate();
        return remove;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public C0975i getChildAt(int i) {
        return this.mChildren.get(i);
    }

    public C0975i getChildByName(String str) {
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

    public int getChildIndexOf(C0975i c0975i) {
        return this.mChildren.indexOf(c0975i);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public int numChildren() {
        return this.mChildren.size();
    }

    public boolean containsChild(C0975i c0975i) {
        return this.mChildren.contains(c0975i);
    }

    public void renderChildren(boolean z) {
        this.isRenderChildren = z;
    }

    public boolean renderChildren() {
        return this.isRenderChildren;
    }

    public ArrayList<C0975i> children() {
        return this.mChildren;
    }

    /* renamed from: clone */
    public C0980j m13951clone() {
        C0980j c0980j = new C0980j(this.mVertices.m13950clone(), this.mFaces.m13945clone(), this.mTextures);
        c0980j.position().f2526x = position().f2526x;
        c0980j.position().f2527y = position().f2527y;
        c0980j.position().f2528z = position().f2528z;
        c0980j.rotation().f2526x = rotation().f2526x;
        c0980j.rotation().f2527y = rotation().f2527y;
        c0980j.rotation().f2528z = rotation().f2528z;
        c0980j.scale().f2526x = scale().f2526x;
        c0980j.scale().f2527y = scale().f2527y;
        c0980j.scale().f2528z = scale().f2528z;
        for (int i = 0; i < numChildren(); i++) {
            c0980j.addChild(getChildAt(i));
        }
        return c0980j;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void destroy() {
        for (int i = 0; i < numChildren(); i++) {
            getChildAt(i).destroy();
        }
        super.destroy();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
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

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
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
                    C0975i c0975i = this.mChildren.get(i);
                    onDrawChildStart(c0975i);
                    c0975i.dispatchDraw();
                    onDrawChildEnd(c0975i);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
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
                    C0975i c0975i = this.mChildren.get(i);
                    onDrawChildStart(c0975i);
                    c0975i.dispatchDraw();
                    onDrawChildEnd(c0975i);
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

    public void onDrawChildStart(C0975i c0975i) {
    }

    public void onDrawChildEnd(C0975i c0975i) {
    }
}
