package com.tsf.shell.preference.a.a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.censivn.C3DEngine.b.e.IconButtonRenderer;
import com.censivn.C3DEngine.b.e.PanelGroupRenderer;
import com.censivn.C3DEngine.b.e.ActionButtonRenderer;
import com.tsf.b;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PreferenceItemF extends i {
    private com.censivn.C3DEngine.b.e.IconButtonRenderer a;
    private j b;
    private int c;

    public PreferenceItemF() {
        a(com.tsf.b.i.text_preferences);
        j jVar = new j();
        this.b = jVar;
        jVar.h(com.tsf.b.i.mn_folder_animation);
        jVar.a(new j.a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemF.1
            @Override // com.censivn.C3DEngine.b.e.ActionButtonRenderer.a
            public void a() {
                com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.PreferenceItemF.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        f.this.j();
                    }
                });
            }
        });
        b(jVar);
        com.censivn.C3DEngine.b.e.IconButtonRenderer aVar = new com.censivn.C3DEngine.b.e.IconButtonRenderer();
        this.a = aVar;
        aVar.h(com.tsf.b.i.mn_folder_auto_close);
        aVar.i(com.tsf.b.i.mn_folder_auto_close_summary);
        aVar.a(new com.censivn.C3DEngine.b.e.IconButtonRenderer.C0027a() {
            @Override
            public boolean a(boolean z) {
                com.tsf.shell.manager.b.ConfigManager.t(z);
                return true;
            }
        });
        b(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.C3DEngine.d());
        builder.setTitle(com.tsf.b.i.mn_folder_animation);
        final int iAr = com.tsf.shell.manager.b.ConfigManager.ar();
        builder.setSingleChoiceItems(new String[]{x.c(com.tsf.b.i.mn_folder_animation_quick), x.c(com.tsf.b.i.mn_folder_animation_normal)}, iAr, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.preference.a.a.PreferenceItemF.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                f.this.c = i;
            }
        });
        builder.setPositiveButton(com.tsf.b.i.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.preference.a.a.PreferenceItemF.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (iAr != f.this.c) {
                    com.tsf.shell.manager.b.ConfigManager.r(f.this.c);
                    f.this.i();
                }
            }
        });
        builder.setNegativeButton(com.tsf.b.i.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.preference.a.a.PreferenceItemF.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.create().show();
    }

    public void i() {
        switch (com.tsf.shell.manager.b.ConfigManager.ar()) {
            case 0:
                this.b.b(x.c(com.tsf.b.i.mn_folder_animation_quick));
                break;
            case 1:
                this.b.b(x.c(com.tsf.b.i.mn_folder_animation_normal));
                break;
        }
    }

    public static int c(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 1) {
            return 1;
        }
        return i;
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void f() {
        PreferenceItemF();
    }
}
