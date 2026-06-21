package com.tsf.shell;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class y {
    public static void a(int i, int i2, int i3, final Runnable runnable, final Runnable runnable2, final Runnable runnable3) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Home.b());
        builder.setTitle(i);
        builder.setPositiveButton(R.string.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.y.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        builder.setNeutralButton(R.string.mn_feedback, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.y.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                com.tsf.shell.utils.o.a(Home.b());
                if (runnable3 != null) {
                    runnable3.run();
                }
            }
        });
        builder.setNegativeButton(R.string.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.y.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        builder.create();
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(com.censivn.C3DEngine.a.d()).inflate(R.layout.dialog_unknow_error, (ViewGroup) null);
        TextView textView = (TextView) linearLayout.findViewById(R.id.content);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.summary);
        textView.setText(i2);
        textView2.setText(i3);
        builder.setView(linearLayout);
        AlertDialog create = builder.create();
        create.setCancelable(false);
        create.show();
    }
}
