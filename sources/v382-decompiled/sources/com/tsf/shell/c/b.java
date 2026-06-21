package com.tsf.shell.c;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.e.n;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.manager.b.g;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class b {
    private static int a = 0;
    private static int b = 0;

    public static void a(n nVar) {
        switch (g.a(com.censivn.C3DEngine.a.d())) {
            case ItemInfo.NO_ID /* -1 */:
                nVar.b(x.c(R.string.mn_orientation_system));
                break;
            case 0:
                nVar.b(x.c(R.string.mn_orientation_landscape));
                break;
            case 1:
                nVar.b(x.c(R.string.mn_orientation_portrait));
                break;
        }
    }

    public static void a(Context context, final n nVar) {
        int i = 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.mn_screen_orientation);
        String[] strArr = {x.c(R.string.mn_orientation_system), x.c(R.string.mn_orientation_portrait), x.c(R.string.mn_orientation_landscape)};
        switch (g.a(context)) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 1;
                break;
        }
        b = i;
        a = i;
        builder.setSingleChoiceItems(strArr, i, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.c.b.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                b.b = i2;
            }
        });
        builder.setPositiveButton(R.string.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.c.b.2
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
                    g.a(i3, Home.b());
                    b.a(n.this);
                }
            }
        });
        builder.setNegativeButton(R.string.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.c.b.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        });
        builder.create().show();
    }
}
