package com.tsf.shell.f.h;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.shell.manager.p.ThemePreferenceProvider;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WorkspaceDockPanel extends BaseRenderable {
    private b a;
    private com.censivn.C3DEngine.b.h.e.DockRenderer f;
    private com.censivn.C3DEngine.b.h.e.DockRenderer g;
    private f h;
    private com.tsf.shell.f.i.b.e.DrawerShortcutItemBase j;
    private float d = com.censivn.C3DEngine.b.b.ScreenConstants.c * 0.0f;
    private float e = 5.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c;
    private float b = ((this.d * 3.0f) + (com.tsf.shell.manager.o.ButtonPresetManager.b.T * 4)) + (90.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c);
    private float c = ((this.e * 2.0f) + (com.tsf.shell.manager.o.ButtonPresetManager.b.U * 3)) + (50.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c);
    private com.tsf.shell.f.i.b.e.DrawerShortcutItemBase i = a(12, com.tsf.shell.manager.p.ThemePreferenceProvider.l);

    public WorkspaceDockPanel(b bVar) {
        this.a = bVar;
        this.f = new com.censivn.C3DEngine.b.h.e.DockRenderer(this.a.b().c(), this.b - (com.censivn.C3DEngine.b.b.ScreenConstants.c * 10.0f), com.tsf.shell.manager.o.ButtonPresetManager.b.U, com.tsf.shell.manager.o.ButtonPresetManager.b.T, com.censivn.C3DEngine.b.b.ScreenConstants.c * 40.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 0.0f);
        this.f.addChild(this.i);
        this.f.addChild(a(13));
        this.j = a(11);
        this.f.addChild(this.j);
        this.f.addChild(a(14));
        this.f.position().y = com.tsf.shell.manager.o.ButtonPresetManager.b.U + this.e;
        this.f.e();
        addChild(this.f);
        this.g = new com.censivn.C3DEngine.b.h.e.DockRenderer(this.a.b().c(), this.b - (com.censivn.C3DEngine.b.b.ScreenConstants.c * 10.0f), com.tsf.shell.manager.o.ButtonPresetManager.b.U, com.tsf.shell.manager.o.ButtonPresetManager.b.T, com.censivn.C3DEngine.b.b.ScreenConstants.c * 40.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 0.0f);
        this.g.addChild(a(VEasing.Back.easeIn, com.tsf.shell.manager.p.ThemePreferenceProvider.a));
        this.g.addChild(a(300, com.tsf.shell.manager.p.ThemePreferenceProvider.e));
        this.g.addChild(a(800));
        this.g.addChild(a(1700, com.tsf.shell.manager.p.ThemePreferenceProvider.o));
        this.g.addChild(a(1500, com.tsf.shell.manager.p.ThemePreferenceProvider.k));
        this.g.addChild(a(900));
        this.g.addChild(a(VEasing.Linear.easeNone));
        this.g.addChild(a(1400));
        this.g.addChild(a(700));
        this.g.addChild(a(1100));
        this.g.addChild(a(1200));
        this.g.addChild(a(1300));
        this.g.addChild(a(1600));
        this.g.addChild(a(15));
        this.g.e();
        addChild(this.g);
        this.h = new WorkspaceWidgetPanel(this, this.a.b().c(), this.b - (com.censivn.C3DEngine.b.b.ScreenConstants.c * 10.0f), com.tsf.shell.manager.o.ButtonPresetManager.b.U, com.tsf.shell.manager.o.ButtonPresetManager.b.T, 40.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c, 0.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c);
        this.h.position().y = (-com.tsf.shell.manager.o.ButtonPresetManager.b.U) - this.e;
        this.h.d();
        addChild(this.h);
    }

    public com.tsf.shell.f.i.b.e.DrawerShortcutItemBase a(int i) {
        com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVarA = com.tsf.shell.manager.l.ShortcutManager.a(i, com.tsf.shell.manager.o.ButtonPresetManager.b);
        a(bVarA);
        return bVarA;
    }

    private com.tsf.shell.f.i.b.e.DrawerShortcutItemBase a(int i, int i2) {
        final com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVarA = a(i);
        final LauncherShortcutStandardInfo launcherShortcutStandardInfo = (LauncherShortcutStandardInfo) bVarA.K();
        DockOperationBorder.a aVarA = com.tsf.shell.manager.app.AppListManager.a(i2);
        if (aVarA.a()) {
            launcherShortcutStandardInfo.enableNotifPoint();
            aVarA.a(new DockOperationBorder.a.C0142a() { // from class: com.tsf.shell.f.h.WorkspaceDockPanel.1
                @Override // com.tsf.shell.manager.p.ThemePreferenceProvider.a.C0142a
                public void a() {
                    launcherShortcutStandardInfo.disableNotifPoint();
                    bVarA.aB();
                }
            });
        }
        return bVarA;
    }

    public float a(float f) {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.a(50);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.f, 500, dVar);
        this.f.mouseEnabled(false);
        com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar2.a(50);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.g);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.g, 500, dVar2);
        this.g.mouseEnabled(false);
        return (this.c / 2.0f) + f + com.censivn.C3DEngine.b.b.ScreenConstants.a(260.0f);
    }

    public void a() {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.a(255);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.f, 500, dVar);
        this.f.mouseEnabled(true);
        com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar2.a(255);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.g);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.g, 500, dVar2);
        this.g.mouseEnabled(true);
        this.h.p();
    }

    public void b() {
        if (com.tsf.shell.manager.app.StateHub.E()) {
            com.tsf.shell.manager.o.ThemeColorConstants.a(this.i, com.tsf.shell.manager.o.ThemeColorConstants.f);
            com.tsf.shell.manager.o.ThemeColorConstants.a(this.j, com.tsf.shell.manager.o.ThemeColorConstants.f);
            this.i.mouseEnabled(false);
            this.j.mouseEnabled(false);
        } else {
            com.tsf.shell.manager.o.ThemeColorConstants.a(this.i, com.tsf.shell.manager.o.ThemeColorConstants.e);
            com.tsf.shell.manager.o.ThemeColorConstants.a(this.j, com.tsf.shell.manager.o.ThemeColorConstants.e);
            this.i.mouseEnabled(true);
            this.j.mouseEnabled(true);
        }
        this.g.a(1, false);
        this.g.a(0, true);
    }

    public static void a(final com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar) {
        bVar.setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(bVar) { // from class: com.tsf.shell.f.h.WorkspaceDockPanel.2
            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                bVar.l();
            }
        });
        com.tsf.shell.manager.o.ThemeColorConstants.a(bVar, com.tsf.shell.manager.o.ThemeColorConstants.e);
        bVar.aN();
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.c;
    }

    public void a(ArrayList<ItemInfo> arrayList, String str) {
        this.h.a(arrayList, str);
    }

    public void e() {
        int iNumChildren = this.f.numChildren();
        for (int i = 0; i < iNumChildren; i++) {
            ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) this.f.getChildAt(i)).aB();
        }
        int iNumChildren2 = this.g.numChildren();
        for (int i2 = 0; i2 < iNumChildren2; i2++) {
            ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) this.g.getChildAt(i2)).aB();
        }
    }
}
