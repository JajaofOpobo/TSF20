package com.tsf.shell.plugin.fontspicker;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import com.tsf.shell.plugin.themepicker.r;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class FontsPickerActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private AlertDialog a;
    private View c;
    private a d;
    private Handler b = new Handler();
    private int e = 0;
    private boolean f = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p.fonts_picker_activity);
        ListView listView = (ListView) findViewById(n.listView1);
        this.d = new a(this);
        listView.setAdapter((ListAdapter) this.d);
        listView.setOnItemClickListener(this);
        findViewById(n.imageView1).setOnClickListener(this);
        if (this.d.getCount() == 1) {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.d.a();
        this.d.notifyDataSetChanged();
        this.f = true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.tsf.shell.plugin.fontspicker.FontsPickerActivity$3] */
    private void a(final boolean z) {
        this.f = false;
        this.c = LayoutInflater.from(this).inflate(p.fonts_dialog_body_layout, (ViewGroup) null);
        this.a = new AlertDialog.Builder(this).setView(this.c).setCancelable(false).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.1
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                FontsPickerActivity.this.a();
            }
        }).setNegativeButton(r.apps_management_dialog_button_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                FontsPickerActivity.this.a();
            }
        }).show();
        this.e = 0;
        b();
        final String packageName = getPackageName();
        new Thread() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                FontsPickerActivity.this.c();
                if (!z) {
                    FontsPickerActivity.this.a(FontsPickerActivity.a(FontsPickerActivity.this, packageName).getAssets(), "", new ArrayList(), "ttf", packageName);
                } else {
                    FontsPickerActivity.this.a((Context) FontsPickerActivity.this);
                }
                FontsPickerActivity.this.b.post(new Runnable() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.plugin.themepicker.g.b("Fonts Picker Disalog Dismiss......");
                        if (FontsPickerActivity.this.a != null && FontsPickerActivity.this.a.isShowing()) {
                            FontsPickerActivity.this.a.dismiss();
                            FontsPickerActivity.this.d.a();
                            FontsPickerActivity.this.d.notifyDataSetChanged();
                        }
                    }
                });
            }
        }.start();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tsf.shell.plugin.themepicker.g.b("---Fonts Picker Activity onDestroy---");
        if (this.a != null) {
            this.a.cancel();
            this.a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i) {
        ((TextView) this.c.findViewById(n.textView1)).setText(r.font_scan_package);
        ((TextView) this.c.findViewById(n.textView2)).setText(str);
        ((TextView) this.c.findViewById(n.textView3)).setText(String.valueOf(getString(r.font_scan_summary_head)) + " " + i + " " + getString(r.font_scan_summary_tail));
    }

    private void a(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(c.c, str);
        contentValues.put(c.a, str2);
        contentValues.put(c.b, str3);
        d.a(this).a(c.d, contentValues);
    }

    private void b() {
        com.tsf.shell.plugin.themepicker.g.c("", " clean data count:" + d.a(this).a(c.d, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            final String str = it.next().activityInfo.packageName;
            if (!this.f) {
                if (this.a != null) {
                    this.b.post(new Runnable() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.4
                        @Override // java.lang.Runnable
                        public void run() {
                            FontsPickerActivity.this.a(str, FontsPickerActivity.this.e);
                        }
                    });
                }
                Context a = a(context, str);
                com.tsf.shell.plugin.themepicker.g.c("", "packageName:" + str);
                a(a.getAssets(), "", arrayList, "ttf", str);
            } else {
                return;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.tsf.shell.plugin.themepicker.g.c("", "files:" + ((String) it2.next()));
        }
        com.tsf.shell.plugin.themepicker.g.c("", "Parse Fonts Cost:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    public static Context a(Context context, String str) {
        try {
            return context.createPackageContext(str, 2);
        } catch (PackageManager.NameNotFoundException e) {
            com.tsf.shell.plugin.themepicker.g.c("", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AssetManager assetManager, String str, ArrayList arrayList, String str2, String str3) {
        try {
            com.tsf.shell.plugin.themepicker.g.d("", "path:" + str);
            for (String str4 : assetManager.list(str)) {
                com.tsf.shell.plugin.themepicker.g.c("", "files:" + str4);
                if (!str4.equals("")) {
                    String str5 = String.valueOf(str) + (str.equals("") ? "" : "/") + str4;
                    if (a(str5).equals(str2)) {
                        arrayList.add(str5);
                        a(str3, "package", str5);
                        this.e++;
                    } else if (str5.indexOf(".") > 0 || str5.toLowerCase().indexOf("fonts") < 0) {
                        com.tsf.shell.plugin.themepicker.g.b("", "SKIP:" + str5);
                    } else {
                        a(assetManager, str5, arrayList, str2, str3);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ArrayList arrayList = new ArrayList();
        for (String str : new String[]{"/system/fonts", "/system/font", "/data/fonts"}) {
            a(new File(str), arrayList, "ttf", "system");
        }
        String path = Environment.getExternalStorageDirectory().getPath();
        for (String str2 : new String[]{String.valueOf(path) + "/GOLauncherEX/fonts", String.valueOf(path) + "/fonts"}) {
            a(new File(str2), arrayList, "ttf", "external");
        }
    }

    private void a(File file, ArrayList arrayList, String str, String str2) {
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                com.tsf.shell.plugin.themepicker.g.c("", "Path:" + file2.getName());
                final String path = file.getPath();
                if (!this.f) {
                    if (this.a != null) {
                        this.b.post(new Runnable() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.5
                            @Override // java.lang.Runnable
                            public void run() {
                                FontsPickerActivity.this.a(path, FontsPickerActivity.this.e);
                            }
                        });
                    }
                    if (file2.isDirectory()) {
                        a(file2, arrayList, str, str2);
                    } else if (a(file2.getName()).equals(str)) {
                        arrayList.add(file2);
                        String str3 = null;
                        try {
                            str3 = file2.getCanonicalPath();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (str3 != null) {
                            a("", str2, str3);
                            this.e++;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public String a(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf2 = str.lastIndexOf(35);
            if (lastIndexOf2 > 0) {
                str = str.substring(0, lastIndexOf2);
            }
            int lastIndexOf3 = str.lastIndexOf(63);
            if (lastIndexOf3 > 0) {
                str = str.substring(0, lastIndexOf3);
            }
            int lastIndexOf4 = str.lastIndexOf(47);
            if (lastIndexOf4 >= 0) {
                str = str.substring(lastIndexOf4 + 1);
            }
            if (!str.equals("") && Pattern.matches("[a-zA-Z_0-9\\.\\-\\(\\)\\%]+", str) && (lastIndexOf = str.lastIndexOf(46)) >= 0) {
                return str.substring(lastIndexOf + 1);
            }
        }
        return "";
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        com.tsf.shell.plugin.themepicker.g.c("", "onItemClick");
        a aVar = (a) adapterView.getAdapter();
        aVar.a((ListView) adapterView, view, i);
        if (i == 0) {
            a(new b("", "default", ""));
        } else {
            a(aVar.a(i));
        }
    }

    private void a(b bVar) {
        bVar.c(this);
        Intent intent = new Intent();
        intent.putExtra("package", bVar.a);
        intent.putExtra("type", bVar.b);
        intent.putExtra("path", bVar.c);
        setResult(-1, intent);
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == n.imageView1) {
            a(true);
        }
    }
}
