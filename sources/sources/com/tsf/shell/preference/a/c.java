package com.tsf.shell.preference.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.tsf.b;
import com.tsf.shell.f.i.b.e.h;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    private ArrayList<b> a = new ArrayList<>();
    private a b;

    public c() {
        this.a.add(new b(b.d.demo_icon_1));
        this.a.add(new b(b.d.demo_icon_2));
        this.a.add(new b(b.d.demo_icon_3));
        this.a.add(new b(b.d.demo_icon_4));
        this.a.add(new b(b.d.demo_icon_5));
        this.a.add(new b(b.d.demo_icon_6));
        this.a.add(new b(b.d.demo_icon_7));
        this.a.add(new b(b.d.demo_icon_8));
        this.a.add(new b(b.d.action_app_drawer_icon));
    }

    public a a() {
        if (this.b == null) {
            this.b = new a();
        }
        return this.b;
    }

    public TextureElement a(int i) {
        b bVar = this.a.get(i);
        bVar.a();
        return bVar;
    }

    public void b(int i) {
        this.a.get(i).b();
    }

    public class b extends TextureElement {
        public int a;

        public b(int i) {
            super(0, false);
            this.a = i;
        }

        public void a() {
            if (this.id == 0) {
                Bitmap bitmapCreateTextureBitmap = LauncherShortcutStandardInfo.createTextureBitmap(null, "TSF Launcher", x.a(this.a, com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I), com.tsf.shell.manager.o.b.c, com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I, false);
                com.censivn.C3DEngine.a.g().a(this, bitmapCreateTextureBitmap);
                bitmapCreateTextureBitmap.recycle();
            }
        }

        public void b() {
            if (this.id != 0) {
                com.censivn.C3DEngine.a.g().a(this);
            }
        }
    }

    public static class a {
        private static final int[] b = {0, 1, 8, 3, 4};
        private com.tsf.shell.f.c.b.e a = new com.tsf.shell.f.c.b.e(true);
        private ArrayList<com.tsf.shell.f.i.b.e.b> c = new ArrayList<>();

        public a() {
            for (int i = 0; i < 5; i++) {
                h hVar = new h(com.tsf.shell.manager.o.b.c);
                hVar.aL();
                this.c.add(hVar);
            }
            this.a.b();
            this.a.f();
            Iterator<com.tsf.shell.f.i.b.e.b> it = this.c.iterator();
            while (it.hasNext()) {
                this.a.a(1, it.next());
            }
        }

        public com.tsf.shell.f.c.b.e a() {
            if (this.a == null) {
                this.a = new com.tsf.shell.f.c.b.e(true);
            }
            return this.a;
        }

        public void b() {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < 5) {
                    com.tsf.shell.f.i.b.e.b bVar = this.c.get(i2);
                    bVar.k.textures().clear();
                    bVar.k.textures().addElement(com.tsf.shell.manager.a.B.a.a(b[i2]));
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }

        public void c() {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < 5) {
                    this.c.get(i2).k.textures().clear();
                    com.tsf.shell.manager.a.B.a.b(b[i2]);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }
}
