package com.tsf.shell.p096f.p101c.p105b;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p046h.p051e.C1058a;
import com.tsf.shell.C3345g;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p101c.p105b.p106a.C2354b;
import com.tsf.shell.p096f.p101c.p105b.p106a.InterfaceC2351a;
import com.tsf.shell.p096f.p118e.C2627j;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.utils.C4171h;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.c.b.e */
/* loaded from: classes.dex */
public class C2359e implements C0925e.InterfaceC0934a {

    /* renamed from: a */
    public static int f7737a = 1;

    /* renamed from: d */
    private C0980j f7740d;

    /* renamed from: e */
    private C2627j f7741e;

    /* renamed from: f */
    private InterfaceC2351a f7742f;

    /* renamed from: i */
    private C1058a f7745i;

    /* renamed from: j */
    private C2346a f7746j;

    /* renamed from: k */
    private C2346a f7747k;

    /* renamed from: l */
    private Runnable f7748l;

    /* renamed from: m */
    private boolean f7749m;

    /* renamed from: b */
    private float f7738b = 25.0f;

    /* renamed from: c */
    private float f7739c = 55.0f;

    /* renamed from: g */
    private boolean f7743g = true;

    /* renamed from: h */
    private C2355b f7744h = new C2355b();

    /* renamed from: n */
    private float f7750n = 0.0f;

    /* renamed from: o */
    private boolean f7751o = true;

    public C2359e(boolean z) {
        this.f7749m = false;
        this.f7749m = z;
    }

    /* renamed from: a */
    public C0980j m5736a() {
        return this.f7740d;
    }

    /* renamed from: b */
    public void m5726b() {
        int i;
        boolean z;
        this.f7738b = C0892a.m10742a(this.f7738b);
        this.f7739c = C0892a.m10742a(this.f7739c);
        C3359a.f11088b.m10565a(this);
        this.f7742f = new C2354b(this, this.f7749m ? C3566b.f11841c : C3566b.f11839a);
        this.f7740d = new C0980j();
        this.f7745i = new C1058a(C0892a.f2553D, 0.0f, C0892a.f2553D, 0.0f, 0.0f) { // from class: com.tsf.shell.f.c.b.e.1
            @Override // com.censivn.C3DEngine.p031b.p046h.p051e.C1058a
            /* renamed from: a */
            public void mo5701a(int i2) {
                if (C2359e.this.m5720c(i2).m5768c() == 0) {
                    C2359e.this.f7745i.m10063g();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p051e.C1058a
            /* renamed from: b */
            public void mo5700b(int i2) {
                C2359e.this.m5716d(i2);
                if (C2359e.this.m5720c(i2).m5768c() != 0) {
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p051e.C1058a
            /* renamed from: a */
            public void mo5702a() {
                C2359e.this.f7745i.m10061h();
            }
        };
        int i2 = 0;
        boolean z2 = true;
        int i3 = 1;
        while (i2 < 3) {
            if (i3 == 0) {
                f7737a = i2;
            }
            C2346a c2346a = new C2346a(this, this.f7738b, this.f7739c, i3) { // from class: com.tsf.shell.f.c.b.e.2
                @Override // com.tsf.shell.p096f.p101c.p105b.C2346a
                /* renamed from: e */
                public void mo5699e() {
                }
            };
            if (i3 == 1) {
                z = false;
                i = 0;
            } else if (z2) {
                i = i3 - 2;
                z = z2;
            } else {
                i = i3 + 2;
                z = z2;
            }
            this.f7745i.addChild(c2346a);
            i2++;
            z2 = z;
            i3 = i;
        }
        this.f7745i.m10068e();
        this.f7745i.m10084a(f7737a, false);
        this.f7747k = (C2346a) this.f7745i.getChildAt(f7737a);
        m5716d(f7737a);
        this.f7740d.addChild(this.f7745i);
        if (!this.f7749m) {
            this.f7741e = C3359a.f11094h.m4043h();
        } else {
            this.f7741e = new C2627j(false);
            this.f7741e.m5124a(5);
            this.f7741e.m5119b(2);
        }
        this.f7740d.addChild(this.f7741e);
        m5712g();
        InterfaceC2351a.C2352a mo5752b = this.f7742f.mo5752b();
        this.f7741e.position().f2526x = mo5752b.f7696g;
        this.f7741e.position().f2527y = mo5752b.f7697h;
        m5703p();
        this.f7745i.m10063g();
        if (C3359a.f11093g.m5950c() != 0) {
            m5722b(false);
        }
    }

    /* renamed from: c */
    public void m5721c() {
        this.f7741e.m5116b(this.f7749m);
    }

    /* renamed from: d */
    public void m5717d() {
        this.f7741e.m5121a(this.f7749m);
    }

    /* renamed from: e */
    public boolean m5714e() {
        return this.f7749m;
    }

    /* renamed from: f */
    public void m5713f() {
        this.f7745i.m10065f();
    }

    /* renamed from: b */
    private C2346a m5725b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < 3) {
                C2346a c2346a = (C2346a) this.f7745i.getChildAt(i3);
                if (c2346a.m5768c() != i) {
                    i2 = i3 + 1;
                } else {
                    return c2346a;
                }
            } else {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public C2346a m5720c(int i) {
        if (i < 3) {
            return (C2346a) this.f7745i.getChildAt(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m5716d(int i) {
        if (this.f7746j != null && !this.f7749m) {
            C3359a.f11097k.m2294c(this.f7746j);
        }
        this.f7746j = (C2346a) this.f7745i.getChildAt(i);
        if (this.f7743g && !this.f7749m) {
            C3359a.f11097k.m2295b(this.f7746j);
        }
    }

    /* renamed from: p */
    private void m5703p() {
        this.f7748l = new Runnable() { // from class: com.tsf.shell.f.c.b.e.3
            @Override // java.lang.Runnable
            public void run() {
                C2359e.this.f7745i.m10084a(1, true);
            }
        };
    }

    /* renamed from: a */
    public void m5735a(int i) {
        float f = (i / 100.0f) * (C0892a.f2553D / 2.0f);
        if (this.f7750n != f) {
            this.f7750n = f;
            m5727a(false);
        }
    }

    /* renamed from: g */
    public void m5712g() {
        m5727a(true);
    }

    /* renamed from: a */
    public void m5727a(boolean z) {
        if (!this.f7749m && z) {
            m5735a(C0892a.f2564O ? C3430e.m2422t() : C3430e.m2419u());
        }
        float f = C0892a.f2553D - this.f7750n;
        m5711h().mo5759a(f, this.f7739c, this.f7739c, this.f7738b);
        this.f7745i.m10086a(f);
        this.f7745i.m10085a((-f) / 2.0f, (-C0892a.f2571g) / 2.0f, f / 2.0f, C0892a.f2571g);
        InterfaceC2351a.C2352a mo5752b = this.f7742f.mo5752b();
        C1014c.m10326a(this.f7740d);
        if (this.f7743g) {
            this.f7740d.position().f2527y = mo5752b.f7691b;
        } else {
            this.f7740d.position().f2527y = mo5752b.f7693d;
        }
        if (this.f7751o) {
            this.f7745i.position().f2527y = mo5752b.f7695f;
        } else {
            this.f7745i.position().f2527y = mo5752b.f7699j;
        }
        Iterator<C0975i> it = this.f7745i.m10077b().children().iterator();
        while (it.hasNext()) {
            C2346a c2346a = (C2346a) it.next();
            m5711h().mo5754a(c2346a);
            c2346a.m5766g();
        }
        this.f7742f.mo5754a(this.f7745i.m10074c());
    }

    /* renamed from: h */
    public InterfaceC2351a m5711h() {
        return this.f7742f;
    }

    /* renamed from: i */
    public static ArrayList<String> m5710i() {
        ContentResolver contentResolver = C0853a.m10856d().getContentResolver();
        Cursor query = contentResolver.query(C3345g.C3349d.f11068a, null, null, null, null);
        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0;
        while (query.moveToNext()) {
            String string = query.getString(query.getColumnIndex("child"));
            if (string == null) {
                string = "";
            }
            arrayList.add(string);
            i++;
        }
        if (i < 3) {
            int i2 = 3 - i;
            for (int i3 = 0; i3 < i2; i3++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("child", "");
                contentResolver.insert(C3345g.C3349d.f11068a, contentValues);
                arrayList.add("");
            }
        }
        query.close();
        return arrayList;
    }

    /* renamed from: a */
    public void m5728a(ArrayList<ItemInfo> arrayList, ArrayList<String> arrayList2) {
        boolean z;
        int size = arrayList2.size();
        ArrayList<ItemInfo> arrayList3 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ArrayList<ItemInfo> m678a = C4171h.m678a(arrayList, arrayList2.get(i), ",", false);
            C2346a m5725b = m5725b(i);
            Iterator<ItemInfo> it = m678a.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                ItemInfo next = it.next();
                if (m5725b.m5780a(1)) {
                    m5732a(m5725b, next);
                    z = z2;
                } else {
                    arrayList3.add(next);
                    z = true;
                }
                z2 = z;
            }
            if (z2) {
                m5725b.m5764i();
            }
        }
        arrayList3.addAll(arrayList);
        m5729a(arrayList3);
        for (int i2 = 0; i2 < 3; i2++) {
            ((C2346a) this.f7745i.getChildAt(i2)).m5767f();
        }
    }

    /* renamed from: a */
    private void m5729a(ArrayList<ItemInfo> arrayList) {
        C3112b m2146a;
        C2346a c2346a = (C2346a) this.f7745i.getChildAt(this.f7745i.numChildren() - 1);
        Iterator<ItemInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            ItemInfo next = it.next();
            if (next.itemType == 1) {
                m2146a = C3145b.m3404a((LauncherFolder3DInfo) next);
            } else {
                m2146a = C3519a.m2146a(next, true);
            }
            c2346a.m5772a(m2146a, false);
            c2346a.addChild(m2146a);
            c2346a.m5764i();
        }
    }

    /* renamed from: a */
    public void m5734a(int i, C3112b c3112b) {
        C2346a m5720c = m5720c(i);
        m5720c.m5772a(c3112b, false);
        m5720c.addChild(c3112b);
    }

    /* renamed from: a */
    private void m5732a(C2346a c2346a, ItemInfo itemInfo) {
        C3112b m2146a;
        if (itemInfo.itemType == 1) {
            m2146a = C3145b.m3404a((LauncherFolder3DInfo) itemInfo);
        } else {
            m2146a = C3519a.m2146a(itemInfo, true);
        }
        c2346a.m5772a(m2146a, false);
        c2346a.addChild(m2146a);
    }

    /* renamed from: j */
    public boolean m5709j() {
        return this.f7751o;
    }

    /* renamed from: k */
    public void m5708k() {
        if (this.f7749m || C3359a.f11093g.m5950c() == 0) {
            if (this.f7751o) {
                m5722b(true);
            } else {
                m5718c(true);
            }
        }
    }

    /* renamed from: l */
    public InterfaceC2351a.C2352a m5707l() {
        return this.f7742f.mo5752b();
    }

    /* renamed from: b */
    public void m5722b(boolean z) {
        if (this.f7751o) {
            this.f7751o = false;
            InterfaceC2351a.C2352a m5707l = m5707l();
            float f = this.f7749m ? 0.0f : C0892a.f2560K;
            if (z) {
                C1017d c1017d = new C1017d();
                c1017d.mo10298h(m5707l.f7701l);
                c1017d.mo10301f(m5707l.f7700k);
                C1014c.m10326a(this.f7741e);
                C1014c.m10325a(this.f7741e, VEasing.Linear.easeNone, c1017d);
                C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.c.b.e.4
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2359e.this.f7745i.visible(false);
                    }
                };
                c1017d2.mo10298h(m5707l.f7699j - f);
                c1017d2.mo10301f(m5707l.f7698i);
                C1014c.m10326a(this.f7745i);
                C1014c.m10325a(this.f7745i, VEasing.Linear.easeNone, c1017d2);
            } else {
                C1014c.m10326a(this.f7745i);
                C1014c.m10326a(this.f7741e);
                this.f7745i.position().f2526x = m5707l.f7698i;
                this.f7745i.position().f2527y = m5707l.f7699j - f;
                this.f7741e.position().f2526x = m5707l.f7700k;
                this.f7741e.position().f2527y = m5707l.f7701l;
                this.f7745i.visible(false);
            }
            if (!this.f7749m) {
                C3430e.m2472e(true);
                C3359a.f11097k.m2294c(this.f7746j);
                C3359a.f11094h.m4019t().m4449ar();
            }
        }
    }

    /* renamed from: c */
    public void m5718c(boolean z) {
        if (!this.f7751o) {
            this.f7751o = true;
            InterfaceC2351a.C2352a m5707l = m5707l();
            this.f7745i.visible(true);
            if (z) {
                C1017d c1017d = new C1017d();
                c1017d.mo10298h(m5707l.f7697h);
                c1017d.mo10301f(m5707l.f7696g);
                C1014c.m10326a(this.f7741e);
                C1014c.m10325a(this.f7741e, VEasing.Linear.easeNone, c1017d);
                C1017d c1017d2 = new C1017d();
                c1017d2.mo10298h(m5707l.f7695f);
                c1017d2.mo10301f(m5707l.f7694e);
                C1014c.m10326a(this.f7745i);
                C1014c.m10325a(this.f7745i, VEasing.Linear.easeNone, c1017d2);
            } else {
                C1014c.m10326a(this.f7745i);
                C1014c.m10326a(this.f7741e);
                this.f7745i.position().f2526x = m5707l.f7694e;
                this.f7745i.position().f2527y = m5707l.f7695f;
                this.f7741e.position().f2526x = m5707l.f7696g;
                this.f7741e.position().f2527y = m5707l.f7697h;
            }
            if (!this.f7749m) {
                C3359a.f11097k.m2295b(this.f7746j);
                C3430e.m2472e(false);
                C3359a.f11094h.m4019t().m4449ar();
            }
        }
    }

    /* renamed from: m */
    public void m5706m() {
        if (this.f7751o && this.f7743g) {
            if (!this.f7749m) {
                C3359a.f11097k.m2294c(this.f7746j);
            }
            this.f7743g = false;
            this.f7740d.mouseEnabled(false);
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.c.b.e.5
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2359e.this.f7740d.visible(false);
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: c */
                public void mo4322c() {
                    C2359e.this.f7740d.visible(false);
                }
            };
            InterfaceC2351a.C2352a m5707l = m5707l();
            c1017d.mo10301f(m5707l.f7692c);
            c1017d.mo10298h(m5707l.f7693d);
            c1017d.m10314a(0);
            C1014c.m10326a(this.f7740d);
            C1014c.m10325a(this.f7740d, VEasing.Linear.easeNone, c1017d);
        }
    }

    /* renamed from: n */
    public void m5705n() {
        if (this.f7751o && !this.f7743g) {
            this.f7743g = true;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.c.b.e.6
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2359e.this.f7740d.mouseEnabled(true);
                    if (!C2359e.this.f7749m) {
                        C3359a.f11097k.m2295b(C2359e.this.f7746j);
                    }
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: c */
                public void mo4322c() {
                    C2359e.this.f7740d.mouseEnabled(true);
                    if (!C2359e.this.f7749m) {
                        C3359a.f11097k.m2295b(C2359e.this.f7746j);
                    }
                }
            };
            this.f7740d.mouseEnabled(false);
            InterfaceC2351a.C2352a mo5752b = this.f7742f.mo5752b();
            c1017d.mo10301f(mo5752b.f7690a);
            c1017d.mo10298h(mo5752b.f7691b);
            c1017d.m10313a(C0986a.f2946a);
            c1017d.m10314a(255);
            C1014c.m10326a(this.f7740d);
            C1014c.m10325a(this.f7740d, 500, c1017d);
            this.f7740d.visible(true);
        }
    }

    /* renamed from: a */
    public C2355b m5733a(C0975i c0975i) {
        C2355b c2355b = null;
        for (int i = 0; i < 3 && (c2355b = ((C2346a) this.f7745i.getChildAt(i)).m5778a(c0975i)) == null; i++) {
        }
        InterfaceC2351a.C2352a mo5752b = this.f7742f.mo5752b();
        float f = c2355b.f7716a + mo5752b.f7690a + mo5752b.f7694e;
        float f2 = mo5752b.f7695f + c2355b.f7717b + mo5752b.f7691b;
        this.f7744h.m5749a(c2355b);
        this.f7744h.f7716a = f;
        this.f7744h.f7717b = f2;
        return this.f7744h;
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        m5712g();
    }

    /* renamed from: o */
    public void m5704o() {
    }
}
