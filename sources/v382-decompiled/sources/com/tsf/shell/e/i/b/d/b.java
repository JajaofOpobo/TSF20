package com.tsf.shell.e.i.b.d;

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
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.v;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.Home;
import com.tsf.shell.e.e.p;
import com.tsf.shell.e.e.q;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b extends com.tsf.shell.e.i.e implements com.tsf.shell.e.e.a.a, com.tsf.shell.e.e.j, p, com.tsf.shell.e.i.b {
    private static ArrayList C;
    private static ArrayList D;
    private static ArrayList E;
    private static ArrayList F;
    private static com.tsf.shell.e.e.i G;
    public static b k;
    public static k l;
    public static d m;
    public static c n;
    boolean A;
    private com.tsf.shell.e.i.b.e.b H;
    private int I;
    private e J;
    private int K;
    private Number3d L;
    private Number3d M;
    private com.tsf.shell.e.i.b.e.b N;
    private com.censivn.C3DEngine.b.d.a O;
    private com.censivn.C3DEngine.b.d.a P;
    private com.censivn.C3DEngine.b.d.a Q;
    private l R;
    private com.tsf.shell.e.b.a S;
    private com.censivn.C3DEngine.b.f.l T;
    private int U;
    private x V;
    private com.tsf.shell.e.i.a W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private com.tsf.shell.e.i.b.e.b aa;
    private boolean ab;
    private Number3d ac;
    private ArrayList ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    protected g o;
    protected m p;
    protected m q;
    protected m r;
    protected m s;
    protected m t;
    protected TextureElement u;
    protected TextureElement v;
    protected TextureElement w;
    protected boolean x;
    protected boolean y;
    protected boolean z;
    private static ArrayList B = new ArrayList();
    public static int a = 0;
    public static int b = 1;

    public static void k() {
        l = new k();
        m = new d();
        n = new c();
        D = new ArrayList();
        D.add(7);
        D.add(6);
        E = new ArrayList();
        E.add(7);
        E.add(6);
        E.add(4);
        E.add(2);
        E.add(1);
        C = new ArrayList();
        C.add(4);
        F = new ArrayList();
    }

    public static m l() {
        m mVar = new m(0.0f, 0.0f, false);
        mVar.uvs().set(0, 1.0f, 0.0f);
        mVar.uvs().set(1, 0.0f, 0.0f);
        mVar.uvs().set(2, 1.0f, 1.0f);
        mVar.uvs().set(3, 0.0f, 1.0f);
        mVar.points().setPX(0, m.g, m.f, 0.0f);
        mVar.points().setPX(1, m.e, m.f, 0.0f);
        mVar.points().setPX(2, m.g, m.h, 0.0f);
        mVar.points().setPX(3, m.e, m.h, 0.0f);
        mVar.updateUvsVBO();
        return mVar;
    }

    public static void q() {
        l.f();
        m.a();
        Iterator it = B.iterator();
        while (it.hasNext()) {
            ((b) it.next()).aK();
        }
        com.tsf.shell.manager.a.i.c();
    }

    public static void a(int i, int i2, int i3, int i4) {
        Iterator it = B.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(i, i2, i3, i4);
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
        bVar.setMouseEventListener(new com.tsf.shell.e.i.a.c(bVar));
        com.tsf.shell.manager.a.i.c(bVar);
        return bVar;
    }

    public static b a(LauncherFolder3DInfo launcherFolder3DInfo) {
        b bVar = new b(launcherFolder3DInfo);
        bVar.setMouseEventListener(new com.tsf.shell.e.i.a.c(bVar));
        return bVar;
    }

    public b az() {
        LauncherFolder3DInfo launcherFolder3DInfo = new LauncherFolder3DInfo();
        launcherFolder3DInfo.packagename = "";
        ContentValues contentValues = new ContentValues();
        launcherFolder3DInfo.updateName(contentValues, K().title, false);
        com.tsf.shell.manager.bind.d.a(contentValues, launcherFolder3DInfo, (Runnable) null);
        Iterator it = this.o.children().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
            if (jVar instanceof com.tsf.shell.e.i.b.e.i) {
                LauncherShortcutAppInfo bb = ((com.tsf.shell.e.i.b.e.i) jVar).bb();
                bb.container = launcherFolder3DInfo.id;
                com.tsf.shell.manager.bind.d.a(new ContentValues(), bb, (Runnable) null);
                launcherFolder3DInfo.add(bb);
            }
        }
        b bVar = new b(launcherFolder3DInfo);
        bVar.position().setAllFrom(position());
        bVar.scale().setAllFrom(scale());
        bVar.rotation().setAllFrom(rotation());
        bVar.setMouseEventListener(new com.tsf.shell.e.i.a.c(bVar));
        return bVar;
    }

    public void a(com.tsf.shell.e.i.b.e.b bVar, final com.tsf.shell.e.i.b.e.b bVar2, com.censivn.C3DEngine.b.f.j jVar) {
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
        x xVar = new x() { // from class: com.tsf.shell.e.i.b.d.b.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                b.this.n(true);
                b.this.a(false, (Runnable) null, true);
                b.this.bh();
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                bVar2.g(1.0f - f);
            }
        };
        xVar.f(0.0f);
        xVar.h(60.0f);
        xVar.e(0.0f);
        w.a(bVar2);
        w.a(bVar2, 500, xVar);
        this.J.a(0.0f);
        a(jVar);
    }

    public void a(com.censivn.C3DEngine.b.f.j jVar, final Runnable runnable) {
        m.b(this);
        mouseEnabled(false);
        this.J.b();
        Number3d.TEMPNUMBER3D.reset();
        localToGlobal(Number3d.TEMPNUMBER3D);
        this.o.globalToLocal(Number3d.TEMPNUMBER3D);
        float f = Number3d.TEMPNUMBER3D.x;
        float f2 = Number3d.TEMPNUMBER3D.y;
        x xVar = new x() { // from class: com.tsf.shell.e.i.b.d.b.12
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f3) {
                b.this.H.g(f3);
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                com.censivn.C3DEngine.b.f.l lVar = (com.censivn.C3DEngine.b.f.l) b.this.parent();
                int childIndexOf = lVar.getChildIndexOf(b.this);
                b.this.H.removeFromParent();
                lVar.children().set(childIndexOf, b.this.H);
                b.this.H.parent(lVar);
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
        xVar.l(1.0f);
        xVar.m(1.0f);
        xVar.f(f);
        xVar.h(f2);
        xVar.e(0.0f);
        w.a(this.H);
        w.a(this.H, 300, xVar);
        if (jVar != null) {
            x xVar2 = new x();
            xVar2.l(1.0f);
            xVar2.m(1.0f);
            w.a(jVar);
            w.a(jVar, 300, xVar2);
        }
    }

    public void a(com.tsf.shell.e.i.b.e.b bVar, com.tsf.shell.e.i.b.e.b bVar2, boolean z) {
        ItemInfo K = K();
        if (!z && (K instanceof LauncherDrawerFolder3DInfo)) {
            a(new LauncherFolder3DInfo());
            this.ae = false;
            this.af = false;
            this.o.a(D, C);
        }
        if (K instanceof LauncherDrawerFolder3DInfo) {
            ((LauncherDrawerFolder3DInfo) K).isPreviewFolder = false;
            this.af = false;
        }
        com.censivn.C3DEngine.b.f.l lVar = (com.censivn.C3DEngine.b.f.l) bVar.parent();
        lVar.children().set(lVar.getChildIndexOf(bVar), this);
        parent(lVar);
        position().setAllFrom(bVar.position());
        rotation().setAllFrom(bVar.rotation());
        scale().setAllFrom(bVar.scale());
        com.tsf.shell.e.i.b.e.b bVar3 = (com.tsf.shell.e.i.b.e.b) this.o.getChildAt(0);
        w.a(bVar3);
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

    public com.censivn.C3DEngine.b.f.j aA() {
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
            G = new com.tsf.shell.e.e.i();
        }
        this.R = new l(this);
        this.o = new g(this);
        if (this.ae) {
            this.o.a(E, F);
        } else {
            this.o.a(D, C);
        }
        this.o.position().x = l.c().folder.childContainerX;
        this.o.position().y = l.c().folder.childContainerY;
        Iterator it = l.c().folder.order.iterator();
        while (it.hasNext()) {
            switch (((Integer) it.next()).intValue()) {
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
        com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.j) this, true);
        this.O = new com.censivn.C3DEngine.b.d.a(this.p) { // from class: com.tsf.shell.e.i.b.d.b.15
            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                b.G.a((com.tsf.shell.e.e.j) b.this);
                b.G.a((com.censivn.C3DEngine.b.f.j) b.this);
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
                com.tsf.shell.utils.w.b();
                if (b.this.K == b.b) {
                    b.this.aR();
                } else {
                    b.this.m(true);
                }
            }
        };
        this.P = new com.censivn.C3DEngine.b.d.a(this.p) { // from class: com.tsf.shell.e.i.b.d.b.16
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
                com.tsf.shell.utils.w.b();
                if (b.this.K == b.b) {
                    b.this.aR();
                } else {
                    b.this.m(true);
                }
            }
        };
        this.Q = new com.censivn.C3DEngine.b.d.a(this.p) { // from class: com.tsf.shell.e.i.b.d.b.17
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.utils.w.b();
                if (b.this.K == b.b) {
                    b.this.aR();
                } else {
                    b.this.m(true);
                }
            }
        };
        this.W = new com.tsf.shell.e.i.a(this, this) { // from class: com.tsf.shell.e.i.b.d.b.18
            @Override // com.tsf.shell.e.i.a
            public void h() {
            }

            @Override // com.tsf.shell.e.i.a
            public void a() {
            }

            @Override // com.tsf.shell.e.i.a
            public boolean a(com.tsf.shell.e.i.b.e.b bVar) {
                if (b.this.aU() == 2) {
                    b.this.R.e();
                    if (b.this.R.c() && com.tsf.shell.manager.b.g.aq()) {
                        b.this.R.a(false);
                        return true;
                    }
                }
                if (com.tsf.shell.manager.b.g.aq()) {
                    b.this.m(false);
                }
                return true;
            }

            @Override // com.tsf.shell.e.i.a
            public void b(com.tsf.shell.e.i.c cVar) {
                if (cVar.visible() && cVar.alpha() != 0.0f) {
                    b.this.aQ();
                }
            }

            @Override // com.tsf.shell.e.i.a
            public void c(com.tsf.shell.e.i.c cVar) {
                super.c(cVar);
                if (b.this.K == b.a) {
                    b.this.b((com.tsf.shell.e.i.b.e.b) cVar);
                    return;
                }
                int a2 = b.this.o.a(cVar);
                b.this.o.removeChild(cVar);
                b.this.a((com.tsf.shell.e.i.b.e.b) cVar, false);
                if (a2 < b.l.K) {
                    b.this.aB();
                    b.m.a(b.this);
                    b.m.c(b.this);
                }
            }
        };
        this.S = new com.tsf.shell.e.b.a() { // from class: com.tsf.shell.e.i.b.d.b.19
            @Override // com.tsf.shell.e.b.a, com.censivn.C3DEngine.b.c.d
            public void a(int i, KeyEvent keyEvent) {
                if (i == 4 && b.this.K == b.a && b.this.mouseEnabled() && !b.this.o.v()) {
                    b.this.m(true);
                }
            }

            @Override // com.tsf.shell.e.b.a, com.censivn.C3DEngine.b.c.d
            public void b(int i, KeyEvent keyEvent) {
            }
        };
        ArrayList a2 = com.tsf.shell.utils.h.a(((LauncherFolder3DInfo) itemInfo).getItemInfo(), itemInfo.config, ",", true);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            ItemInfo itemInfo2 = (ItemInfo) a2.get(i);
            if (i < l.K) {
                a(itemInfo2, false);
            } else {
                a(itemInfo2, true);
            }
        }
        a2.clear();
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
        int aW = aW() > l.K ? l.K : aW();
        for (int i = 0; i < aW; i++) {
            com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) this.o.children().get((aW() - i) - 1);
            a(bVar, (ThemeFolderDescription.SystemFolderChild) l.L.get(i));
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

    @Override // com.tsf.shell.e.i.b
    public ArrayList b() {
        return this.o.children();
    }

    private void a(ItemInfo itemInfo, boolean z) {
        com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) itemInfo.getWidget();
        if (bVar == null) {
            bVar = com.tsf.shell.manager.l.a.a(itemInfo, z);
        }
        bVar.g(0.0f);
        bVar.mouseEnabled(false);
        this.o.addChild(bVar);
        bVar.setMouseEventListener(new a(bVar, this));
        bVar.a(this.W);
    }

    public com.tsf.shell.e.i.a aE() {
        return this.W;
    }

    public g aF() {
        return this.o;
    }

    public ArrayList aG() {
        return this.o.children();
    }

    public m aH() {
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
            componentNameArr[i] = ((com.tsf.shell.e.i.b.e.i) this.o.children().get(i)).bd().b;
        }
        return componentNameArr;
    }

    public void aJ() {
        if (!this.af) {
            LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) K();
            int size = this.o.children().size();
            String str = "";
            for (int i = 0; i < size; i++) {
                str = String.valueOf(str) + ((com.tsf.shell.e.i.b.e.b) this.o.children().get(i)).K().id + ",";
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
        Iterator it = l.c().folder.order.iterator();
        while (it.hasNext()) {
            switch (((Integer) it.next()).intValue()) {
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
        com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.j) this, true);
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
            this.r = new m(l.c().folder.textPlaneWidth, l.c().folder.textPlaneHeight, 1, 1, false);
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
            this.t = new m(m.c, m.d, 1, 1, false);
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
                this.p = new m(l.c().folder.backPlaneWidth, l.c().folder.backPlaneHeight, 1, 1, false);
            } else {
                this.p.a(l.c().folder.backPlaneWidth);
                this.p.b(l.c().folder.backPlaneHeight);
                this.p.removeFromParent();
            }
            this.p.textures().clear();
            this.p.textures().addElement(l.z);
            this.p.position().x = l.c().folder.backPlaneX;
            this.p.position().y = l.c().folder.backPlaneY;
            com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.j) this.p, -this.p.position().x, -this.p.position().y, true);
        } else if (this.p != null) {
            this.p.textures().clear();
            this.p.removeFromParent();
        }
        if (l.c().folder.frontPlaneEnable) {
            if (this.q == null) {
                this.q = new m(l.c().folder.frontPlaneWidth, l.c().folder.frontPlaneHeight, 1, 1, false);
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
                this.s = new m(l.c().folder.sizePlaneWidth, l.c().folder.sizePlaneHeight, 1, 1, false);
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
    public void c(com.tsf.shell.e.i.b.e.b bVar) {
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
        this.W.a((com.censivn.C3DEngine.b.f.j) bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.e.i.b.e.b bVar, boolean z) {
        ArrayList av = bVar.av();
        if (av != null && av.size() > 0) {
            Iterator it = av.iterator();
            while (it.hasNext()) {
                com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) it.next();
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
                com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.j) this.p, -this.p.position().x, -this.p.position().y, false);
                com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.j) this.t, false);
                com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.j) this, false);
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
                com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.j) this.p, -this.p.position().x, -this.p.position().y, true);
                com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.j) this.t, true);
                com.tsf.shell.manager.o.b.a.a((com.censivn.C3DEngine.b.f.j) this, true);
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
            com.censivn.C3DEngine.a.a().c(new RenderRunnable(i, i) { // from class: com.tsf.shell.e.i.b.d.b.20
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
        com.tsf.shell.g.a().a("WidgetFolderBox");
    }

    public void aP() {
        com.tsf.shell.g.a().b("WidgetFolderBox");
    }

    public void c(int i) {
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.i.b.d.b.21
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.g.a().b("WidgetFolderBox");
            }
        }, i);
    }

    public void aQ() {
        if (!this.Z) {
            this.Z = true;
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.i.b.d.b.2
                @Override // java.lang.Runnable
                public void run() {
                    b.this.bc();
                    b.this.C();
                    b.this.Z = false;
                }
            });
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public boolean doubleSidedEnabled() {
        return aH().doubleSidedEnabled();
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void doubleSidedEnabled(boolean z) {
        aH().doubleSidedEnabled(z);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void alpha(float f) {
        aH().alpha(f);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public float alpha() {
        return aH().alpha();
    }

    @Override // com.tsf.shell.e.i.c, com.tsf.shell.e.e.g
    public int m() {
        return 1;
    }

    @Override // com.tsf.shell.e.e.p
    public boolean c_() {
        return this.Y;
    }

    @Override // com.tsf.shell.e.e.p
    public void b(boolean z) {
        this.Y = z;
    }

    @Override // com.tsf.shell.e.e.p
    public boolean d() {
        return mouseEnabled();
    }

    public void aR() {
        x xVar;
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
            this.aa = com.tsf.shell.e.d.a(this);
            ((com.censivn.C3DEngine.b.f.l) parent()).replaceChild(this, this.aa);
            position().setAllFrom(Number3d.TEMPNUMBER3D);
            scale().setAllFrom(Number3d.TEMPNUMBER3D2);
            if (aC()) {
                this.ag = com.tsf.shell.manager.a.b.a();
                com.tsf.shell.manager.a.b.b(Home.b());
            }
        }
        this.T = com.tsf.shell.manager.a.j.a(this.S);
        switch (com.tsf.shell.manager.b.g.ap()) {
            case 0:
                xVar = new x();
                bj();
                xVar.a((v) new com.censivn.C3DEngine.b.g.i());
                break;
            case 1:
                xVar = new x() { // from class: com.tsf.shell.e.i.b.d.b.3
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        b.this.bj();
                    }
                };
                xVar.a((v) new com.censivn.C3DEngine.b.g.i());
                break;
            default:
                xVar = new x();
                bj();
                xVar.a((v) new com.censivn.C3DEngine.b.g.i());
                break;
        }
        xVar.l(1.0f);
        xVar.m(1.0f);
        xVar.f(0.0f);
        xVar.h(0 - l.m);
        xVar.e(0.0f);
        w.a(this);
        w.a(this, 350, xVar);
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
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.i.b.d.b.4
                @Override // java.lang.Runnable
                public void run() {
                    x xVar;
                    k.N.alpha(0.0f);
                    k.O.alpha(0.0f);
                    if (b.this.aa != null) {
                        if (b.this.aa.parent() instanceof com.tsf.shell.e.c.b.a) {
                            com.tsf.shell.e.c.b.b a2 = com.tsf.shell.manager.a.g.a.a(b.this.aa);
                            b.this.L.x = a2.a;
                            b.this.L.y = a2.b;
                            b.this.M.z = a2.e;
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
                            xVar = new x();
                            xVar.f(b.this.L.x);
                            xVar.h(b.this.L.y);
                            xVar.l(Number3d.TEMPNUMBER3D2.x);
                            xVar.m(Number3d.TEMPNUMBER3D2.y);
                            xVar.a(255);
                            xVar.e(b.this.M.z);
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
                            xVar = new x();
                            xVar.f(b.this.L.x);
                            xVar.h(b.this.L.y);
                            xVar.e(b.this.M.z);
                        }
                        w.a(b.this, 380, xVar);
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
                    com.tsf.shell.manager.a.j.a(new Runnable() { // from class: com.tsf.shell.e.i.b.d.b.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.removeFromParent();
                            b.l.F.removeFromParent();
                            if (b.this.aa != null) {
                                ((com.censivn.C3DEngine.b.f.l) b.this.aa.parent()).replaceChild(b.this.aa, b.this);
                                com.tsf.shell.e.d.a(b.this.aa);
                                b.this.aa = null;
                            } else {
                                com.tsf.shell.manager.a.h.n().a(b.this);
                            }
                            if (b.this.N != null) {
                                ArrayList av = b.this.N.av();
                                if (av != null && av.size() > 0) {
                                    Iterator it = av.iterator();
                                    while (it.hasNext()) {
                                        ((a) ((com.tsf.shell.e.i.c) it.next()).getMouseEventListener()).a();
                                    }
                                }
                                if (!((a) b.this.N.getMouseEventListener()).a()) {
                                    b.this.N.getMouseEventListener().d(com.censivn.C3DEngine.a.h.d().f());
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
            if (com.tsf.shell.manager.b.g.ap() == 1) {
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
        float[] b2 = com.tsf.shell.utils.x.b(f, f2);
        float f3 = b2[0];
        float f4 = b2[1];
        int a2 = this.o.a(f3, f4);
        if (a2 != -1) {
            return a2;
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
        int aW = aW() - 1;
        return i3 <= aW ? i3 : aW;
    }

    protected Number3d d(int i) {
        int i2 = l.l + ((i % l.a) * l.i);
        int i3 = l.k - ((i / l.a) * l.j);
        this.ac.x = i2;
        this.ac.y = i3;
        return this.ac;
    }

    protected void a(com.tsf.shell.e.i.b.e.b bVar) {
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

    public com.censivn.C3DEngine.b.f.l aX() {
        return this.o;
    }

    public void aY() {
        int size = this.o.children().size();
        int i = l.c().folder.sampleCount;
        for (int i2 = 0; i2 < size; i2++) {
            com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) this.o.children().get((size - i2) - 1);
            if (i2 < i) {
                a(bVar, (ThemeFolderDescription.SystemFolderChild) l.c().folder.sampleList.get(i2));
            } else {
                bVar.visible(false);
                a(bVar, (ThemeFolderDescription.SystemFolderChild) l.c().folder.sampleList.get(i2 % l.c().folder.sampleList.size()));
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
        int aW = aW();
        int i5 = VEasing.Linear.easeNone;
        int i6 = 0;
        if (aW > 0) {
            m.b(this);
            int i7 = l.c().folder.sampleCount;
            com.tsf.shell.e.i.b.e.b bVar = null;
            int i8 = aW - 1;
            while (i8 > -1) {
                final com.tsf.shell.e.i.b.e.b bVar2 = (com.tsf.shell.e.i.b.e.b) this.o.children().get((aW - i8) - 1);
                bVar2.mouseEnabled(false);
                x xVar = null;
                if (i8 < i7) {
                    ThemeFolderDescription.SystemFolderChild systemFolderChild = (ThemeFolderDescription.SystemFolderChild) l.c().folder.sampleList.get(i8);
                    if (bVar2.scale().x == 0.0f) {
                        bVar2.position().setAllFrom(systemFolderChild.position);
                        bVar2.rotation().setAllFrom(systemFolderChild.rotation);
                    }
                    bVar2.alpha(255.0f);
                    xVar = new x() { // from class: com.tsf.shell.e.i.b.d.b.5
                        @Override // com.censivn.C3DEngine.b.g.x
                        public void a(float f) {
                            if (bVar2.aJ() != 0.0f) {
                                bVar2.g(1.0f - f);
                            }
                        }
                    };
                    if (bVar2.position().x != systemFolderChild.position.x) {
                        xVar.f(systemFolderChild.position.x);
                    }
                    if (bVar2.position().y != systemFolderChild.position.y) {
                        xVar.h(systemFolderChild.position.y);
                    }
                    if (bVar2.position().z != systemFolderChild.position.z) {
                        xVar.j(systemFolderChild.position.z);
                    }
                    if (bVar2.rotation().x != systemFolderChild.rotation.x) {
                        xVar.c(systemFolderChild.rotation.x);
                    }
                    if (bVar2.rotation().y != systemFolderChild.rotation.y) {
                        xVar.d(systemFolderChild.rotation.y);
                    }
                    if (bVar2.rotation().z != systemFolderChild.rotation.z) {
                        xVar.e(systemFolderChild.rotation.z);
                    }
                    if (bVar2.scale().x != systemFolderChild.scale.x) {
                        xVar.l(systemFolderChild.scale.x);
                    }
                    if (bVar2.scale().y != systemFolderChild.scale.y) {
                        xVar.m(systemFolderChild.scale.y);
                    }
                    if (bVar2.scale().z != systemFolderChild.scale.z) {
                        xVar.n(systemFolderChild.scale.z);
                    }
                } else {
                    ThemeFolderDescription.SystemFolderChild systemFolderChild2 = (ThemeFolderDescription.SystemFolderChild) l.c().folder.sampleList.get(i8 % i7);
                    if (bVar2.visible()) {
                        xVar = new x() { // from class: com.tsf.shell.e.i.b.d.b.6
                            @Override // com.censivn.C3DEngine.b.g.x
                            public void a() {
                                bVar2.visible(false);
                            }

                            @Override // com.censivn.C3DEngine.b.g.x
                            public void a(float f) {
                                if (bVar2.aJ() != 0.0f) {
                                    bVar2.g(1.0f - f);
                                }
                            }
                        };
                        if (bVar2.position().x != systemFolderChild2.position.x) {
                            xVar.f(systemFolderChild2.position.x);
                        }
                        if (bVar2.position().y != systemFolderChild2.position.y) {
                            xVar.h(systemFolderChild2.position.y);
                        }
                        if (bVar2.position().z != systemFolderChild2.position.z) {
                            xVar.j(systemFolderChild2.position.z);
                        }
                        if (bVar2.rotation().x != systemFolderChild2.rotation.x) {
                            xVar.c(systemFolderChild2.rotation.x);
                        }
                        if (bVar2.rotation().y != systemFolderChild2.rotation.y) {
                            xVar.d(systemFolderChild2.rotation.y);
                        }
                        if (bVar2.rotation().z != systemFolderChild2.rotation.z) {
                            xVar.e(systemFolderChild2.rotation.z);
                        }
                        if (bVar2.scale().x != systemFolderChild2.scale.x) {
                            xVar.l(systemFolderChild2.scale.x);
                        }
                        if (bVar2.scale().y != systemFolderChild2.scale.y) {
                            xVar.m(systemFolderChild2.scale.y);
                        }
                        if (bVar2.scale().z != systemFolderChild2.scale.z) {
                            xVar.n(systemFolderChild2.scale.z);
                        }
                        xVar.a(0);
                    } else {
                        bVar2.position().setAllFrom(systemFolderChild2.position);
                        bVar2.rotation().setAllFrom(systemFolderChild2.rotation);
                        bVar2.scale().setAllFrom(systemFolderChild2.scale);
                        bVar2.alpha(0.0f);
                    }
                }
                if (xVar != null) {
                    if (!z) {
                        i = i6;
                        i3 = i5;
                    } else if (!z2) {
                        int i9 = i6;
                        i3 = 0;
                        i = i9;
                    } else {
                        switch (com.tsf.shell.manager.b.g.ap()) {
                            case 0:
                                i4 = VEasing.Linear.easeNone;
                                break;
                            case 1:
                                i4 = VEasing.Linear.easeNone;
                                xVar.b(i6);
                                break;
                            default:
                                i4 = VEasing.Linear.easeNone;
                                xVar.b(i6);
                                break;
                        }
                        int i10 = i6 + 40;
                        i3 = i4;
                        i = i10;
                    }
                    if (i8 == 0) {
                        if (i3 == 0) {
                            runnable2 = new Runnable() { // from class: com.tsf.shell.e.i.b.d.b.7
                                @Override // java.lang.Runnable
                                public void run() {
                                    final Runnable runnable3 = runnable;
                                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.i.b.d.b.7.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            b.this.a(runnable3);
                                        }
                                    });
                                }
                            };
                        } else {
                            runnable2 = new Runnable() { // from class: com.tsf.shell.e.i.b.d.b.8
                                @Override // java.lang.Runnable
                                public void run() {
                                    b.this.a(runnable);
                                }
                            };
                        }
                        xVar.a(runnable2);
                        this.V = xVar;
                        i2 = i3;
                    } else {
                        w.a(bVar2);
                        w.a(bVar2, i3, xVar);
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
            w.a(bVar);
            w.a(bVar, i5, this.V);
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

    private void a(com.censivn.C3DEngine.b.f.j jVar, ThemeFolderDescription.SystemFolderChild systemFolderChild) {
        jVar.position().setAllFrom(systemFolderChild.position);
        jVar.rotation().setAllFrom(systemFolderChild.rotation);
        jVar.scale().setAllFrom(systemFolderChild.scale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bj() {
        int aW = aW();
        if (aW == 0) {
            bk();
            return;
        }
        final int i = aW > l.c ? aW - l.c : 0;
        ArrayList arrayList = l.c().folder.sampleList;
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) this.o.children().get((i - 1) - i2);
            if (i2 < arrayList.size()) {
                bVar.alpha(255.0f);
                bVar.visible(true);
            } else {
                bVar.alpha(0.0f);
            }
        }
        int i3 = aW - 1;
        while (true) {
            final int i4 = i3;
            if (i4 > i - 1) {
                final com.tsf.shell.e.i.b.e.b bVar2 = (com.tsf.shell.e.i.b.e.b) this.o.children().get(i4);
                bVar2.alpha(255.0f);
                Number3d d = d((aW - i4) - 1);
                x xVar = new x() { // from class: com.tsf.shell.e.i.b.d.b.9
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a(float f) {
                        bVar2.visible(true);
                        bVar2.g(f);
                    }

                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        if (i4 == i) {
                            b.this.bk();
                        }
                        bVar2.mouseEnabled(true);
                    }
                };
                xVar.f(d.x);
                xVar.h(d.y);
                if (bVar2.position().z != 0.0f) {
                    xVar.j(0.0f);
                }
                if (bVar2.rotation().x != 0.0f) {
                    xVar.c(0.0f);
                }
                if (bVar2.rotation().y != 0.0f) {
                    xVar.d(0.0f);
                }
                if (bVar2.rotation().z != 0.0f) {
                    xVar.e(0.0f);
                }
                if (bVar2.scale().x != 1.0f) {
                    xVar.l(1.0f);
                }
                if (bVar2.scale().y != 1.0f) {
                    xVar.m(1.0f);
                }
                if (bVar2.scale().z != 1.0f) {
                    xVar.n(1.0f);
                }
                switch (com.tsf.shell.manager.b.g.ap()) {
                    case 0:
                        break;
                    case 1:
                        xVar.b(((aW - i4) - 1) * 40);
                        break;
                    default:
                        xVar.b(((aW - i4) - 1) * 40);
                        break;
                }
                w.a(bVar2);
                w.a(bVar2, VEasing.Linear.easeNone, xVar);
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

    public void c(ArrayList arrayList) {
        a(arrayList, false);
    }

    public void a(ArrayList arrayList, boolean z) {
        this.ad = arrayList;
        p(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn() {
        this.ad.clear();
    }

    @Override // com.tsf.shell.e.e.j
    public q j_() {
        return null;
    }

    public void b(int i, int i2, int i3, int i4) {
        if (k == this) {
            position().y = 0 - l.m;
            l.E.position().y = l.h;
        }
        this.o.a(i, i2, i3, i4);
    }

    @Override // com.tsf.shell.e.i.c
    public void ae() {
        if (this.Z) {
            bc();
            C();
            this.Z = false;
        }
    }

    @Override // com.tsf.shell.e.e.j
    public void a(p pVar) {
        if (pVar instanceof com.tsf.shell.e.i.b.e.b) {
            com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) pVar;
            if (this.ad == null) {
                this.ad = new ArrayList();
            }
            if (bVar.ao()) {
                bVar.ar();
            }
            this.ad.add(bVar);
            bVar.setDefaultColor(com.tsf.shell.manager.o.c.c);
        }
    }

    @Override // com.tsf.shell.e.e.j
    public void f() {
        p(false);
    }

    public void p(boolean z) {
        x xVar;
        if (this.ad != null) {
            int size = this.ad.size();
            if (size > 0) {
                m.b(this);
                mouseEnabled(false);
            }
            for (int i = 0; i < size; i++) {
                final com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) this.ad.get(i);
                bVar.clearDefaultColor();
                bVar.position().setAllFrom(globalToLocal(bVar.position()));
                bVar.removeFromParent();
                this.o.addChild(bVar);
                if (i == size - 1) {
                    xVar = new x() { // from class: com.tsf.shell.e.i.b.d.b.10
                        @Override // com.censivn.C3DEngine.b.g.x
                        public void a() {
                            Iterator it = b.this.ad.iterator();
                            while (it.hasNext()) {
                                b.this.c((com.tsf.shell.e.i.b.e.b) it.next());
                            }
                            b.this.n(true);
                            b.this.a(false, (Runnable) null, true);
                            b.this.aJ();
                            b.this.bn();
                            b.this.bh();
                        }

                        @Override // com.censivn.C3DEngine.b.g.x
                        public void a(float f) {
                            bVar.g(1.0f - f);
                        }
                    };
                } else {
                    xVar = new x() { // from class: com.tsf.shell.e.i.b.d.b.11
                        @Override // com.censivn.C3DEngine.b.g.x
                        public void a(float f) {
                            bVar.g(1.0f - f);
                        }
                    };
                }
                if (z) {
                    int i2 = l.c().folder.sampleCount;
                    w.a(bVar);
                    if (i < size - i2) {
                        bVar.alpha(255.0f);
                        bVar.visible(false);
                    } else {
                        xVar.f(0.0f);
                        xVar.h(com.censivn.C3DEngine.b.b.a.c * 100.0f);
                        xVar.e(0.0f);
                        xVar.a(255);
                        w.a(bVar, 500, xVar);
                    }
                } else {
                    xVar.f(0.0f);
                    xVar.h(com.censivn.C3DEngine.b.b.a.c * 100.0f);
                    xVar.e(0.0f);
                    xVar.a(255);
                    w.a(bVar);
                    w.a(bVar, 500, xVar);
                }
            }
        }
    }

    @Override // com.tsf.shell.e.e.a.a
    public void e() {
        this.z = true;
        x xVar = new x() { // from class: com.tsf.shell.e.i.b.d.b.13
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                float alpha = b.this.p.alpha();
                if (b.this.q != null) {
                    b.this.q.alpha(alpha);
                }
                b.this.r.alpha(alpha);
            }
        };
        xVar.a(0);
        w.a(this.p);
        w.a(this.p, 300, xVar);
        aF().b(0.1f);
    }

    @Override // com.tsf.shell.e.e.a.a
    public void i() {
        x xVar = new x() { // from class: com.tsf.shell.e.i.b.d.b.14
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                float alpha = b.this.p.alpha();
                if (b.this.q != null) {
                    b.this.q.alpha(alpha);
                }
                b.this.r.alpha(alpha);
            }
        };
        xVar.a(255);
        w.a(this.p);
        w.a(this.p, 300, xVar);
        bg();
        this.z = false;
    }

    @Override // com.tsf.shell.e.e.a.a
    public void h() {
    }

    public void b(com.tsf.shell.e.i.b.e.b bVar) {
        if (this.o.children().contains(bVar)) {
            this.o.removeChild(bVar);
            n(true);
            aJ();
            bg();
        }
    }

    @Override // com.tsf.shell.e.e.a.a
    public void a(com.censivn.C3DEngine.b.f.j jVar, com.tsf.shell.e.i.b.e.i iVar) {
        com.tsf.shell.e.i.b.e.i ba = iVar.ba();
        Number3d.TEMPNUMBER3D3.reset();
        Number3d globalToLocal = this.o.globalToLocal(jVar.localToGlobal(Number3d.TEMPNUMBER3D3));
        globalToLocal.y -= this.o.l();
        ba.position().x = globalToLocal.x;
        ba.position().y = globalToLocal.y;
        Number3d d = d(this.o.numChildren());
        this.o.addChildAt(ba, 0);
        h a2 = this.o.a(0);
        a2.r = true;
        float f = d.x;
        a2.a = f;
        a2.i = f;
        float f2 = d.y;
        a2.b = f2;
        a2.j = f2;
        a2.s = 255.0f;
        a2.c = 0.0f;
        a2.e = 1.0f;
        c((com.tsf.shell.e.i.b.e.b) ba);
        ba.mouseEnabled(true);
        n(true);
        this.o.b(0.2f);
        aJ();
    }

    @Override // com.tsf.shell.e.i.e, com.tsf.shell.e.i.c
    public void c() {
        super.c();
    }

    @Override // com.tsf.shell.e.i.e
    public ArrayList a(ArrayList arrayList) {
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
    @Override // com.tsf.shell.e.i.c, com.tsf.shell.e.e.g
    public void a(com.tsf.shell.e.e.g gVar) {
        super.a(gVar);
        if (gVar instanceof com.tsf.shell.e.i.b.e.b) {
            this.J.a((com.censivn.C3DEngine.b.f.j) gVar);
        }
    }

    public void a(com.censivn.C3DEngine.b.f.j jVar) {
        this.J.a(jVar);
    }

    public void aZ() {
        this.A = true;
    }

    public void ba() {
        this.A = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.e.i.c, com.tsf.shell.e.e.g
    public void d(com.tsf.shell.e.e.g gVar) {
        super.d(gVar);
        if (gVar instanceof com.tsf.shell.e.i.b.e.b) {
            this.J.b((com.censivn.C3DEngine.b.f.j) gVar);
        }
    }

    @Override // com.tsf.shell.e.i.c, com.tsf.shell.e.e.g
    public void c(com.tsf.shell.e.e.g gVar) {
        super.c(gVar);
    }

    @Override // com.tsf.shell.e.i.c, com.tsf.shell.e.e.g
    public boolean a(com.tsf.shell.e.e.g gVar, float f, float f2) {
        return (gVar instanceof com.tsf.shell.e.i.e) && ((com.tsf.shell.e.i.e) gVar).au();
    }

    @Override // com.tsf.shell.e.i.c, com.tsf.shell.e.e.g
    public boolean b(com.tsf.shell.e.e.g gVar) {
        return gVar instanceof com.tsf.shell.e.i.b.e.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.e.i.c, com.tsf.shell.e.e.g
    public void e(com.tsf.shell.e.e.g gVar) {
        super.c(gVar);
        this.J.b((com.censivn.C3DEngine.b.f.j) gVar);
        com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) gVar;
        ArrayList arrayList = new ArrayList();
        if (bVar.as()) {
            ArrayList aw = bVar.aw();
            int size = aw.size();
            for (int i = 0; i < size; i++) {
                arrayList.add((com.tsf.shell.e.i.b.e.b) ((com.tsf.shell.e.i.e) aw.get((size - i) - 1)));
            }
        }
        arrayList.add(bVar);
        bi();
        c(arrayList);
    }

    @Override // com.tsf.shell.e.i.c, com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void destroy() {
        Iterator it = ((ArrayList) this.o.children().clone()).iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
            if (jVar instanceof com.tsf.shell.e.i.c) {
                com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) jVar;
                bVar.B();
                if (!this.ae) {
                    com.tsf.shell.manager.a.i.a(bVar);
                } else {
                    jVar.removeFromParent();
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
