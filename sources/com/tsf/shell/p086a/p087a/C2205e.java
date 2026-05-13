package com.tsf.shell.p086a.p087a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.KeyEvent;
import com.p024b.p025a.C0843a;
import com.tsf.shell.p086a.p087a.DialogC2197c;
/* renamed from: com.tsf.shell.a.a.e */
/* loaded from: classes.dex */
public class C2205e {
    /* renamed from: a */
    public static boolean m6087a(final Context context) {
        if (Build.VERSION.SDK_INT < 23 || Settings.System.canWrite(context.getApplicationContext())) {
            return true;
        }
        final DialogC2197c dialogC2197c = new DialogC2197c(context);
        dialogC2197c.setContentView(C0843a.C0846c.permission_guide_dialog_no_bg);
        dialogC2197c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tsf.shell.a.a.e.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
            }
        });
        dialogC2197c.m6094a(new DialogC2197c.InterfaceC2201a() { // from class: com.tsf.shell.a.a.e.2
            @Override // com.tsf.shell.p086a.p087a.DialogC2197c.InterfaceC2201a
            /* renamed from: a */
            public boolean mo6086a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() == 1) {
                }
                return true;
            }
        });
        dialogC2197c.m6096a(-1, context.getString(C0843a.C0848e.perm_write_settings_desc), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.a.a.e.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                DialogC2197c.this.dismiss();
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
