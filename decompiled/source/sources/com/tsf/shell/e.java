package com.tsf.shell;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tsf.b;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class e {
    public static void a(final String str) {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.1
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
        Runnable runnable3 = new Runnable() { // from class: com.tsf.shell.e.2
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(str).setCancelable(false).setPositiveButton(str2, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.e.2.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
                builder.setNegativeButton(str3, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.e.2.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable2 != null) {
                            runnable2.run();
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
        a(context, x.c(i), x.c(i2), x.c(i3), x.c(i4), x.c(i5), runnable, runnable2);
    }

    public static void a(Context context, final String str, final String str2, final String str3, final String str4, final String str5, final Runnable runnable, final Runnable runnable2) {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
                builder.setTitle(str);
                builder.setPositiveButton(str4, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.e.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
                builder.setNegativeButton(str5, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.e.3.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
                builder.create();
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(com.censivn.C3DEngine.a.d()).inflate(b.g.dialog_unknow_error, (ViewGroup) null);
                TextView textView = (TextView) linearLayout.findViewById(b.e.summary);
                ((TextView) linearLayout.findViewById(b.e.content)).setText(str2);
                if (str3 == null) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(str3);
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
        builder.setMessage(str2).setCancelable(false).setPositiveButton(str3, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.e.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        builder.setNegativeButton(str4, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.e.5
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
