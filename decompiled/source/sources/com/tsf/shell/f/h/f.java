package com.tsf.shell.f.h;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.g;
import com.tsf.shell.manager.r.b.a;
import com.tsf.shell.manager.r.c.g;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.h;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class f extends com.censivn.C3DEngine.b.h.e.b {
    private k b;
    private c c;
    private a.C0144a d;
    private k e;
    private TextureElement f;
    private boolean g;

    public f(c cVar, i iVar, float f, float f2, float f3, float f4, float f5) {
        super(iVar, f, f2, f3, f4, f5, 1.0f);
        this.g = false;
        this.c = cVar;
        this.f = new TextureElement(0, false);
        this.e = new k(com.tsf.shell.manager.g.a.b, com.tsf.shell.manager.g.a.b, false);
        this.e.textures().addElement(this.f);
        o();
    }

    public void o() {
        TextureElement b = x.b(b.d.smart_button_add_icon);
        this.b = new k(com.censivn.C3DEngine.b.b.a.c * 128.0f, com.censivn.C3DEngine.b.b.a.c * 128.0f, false);
        this.b.moveAllPointsPX(0.0f, com.tsf.shell.manager.o.b.c.Y, 0.0f);
        this.b.calAABB(2.0f, 2.0f, 1.0f);
        this.b.textures().addElement(b);
        com.tsf.shell.manager.o.c.a(this.b, com.tsf.shell.manager.o.c.e);
        this.b.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.b) { // from class: com.tsf.shell.f.h.f.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                f.this.r();
            }
        });
        this.d = new a.C0144a() { // from class: com.tsf.shell.f.h.f.2
            @Override // com.tsf.shell.manager.r.b.a.C0144a
            public void a() {
                com.tsf.shell.manager.a.o.j();
            }

            @Override // com.tsf.shell.manager.r.b.a.C0144a
            public void a(com.tsf.shell.f.i.b.e.b bVar) {
                bVar.K().onUpdateContainer(-2);
                f.this.a(bVar);
                f.this.e(bVar);
            }

            @Override // com.tsf.shell.manager.r.b.a.C0144a
            public com.tsf.shell.manager.o.a b() {
                return com.tsf.shell.manager.o.b.b;
            }
        };
        a(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.f.h.f.3
            private i b = null;

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                f.this.r();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                if (f.this.g) {
                    f.this.a();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                this.b = f.this.a(motionEvent);
                if (this.b != f.this.b && this.b != null && (this.b instanceof com.tsf.shell.f.i.b.e.b)) {
                    ((com.tsf.shell.f.i.b.e.b) this.b).aQ();
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (this.b == f.this.b) {
                    f.this.r();
                } else if (this.b != null && (this.b instanceof com.tsf.shell.f.i.b.e.b)) {
                    com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) this.b;
                    if (f.this.g) {
                        g.a(bVar, (Runnable) null);
                    } else {
                        bVar.l();
                    }
                }
            }
        });
    }

    @Override // com.censivn.C3DEngine.b.h.e.b
    public void c(i iVar) {
        if (this.g && (iVar instanceof com.tsf.shell.f.i.b.e.b) && iVar.visible()) {
            this.e.position().x = iVar.position().x + com.censivn.C3DEngine.b.b.a.a(50.0f);
            this.e.position().y = iVar.position().y + com.censivn.C3DEngine.b.b.a.a(60.0f);
            this.e.dispatchDraw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (!this.g) {
            this.e.scale().setAll(0.0f, 0.0f, 1.0f);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(1.0f);
            dVar.m(1.0f);
            dVar.a(com.censivn.C3DEngine.b.g.a.e);
            com.censivn.C3DEngine.b.g.c.a(this.e);
            com.censivn.C3DEngine.b.g.c.a(this.e, 500, dVar);
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
        Cursor query = com.censivn.C3DEngine.a.d().getContentResolver().query(g.f.a, null, null, null, null);
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
    public void a(com.tsf.shell.f.i.b.e.b bVar) {
    }

    public void a(ArrayList<ItemInfo> arrayList, String str) {
        Iterator<ItemInfo> it = h.a(arrayList, str, ",", true).iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.b a = com.tsf.shell.manager.l.a.a(it.next(), com.tsf.shell.manager.o.b.b, true);
            a(a);
            f(a);
        }
        f(this.b);
    }

    private void s() {
        i next;
        String str;
        final String str2 = "";
        Iterator<i> it = c().children().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof com.tsf.shell.f.i.b) {
                str = str2 + ((com.tsf.shell.f.i.b) next).K().id + ",";
            } else {
                str = str2;
            }
            str2 = str;
        }
        com.censivn.C3DEngine.a.a().e(new Runnable() { // from class: com.tsf.shell.f.h.f.4
            @Override // java.lang.Runnable
            public void run() {
                ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
                ContentValues contentValues = new ContentValues();
                contentValues.put("child", str2);
                contentResolver.update(ContentUris.withAppendedId(g.f.a, 1L), contentValues, null, null);
                contentValues.clear();
            }
        });
    }
}
