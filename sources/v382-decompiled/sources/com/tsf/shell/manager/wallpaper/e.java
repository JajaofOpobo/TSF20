package com.tsf.shell.manager.wallpaper;

import android.content.Intent;
import android.view.MotionEvent;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.plugin.themepicker.wallpaper.WallpaperAppActivity;
import com.tsf.shell.plugin.themepicker.wallpaper.WallpaperPickerActivity;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e extends com.tsf.shell.e.e.g.a.d {
    private com.censivn.C3DEngine.b.h.b.i a;
    private l b;
    private ArrayList c;

    public e(l lVar) {
        super(x.c(R.string.text_wallpapers));
        this.b = lVar;
        a();
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onRecycle() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((h) it.next()).b();
        }
    }

    private void a() {
        this.c = new ArrayList();
        this.c.add(new g(x.c(R.string.theme_picker_theme_picker_gallery_apps), R.drawable.wallpaper_gallery_preview) { // from class: com.tsf.shell.manager.wallpaper.e.1
            @Override // com.tsf.shell.manager.wallpaper.h
            public void a() {
                Intent intent = new Intent();
                intent.setClass(com.censivn.C3DEngine.a.d(), WallpaperAppActivity.class);
                Home.b().startActivity(intent);
            }
        });
        this.c.add(new g(x.c(R.string.text_launcher), R.drawable.wallpaper_launcher_preview) { // from class: com.tsf.shell.manager.wallpaper.e.2
            @Override // com.tsf.shell.manager.wallpaper.h
            public void a() {
                Intent intent = new Intent();
                intent.setClass(com.censivn.C3DEngine.a.d(), WallpaperPickerActivity.class);
                Home.b().startActivity(intent);
            }
        });
        this.c.add(new k(x.c(R.string.text_live_wallpapers)));
        this.a = new com.censivn.C3DEngine.b.h.b.i(com.censivn.C3DEngine.b.b.a.D, this.b.getHeight(), com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.c * 20.0f, com.censivn.C3DEngine.b.b.a.a(320.0f), com.censivn.C3DEngine.b.b.a.a(520.0f));
        this.a.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.wallpaper.e.3
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return e.this.c.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public com.censivn.C3DEngine.b.f.j a(int i, com.censivn.C3DEngine.b.f.j jVar) {
                return (com.censivn.C3DEngine.b.f.j) e.this.c.get(i);
            }
        });
        this.a.a(new com.censivn.C3DEngine.b.h.b.g() { // from class: com.tsf.shell.manager.wallpaper.e.4
            @Override // com.censivn.C3DEngine.b.h.b.g
            public void a(com.censivn.C3DEngine.b.f.j jVar, int i, MotionEvent motionEvent) {
                w.b();
                ((h) e.this.c.get(i)).a();
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.tsf.shell.e.e.g.a.b(R.drawable.wallpaper_setting_scrollable, "Scrollable", new com.tsf.shell.e.e.g.a.c() { // from class: com.tsf.shell.manager.wallpaper.e.5
            @Override // com.tsf.shell.e.e.g.a.c
            public boolean a() {
                return com.tsf.shell.manager.b.g.X() == ShellWallpaperManager.a;
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void b() {
                com.tsf.shell.manager.b.g.k(ShellWallpaperManager.a);
                com.tsf.shell.manager.a.f.d();
            }

            @Override // com.tsf.shell.e.e.g.a.c
            public void c() {
                com.tsf.shell.manager.b.g.k(ShellWallpaperManager.b);
                com.tsf.shell.manager.a.f.d();
            }
        }));
        setFunctions(arrayList);
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public void onLayout(float f, float f2, float f3, float f4) {
        this.a.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.e.e.g.a.e
    public com.censivn.C3DEngine.b.f.l getContentContainer() {
        return this.a;
    }
}
