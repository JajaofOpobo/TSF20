package com.tsf.shell.manager.r.c;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.b;
import com.tsf.shell.f.i.b.e.DrawerItemLaunchAction;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetDeleteAnimationUtil {
    private static void b(final com.tsf.shell.f.i.PageItem bVar, final Runnable runnable) {
        if (bVar instanceof i) {
            a(((i) bVar).q().q(), bVar);
        } else if (bVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) {
            a(((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) bVar).k.textures().get(0).textureElement, bVar);
        } else if (bVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
            a(((com.tsf.shell.f.i.b.d.FolderShortcutItem) bVar).aD(), bVar);
        } else if (bVar instanceof com.tsf.shell.f.i.b.b.ItemShell) {
            a(((com.tsf.shell.f.i.b.b.ItemShell) bVar).h, bVar);
        }
        bVar.mouseEnabled(false);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.manager.r.c.WidgetDeleteAnimationUtil.1
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
                com.tsf.shell.manager.app.WidgetManager.a(bVar);
            }
        };
        dVar.l(0.0f);
        dVar.m(0.0f);
        dVar.n(0.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(bVar);
        com.censivn.C3DEngine.b.g.TweenUtils.a(bVar, VEasing.Back.easeIn, dVar);
        bVar.p_();
    }

    public static void a(TextureElement textureElement, com.censivn.C3DEngine.b.f.IRenderable iVar) {
        if (textureElement != null && textureElement.id != 0) {
            com.censivn.C3DEngine.b.h.a.PageThumbnailRenderer aVarA = com.censivn.C3DEngine.b.h.a.PageThumbnailRenderer.a(textureElement);
            aVarA.position().setAllFrom(iVar.position());
            Number3MultiSelectLinePicker.TEMPNUMBER3D2.reset();
            aVarA.position().setAllFrom(iVar.localToGlobal(Number3MultiSelectLinePicker.TEMPNUMBER3D2));
            com.tsf.shell.manager.app.TaskScheduler.a(aVarA);
        }
    }

    public static void a(com.tsf.shell.f.i.PageItem bVar, Runnable runnable) {
        b(bVar, runnable);
    }

    public static void a(final com.tsf.shell.f.i.PageItem bVar, final Runnable runnable, final Runnable runnable2) {
        if (bVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
            if (((com.tsf.shell.f.i.b.d.FolderShortcutItem) bVar).aT()) {
                a(bVar, runnable2);
                return;
            }
            com.tsf.shell.e.a(b.i.notic_delete_folder, b.i.public_action_ok, b.i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetDeleteAnimationUtil.2
                @Override // java.lang.Runnable
                public void run() {
                    com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetDeleteAnimationUtil.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            g.a(bVar, runnable2);
                        }
                    });
                }
            }, new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetDeleteAnimationUtil.3
                @Override // java.lang.Runnable
                public void run() {
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            });
        }
    }
}
