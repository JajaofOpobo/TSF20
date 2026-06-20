package com.tsf.shell.f.e;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.b;
import com.tsf.shell.f.i.PageItem;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlignmentOverlay {
    private static com.censivn.C3DEngine.b.f.BaseRenderable a;
    private static com.censivn.C3DEngine.b.f.GridRenderable b;
    private static com.censivn.C3DEngine.b.f.GridRenderable c;
    private static float d;
    private static TextureElement e;
    private static TextureElement f;
    private static TextureElement g;
    private static int h;
    private static int i;
    private static com.tsf.shell.f.i.PageItem j;
    private static com.censivn.C3DEngine.b.c.KeyboardHandler.a k;
    private static AlignmentResizeListener l;
    private static AlignmentBackKeyHandler m;
    private static com.tsf.shell.f.i.PageItem n;
    private static com.tsf.shell.f.i.PageItem o;
    private static ArrayList<com.censivn.C3DEngine.b.f.IRenderable> p;
    private static boolean q = false;

    public static void a() {
        l = new AlignmentResizeListener();
        m = new AlignmentBackKeyHandler();
        d = 25.0f * com.censivn.C3DEngine.b.b.ScreenConstants.a;
        k = new C0091a();
        Bitmap bitmapA = x.a(b.d.alignment_light);
        e = com.censivn.C3DEngine.C3DEngine.g().a(bitmapA, true);
        bitmapA.recycle();
        Bitmap bitmapA2 = x.a(b.d.alignment_unmatch_bg);
        f = com.censivn.C3DEngine.C3DEngine.g().a(bitmapA2, true);
        i = f.id;
        bitmapA2.recycle();
        Bitmap bitmapA3 = x.a(b.d.alignment_match_bg);
        g = com.censivn.C3DEngine.C3DEngine.g().a(bitmapA3, true);
        h = AlignmentBackKeyHandler.id;
        bitmapA3.recycle();
        a = new com.censivn.C3DEngine.b.f.BaseRenderable() { // from class: com.tsf.shell.f.e.a.1
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                if (a.j != null) {
                    a.b.position().y = a.j.position().y;
                    a.c.position().x = a.j.position().x;
                }
            }
        };
        a.setAnimationObjectState(true);
        b = a(true);
        c = a(false);
        a.addChild(WidgetResizeResources);
        a.addChild(SpringEasing);
    }

    private static com.censivn.C3DEngine.b.f.GridRenderable a(boolean z) {
        com.censivn.C3DEngine.b.f.GridRenderable kVar;
        float f2 = 16.0f;
        boolean z2 = false;
        final com.censivn.C3DEngine.b.f.GridRenderable kVar2 = new com.censivn.C3DEngine.b.f.GridRenderable(128.0f, 16.0f, false);
        kVar2.useVBO(false);
        kVar2.textures().addElement(ItemTrailContainer);
        final com.censivn.C3DEngine.b.f.GridRenderable kVar3 = new com.censivn.C3DEngine.b.f.GridRenderable(128.0f, 16.0f, false);
        kVar3.useVBO(false);
        kVar3.textures().addElement(ItemTrailContainer);
        if (z) {
            kVar = new com.censivn.C3DEngine.b.f.GridRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.F, f2, z2) { // from class: com.tsf.shell.f.e.a.2
                @Override // com.censivn.C3DEngine.b.f.IRenderable
                public void onDrawStart() {
                    float f3 = com.censivn.C3DEngine.b.b.ScreenConstants.F / 2;
                    float f4 = a.j.position().x;
                    kVar2.position().x += 5.0f;
                    kVar3.position().x -= 5.0f;
                    if (kVar2.position().x > f3) {
                        kVar2.position().x = f4;
                    }
                    if (kVar3.position().x < (-f3)) {
                        kVar3.position().x = f4;
                    }
                }
            };
        } else {
            kVar = new com.censivn.C3DEngine.b.f.GridRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.G, f2, z2) { // from class: com.tsf.shell.f.e.a.3
                @Override // com.censivn.C3DEngine.b.f.IRenderable
                public void onDrawStart() {
                    float f3 = com.censivn.C3DEngine.b.b.ScreenConstants.G / 2;
                    float f4 = a.j.position().y;
                    kVar2.position().x += 5.0f;
                    kVar3.position().x -= 5.0f;
                    if (kVar2.position().x > f3) {
                        kVar2.position().x = f4;
                    }
                    if (kVar3.position().x < (-f3)) {
                        kVar3.position().x = f4;
                    }
                }
            };
            kVar.rotation().z = 90.0f;
        }
        if (z) {
            kVar.textures().addElement(ILayoutItem);
        } else {
            kVar.textures().addElement(AlignmentBackKeyHandler);
        }
        kVar.useVBO(false);
        kVar.addChild(kVar3);
        kVar.addChild(kVar2);
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6 A[PHI: r2 r5
  0x00e6: PHI (r2v6 com.tsf.shell.f.i.PageItem) = (r2v1 com.tsf.shell.f.i.PageItem), (r2v1 com.tsf.shell.f.i.PageItem), (r2v10 com.tsf.shell.f.i.PageItem), (r2v10 com.tsf.shell.f.i.PageItem) binds: [B:9:0x001f, B:11:0x0023, B:18:0x004d, B:20:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r5v2 float) = (r5v1 float), (r5v1 float), (r5v4 float), (r5v4 float) binds: [B:9:0x001f, B:11:0x0023, B:18:0x004d, B:20:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(float r10, float r11) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.e.a.AlignmentListener(float, float):void");
    }

    public static void a(com.tsf.shell.f.i.PageItem bVar) {
        com.tsf.shell.f.f.WorkspacePage gVarZ = bVar.z();
        if (!q && gVarZ != null) {
            p = gVarZ.R();
            q = true;
            f.id = i;
            AlignmentBackKeyHandler.id = i;
            bVar.c(true);
            j = bVar;
            PageIndicatorStrip.setFocus();
            com.censivn.C3DEngine.b.f.BaseRenderable jVar = (com.censivn.C3DEngine.b.f.BaseRenderable) bVar.parent();
            jVar.addChildAt(a, jVar.getChildIndexOf(bVar));
            com.censivn.C3DEngine.b.c.KeyboardHandler.a(ILassoSelectable);
            com.tsf.shell.manager.app.ObserverManager.a(ToggleRowItem);
            b.a(com.censivn.C3DEngine.b.b.ScreenConstants.F);
            c.a(com.censivn.C3DEngine.b.b.ScreenConstants.G);
        }
    }

    public static void b() {
        if (AlignmentResizeListener) {
            if (o != null) {
                MenuBitmapRenderer.F();
            }
            if (n != null) {
                LassoContextMenu.F();
            }
            PageIndicatorStrip.c(false);
            a.removeFromParent();
            com.censivn.C3DEngine.b.c.KeyboardHandler.b(ILassoSelectable);
            com.tsf.shell.manager.app.ObserverManager.b(ToggleRowItem);
            q = false;
        }
    }

    /* JADX INFO: renamed from: com.tsf.shell.f.e.AlignmentOverlay$a, reason: collision with other inner class name */
    static class C0091a implements com.censivn.C3DEngine.b.c.KeyboardHandler.a {
        C0091a() {
        }
    }

    public static void a(int i2, int i3) {
        b.a(com.censivn.C3DEngine.b.b.ScreenConstants.F);
        c.a(com.censivn.C3DEngine.b.b.ScreenConstants.G);
    }

    public void a(ILassoSelectable mVar) {}
    public LassoContextMenu l_() { return null; }
    public void f() {}
}
