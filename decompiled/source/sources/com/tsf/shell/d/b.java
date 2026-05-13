package com.tsf.shell.d;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.e.j;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.b.e;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class b {
    private static int a = 0;
    private static int b = 0;

    public static void a(j jVar) {
        switch (e.a(com.censivn.C3DEngine.a.d())) {
            case ItemInfo.NO_ID /* -1 */:
                jVar.b(x.c(b.i.mn_orientation_system));
                return;
            case 0:
                jVar.b(x.c(b.i.mn_orientation_landscape));
                return;
            case 1:
                jVar.b(x.c(b.i.mn_orientation_portrait));
                return;
            default:
                return;
        }
    }

    public static void a(Context context, final j jVar) {
        int i = 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(b.i.mn_screen_orientation);
        String[] strArr = {x.c(b.i.mn_orientation_system), x.c(b.i.mn_orientation_portrait), x.c(b.i.mn_orientation_landscape)};
        switch (e.a(context)) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 1;
                break;
        }
        b = i;
        a = i;
        builder.setSingleChoiceItems(strArr, i, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.d.b.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                int unused = b.b = i2;
            }
        });
        builder.setPositiveButton(b.i.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.d.b.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = 1;
                if (b.a != b.b) {
                    switch (b.b) {
                        case 0:
                            i3 = -1;
                            break;
                        case 2:
                            i3 = 0;
                            break;
                    }
                    e.a(i3, Home.b());
                    b.a(j.this);
                }
            }
        });
        builder.setNegativeButton(b.i.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.d.b.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        });
        builder.create().show();
    }
}
