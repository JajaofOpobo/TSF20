package com.tsf.shell.f.i.b.d;

import android.content.ComponentName;
import android.content.ContentValues;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.Home;
import com.tsf.shell.f.e.ILassoSelectable;
import com.tsf.shell.f.e.LassoContextMenu;
import com.tsf.shell.f.i.ItemStubHelper;
import com.tsf.shell.f.i.MultiSelectController;
import com.tsf.shell.f.i.PageItem;
import com.tsf.shell.f.i.b.d.FolderItemGrid;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FolderShortcutItem extends com.tsf.shell.f.i.ShortcutItem implements com.tsf.shell.f.e.a.AlignmentListener, com.tsf.shell.f.e.LassoSelectionHandler.a, ILassoSelectable, com.tsf.shell.f.i.MultiSelectController.InterfaceC0113a {
    private static ArrayList<Integer> C;
    private static ArrayList<Integer> D;
    private static ArrayList<Integer> E;
    private static ArrayList<Integer> F;
    private static com.tsf.shell.f.e.LassoSelectionHandler G;
    public static FolderShortcutItem k;
    public static FolderItemPositioner l;
    public static FolderItemGrid ILassoSelectable;
    public static LassoContextMenu LassoContextMenu;
    boolean A;
    private com.tsf.shell.f.i.b.e.DrawerShortcutItemBase H;
    private int I;
    private ItemStubHelper J;
    private int K;
    private Number3d L;
    private Number3d M;
    private com.tsf.shell.f.i.b.e.DrawerShortcutItemBase N;
    private com.censivn.C3DEngine.b.d.a O;
    private com.censivn.C3DEngine.b.d.a P;
    private com.censivn.C3DEngine.b.d.a Q;
    private FolderItemSorter R;
    private com.tsf.shell.f.b.ShellKeyEventHandler S;
    private com.censivn.C3DEngine.b.f.j T;
    private int U;
    private com.censivn.C3DEngine.b.g.d V;
    private com.tsf.shell.f.i.MultiSelectController W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private com.tsf.shell.f.i.b.e.DrawerShortcutItemBase aa;
    private boolean ab;
    private Number3d ac;
    private ArrayList<com.tsf.shell.f.i.b.e.DrawerShortcutItemBase> ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    protected FolderItemGrid o;
    protected com.censivn.C3DEngine.b.f.k p;
    protected com.censivn.C3DEngine.b.f.k q;
    protected com.censivn.C3DEngine.b.f.k r;
    protected com.censivn.C3DEngine.b.f.k s;
    protected com.censivn.C3DEngine.b.f.k t;
    protected TextureElement u;
    protected TextureElement v;
    protected TextureElement w;
    protected boolean x;
    protected boolean y;
    protected boolean z;
    private static ArrayList<FolderShortcutItem> B = new ArrayList<>();
    public static int a = 0;
    public static int b = 1;

    public static void k() {
        l = new FolderItemPositioner();
        m = new FolderItemLayout();
        n = new FolderItemState();
        D = new ArrayList<>();
        D.add(7);
        D.add(6);
        E = new ArrayList<>();
        E.add(7);
        E.add(6);
        E.add(4);
        E.add(2);
        E.add(1);
        C = new ArrayList<>();
        C.add(4);
        F = new ArrayList<>();
    }

    public static com.censivn.C3DEngine.b.f.k l() {
        com.censivn.C3DEngine.b.f.k kVar = new com.censivn.C3DEngine.b.f.k(0.0f, 0.0f, false);
        kVar.uvs().set(0, 1.0f, 0.0f);
        kVar.uvs().set(1, 0.0f, 0.0f);
        kVar.uvs().set(2, 1.0f, 1.0f);
        kVar.uvs().set(3, 0.0f, 1.0f);
        kVar.points().setPX(0, ILassoSelectable.g, ILassoSelectable.f, 0.0f);
        kVar.points().setPX(1, ILassoSelectable.e, ILassoSelectable.f, 0.0f);
        kVar.points().setPX(2, ILassoSelectable.g, ILassoSelectable.h, 0.0f);
        kVar.points().setPX(3, ILassoSelectable.e, ILassoSelectable.h, 0.0f);
        kVar.updateUvsVBO();
        return kVar;
    }

    public static void q() {
        l.f();
        ILassoSelectable.a();
        Iterator<FolderShortcutItem> it = PageItem.iterator();
        while (it.hasNext()) {
            it.next().aK();
        }
        com.tsf.shell.manager.app.WidgetManager.c();
    }

    public static void a(int i, int i2, int i3, int i4) {
        Iterator<FolderShortcutItem> it = PageItem.iterator();
        while (it.hasNext()) {
            it.next().b(i, i2, i3, i4);
        }
    }

    public static FolderShortcutItem a(int i, int i2, int i3) {
        LauncherFolder3DInfo launcherFolder3DInfo = new LauncherFolder3DInfo();
        launcherFolder3DInfo.screen = i;
        launcherFolder3DInfo.cellX = i2;
        launcherFolder3DInfo.cellY = i3;
        launcherFolder3DInfo.rotation = 0;
        FolderShortcutItem bVar = new FolderShortcutItem(launcherFolder3DInfo);
        bVar.position().x = launcherFolder3DInfo.cellX;
        bVar.position().y = launcherFolder3DInfo.cellY;
        bVar.rotation().z = launcherFolder3DInfo.rotation;
        bVar.ac();
        bVar.ad();
        bVar.setMouseEventListener(new com.tsf.shell.f.i.a.PageItemTouchHandler(bVar));
        com.tsf.shell.manager.app.WidgetManager.d(bVar);
        return bVar;
    }

    public static FolderShortcutItem a(LauncherFolder3DInfo launcherFolder3DInfo) {
        FolderShortcutItem bVar = new FolderShortcutItem(launcherFolder3DInfo);
        bVar.setMouseEventListener(new com.tsf.shell.f.i.a.PageItemTouchHandler(bVar));
        return bVar;
    }

    public FolderShortcutItem az() {
        LauncherFolder3DInfo launcherFolder3DInfo = new LauncherFolder3DInfo();
        launcherFolder3DInfo.packagename = "";
        ContentValues contentValues = new ContentValues();
        launcherFolder3DInfo.updateName(contentValues, K().title, false);
        ShellModel.a.a(contentValues, launcherFolder3DInfo, (Runnable) null);
        for (com.censivn.C3DEngine.b.f.i iVar : this.o.children()) {
            if (iVar instanceof com.tsf.shell.f.i.b.e.DrawerItemVisual) {
                LauncherShortcutAppInfo launcherShortcutAppInfoBb = ((com.tsf.shell.f.i.b.e.DrawerItemVisual) iVar).bb();
                launcherShortcutAppInfoBb.container = launcherFolder3DInfo.id;
                ShellModel.a.a(new ContentValues(), launcherShortcutAppInfoBb, (Runnable) null);
                launcherFolder3DInfo.add(launcherShortcutAppInfoBb);
            }
        }
        FolderShortcutItem bVar = new FolderShortcutItem(launcherFolder3DInfo);
        bVar.position().setAllFrom(position());
        bVar.scale().setAllFrom(scale());
        bVar.rotation().setAllFrom(rotation());
        bVar.setMouseEventListener(new com.tsf.shell.f.i.a.PageItemTouchHandler(bVar));
        return bVar;
    }

    public void a(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar, final com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar2, com.censivn.C3DEngine.b.f.i iVar) {
        if (this.H == null) {
            bVar.k.visible(false);
            bVar2.k.textures().addElement(bVar.k.textures().get(0).textureElement);
            bVar.addChild(bVar2);
            int childIndexOf = bVar.getChildIndexOf(bVar2);
            ILassoSelectable.b(this);
            mouseEnabled(false);
            this.H = bVar2;
            Number3d.TEMPNUMBER3D.reset();
            bVar2.localToGlobal(Number3d.TEMPNUMBER3D);
            bVar2.parent(null);
            this.o.addChild(bVar2);
            bVar.children().set(childIndexOf, this);
            parent(bVar);
            position().setAllFrom(bVar2.position());
            bVar2.position().setAllFrom(this.o.globalToLocal(Number3d.TEMPNUMBER3D));
        }
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                FolderShortcutItem.this.n(true);
                FolderShortcutItem.this.a(false, (Runnable) null, true);
                FolderShortcutItem.this.bh();
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                bVar2.g(1.0f - f);
            }
        };
        dVar.f(0.0f);
        dVar.h(60.0f);
        dVar.e(0.0f);
        com.censivn.C3DEngine.b.g.c.a(bVar2);
        com.censivn.C3DEngine.b.g.c.a(bVar2, 500, dVar);
        this.J.a(0.0f);
        a(iVar);
    }

    public void a(com.censivn.C3DEngine.b.f.i iVar, final Runnable runnable) {
        ILassoSelectable.b(this);
        mouseEnabled(false);
        this.J.b();
        Number3d.TEMPNUMBER3D.reset();
        localToGlobal(Number3d.TEMPNUMBER3D);
        this.o.globalToLocal(Number3d.TEMPNUMBER3D);
        float f = Number3d.TEMPNUMBER3D.x;
        float f2 = Number3d.TEMPNUMBER3D.y;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.12
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f3) {
                FolderShortcutItem.this.H.g(f3);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) FolderShortcutItem.this.parent();
                int childIndexOf = jVar.getChildIndexOf(FolderShortcutItem.this);
                FolderShortcutItem.this.H.removeFromParent();
                jVar.children().set(childIndexOf, FolderShortcutItem.this.H);
                FolderShortcutItem.this.H.parent(jVar);
                FolderShortcutItem.this.H.position().setAllFrom(FolderShortcutItem.this.position());
                FolderShortcutItem.this.H.mouseEnabled(true);
                FolderShortcutItem.this.o.children().clear();
                FolderShortcutItem.this.parent(null);
                FolderShortcutItem.this.H = null;
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.f(FolderItemBackground);
        dVar.h(f2);
        dVar.e(0.0f);
        com.censivn.C3DEngine.b.g.c.a(this.H);
        com.censivn.C3DEngine.b.g.c.a(this.H, 300, dVar);
        if (iVar != null) {
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
            dVar2.l(1.0f);
            dVar2.m(1.0f);
            com.censivn.C3DEngine.b.g.c.a(iVar);
            com.censivn.C3DEngine.b.g.c.a(iVar, 300, dVar2);
        }
    }

    public void a(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar, com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar2, boolean z) {
        ItemInfo itemInfoK = K();
        if (!z && (itemInfoK instanceof LauncherDrawerFolder3DInfo)) {
            a(new LauncherFolder3DInfo());
            this.ae = false;
            this.af = false;
            this.o.a(D, C);
        }
        if (itemInfoK instanceof LauncherDrawerFolder3DInfo) {
            ((LauncherDrawerFolder3DInfo) itemInfoK).isPreviewFolder = false;
            this.af = false;
        }
        com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) bVar.parent();
        jVar.children().set(jVar.getChildIndexOf(bVar), this);
        parent(jVar);
        position().setAllFrom(bVar.position());
        rotation().setAllFrom(bVar.rotation());
        scale().setAllFrom(bVar.scale());
        com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar3 = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) this.o.getChildAt(0);
        com.censivn.C3DEngine.b.g.c.a(bVar3);
        bVar.position().setAllFrom(bVar3.position());
        bVar.rotation().setAllFrom(bVar3.rotation());
        bVar.scale().setAllFrom(bVar3.scale());
        this.o.children().set(0, bVar);
        bVar.parent(this.o);
        aJ();
        c(bVar);
        e(bVar2);
        be();
    }

    public com.censivn.C3DEngine.b.f.i aA() {
        return this.aa;
    }

    public FolderShortcutItem(ItemInfo itemInfo) {
        super(itemInfo);
        this.x = true;
        this.y = false;
        this.z = false;
        this.U = 1;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.ab = false;
        this.ac = new Number3d();
        this.ae = false;
        this.af = false;
        this.A = false;
        if (itemInfo instanceof LauncherDrawerFolder3DInfo) {
            this.ae = true;
            this.af = ((LauncherDrawerFolder3DInfo) itemInfo).isPreviewFolder;
        }
        i(false);
        g(true);
        c(1.2f);
        this.K = b;
        this.J = new ItemStubHelper(this);
        j(true);
        bf();
        be();
        bd();
        if (G == null) {
            G = new com.tsf.shell.f.e.LassoSelectionHandler();
        }
        this.R = new FolderItemSorter(this);
        this.o = new FolderItemGrid(this);
        if (this.ae) {
            this.o.a(E, F);
        } else {
            this.o.a(D, C);
        }
        this.o.position().x = l.c().folder.childContainerX;
        this.o.position().y = l.c().folder.childContainerY;
        Iterator<Integer> it = l.c().folder.order.iterator();
        while (it.hasNext()) {
            switch (it.next().intValue()) {
                case 0:
                    addChild(this.r);
                    break;
                case 1:
                    addChild(this.q);
                    break;
                case 2:
                    addChild(this.p);
                    break;
                case 3:
                    addChild(this.o);
                    break;
                case 4:
                    addChild(this.s);
                    break;
            }
        }
        addChild(this.t);
        com.tsf.shell.manager.o.ButtonPresetManager.a.a((com.censivn.C3DEngine.b.f.i) this, true);
        this.O = new com.censivn.C3DEngine.b.d.a(this.p) { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.15
            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                com.tsf.shell.f.i.b.d.FolderShortcutItem.G.a((com.tsf.shell.f.e.LassoSelectionHandler.a) FolderShortcutItem.this);
                com.tsf.shell.f.i.b.d.FolderShortcutItem.G.a((com.censivn.C3DEngine.b.f.i) FolderShortcutItem.this);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                com.tsf.shell.f.i.b.d.FolderShortcutItem.G.a(motionEvent, motionEvent2);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                com.tsf.shell.f.i.b.d.FolderShortcutItem.G.a(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.utils.HapticFeedbackManager.b();
                if (FolderShortcutItem.this.K == com.tsf.shell.f.i.b.d.FolderShortcutItem.b) {
                    FolderShortcutItem.this.aR();
                } else {
                    FolderShortcutItem.this.m(true);
                }
            }
        };
        this.P = new com.censivn.C3DEngine.b.d.a(this.p) { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.16
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                FolderShortcutItem.this.R.a(motionEvent, motionEvent2);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                FolderShortcutItem.this.R.d();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.utils.HapticFeedbackManager.b();
                if (FolderShortcutItem.this.K == com.tsf.shell.f.i.b.d.FolderShortcutItem.b) {
                    FolderShortcutItem.this.aR();
                } else {
                    FolderShortcutItem.this.m(true);
                }
            }
        };
        this.Q = new com.censivn.C3DEngine.b.d.a(this.p) { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.17
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.utils.HapticFeedbackManager.b();
                if (FolderShortcutItem.this.K == com.tsf.shell.f.i.b.d.FolderShortcutItem.b) {
                    FolderShortcutItem.this.aR();
                } else {
                    FolderShortcutItem.this.m(true);
                }
            }
        };
        this.W = new com.tsf.shell.f.i.MultiSelectController(this, this) { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.18
            @Override // com.tsf.shell.f.i.MultiSelectController
            public void h() {
            }

            @Override // com.tsf.shell.f.i.MultiSelectController
            public void a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
            @Override // com.tsf.shell.f.i.MultiSelectController
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean a(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase r5) {
                /*
                    r4 = this;
                    r3 = 1
                    r2 = 0
                    com.tsf.shell.f.i.b.d.FolderShortcutItem r0 = com.tsf.shell.f.i.b.d.FolderShortcutItem.this
                    int r0 = r0.aU()
                    r1 = 2
                    if (r0 != r1) goto L30
                    com.tsf.shell.f.i.b.d.FolderShortcutItem r0 = com.tsf.shell.f.i.b.d.FolderShortcutItem.this
                    com.tsf.shell.f.i.b.d.FolderItemSorter r0 = com.tsf.shell.f.i.b.d.FolderShortcutItem.d(r0)
                    r0.e()
                    com.tsf.shell.f.i.b.d.FolderShortcutItem r0 = com.tsf.shell.f.i.b.d.FolderShortcutItem.this
                    com.tsf.shell.f.i.b.d.FolderItemSorter r0 = com.tsf.shell.f.i.b.d.FolderShortcutItem.d(r0)
                    boolean r0 = r0.c()
                    if (r0 == 0) goto L30
                    boolean r0 = com.tsf.shell.manager.b.ConfigManager.as()
                    if (r0 == 0) goto L30
                    com.tsf.shell.f.i.b.d.FolderShortcutItem r0 = com.tsf.shell.f.i.b.d.FolderShortcutItem.this
                    com.tsf.shell.f.i.b.d.FolderItemSorter r0 = com.tsf.shell.f.i.b.d.FolderShortcutItem.d(r0)
                    r0.a(r2)
                L2f:
                    return r3
                L30:
                    boolean r0 = com.tsf.shell.manager.b.ConfigManager.as()
                    if (r0 == 0) goto L2f
                    com.tsf.shell.f.i.b.d.FolderShortcutItem r0 = com.tsf.shell.f.i.b.d.FolderShortcutItem.this
                    r0.m(r2)
                    goto L2f
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.i.b.d.FolderShortcutItem.AnonymousClass18.a(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase):boolean");
            }

            @Override // com.tsf.shell.f.i.MultiSelectController
            public void b(com.tsf.shell.f.i.PageItem bVar) {
                if (bVar.visible() && bVar.alpha() != 0.0f) {
                    FolderShortcutItem.this.aQ();
                }
            }

            @Override // com.tsf.shell.f.i.MultiSelectController
            public void c(com.tsf.shell.f.i.PageItem bVar) {
                super.c(bVar);
                if (FolderShortcutItem.this.K == com.tsf.shell.f.i.b.d.FolderShortcutItem.a) {
                    FolderShortcutItem.this.b((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) bVar);
                    return;
                }
                int iA = FolderShortcutItem.this.o.a(bVar);
                FolderShortcutItem.this.o.removeChild(bVar);
                FolderShortcutItem.this.a((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) bVar, false);
                if (iA < com.tsf.shell.f.i.b.d.FolderShortcutItem.l.K) {
                    FolderShortcutItem.this.aB();
                    com.tsf.shell.f.i.b.d.FolderShortcutItem.m.a(FolderShortcutItem.this);
                    com.tsf.shell.f.i.b.d.FolderShortcutItem.m.c(FolderShortcutItem.this);
                }
            }
        };
        this.S = new com.tsf.shell.f.b.ShellKeyEventHandler() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.19
            @Override // com.tsf.shell.f.b.ShellKeyEventHandler, com.censivn.C3DEngine.b.c.b.a
            public void a(int i, KeyEvent keyEvent) {
                if (i == 4 && FolderShortcutItem.this.K == com.tsf.shell.f.i.b.d.FolderShortcutItem.a && FolderShortcutItem.this.mouseEnabled() && !FolderShortcutItem.this.o.v()) {
                    FolderShortcutItem.this.m(true);
                }
            }

            @Override // com.tsf.shell.f.b.ShellKeyEventHandler, com.censivn.C3DEngine.b.c.b.a
            public void b(int i, KeyEvent keyEvent) {
            }
        };
        ArrayList<ItemInfo> arrayListA = com.tsf.shell.utils.ItemInfoListSorter.a(((LauncherFolder3DInfo) itemInfo).getItemInfo(), itemInfo.config, ",", true);
        int size = arrayListA.size();
        for (int i = 0; i < size; i++) {
            ItemInfo itemInfo2 = arrayListA.get(FolderItemDotIndicator);
            if (i < l.K) {
                a(itemInfo2, false);
            } else {
                a(itemInfo2, true);
            }
        }
        arrayListA.clear();
        n(true);
        aY();
        bh();
        ILassoSelectable.a(this);
        ILassoSelectable.c(this);
        if (!PageItem.contains(this)) {
            PageItem.add(this);
        }
    }

    public void b(int i) {
        Collections.sort(this.o.children(), com.tsf.shell.manager.app.ServiceProvider.b().a(FolderItemDotIndicator).b());
        this.o.k();
        this.o.o();
        aJ();
    }

    public void aB() {
        int iAW = aW() > l.K ? l.K : aW();
        for (int i = 0; i < iAW; i++) {
            com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) this.o.children().get((aW() - i) - 1);
            a(bVar, l.L.get(FolderItemDotIndicator));
            bVar.visible(true);
            bVar.alpha(255.0f);
        }
    }

    public boolean aC() {
        return K() instanceof LauncherDrawerFolder3DInfo;
    }

    @Override // com.tsf.shell.f.i.a.InterfaceC0113a
    public ArrayList<com.censivn.C3DEngine.b.f.i> b() {
        return this.o.children();
    }

    private void a(ItemInfo itemInfo, boolean z) {
        com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVarA = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) itemInfo.getWidget();
        if (bVarA == null) {
            bVarA = com.tsf.shell.manager.l.ShortcutManager.a(itemInfo, z);
        }
        bVarA.g(0.0f);
        bVarA.mouseEnabled(false);
        this.o.addChild(bVarA);
        bVarA.setMouseEventListener(new com.tsf.shell.f.i.b.d.FolderTouchHandler(bVarA, this));
        bVarA.a(this.W);
    }

    public com.tsf.shell.f.i.MultiSelectController aE() {
        return this.W;
    }

    public FolderItemGrid aF() {
        return this.o;
    }

    public ArrayList<com.censivn.C3DEngine.b.f.i> aG() {
        return this.o.children();
    }

    public com.censivn.C3DEngine.b.f.k aH() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bc() {
        if (this.X) {
            com.tsf.shell.f.i.b.d.FolderShortcutItem.l.a(this, aN());
        }
        com.tsf.shell.f.i.b.d.FolderShortcutItem.m.a(this);
        this.X = false;
    }

    public ComponentName[] aI() {
        int size = this.o.children().size();
        ComponentName[] componentNameArr = new ComponentName[size];
        for (int i = 0; i < size; i++) {
            componentNameArr[i] = ((com.tsf.shell.f.i.b.e.DrawerItemVisual) this.o.children().get(FolderItemDotIndicator)).bd().b;
        }
        return componentNameArr;
    }

    public void aJ() {
        if (!this.af) {
            LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) K();
            int size = this.o.children().size();
            String str = "";
            for (int i = 0; i < size; i++) {
                str = str + ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) this.o.children().get(FolderItemDotIndicator)).K().id + ",";
            }
            if (this.ae) {
                launcherFolder3DInfo.config = str;
                com.tsf.shell.manager.app.ServiceProvider.c().a(launcherFolder3DInfo, 16);
            } else {
                launcherFolder3DInfo.onUpdateConfig(str);
            }
        }
    }

    public void aK() {
        this.J.a();
        bf();
        be();
        bd();
        this.o.position().x = l.c().folder.childContainerX;
        this.o.position().y = l.c().folder.childContainerY;
        this.o.removeFromParent();
        Iterator<Integer> it = l.c().folder.order.iterator();
        while (it.hasNext()) {
            switch (it.next().intValue()) {
                case 0:
                    addChild(this.r);
                    break;
                case 1:
                    addChild(this.q);
                    break;
                case 2:
                    addChild(this.p);
                    break;
                case 3:
                    addChild(this.o);
                    break;
                case 4:
                    addChild(this.s);
                    break;
            }
        }
        com.tsf.shell.manager.o.ButtonPresetManager.a.a((com.censivn.C3DEngine.b.f.i) this, true);
        com.tsf.shell.f.i.b.d.FolderShortcutItem.l.a(this, aN());
        b(0, 0, 0, 0);
        a((Runnable) null, false);
        if (this.c) {
            if (l.c().folder.nameTextFormat.auto) {
                a(true);
            } else {
                l(true);
            }
        }
        aQ();
    }

    private void bd() {
        if (this.r == null) {
            this.r = new com.censivn.C3DEngine.b.f.k(l.c().folder.textPlaneWidth, l.c().folder.textPlaneHeight, 1, 1, false);
        } else {
            this.r.a(l.c().folder.textPlaneWidth);
            this.r.b(l.c().folder.textPlaneHeight);
        }
        this.r.position().x = l.c().folder.textPlaneX;
        this.r.position().y = l.c().folder.textPlaneY;
        this.r.removeFromParent();
    }

    private void be() {
        if (this.t == null) {
            this.t = new com.censivn.C3DEngine.b.f.k(ILassoSelectable.c, ILassoSelectable.d, 1, 1, false);
        }
        if (!this.af) {
            if (this.u == null) {
                this.u = com.censivn.C3DEngine.A.g().a(ILassoSelectable.c, ILassoSelectable.d, false);
            } else if (this.u.width != ILassoSelectable.c || this.u.height != ILassoSelectable.d) {
                com.censivn.C3DEngine.A.g().a(this.u);
                this.u = com.censivn.C3DEngine.A.g().a(ILassoSelectable.c, ILassoSelectable.d, false);
            }
            this.t.textures().clear();
            this.t.textures().addElement(this.u);
        }
        this.t.points().setPX(0, ILassoSelectable.g, ILassoSelectable.f, 0.0f);
        this.t.points().setPX(1, ILassoSelectable.e, ILassoSelectable.f, 0.0f);
        this.t.points().setPX(2, ILassoSelectable.g, ILassoSelectable.h, 0.0f);
        this.t.points().setPX(3, ILassoSelectable.e, ILassoSelectable.h, 0.0f);
        this.t.updatePointsVBO();
        this.t.uvs().set(0, 1.0f, 0.0f);
        this.t.uvs().set(1, 0.0f, 0.0f);
        this.t.uvs().set(2, 1.0f, 1.0f);
        this.t.uvs().set(3, 0.0f, 1.0f);
        this.t.updateUvsVBO();
        this.t.calAABB();
    }

    private void bf() {
        if (l.c().folder.backPlaneEnable) {
            if (this.p == null) {
                this.p = new com.censivn.C3DEngine.b.f.k(l.c().folder.backPlaneWidth, l.c().folder.backPlaneHeight, 1, 1, false);
            } else {
                this.p.a(l.c().folder.backPlaneWidth);
                this.p.b(l.c().folder.backPlaneHeight);
                this.p.removeFromParent();
            }
            this.p.textures().clear();
            this.p.textures().addElement(l.z);
            this.p.position().x = l.c().folder.backPlaneX;
            this.p.position().y = l.c().folder.backPlaneY;
            com.tsf.shell.manager.o.ButtonPresetManager.a.a((com.censivn.C3DEngine.b.f.i) this.p, -this.p.position().x, -this.p.position().y, true);
        } else if (this.p != null) {
            this.p.textures().clear();
            this.p.removeFromParent();
        }
        if (l.c().folder.frontPlaneEnable) {
            if (this.q == null) {
                this.q = new com.censivn.C3DEngine.b.f.k(l.c().folder.frontPlaneWidth, l.c().folder.frontPlaneHeight, 1, 1, false);
            } else {
                this.q.a(l.c().folder.frontPlaneWidth);
                this.q.b(l.c().folder.frontPlaneHeight);
                this.q.removeFromParent();
            }
            this.q.textures().clear();
            this.q.textures().addElement(l.A);
            this.q.position().x = l.c().folder.frontPlaneX;
            this.q.position().y = l.c().folder.frontPlaneY;
        } else if (this.q != null) {
            this.q.textures().clear();
            this.q.removeFromParent();
        }
        if (l.c().folder.sizePlaneEnable) {
            if (this.s == null) {
                this.s = new com.censivn.C3DEngine.b.f.k(l.c().folder.sizePlaneWidth, l.c().folder.sizePlaneHeight, 1, 1, false);
            } else {
                this.s.a(l.c().folder.sizePlaneWidth);
                this.s.b(l.c().folder.sizePlaneHeight);
                this.s.removeFromParent();
            }
            this.s.position().x = l.c().folder.sizePlaneX;
            this.s.position().y = l.c().folder.sizePlaneY;
            return;
        }
        if (this.s != null) {
            this.s.textures().clear();
            this.s.removeFromParent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar) {
        if (this.ae) {
            if (!this.af) {
                if (K().id == -1) {
                    com.tsf.shell.manager.app.ServiceProvider.c().a(K(), 0);
                }
                bVar.K().container = K().id;
                com.tsf.shell.manager.app.ServiceProvider.c().a(bVar.K(), 132);
            }
        } else {
            bVar.K().onUpdateContainer(K().id);
        }
        bVar.setMouseEventListener(new com.tsf.shell.f.i.b.d.FolderTouchHandler(bVar, this));
        bVar.a(this.W);
        this.W.a((com.censivn.C3DEngine.b.f.i) bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar, boolean z) {
        ArrayList<com.tsf.shell.f.i.ShortcutItem> arrayListAv = bVar.av();
        if (arrayListAv != null && arrayListAv.size() > 0) {
            for (com.tsf.shell.f.i.ShortcutItem cVar : arrayListAv) {
                LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) cVar.K();
                if (z && launcherShortcut3DInfo != null) {
                    launcherShortcut3DInfo.updateContainer(null, -1);
                }
                cVar.B();
            }
        }
        LauncherShortcut3DInfo launcherShortcut3DInfo2 = (LauncherShortcut3DInfo) bVar.K();
        if (z && launcherShortcut3DInfo2 != null) {
            launcherShortcut3DInfo2.updateContainer(null, -1);
        }
        bVar.B();
        aJ();
        bh();
    }

    public void aL() {
        a(false);
    }

    public void a(boolean z) {
        if (l.c().folder.nameTextFormat.auto) {
            if (!this.y || z) {
                this.y = true;
                com.tsf.shell.manager.o.ButtonPresetManager.a.a((com.censivn.C3DEngine.b.f.i) this.p, -this.p.position().x, -this.p.position().y, false);
                com.tsf.shell.manager.o.ButtonPresetManager.a.a((com.censivn.C3DEngine.b.f.i) this.t, false);
                com.tsf.shell.manager.o.ButtonPresetManager.a.a((com.censivn.C3DEngine.b.f.i) this, false);
                ILassoSelectable.a(this);
            }
        }
    }

    public void aM() {
        l(false);
    }

    public void l(boolean z) {
        if (l.c().folder.nameTextFormat.auto || z) {
            if (this.y || z) {
                this.y = false;
                com.tsf.shell.manager.o.ButtonPresetManager.a.a((com.censivn.C3DEngine.b.f.i) this.p, -this.p.position().x, -this.p.position().y, true);
                com.tsf.shell.manager.o.ButtonPresetManager.a.a((com.censivn.C3DEngine.b.f.i) this.t, true);
                com.tsf.shell.manager.o.ButtonPresetManager.a.a((com.censivn.C3DEngine.b.f.i) this, true);
                ILassoSelectable.a(this);
            }
        }
    }

    public void a(final String str) {
        int i = 1;
        if (str != "") {
            if (this.ae) {
                LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) K();
                launcherFolder3DInfo.title = str;
                com.tsf.shell.manager.app.ServiceProvider.c().a(launcherFolder3DInfo, 1);
            } else {
                K().onUpdateName(str, false);
            }
            com.censivn.C3DEngine.A.a().c(new RenderRunnable(i, i) { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.20
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    com.tsf.shell.f.i.b.d.FolderShortcutItem.l.a(FolderShortcutItem.this, str);
                    com.tsf.shell.f.i.b.d.FolderShortcutItem.l.a(str);
                    if (FolderShortcutItem.this.x) {
                        com.tsf.shell.f.i.b.d.FolderShortcutItem.m.a(FolderShortcutItem.this);
                    }
                }
            });
            invalidate();
        }
    }

    private void bg() {
    }

    public void aO() {
        com.tsf.shell.ShellDataProvider.a().a("WidgetFolderBox");
    }

    public void aP() {
        com.tsf.shell.ShellDataProvider.a().b("WidgetFolderBox");
    }

    public void c(int i) {
        com.censivn.C3DEngine.A.a().b(new Runnable() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.21
            @Override // java.lang.Runnable
            public void run() {
        com.tsf.shell.ShellDataProvider.a().b("WidgetFolderBox");
            }
        }, i);
    }

    public void aQ() {
        if (!this.Z) {
            this.Z = true;
            com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.2
                @Override // java.lang.Runnable
                public void run() {
                    FolderShortcutItem.this.bc();
                    FolderShortcutItem.this.C();
                    FolderShortcutItem.this.Z = false;
                }
            });
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public boolean doubleSidedEnabled() {
        return aH().doubleSidedEnabled();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void doubleSidedEnabled(boolean z) {
        aH().doubleSidedEnabled(z);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void alpha(float f) {
        aH().alpha(FolderItemBackground);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public float alpha() {
        return aH().alpha();
    }

    @Override // com.tsf.shell.f.i.PageItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public int m() {
        return 1;
    }

    @Override // com.tsf.shell.f.e.ILassoSelectable
    public boolean e_() {
        return this.Y;
    }

    @Override // com.tsf.shell.f.e.ILassoSelectable
    public void b(boolean z) {
        this.Y = z;
    }

    @Override // com.tsf.shell.f.e.ILassoSelectable
    public boolean d() {
        return mouseEnabled();
    }

    public void aR() {
        com.censivn.C3DEngine.b.g.d dVar;
        this.ab = false;
        k = this;
        l.a(this.o.numChildren());
        l.g();
        this.o.i();
        boolean z = this.y;
        this.y = false;
        ILassoSelectable.b(this);
        this.y = z;
        aO();
        l.a(aN());
        mouseEnabled(false);
        this.p.setMouseEventListener(this.Q);
        this.t.setMouseEventListener(this.Q);
        mouseSkip(true);
        if (K().container != -1 || (K() instanceof LauncherDrawerFolder3DInfo)) {
            Number3d.TEMPNUMBER3D.reset();
            Number3d.TEMPNUMBER3D2.setAll(1.0f, 1.0f, 1.0f);
            localToGlobal(Number3d.TEMPNUMBER3D);
            localScaleToGlobale(Number3d.TEMPNUMBER3D2);
            this.aa = com.tsf.shell.f.c.DrawerPanelController.a(this);
            ((com.censivn.C3DEngine.b.f.j) parent()).replaceChild(this, this.aa);
            position().setAllFrom(Number3d.TEMPNUMBER3D);
            scale().setAllFrom(Number3d.TEMPNUMBER3D2);
            if (aC()) {
                this.ag = com.tsf.shell.manager.app.ObserverManager.a(this);
                com.tsf.shell.manager.app.ObserverManager.b(Home.b());
            }
        }
        this.T = com.tsf.shell.manager.app.TaskScheduler.a(this.S);
        switch (com.tsf.shell.manager.b.ConfigManager.ar()) {
            case 0:
                dVar = new com.censivn.C3DEngine.b.g.d();
                bj();
                dVar.a((com.censivn.C3DEngine.b.g.b) new com.tsf.shell.f.i.b.d.FolderTouchHandler.b.c());
                break;
            case 1:
                dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.3
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        FolderShortcutItem.this.bj();
                    }
                };
                dVar.a((com.censivn.C3DEngine.b.g.b) new com.tsf.shell.f.i.b.d.FolderTouchHandler.b.c());
                break;
            default:
                dVar = new com.censivn.C3DEngine.b.g.d();
                bj();
                dVar.a((com.censivn.C3DEngine.b.g.b) new com.tsf.shell.f.i.b.d.FolderTouchHandler.b.c());
                break;
        }
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.f(0.0f);
        dVar.h(0 - l.m);
        dVar.e(0.0f);
        com.censivn.C3DEngine.b.g.c.a(this);
        com.censivn.C3DEngine.b.g.c.a(this, 350, dVar);
        l.a(500, this);
        removeFromParent();
        com.tsf.shell.manager.app.TaskScheduler.c();
        l.F.removeFromParent();
        l.F.addChild(this);
        this.T.addChild(l.F);
        this.L = position().m4clone();
        this.M = rotation().m4clone();
        bg();
    }

    public boolean aS() {
        return k == this;
    }

    public void m(final boolean z) {
        if (!this.z && !this.ab && !l.d()) {
            this.ab = true;
            k = null;
            bm();
            aO();
            this.W.g();
            l.a(z);
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.4
                @Override // java.lang.Runnable
                public void run() {
                    com.censivn.C3DEngine.b.g.d dVar;
                    com.tsf.shell.f.i.b.d.FolderItemPositioner jVar = com.tsf.shell.f.i.b.d.FolderShortcutItem.l;
                    com.tsf.shell.f.i.b.d.FolderItemPositioner.N.alpha(0.0f);
                    com.tsf.shell.f.i.b.d.FolderItemPositioner jVar2 = com.tsf.shell.f.i.b.d.FolderShortcutItem.l;
                    com.tsf.shell.f.i.b.d.FolderItemPositioner.O.alpha(0.0f);
                    if (FolderShortcutItem.this.aa != null) {
                        if (FolderShortcutItem.this.aa.parent() instanceof com.tsf.shell.f.c.b.DrawerSettingsItemType) {
                            com.tsf.shell.f.c.b.DrawerSettingsData bVarA = com.tsf.shell.manager.app.WidgetPanelController.a.a(FolderShortcutItem.this.aa);
                            FolderShortcutItem.this.L.x = bVarA.a;
                            FolderShortcutItem.this.L.y = bVarA.b;
                            FolderShortcutItem.this.M.z = bVarA.e;
                        } else {
                            Number3d.TEMPNUMBER3D.reset();
                            Number3d number3d = Number3d.TEMPNUMBER3D;
                            FolderShortcutItem.this.aa.localToGlobal(number3d);
                            FolderShortcutItem.this.L.x = number3d.x;
                            FolderShortcutItem.this.L.y = number3d.y;
                            FolderShortcutItem.this.M.z = FolderShortcutItem.this.aa.rotation().z;
                        }
                    }
                    if (z) {
                        if (FolderShortcutItem.this.aa != null) {
                            Number3d.TEMPNUMBER3D2.setAll(1.0f, 1.0f, 1.0f);
                            FolderShortcutItem.this.aa.localScaleToGlobale(Number3d.TEMPNUMBER3D2);
                            dVar = new com.censivn.C3DEngine.b.g.d();
                            dVar.f(FolderShortcutItem.this.L.x);
                            dVar.h(FolderShortcutItem.this.L.y);
                            dVar.l(Number3d.TEMPNUMBER3D2.x);
                            dVar.m(Number3d.TEMPNUMBER3D2.y);
                            dVar.a(255);
                            dVar.e(FolderShortcutItem.this.M.z);
                        } else {
                            if (com.censivn.C3DEngine.b.b.A.O) {
                                FolderShortcutItem.this.L.x = FolderShortcutItem.this.K().cellX;
                                FolderShortcutItem.this.L.y = FolderShortcutItem.this.K().cellY;
                                FolderShortcutItem.this.M.z = FolderShortcutItem.this.K().rotation;
                            } else {
                                FolderShortcutItem.this.L.x = FolderShortcutItem.this.K().cellXH;
                                FolderShortcutItem.this.L.y = FolderShortcutItem.this.K().cellYH;
                                FolderShortcutItem.this.M.z = FolderShortcutItem.this.K().rotationH;
                            }
                            dVar = new com.censivn.C3DEngine.b.g.d();
                            dVar.f(FolderShortcutItem.this.L.x);
                            dVar.h(FolderShortcutItem.this.L.y);
                            dVar.e(FolderShortcutItem.this.M.z);
                        }
                        com.censivn.C3DEngine.b.g.c.a(FolderShortcutItem.this, 380, dVar);
                    } else {
                        if (FolderShortcutItem.this.aa == null) {
                            if (com.censivn.C3DEngine.b.b.A.O) {
                                FolderShortcutItem.this.L.x = FolderShortcutItem.this.K().cellX;
                                FolderShortcutItem.this.L.y = FolderShortcutItem.this.K().cellY;
                                FolderShortcutItem.this.M.z = FolderShortcutItem.this.K().rotation;
                            } else {
                                FolderShortcutItem.this.L.x = FolderShortcutItem.this.K().cellXH;
                                FolderShortcutItem.this.L.y = FolderShortcutItem.this.K().cellYH;
                                FolderShortcutItem.this.M.z = FolderShortcutItem.this.K().rotationH;
                            }
                        }
                        FolderShortcutItem.this.position().x = FolderShortcutItem.this.L.x;
                        FolderShortcutItem.this.position().y = FolderShortcutItem.this.L.y;
                        FolderShortcutItem.this.rotation().z = FolderShortcutItem.this.M.z;
                    }
                    com.tsf.shell.manager.app.TaskScheduler.a(new Runnable() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            FolderShortcutItem.this.removeFromParent();
                            com.tsf.shell.f.i.b.d.FolderShortcutItem.l.F.removeFromParent();
                            if (FolderShortcutItem.this.aa != null) {
                                ((com.censivn.C3DEngine.b.f.j) FolderShortcutItem.this.aa.parent()).replaceChild(FolderShortcutItem.this.aa, FolderShortcutItem.this);
                                com.tsf.shell.f.c.DrawerPanelController.a(FolderShortcutItem.this.aa);
                                FolderShortcutItem.this.aa = null;
                            } else {
                                com.tsf.shell.manager.app.StateHub.n().a(FolderShortcutItem.this);
                            }
                            if (FolderShortcutItem.this.N != null) {
                                ArrayList<com.tsf.shell.f.i.ShortcutItem> arrayListAv = FolderShortcutItem.this.N.av();
                                if (arrayListAv != null && arrayListAv.size() > 0) {
                                    Iterator<com.tsf.shell.f.i.ShortcutItem> it = arrayListAv.iterator();
                                    while (it.hasNext()) {
                                        ((com.tsf.shell.f.i.b.d.FolderTouchHandler) it.next().getMouseEventListener()).a();
                                    }
                                }
                                if (!((com.tsf.shell.f.i.b.d.FolderTouchHandler) FolderShortcutItem.this.N.getMouseEventListener()).a()) {
                                    FolderShortcutItem.this.N.getMouseEventListener().d(com.censivn.C3DEngine.a.d.d().f());
                                }
                                FolderShortcutItem.this.N.mouseEnabled(true);
                                FolderShortcutItem.this.N = null;
                            }
                            FolderShortcutItem.this.mouseSkip(false);
                            com.tsf.shell.f.i.b.d.FolderShortcutItem.l.l();
                            com.tsf.shell.manager.app.TaskScheduler.b();
                            FolderShortcutItem.this.bh();
                            FolderShortcutItem.this.K = com.tsf.shell.f.i.b.d.FolderShortcutItem.b;
                            FolderShortcutItem.this.ab = false;
                            if (FolderShortcutItem.this.aC() && !FolderShortcutItem.this.ag) {
                                com.tsf.shell.manager.app.ObserverManager.c(Home.b());
                            }
                        }
                    }, z);
                }
            };
            if (com.tsf.shell.manager.b.ConfigManager.ar() == 1) {
                if (aW() == 0) {
                    a(runnable, z);
                    return;
                } else {
                    a(runnable, z);
                    return;
                }
            }
            if (aW() == 0) {
                a((Runnable) null, z);
            } else {
                a((Runnable) null, z);
            }
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bh() {
        if (aW() >= this.U) {
            this.p.setMouseEventListener(this.P);
            this.t.setMouseEventListener(this.P);
            this.I = 2;
        } else {
            this.p.setMouseEventListener(this.O);
            this.t.setMouseEventListener(this.O);
            this.I = 1;
        }
    }

    public boolean aT() {
        return aW() == 0;
    }

    public int aU() {
        return this.I;
    }

    public int aV() {
        return this.K;
    }

    protected int aW() {
        return this.o.numChildren();
    }

    void n(boolean z) {
        if (z) {
            l.a(this, aN());
        }
    }

    public void o(boolean z) {
        this.p.mouseEnabled(z);
        this.t.mouseEnabled(z);
    }

    public int b(float f, float f2) {
        float[] fArrB = com.tsf.shell.utils.GraphicsEngineBridge.b(f, f2);
        float f3 = fArrB[0];
        float f4 = fArrB[1];
        int iA = this.o.a(f3, f4);
        if (iA != -1) {
            return iA;
        }
        if (f3 > l.f || f3 < (-l.f) || f4 < (-l.g)) {
            return -2;
        }
        this.ac.x = f3;
        this.ac.y = f4;
        this.o.globalToLocal(this.ac);
        float f5 = this.ac.x + (l.i / 2);
        int i = (int) ((f5 - l.l) / l.i);
        int i2 = -((int) ((((this.ac.y - (l.j / 2)) - this.o.m()) - l.k) / l.j));
        if (i < 0) {
            i = 0;
        } else if (i > l.a - 1) {
            i = l.a - 1;
        }
        int i3 = ((i2 >= 0 ? i2 : 0) * l.a) + i;
        int iAW = aW() - 1;
        return i3 <= iAW ? i3 : iAW;
    }

    protected Number3d d(int i) {
        int i2 = l.l + ((i % l.a) * l.i);
        int i3 = l.k - ((i / l.a) * l.j);
        this.ac.x = i2;
        this.ac.y = i3;
        return this.ac;
    }

    protected void a(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar) {
        if (this.ae) {
            com.tsf.shell.manager.app.ServiceProvider.d().c();
        }
        this.o.n();
        this.N = bVar;
        this.N.mouseEnabled(false);
        n(true);
        a(bVar, true);
        m(true);
    }

    public com.censivn.C3DEngine.b.f.j aX() {
        return this.o;
    }

    public void aY() {
        int size = this.o.children().size();
        int i = l.c().folder.sampleCount;
        for (int i2 = 0; i2 < size; i2++) {
            com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) this.o.children().get((size - i2) - 1);
            if (i2 < i) {
                a(bVar, l.c().folder.sampleList.get(i2));
            } else {
                bVar.visible(false);
                a(bVar, l.c().folder.sampleList.get(i2 % l.c().folder.sampleList.size()));
            }
        }
    }

    public void a(Runnable runnable, boolean z) {
        a(true, runnable, z);
    }

    private void bi() {
        if (this.V != null) {
            this.V.a((Runnable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, final Runnable runnable, boolean z2) {
        int i;
        int i2;
        int i3;
        Runnable runnable2;
        int i4;
        int iAW = aW();
        int i5 = VEasing.Linear.easeNone;
        int i6 = 0;
        if (iAW > 0) {
            ILassoSelectable.b(this);
            int i7 = l.c().folder.sampleCount;
            com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar = null;
            int i8 = iAW - 1;
            while (i8 > -1) {
                com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar2 = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) this.o.children().get((iAW - i8) - 1);
                final com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar2Final = bVar2;
                bVar2.mouseEnabled(false);
                com.censivn.C3DEngine.b.g.d dVar = null;
                if (i8 < i7) {
                    ThemeFolderDescription.SystemFolderChild systemFolderChild = l.c().folder.sampleList.get(i8);
                    if (bVar2.scale().x == 0.0f) {
                        bVar2.position().setAllFrom(systemFolderChild.position);
                        bVar2.rotation().setAllFrom(systemFolderChild.rotation);
                    }
                    bVar2.alpha(255.0f);
                    dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.5
                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a(float f) {
                            if (bVar2Final.aJ() != 0.0f) {
                                bVar2Final.g(1.0f - f);
                            }
                        }
                    };
                    if (bVar2.position().x != systemFolderChild.position.x) {
                        dVar.f(systemFolderChild.position.x);
                    }
                    if (bVar2.position().y != systemFolderChild.position.y) {
                        dVar.h(systemFolderChild.position.y);
                    }
                    if (bVar2.position().z != systemFolderChild.position.z) {
                        dVar.j(systemFolderChild.position.z);
                    }
                    if (bVar2.rotation().x != systemFolderChild.rotation.x) {
                        dVar.c(systemFolderChild.rotation.x);
                    }
                    if (bVar2.rotation().y != systemFolderChild.rotation.y) {
                        dVar.d(systemFolderChild.rotation.y);
                    }
                    if (bVar2.rotation().z != systemFolderChild.rotation.z) {
                        dVar.e(systemFolderChild.rotation.z);
                    }
                    if (bVar2.scale().x != systemFolderChild.scale.x) {
                        dVar.l(systemFolderChild.scale.x);
                    }
                    if (bVar2.scale().y != systemFolderChild.scale.y) {
                        dVar.m(systemFolderChild.scale.y);
                    }
                    if (bVar2.scale().z != systemFolderChild.scale.z) {
                        dVar.n(systemFolderChild.scale.z);
                    }
                } else {
                    ThemeFolderDescription.SystemFolderChild systemFolderChild2 = l.c().folder.sampleList.get(i8 % i7);
                    if (bVar2.visible()) {
                        dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.6
                            @Override // com.censivn.C3DEngine.b.g.d
                            public void a() {
                                bVar2Final.visible(false);
                            }

                            @Override // com.censivn.C3DEngine.b.g.d
                            public void a(float f) {
                                if (bVar2Final.aJ() != 0.0f) {
                                    bVar2Final.g(1.0f - f);
                                }
                            }
                        };
                        if (bVar2.position().x != systemFolderChild2.position.x) {
                            dVar.f(systemFolderChild2.position.x);
                        }
                        if (bVar2.position().y != systemFolderChild2.position.y) {
                            dVar.h(systemFolderChild2.position.y);
                        }
                        if (bVar2.position().z != systemFolderChild2.position.z) {
                            dVar.j(systemFolderChild2.position.z);
                        }
                        if (bVar2.rotation().x != systemFolderChild2.rotation.x) {
                            dVar.c(systemFolderChild2.rotation.x);
                        }
                        if (bVar2.rotation().y != systemFolderChild2.rotation.y) {
                            dVar.d(systemFolderChild2.rotation.y);
                        }
                        if (bVar2.rotation().z != systemFolderChild2.rotation.z) {
                            dVar.e(systemFolderChild2.rotation.z);
                        }
                        if (bVar2.scale().x != systemFolderChild2.scale.x) {
                            dVar.l(systemFolderChild2.scale.x);
                        }
                        if (bVar2.scale().y != systemFolderChild2.scale.y) {
                            dVar.m(systemFolderChild2.scale.y);
                        }
                        if (bVar2.scale().z != systemFolderChild2.scale.z) {
                            dVar.n(systemFolderChild2.scale.z);
                        }
                        dVar.a(0);
                    } else {
                        bVar2.position().setAllFrom(systemFolderChild2.position);
                        bVar2.rotation().setAllFrom(systemFolderChild2.rotation);
                        bVar2.scale().setAllFrom(systemFolderChild2.scale);
                        bVar2.alpha(0.0f);
                    }
                }
                if (dVar != null) {
                    if (!z) {
                        i = i6;
                        i3 = i5;
                    } else if (!z2) {
                        int i9 = i6;
                        i3 = 0;
                        i = i9;
                    } else {
                        switch (com.tsf.shell.manager.b.ConfigManager.ar()) {
                            case 0:
                                i4 = VEasing.Linear.easeNone;
                                break;
                            case 1:
                                i4 = VEasing.Linear.easeNone;
                                dVar.b(i6);
                                break;
                            default:
                                i4 = VEasing.Linear.easeNone;
                                dVar.b(i6);
                                break;
                        }
                        int i10 = i6 + 40;
                        i3 = i4;
                        i = i10;
                    }
                    if (i8 == 0) {
                        if (i3 == 0) {
                            runnable2 = new Runnable() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.7
                                @Override // java.lang.Runnable
                                public void run() {
                                    com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.7.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            FolderShortcutItem.this.a(runnable);
                                        }
                                    });
                                }
                            };
                        } else {
                            runnable2 = new Runnable() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.8
                                @Override // java.lang.Runnable
                                public void run() {
                                    FolderShortcutItem.this.a(runnable);
                                }
                            };
                        }
                        dVar.a(runnable2);
                        this.V = dVar;
                        i2 = i3;
                    } else {
                        com.censivn.C3DEngine.b.g.c.a(bVar2);
                        com.censivn.C3DEngine.b.g.c.a(bVar2, i3, dVar);
                        bVar2.visible(true);
                        bVar2 = bVar;
                        i2 = i3;
                    }
                } else {
                    bVar2 = bVar;
                    i = i6;
                    i2 = i5;
                }
                i8--;
                i5 = i2;
                i6 = i;
                bVar = bVar2;
            }
            com.censivn.C3DEngine.b.g.c.a(bVar);
            com.censivn.C3DEngine.b.g.c.a(bVar, i5, this.V);
            bVar.visible(true);
            return;
        }
        a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        c(300);
        if (runnable != null) {
            runnable.run();
        }
        if (!this.A && !this.af) {
            ILassoSelectable.a(this);
            ILassoSelectable.c(this);
        }
        this.V = null;
        mouseEnabled(true);
    }

    private void a(com.censivn.C3DEngine.b.f.i iVar, ThemeFolderDescription.SystemFolderChild systemFolderChild) {
        iVar.position().setAllFrom(systemFolderChild.position);
        iVar.rotation().setAllFrom(systemFolderChild.rotation);
        iVar.scale().setAllFrom(systemFolderChild.scale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bj() {
        int iAW = aW();
        if (iAW == 0) {
            bk();
            return;
        }
        final int i0 = iAW > l.c ? iAW - l.c : 0;
        ArrayList<ThemeFolderDescription.SystemFolderChild> arrayList = l.c().folder.sampleList;
        for (int i2 = 0; i2 < i0; i2++) {
            com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) this.o.children().get((i - 1) - i2);
            if (i2 < arrayList.size()) {
                bVar.alpha(255.0f);
                bVar.visible(true);
            } else {
                bVar.alpha(0.0f);
            }
        }
        int i3 = iAW - 1;
        while (true) {
            final int i4 = i3;
            if (i4 > i0 - 1) {
                final int i9 = i0;
                final com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar2 = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) this.o.children().get(i4);
                bVar2.alpha(255.0f);
                Number3d number3dD = d((iAW - i4) - 1);
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.9
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f) {
                        bVar2.visible(true);
                        bVar2.g(FolderItemBackground);
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        if (i4 == i9) {
                            FolderShortcutItem.this.bk();
                        }
                        bVar2.mouseEnabled(true);
                    }
                };
                dVar.f(number3dD.x);
                dVar.h(number3dD.y);
                if (bVar2.position().z != 0.0f) {
                    dVar.j(0.0f);
                }
                if (bVar2.rotation().x != 0.0f) {
                    dVar.c(0.0f);
                }
                if (bVar2.rotation().y != 0.0f) {
                    dVar.d(0.0f);
                }
                if (bVar2.rotation().z != 0.0f) {
                    dVar.e(0.0f);
                }
                if (bVar2.scale().x != 1.0f) {
                    dVar.l(1.0f);
                }
                if (bVar2.scale().y != 1.0f) {
                    dVar.m(1.0f);
                }
                if (bVar2.scale().z != 1.0f) {
                    dVar.n(1.0f);
                }
                switch (com.tsf.shell.manager.b.ConfigManager.ar()) {
                    case 0:
                        break;
                    case 1:
                        dVar.b(((iAW - i4) - 1) * 40);
                        break;
                    default:
                        dVar.b(((iAW - i4) - 1) * 40);
                        break;
                }
                com.censivn.C3DEngine.b.g.c.a(bVar2);
                com.censivn.C3DEngine.b.g.c.a(bVar2, VEasing.Linear.easeNone, dVar);
                i3 = i4 - 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bk() {
        mouseEnabled(true);
        this.K = a;
        aP();
        if (aW() > 6) {
            com.tsf.shell.manager.p.TipsDialogManager.a(2);
        } else if (aW() == 0) {
            com.tsf.shell.manager.p.TipsDialogManager.a(1);
        }
        bl();
    }

    private void bl() {
        this.o.g();
    }

    private void bm() {
        this.o.h();
    }

    public void c(ArrayList<com.tsf.shell.f.i.b.e.DrawerShortcutItemBase> arrayList) {
        a(arrayList, false);
    }

    public void a(ArrayList<com.tsf.shell.f.i.b.e.DrawerShortcutItemBase> arrayList, boolean z) {
        this.ad = arrayList;
        p(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn() {
        this.ad.clear();
    }

    @Override // com.tsf.shell.f.e.h.PhotoPicker
    public n l_() {
        return null;
    }

    public void b(int i, int i2, int i3, int i4) {
        if (k == this) {
            position().y = 0 - l.m;
            l.E.position().y = l.h;
        }
        this.o.a(i, i2, i3, i4);
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void ae() {
        if (this.Z) {
            bc();
            C();
            this.Z = false;
        }
    }

    @Override // com.tsf.shell.f.e.h.PhotoPicker
    public void a(m mVar) {
        if (mVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) {
            com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) mVar;
            if (this.ad == null) {
                this.ad = new ArrayList<>();
            }
            if (bVar.ao()) {
                bVar.ar();
            }
            this.ad.add(bVar);
            bVar.setDefaultColor(com.tsf.shell.manager.o.ThemeColorConstants.c);
        }
    }

    @Override // com.tsf.shell.f.e.h.PhotoPicker
    public void f() {
        p(false);
    }

    public void p(boolean z) {
        com.censivn.C3DEngine.b.g.d dVar;
        if (this.ad != null) {
            int size = this.ad.size();
            if (size > 0) {
                ILassoSelectable.b(this);
                mouseEnabled(false);
            }
            for (int i = 0; i < size; i++) {
                final com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar = this.ad.get(FolderItemDotIndicator);
                bVar.clearDefaultColor();
                bVar.position().setAllFrom(globalToLocal(bVar.position()));
                bVar.removeFromParent();
                this.o.addChild(bVar);
                if (i == size - 1) {
                    dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.10
                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a() {
                            Iterator it = FolderShortcutItem.this.ad.iterator();
                            while (it.hasNext()) {
                                FolderShortcutItem.this.c((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) it.next());
                            }
                            FolderShortcutItem.this.n(true);
                            FolderShortcutItem.this.a(false, (Runnable) null, true);
                            FolderShortcutItem.this.aJ();
                            FolderShortcutItem.this.bn();
                            FolderShortcutItem.this.bh();
                        }

                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a(float f) {
                            bVar.g(1.0f - f);
                        }
                    };
                } else {
                    dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.11
                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a(float f) {
                            bVar.g(1.0f - f);
                        }
                    };
                }
                if (z) {
                    int i2 = l.c().folder.sampleCount;
                    com.censivn.C3DEngine.b.g.c.a(bVar);
                    if (i < size - i2) {
                        bVar.alpha(255.0f);
                        bVar.visible(false);
                    } else {
                        dVar.f(0.0f);
                        dVar.h(com.censivn.C3DEngine.b.b.A.c * 100.0f);
                        dVar.e(0.0f);
                        dVar.a(255);
                        com.censivn.C3DEngine.b.g.c.a(bVar, 500, dVar);
                    }
                } else {
                    dVar.f(0.0f);
                    dVar.h(com.censivn.C3DEngine.b.b.A.c * 100.0f);
                    dVar.e(0.0f);
                    dVar.a(255);
                    com.censivn.C3DEngine.b.g.c.a(bVar);
                    com.censivn.C3DEngine.b.g.c.a(bVar, 500, dVar);
                }
            }
        }
    }

    @Override // com.tsf.shell.f.e.a.AlignmentListener
    public void e() {
        this.z = true;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.13
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                float fAlpha = FolderShortcutItem.this.p.alpha();
                if (FolderShortcutItem.this.q != null) {
                    FolderShortcutItem.this.q.alpha(fAlpha);
                }
                FolderShortcutItem.this.r.alpha(fAlpha);
            }
        };
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.p);
        com.censivn.C3DEngine.b.g.c.a(this.p, 300, dVar);
        aF().b(0.1f);
    }

    @Override // com.tsf.shell.f.e.a.AlignmentListener
    public void i() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.FolderShortcutItem.14
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                float fAlpha = FolderShortcutItem.this.p.alpha();
                if (FolderShortcutItem.this.q != null) {
                    FolderShortcutItem.this.q.alpha(fAlpha);
                }
                FolderShortcutItem.this.r.alpha(fAlpha);
            }
        };
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.p);
        com.censivn.C3DEngine.b.g.c.a(this.p, 300, dVar);
        bg();
        this.z = false;
    }

    @Override // com.tsf.shell.f.e.a.AlignmentListener
    public void h() {
    }

    public void b(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar) {
        if (this.o.children().contains(bVar)) {
            this.o.removeChild(bVar);
            n(true);
            aJ();
            bg();
        }
    }

    @Override // com.tsf.shell.f.e.a.AlignmentListener
    public void a(com.censivn.C3DEngine.b.f.i iVar, com.tsf.shell.f.i.b.e.DrawerItemVisual gVar) {
        com.tsf.shell.f.i.b.e.DrawerItemVisual gVarBa = gVar.ba();
        Number3d.TEMPNUMBER3D3.reset();
        Number3d number3dGlobalToLocal = this.o.globalToLocal(iVar.localToGlobal(Number3d.TEMPNUMBER3D3));
        number3dGlobalToLocal.y -= this.o.l();
        gVarBa.position().x = number3dGlobalToLocal.x;
        gVarBa.position().y = number3dGlobalToLocal.y;
        Number3d number3dD = d(this.o.numChildren());
        this.o.addChildAt(gVarBa, 0);
        FolderItemGrid.a aVarA = this.o.a(0);
        aVarA.r = true;
        float f = number3dD.x;
        aVarA.a = f;
        aVarA.i = f;
        float f2 = number3dD.y;
        aVarA.b = f2;
        aVarA.j = f2;
        aVarA.s = 255.0f;
        aVarA.c = 0.0f;
        aVarA.e = 1.0f;
        c((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) gVarBa);
        gVarBa.mouseEnabled(true);
        n(true);
        this.o.b(0.2f);
        aJ();
    }

    @Override // com.tsf.shell.f.i.ShortcutItem, com.tsf.shell.f.i.PageItem
    public void c() {
        super.c();
    }

    @Override // com.tsf.shell.f.i.ShortcutItem
    public ArrayList<Integer> a(ArrayList<Integer> arrayList) {
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(4);
        if (rotation().z != 0.0f) {
            arrayList.add(6);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.f.i.PageItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public void a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        super.a(fVar);
        if (fVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) {
            this.J.a((com.censivn.C3DEngine.b.f.i) fVar);
        }
    }

    public void a(com.censivn.C3DEngine.b.f.i iVar) {
        this.J.a(iVar);
    }

    public void aZ() {
        this.A = true;
    }

    public void ba() {
        this.A = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.f.i.PageItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public void d(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        super.d(fVar);
        if (fVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) {
            this.J.b((com.censivn.C3DEngine.b.f.i) fVar);
        }
    }

    @Override // com.tsf.shell.f.i.PageItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public void c(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        super.c(fVar);
    }

    @Override // com.tsf.shell.f.i.PageItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public boolean a(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar, float f, float f2) {
        return (fVar instanceof com.tsf.shell.f.i.ShortcutItem) && ((com.tsf.shell.f.i.ShortcutItem) fVar).au();
    }

    @Override // com.tsf.shell.f.i.PageItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public boolean b(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        return fVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.f.i.PageItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public void e(com.tsf.shell.f.e.SelectionFrameLayoutItem fVar) {
        super.c(fVar);
        this.J.b((com.censivn.C3DEngine.b.f.i) fVar);
        com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) fVar;
        ArrayList<com.tsf.shell.f.i.b.e.DrawerShortcutItemBase> arrayList = new ArrayList<>();
        if (bVar.as()) {
            ArrayList<com.tsf.shell.f.i.ShortcutItem> arrayListAw = bVar.aw();
            int size = arrayListAw.size();
            for (int i = 0; i < size; i++) {
                arrayList.add((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) arrayListAw.get((size - i) - 1));
            }
        }
        arrayList.add(bVar);
        bi();
        c(arrayList);
    }

    @Override // com.tsf.shell.f.i.PageItem, com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void destroy() {
        for (com.censivn.C3DEngine.b.f.i iVar : (ArrayList<com.censivn.C3DEngine.b.f.i>) this.o.children().clone()) {
            if (iVar instanceof com.tsf.shell.f.i.PageItem) {
                com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) iVar;
                bVar.B();
                if (!this.ae) {
                    com.tsf.shell.manager.app.WidgetManager.a(bVar);
                } else {
                    iVar.removeFromParent();
                }
            }
        }
        super.destroy();
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R.a();
        com.censivn.C3DEngine.A.g().a(this.v);
        com.censivn.C3DEngine.A.g().a(this.u);
        if (this.w != null) {
            com.censivn.C3DEngine.A.g().a(this.w);
        }
        this.u = null;
        PageItem.remove(this);
    }
}
