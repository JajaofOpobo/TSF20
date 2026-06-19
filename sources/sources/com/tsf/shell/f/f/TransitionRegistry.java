package com.tsf.shell.f.f;

import com.censivn.C3DEngine.b.c.e;
import com.tsf.shell.f.f.b.SlopeOutsideTransition;
import com.tsf.shell.f.f.b.StackTransition;
import com.tsf.shell.f.f.b.SmoothTransition;
import com.tsf.shell.f.f.b.WaveTransition;
import com.tsf.shell.f.f.b.WindmillTransition;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TransitionRegistry {
    public D a;
    public e b;
    private TransitionConfig.b c;
    private ArrayList<LauncherAppInfo> d = new ArrayList<>();
    private ArrayList<LauncherAppInfo> e;

    public void a() {
        j.d();
        this.a.f();
        this.b.f();
    }

    public TransitionRegistry() {
        this.d.add(new r(0, false));
        this.d.add(new com.tsf.shell.f.f.b.ClothTransition(190, false));
        this.d.add(new com.tsf.shell.f.f.b.CylinderTransition(10, true));
        this.d.add(new com.tsf.shell.f.f.b.FoldPageTransition(180, true));
        this.d.add(new com.tsf.shell.f.f.b.CurveTransition(170, true));
        this.d.add(new com.tsf.shell.f.f.b.PageTurnTransition(100, true));
        this.d.add(new com.tsf.shell.f.f.b.CrossfadeTransition(80, false));
        this.d.add(new com.tsf.shell.f.f.b.RollTransition(110, false));
        this.d.add(new com.tsf.shell.f.f.b.FlyInTransition(150, false));
        this.d.add(new com.tsf.shell.f.f.b.HorizontalFlipTransition(160, false));
        this.d.add(new com.tsf.shell.f.f.b.CubeOutsideTransition(40, false));
        this.d.add(new com.tsf.shell.f.f.b.CubeInsideTransition(50, false));
        this.d.add(new com.tsf.shell.f.f.b.FlipTransition(90, false));
        this.d.add(new p(120, false));
        this.d.add(new com.tsf.shell.f.f.b.SlopeInsideTransition(ThemeFeaturedMenu.NOTIF_POINT_VERSION_CODE_130, false));
        this.d.add(new t(140, false));
        this.d.add(new s(20, false));
        this.d.add(new q(60, false));
        this.d.add(new com.tsf.shell.f.f.b.ScaleInOutTransition(70, false));
        this.d.add(new com.tsf.shell.f.f.b.WaveZoomOutTransition(30, false));
        this.e = new ArrayList<>();
        this.e.add(new com.tsf.shell.f.f.b.a.FolderTransitionB(0, false, true, false));
        this.e.add(new com.tsf.shell.f.f.b.a.FolderTransitionB(5, false, false, false));
        this.e.add(new com.tsf.shell.f.f.b.a.FolderTransitionB(10, true, true, false));
        this.e.add(new com.tsf.shell.f.f.b.a.FolderTransitionB(15, true, false, false));
        this.e.add(new com.tsf.shell.f.f.b.a.FolderTransitionF(20, true, false, true));
        this.e.add(new com.tsf.shell.f.f.b.a.FolderTransitionF(30, true, true, true));
        this.e.add(new com.tsf.shell.f.f.b.a.FolderTransitionA(40, true, true, true));
        this.e.add(new com.tsf.shell.f.f.b.a.FolderTransitionA(50, true, false, true));
        this.e.add(new com.tsf.shell.f.f.b.a.FolderTransitionE(60, true, false, true));
        this.e.add(new com.tsf.shell.f.f.b.a.FolderTransitionE(70, true, true, true));
        this.e.add(new com.tsf.shell.f.f.b.a.FolderTransitionC(80, true, false, true));
        this.e.add(new com.tsf.shell.f.f.b.a.FolderTransitionC(90, true, true, true));
        this.a = new D(this.d);
        this.b = new TransitionConfig(this.e);
    }

    public void b() {
        h.a();
        this.c = new TransitionConfig.b() { // from class: com.tsf.shell.f.f.TransitionRegistry.1
            @Override // com.censivn.C3DEngine.b.c.e.b, com.censivn.C3DEngine.b.c.e.a
            public void a(int i, int i2, int i3, int i4) {
            }
        };
        com.tsf.shell.manager.app.ObserverManager.a(this.c);
    }
}
