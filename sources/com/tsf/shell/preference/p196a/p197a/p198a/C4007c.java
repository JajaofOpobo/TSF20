package com.tsf.shell.preference.p196a.p197a.p198a;

import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.preference.a.a.a.c */
/* loaded from: classes.dex */
public class C4007c extends C4017h {

    /* renamed from: a */
    private ArrayList<C4009a> f13134a;

    /* renamed from: com.tsf.shell.preference.a.a.a.c$a */
    /* loaded from: classes.dex */
    class C4009a {

        /* renamed from: a */
        public int f13137a;

        /* renamed from: b */
        public String f13138b;

        /* renamed from: c */
        public TextureElement f13139c = new TextureElement(0, false);

        /* renamed from: d */
        public C0981k f13140d;

        public C4009a(int i, String str) {
            this.f13137a = i;
            this.f13138b = str;
        }

        /* renamed from: a */
        public void m903a() {
            if (this.f13139c.f2529id == 0) {
                C0853a.m10853g().m10542a(this.f13139c, this.f13137a);
            }
        }

        /* renamed from: b */
        public void m902b() {
            if (this.f13139c.f2529id != 0) {
                C0853a.m10853g().m10543a(this.f13139c);
            }
        }
    }

    public C4007c(String str) {
        super(str, C0892a.m10742a(150.0f), 0.0f, C0892a.m10742a(30.0f));
        this.f13134a = new ArrayList<>();
        this.f13134a.add(new C4009a(C1306b.C1310d.preference_about_facebook, "http://www.facebook.com/tsfapp"));
        this.f13134a.add(new C4009a(C1306b.C1310d.preference_about_google_plus, "http://gplus.to/tsf"));
        this.f13134a.add(new C4009a(C1306b.C1310d.preference_about_tsf, "http://www.tsfui.com/"));
        float m10742a = C0892a.m10742a(118.0f);
        Iterator<C4009a> it = this.f13134a.iterator();
        while (it.hasNext()) {
            final C4009a next = it.next();
            C0981k c0981k = new C0981k(m10742a, m10742a, false);
            c0981k.setDefaultColor(new Color4(-5592406));
            next.f13140d = c0981k;
            c0981k.textures().addElement(next.f13139c);
            c0981k.calAABB(1.2f, 1.2f, 1.0f);
            c0981k.setMouseEventListener(new C0937a(c0981k) { // from class: com.tsf.shell.preference.a.a.a.c.1
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo502a(MotionEvent motionEvent) {
                    C4007c.this.m904a(next.f13138b);
                }
            });
            m890e().addChild(c0981k);
        }
        m890e().mouseEnabled(true);
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        super.mo544c(i);
        float m10742a = C0892a.m10742a(118.0f);
        float m10742a2 = C0892a.m10742a(80.0f);
        float m10742a3 = ((-C0892a.f2555F) / 2.0f) + C0892a.m10742a(120.0f) + (m10742a / 2.0f);
        Iterator<C4009a> it = this.f13134a.iterator();
        while (true) {
            float f = m10742a3;
            if (it.hasNext()) {
                it.next().f13140d.position().f2526x = f;
                m10742a3 = m10742a + m10742a2 + f;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        super.mo539f();
        Iterator<C4009a> it = this.f13134a.iterator();
        while (it.hasNext()) {
            it.next().m903a();
        }
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        super.mo538g();
        Iterator<C4009a> it = this.f13134a.iterator();
        while (it.hasNext()) {
            it.next().m902b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m904a(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        Home.m6177b().startActivity(intent);
    }
}
