package com.tsf.shell.manager.wallpaper;

import android.content.Intent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1024b;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1036f;
import com.censivn.C3DEngine.p031b.p046h.p048b.C1040h;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.plugin.themepicker.wallpaper.WallpaperAppActivity;
import com.tsf.shell.plugin.themepicker.wallpaper.WallpaperPickerActivity;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.wallpaper.b */
/* loaded from: classes.dex */
public class C3755b extends C2578b {

    /* renamed from: a */
    private C1040h f12346a;

    /* renamed from: b */
    private C3770e f12347b;

    /* renamed from: c */
    private ArrayList<C3764c> f12348c;

    /* renamed from: d */
    private C3765c f12349d;

    /* renamed from: e */
    private C3595e.C3597a f12350e;

    public C3755b(C3770e c3770e) {
        super(C4189x.m588c(C1306b.C1315i.text_wallpapers));
        this.f12347b = c3770e;
        m1547a();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onRecycle() {
        Iterator<C3764c> it = this.f12348c.iterator();
        while (it.hasNext()) {
            it.next().mo1533b();
        }
    }

    /* renamed from: a */
    private void m1547a() {
        this.f12350e = C3359a.f11087a.m1929a(C3595e.f11931p);
        this.f12349d = new C3765c();
        this.f12348c = new ArrayList<>();
        this.f12348c.add(new C3763b(C4189x.m588c(C1306b.C1315i.theme_picker_theme_picker_gallery_apps), C1306b.C1310d.wallpaper_gallery_preview) { // from class: com.tsf.shell.manager.wallpaper.b.1
            @Override // com.tsf.shell.manager.wallpaper.C3755b.C3764c
            /* renamed from: a */
            public void mo1535a() {
                Intent intent = new Intent();
                intent.setClass(C0853a.m10856d(), WallpaperAppActivity.class);
                Home.m6177b().startActivity(intent);
            }
        });
        this.f12348c.add(new C3763b(C4189x.m588c(C1306b.C1315i.text_launcher), C1306b.C1310d.wallpaper_launcher_preview) { // from class: com.tsf.shell.manager.wallpaper.b.2
            @Override // com.tsf.shell.manager.wallpaper.C3755b.C3764c
            /* renamed from: a */
            public void mo1535a() {
                Intent intent = new Intent();
                intent.setClass(C0853a.m10856d(), WallpaperPickerActivity.class);
                Home.m6177b().startActivity(intent);
            }
        });
        this.f12348c.add(new C3769d(C4189x.m588c(C1306b.C1315i.text_live_wallpapers)));
        this.f12346a = new C1040h(C0892a.f2553D, this.f12347b.getHeight(), C0892a.f2567c * 20.0f, C0892a.f2567c * 20.0f, C0892a.m10742a(320.0f), C0892a.m10742a(520.0f));
        this.f12346a.m10160a(new C1024b() { // from class: com.tsf.shell.manager.wallpaper.b.3
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public int mo725a() {
                return C3755b.this.f12348c.size();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1024b
            /* renamed from: a */
            public C0975i mo724a(int i, C0975i c0975i) {
                return (C0975i) C3755b.this.f12348c.get(i);
            }
        });
        this.f12346a.m10159a(new C1036f() { // from class: com.tsf.shell.manager.wallpaper.b.4
            @Override // com.censivn.C3DEngine.p031b.p046h.p048b.C1036f
            /* renamed from: a */
            public void mo723a(C0975i c0975i, int i, MotionEvent motionEvent) {
                C4187w.m614b();
                ((C3764c) C3755b.this.f12348c.get(i)).mo1535a();
            }
        });
        ArrayList<C2574a.C2575a> arrayList = new ArrayList<>();
        C2574a.C2575a c2575a = new C2574a.C2575a(C1306b.C1310d.wallpaper_setting_scrollable, C4189x.m588c(C1306b.C1315i.text_scrollable), new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.manager.wallpaper.b.5
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return C3430e.m2547Y() == ShellWallpaperManager.f12289a;
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: b */
            public void mo1543b() {
                C3430e.m2445l(ShellWallpaperManager.f12289a);
                C3359a.f11092f.m1586d();
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
                C3430e.m2445l(ShellWallpaperManager.f12290b);
                C3359a.f11092f.m1586d();
            }
        });
        C2574a.C2575a.C2577a c2577a = new C2574a.C2575a.C2577a() { // from class: com.tsf.shell.manager.wallpaper.b.6
            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: a */
            public boolean mo1542a() {
                return true;
            }

            @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2574a.C2575a.C2577a
            /* renamed from: c */
            public void mo1541c() {
                C3755b.this.f12347b.changeMenu(C3755b.this.f12349d);
                C3755b.this.f12349d.setParentMenu(C3755b.this);
            }
        };
        if (!C3359a.f11092f.m1581f()) {
            arrayList.add(new C2574a.C2575a(C1306b.C1310d.wallpaper_setting_blur, C4189x.m588c(C1306b.C1315i.text_blur), c2577a));
        }
        arrayList.add(c2575a);
        setFunctions(arrayList);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        this.f12350e.m1916b();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        this.f12346a.m10166a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.f12346a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.wallpaper.b$c */
    /* loaded from: classes.dex */
    public static class C3764c extends C0980j {

        /* renamed from: b */
        public static final int f12360b = (int) C0892a.m10742a(300.0f);

        /* renamed from: c */
        public static final int f12361c = (int) C0892a.m10742a(500.0f);

        /* renamed from: a */
        private C0984m f12362a = new C0984m();

        /* renamed from: d */
        private C0975i f12363d;

        public C3764c(String str) {
            this.f12362a.m10355a(str);
            this.f12362a.m10347d(36);
            addChild(this.f12362a);
            this.f12362a.position().f2527y = ((-f12361c) / 2.0f) - C0892a.m10742a(5.0f);
        }

        /* renamed from: a */
        public void mo1534a(C0975i c0975i) {
            this.f12363d = c0975i;
            this.f12363d.position().f2527y = C0892a.m10742a(25.0f);
            addChild(this.f12363d);
        }

        /* renamed from: b */
        public void mo1533b() {
            this.f12362a.m10358a();
        }

        /* renamed from: a */
        public void mo1535a() {
        }
    }

    /* renamed from: com.tsf.shell.manager.wallpaper.b$b */
    /* loaded from: classes.dex */
    static class C3763b extends C3764c {

        /* renamed from: a */
        private C3762a f12359a;

        public C3763b(String str, int i) {
            super(str);
            this.f12359a = new C3762a();
            this.f12359a.m1539a(i);
            mo1534a(this.f12359a);
        }

        @Override // com.tsf.shell.manager.wallpaper.C3755b.C3764c
        /* renamed from: b */
        public void mo1533b() {
            this.f12359a.m1540a();
            super.mo1533b();
        }
    }

    /* renamed from: com.tsf.shell.manager.wallpaper.b$a */
    /* loaded from: classes.dex */
    static class C3762a extends C0981k {

        /* renamed from: a */
        private TextureElement f12357a;

        /* renamed from: d */
        private int f12358d;

        public C3762a() {
            super(C3764c.f12360b, C3764c.f12361c, false);
            this.f12358d = -1;
            calAABB(1.1f, 1.1f, 1.0f);
            this.f12357a = new TextureElement(0, false);
            textures().addElement(this.f12357a);
        }

        /* renamed from: a */
        public void m1539a(int i) {
            m1540a();
            this.f12358d = i;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (this.f12358d != 0 && this.f12357a.f2529id == 0) {
                C0853a.m10853g().m10542a(this.f12357a, this.f12358d);
            }
        }

        /* renamed from: a */
        public void m1540a() {
            if (this.f12357a.f2529id != 0) {
                C0853a.m10853g().m10543a(this.f12357a);
            }
        }
    }
}
