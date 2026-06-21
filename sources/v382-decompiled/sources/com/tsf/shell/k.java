package com.tsf.shell;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/* loaded from: classes.dex */
public class k {
    public static void a(final String str) {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.k.1
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(com.censivn.C3DEngine.a.d(), str, 0).show();
            }
        });
    }

    public static void a(int i) {
        a(com.censivn.C3DEngine.a.d().getString(i));
    }

    public static void a(Context context, int i, int i2, int i3, Runnable runnable, Runnable runnable2) {
        a(context, context.getString(i), context.getString(i2), context.getString(i3), runnable, runnable2);
    }

    public static void a(int i, int i2, int i3, Runnable runnable, Runnable runnable2) {
        a(com.censivn.C3DEngine.a.d().getString(i), com.censivn.C3DEngine.a.d().getString(i2), com.censivn.C3DEngine.a.d().getString(i3), runnable, runnable2);
    }

    public static void a(String str, String str2, String str3, Runnable runnable, Runnable runnable2) {
        a(com.censivn.C3DEngine.a.d(), str, str2, str3, runnable, runnable2);
    }

    public static void a(final Context context, final String str, final String str2, final String str3, final Runnable runnable, final Runnable runnable2) {
        Runnable runnable3 = new Runnable() { // from class: com.tsf.shell.k.2
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                AlertDialog.Builder cancelable = builder.setMessage(str).setCancelable(false);
                String str4 = str2;
                final Runnable runnable4 = runnable;
                cancelable.setPositiveButton(str4, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.k.2.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable4 != null) {
                            runnable4.run();
                        }
                    }
                });
                String str5 = str3;
                final Runnable runnable5 = runnable2;
                builder.setNegativeButton(str5, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.k.2.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable5 != null) {
                            runnable5.run();
                        }
                        dialogInterface.cancel();
                    }
                });
                builder.create().show();
            }
        };
        if (com.censivn.C3DEngine.a.a() == null) {
            runnable3.run();
        } else {
            com.censivn.C3DEngine.a.a().a(runnable3);
        }
    }

    public static void a(Context context, int i, int i2, int i3, int i4, int i5, Runnable runnable, Runnable runnable2) {
        a(context, com.tsf.shell.utils.x.c(i), com.tsf.shell.utils.x.c(i2), com.tsf.shell.utils.x.c(i3), com.tsf.shell.utils.x.c(i4), com.tsf.shell.utils.x.c(i5), runnable, runnable2);
    }

    public static void a(Context context, final String str, final String str2, final String str3, final String str4, final String str5, final Runnable runnable, final Runnable runnable2) {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.k.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
                builder.setTitle(str);
                String str6 = str4;
                final Runnable runnable3 = runnable;
                builder.setPositiveButton(str6, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.k.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable3 != null) {
                            runnable3.run();
                        }
                    }
                });
                String str7 = str5;
                final Runnable runnable4 = runnable2;
                builder.setNegativeButton(str7, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.k.3.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable4 != null) {
                            runnable4.run();
                        }
                    }
                });
                builder.create();
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(com.censivn.C3DEngine.a.d()).inflate(R.layout.dialog_unknow_error, (ViewGroup) null);
                TextView textView = (TextView) linearLayout.findViewById(R.id.content);
                TextView textView2 = (TextView) linearLayout.findViewById(R.id.summary);
                textView.setText(str2);
                if (str3 == null) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(str3);
                }
                builder.setView(linearLayout);
                AlertDialog create = builder.create();
                create.setCancelable(false);
                create.show();
            }
        });
    }

    public static void a(Context context, int i, int i2, int i3, int i4, Runnable runnable, Runnable runnable2) {
        a(context, context.getString(i), context.getString(i2), context.getString(i3), context.getString(i4), runnable, runnable2);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, final Runnable runnable, final Runnable runnable2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(str2).setCancelable(false).setPositiveButton(str3, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.k.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        builder.setNegativeButton(str4, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.k.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (runnable2 != null) {
                    runnable2.run();
                }
                dialogInterface.cancel();
            }
        });
        builder.setTitle(str);
        builder.create().show();
    }
}
