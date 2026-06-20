package com.tsf.shell.f.c.b;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.shell.f.c.b.a.IDrawerSettingsCallback;
import com.tsf.shell.ShellGraphicsContext;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerSettingsItemType extends DrawerItemLayout implements com.tsf.shell.f.i.MultiSelectController.InterfaceC0113a {
    private e a;
    private i d;
    private ArrayList<b> e;
    private ArrayList<b> f;
    private com.tsf.shell.f.i.b.d.FolderShortcutItem j;
    private Runnable l;
    private int n;
    private boolean g = true;
    private Number3d h = new Number3d();
    private Number3d i = new Number3d();
    private boolean k = false;
    private int m = -1;
    private A c = this;
    private com.tsf.shell.f.i.MultiSelectController b = new com.tsf.shell.f.i.MultiSelectController(this, this) { // from class: com.tsf.shell.f.c.b.a.1
        @Override // com.tsf.shell.f.i.MultiSelectController
        public void a(com.tsf.shell.f.i.PageItem bVar) {
            bVar.f(a.this.c);
        }
    };

    public DrawerSettingsItemType(e eVar, float f, float f2, int i) {
        float f3 = 128.0f;
        this.n = 0;
        this.a = eVar;
        this.n = i;
        this.d = new GridRenderable(f3, f3) { // from class: com.tsf.shell.f.c.b.a.2
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void visible(Boolean bool) {
                super.visible(false);
            }
        };
        this.d.visible(false);
        this.e = new ArrayList<>();
        this.f = new ArrayList<>();
    }

    public int c() {
        return this.n;
    }

    @Override // com.tsf.shell.f.i.a.InterfaceC0113a
    public ArrayList<i> b() {
        return children();
    }

    public void e() {
    }

    @Override // com.tsf.shell.f.c.b.DrawerItemLayout, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public boolean a() {
        return this.a.j();
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderableContainer
    public void addChild(i iVar) {
        this.e.add(j());
        super.addChild(iVar);
        DrawerSettingsItemType();
        DrawerSettingsItemType();
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable
    public void addChildAt(i iVar, int i) {
        this.e.add(j());
        super.addChildAt(iVar, i);
        DrawerSettingsItemType();
        DrawerSettingsItemType();
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderableContainer
    public boolean removeChild(i iVar) {
        boolean zRemoveChild = super.removeChild(iVar);
        DrawerSettingsItemType();
        if (zRemoveChild) {
            a(this.e.remove(0));
            DrawerSettingsItemType();
            DrawerSettingsItemType();
            if (iVar instanceof com.tsf.shell.f.i.PageItem) {
                ((com.tsf.shell.f.i.PageItem) iVar).c = false;
                ((com.tsf.shell.f.i.PageItem) iVar).B();
            }
            if (iVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) {
                ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) iVar).aM();
            } else if (iVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
                ((com.tsf.shell.f.i.b.d.FolderShortcutItem) iVar).aM();
            }
        }
        return zRemoveChild;
    }

    private b j() {
        if (this.f.isEmpty()) {
            return new DrawerSettingsData();
        }
        b bVarRemove = this.f.remove(0);
        bVarRemove.a();
        return bVarRemove;
    }

    private void a(b bVar) {
        this.f.add(bVar);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        if (!this.g) {
            this.g = true;
            for (int i = 0; i < children().size(); i++) {
                i iVar = children().get(i);
                b bVar = this.e.get(i);
                if (!bVar.j) {
                    float f = iVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem ? bVar.c : bVar.a;
                    float f2 = iVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem ? bVar.d : bVar.b;
                    iVar.position().x += (f - iVar.position().x) * 0.15f;
                    iVar.position().y += (f2 - iVar.position().y) * 0.15f;
                    iVar.rotation().z += (bVar.e - iVar.rotation().z) * 0.15f;
                    Number3d number3dScale = iVar.scale();
                    Number3d number3dScale2 = iVar.scale();
                    float f3 = number3dScale2.y + ((bVar.f - iVar.scale().x) * 0.15f);
                    number3dScale2.y = f3;
                    number3dScale.x = f3;
                    float fAlpha = iVar.alpha();
                    iVar.alpha(fAlpha + ((bVar.k - fAlpha) * 0.15f));
                    if (Math.abs(iVar.alpha() - bVar.k) < 0.2f && Math.abs(iVar.position().x - f) < 0.2f && Math.abs(iVar.position().y - f2) < 0.2f && Math.abs(iVar.scale().x - bVar.f) < 0.01f && Math.abs(iVar.rotation().z - bVar.e) < 0.2f) {
                        iVar.position().x = f;
                        iVar.position().y = f2;
                        iVar.rotation().z = bVar.e;
                        Number3d number3dScale3 = iVar.scale();
                        Number3d number3dScale4 = iVar.scale();
                        float f4 = bVar.f;
                        number3dScale4.y = f4;
                        number3dScale3.x = f4;
                        bVar.j = true;
                        iVar.alpha(bVar.k);
                    }
                    if (iVar.alpha() == 0.0f) {
                        iVar.visible(false);
                    } else {
                        iVar.visible(true);
                    }
                }
                this.g = bVar.j && this.g;
            }
            if (this.g) {
                setAnimationObjectState(false);
            }
        }
    }

    @Override // com.tsf.shell.f.c.b.DrawerItemLayout, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        com.tsf.shell.f.i.PageItem bVar = (com.tsf.shell.f.i.PageItem) fVar;
        a(bVar);
        this.d.setAABBPX(bVar.minX(), bVar.minY(), bVar.minZ(), bVar.maxX(), bVar.maxY(), bVar.maxZ());
    }

    public boolean a(int i) {
        int iA = this.a.h().a();
        int iNumChildren = numChildren();
        if (children().contains(this.d)) {
            iNumChildren--;
        }
        return iNumChildren + i <= iA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    @Override // com.tsf.shell.f.c.b.DrawerItemLayout, com.tsf.shell.f.e.SelectionFrameLayoutItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.tsf.shell.f.e.SelectionFrameLayoutItem r7, float r8, float r9) {
        /*
            r6 = this;
            r1 = 1
            r2 = 0
            r5 = -1
            r0 = r7
            com.censivn.C3DEngine.b.f.IRenderable r0 = (com.censivn.C3DEngine.b.f.IRenderable) r0
            com.tsf.shell.f.c.b.a.IDrawerSettingsCallback$b r3 = r6.b(r0)
            boolean r0 = r7 instanceof com.tsf.shell.f.i.ShortcutItem
            if (r0 == 0) goto L22
            int r0 = r6.m
            int r4 = r3.a
            if (r0 == r4) goto L18
            int r0 = r6.m
            if (r0 != r5) goto L24
        L18:
            int r0 = r3.b
            com.censivn.C3DEngine.api.element.Number3d r4 = r6.h
            boolean r0 = r6.a(r0, r7, r4)
            if (r0 == 0) goto L24
        L22:
            r1 = r2
        L23:
            return r1
        L24:
            com.tsf.shell.f.i.b.d.FolderShortcutItem r0 = r6.j
            if (r0 == 0) goto L2b
            r6.i(r7)
        L2b:
            boolean r0 = r7 instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase
            if (r0 == 0) goto L6c
            com.tsf.shell.f.i.b.e.DrawerShortcutItemBase r7 = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) r7
            boolean r0 = r7.as()
            if (r0 == 0) goto L6c
            int r0 = r7.at()
            int r0 = r0 + r1
        L3c:
            boolean r0 = r6.a(r0)
            if (r0 == 0) goto L23
            int r0 = r6.m
            if (r0 != r5) goto L51
            int r0 = r3.a
            r6.m = r0
            com.censivn.C3DEngine.b.f.IRenderable r0 = r6.d
            int r1 = r6.m
            r6.addChildAt(r0, r1)
        L51:
            int r0 = r6.m
            int r1 = r3.a
            if (r0 == r1) goto L6a
            int r0 = r3.a
            r6.m = r0
            com.censivn.C3DEngine.b.f.IRenderable r0 = r6.d
            r0.removeFromParent()
            com.censivn.C3DEngine.b.f.IRenderable r0 = r6.d
            int r1 = r3.a
            r6.addChildAt(r0, r1)
            r6.g()
        L6a:
            r1 = r2
            goto L23
        L6c:
            r0 = r1
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.c.b.a.IDrawerSettingsCallback(com.tsf.shell.f.e.SelectionFrameLayoutItem, float, float):boolean");
    }

    @Override // com.tsf.shell.f.c.b.DrawerItemLayout, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public void c(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
    }

    @Override // com.tsf.shell.f.c.b.DrawerItemLayout, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        if (this.j != null) {
            i(fVar);
        }
        b((com.tsf.shell.f.i.PageItem) fVar);
        if (this.d.parent() != null) {
            removeChild(this.d);
        }
        this.m = -1;
    }

    @Override // com.tsf.shell.f.c.b.DrawerItemLayout, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        return fVar instanceof com.tsf.shell.f.i.ShortcutItem;
    }

    @Override // com.tsf.shell.f.c.b.DrawerItemLayout, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        boolean zB;
        com.tsf.shell.f.i.PageItem bVar = (com.tsf.shell.f.i.PageItem) fVar;
        if (this.j != null) {
            zB = this.j.b(fVar);
            if (zB) {
                this.j.e(fVar);
            }
            this.j = null;
            if (zB) {
                removeChild(this.d);
            }
        } else {
            zB = false;
        }
        if (!zB) {
            com.censivn.C3DEngine.b.g.c.a(bVar);
            globalToLocal(bVar.position());
            bVar.removeFromParent();
            bVar.clearDefaultColor();
            super.removeChild(this.d);
            if (this.m < 0) {
                this.m = 0;
            } else if (this.m > children().size()) {
                this.m = children().size();
            }
            super.addChildAt(bVar, this.m);
            a(bVar, true);
            if (bVar instanceof com.tsf.shell.f.i.ShortcutItem) {
                com.tsf.shell.f.i.ShortcutItem cVar = (com.tsf.shell.f.i.ShortcutItem) bVar;
                if (cVar.as()) {
                    Iterator<com.tsf.shell.f.i.ShortcutItem> it = cVar.av().iterator();
                    while (it.hasNext()) {
                        a(it.next(), true);
                    }
                    cVar.ay();
                }
            }
            DrawerSettingsItemType();
            DrawerSettingsItemType();
        }
        this.m = -1;
    }

    public void f() {
        for (int i = 0; i < children().size(); i++) {
            i iVar = children().get(i);
            b bVar = this.e.get(i);
            bVar.j = true;
            iVar.position().x = bVar.a;
            iVar.position().y = bVar.b;
            iVar.rotation().z = bVar.e;
            Number3d number3dScale = iVar.scale();
            Number3d number3dScale2 = iVar.scale();
            float f = bVar.f;
            number3dScale2.y = f;
            number3dScale.x = f;
            iVar.alpha(bVar.k);
        }
        this.g = true;
        setAnimationObjectState(false);
    }

    public void g() {
        DrawerSettingsItemType();
        this.g = false;
        setAnimationObjectState(true);
        invalidate();
    }

    public void h() {
        this.a.h().a(this.e, children().size());
    }

    private boolean a(int i, com.tsf.shell.f.e.SelectionFrameLayoutItem fVar, Number3d number3d) {
        return i >= 0 && numChildren() != 0 && i <= numChildren() + (-1) && a(getChildAt(i), fVar, number3d.x, number3d.y);
    }

    private boolean a(i iVar, com.tsf.shell.f.e.SelectionFrameLayoutItem fVar, float f, float f2) {
        if ((fVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) || !(iVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) || !iVar.calTouchCollision(f, f2)) {
            return false;
        }
        com.tsf.shell.f.i.b.d.FolderShortcutItem bVar = (com.tsf.shell.f.i.b.d.FolderShortcutItem) iVar;
        if (this.j == null) {
            this.j = bVar;
            b((com.tsf.shell.f.i.PageItem) fVar);
            this.j.a(fVar);
        }
        this.j.f(fVar);
        return true;
    }

    private void i(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        this.j.d(fVar);
        this.j = null;
        a((com.tsf.shell.f.i.PageItem) fVar);
    }

    public void i() {
        if (!this.a.e()) {
            if (this.l == null) {
                DrawerSettingsItemType();
            }
            if (!this.k) {
                this.k = true;
                com.censivn.C3DEngine.C3DEngine.a().c(this.l);
            }
        }
    }

    private void k() {
        this.l = new Runnable() { // from class: com.tsf.shell.f.c.b.a.3
            @Override // java.lang.Runnable
            public void run() {
                a.this.k = false;
                final String str = "";
                for (i iVar : a.this.children()) {
                    str = iVar instanceof com.tsf.shell.f.i.PageItem ? str + ((com.tsf.shell.f.i.PageItem) iVar).K().id + "," : str;
                }
                com.censivn.C3DEngine.C3DEngine.a().e(new Runnable() { // from class: com.tsf.shell.f.c.b.a.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ContentResolver contentResolver = com.censivn.C3DEngine.C3DEngine.d().getContentResolver();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("child", str);
                        contentResolver.update(ContentUris.withAppendedId(g.d.a, a.this.n + 1), contentValues, null, null);
                        contentValues.clear();
                    }
                });
            }
        };
    }

    public void a(com.tsf.shell.f.i.PageItem bVar, boolean z) {
        bVar.a(this.b);
        bVar.c = true;
        if (bVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) {
            com.censivn.C3DEngine.b.g.c.a(((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) bVar).k);
            ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) bVar).aL();
        } else if (bVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
            ((com.tsf.shell.f.i.b.d.FolderShortcutItem) bVar).aL();
        }
        if (!this.a.e() && z) {
            bVar.K().onUpdateContainer(-3);
        }
    }

    private com.tsf.shell.f.c.b.a.IDrawerSettingsCallback.b b(i iVar) {
        this.h.reset();
        iVar.localToGlobal(this.h);
        return a(this.h.x, this.h.y);
    }

    private com.tsf.shell.f.c.b.a.IDrawerSettingsCallback.b a(float f, float f2) {
        this.h.setAll(f, f2, 0.0f);
        this.i.setAllFrom(this.h);
        globalToLocal(this.i);
        this.a.h().a(this.h);
        if (children().size() != 0) {
            return this.a.h().a(this.i, this.e, this.m);
        }
        a.b.c.a = 0;
        return a.b.c;
    }

    private void a(com.tsf.shell.f.i.PageItem bVar) {
    }

    private void b(com.tsf.shell.f.i.PageItem bVar) {
    }

    public b a(i iVar) {
        int iIndexOf = children().indexOf(iVar);
        if (iIndexOf == -1) {
            return null;
        }
        return this.e.get(iIndexOf);
    }
}
