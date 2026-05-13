package com.tsf.shell.p096f.p148h.p149a.p150a.p151a;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p169c.p170a.p171a.C3459a;
import com.tsf.shell.p096f.p118e.C2502d;
import com.tsf.shell.p096f.p118e.p129h.C2611a;
import com.tsf.shell.p096f.p148h.p149a.p150a.C3058b;
import com.tsf.shell.p096f.p148h.p149a.p150a.C3063d;
import com.tsf.shell.utils.C4166c;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.h.a.a.a.c */
/* loaded from: classes.dex */
public class C3045c extends C0980j implements C2611a.InterfaceC2613a {

    /* renamed from: a */
    private C3063d f9892a;

    /* renamed from: b */
    private C0980j f9893b;

    /* renamed from: d */
    private float f9895d;

    /* renamed from: f */
    private C3058b f9897f;

    /* renamed from: g */
    private C0984m f9898g;

    /* renamed from: h */
    private C2502d<C3052d> f9899h;

    /* renamed from: j */
    private C3032a f9901j;

    /* renamed from: l */
    private C3054e f9903l;

    /* renamed from: k */
    private TextureElement f9902k = new TextureElement(0, false);

    /* renamed from: m */
    private C4166c f9904m = new C4166c();

    /* renamed from: i */
    private ArrayList<C3052d> f9900i = new ArrayList<>();

    /* renamed from: e */
    private Number3d f9896e = new Number3d();

    /* renamed from: c */
    private C3057g f9894c = new C3057g(C3063d.f9936b, C3063d.f9936b);

    public C3045c(C3063d c3063d, C0980j c0980j) {
        this.f9892a = c3063d;
        this.f9893b = c0980j;
        this.f9894c.calAABB();
        this.f9894c.setMouseEventListener(new C0937a(this.f9894c) { // from class: com.tsf.shell.f.h.a.a.a.c.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
            }
        });
        this.f9895d = C3063d.f9935a / C3063d.f9936b;
        addChild(this.f9894c);
        this.f9898g = new C0984m();
        this.f9898g.m10347d(55);
        addChild(this.f9898g);
        this.f9901j = new C3032a(this);
        addChild(this.f9901j);
        this.f9899h = new C2502d<C3052d>() { // from class: com.tsf.shell.f.h.a.a.a.c.2
            @Override // com.tsf.shell.p096f.p118e.C2502d
            /* renamed from: a */
            public C3052d mo718b() {
                return new C3052d();
            }
        };
        this.f9903l = new C3054e(this) { // from class: com.tsf.shell.f.h.a.a.a.c.3
            @Override // com.tsf.shell.p096f.p118e.p123d.p124a.C2525d
            /* renamed from: i */
            public void mo3720i() {
                if (C3045c.this.f9897f.m3705a().m2318c()) {
                    C3045c.this.f9897f.m3697g();
                    C3045c.this.f9897f.m3698f();
                    C3045c.this.f9897f.m3699e();
                    C3045c.this.m3734b(false);
                    C3045c.this.m3724j();
                    C3045c.this.m3737a(false);
                }
            }
        };
        this.f9903l.m5354a(this);
    }

    /* renamed from: a */
    public C3058b m3743a() {
        return this.f9897f;
    }

    /* renamed from: b */
    public void m3736b() {
        if (this.f9897f != null) {
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.h.a.a.a.c.4
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent = new Intent("android.intent.action.EDIT");
                    intent.setData(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, String.valueOf(C3045c.this.f9897f.m3705a().f11433b)));
                    Home.m6177b().m6182a(intent, (Object) null);
                }
            });
        }
    }

    @Override // com.tsf.shell.p096f.p118e.p129h.C2611a.InterfaceC2613a
    /* renamed from: a */
    public void mo3470a(Bitmap bitmap) {
        if (this.f9897f != null) {
            C0853a.m10853g().m10540a(this.f9902k, bitmap);
            m3742a(this.f9902k, true);
        }
        bitmap.recycle();
    }

    /* renamed from: a */
    public void m3742a(TextureElement textureElement, boolean z) {
        this.f9894c.textures().removeAll();
        this.f9894c.textures().addElement(textureElement);
    }

    /* renamed from: f */
    private float m3728f() {
        return (C0892a.f2551B - (this.f9894c.mo10365c() / 2.0f)) - C0892a.m10742a(80.0f);
    }

    /* renamed from: g */
    private float m3727g() {
        return (m3728f() - (this.f9894c.mo10365c() / 2.0f)) - C0892a.m10742a(60.0f);
    }

    /* renamed from: h */
    private float m3726h() {
        return m3727g() - C0892a.m10742a(150.0f);
    }

    /* renamed from: i */
    private void m3725i() {
        if (this.f9902k.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f9902k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m3724j() {
        m3725i();
        m3742a(this.f9897f.m3701c(), false);
        if (this.f9897f.m3701c().f2529id == this.f9892a.m3687c(false).f2529id) {
            m3742a(this.f9892a.m3687c(true), false);
            return;
        }
        Bitmap m2327a = this.f9897f.m3705a().m2327a(C3063d.f9937c, C3063d.f9937c, true);
        if (m2327a != null) {
            C0853a.m10853g().m10540a(this.f9902k, m2327a);
            m2327a.recycle();
            m3742a(this.f9902k, false);
        }
    }

    /* renamed from: a */
    public void m3737a(boolean z) {
        this.f9898g.m10355a(this.f9897f.m3705a().f11434c);
        m3741a(this.f9898g, m3727g(), 0, z);
    }

    /* renamed from: b */
    public void m3734b(boolean z) {
        m3723k();
        System.currentTimeMillis();
        this.f9897f.m3705a().m2316d();
        int size = this.f9897f.m3705a().f11438g.size();
        this.f9900i.clear();
        Iterator<C3459a.C3463c> it = this.f9897f.m3705a().f11437f.iterator();
        while (it.hasNext()) {
            C3459a.C3463c next = it.next();
            C3052d m5383c = this.f9899h.m5383c();
            m5383c.m3717a(next);
            if (next == this.f9897f.m3705a().m2328a()) {
                m5383c.m3713e();
            }
            this.f9900i.add(m5383c);
            if (this.f9900i.size() >= 2) {
                if (size > 0) {
                    break;
                }
            }
            if (this.f9900i.size() >= 3) {
                break;
            }
        }
        Iterator<C3459a.C3461a> it2 = this.f9897f.m3705a().f11438g.iterator();
        while (it2.hasNext()) {
            C3459a.C3461a next2 = it2.next();
            C3052d m5383c2 = this.f9899h.m5383c();
            m5383c2.m3717a(next2);
            if (next2 == this.f9897f.m3705a().m2320b()) {
                m5383c2.m3713e();
            }
            this.f9900i.add(m5383c2);
            if (this.f9900i.size() >= 3) {
                break;
            }
        }
        float m3726h = m3726h();
        float m10742a = C0892a.m10742a(160.0f);
        int i = 0;
        float f = m3726h;
        int i2 = 50;
        while (true) {
            int i3 = i;
            if (i3 < this.f9900i.size()) {
                C3052d c3052d = this.f9900i.get(i3);
                m3741a(c3052d.m3715c(), c3052d.m3719a(), i2, z);
                int i4 = i2 + 30;
                m3741a(c3052d.m3714d(), c3052d.m3716b(), i4, z);
                i2 = i4 + 30;
                c3052d.position().f2527y = f;
                f -= m10742a;
                addChild(c3052d);
                i = i3 + 1;
            } else {
                m3741a(this.f9901j, C0892a.f2552C + C0892a.m10742a(180.0f), 150, z);
                return;
            }
        }
    }

    /* renamed from: a */
    public void m3738a(C3058b c3058b) {
        this.f9897f = c3058b;
        c3058b.m3703b().alpha(0.0f);
        this.f9896e.reset();
        this.f9894c.mouseEnabled(false);
        c3058b.localToGlobal(this.f9896e);
        removeFromParent();
        this.f9894c.position().setAllFrom(this.f9896e);
        this.f9894c.scale().setAll(this.f9895d, this.f9895d, 1.0f);
        this.f9893b.addChild(this);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.a.a.a.c.5
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3045c.this.f9894c.mouseEnabled(true);
            }
        };
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        c1017d.mo10301f(0.0f);
        c1017d.mo10298h(m3728f());
        c1017d.m10313a(C0986a.f2950e);
        C1014c.m10326a(this.f9894c);
        C1014c.m10325a(this.f9894c, 500, c1017d);
        m3724j();
        m3737a(true);
        m3734b(true);
        this.f9903l.m5351b();
        this.f9901j.setZOrderOnTop();
    }

    /* renamed from: c */
    public boolean m3733c() {
        if (this.f9903l.m5355a()) {
            this.f9903l.m5348e();
            return false;
        }
        m3742a(this.f9897f.m3701c(), false);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.a.a.a.c.6
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3045c.this.f9897f.m3705a().m2315e();
                C3045c.this.removeFromParent();
                C3045c.this.f9894c.textures().clear();
                C3045c.this.f9897f.m3703b().alpha(255.0f);
                C3045c.this.m3722l();
            }
        };
        c1017d.m10294l(this.f9895d);
        c1017d.m10293m(this.f9895d);
        float f = this.f9896e.f2527y;
        this.f9896e.reset();
        this.f9897f.localToGlobal(this.f9896e);
        c1017d.mo10301f(this.f9896e.f2526x);
        c1017d.mo10298h(f);
        c1017d.m10313a(C0986a.f2950e);
        C1014c.m10326a(this.f9894c);
        C1014c.m10325a(this.f9894c, 500, c1017d);
        m3740a(this.f9898g, 0);
        for (int i = 0; i < this.f9900i.size(); i++) {
            C3052d c3052d = this.f9900i.get(i);
            m3740a(c3052d.m3715c(), 0);
            m3740a(c3052d.m3714d(), 0);
        }
        C1017d c1017d2 = new C1017d();
        c1017d2.m10314a(0);
        c1017d2.mo10298h(C0892a.f2552C - C0892a.m10742a(180.0f));
        C1014c.m10326a(this.f9901j);
        C1014c.m10325a(this.f9901j, 250, c1017d2);
        this.f9903l.m5350c();
        return true;
    }

    /* renamed from: k */
    private void m3723k() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f9900i.size()) {
                C3052d c3052d = this.f9900i.get(i2);
                c3052d.m3711g();
                c3052d.removeFromParent();
                this.f9899h.m5384a(c3052d);
                i = i2 + 1;
            } else {
                this.f9900i.clear();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m3722l() {
        m3723k();
        m3725i();
        this.f9897f = null;
    }

    /* renamed from: d */
    public void m3731d() {
        this.f9901j.m3769a();
    }

    /* renamed from: a */
    private void m3741a(C0975i c0975i, float f, int i, boolean z) {
        if (z) {
            c0975i.position().f2527y = f - C0892a.m10742a(350.0f);
            c0975i.alpha(0.0f);
            C1017d c1017d = new C1017d();
            c1017d.mo10298h(f);
            c1017d.m10314a(255);
            c1017d.m10313a(C0986a.f2946a);
            if (i != 0) {
                c1017d.m10309b(i);
            }
            C1014c.m10326a(c0975i);
            C1014c.m10325a(c0975i, 350, c1017d);
            return;
        }
        c0975i.position().f2527y = f;
        c0975i.alpha(255.0f);
    }

    /* renamed from: a */
    private void m3740a(C0975i c0975i, int i) {
        C1017d c1017d = new C1017d();
        c1017d.mo10298h(c0975i.position().f2527y + C0892a.m10742a(250.0f));
        c1017d.m10314a(0);
        if (i != 0) {
            c1017d.m10309b(i);
        }
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, 230, c1017d);
    }

    /* renamed from: e */
    public void m3729e() {
        this.f9903l.m5343k();
    }
}
