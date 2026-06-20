package com.tsf.shell.manager.r.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.tsf.b;
import com.tsf.shell.f.i.c.a.BackgroundSceneNode;
import com.tsf.shell.f.i.c.a.ITextureCallback;
import com.tsf.shell.f.i.c.a.CompositeSceneNode;
import com.tsf.shell.utils.GraphicsEngineBridge;
import com.tsf.shell.widget.alarm.AlarmClickEvent;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetDefinitionFactory {
    public static com.tsf.shell.f.i.c.ItemGroupBase a(Context context, String str, String str2, String str3, com.tsf.shell.manager.app.LauncherAppInfo fVar) {
        com.tsf.shell.f.i.c.ItemGroupBase gVarA = a(str2, fVar);
        b(gVarA, context, str, str2, str3, fVar);
        return gVarA;
    }

    private static void b(final com.tsf.shell.f.i.c.ItemGroupBase gVar, Context context, String str, String str2, String str3, com.tsf.shell.manager.app.LauncherAppInfo fVar) {
        if (!gVar.e) {
            gVar.b = str3;
            gVar.a = str2;
            gVar.c = str2;
            gVar.d = 5;
            gVar.a(str);
            try {
                gVar.i = context.getPackageManager().getPackageInfo(str2, 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            int identifier = context.getResources().getIdentifier("singleTask", "bool", str2);
            if (identifier > 0) {
                gVar.f = context.getResources().getBoolean(identifier);
            } else {
                gVar.f = false;
            }
            int identifier2 = context.getResources().getIdentifier("minSdkVersion", "integer", str2);
            if (identifier2 > 0) {
                gVar.h = context.getResources().getInteger(identifier2);
            } else {
                gVar.h = 0;
            }
            if (str3.equals(r.class.getName())) {
                gVar.f = true;
            }
            int identifier3 = context.getResources().getIdentifier("category", "string", str2);
            if (identifier3 <= 0 || context.getResources().getString(identifier3).equals("tool")) {
                gVar.g = 0;
            } else {
                gVar.g = 1;
            }
            com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetDefinitionFactory.1
                @Override // java.lang.Runnable
                public void run() {
                    gVar.l();
                }
            });
        }
    }

    public static void a(com.tsf.shell.f.i.c.ItemGroupBase gVar, Context context, String str, String str2, String str3, com.tsf.shell.manager.app.LauncherAppInfo fVar) {
        b(gVar, context, str, str2, str3, fVar);
    }

    public static com.tsf.shell.f.i.c.ItemGroupBase a(String str, com.tsf.shell.manager.app.LauncherAppInfo fVar) {
        com.tsf.shell.f.i.c.ItemGroupBase gVar;
        float f = 0.5f;
        float f2 = 0.45f;
        float f3 = 0.0f;
        if (str.equals("com.tsf.shell.widget.music")) {
            gVar = new com.tsf.shell.f.i.c.DeferredItemGroup(0.42f, f3, f3) { // from class: com.tsf.shell.manager.r.c.WidgetDefinitionFactory.5
                @Override // com.tsf.shell.f.i.c.DeferredItemGroup
                public k g_() {
                    return new h(new VTextureManager(), com.censivn.C3DEngine.C3DEngine.d(), 0.6f, (-230.0f) * com.censivn.C3DEngine.b.b.A.c);
                }
            };
        } else if (str.equals("com.tsf.shell.widget.message")) {
            gVar = new com.tsf.shell.f.i.c.DeferredItemGroup(0.41f, f3, (-40.0f) * com.censivn.C3DEngine.b.b.A.c) { // from class: com.tsf.shell.manager.r.c.WidgetDefinitionFactory.6
                @Override // com.tsf.shell.f.i.c.DeferredItemGroup
                public k g_() {
                    return new com.tsf.shell.f.i.c.a.GridSceneNode(new VTextureManager(), com.censivn.C3DEngine.C3DEngine.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.alarm")) {
            gVar = new com.tsf.shell.f.i.c.DeferredItemGroup(0.33f, f3, com.censivn.C3DEngine.b.b.A.c * (-15.0f)) { // from class: com.tsf.shell.manager.r.c.WidgetDefinitionFactory.7
                @Override // com.tsf.shell.f.i.c.DeferredItemGroup
                public k g_() {
                    return new com.tsf.shell.f.i.c.a.b(new VTextureManager(), com.censivn.C3DEngine.C3DEngine.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.calendar")) {
            gVar = new com.tsf.shell.f.i.c.DeferredItemGroup(0.28f, f3, com.censivn.C3DEngine.b.b.A.c * (-15.0f)) { // from class: com.tsf.shell.manager.r.c.WidgetDefinitionFactory.8
                @Override // com.tsf.shell.f.i.c.DeferredItemGroup
                public k g_() {
                    return new com.tsf.shell.f.i.c.a.a.TextureElementB(new VTextureManager(), com.censivn.C3DEngine.C3DEngine.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.cubeclock")) {
            gVar = new com.tsf.shell.f.i.c.DeferredItemGroup(0.6f * com.censivn.C3DEngine.b.b.A.c, f3, f3) { // from class: com.tsf.shell.manager.r.c.WidgetDefinitionFactory.9
                @Override // com.tsf.shell.f.i.c.DeferredItemGroup
                public k g_() {
                    return new com.tsf.shell.f.i.c.a.b.SceneComponentC(new VTextureManager(), com.censivn.C3DEngine.C3DEngine.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.weather")) {
            gVar = new com.tsf.shell.f.i.c.DeferredItemGroup(f, f3, (-20.0f) * com.censivn.C3DEngine.b.b.A.c) { // from class: com.tsf.shell.manager.r.c.WidgetDefinitionFactory.10
                @Override // com.tsf.shell.f.i.c.DeferredItemGroup
                public k g_() {
                    return new m(new VTextureManager(), com.censivn.C3DEngine.C3DEngine.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.memo")) {
            gVar = new com.tsf.shell.f.i.c.DeferredItemGroup(f, f3, (-10.0f) * com.censivn.C3DEngine.b.b.A.c) { // from class: com.tsf.shell.manager.r.c.WidgetDefinitionFactory.11
                @Override // com.tsf.shell.f.i.c.DeferredItemGroup
                public k g_() {
                    return new com.tsf.shell.f.i.c.a.LabelSceneNode(new VTextureManager(), com.censivn.C3DEngine.C3DEngine.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.gallery")) {
            gVar = new com.tsf.shell.f.i.c.DeferredItemGroup(f2, f3, f3) { // from class: com.tsf.shell.manager.r.c.WidgetDefinitionFactory.12
                @Override // com.tsf.shell.f.i.c.DeferredItemGroup
                public k g_() {
                    return new com.tsf.shell.f.i.c.a.PageSceneNode(new VTextureManager(), com.censivn.C3DEngine.C3DEngine.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.adornment")) {
            gVar = new com.tsf.shell.f.i.c.DeferredItemGroup(0.55f, f3, (-50.0f) * com.censivn.C3DEngine.b.b.A.c) { // from class: com.tsf.shell.manager.r.c.WidgetDefinitionFactory.2
                @Override // com.tsf.shell.f.i.c.DeferredItemGroup
                public k g_() {
                    return new com.tsf.shell.f.i.c.a.a(new VTextureManager(), com.censivn.C3DEngine.C3DEngine.d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.dotsclock")) {
            gVar = new com.tsf.shell.f.i.c.DeferredItemGroup(f2, f3, f3) { // from class: com.tsf.shell.manager.r.c.WidgetDefinitionFactory.3
                @Override // com.tsf.shell.f.i.c.DeferredItemGroup
                public k g_() {
                    return new com.tsf.shell.f.i.c.a.c.SceneRendererC(new VTextureManager(), com.censivn.C3DEngine.C3DEngine.d());
                }
            };
        } else {
            gVar = new com.tsf.shell.f.i.c.ItemGroupBase() { // from class: com.tsf.shell.manager.r.c.WidgetDefinitionFactory.4
                private com.censivn.C3DEngine.b.f.GridRenderable k;
                private TextureElement l = new TextureElement(0, false);

                @Override // com.tsf.shell.f.i.c.ItemGroupBase, com.tsf.shell.f.i.c.ItemLabelProvider
                public i a(int i, int i2, boolean z) {
                    if (this.k == null) {
                        this.k = new com.censivn.C3DEngine.b.f.GridRenderable(com.tsf.shell.manager.o.ButtonPresetManager.a.H, com.tsf.shell.manager.o.ButtonPresetManager.a.I, false);
                        this.k.textures().addElement(this.l);
                    }
                    WidgetDefinitionFactory();
                    return this.k;
                }

                @Override // com.tsf.shell.f.i.c.ItemGroupBase, com.tsf.shell.f.i.c.ItemLabelProvider
                public void a() {
                    super.a();
                    if (this.k != null) {
                        this.k.destroy();
                    }
                    if (this.l.id != 0) {
                        com.censivn.C3DEngine.C3DEngine.g().a(this.l);
                    }
                }

                @Override // com.tsf.shell.f.i.c.ItemGroupBase, com.tsf.shell.f.i.c.ItemLabelProvider
                public void b() {
                    if (this.l.id != 0) {
                        com.censivn.C3DEngine.C3DEngine.g().a(this.l);
                    }
                    super.b();
                }

                private void p() {
                    if (this.l.id == 0) {
                        Bitmap bitmapA = null;
                        try {
                            Context contextD = com.censivn.C3DEngine.C3DEngine.d();
                            String str2 = this.a;
                            com.censivn.C3DEngine.C3DEngine.d();
                            com.censivn.C3DEngine.C3DEngine.d();
                            Context contextCreatePackageContext = contextD.createPackageContext(str2, 3);
                            if (contextCreatePackageContext.getApplicationInfo() != null && contextCreatePackageContext.getApplicationInfo().icon != 0) {
                                bitmapA = x.a(contextCreatePackageContext.getResources(), contextCreatePackageContext.getApplicationInfo().icon, (int) this.k.b(), (int) this.k.c());
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            e.printStackTrace();
                        }
                        if (bitmapA == null) {
                            bitmapA = x.a(b.d.sym_def_app_icon, (int) this.k.b(), (int) this.k.c());
                        }
                        com.censivn.C3DEngine.C3DEngine.g().a(this.l, bitmapA);
                        bitmapA.recycle();
                    }
                }
            };
        }
        gVar.a = str;
        return gVar;
    }
}
