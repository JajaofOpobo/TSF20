package com.tsf.shell.manager.r.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.R;
import com.tsf.shell.e.i.c.a.k;
import com.tsf.shell.e.i.c.a.l;
import com.tsf.shell.e.i.c.a.m;
import com.tsf.shell.e.i.c.a.q;
import com.tsf.shell.e.i.c.a.s;
import com.tsf.shell.utils.x;
import com.tsf.shell.widget.alarm.an;

/* loaded from: classes.dex */
public class h {
    public static com.tsf.shell.e.i.c.i a(Context context, String str, String str2, String str3, com.tsf.shell.manager.a.i iVar) {
        com.tsf.shell.e.i.c.i a = a(str2, iVar);
        b(a, context, str, str2, str3, iVar);
        return a;
    }

    private static void b(final com.tsf.shell.e.i.c.i iVar, Context context, String str, String str2, String str3, com.tsf.shell.manager.a.i iVar2) {
        if (!iVar.e) {
            iVar.b = str3;
            iVar.a = str2;
            iVar.c = str2;
            iVar.d = 5;
            iVar.a(str);
            try {
                iVar.i = context.getPackageManager().getPackageInfo(str2, 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            int identifier = context.getResources().getIdentifier("singleTask", "bool", str2);
            if (identifier > 0) {
                iVar.f = context.getResources().getBoolean(identifier);
            } else {
                iVar.f = false;
            }
            int identifier2 = context.getResources().getIdentifier("minSdkVersion", "integer", str2);
            if (identifier2 > 0) {
                iVar.h = context.getResources().getInteger(identifier2);
            } else {
                iVar.h = 0;
            }
            if (str3.equals(an.class.getName())) {
                iVar.f = true;
            }
            int identifier3 = context.getResources().getIdentifier("category", "string", str2);
            if (identifier3 > 0) {
                if (context.getResources().getString(identifier3).equals("tool")) {
                    iVar.g = 0;
                } else {
                    iVar.g = 1;
                }
            } else {
                iVar.g = 0;
            }
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.h.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tsf.shell.e.i.c.i.this.l();
                }
            });
        }
    }

    public static void a(com.tsf.shell.e.i.c.i iVar, Context context, String str, String str2, String str3, com.tsf.shell.manager.a.i iVar2) {
        b(iVar, context, str, str2, str3, iVar2);
    }

    public static com.tsf.shell.e.i.c.i a(String str, com.tsf.shell.manager.a.i iVar) {
        com.tsf.shell.e.i.c.i iVar2;
        float f = 0.5f;
        float f2 = 0.45f;
        float f3 = 0.0f;
        if (str.equals("com.tsf.shell.widget.music")) {
            iVar2 = new com.tsf.shell.e.i.c.b(0.42f, f3, f3) { // from class: com.tsf.shell.manager.r.c.h.5
                @Override // com.tsf.shell.e.i.c.b
                public q e_() {
                    return new m(new VTextureManager(), com.censivn.C3DEngine.a.d(), 0.6f, (-230.0f) * com.censivn.C3DEngine.b.b.a.c);
                }
            };
        } else if (str.equals("com.tsf.shell.widget.message")) {
            iVar2 = new com.tsf.shell.e.i.c.b(0.41f, f3, (-40.0f) * com.censivn.C3DEngine.b.b.a.c) { // from class: com.tsf.shell.manager.r.c.h.6
                @Override // com.tsf.shell.e.i.c.b
                public q e_() {
                    return new l(new VTextureManager(), com.censivn.C3DEngine.a.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.alarm")) {
            iVar2 = new com.tsf.shell.e.i.c.b(0.33f, f3, com.censivn.C3DEngine.b.b.a.c * (-15.0f)) { // from class: com.tsf.shell.manager.r.c.h.7
                @Override // com.tsf.shell.e.i.c.b
                public q e_() {
                    return new com.tsf.shell.e.i.c.a.c(new VTextureManager(), com.censivn.C3DEngine.a.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.calendar")) {
            iVar2 = new com.tsf.shell.e.i.c.b(0.28f, f3, com.censivn.C3DEngine.b.b.a.c * (-15.0f)) { // from class: com.tsf.shell.manager.r.c.h.8
                @Override // com.tsf.shell.e.i.c.b
                public q e_() {
                    return new com.tsf.shell.e.i.c.a.a.b(new VTextureManager(), com.censivn.C3DEngine.a.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.cubeclock")) {
            iVar2 = new com.tsf.shell.e.i.c.b(0.6f * com.censivn.C3DEngine.b.b.a.c, f3, f3) { // from class: com.tsf.shell.manager.r.c.h.9
                @Override // com.tsf.shell.e.i.c.b
                public q e_() {
                    return new com.tsf.shell.e.i.c.a.b.c(new VTextureManager(), com.censivn.C3DEngine.a.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.weather")) {
            iVar2 = new com.tsf.shell.e.i.c.b(f, f3, (-20.0f) * com.censivn.C3DEngine.b.b.a.c) { // from class: com.tsf.shell.manager.r.c.h.10
                @Override // com.tsf.shell.e.i.c.b
                public q e_() {
                    return new s(new VTextureManager(), com.censivn.C3DEngine.a.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.memo")) {
            iVar2 = new com.tsf.shell.e.i.c.b(f, f3, (-10.0f) * com.censivn.C3DEngine.b.b.a.c) { // from class: com.tsf.shell.manager.r.c.h.11
                @Override // com.tsf.shell.e.i.c.b
                public q e_() {
                    return new k(new VTextureManager(), com.censivn.C3DEngine.a.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.gallery")) {
            iVar2 = new com.tsf.shell.e.i.c.b(f2, f3, f3) { // from class: com.tsf.shell.manager.r.c.h.12
                @Override // com.tsf.shell.e.i.c.b
                public q e_() {
                    return new com.tsf.shell.e.i.c.a.h(new VTextureManager(), com.censivn.C3DEngine.a.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.adornment")) {
            iVar2 = new com.tsf.shell.e.i.c.b(0.55f, f3, (-50.0f) * com.censivn.C3DEngine.b.b.a.c) { // from class: com.tsf.shell.manager.r.c.h.2
                @Override // com.tsf.shell.e.i.c.b
                public q e_() {
                    return new com.tsf.shell.e.i.c.a.a(new VTextureManager(), com.censivn.C3DEngine.a.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.dotsclock")) {
            iVar2 = new com.tsf.shell.e.i.c.b(f2, f3, f3) { // from class: com.tsf.shell.manager.r.c.h.3
                @Override // com.tsf.shell.e.i.c.b
                public q e_() {
                    return new com.tsf.shell.e.i.c.a.c.c(new VTextureManager(), com.censivn.C3DEngine.a.d());
                }
            };
        } else {
            iVar2 = new com.tsf.shell.e.i.c.i() { // from class: com.tsf.shell.manager.r.c.h.4
                private com.censivn.C3DEngine.b.f.m k;
                private TextureElement l = new TextureElement(0, false);

                @Override // com.tsf.shell.e.i.c.i, com.tsf.shell.e.i.c.g
                public j a(int i, int i2, boolean z) {
                    if (this.k == null) {
                        this.k = new com.censivn.C3DEngine.b.f.m(com.tsf.shell.manager.o.b.a.H, com.tsf.shell.manager.o.b.a.I, false);
                        this.k.textures().addElement(this.l);
                    }
                    p();
                    return this.k;
                }

                @Override // com.tsf.shell.e.i.c.i, com.tsf.shell.e.i.c.g
                public void a() {
                    super.a();
                    if (this.k != null) {
                        this.k.destroy();
                    }
                    if (this.l.id != 0) {
                        com.censivn.C3DEngine.a.g().a(this.l);
                    }
                }

                @Override // com.tsf.shell.e.i.c.i, com.tsf.shell.e.i.c.g
                public void b() {
                    if (this.l.id != 0) {
                        com.censivn.C3DEngine.a.g().a(this.l);
                    }
                    super.b();
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private void p() {
                    Bitmap bitmap;
                    Context createPackageContext;
                    if (this.l.id == 0) {
                        try {
                            Context d = com.censivn.C3DEngine.a.d();
                            String str2 = this.a;
                            com.censivn.C3DEngine.a.d();
                            com.censivn.C3DEngine.a.d();
                            createPackageContext = d.createPackageContext(str2, 3);
                        } catch (PackageManager.NameNotFoundException e) {
                            e.printStackTrace();
                        }
                        if (createPackageContext.getApplicationInfo() != null && createPackageContext.getApplicationInfo().icon != 0) {
                            bitmap = x.a(createPackageContext.getResources(), createPackageContext.getApplicationInfo().icon, (int) this.k.b(), (int) this.k.c());
                            if (bitmap == null) {
                                bitmap = x.a(R.drawable.sym_def_app_icon, (int) this.k.b(), (int) this.k.c());
                            }
                            com.censivn.C3DEngine.a.g().a(this.l, bitmap);
                            bitmap.recycle();
                        }
                        bitmap = null;
                        if (bitmap == null) {
                        }
                        com.censivn.C3DEngine.a.g().a(this.l, bitmap);
                        bitmap.recycle();
                    }
                }
            };
        }
        iVar2.a = str;
        return iVar2;
    }
}
