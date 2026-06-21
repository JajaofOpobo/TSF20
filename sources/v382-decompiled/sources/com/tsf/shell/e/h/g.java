package com.tsf.shell.e.h;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.R;
import com.tsf.shell.manager.r.c.i;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.h;
import com.tsf.shell.utils.x;
import com.tsf.shell.v;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends com.censivn.C3DEngine.b.h.e.b {
    private m b;
    private c c;
    private com.tsf.shell.manager.r.b.b d;
    private m e;
    private TextureElement f;
    private boolean g;

    public g(c cVar, j jVar, float f, float f2, float f3, float f4, float f5) {
        super(jVar, f, f2, f3, f4, f5, 1.0f);
        this.g = false;
        this.c = cVar;
        this.f = new TextureElement(0, false);
        this.e = new m(com.tsf.shell.manager.g.a.b, com.tsf.shell.manager.g.a.b, false);
        this.e.textures().addElement(this.f);
        o();
    }

    public void o() {
        TextureElement b = x.b(R.drawable.smart_button_add_icon);
        this.b = new m(com.censivn.C3DEngine.b.b.a.c * 128.0f, com.censivn.C3DEngine.b.b.a.c * 128.0f, false);
        this.b.moveAllPointsPX(0.0f, com.tsf.shell.manager.o.b.c.Y, 0.0f);
        this.b.calAABB(2.0f, 2.0f, 1.0f);
        this.b.textures().addElement(b);
        com.tsf.shell.manager.o.c.a(this.b, com.tsf.shell.manager.o.c.e);
        this.b.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.b) { // from class: com.tsf.shell.e.h.g.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                g.this.r();
            }
        });
        this.d = new com.tsf.shell.manager.r.b.b() { // from class: com.tsf.shell.e.h.g.2
            @Override // com.tsf.shell.manager.r.b.b
            public void a() {
                com.tsf.shell.manager.a.o.j();
            }

            @Override // com.tsf.shell.manager.r.b.b
            public void a(com.tsf.shell.e.i.b.e.b bVar) {
                bVar.K().onUpdateContainer(-2);
                g.this.a(bVar);
                g.this.e(bVar);
            }

            @Override // com.tsf.shell.manager.r.b.b
            public com.tsf.shell.manager.o.a b() {
                return com.tsf.shell.manager.o.b.b;
            }
        };
        a(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.e.h.g.3
            private j b = null;

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                g.this.r();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                if (g.this.g) {
                    g.this.a();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.b = g.this.a(motionEvent);
                if (this.b != g.this.b && this.b != null && (this.b instanceof com.tsf.shell.e.i.b.e.b)) {
                    ((com.tsf.shell.e.i.b.e.b) this.b).aQ();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (this.b != g.this.b) {
                    if (this.b != null && (this.b instanceof com.tsf.shell.e.i.b.e.b)) {
                        com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) this.b;
                        if (g.this.g) {
                            i.a(bVar, (Runnable) null);
                            return;
                        } else {
                            bVar.l();
                            return;
                        }
                    }
                    return;
                }
                g.this.r();
            }
        });
    }

    @Override // com.censivn.C3DEngine.b.h.e.b
    public void c(j jVar) {
        if (this.g && (jVar instanceof com.tsf.shell.e.i.b.e.b) && jVar.visible()) {
            this.e.position().x = jVar.position().x + com.censivn.C3DEngine.b.b.a.a(50.0f);
            this.e.position().y = jVar.position().y + com.censivn.C3DEngine.b.b.a.a(60.0f);
            this.e.dispatchDraw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (!this.g) {
            this.e.scale().setAll(0.0f, 0.0f, 1.0f);
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.l(1.0f);
            xVar.m(1.0f);
            xVar.a(com.censivn.C3DEngine.b.g.a.e);
            w.a(this.e);
            w.a(this.e, 500, xVar);
            Bitmap bitmap = ThemeManager.mix.shellOther.getTheme().getBitmap(ThemeShellDescription.PUBLIC_BUTTON_DELETE, com.tsf.shell.manager.g.a.b, com.tsf.shell.manager.g.a.b);
            com.censivn.C3DEngine.a.g().a(this.f, bitmap);
            bitmap.recycle();
            this.g = true;
            com.tsf.shell.manager.a.i.a.a(this.d);
            com.tsf.shell.manager.a.o.a(com.tsf.shell.manager.a.i.a.getScreenFreeSpaceBottom());
            this.b.removeFromParent();
        }
    }

    public void p() {
        if (this.g) {
            b();
            this.g = false;
            f(this.b);
            s();
        }
    }

    public static String q() {
        Cursor query = com.censivn.C3DEngine.a.d().getContentResolver().query(v.a, null, null, null, null);
        String str = "";
        while (query.moveToNext()) {
            str = query.getString(query.getColumnIndex("child"));
        }
        if (str == null) {
            str = "";
        }
        query.close();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.e.i.b.e.b bVar) {
    }

    public void a(ArrayList arrayList, String str) {
        Iterator it = h.a(arrayList, str, ",", true).iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.b a = com.tsf.shell.manager.l.a.a((ItemInfo) it.next(), com.tsf.shell.manager.o.b.b, true);
            a(a);
            f(a);
        }
        f(this.b);
    }

    private void s() {
        Iterator it = c().children().iterator();
        final String str = "";
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar instanceof com.tsf.shell.e.i.c) {
                str = String.valueOf(str) + ((com.tsf.shell.e.i.c) jVar).K().id + ",";
            }
        }
        com.censivn.C3DEngine.a.a().e(new Runnable() { // from class: com.tsf.shell.e.h.g.4
            @Override // java.lang.Runnable
            public void run() {
                ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
                ContentValues contentValues = new ContentValues();
                contentValues.put("child", str);
                contentResolver.update(ContentUris.withAppendedId(v.a, 1L), contentValues, null, null);
                contentValues.clear();
            }
        });
    }
}
