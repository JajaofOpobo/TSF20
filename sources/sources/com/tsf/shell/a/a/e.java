package com.tsf.shell.a.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.KeyEvent;
import com.b.a.a;
import com.tsf.shell.a.a.c;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e {
    public static boolean a(final Context context) {
        if (Build.VERSION.SDK_INT < 23 || Settings.System.canWrite(context.getApplicationContext())) {
            return true;
        }
        final c cVar = new c(context);
        cVar.setContentView(a.c.permission_guide_dialog_no_bg);
        cVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tsf.shell.a.a.e.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
            }
        });
        cVar.a(new c.a() { // from class: com.tsf.shell.a.a.e.2
            @Override // com.tsf.shell.a.a.c.a
            public boolean a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() == 1) {
                }
                return true;
            }
        });
        cVar.a(-1, context.getString(a.e.perm_write_settings_desc), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.a.a.e.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                cVar.dismiss();
                if (i == -1) {
                    Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
                    intent.setData(Uri.parse("package:" + context.getPackageName()));
                    context.startActivity(intent);
                }
            }
        });
        return false;
    }
}
