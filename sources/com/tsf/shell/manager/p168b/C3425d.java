package com.tsf.shell.manager.p168b;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.Home;
import com.tsf.shell.ShellApplication;
import com.tsf.shell.theme.inside.ThemeConfigManager;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.C4179o;
import com.tsf.shell.utils.C4186v;
import com.tsf.shell.utils.C4191z;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.b.d */
/* loaded from: classes.dex */
public class C3425d {
    /* renamed from: a */
    public static void m2588a(Context context) {
        String name;
        ArrayList<C3424c> arrayList = new ArrayList<>();
        File m2575d = m2575d();
        m2585a(m2575d, context);
        if (m2575d.exists()) {
            File[] listFiles = m2575d.listFiles();
            for (File file : listFiles) {
                if (!file.isDirectory() && file.getName().endsWith(".config")) {
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    calendar.setTimeInMillis(file.lastModified());
                    arrayList.add(new C3424c(file.getName().substring(0, name.length() - 7), simpleDateFormat.format(calendar.getTime()), file.getParent() + "/"));
                }
            }
        }
        new C3416b().m2595a(context, arrayList, context.getString(C1306b.C1315i.mn_title_db_import));
    }

    /* renamed from: a */
    private static void m2585a(File file, Context context) {
        File[] listFiles;
        C3424c c3424c;
        String name;
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : file.listFiles()) {
                if (!file2.isDirectory() && file2.getName().endsWith(".db")) {
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    calendar.setTimeInMillis(file2.lastModified());
                    arrayList.add(new C3424c(file2.getName().substring(0, name.length() - 3), simpleDateFormat.format(calendar.getTime()), file2.getParent() + "/"));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m2584a(new File(c3424c.f11317c + c3424c.f11315a + ".db"), new File(c3424c.f11317c + c3424c.f11315a + ".xml"), null, ((C3424c) it.next()).f11315a, null, context, true);
            }
        }
    }

    /* renamed from: b */
    public static void m2580b(Context context) {
        m2587a(context, null, null, true, true, true);
    }

    /* renamed from: a */
    public static void m2587a(final Context context, final Runnable runnable, final Runnable runnable2, boolean z, boolean z2, boolean z3) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(C1306b.C1313g.alert_dialog_text_entry, (ViewGroup) null);
        final EditText editText = (EditText) linearLayout.findViewById(C1306b.C1311e.edit_view);
        ((TextView) linearLayout.findViewById(C1306b.C1311e.title_view)).setText(C1306b.C1315i.mn_backup_name_of_backup);
        Date date = new Date(System.currentTimeMillis());
        editText.setText("TSF" + new SimpleDateFormat("yyyyMMdd_hhmmss").format(date));
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(C1306b.C1315i.mn_title_db_export);
        builder.setView(linearLayout);
        if (z) {
            builder.setPositiveButton(C1306b.C1315i.public_action_ok, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.b.d.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    C3425d.m2579b(context, editText.getText().toString(), runnable);
                }
            });
        }
        if (z2) {
            builder.setNegativeButton(C1306b.C1315i.public_action_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.b.d.2
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
    /* renamed from: b */
    public static void m2579b(Context context, String str, Runnable runnable) {
        new AsyncTaskC3429a(context, str, runnable).execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.b.d$a */
    /* loaded from: classes.dex */
    public static class AsyncTaskC3429a extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        private ProgressDialog f11322a;

        /* renamed from: b */
        private Context f11323b;

        /* renamed from: c */
        private String f11324c;

        /* renamed from: d */
        private Runnable f11325d;

        public AsyncTaskC3429a(Context context, String str, Runnable runnable) {
            this.f11323b = context;
            this.f11324c = str;
            if (this.f11324c == null || this.f11324c.equals("")) {
                Date date = new Date(System.currentTimeMillis());
                this.f11324c = "TSF" + new SimpleDateFormat("yyyyMMdd_hhmmss").format(date);
            }
            this.f11325d = runnable;
            this.f11322a = new ProgressDialog(context);
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            this.f11322a.setMessage(this.f11323b.getResources().getString(C1306b.C1315i.dbfile_export_dialog));
            this.f11322a.show();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                return this.f11323b.getResources().getString(C1306b.C1315i.import_export_sdcard_unmounted);
            }
            C3425d.m2575d();
            return C3425d.m2578b(this.f11324c, this.f11325d, this.f11323b);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (this.f11322a.isShowing()) {
                this.f11322a.dismiss();
            }
            Toast.makeText(this.f11323b, str, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static String m2578b(String str, Runnable runnable, Context context) {
        return m2584a(m2589a(), m2581b(), m2577c(), str, runnable, context, false);
    }

    /* renamed from: a */
    public static File m2589a() {
        return new File(Environment.getDataDirectory() + "/data/" + C0853a.m10858b() + "/databases/TSFLauncher-database.db");
    }

    /* renamed from: b */
    public static File m2581b() {
        return new File(Environment.getDataDirectory() + "/data/" + C0853a.m10858b() + "/shared_prefs/config.xml");
    }

    /* renamed from: c */
    public static File m2577c() {
        return new File(Environment.getDataDirectory() + "/data/" + C0853a.m10858b() + "/shared_prefs/" + ThemeConfigManager.CONFIG_FILE_NAME + ".xml");
    }

    /* renamed from: d */
    public static File m2575d() {
        File file = new File(C4186v.m617a(ShellApplication.m6152a()).getPath() + "/TSFShell_data/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    private static String m2584a(File file, File file2, File file3, String str, Runnable runnable, Context context, boolean z) {
        File m2575d = m2575d();
        File file4 = new File(m2575d, "database.db");
        if (file4.exists()) {
            file4.delete();
        }
        File file5 = new File(m2575d, "config.xml");
        if (file5.exists()) {
            file5.delete();
        }
        File file6 = new File(m2575d, "theme.xml");
        if (file6.exists()) {
            file6.delete();
        }
        File file7 = new File(m2575d, str + ".config");
        if (file7.exists()) {
            file7.delete();
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (m2583a(file, file4, z)) {
                arrayList.add(file4);
            }
            if (m2583a(file2, file5, z)) {
                arrayList.add(file5);
            }
            if (m2583a(file3, file6, z)) {
                arrayList.add(file6);
            }
            if (!arrayList.isEmpty()) {
                C4191z.m583a(arrayList, file7);
            }
            C4179o.m660a(arrayList);
            if (runnable != null) {
                runnable.run();
            }
            return context.getResources().getString(C1306b.C1315i.dbfile_export_success);
        } catch (Exception e) {
            C4179o.m660a(arrayList);
            if (runnable != null) {
                runnable.run();
            }
            return context.getResources().getString(C1306b.C1315i.dbfile_export_error);
        }
    }

    /* renamed from: a */
    public static boolean m2583a(File file, File file2, boolean z) {
        if (file == null || !file.exists()) {
            return false;
        }
        file2.createNewFile();
        C4179o.m663a(file, file2);
        if (z) {
            file.delete();
        }
        return true;
    }

    /* renamed from: c */
    public static void m2576c(Context context) {
        C2244e.m6017a(context, C1306b.C1315i.public_action_confirm, C1306b.C1315i.notic_reset_desktop_message, C1306b.C1315i.public_action_ok, C1306b.C1315i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.b.d.3
            @Override // java.lang.Runnable
            public void run() {
                C3425d.m2574e();
                Home.m6177b().m6186a(100);
            }
        }, (Runnable) null);
    }

    /* renamed from: e */
    public static void m2574e() {
        C3430e.m2531aE();
        File file = new File(Environment.getDataDirectory() + "/data/" + C0853a.m10858b() + "/databases/TSFLauncher-database.db");
        if (file.exists()) {
            file.delete();
        }
        if (ThemeManager.getInstance() != null) {
            ThemeManager.getInstance().getFileManager().reset();
        }
    }
}
