package com.tsf.shell.preference.p196a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p101c.p105b.C2359e;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.preference.a.c */
/* loaded from: classes.dex */
public class C4078c {

    /* renamed from: a */
    private ArrayList<C4080b> f13285a = new ArrayList<>();

    /* renamed from: b */
    private C4079a f13286b;

    public C4078c() {
        this.f13285a.add(new C4080b(C1306b.C1310d.demo_icon_1));
        this.f13285a.add(new C4080b(C1306b.C1310d.demo_icon_2));
        this.f13285a.add(new C4080b(C1306b.C1310d.demo_icon_3));
        this.f13285a.add(new C4080b(C1306b.C1310d.demo_icon_4));
        this.f13285a.add(new C4080b(C1306b.C1310d.demo_icon_5));
        this.f13285a.add(new C4080b(C1306b.C1310d.demo_icon_6));
        this.f13285a.add(new C4080b(C1306b.C1310d.demo_icon_7));
        this.f13285a.add(new C4080b(C1306b.C1310d.demo_icon_8));
        this.f13285a.add(new C4080b(C1306b.C1310d.action_app_drawer_icon));
    }

    /* renamed from: a */
    public C4079a m817a() {
        if (this.f13286b == null) {
            this.f13286b = new C4079a();
        }
        return this.f13286b;
    }

    /* renamed from: a */
    public TextureElement m816a(int i) {
        C4080b c4080b = this.f13285a.get(i);
        c4080b.m811a();
        return c4080b;
    }

    /* renamed from: b */
    public void m815b(int i) {
        this.f13285a.get(i).m810b();
    }

    /* renamed from: com.tsf.shell.preference.a.c$b */
    /* loaded from: classes.dex */
    public class C4080b extends TextureElement {

        /* renamed from: a */
        public int f13290a;

        public C4080b(int i) {
            super(0, false);
            this.f13290a = i;
        }

        /* renamed from: a */
        public void m811a() {
            if (this.f2529id == 0) {
                Bitmap createTextureBitmap = LauncherShortcutStandardInfo.createTextureBitmap(null, "TSF Launcher", C4189x.m607a(this.f13290a, C3566b.f11841c.f11750H, C3566b.f11841c.f11751I), C3566b.f11841c, C3566b.f11841c.f11750H, C3566b.f11841c.f11751I, false);
                C0853a.m10853g().m10540a(this, createTextureBitmap);
                createTextureBitmap.recycle();
            }
        }

        /* renamed from: b */
        public void m810b() {
            if (this.f2529id != 0) {
                C0853a.m10853g().m10543a(this);
            }
        }
    }

    /* renamed from: com.tsf.shell.preference.a.c$a */
    /* loaded from: classes.dex */
    public static class C4079a {

        /* renamed from: b */
        private static final int[] f13287b = {0, 1, 8, 3, 4};

        /* renamed from: a */
        private C2359e f13288a = new C2359e(true);

        /* renamed from: c */
        private ArrayList<AbstractC3208b> f13289c = new ArrayList<>();

        public C4079a() {
            for (int i = 0; i < 5; i++) {
                C3224h c3224h = new C3224h(C3566b.f11841c);
                c3224h.m3154aL();
                this.f13289c.add(c3224h);
            }
            this.f13288a.m5726b();
            this.f13288a.m5713f();
            Iterator<AbstractC3208b> it = this.f13289c.iterator();
            while (it.hasNext()) {
                this.f13288a.m5734a(1, it.next());
            }
        }

        /* renamed from: a */
        public C2359e m814a() {
            if (this.f13288a == null) {
                this.f13288a = new C2359e(true);
            }
            return this.f13288a;
        }

        /* renamed from: b */
        public void m813b() {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < 5) {
                    AbstractC3208b abstractC3208b = this.f13289c.get(i2);
                    abstractC3208b.f10495k.textures().clear();
                    abstractC3208b.f10495k.textures().addElement(C3359a.f11084B.f13292a.m816a(f13287b[i2]));
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: c */
        public void m812c() {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < 5) {
                    this.f13289c.get(i2).f10495k.textures().clear();
                    C3359a.f11084B.f13292a.m815b(f13287b[i2]);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }
}
