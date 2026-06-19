package com.tsf.shell.manager.r.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.h.b.f;
import com.censivn.C3DEngine.b.h.b.h;
import com.tsf.shell.utils.HapticFeedbackManager;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TogglePanel extends com.tsf.shell.f.e._g.a.MenuActionItem {
    public com.tsf.shell.manager.r.b.WidgetMenuPanel a;
    private h b;
    private com.tsf.shell.manager.action.toggle.TogglePanelManager c;

    public TogglePanel(final com.tsf.shell.manager.r.b.WidgetMenuPanel aVar, String str) {
        super(str);
        this.a = aVar;
        this.c = com.tsf.shell.manager.app.FolderManager.c;
        this.b = new h(com.censivn.C3DEngine.b.b.A.D, aVar.getHeight(), 20.0f * com.censivn.C3DEngine.b.b.A.c, 20.0f * com.censivn.C3DEngine.b.b.A.c, (com.censivn.C3DEngine.b.b.A.c * 20.0f) + com.tsf.shell.manager.o.ButtonPresetManager.b.T, (com.censivn.C3DEngine.b.b.A.c * 20.0f) + com.tsf.shell.manager.o.ButtonPresetManager.b.U) { // from class: com.tsf.shell.manager.r.b.TogglePanel.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onKillFocus() {
            }
        };
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.r.b.TogglePanel.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.app.FolderManager.c.a().size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                A aVar2;
                if (iVar == null) {
                    aVar2 = TogglePanel.this.new A();
                } else {
                    aVar2 = (A) iVar;
                }
                aVar2.a(TogglePanel.this.c.a().get(i).a());
                return aVar2;
            }
        });
        this.b.a(new f() { // from class: com.tsf.shell.manager.r.b.TogglePanel.3
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                w.b();
                com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVarA = com.tsf.shell.manager.l.ShortcutManager.a(TogglePanel.this.c.a().get(i).a, com.tsf.shell.manager.o.ButtonPresetManager.b);
                bVarA.K().onUpdatePhoto(null, null);
                aVar.b().a(bVarA);
            }

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void b(i iVar, int i, MotionEvent motionEvent) {
            }

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void c(i iVar, int i, MotionEvent motionEvent) {
            }

            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent, MotionEvent motionEvent2) {
            }
        });
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public j getContentContainer() {
        return this.b;
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onLayout(float f, float f2, float f3, float f4) {
        this.b.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onShow() {
        this.b.d();
        super.onShow();
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onHide() {
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onRecycle() {
        Iterator<com.tsf.shell.manager.action.toggle.ToggleAction> it = this.c.a().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    class A extends j {
        private com.tsf.shell.f.i.b.e.DrawerItemSettingsAction b;

        public A() {
        }

        public void a(com.tsf.shell.f.i.b.e.DrawerItemSettingsAction jVar) {
            this.b = jVar;
        }

        @Override // com.censivn.C3DEngine.b.f.j
        public void onDrawChildStart() {
            if (this.b != null) {
                this.b.dispatchDraw();
            }
        }
    }
}
