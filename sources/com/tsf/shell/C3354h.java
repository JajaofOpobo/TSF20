package com.tsf.shell;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1306b;
import com.tsf.shell.utils.C4178n;
/* renamed from: com.tsf.shell.h */
/* loaded from: classes.dex */
public class C3354h {
    /* renamed from: a */
    public static void m2780a(int i, int i2, int i3, final Runnable runnable, final Runnable runnable2, final Runnable runnable3) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Home.m6177b());
        builder.setTitle(i);
        builder.setPositiveButton(C1306b.C1315i.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.h.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        builder.setNeutralButton(C1306b.C1315i.mn_feedback, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.h.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                C4178n.m666a(Home.m6177b());
                if (runnable3 != null) {
                    runnable3.run();
                }
            }
        });
        builder.setNegativeButton(C1306b.C1315i.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.h.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        builder.create();
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(C0853a.m10856d()).inflate(C1306b.C1313g.dialog_unknow_error, (ViewGroup) null);
        ((TextView) linearLayout.findViewById(C1306b.C1311e.content)).setText(i2);
        ((TextView) linearLayout.findViewById(C1306b.C1311e.summary)).setText(i3);
        builder.setView(linearLayout);
        AlertDialog create = builder.create();
        create.setCancelable(false);
        create.show();
    }
}
