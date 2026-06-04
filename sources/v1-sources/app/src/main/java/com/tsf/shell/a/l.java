package com.tsf.shell.a;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tsf.shell.R;
import com.tsf.shell.au;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes.dex */
public final class l {
    public static void a(Context context) {
        ArrayList arrayList = new ArrayList();
        File file = new File(String.valueOf(Environment.getExternalStorageDirectory().getPath()) + "/TSFShell_db.db");
        if (file.exists()) {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_hhmmss");
            calendar.setTimeInMillis(file.lastModified());
            String str = "TSF" + simpleDateFormat.format(calendar.getTime());
            try {
                com.tsf.shell.g.f.a(file, new File(String.valueOf(Environment.getExternalStorageDirectory().getPath()) + "/TSFShell_data/" + str + ".db"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            file.delete();
            File file2 = new File(String.valueOf(Environment.getExternalStorageDirectory().getPath()) + "/TSFShell_settings.xml");
            if (file2.exists()) {
                try {
                    com.tsf.shell.g.f.a(file2, new File(String.valueOf(Environment.getExternalStorageDirectory().getPath()) + "/TSFShell_data/" + str + ".xml"));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                file2.delete();
            }
        }
        File file3 = new File(String.valueOf(Environment.getExternalStorageDirectory().getPath()) + "/TSFShell_data");
        if (file3.exists()) {
            for (File file4 : file3.listFiles()) {
                if (!file4.isDirectory() && file4.getName().endsWith(".db")) {
                    Calendar calendar2 = Calendar.getInstance();
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    calendar2.setTimeInMillis(file4.lastModified());
                    arrayList.add(new k(file4.getName().substring(0, r4.length() - 3), simpleDateFormat2.format(calendar2.getTime()), String.valueOf(file4.getParent()) + "/"));
                }
            }
        }
        b bVar = new b();
        String string = context.getString(R.string.mn_title_db_import);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(string);
        bVar.a = new a(context, arrayList);
        ListView listView = new ListView(context);
        listView.setAdapter((ListAdapter) bVar.a);
        listView.setOnItemClickListener(new c(bVar, context, arrayList));
        listView.setOnItemLongClickListener(new e(bVar, arrayList, context));
        builder.setView(listView);
        builder.create().show();
    }

    public static void b(Context context) {
        a(context, null, null, true, true);
    }

    public static void a(Context context, Runnable runnable, Runnable runnable2, boolean z, boolean z2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.alert_dialog_text_entry, (ViewGroup) null);
        TextView textView = (TextView) linearLayout.findViewById(R.id.title_view);
        EditText editText = (EditText) linearLayout.findViewById(R.id.edit_view);
        textView.setText(R.string.mn_backup_name_of_backup);
        editText.setText("TSF" + new SimpleDateFormat("yyyyMMdd_hhmmss").format(new Date(System.currentTimeMillis())));
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.mn_title_db_export);
        builder.setView(linearLayout);
        builder.setPositiveButton(R.string.public_action_ok, new m(context, editText, runnable));
        if (z) {
            builder.setNegativeButton(R.string.public_action_cancel, new n(runnable2));
        }
        builder.setCancelable(z2);
        builder.create();
        builder.show();
    }

    static /* synthetic */ void a(File file, File file2) {
        FileChannel channel = new FileInputStream(file).getChannel();
        FileChannel channel2 = new FileOutputStream(file2).getChannel();
        try {
            channel.transferTo(0L, channel.size(), channel2);
        } finally {
            if (channel != null) {
                channel.close();
            }
            if (channel2 != null) {
                channel2.close();
            }
        }
    }

    public static void c(Context context) {
        au.a(context, R.string.public_action_confirm, R.string.notic_reset_desktop_message, new o(), null);
    }

    public static void a() {
        t.ab();
        File file = new File(Environment.getDataDirectory() + "/data/com.tsf.shell/databases/TSFLauncher-database.db");
        if (file.exists()) {
            file.delete();
        }
    }
}
