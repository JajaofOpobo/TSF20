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
import com.censivn.C3DEngine.b.g.a;
import com.tsf.shell.Home;
import com.tsf.shell.f.e.h;
import com.tsf.shell.f.e.m;
import com.tsf.shell.f.e.n;
import com.tsf.shell.f.i.a;
import com.tsf.shell.f.i.b.d.g;
import com.tsf.shell.manager.bind.ShellModel;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends com.tsf.shell.f.i.c implements com.tsf.shell.f.e.a.a, h.a, m, a.InterfaceC0113a {
    private static ArrayList<Integer> C;
    private static ArrayList<Integer> D;
    private static ArrayList<Integer> E;
    private static ArrayList<Integer> F;
    private static com.tsf.shell.f.e.h G;
    public static b k;
    public static j l;
    public static d m;
    public static c n;
    boolean A;
    private com.tsf.shell.f.i.b.e.b H;
    private int I;
    private e J;
    private int K;
    private Number3d L;
    private Number3d M;
    private com.tsf.shell.f.i.b.e.b N;
    private com.censivn.C3DEngine.b.d.a O;
    private com.censivn.C3DEngine.b.d.a P;
    private com.censivn.C3DEngine.b.d.a Q;
    private k R;
    private com.tsf.shell.f.b.a S;
    private com.censivn.C3DEngine.b.f.j T;
    private int U;
    private com.censivn.C3DEngine.b.g.d V;
    private com.tsf.shell.f.i.a W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private com.tsf.shell.f.i.b.e.b aa;
    private boolean ab;
    private Number3d ac;
    private ArrayList<com.tsf.shell.f.i.b.e.b> ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    protected g o;
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
    private static ArrayList<b> B = new ArrayList<>();
    public static int a = 0;
    public static int b = 1;

    public static void k() {
        l = new j();
        m = new d();
        n = new c();
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
        kVar.points().setPX(0, m.g, m.f, 0.0f);
        kVar.points().setPX(1, m.e, m.f, 0.0f);
        kVar.points().setPX(2, m.g, m.h, 0.0f);
        kVar.points().setPX(3, m.e, m.h, 0.0f);
        kVar.updateUvsVBO();
        return kVar;
    }

    public static void q() {
        l.f();
        m.a();
        Iterator<b> it = B.iterator();
        while (it.hasNext()) {
            it.next().aK();
        }
        com.tsf.shell.manager.a.i.c();
    }

    public static void a(int i, int i2, int i3, int i4) {
        Iterator<b> it = B.iterator();
        while (it.hasNext()) {
            it.next().b(i, i2, i3, i4);
        }
    }

    public static b a(int i, int i2, int i3) {
        LauncherFolder3DInfo launcherFolder3DInfo = new LauncherFolder3DInfo();
        launcherFolder3DInfo.screen = i;
        launcherFolder3DInfo.cellX = i2;
        launcherFolder3DInfo.cellY = i3;
        launcherFolder3DInfo.rotation = 0;
        b bVar = new b(launcherFolder3DInfo);
        bVar.position().x = launcherFolder3DInfo.cellX;
        bVar.position().y = launcherFolder3DInfo.cellY;
        bVar.rotation().z = launcherFolder3DInfo.rotation;
        bVar.ac();
        bVar.ad();
        bVar.setMouseEventListener(new com.tsf.shell.f.i.a.c(bVar));
        com.tsf.shell.manager.a.i.d(bVar);
        return bVar;
    }

    public static b a(LauncherFolder3DInfo launcherFolder3DInfo) {
        b bVar = new b(launcherFolder3DInfo);
        bVar.setMouseEventListener(new com.tsf.shell.f.i.a.c(bVar));
        return bVar;
    }

    public b az() {
        LauncherFolder3DInfo launcherFolder3DInfo = new LauncherFolder3DInfo();
        launcherFolder3DInfo.packagename = "";
        ContentValues contentValues = new ContentValues();
        launcherFolder3DInfo.updateName(contentValues, K().title, false);
        ShellModel.a.a(contentValues, launcherFolder3DInfo, (Runnable) null);
        for (com.censivn.C3DEngine.b.f.i iVar : this.o.children()) {
            if (iVar instanceof com.tsf.shell.f.i.b.e.g) {
                LauncherShortcutAppInfo launcherShortcutAppInfoBb = ((com.tsf.shell.f.i.b.e.g) iVar).bb();
                launcherShortcutAppInfoBb.container = launcherFolder3DInfo.id;
                ShellModel.a.a(new ContentValues(), launcherShortcutAppInfoBb, (Runnable) null);
                launcherFolder3DInfo.add(launcherShortcutAppInfoBb);
            }
        }
        b bVar = new b(launcherFolder3DInfo);
        bVar.position().setAllFrom(position());
        bVar.scale().setAllFrom(scale());
        bVar.rotation().setAllFrom(rotation());
        bVar.setMouseEventListener(new com.tsf.shell.f.i.a.c(bVar));
        return bVar;
    }

    public void a(com.tsf.shell.f.i.b.e.b bVar, final com.tsf.shell.f.i.b.e.b bVar2, com.censivn.C3DEngine.b.f.i iVar) {
        if (this.H == null) {
            bVar.k.visible(false);
            bVar2.k.textures().addElement(bVar.k.textures().get(0).textureElement);
            bVar.addChild(bVar2);
            int childIndexOf = bVar.getChildIndexOf(bVar2);
            m.b(this);
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
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.b.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                b.this.n(true);
                b.this.a(false, (Runnable) null, true);
                b.this.bh();
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
        m.b(this);
        mouseEnabled(false);
        this.J.b();
        Number3d.TEMPNUMBER3D.reset();
        localToGlobal(Number3d.TEMPNUMBER3D);
        this.o.globalToLocal(Number3d.TEMPNUMBER3D);
        float f = Number3d.TEMPNUMBER3D.x;
        float f2 = Number3d.TEMPNUMBER3D.y;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.b.12
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f3) {
                b.this.H.g(f3);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) b.this.parent();
                int childIndexOf = jVar.getChildIndexOf(b.this);
                b.this.H.removeFromParent();
                jVar.children().set(childIndexOf, b.this.H);
                b.this.H.parent(jVar);
                b.this.H.position().setAllFrom(b.this.position());
                b.this.H.mouseEnabled(true);
                b.this.o.children().clear();
                b.this.parent(null);
                b.this.H = null;
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.f(f);
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

    public void a(com.tsf.shell.f.i.b.e.b bVar, com.tsf.shell.f.i.b.e.b bVar2, boolean z) {
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
        com.tsf.shell.f.i.b.e.b bVar3 = (com.tsf.shell.f.i.b.e.b) this.o.getChildAt(0);
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

    public b(ItemInfo itemInfo) {
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
        this.J = new e(this);
        j(true);
        bf();
        be();
        bd();
        if (G == null) {
            G = new com.tsf.shell.f.e.h();
        }
        this.R = new k(this);
        this.o = new g(this);
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
        com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.i) this, true);
        this.O = new com.censivn.C3DEngine.b.d.a(this.p) { // from class: com.tsf.shell.f.i.b.d.b.15
            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                b.G.a((h.a) b.this);
                b.G.a((com.censivn.C3DEngine.b.f.i) b.this);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                b.G.a(motionEvent, motionEvent2);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                b.G.a(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                w.b();
                if (b.this.K == b.b) {
                    b.this.aR();
                } else {
                    b.this.m(true);
                }
            }
        };
        this.P = new com.censivn.C3DEngine.b.d.a(this.p) { // from class: com.tsf.shell.f.i.b.d.b.16
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                b.this.R.a(motionEvent, motionEvent2);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                b.this.R.d();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                w.b();
                if (b.this.K == b.b) {
                    b.this.aR();
                } else {
                    b.this.m(true);
                }
            }
        };
        this.Q = new com.censivn.C3DEngine.b.d.a(this.p) { // from class: com.tsf.shell.f.i.b.d.b.17
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                w.b();
                if (b.this.K == b.b) {
                    b.this.aR();
                } else {
                    b.this.m(true);
                }
            }
        };
        this.W = new com.tsf.shell.f.i.a(this, this) { // from class: com.tsf.shell.f.i.b.d.b.18
            @Override // com.tsf.shell.f.i.a
            public void h() {
            }

            @Override // com.tsf.shell.f.i.a
            public void a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
            @Override // com.tsf.shell.f.i.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean a(com.tsf.shell.f.i.b.e.b r5) {
                /*
                    r4 = this;
                    r3 = 1
                    r2 = 0
                    com.tsf.shell.f.i.b.d.b r0 = com.tsf.shell.f.i.b.d.b.this
                    int r0 = r0.aU()
                    r1 = 2
                    if (r0 != r1) goto L30
                    com.tsf.shell.f.i.b.d.b r0 = com.tsf.shell.f.i.b.d.b.this
                    com.tsf.shell.f.i.b.d.k r0 = com.tsf.shell.f.i.b.d.b.d(r0)
                    r0.e()
                    com.tsf.shell.f.i.b.d.b r0 = com.tsf.shell.f.i.b.d.b.this
                    com.tsf.shell.f.i.b.d.k r0 = com.tsf.shell.f.i.b.d.b.d(r0)
                    boolean r0 = r0.c()
                    if (r0 == 0) goto L30
                    boolean r0 = com.tsf.shell.manager.b.e.as()
                    if (r0 == 0) goto L30
                    com.tsf.shell.f.i.b.d.b r0 = com.tsf.shell.f.i.b.d.b.this
                    com.tsf.shell.f.i.b.d.k r0 = com.tsf.shell.f.i.b.d.b.d(r0)
                    r0.a(r2)
                L2f:
                    return r3
                L30:
                    boolean r0 = com.tsf.shell.manager.b.e.as()
                    if (r0 == 0) goto L2f
                    com.tsf.shell.f.i.b.d.b r0 = com.tsf.shell.f.i.b.d.b.this
                    r0.m(r2)
                    goto L2f
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.i.b.d.b.AnonymousClass18.a(com.tsf.shell.f.i.b.e.b):boolean");
            }

            @Override // com.tsf.shell.f.i.a
            public void b(com.tsf.shell.f.i.b bVar) {
                if (bVar.visible() && bVar.alpha() != 0.0f) {
                    b.this.aQ();
                }
            }

            @Override // com.tsf.shell.f.i.a
            public void c(com.tsf.shell.f.i.b bVar) {
                super.c(bVar);
                if (b.this.K == b.a) {
                    b.this.b((com.tsf.shell.f.i.b.e.b) bVar);
                    return;
                }
                int iA = b.this.o.a(bVar);
                b.this.o.removeChild(bVar);
                b.this.a((com.tsf.shell.f.i.b.e.b) bVar, false);
                if (iA < b.l.K) {
                    b.this.aB();
                    b.m.a(b.this);
                    b.m.c(b.this);
                }
            }
        };
        this.S = new com.tsf.shell.f.b.a() { // from class: com.tsf.shell.f.i.b.d.b.19
            @Override // com.tsf.shell.f.b.a, com.censivn.C3DEngine.b.c.b.a
            public void a(int i, KeyEvent keyEvent) {
                if (i == 4 && b.this.K == b.a && b.this.mouseEnabled() && !b.this.o.v()) {
                    b.this.m(true);
                }
            }

            @Override // com.tsf.shell.f.b.a, com.censivn.C3DEngine.b.c.b.a
            public void b(int i, KeyEvent keyEvent) {
            }
        };
        ArrayList<ItemInfo> arrayListA = com.tsf.shell.utils.h.a(((LauncherFolder3DInfo) itemInfo).getItemInfo(), itemInfo.config, ",", true);
        int size = arrayListA.size();
        for (int i = 0; i < size; i++) {
            ItemInfo itemInfo2 = arrayListA.get(i);
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
        m.a(this);
        m.c(this);
        if (!B.contains(this)) {
            B.add(this);
        }
    }

    public void b(int i) {
        Collections.sort(this.o.children(), com.tsf.shell.manager.a.w.b().a(i).b());
        this.o.k();
        this.o.o();
        aJ();
    }

    public void aB() {
        int iAW = aW() > l.K ? l.K : aW();
        for (int i = 0; i < iAW; i++) {
            com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) this.o.children().get((aW() - i) - 1);
            a(bVar, l.L.get(i));
            bVar.visible(true);
            bVar.alpha(255.0f);
        }
    }

    public boolean aC() {
        return K() instanceof LauncherDrawerFolder3DInfo;
    }

    public TextureElement aD() {
        return this.u;
    }

    @Override // com.tsf.shell.f.i.a.InterfaceC0113a
    public ArrayList<com.censivn.C3DEngine.b.f.i> b() {
        return this.o.children();
    }

    private void a(ItemInfo itemInfo, boolean z) {
        com.tsf.shell.f.i.b.e.b bVarA = (com.tsf.shell.f.i.b.e.b) itemInfo.getWidget();
        if (bVarA == null) {
            bVarA = com.tsf.shell.manager.l.a.a(itemInfo, z);
        }
        bVarA.g(0.0f);
        bVarA.mouseEnabled(false);
        this.o.addChild(bVarA);
        bVarA.setMouseEventListener(new a(bVarA, this));
        bVarA.a(this.W);
    }

    public com.tsf.shell.f.i.a aE() {
        return this.W;
    }

    public g aF() {
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
            l.a(this, aN());
        }
        m.a(this);
        this.X = false;
    }

    public ComponentName[] aI() {
        int size = this.o.children().size();
        ComponentName[] componentNameArr = new ComponentName[size];
        for (int i = 0; i < size; i++) {
            componentNameArr[i] = ((com.tsf.shell.f.i.b.e.g) this.o.children().get(i)).bd().b;
        }
        return componentNameArr;
    }

    public void aJ() {
        if (!this.af) {
            LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) K();
            int size = this.o.children().size();
            String str = "";
            for (int i = 0; i < size; i++) {
                str = str + ((com.tsf.shell.f.i.b.e.b) this.o.children().get(i)).K().id + ",";
            }
            if (this.ae) {
                launcherFolder3DInfo.config = str;
                com.tsf.shell.manager.a.w.c().a(launcherFolder3DInfo, 16);
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
        com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.i) this, true);
        l.a(this, aN());
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
            this.t = new com.censivn.C3DEngine.b.f.k(m.c, m.d, 1, 1, false);
        }
        if (!this.af) {
            if (this.u == null) {
                this.u = com.censivn.C3DEngine.a.g().a(m.c, m.d, false);
            } else if (this.u.width != m.c || this.u.height != m.d) {
                com.censivn.C3DEngine.a.g().a(this.u);
                this.u = com.censivn.C3DEngine.a.g().a(m.c, m.d, false);
            }
            this.t.textures().clear();
            this.t.textures().addElement(this.u);
        }
        this.t.points().setPX(0, m.g, m.f, 0.0f);
        this.t.points().setPX(1, m.e, m.f, 0.0f);
        this.t.points().setPX(2, m.g, m.h, 0.0f);
        this.t.points().setPX(3, m.e, m.h, 0.0f);
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
            com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.i) this.p, -this.p.position().x, -this.p.position().y, true);
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
    public void c(com.tsf.shell.f.i.b.e.b bVar) {
        if (this.ae) {
            if (!this.af) {
                if (K().id == -1) {
                    com.tsf.shell.manager.a.w.c().a(K(), 0);
                }
                bVar.K().container = K().id;
                com.tsf.shell.manager.a.w.c().a(bVar.K(), 132);
            }
        } else {
            bVar.K().onUpdateContainer(K().id);
        }
        bVar.setMouseEventListener(new a(bVar, this));
        bVar.a(this.W);
        this.W.a((com.censivn.C3DEngine.b.f.i) bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.f.i.b.e.b bVar, boolean z) {
        ArrayList<com.tsf.shell.f.i.c> arrayListAv = bVar.av();
        if (arrayListAv != null && arrayListAv.size() > 0) {
            for (com.tsf.shell.f.i.c cVar : arrayListAv) {
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
                com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.i) this.p, -this.p.position().x, -this.p.position().y, false);
                com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.i) this.t, false);
                com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.i) this, false);
                m.a(this);
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
                com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.i) this.p, -this.p.position().x, -this.p.position().y, true);
                com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.i) this.t, true);
                com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.i) this, true);
                m.a(this);
            }
        }
    }

    public CharSequence aN() {
        return K().title;
    }

    public void a(final String str) {
        int i = 1;
        if (str != "") {
            if (this.ae) {
                LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) K();
                launcherFolder3DInfo.title = str;
                com.tsf.shell.manager.a.w.c().a(launcherFolder3DInfo, 1);
            } else {
                K().onUpdateName(str, false);
            }
            com.censivn.C3DEngine.a.a().c(new RenderRunnable(i, i) { // from class: com.tsf.shell.f.i.b.d.b.20
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    b.l.a(b.this, str);
                    b.l.a(str);
                    if (b.this.x) {
                        b.m.a(b.this);
                    }
                }
            });
            invalidate();
        }
    }

    private void bg() {
    }

    public void aO() {
        com.tsf.shell.d.a().a("WidgetFolderBox");
    }

    public void aP() {
        com.tsf.shell.d.a().b("WidgetFolderBox");
    }

    public void c(int i) {
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.21
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.d.a().b("WidgetFolderBox");
            }
        }, i);
    }

    public void aQ() {
        if (!this.Z) {
            this.Z = true;
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.2
                @Override // java.lang.Runnable
                public void run() {
                    b.this.bc();
                    b.this.C();
                    b.this.Z = false;
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
        aH().alpha(f);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public float alpha() {
        return aH().alpha();
    }

    @Override // com.tsf.shell.f.i.b, com.tsf.shell.f.e.f
    public int m() {
        return 1;
    }

    @Override // com.tsf.shell.f.e.m
    public boolean e_() {
        return this.Y;
    }

    @Override // com.tsf.shell.f.e.m
    public void b(boolean z) {
        this.Y = z;
    }

    @Override // com.tsf.shell.f.e.m
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
        m.b(this);
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
            this.aa = com.tsf.shell.f.c.a(this);
            ((com.censivn.C3DEngine.b.f.j) parent()).replaceChild(this, this.aa);
            position().setAllFrom(Number3d.TEMPNUMBER3D);
            scale().setAllFrom(Number3d.TEMPNUMBER3D2);
            if (aC()) {
                this.ag = com.tsf.shell.manager.a.b.a();
                com.tsf.shell.manager.a.b.b(Home.b());
            }
        }
        this.T = com.tsf.shell.manager.a.j.a(this.S);
        switch (com.tsf.shell.manager.b.e.ar()) {
            case 0:
                dVar = new com.censivn.C3DEngine.b.g.d();
                bj();
                dVar.a((com.censivn.C3DEngine.b.g.b) new a.b.c());
                break;
            case 1:
                dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.b.3
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        b.this.bj();
                    }
                };
                dVar.a((com.censivn.C3DEngine.b.g.b) new a.b.c());
                break;
            default:
                dVar = new com.censivn.C3DEngine.b.g.d();
                bj();
                dVar.a((com.censivn.C3DEngine.b.g.b) new a.b.c());
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
        com.tsf.shell.manager.a.j.c();
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
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.4
                @Override // java.lang.Runnable
                public void run() {
                    com.censivn.C3DEngine.b.g.d dVar;
                    j jVar = b.l;
                    j.N.alpha(0.0f);
                    j jVar2 = b.l;
                    j.O.alpha(0.0f);
                    if (b.this.aa != null) {
                        if (b.this.aa.parent() instanceof com.tsf.shell.f.c.b.a) {
                            com.tsf.shell.f.c.b.b bVarA = com.tsf.shell.manager.a.g.a.a(b.this.aa);
                            b.this.L.x = bVarA.a;
                            b.this.L.y = bVarA.b;
                            b.this.M.z = bVarA.e;
                        } else {
                            Number3d.TEMPNUMBER3D.reset();
                            Number3d number3d = Number3d.TEMPNUMBER3D;
                            b.this.aa.localToGlobal(number3d);
                            b.this.L.x = number3d.x;
                            b.this.L.y = number3d.y;
                            b.this.M.z = b.this.aa.rotation().z;
                        }
                    }
                    if (z) {
                        if (b.this.aa != null) {
                            Number3d.TEMPNUMBER3D2.setAll(1.0f, 1.0f, 1.0f);
                            b.this.aa.localScaleToGlobale(Number3d.TEMPNUMBER3D2);
                            dVar = new com.censivn.C3DEngine.b.g.d();
                            dVar.f(b.this.L.x);
                            dVar.h(b.this.L.y);
                            dVar.l(Number3d.TEMPNUMBER3D2.x);
                            dVar.m(Number3d.TEMPNUMBER3D2.y);
                            dVar.a(255);
                            dVar.e(b.this.M.z);
                        } else {
                            if (com.censivn.C3DEngine.b.b.a.O) {
                                b.this.L.x = b.this.K().cellX;
                                b.this.L.y = b.this.K().cellY;
                                b.this.M.z = b.this.K().rotation;
                            } else {
                                b.this.L.x = b.this.K().cellXH;
                                b.this.L.y = b.this.K().cellYH;
                                b.this.M.z = b.this.K().rotationH;
                            }
                            dVar = new com.censivn.C3DEngine.b.g.d();
                            dVar.f(b.this.L.x);
                            dVar.h(b.this.L.y);
                            dVar.e(b.this.M.z);
                        }
                        com.censivn.C3DEngine.b.g.c.a(b.this, 380, dVar);
                    } else {
                        if (b.this.aa == null) {
                            if (com.censivn.C3DEngine.b.b.a.O) {
                                b.this.L.x = b.this.K().cellX;
                                b.this.L.y = b.this.K().cellY;
                                b.this.M.z = b.this.K().rotation;
                            } else {
                                b.this.L.x = b.this.K().cellXH;
                                b.this.L.y = b.this.K().cellYH;
                                b.this.M.z = b.this.K().rotationH;
                            }
                        }
                        b.this.position().x = b.this.L.x;
                        b.this.position().y = b.this.L.y;
                        b.this.rotation().z = b.this.M.z;
                    }
                    com.tsf.shell.manager.a.j.a(new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.removeFromParent();
                            b.l.F.removeFromParent();
                            if (b.this.aa != null) {
                                ((com.censivn.C3DEngine.b.f.j) b.this.aa.parent()).replaceChild(b.this.aa, b.this);
                                com.tsf.shell.f.c.a(b.this.aa);
                                b.this.aa = null;
                            } else {
                                com.tsf.shell.manager.a.h.n().a(b.this);
                            }
                            if (b.this.N != null) {
                                ArrayList<com.tsf.shell.f.i.c> arrayListAv = b.this.N.av();
                                if (arrayListAv != null && arrayListAv.size() > 0) {
                                    Iterator<com.tsf.shell.f.i.c> it = arrayListAv.iterator();
                                    while (it.hasNext()) {
                                        ((a) it.next().getMouseEventListener()).a();
                                    }
                                }
                                if (!((a) b.this.N.getMouseEventListener()).a()) {
                                    b.this.N.getMouseEventListener().d(com.censivn.C3DEngine.a.d.d().f());
                                }
                                b.this.N.mouseEnabled(true);
                                b.this.N = null;
                            }
                            b.this.mouseSkip(false);
                            b.l.l();
                            com.tsf.shell.manager.a.j.b();
                            b.this.bh();
                            b.this.K = b.b;
                            b.this.ab = false;
                            if (b.this.aC() && !b.this.ag) {
                                com.tsf.shell.manager.a.b.c(Home.b());
                            }
                        }
                    }, z);
                }
            };
            if (com.tsf.shell.manager.b.e.ar() == 1) {
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
        float[] fArrB = x.b(f, f2);
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

    protected void a(com.tsf.shell.f.i.b.e.b bVar) {
        if (this.ae) {
            com.tsf.shell.manager.a.w.d().c();
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
            com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) this.o.children().get((size - i2) - 1);
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
            m.b(this);
            int i7 = l.c().folder.sampleCount;
            com.tsf.shell.f.i.b.e.b bVar = null;
            int i8 = iAW - 1;
            while (i8 > -1) {
                final com.tsf.shell.f.i.b.e.b bVar2 = (com.tsf.shell.f.i.b.e.b) this.o.children().get((iAW - i8) - 1);
                bVar2.mouseEnabled(false);
                com.censivn.C3DEngine.b.g.d dVar = null;
                if (i8 < i7) {
                    ThemeFolderDescription.SystemFolderChild systemFolderChild = l.c().folder.sampleList.get(i8);
                    if (bVar2.scale().x == 0.0f) {
                        bVar2.position().setAllFrom(systemFolderChild.position);
                        bVar2.rotation().setAllFrom(systemFolderChild.rotation);
                    }
                    bVar2.alpha(255.0f);
                    dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.b.5
                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a(float f) {
                            if (bVar2.aJ() != 0.0f) {
                                bVar2.g(1.0f - f);
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
                        dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.b.6
                            @Override // com.censivn.C3DEngine.b.g.d
                            public void a() {
                                bVar2.visible(false);
                            }

                            @Override // com.censivn.C3DEngine.b.g.d
                            public void a(float f) {
                                if (bVar2.aJ() != 0.0f) {
                                    bVar2.g(1.0f - f);
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
                        switch (com.tsf.shell.manager.b.e.ar()) {
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
                            runnable2 = new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.7
                                @Override // java.lang.Runnable
                                public void run() {
                                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.7.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            b.this.a(runnable);
                                        }
                                    });
                                }
                            };
                        } else {
                            runnable2 = new Runnable() { // from class: com.tsf.shell.f.i.b.d.b.8
                                @Override // java.lang.Runnable
                                public void run() {
                                    b.this.a(runnable);
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
            m.a(this);
            m.c(this);
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
        final int i = iAW > l.c ? iAW - l.c : 0;
        ArrayList<ThemeFolderDescription.SystemFolderChild> arrayList = l.c().folder.sampleList;
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) this.o.children().get((i - 1) - i2);
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
            if (i4 > i - 1) {
                final com.tsf.shell.f.i.b.e.b bVar2 = (com.tsf.shell.f.i.b.e.b) this.o.children().get(i4);
                bVar2.alpha(255.0f);
                Number3d number3dD = d((iAW - i4) - 1);
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.b.9
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f) {
                        bVar2.visible(true);
                        bVar2.g(f);
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        if (i4 == i) {
                            b.this.bk();
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
                switch (com.tsf.shell.manager.b.e.ar()) {
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
            com.tsf.shell.manager.p.c.a(2);
        } else if (aW() == 0) {
            com.tsf.shell.manager.p.c.a(1);
        }
        bl();
    }

    private void bl() {
        this.o.g();
    }

    private void bm() {
        this.o.h();
    }

    public void c(ArrayList<com.tsf.shell.f.i.b.e.b> arrayList) {
        a(arrayList, false);
    }

    public void a(ArrayList<com.tsf.shell.f.i.b.e.b> arrayList, boolean z) {
        this.ad = arrayList;
        p(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn() {
        this.ad.clear();
    }

    @Override // com.tsf.shell.f.e.h.a
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

    @Override // com.tsf.shell.f.i.b
    public void ae() {
        if (this.Z) {
            bc();
            C();
            this.Z = false;
        }
    }

    @Override // com.tsf.shell.f.e.h.a
    public void a(m mVar) {
        if (mVar instanceof com.tsf.shell.f.i.b.e.b) {
            com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) mVar;
            if (this.ad == null) {
                this.ad = new ArrayList<>();
            }
            if (bVar.ao()) {
                bVar.ar();
            }
            this.ad.add(bVar);
            bVar.setDefaultColor(com.tsf.shell.manager.o.c.c);
        }
    }

    @Override // com.tsf.shell.f.e.h.a
    public void f() {
        p(false);
    }

    public void p(boolean z) {
        com.censivn.C3DEngine.b.g.d dVar;
        if (this.ad != null) {
            int size = this.ad.size();
            if (size > 0) {
                m.b(this);
                mouseEnabled(false);
            }
            for (int i = 0; i < size; i++) {
                final com.tsf.shell.f.i.b.e.b bVar = this.ad.get(i);
                bVar.clearDefaultColor();
                bVar.position().setAllFrom(globalToLocal(bVar.position()));
                bVar.removeFromParent();
                this.o.addChild(bVar);
                if (i == size - 1) {
                    dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.b.10
                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a() {
                            Iterator it = b.this.ad.iterator();
                            while (it.hasNext()) {
                                b.this.c((com.tsf.shell.f.i.b.e.b) it.next());
                            }
                            b.this.n(true);
                            b.this.a(false, (Runnable) null, true);
                            b.this.aJ();
                            b.this.bn();
                            b.this.bh();
                        }

                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a(float f) {
                            bVar.g(1.0f - f);
                        }
                    };
                } else {
                    dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.b.11
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
                        dVar.h(com.censivn.C3DEngine.b.b.a.c * 100.0f);
                        dVar.e(0.0f);
                        dVar.a(255);
                        com.censivn.C3DEngine.b.g.c.a(bVar, 500, dVar);
                    }
                } else {
                    dVar.f(0.0f);
                    dVar.h(com.censivn.C3DEngine.b.b.a.c * 100.0f);
                    dVar.e(0.0f);
                    dVar.a(255);
                    com.censivn.C3DEngine.b.g.c.a(bVar);
                    com.censivn.C3DEngine.b.g.c.a(bVar, 500, dVar);
                }
            }
        }
    }

    @Override // com.tsf.shell.f.e.a.a
    public void e() {
        this.z = true;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.b.13
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                float fAlpha = b.this.p.alpha();
                if (b.this.q != null) {
                    b.this.q.alpha(fAlpha);
                }
                b.this.r.alpha(fAlpha);
            }
        };
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.p);
        com.censivn.C3DEngine.b.g.c.a(this.p, 300, dVar);
        aF().b(0.1f);
    }

    @Override // com.tsf.shell.f.e.a.a
    public void i() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.b.d.b.14
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                float fAlpha = b.this.p.alpha();
                if (b.this.q != null) {
                    b.this.q.alpha(fAlpha);
                }
                b.this.r.alpha(fAlpha);
            }
        };
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this.p);
        com.censivn.C3DEngine.b.g.c.a(this.p, 300, dVar);
        bg();
        this.z = false;
    }

    @Override // com.tsf.shell.f.e.a.a
    public void h() {
    }

    public void b(com.tsf.shell.f.i.b.e.b bVar) {
        if (this.o.children().contains(bVar)) {
            this.o.removeChild(bVar);
            n(true);
            aJ();
            bg();
        }
    }

    @Override // com.tsf.shell.f.e.a.a
    public void a(com.censivn.C3DEngine.b.f.i iVar, com.tsf.shell.f.i.b.e.g gVar) {
        com.tsf.shell.f.i.b.e.g gVarBa = gVar.ba();
        Number3d.TEMPNUMBER3D3.reset();
        Number3d number3dGlobalToLocal = this.o.globalToLocal(iVar.localToGlobal(Number3d.TEMPNUMBER3D3));
        number3dGlobalToLocal.y -= this.o.l();
        gVarBa.position().x = number3dGlobalToLocal.x;
        gVarBa.position().y = number3dGlobalToLocal.y;
        Number3d number3dD = d(this.o.numChildren());
        this.o.addChildAt(gVarBa, 0);
        g.a aVarA = this.o.a(0);
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
        c((com.tsf.shell.f.i.b.e.b) gVarBa);
        gVarBa.mouseEnabled(true);
        n(true);
        this.o.b(0.2f);
        aJ();
    }

    @Override // com.tsf.shell.f.i.c, com.tsf.shell.f.i.b
    public void c() {
        super.c();
    }

    @Override // com.tsf.shell.f.i.c
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
    @Override // com.tsf.shell.f.i.b, com.tsf.shell.f.e.f
    public void a(com.tsf.shell.f.e.f fVar) {
        super.a(fVar);
        if (fVar instanceof com.tsf.shell.f.i.b.e.b) {
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
    @Override // com.tsf.shell.f.i.b, com.tsf.shell.f.e.f
    public void d(com.tsf.shell.f.e.f fVar) {
        super.d(fVar);
        if (fVar instanceof com.tsf.shell.f.i.b.e.b) {
            this.J.b((com.censivn.C3DEngine.b.f.i) fVar);
        }
    }

    @Override // com.tsf.shell.f.i.b, com.tsf.shell.f.e.f
    public void c(com.tsf.shell.f.e.f fVar) {
        super.c(fVar);
    }

    @Override // com.tsf.shell.f.i.b, com.tsf.shell.f.e.f
    public boolean a(com.tsf.shell.f.e.f fVar, float f, float f2) {
        return (fVar instanceof com.tsf.shell.f.i.c) && ((com.tsf.shell.f.i.c) fVar).au();
    }

    @Override // com.tsf.shell.f.i.b, com.tsf.shell.f.e.f
    public boolean b(com.tsf.shell.f.e.f fVar) {
        return fVar instanceof com.tsf.shell.f.i.b.e.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.f.i.b, com.tsf.shell.f.e.f
    public void e(com.tsf.shell.f.e.f fVar) {
        super.c(fVar);
        this.J.b((com.censivn.C3DEngine.b.f.i) fVar);
        com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) fVar;
        ArrayList<com.tsf.shell.f.i.b.e.b> arrayList = new ArrayList<>();
        if (bVar.as()) {
            ArrayList<com.tsf.shell.f.i.c> arrayListAw = bVar.aw();
            int size = arrayListAw.size();
            for (int i = 0; i < size; i++) {
                arrayList.add((com.tsf.shell.f.i.b.e.b) arrayListAw.get((size - i) - 1));
            }
        }
        arrayList.add(bVar);
        bi();
        c(arrayList);
    }

    @Override // com.tsf.shell.f.i.b, com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void destroy() {
        for (com.censivn.C3DEngine.b.f.i iVar : (ArrayList) this.o.children().clone()) {
            if (iVar instanceof com.tsf.shell.f.i.b) {
                com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) iVar;
                bVar.B();
                if (!this.ae) {
                    com.tsf.shell.manager.a.i.a(bVar);
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
        com.censivn.C3DEngine.a.g().a(this.v);
        com.censivn.C3DEngine.a.g().a(this.u);
        if (this.w != null) {
            com.censivn.C3DEngine.a.g().a(this.w);
        }
        this.u = null;
        B.remove(this);
    }
}
