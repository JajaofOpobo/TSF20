package com.tsf.shell.manager.b;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.k;
import com.tsf.shell.theme.inside.ThemeConfigManager;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.p;
import com.tsf.shell.utils.z;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {
    public static void a(Context context) {
        ArrayList arrayList = new ArrayList();
        File d = d();
        a(d, context);
        if (d.exists()) {
            File[] listFiles = d.listFiles();
            for (File file : listFiles) {
                if (!file.isDirectory() && file.getName().endsWith(".config")) {
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    calendar.setTimeInMillis(file.lastModified());
                    arrayList.add(new d(file.getName().substring(0, r4.length() - 7), simpleDateFormat.format(calendar.getTime()), String.valueOf(file.getParent()) + "/"));
                }
            }
        }
        new b().a(context, arrayList, context.getString(R.string.mn_title_db_import));
    }

    private static void a(File file, Context context) {
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : file.listFiles()) {
                if (!file2.isDirectory() && file2.getName().endsWith(".db")) {
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    calendar.setTimeInMillis(file2.lastModified());
                    arrayList.add(new d(file2.getName().substring(0, r5.length() - 3), simpleDateFormat.format(calendar.getTime()), String.valueOf(file2.getParent()) + "/"));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                a(new File(String.valueOf(dVar.c) + dVar.a + ".db"), new File(String.valueOf(dVar.c) + dVar.a + ".xml"), null, dVar.a, null, context, true);
            }
        }
    }

    public static void b(Context context) {
        a(context, null, null, true, true, true);
    }

    public static void a(final Context context, final Runnable runnable, final Runnable runnable2, boolean z, boolean z2, boolean z3) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.alert_dialog_text_entry, (ViewGroup) null);
        TextView textView = (TextView) linearLayout.findViewById(R.id.title_view);
        final EditText editText = (EditText) linearLayout.findViewById(R.id.edit_view);
        textView.setText(R.string.mn_backup_name_of_backup);
        editText.setText("TSF" + new SimpleDateFormat("yyyyMMdd_hhmmss").format(new Date(System.currentTimeMillis())));
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.mn_title_db_export);
        builder.setView(linearLayout);
        if (z) {
            builder.setPositiveButton(R.string.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.b.e.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    e.b(context, editText.getText().toString(), runnable);
                }
            });
        }
        if (z2) {
            builder.setNegativeButton(R.string.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.b.e.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            });
        }
        builder.setCancelable(z3);
        builder.create();
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, Runnable runnable) {
        new f(context, str, runnable).execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, Runnable runnable, Context context) {
        return a(a(), b(), c(), str, runnable, context, false);
    }

    public static File a() {
        return new File(Environment.getDataDirectory() + "/data/" + com.censivn.C3DEngine.a.b() + "/databases/TSFLauncher-database.db");
    }

    public static File b() {
        return new File(Environment.getDataDirectory() + "/data/" + com.censivn.C3DEngine.a.b() + "/shared_prefs/config.xml");
    }

    public static File c() {
        return new File(Environment.getDataDirectory() + "/data/" + com.censivn.C3DEngine.a.b() + "/shared_prefs/" + ThemeConfigManager.CONFIG_FILE_NAME + ".xml");
    }

    public static File d() {
        File file = new File(String.valueOf(Environment.getExternalStorageDirectory().getPath()) + "/TSFShell_data/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String a(File file, File file2, File file3, String str, Runnable runnable, Context context, boolean z) {
        File d = d();
        File file4 = new File(d, "database.db");
        if (file4.exists()) {
            file4.delete();
        }
        File file5 = new File(d, "config.xml");
        if (file5.exists()) {
            file5.delete();
        }
        File file6 = new File(d, "theme.xml");
        if (file6.exists()) {
            file6.delete();
        }
        File file7 = new File(d, String.valueOf(str) + ".config");
        if (file7.exists()) {
            file7.delete();
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (a(file, file4, z)) {
                arrayList.add(file4);
            }
            if (a(file2, file5, z)) {
                arrayList.add(file5);
            }
            if (a(file3, file6, z)) {
                arrayList.add(file6);
            }
            if (!arrayList.isEmpty()) {
                z.a(arrayList, file7);
            }
            p.a(arrayList);
            if (runnable != null) {
                runnable.run();
            }
            return context.getResources().getString(R.string.dbfile_export_success);
        } catch (Exception e) {
            p.a(arrayList);
            if (runnable != null) {
                runnable.run();
            }
            return context.getResources().getString(R.string.dbfile_export_error);
        }
    }

    public static boolean a(File file, File file2, boolean z) {
        if (file == null || !file.exists()) {
            return false;
        }
        file2.createNewFile();
        p.a(file, file2);
        if (z) {
            file.delete();
        }
        return true;
    }

    public static void c(Context context) {
        k.a(context, R.string.public_action_confirm, R.string.notic_reset_desktop_message, R.string.public_action_ok, R.string.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.b.e.3
            @Override // java.lang.Runnable
            public void run() {
                e.e();
                Home.b().a(100);
            }
        }, (Runnable) null);
    }

    public static void e() {
        g.aC();
        File file = new File(Environment.getDataDirectory() + "/data/" + com.censivn.C3DEngine.a.b() + "/databases/TSFLauncher-database.db");
        if (file.exists()) {
            file.delete();
        }
        if (ThemeManager.getInstance() != null) {
            ThemeManager.getInstance().getFileManager().reset();
        }
    }
}
