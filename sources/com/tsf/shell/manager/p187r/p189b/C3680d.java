package com.tsf.shell.manager.p187r.p189b;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3386b;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p187r.p189b.C3647c;
import com.tsf.shell.manager.p187r.p193c.C3695a;
import com.tsf.shell.manager.p187r.p193c.C3702b;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import com.tsf.shell.utils.C4181q;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.tsf.shell.manager.r.b.d */
/* loaded from: classes.dex */
public class C3680d extends C3647c<C3685a> {

    /* renamed from: b */
    public C3621a f12150b;

    /* renamed from: c */
    private PackageManager f12151c;

    /* renamed from: d */
    private C2574a.C2575a f12152d;

    /* renamed from: e */
    private C2574a.C2575a f12153e;

    /* renamed from: f */
    private ArrayList<C3685a> f12154f;

    /* renamed from: g */
    private ArrayList<C3685a> f12155g;

    /* renamed from: h */
    private boolean f12156h;

    /* renamed from: i */
    private boolean f12157i;

    /* renamed from: j */
    private ArrayList<C3685a> f12158j;

    /* renamed from: k */
    private C3647c.AbstractC3651a<C3685a> f12159k;

    /* renamed from: l */
    private C3647c.AbstractC3651a<C3685a> f12160l;

    /* renamed from: m */
    private C3224h f12161m;

    public C3680d(C3621a c3621a, String str) {
        super(str);
        this.f12150b = c3621a;
        this.f12161m = new C3224h();
        this.f12151c = C0853a.m10856d().getPackageManager();
        this.f12154f = new ArrayList<>();
        this.f12155g = new ArrayList<>();
        this.f12158j = new ArrayList<>();
        this.f12159k = new C3647c.AbstractC3651a<C3685a>() { // from class: com.tsf.shell.manager.r.b.d.1
            @Override // com.tsf.shell.manager.p187r.p189b.C3647c.AbstractC3651a
            /* renamed from: a */
            public ArrayList<C3685a> mo1710a() {
                C3680d.this.m1727b();
                return C3680d.this.f12154f;
            }
        };
        this.f12160l = new C3647c.AbstractC3651a<C3685a>() { // from class: com.tsf.shell.manager.r.b.d.2
            @Override // com.tsf.shell.manager.p187r.p189b.C3647c.AbstractC3651a
            /* renamed from: a */
            public ArrayList<C3685a> mo1710a() {
                C3680d.this.m1721c();
                return C3680d.this.f12155g;
            }
        };
        ArrayList<C2574a.C2575a> arrayList = new ArrayList<>();
        C2574a.C2575a c2575a = new C2574a.C2575a(C1306b.C1310d.widget_menu_shortcut_tsf, C4189x.m588c(C1306b.C1315i.group_tsf_shortcut), new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.manager.r.b.d.3
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C3680d.this.m1815a(C3680d.this.f12159k);
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C3680d.this.m1813b(C3680d.this.f12159k);
                C3680d.this.f12153e.m5245a();
                C3680d.this.f12152d.m5245a();
            }
        });
        C3702b.f12213e = c2575a;
        this.f12152d = c2575a;
        C2574a.C2575a c2575a2 = new C2574a.C2575a(C1306b.C1310d.widget_menu_shortcut_system, C4189x.m588c(C1306b.C1315i.group_system_shortcuts), new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.manager.r.b.d.4
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C3680d.this.m1815a(C3680d.this.f12160l);
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C3680d.this.m1721c();
                C3680d.this.m1813b(C3680d.this.f12160l);
                C3680d.this.f12153e.m5245a();
                C3680d.this.f12152d.m5245a();
            }
        });
        C3702b.f12214f = c2575a2;
        this.f12153e = c2575a2;
        arrayList.add(this.f12152d);
        arrayList.add(this.f12153e);
        m1816a(c3621a, arrayList, 20.0f * C0892a.f2567c, 20.0f * C0892a.f2567c, C3566b.f11841c.f11762T + (C0892a.f2567c * 20.0f), C3566b.f11841c.f11763U + (C0892a.f2567c * 20.0f));
        m1813b((C3647c.AbstractC3651a) this.f12159k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m1727b() {
        if (!this.f12156h) {
            this.f12156h = true;
            Iterator<C3386b.C3389a> it = C3359a.f11090d.m2671a().iterator();
            while (it.hasNext()) {
                C3689c c3689c = new C3689c();
                c3689c.f12177c = it.next().f11194a;
                this.f12154f.add(c3689c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m1721c() {
        int i = 0;
        if (!this.f12157i) {
            this.f12157i = true;
            Intent intent = new Intent("android.intent.action.CREATE_SHORTCUT");
            List<ResolveInfo> queryIntentActivities = this.f12151c.queryIntentActivities(intent, 0);
            if (queryIntentActivities == null) {
                return;
            }
            while (true) {
                int i2 = i;
                if (i2 < queryIntentActivities.size()) {
                    C3686b c3686b = (C3686b) m1717d();
                    ActivityInfo activityInfo = queryIntentActivities.get(i2).activityInfo;
                    c3686b.f12170e = activityInfo;
                    c3686b.f12168c = activityInfo.loadLabel(this.f12151c).toString();
                    String str = activityInfo.applicationInfo.packageName;
                    String str2 = activityInfo.name;
                    Intent intent2 = new Intent(intent);
                    if (str != null && str2 != null) {
                        intent2.setClassName(str, str2);
                    } else {
                        intent2.setAction("android.intent.action.CREATE_SHORTCUT");
                        intent2.putExtra("android.intent.extra.shortcut.NAME", c3686b.f12168c);
                    }
                    c3686b.f12169d = intent2;
                    this.f12155g.add(c3686b);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private C3685a m1717d() {
        if (this.f12158j.isEmpty()) {
            return new C3686b();
        }
        return this.f12158j.remove(0);
    }

    @Override // com.tsf.shell.manager.p187r.p189b.C3647c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public C0975i mo1728a(C3685a c3685a, int i, C0975i c0975i) {
        return c3685a.mo1705a(c0975i);
    }

    @Override // com.tsf.shell.manager.p187r.p189b.C3647c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public C0975i mo1729a(C3685a c3685a) {
        return c3685a.mo1707a();
    }

    @Override // com.tsf.shell.manager.p187r.p189b.C3647c
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void mo1722b(C3685a c3685a) {
        c3685a.mo1703b();
    }

    @Override // com.tsf.shell.manager.p187r.p189b.C3647c
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public void mo1718c(C3685a c3685a) {
        c3685a.mo1704a(c3685a);
    }

    @Override // com.tsf.shell.manager.p187r.p189b.C3647c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo1733a(MotionEvent motionEvent, C3685a c3685a, C0975i c0975i) {
        c3685a.mo1706a(motionEvent, c3685a, c0975i);
    }

    @Override // com.tsf.shell.manager.p187r.p189b.C3647c
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean mo1725b(MotionEvent motionEvent, C3685a c3685a, C0975i c0975i) {
        c3685a.mo1702b(motionEvent, c3685a, c0975i);
        return true;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        m1817a();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onRecycle() {
        Iterator<C3685a> it = this.f12154f.iterator();
        while (it.hasNext()) {
            it.next().mo1701c();
        }
        Iterator<C3685a> it2 = this.f12155g.iterator();
        while (it2.hasNext()) {
            C3685a next = it2.next();
            next.mo1701c();
            this.f12158j.add(next);
        }
        this.f12155g.clear();
        this.f12157i = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.r.b.d$b */
    /* loaded from: classes.dex */
    public class C3686b extends C3685a {

        /* renamed from: b */
        protected AbstractC3208b f12167b;

        /* renamed from: c */
        public String f12168c;

        /* renamed from: d */
        public Intent f12169d;

        /* renamed from: e */
        public ActivityInfo f12170e;

        /* renamed from: f */
        public TextureElement f12171f;

        C3686b() {
            super();
            this.f12171f = new TextureElement(0, false);
        }

        @Override // com.tsf.shell.manager.p187r.p189b.C3680d.C3685a
        /* renamed from: a */
        public AbstractC3208b mo1705a(C0975i c0975i) {
            if (this.f12167b == null) {
                this.f12167b = new C3224h();
                this.f12167b.f10495k.textures().addElement(this.f12171f);
            }
            if (this.f12171f.f2529id == 0) {
                Bitmap m2022a = C3566b.f11841c.m2022a();
                Canvas canvas = new Canvas(m2022a);
                canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
                Bitmap m1694a = C3695a.m1694a(this.f12170e);
                if (m1694a != null) {
                    m1694a = C4181q.m644a(m1694a, C3566b.f11841c.f11750H, C3566b.f11841c.f11751I);
                }
                C3566b.f11841c.m2018a(canvas, m1694a);
                Bitmap m2011a = C3566b.f11841c.m2011a(this.f12168c);
                if (m2011a != null) {
                    C3566b.f11841c.m2009b(canvas, m2011a, true);
                }
                C0853a.m10853g().m10540a(this.f12171f, m2022a);
            }
            return this.f12167b;
        }

        @Override // com.tsf.shell.manager.p187r.p189b.C3680d.C3685a
        /* renamed from: b */
        public void mo1703b() {
            C3359a.f11110x.f11627a.m2149a(this.f12169d, 0.0f, 0.0f, new C3519a.C3522a() { // from class: com.tsf.shell.manager.r.b.d.b.1
                @Override // com.tsf.shell.manager.p180l.C3519a.C3522a
                /* renamed from: a */
                public void mo1708a(AbstractC3208b abstractC3208b) {
                    C3680d.this.f12150b.m1858b().mo1856a(abstractC3208b);
                }

                @Override // com.tsf.shell.manager.p180l.C3519a.C3522a
                /* renamed from: a */
                public C3560a mo1709a() {
                    return C3566b.f11840b;
                }
            });
        }

        @Override // com.tsf.shell.manager.p187r.p189b.C3680d.C3685a
        /* renamed from: a */
        public C0975i mo1707a() {
            C3680d.this.f12161m.f10495k.textures().clear();
            C3680d.this.f12161m.f10495k.textures().addElement(this.f12171f);
            return C3680d.this.f12161m;
        }

        @Override // com.tsf.shell.manager.p187r.p189b.C3680d.C3685a
        /* renamed from: b */
        public boolean mo1702b(MotionEvent motionEvent, C3685a c3685a, final C0975i c0975i) {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.r.b.d.b.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    c0975i.removeFromParent();
                    c0975i.alpha(255.0f);
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(c0975i);
            C1014c.m10325a(c0975i, 250, c1017d);
            C3359a.f11110x.f11627a.m2150a(this.f12169d, c0975i.position().f2526x, c0975i.position().f2527y);
            return true;
        }

        @Override // com.tsf.shell.manager.p187r.p189b.C3680d.C3685a
        /* renamed from: a */
        public void mo1704a(C3685a c3685a) {
            C3359a.f11110x.f11627a.m2150a(this.f12169d, 0.0f, C3680d.this.f12150b.getScreenFreeSpaceCenter());
        }

        @Override // com.tsf.shell.manager.p187r.p189b.C3680d.C3685a
        /* renamed from: c */
        public void mo1701c() {
            C0853a.m10853g().m10543a(this.f12171f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.r.b.d$c */
    /* loaded from: classes.dex */
    public class C3689c extends C3685a {

        /* renamed from: b */
        protected AbstractC3208b f12176b;

        /* renamed from: c */
        public int f12177c;

        C3689c() {
            super();
            this.f12177c = -1;
        }

        @Override // com.tsf.shell.manager.p187r.p189b.C3680d.C3685a
        /* renamed from: a */
        public AbstractC3208b mo1705a(C0975i c0975i) {
            if (this.f12176b == null) {
                this.f12176b = C3519a.m2151a(this.f12177c, C3566b.f11841c);
            }
            if (((LauncherShortcutStandardInfo) this.f12176b.m3534K()).texture.f2529id == 0) {
                this.f12176b.m3163aA();
            }
            return this.f12176b;
        }

        @Override // com.tsf.shell.manager.p187r.p189b.C3680d.C3685a
        /* renamed from: a */
        public void mo1706a(MotionEvent motionEvent, C3685a c3685a, C0975i c0975i) {
            c0975i.getMouseEventListener().mo2122c(motionEvent);
        }

        @Override // com.tsf.shell.manager.p187r.p189b.C3680d.C3685a
        /* renamed from: a */
        public void mo1704a(C3685a c3685a) {
            AbstractC3208b m2151a = C3519a.m2151a(this.f12177c, C3566b.f11839a);
            m2151a.position().f2527y = C3680d.this.f12150b.getScreenFreeSpaceCenter();
            C3359a.f11094h.m4031n().m4229a(m2151a);
            m2151a.m3075ah();
            m2151a.m3534K().onUpdatePhoto(null, null);
            m2151a.m3514ad();
        }

        @Override // com.tsf.shell.manager.p187r.p189b.C3680d.C3685a
        /* renamed from: b */
        public boolean mo1702b(MotionEvent motionEvent, C3685a c3685a, C0975i c0975i) {
            ((AbstractC3208b) c0975i).m3075ah();
            ((AbstractC3208b) c0975i).m3534K().onUpdatePhoto(null, null);
            ((AbstractC3208b) c0975i).getMouseEventListener().mo2119d(motionEvent);
            return true;
        }

        @Override // com.tsf.shell.manager.p187r.p189b.C3680d.C3685a
        /* renamed from: a */
        public C0975i mo1707a() {
            return C3519a.m2151a(this.f12177c, C3566b.f11839a);
        }

        @Override // com.tsf.shell.manager.p187r.p189b.C3680d.C3685a
        /* renamed from: b */
        public void mo1703b() {
            AbstractC3208b m2151a = C3519a.m2151a(this.f12177c, C3680d.this.f12150b.m1858b().mo1854b());
            m2151a.m3534K().onUpdatePhoto(null, null);
            C3680d.this.f12150b.m1858b().mo1856a(m2151a);
        }

        @Override // com.tsf.shell.manager.p187r.p189b.C3680d.C3685a
        /* renamed from: c */
        public void mo1701c() {
            if (this.f12176b != null && this.f12176b.m3534K() != null) {
                C0853a.m10853g().m10543a(((LauncherShortcutStandardInfo) this.f12176b.m3534K()).texture);
                this.f12176b.m3160aD();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.r.b.d$a */
    /* loaded from: classes.dex */
    public class C3685a {
        C3685a() {
        }

        /* renamed from: a */
        public AbstractC3208b mo1705a(C0975i c0975i) {
            return null;
        }

        /* renamed from: a */
        public C0975i mo1707a() {
            return null;
        }

        /* renamed from: a */
        public void mo1704a(C3685a c3685a) {
        }

        /* renamed from: a */
        public void mo1706a(MotionEvent motionEvent, C3685a c3685a, C0975i c0975i) {
        }

        /* renamed from: b */
        public boolean mo1702b(MotionEvent motionEvent, C3685a c3685a, C0975i c0975i) {
            return true;
        }

        /* renamed from: b */
        public void mo1703b() {
        }

        /* renamed from: c */
        public void mo1701c() {
        }
    }
}
