package com.tsf.shell.p094d;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p031b.p037e.C0957j;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.d.b */
/* loaded from: classes.dex */
public class C2240b {

    /* renamed from: a */
    private static int f7336a = 0;

    /* renamed from: b */
    private static int f7337b = 0;

    /* renamed from: a */
    public static void m6022a(C0957j c0957j) {
        switch (C3430e.m2539a(C0853a.m10856d())) {
            case ItemInfo.NO_ID /* -1 */:
                c0957j.m10490b(C4189x.m588c(C1306b.C1315i.mn_orientation_system));
                return;
            case 0:
                c0957j.m10490b(C4189x.m588c(C1306b.C1315i.mn_orientation_landscape));
                return;
            case 1:
                c0957j.m10490b(C4189x.m588c(C1306b.C1315i.mn_orientation_portrait));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static void m6023a(Context context, final C0957j c0957j) {
        int i = 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(C1306b.C1315i.mn_screen_orientation);
        String[] strArr = {C4189x.m588c(C1306b.C1315i.mn_orientation_system), C4189x.m588c(C1306b.C1315i.mn_orientation_portrait), C4189x.m588c(C1306b.C1315i.mn_orientation_landscape)};
        switch (C3430e.m2539a(context)) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 1;
                break;
        }
        f7337b = i;
        f7336a = i;
        builder.setSingleChoiceItems(strArr, i, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.d.b.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                int unused = C2240b.f7337b = i2;
            }
        });
        builder.setPositiveButton(C1306b.C1315i.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.d.b.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = 1;
                if (C2240b.f7336a != C2240b.f7337b) {
                    switch (C2240b.f7337b) {
                        case 0:
                            i3 = -1;
                            break;
                        case 2:
                            i3 = 0;
                            break;
                    }
                    C3430e.m2540a(i3, Home.m6177b());
                    C2240b.m6022a(C0957j.this);
                }
            }
        });
        builder.setNegativeButton(C1306b.C1315i.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.d.b.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        });
        builder.create().show();
    }
}
