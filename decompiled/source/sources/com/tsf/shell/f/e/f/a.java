package com.tsf.shell.f.e.f;

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
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;
import com.tsf.shell.f.d.c.a.d;
import com.tsf.shell.f.e.f.b;
import com.tsf.shell.f.e.h.b;
import com.tsf.shell.f.f.j;
import com.tsf.shell.f.i.b.e.f;
import com.tsf.shell.f.i.b.e.g;
import com.tsf.shell.manager.f.b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public class a implements b.a, e.a, b.a, b.a {
    private static HashMap<Integer, C0094a> a;
    private static ArrayList<Integer> p = new ArrayList<>();
    private ArrayList<c> b;
    private com.tsf.shell.f.i.c f;
    private com.tsf.shell.f.e.f.b g;
    private com.tsf.shell.f.i.b.e.a j;
    private c m;
    private boolean n;
    private i o;
    private d q;
    private boolean h = false;
    private boolean i = false;
    private float[] l = new float[2];
    private boolean r = false;
    private b.a k = new b.a();
    private ArrayList<c> c = new ArrayList<>();
    private j e = new j();
    private j d = new j() { // from class: com.tsf.shell.f.e.f.a.1
        Number3d a = new Number3d();

        @Override // com.censivn.C3DEngine.b.f.i
        public void onKillFocus() {
            a.this.a(true);
        }

        @Override // com.censivn.C3DEngine.b.f.j
        public void onDrawChildEnd() {
            if (a.this.f != null) {
                this.a.setAllFrom(a.this.f.position());
                PositionNumber3d position = a.this.f.position();
                a.this.f.position().y = 0.0f;
                position.x = 0.0f;
                a.this.f.dispatchDraw();
                a.this.f.position().setAllFrom(this.a);
                float f = a.this.f.scale().x;
                float f2 = f + ((1.0f - f) * 0.15f);
                a.this.f.scale().setAll(f2, f2, 1.0f);
            }
        }
    };

    public a() {
        int i = 0;
        this.d.addChild(this.e);
        this.d.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.d));
        this.d.mouseSkip(true);
        this.b = new ArrayList<>();
        for (int i2 = 0; i2 < 9; i2++) {
            this.b.add(new c(i2));
        }
        if (a == null) {
            a = new HashMap<>();
            a.put(0, new C0094a(ThemeShellDescription.ICON_MENU_DETAIL_ON, ThemeShellDescription.ICON_MENU_DETAIL_OFF, 0, x.c(b.i.text_detail)));
            a.put(1, new C0094a(ThemeShellDescription.ICON_MENU_EDIT_ON, ThemeShellDescription.ICON_MENU_EDIT_OFF, 1, x.c(b.i.text_edit)));
            a.put(2, new C0094a(ThemeShellDescription.ICON_MENU_EDIT_ON, ThemeShellDescription.ICON_MENU_EDIT_OFF, 2, x.c(b.i.text_rename)));
            a.put(4, new C0094a(ThemeShellDescription.ICON_MENU_DELETE_ON, ThemeShellDescription.ICON_MENU_DELETE_OFF, 4, x.c(b.i.text_delete)));
            a.put(3, new C0094a(ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_ON, ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_OFF, 3, x.c(b.i.text_multi_choice)));
            a.put(5, new C0094a(ThemeShellDescription.ICON_MENU_UNINSTALL_ON, ThemeShellDescription.ICON_MENU_UNINSTALL_OFF, 5, x.c(b.i.text_uninstall)));
            a.put(6, new C0094a(ThemeShellDescription.ICON_MENU_RESET_ON, ThemeShellDescription.ICON_MENU_RESET_OFF, 6, x.c(b.i.text_rotate)));
            a.put(7, new C0094a(ThemeShellDescription.ICON_MENU_ALIGN_ON, ThemeShellDescription.ICON_MENU_ALIGN_OFF, 7, x.c(b.i.text_snaplines)));
        }
        while (true) {
            int i3 = i;
            if (i3 < 9) {
                c cVar = this.b.get(i3);
                cVar.setMouseEventListener(new AnonymousClass2(this.d));
                cVar.calAABB();
                i = i3 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: com.tsf.shell.f.e.f.a$2  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass2 extends com.censivn.C3DEngine.b.d.a {
        boolean a;

        AnonymousClass2(i iVar) {
            super(iVar);
            this.a = false;
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void e(MotionEvent motionEvent) {
            float[] a = x.a(motionEvent, a.this.l);
            i hittingTarget = a.this.d.getHittingTarget(a[0], a[1], true);
            if (hittingTarget == null || !(hittingTarget instanceof c)) {
                a.this.a((c) null);
                return;
            }
            a.this.a((c) hittingTarget);
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void f(MotionEvent motionEvent) {
            if (a.this.m != null) {
                a.this.a(a.this.m.b.c, true);
            }
            a.this.m = null;
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            if (!this.a) {
                final float[] a = x.a(motionEvent2, a.this.l);
                this.a = true;
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.e.f.a.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        i hittingTarget = a.this.d.getHittingTarget(a[0], a[1], true);
                        if (hittingTarget == null || !(hittingTarget instanceof c)) {
                            a.this.a((c) null);
                        } else {
                            a.this.a((c) hittingTarget);
                        }
                        AnonymousClass2.this.a = false;
                    }
                });
            }
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent) {
            w.b();
        }
    }

    public boolean a() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar) {
        if (cVar != this.m) {
            if (this.m != null) {
                this.m.a(true);
            }
            this.m = cVar;
            if (cVar != null) {
                this.m.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        switch (i) {
            case 0:
                if (this.f instanceof g) {
                    com.tsf.shell.manager.a.A.c();
                    ((g) this.f).bh();
                    return;
                } else if (this.f instanceof f) {
                    com.tsf.shell.manager.a.A.c();
                    ((f) this.f).aV();
                    return;
                } else {
                    return;
                }
            case 1:
                if (this.f instanceof com.tsf.shell.f.i.b.e.a) {
                    com.tsf.shell.manager.a.A.c();
                    a((com.tsf.shell.f.i.b.e.a) this.f);
                    return;
                }
                return;
            case 2:
                com.tsf.shell.manager.a.A.c();
                b.a(this.f);
                return;
            case 3:
                this.f.aq();
                return;
            case 4:
                this.g.a(this.f);
                return;
            case 5:
                com.tsf.shell.manager.a.A.c();
                ((g) this.f).bg();
                return;
            case 6:
                this.f.G();
                return;
            case 7:
                this.f.H();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.g != null) {
            this.g.b(this);
            this.g.u();
            this.g = null;
        }
        com.tsf.shell.manager.a.j.b(this.d);
    }

    private ArrayList<Integer> a(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2, ArrayList<Integer> arrayList3) {
        ArrayList<Integer> arrayList4;
        if (arrayList2 != null) {
            ArrayList<Integer> arrayList5 = new ArrayList<>();
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (!a(next.intValue(), arrayList2)) {
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

    private boolean a(int i, ArrayList<Integer> arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i == arrayList.get(i2).intValue()) {
                return true;
            }
        }
        return false;
    }

    public void a(com.tsf.shell.f.i.c cVar, i iVar, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        if (!this.h) {
            this.e.position().reset();
            p.clear();
            cVar.a(p);
            this.o = iVar;
            this.c.clear();
            p = a(p, arrayList, arrayList2);
            this.g = cVar.ag();
            if (this.g != null) {
                this.g.a(this);
                this.g.t();
                com.censivn.C3DEngine.b.c.b.a(this);
                com.tsf.shell.manager.a.b.a(this);
                this.f = cVar;
                this.h = true;
                com.tsf.shell.manager.a.j.a(this.d, 0);
                Number3d localToGlobal = cVar.localToGlobal(new Number3d());
                float f = localToGlobal.x;
                float q = localToGlobal.y + this.g.q();
                this.d.position().x = f;
                this.d.position().y = q;
                cVar.alpha(0.0f);
                g();
                if (!this.n) {
                    com.tsf.shell.manager.a.c.c(this);
                }
                cVar.alpha(255.0f);
                int size = p.size();
                for (int i = 0; i < size; i++) {
                    c cVar2 = this.b.get(i);
                    cVar2.a(a.get(p.get(i)));
                    cVar2.removeFromParent();
                    this.e.addChild(cVar2);
                }
                com.tsf.shell.manager.a.v.e.h().a(p, f, q);
                this.d.setFocus();
            }
        }
    }

    private void g() {
        if (this.o != null) {
            this.n = true;
            com.tsf.shell.manager.a.e.a(i().b, (Runnable) null);
            this.o.visible(false);
            this.o.mouseEnabled(false);
            return;
        }
        this.n = false;
        com.tsf.shell.manager.a.e.a(this.k);
    }

    public void a(final com.tsf.shell.f.i.c cVar) {
        if (!this.r && this.q != null) {
            this.r = true;
            this.q.a();
            int a2 = this.q.a(p.size());
            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.e.f.a.3
                @Override // java.lang.Runnable
                public void run() {
                    a.this.r = false;
                    a.this.d.removeFromParent();
                    int size = a.p.size();
                    for (int i = 0; i < size; i++) {
                        ((c) a.this.b.get(i)).b();
                    }
                    a.this.q = null;
                    if (cVar != null && a.this.q != com.tsf.shell.manager.a.v.e.h()) {
                        a.this.b(cVar);
                    }
                }
            }, a2);
        }
    }

    public void b(com.tsf.shell.f.i.c cVar) {
        if (this.q != null) {
            a(cVar);
            return;
        }
        this.e.position().reset();
        p.clear();
        p.add(0);
        p.add(1);
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(5);
        p.add(7);
        this.d.removeFromParent();
        com.tsf.shell.manager.a.j.a(this.d, 0);
        float f = com.censivn.C3DEngine.b.b.a.z / 2.0f;
        float a2 = com.censivn.C3DEngine.b.b.a.a(250.0f);
        this.d.position().x = f;
        this.d.position().y = a2;
        int size = p.size();
        for (int i = 0; i < size; i++) {
            c cVar2 = this.b.get(i);
            cVar2.a(a.get(p.get(i)));
            cVar2.removeFromParent();
            this.e.addChild(cVar2);
        }
        this.q = com.tsf.shell.manager.a.v.e.h();
        this.q.a(p, f, a2);
    }

    private void a(int i, Runnable runnable, boolean z) {
        if (this.n) {
            com.tsf.shell.manager.a.e.a(i, runnable, z);
        } else {
            com.tsf.shell.manager.a.e.b(i, runnable, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.n) {
            this.o.visible(true);
            this.o.mouseEnabled(true);
            com.tsf.shell.manager.a.e.b();
        }
    }

    private j.a i() {
        j.a c2 = com.tsf.shell.f.f.j.c(this);
        c2.a = this;
        com.tsf.shell.manager.a.t.b(com.tsf.shell.f.f.j.c(), c2.b);
        com.tsf.shell.manager.a.e.dispatchDraw();
        this.o.dispatchDraw();
        com.tsf.shell.manager.a.t.b();
        return c2;
    }

    public void a(boolean z) {
        a(-1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, boolean z) {
        if (this.h && !this.i) {
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.e.f.a.4
                @Override // java.lang.Runnable
                public void run() {
                    int size = a.p.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((c) a.this.b.get(i2)).b();
                    }
                    if (!a.this.n) {
                        com.tsf.shell.manager.a.c.b(a.this);
                    }
                    a.this.h();
                    a.this.a(i);
                    a.this.h = false;
                    a.this.i = false;
                    a.this.f.mouseSkip(false);
                    a.this.f();
                    com.censivn.C3DEngine.b.c.b.b(a.this);
                    com.tsf.shell.manager.a.b.b(a.this);
                    com.tsf.shell.manager.a.v.e.f();
                    a.this.f = null;
                }
            };
            this.i = true;
            if (z) {
                float alpha = this.f.alpha();
                this.f.visible(false);
                this.f.alpha(0.0f);
                a(com.tsf.shell.manager.a.v.e.h().a(p.size()), runnable, z);
                this.f.alpha(alpha);
                this.f.visible(true);
                com.tsf.shell.manager.a.v.e.h().a();
                return;
            }
            a(com.tsf.shell.manager.a.v.e.h().a(p.size()), runnable, z);
            com.tsf.shell.manager.a.v.e.h().a();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            a(true);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    /* renamed from: com.tsf.shell.f.e.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0094a {
        private static Paint g;
        public String a;
        public String b;
        public int c;
        private TextureElement d;
        private TextureElement e;
        private String f;

        public C0094a(String str, String str2, int i, String str3) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.f = str3;
            if (g == null) {
                g = new Paint();
                g.setColor(-855638017);
                g.setTextSize(36.0f * com.censivn.C3DEngine.b.b.a.c);
                g.setAntiAlias(true);
                g.setTextAlign(Paint.Align.LEFT);
            }
        }

        public TextureElement a() {
            if (this.e == null) {
                this.e = ThemeManager.mix.iconMenu.getTextureElement(this.b, com.tsf.shell.manager.g.a.h, com.tsf.shell.manager.g.a.h);
            }
            return this.e;
        }

        public TextureElement b() {
            if (this.d == null) {
                this.d = ThemeManager.mix.iconMenu.getTextureElement(this.a, com.tsf.shell.manager.g.a.h, com.tsf.shell.manager.g.a.h);
            }
            return this.d;
        }

        public void c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(final com.tsf.shell.f.i.b bVar) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.e.f.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.c(com.tsf.shell.f.i.b.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(final com.tsf.shell.f.i.b bVar) {
            ItemInfo K = bVar.K();
            Context d = com.censivn.C3DEngine.a.d();
            View inflate = LayoutInflater.from(com.censivn.C3DEngine.a.d()).inflate(b.g.dialog_rename, (ViewGroup) null);
            final EditText editText = (EditText) inflate.findViewById(b.e.username_edit);
            editText.setText(K.title);
            AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
            builder.setTitle(b.i.rename_title);
            builder.setView(inflate);
            builder.setPositiveButton(d.getString(b.i.public_action_ok), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.e.f.a.b.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    String obj = editText.getText().toString();
                    if (bVar instanceof com.tsf.shell.f.i.b.e.a) {
                        ((com.tsf.shell.f.i.b.e.a) bVar).a(obj);
                    } else if (bVar instanceof com.tsf.shell.f.i.b.d.b) {
                        ((com.tsf.shell.f.i.b.d.b) bVar).a(obj);
                    }
                }
            });
            builder.setNegativeButton(d.getString(b.i.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.f.e.f.a.b.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            builder.show();
        }
    }

    /* loaded from: classes.dex */
    public class c extends com.censivn.C3DEngine.b.f.j {
        public C0094a b;
        public int e;
        public boolean a = false;
        public k c = new k(com.tsf.shell.manager.g.a.h, com.tsf.shell.manager.g.a.h, false);
        public m d = new m();

        public c(int i) {
            this.e = i;
            this.d.d(36);
            this.d.e(-855638017);
            addChild(this.c);
            addChild(this.d);
        }

        public void a(C0094a c0094a) {
            this.b = c0094a;
            this.d.a(c0094a.f);
            a(false);
        }

        public void a() {
            this.c.textures().clear();
            if (this.b != null) {
                this.c.textures().addElement(this.b.b());
            }
            com.tsf.shell.manager.a.v.e.h().a(this);
        }

        public void a(boolean z) {
            this.c.textures().clear();
            if (this.b != null) {
                this.c.textures().addElement(this.b.a());
            }
            if (z) {
                com.tsf.shell.manager.a.v.e.h().b(this);
            }
        }

        public void b() {
            com.censivn.C3DEngine.b.g.c.a(this.c);
            com.censivn.C3DEngine.b.g.c.a(this.d);
            com.censivn.C3DEngine.b.g.c.a(this);
            removeFromParent();
            this.a = false;
            this.c.textures().clear();
            this.c.rotation().setAll(0.0f, 0.0f, 0.0f);
            this.c.position().setAll(0.0f, 0.0f, 0.0f);
            this.c.scale().setAll(1.0f, 1.0f, 1.0f);
            this.c.alpha(255.0f);
            position().setAll(0.0f, 0.0f, 0.0f);
            rotation().setAll(0.0f, 0.0f, 0.0f);
            scale().setAll(1.0f, 1.0f, 1.0f);
            alpha(255.0f);
            this.d.position().setAll(0.0f, 0.0f, 0.0f);
            this.d.rotation().setAll(0.0f, 0.0f, 0.0f);
            this.d.scale().setAll(1.0f, 1.0f, 1.0f);
            this.d.b(1);
            this.d.alpha(255.0f);
            removeFromParent();
            this.d.a();
            if (this.b != null) {
                this.b.c();
                this.b = null;
            }
        }
    }

    @Override // com.tsf.shell.f.e.h.b.a
    public void a(Bitmap bitmap, String str) {
        if (this.j != null) {
            this.j.a(bitmap, str);
            this.j = null;
        }
    }

    @Override // com.tsf.shell.f.e.h.b.a
    public void b() {
        if (this.j != null) {
            this.j.q();
            this.j = null;
        }
    }

    public void a(com.tsf.shell.f.i.b.e.a aVar) {
        this.j = aVar;
        int[] aG = aVar.aG();
        com.tsf.shell.f.e.h.b.a(this, aVar, aG[0], aG[1]);
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i, int i2, int i3, int i4) {
        a(false);
    }

    public ArrayList<c> c() {
        return this.b;
    }

    public com.censivn.C3DEngine.b.f.j d() {
        return this.e;
    }
}
