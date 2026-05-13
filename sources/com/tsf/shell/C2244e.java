package com.tsf.shell;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1306b;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.e */
/* loaded from: classes.dex */
public class C2244e {
    /* renamed from: a */
    public static void m6012a(final String str) {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.e.1
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(C0853a.m10856d(), str, 0).show();
            }
        });
    }

    /* renamed from: a */
    public static void m6020a(int i) {
        m6012a(C0853a.m10856d().getString(i));
    }

    /* renamed from: a */
    public static void m6016a(Context context, int i, int i2, int i3, Runnable runnable, Runnable runnable2) {
        m6015a(context, context.getString(i), context.getString(i2), context.getString(i3), runnable, runnable2);
    }

    /* renamed from: a */
    public static void m6019a(int i, int i2, int i3, Runnable runnable, Runnable runnable2) {
        m6011a(C0853a.m10856d().getString(i), C0853a.m10856d().getString(i2), C0853a.m10856d().getString(i3), runnable, runnable2);
    }

    /* renamed from: a */
    public static void m6011a(String str, String str2, String str3, Runnable runnable, Runnable runnable2) {
        m6015a(C0853a.m10856d(), str, str2, str3, runnable, runnable2);
    }

    /* renamed from: a */
    public static void m6015a(final Context context, final String str, final String str2, final String str3, final Runnable runnable, final Runnable runnable2) {
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
        if (C0853a.m10865a() == null) {
            runnable3.run();
        } else {
            C0853a.m10865a().m10588a(runnable3);
        }
    }

    /* renamed from: a */
    public static void m6018a(Context context, int i, int i2, int i3, int i4, int i5, Runnable runnable, Runnable runnable2) {
        m6013a(context, C4189x.m588c(i), C4189x.m588c(i2), C4189x.m588c(i3), C4189x.m588c(i4), C4189x.m588c(i5), runnable, runnable2);
    }

    /* renamed from: a */
    public static void m6013a(Context context, final String str, final String str2, final String str3, final String str4, final String str5, final Runnable runnable, final Runnable runnable2) {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.e.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(C0853a.m10856d());
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
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(C0853a.m10856d()).inflate(C1306b.C1313g.dialog_unknow_error, (ViewGroup) null);
                TextView textView = (TextView) linearLayout.findViewById(C1306b.C1311e.summary);
                ((TextView) linearLayout.findViewById(C1306b.C1311e.content)).setText(str2);
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

    /* renamed from: a */
    public static void m6017a(Context context, int i, int i2, int i3, int i4, Runnable runnable, Runnable runnable2) {
        m6014a(context, context.getString(i), context.getString(i2), context.getString(i3), context.getString(i4), runnable, runnable2);
    }

    /* renamed from: a */
    public static void m6014a(Context context, String str, String str2, String str3, String str4, final Runnable runnable, final Runnable runnable2) {
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
