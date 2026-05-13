package com.tsf.shell.p096f.p118e.p126f;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p174f.C3474b;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.p096f.p107d.p112c.p113a.C2426d;
import com.tsf.shell.p096f.p118e.p126f.C2570b;
import com.tsf.shell.p096f.p118e.p129h.C2614b;
import com.tsf.shell.p096f.p131f.C2942j;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3202a;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3219f;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.e.f.a */
/* loaded from: classes.dex */
public class C2558a implements C0915b.InterfaceC0918a, C0925e.InterfaceC0934a, C2570b.InterfaceC2571a, C2614b.InterfaceC2616a {

    /* renamed from: a */
    private static HashMap<Integer, C2564a> f8463a;

    /* renamed from: p */
    private static ArrayList<Integer> f8464p = new ArrayList<>();

    /* renamed from: b */
    private ArrayList<C2569c> f8465b;

    /* renamed from: f */
    private C3231c f8469f;

    /* renamed from: g */
    private C2570b f8470g;

    /* renamed from: j */
    private AbstractC3202a f8473j;

    /* renamed from: m */
    private C2569c f8476m;

    /* renamed from: n */
    private boolean f8477n;

    /* renamed from: o */
    private C0975i f8478o;

    /* renamed from: q */
    private C2426d f8479q;

    /* renamed from: h */
    private boolean f8471h = false;

    /* renamed from: i */
    private boolean f8472i = false;

    /* renamed from: l */
    private float[] f8475l = new float[2];

    /* renamed from: r */
    private boolean f8480r = false;

    /* renamed from: k */
    private C3474b.C3478a f8474k = new C3474b.C3478a();

    /* renamed from: c */
    private ArrayList<C2569c> f8466c = new ArrayList<>();

    /* renamed from: e */
    private C0980j f8468e = new C0980j();

    /* renamed from: d */
    private C0980j f8467d = new C0980j() { // from class: com.tsf.shell.f.e.f.a.1

        /* renamed from: a */
        Number3d f8481a = new Number3d();

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onKillFocus() {
            C2558a.this.m5289a(true);
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
        public void onDrawChildEnd() {
            if (C2558a.this.f8469f != null) {
                this.f8481a.setAllFrom(C2558a.this.f8469f.position());
                PositionNumber3d position = C2558a.this.f8469f.position();
                C2558a.this.f8469f.position().f2527y = 0.0f;
                position.f2526x = 0.0f;
                C2558a.this.f8469f.dispatchDraw();
                C2558a.this.f8469f.position().setAllFrom(this.f8481a);
                float f = C2558a.this.f8469f.scale().f2526x;
                float f2 = f + ((1.0f - f) * 0.15f);
                C2558a.this.f8469f.scale().setAll(f2, f2, 1.0f);
            }
        }
    };

    public C2558a() {
        int i = 0;
        this.f8467d.addChild(this.f8468e);
        this.f8467d.setMouseEventListener(new C0937a(this.f8467d));
        this.f8467d.mouseSkip(true);
        this.f8465b = new ArrayList<>();
        for (int i2 = 0; i2 < 9; i2++) {
            this.f8465b.add(new C2569c(i2));
        }
        if (f8463a == null) {
            f8463a = new HashMap<>();
            f8463a.put(0, new C2564a(ThemeShellDescription.ICON_MENU_DETAIL_ON, ThemeShellDescription.ICON_MENU_DETAIL_OFF, 0, C4189x.m588c(C1306b.C1315i.text_detail)));
            f8463a.put(1, new C2564a(ThemeShellDescription.ICON_MENU_EDIT_ON, ThemeShellDescription.ICON_MENU_EDIT_OFF, 1, C4189x.m588c(C1306b.C1315i.text_edit)));
            f8463a.put(2, new C2564a(ThemeShellDescription.ICON_MENU_EDIT_ON, ThemeShellDescription.ICON_MENU_EDIT_OFF, 2, C4189x.m588c(C1306b.C1315i.text_rename)));
            f8463a.put(4, new C2564a(ThemeShellDescription.ICON_MENU_DELETE_ON, ThemeShellDescription.ICON_MENU_DELETE_OFF, 4, C4189x.m588c(C1306b.C1315i.text_delete)));
            f8463a.put(3, new C2564a(ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_ON, ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_OFF, 3, C4189x.m588c(C1306b.C1315i.text_multi_choice)));
            f8463a.put(5, new C2564a(ThemeShellDescription.ICON_MENU_UNINSTALL_ON, ThemeShellDescription.ICON_MENU_UNINSTALL_OFF, 5, C4189x.m588c(C1306b.C1315i.text_uninstall)));
            f8463a.put(6, new C2564a(ThemeShellDescription.ICON_MENU_RESET_ON, ThemeShellDescription.ICON_MENU_RESET_OFF, 6, C4189x.m588c(C1306b.C1315i.text_rotate)));
            f8463a.put(7, new C2564a(ThemeShellDescription.ICON_MENU_ALIGN_ON, ThemeShellDescription.ICON_MENU_ALIGN_OFF, 7, C4189x.m588c(C1306b.C1315i.text_snaplines)));
        }
        while (true) {
            int i3 = i;
            if (i3 < 9) {
                C2569c c2569c = this.f8465b.get(i3);
                c2569c.setMouseEventListener(new C25602(this.f8467d));
                c2569c.calAABB();
                i = i3 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: com.tsf.shell.f.e.f.a$2 */
    /* loaded from: classes.dex */
    class C25602 extends C0937a {

        /* renamed from: a */
        boolean f8483a;

        C25602(C0975i c0975i) {
            super(c0975i);
            this.f8483a = false;
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: e */
        public void mo1654e(MotionEvent motionEvent) {
            float[] m600a = C4189x.m600a(motionEvent, C2558a.this.f8475l);
            C0975i hittingTarget = C2558a.this.f8467d.getHittingTarget(m600a[0], m600a[1], true);
            if (hittingTarget == null || !(hittingTarget instanceof C2569c)) {
                C2558a.this.m5301a((C2569c) null);
                return;
            }
            C2558a.this.m5301a((C2569c) hittingTarget);
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: f */
        public void mo1653f(MotionEvent motionEvent) {
            if (C2558a.this.f8476m != null) {
                C2558a.this.m5302a(C2558a.this.f8476m.f8502b.f8494c, true);
            }
            C2558a.this.f8476m = null;
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: a */
        public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            if (!this.f8483a) {
                final float[] m600a = C4189x.m600a(motionEvent2, C2558a.this.f8475l);
                this.f8483a = true;
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.e.f.a.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C0975i hittingTarget = C2558a.this.f8467d.getHittingTarget(m600a[0], m600a[1], true);
                        if (hittingTarget == null || !(hittingTarget instanceof C2569c)) {
                            C2558a.this.m5301a((C2569c) null);
                        } else {
                            C2558a.this.m5301a((C2569c) hittingTarget);
                        }
                        C25602.this.f8483a = false;
                    }
                });
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: a */
        public void mo502a(MotionEvent motionEvent) {
            C4187w.m614b();
        }
    }

    /* renamed from: a */
    public boolean m5306a() {
        return this.f8471h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5301a(C2569c c2569c) {
        if (c2569c != this.f8476m) {
            if (this.f8476m != null) {
                this.f8476m.m5260a(true);
            }
            this.f8476m = c2569c;
            if (c2569c != null) {
                this.f8476m.m5262a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5305a(int i) {
        switch (i) {
            case 0:
                if (this.f8469f instanceof C3222g) {
                    C3359a.f11083A.m2206c();
                    ((C3222g) this.f8469f).m3102bh();
                    return;
                } else if (this.f8469f instanceof C3219f) {
                    C3359a.f11083A.m2206c();
                    ((C3219f) this.f8469f).m3119aV();
                    return;
                } else {
                    return;
                }
            case 1:
                if (this.f8469f instanceof AbstractC3202a) {
                    C3359a.f11083A.m2206c();
                    m5293a((AbstractC3202a) this.f8469f);
                    return;
                }
                return;
            case 2:
                C3359a.f11083A.m2206c();
                C2565b.m5265a(this.f8469f);
                return;
            case 3:
                this.f8469f.m3066aq();
                return;
            case 4:
                this.f8470g.mo2137a(this.f8469f);
                return;
            case 5:
                C3359a.f11083A.m2206c();
                ((C3222g) this.f8469f).m3103bg();
                return;
            case 6:
                this.f8469f.m3538G();
                return;
            case 7:
                this.f8469f.m3537H();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m5277f() {
        if (this.f8470g != null) {
            this.f8470g.m5256b(this);
            this.f8470g.m5252u();
            this.f8470g = null;
        }
        C3359a.f11096j.m2223b(this.f8467d);
    }

    /* renamed from: a */
    private ArrayList<Integer> m5290a(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2, ArrayList<Integer> arrayList3) {
        ArrayList<Integer> arrayList4;
        if (arrayList2 != null) {
            ArrayList<Integer> arrayList5 = new ArrayList<>();
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (!m5303a(next.intValue(), arrayList2)) {
                    arrayList5.add(next);
                }
            }
            Iterator<Integer> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Integer next2 = it2.next();
                if (!arrayList5.contains(next2)) {
                    arrayList5.add(next2);
                }
            }
            return arrayList5;
        }
        ArrayList<Integer> arrayList6 = null;
        if (arrayList3 == null) {
            arrayList4 = null;
        } else {
            Iterator<Integer> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                Integer next3 = it3.next();
                if (!arrayList.contains(next3)) {
                    if (arrayList6 == null) {
                        arrayList6 = (ArrayList) arrayList.clone();
                    }
                    arrayList6.add(next3);
                }
            }
            arrayList4 = arrayList6;
        }
        return arrayList4 != null ? arrayList4 : arrayList;
    }

    /* renamed from: a */
    private boolean m5303a(int i, ArrayList<Integer> arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i == arrayList.get(i2).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m5291a(C3231c c3231c, C0975i c0975i, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        if (!this.f8471h) {
            this.f8468e.position().reset();
            f8464p.clear();
            c3231c.mo3079a(f8464p);
            this.f8478o = c0975i;
            this.f8466c.clear();
            f8464p = m5290a(f8464p, arrayList, arrayList2);
            this.f8470g = c3231c.m3076ag();
            if (this.f8470g != null) {
                this.f8470g.m5258a(this);
                this.f8470g.m5253t();
                C0915b.m10597a(this);
                C3359a.f11088b.m10565a(this);
                this.f8469f = c3231c;
                this.f8471h = true;
                C3359a.f11096j.m2231a(this.f8467d, 0);
                Number3d localToGlobal = c3231c.localToGlobal(new Number3d());
                float f = localToGlobal.f2526x;
                float mo3246q = localToGlobal.f2527y + this.f8470g.mo3246q();
                this.f8467d.position().f2526x = f;
                this.f8467d.position().f2527y = mo3246q;
                c3231c.alpha(0.0f);
                m5275g();
                if (!this.f8477n) {
                    C3359a.f11089c.m2242c(this);
                }
                c3231c.alpha(255.0f);
                int size = f8464p.size();
                for (int i = 0; i < size; i++) {
                    C2569c c2569c = this.f8465b.get(i);
                    c2569c.m5261a(f8463a.get(f8464p.get(i)));
                    c2569c.removeFromParent();
                    this.f8468e.addChild(c2569c);
                }
                C3359a.f11108v.f7772e.m4343h().mo5583a(f8464p, f, mo3246q);
                this.f8467d.setFocus();
            }
        }
    }

    /* renamed from: g */
    private void m5275g() {
        if (this.f8478o != null) {
            this.f8477n = true;
            C3359a.f11091e.m2272a(m5271i().f9574b, (Runnable) null);
            this.f8478o.visible(false);
            this.f8478o.mouseEnabled(false);
            return;
        }
        this.f8477n = false;
        C3359a.f11091e.m2270a(this.f8474k);
    }

    /* renamed from: a */
    public void m5292a(final C3231c c3231c) {
        if (!this.f8480r && this.f8479q != null) {
            this.f8480r = true;
            this.f8479q.mo5588a();
            int mo5590a = this.f8479q.mo5590a(f8464p.size());
            C0853a.m10865a().m10584b(new Runnable() { // from class: com.tsf.shell.f.e.f.a.3
                @Override // java.lang.Runnable
                public void run() {
                    C2558a.this.f8480r = false;
                    C2558a.this.f8467d.removeFromParent();
                    int size = C2558a.f8464p.size();
                    for (int i = 0; i < size; i++) {
                        ((C2569c) C2558a.this.f8465b.get(i)).m5259b();
                    }
                    C2558a.this.f8479q = null;
                    if (c3231c != null && C2558a.this.f8479q != C3359a.f11108v.f7772e.m4343h()) {
                        C2558a.this.m5285b(c3231c);
                    }
                }
            }, mo5590a);
        }
    }

    /* renamed from: b */
    public void m5285b(C3231c c3231c) {
        if (this.f8479q != null) {
            m5292a(c3231c);
            return;
        }
        this.f8468e.position().reset();
        f8464p.clear();
        f8464p.add(0);
        f8464p.add(1);
        f8464p.add(2);
        f8464p.add(3);
        f8464p.add(4);
        f8464p.add(5);
        f8464p.add(7);
        this.f8467d.removeFromParent();
        C3359a.f11096j.m2231a(this.f8467d, 0);
        float f = C0892a.f2590z / 2.0f;
        float m10742a = C0892a.m10742a(250.0f);
        this.f8467d.position().f2526x = f;
        this.f8467d.position().f2527y = m10742a;
        int size = f8464p.size();
        for (int i = 0; i < size; i++) {
            C2569c c2569c = this.f8465b.get(i);
            c2569c.m5261a(f8463a.get(f8464p.get(i)));
            c2569c.removeFromParent();
            this.f8468e.addChild(c2569c);
        }
        this.f8479q = C3359a.f11108v.f7772e.m4343h();
        this.f8479q.mo5583a(f8464p, f, m10742a);
    }

    /* renamed from: a */
    private void m5304a(int i, Runnable runnable, boolean z) {
        if (this.f8477n) {
            C3359a.f11091e.m2275a(i, runnable, z);
        } else {
            C3359a.f11091e.m2264b(i, runnable, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m5273h() {
        if (this.f8477n) {
            this.f8478o.visible(true);
            this.f8478o.mouseEnabled(true);
            C3359a.f11091e.m2265b();
        }
    }

    /* renamed from: i */
    private C2942j.C2943a m5271i() {
        C2942j.C2943a m4158c = C2942j.m4158c(this);
        m4158c.f9573a = this;
        C3359a.f11106t.m5972b(C2942j.m4159c(), m4158c.f9574b);
        C3359a.f11091e.dispatchDraw();
        this.f8478o.dispatchDraw();
        C3359a.f11106t.m5973b();
        return m4158c;
    }

    /* renamed from: a */
    public void m5289a(boolean z) {
        m5302a(-1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5302a(final int i, boolean z) {
        if (this.f8471h && !this.f8472i) {
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.e.f.a.4
                @Override // java.lang.Runnable
                public void run() {
                    int size = C2558a.f8464p.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((C2569c) C2558a.this.f8465b.get(i2)).m5259b();
                    }
                    if (!C2558a.this.f8477n) {
                        C3359a.f11089c.m2246b(C2558a.this);
                    }
                    C2558a.this.m5273h();
                    C2558a.this.m5305a(i);
                    C2558a.this.f8471h = false;
                    C2558a.this.f8472i = false;
                    C2558a.this.f8469f.mouseSkip(false);
                    C2558a.this.m5277f();
                    C0915b.m10594b(C2558a.this);
                    C3359a.f11088b.m10557b(C2558a.this);
                    C3359a.f11108v.f7772e.mo4273f();
                    C2558a.this.f8469f = null;
                }
            };
            this.f8472i = true;
            if (z) {
                float alpha = this.f8469f.alpha();
                this.f8469f.visible(false);
                this.f8469f.alpha(0.0f);
                m5304a(C3359a.f11108v.f7772e.m4343h().mo5590a(f8464p.size()), runnable, z);
                this.f8469f.alpha(alpha);
                this.f8469f.visible(true);
                C3359a.f11108v.f7772e.m4343h().mo5588a();
                return;
            }
            m5304a(C3359a.f11108v.f7772e.m4343h().mo5590a(f8464p.size()), runnable, z);
            C3359a.f11108v.f7772e.m4343h().mo5588a();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            m5289a(true);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    /* renamed from: com.tsf.shell.f.e.f.a$a */
    /* loaded from: classes.dex */
    public static class C2564a {

        /* renamed from: g */
        private static Paint f8491g;

        /* renamed from: a */
        public String f8492a;

        /* renamed from: b */
        public String f8493b;

        /* renamed from: c */
        public int f8494c;

        /* renamed from: d */
        private TextureElement f8495d;

        /* renamed from: e */
        private TextureElement f8496e;

        /* renamed from: f */
        private String f8497f;

        public C2564a(String str, String str2, int i, String str3) {
            this.f8492a = str;
            this.f8493b = str2;
            this.f8494c = i;
            this.f8497f = str3;
            if (f8491g == null) {
                f8491g = new Paint();
                f8491g.setColor(-855638017);
                f8491g.setTextSize(36.0f * C0892a.f2567c);
                f8491g.setAntiAlias(true);
                f8491g.setTextAlign(Paint.Align.LEFT);
            }
        }

        /* renamed from: a */
        public TextureElement m5269a() {
            if (this.f8496e == null) {
                this.f8496e = ThemeManager.mix.iconMenu.getTextureElement(this.f8493b, C3489a.f11521h, C3489a.f11521h);
            }
            return this.f8496e;
        }

        /* renamed from: b */
        public TextureElement m5267b() {
            if (this.f8495d == null) {
                this.f8495d = ThemeManager.mix.iconMenu.getTextureElement(this.f8492a, C3489a.f11521h, C3489a.f11521h);
            }
            return this.f8495d;
        }

        /* renamed from: c */
        public void m5266c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.e.f.a$b */
    /* loaded from: classes.dex */
    public static class C2565b {
        /* renamed from: a */
        public static void m5265a(final C3112b c3112b) {
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.e.f.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    C2565b.m5263c(C3112b.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static void m5263c(final C3112b c3112b) {
            ItemInfo m3534K = c3112b.m3534K();
            Context m10856d = C0853a.m10856d();
            View inflate = LayoutInflater.from(C0853a.m10856d()).inflate(C1306b.C1313g.dialog_rename, (ViewGroup) null);
            final EditText editText = (EditText) inflate.findViewById(C1306b.C1311e.username_edit);
            editText.setText(m3534K.title);
            AlertDialog.Builder builder = new AlertDialog.Builder(C0853a.m10856d());
            builder.setTitle(C1306b.C1315i.rename_title);
            builder.setView(inflate);
            builder.setPositiveButton(m10856d.getString(C1306b.C1315i.public_action_ok), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.e.f.a.b.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    String obj = editText.getText().toString();
                    if (c3112b instanceof AbstractC3202a) {
                        ((AbstractC3202a) c3112b).m3173a(obj);
                    } else if (c3112b instanceof C3145b) {
                        ((C3145b) c3112b).m3386a(obj);
                    }
                }
            });
            builder.setNegativeButton(m10856d.getString(C1306b.C1315i.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.e.f.a.b.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            builder.show();
        }
    }

    /* renamed from: com.tsf.shell.f.e.f.a$c */
    /* loaded from: classes.dex */
    public class C2569c extends C0980j {

        /* renamed from: b */
        public C2564a f8502b;

        /* renamed from: e */
        public int f8505e;

        /* renamed from: a */
        public boolean f8501a = false;

        /* renamed from: c */
        public C0981k f8503c = new C0981k(C3489a.f11521h, C3489a.f11521h, false);

        /* renamed from: d */
        public C0984m f8504d = new C0984m();

        public C2569c(int i) {
            this.f8505e = i;
            this.f8504d.m10347d(36);
            this.f8504d.m10345e(-855638017);
            addChild(this.f8503c);
            addChild(this.f8504d);
        }

        /* renamed from: a */
        public void m5261a(C2564a c2564a) {
            this.f8502b = c2564a;
            this.f8504d.m10355a(c2564a.f8497f);
            m5260a(false);
        }

        /* renamed from: a */
        public void m5262a() {
            this.f8503c.textures().clear();
            if (this.f8502b != null) {
                this.f8503c.textures().addElement(this.f8502b.m5267b());
            }
            C3359a.f11108v.f7772e.m4343h().mo5586a(this);
        }

        /* renamed from: a */
        public void m5260a(boolean z) {
            this.f8503c.textures().clear();
            if (this.f8502b != null) {
                this.f8503c.textures().addElement(this.f8502b.m5269a());
            }
            if (z) {
                C3359a.f11108v.f7772e.m4343h().mo5581b(this);
            }
        }

        /* renamed from: b */
        public void m5259b() {
            C1014c.m10326a(this.f8503c);
            C1014c.m10326a(this.f8504d);
            C1014c.m10326a(this);
            removeFromParent();
            this.f8501a = false;
            this.f8503c.textures().clear();
            this.f8503c.rotation().setAll(0.0f, 0.0f, 0.0f);
            this.f8503c.position().setAll(0.0f, 0.0f, 0.0f);
            this.f8503c.scale().setAll(1.0f, 1.0f, 1.0f);
            this.f8503c.alpha(255.0f);
            position().setAll(0.0f, 0.0f, 0.0f);
            rotation().setAll(0.0f, 0.0f, 0.0f);
            scale().setAll(1.0f, 1.0f, 1.0f);
            alpha(255.0f);
            this.f8504d.position().setAll(0.0f, 0.0f, 0.0f);
            this.f8504d.rotation().setAll(0.0f, 0.0f, 0.0f);
            this.f8504d.scale().setAll(1.0f, 1.0f, 1.0f);
            this.f8504d.m10352b(1);
            this.f8504d.alpha(255.0f);
            removeFromParent();
            this.f8504d.m10358a();
            if (this.f8502b != null) {
                this.f8502b.m5266c();
                this.f8502b = null;
            }
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p129h.C2614b.InterfaceC2616a
    /* renamed from: a */
    public void mo5155a(Bitmap bitmap, String str) {
        if (this.f8473j != null) {
            this.f8473j.m3174a(bitmap, str);
            this.f8473j = null;
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p129h.C2614b.InterfaceC2616a
    /* renamed from: b */
    public void mo5154b() {
        if (this.f8473j != null) {
            this.f8473j.m3172q();
            this.f8473j = null;
        }
    }

    /* renamed from: a */
    public void m5293a(AbstractC3202a abstractC3202a) {
        this.f8473j = abstractC3202a;
        int[] aG = abstractC3202a.m3158aG();
        C2614b.m5158a(this, abstractC3202a, aG[0], aG[1]);
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        m5289a(false);
    }

    /* renamed from: c */
    public ArrayList<C2569c> m5284c() {
        return this.f8465b;
    }

    /* renamed from: d */
    public C0980j m5281d() {
        return this.f8468e;
    }
}
