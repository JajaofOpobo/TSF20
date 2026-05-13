package com.tsf.shell;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.b;
import com.tsf.shell.utils.n;
/* loaded from: classes.dex */
public class h {
    public static void a(int i, int i2, int i3, final Runnable runnable, final Runnable runnable2, final Runnable runnable3) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Home.b());
        builder.setTitle(i);
        builder.setPositiveButton(b.i.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.h.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        builder.setNeutralButton(b.i.mn_feedback, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.h.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                n.a(Home.b());
                if (runnable3 != null) {
                    runnable3.run();
                }
            }
        });
        builder.setNegativeButton(b.i.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.h.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        builder.create();
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(com.censivn.C3DEngine.a.d()).inflate(b.g.dialog_unknow_error, (ViewGroup) null);
        ((TextView) linearLayout.findViewById(b.e.content)).setText(i2);
        ((TextView) linearLayout.findViewById(b.e.summary)).setText(i3);
        builder.setView(linearLayout);
        AlertDialog create = builder.create();
        create.setCancelable(false);
        create.show();
    }
}
