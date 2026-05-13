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
import android.os.Build;
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
import com.tsf.shell.plugin.fontspicker.C3806a;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3852f;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class FontsPickerActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private AlertDialog f12519a;

    /* renamed from: c */
    private View f12521c;

    /* renamed from: d */
    private C3806a f12522d;

    /* renamed from: b */
    private Handler f12520b = new Handler();

    /* renamed from: e */
    private int f12523e = 0;

    /* renamed from: f */
    private boolean f12524f = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C3852f.C3860h.fonts_picker_activity);
        ListView listView = (ListView) findViewById(C3852f.C3858f.listView1);
        this.f12522d = new C3806a(this);
        listView.setAdapter((ListAdapter) this.f12522d);
        listView.setOnItemClickListener(this);
        findViewById(C3852f.C3858f.imageView1).setOnClickListener(this);
        if (this.f12522d.getCount() == 1) {
            m1408a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m1421a() {
        this.f12522d.m1399a();
        this.f12522d.notifyDataSetChanged();
        this.f12524f = true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.tsf.shell.plugin.fontspicker.FontsPickerActivity$3] */
    /* renamed from: a */
    private void m1408a(final boolean z) {
        this.f12524f = false;
        this.f12521c = LayoutInflater.from(this).inflate(C3852f.C3860h.fonts_dialog_body_layout, (ViewGroup) null);
        this.f12519a = new AlertDialog.Builder(this).setView(this.f12521c).setCancelable(false).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.2
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                FontsPickerActivity.this.m1421a();
            }
        }).setNegativeButton(C3852f.C3862j.apps_management_dialog_button_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                FontsPickerActivity.this.m1421a();
            }
        }).show();
        this.f12523e = 0;
        m1407b();
        final String packageName = getPackageName();
        new Thread() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                FontsPickerActivity.this.m1404c();
                if (z) {
                    FontsPickerActivity.this.m1406b((Context) FontsPickerActivity.this);
                } else {
                    FontsPickerActivity.this.m1418a(FontsPickerActivity.m1419a(FontsPickerActivity.this, packageName).getAssets(), "", new ArrayList(), "ttf", packageName);
                }
                FontsPickerActivity.this.f12520b.post(new Runnable() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3851e.m1317b("Fonts Picker Disalog Dismiss......");
                        if (FontsPickerActivity.this.f12519a != null && FontsPickerActivity.this.f12519a.isShowing()) {
                            FontsPickerActivity.this.f12519a.dismiss();
                            FontsPickerActivity.this.f12522d.m1399a();
                            FontsPickerActivity.this.f12522d.notifyDataSetChanged();
                        }
                    }
                });
            }
        }.start();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C3851e.m1317b("---Fonts Picker Activity onDestroy---");
        if (this.f12519a != null) {
            this.f12519a.cancel();
            this.f12519a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m1410a(String str, int i) {
        ((TextView) this.f12521c.findViewById(C3852f.C3858f.textView1)).setText(C3852f.C3862j.font_scan_package);
        ((TextView) this.f12521c.findViewById(C3852f.C3858f.textView2)).setText(str);
        String string = getString(C3852f.C3862j.font_scan_summary_head);
        ((TextView) this.f12521c.findViewById(C3852f.C3858f.textView3)).setText(string + " " + i + " " + getString(C3852f.C3862j.font_scan_summary_tail));
    }

    /* renamed from: a */
    private void m1409a(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C3808b.f12544c, str);
        contentValues.put(C3808b.f12542a, str2);
        contentValues.put(C3808b.f12543b, str3);
        C3809c.m1389a(this).m1388a(C3808b.f12545d, contentValues);
    }

    /* renamed from: b */
    private void m1407b() {
        C3851e.m1315c("", " clean data count:" + C3809c.m1389a(this).m1387a(C3808b.f12545d, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m1406b(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            final String str = resolveInfo.activityInfo.packageName;
            if (!this.f12524f) {
                if (this.f12519a != null) {
                    this.f12520b.post(new Runnable() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.4
                        @Override // java.lang.Runnable
                        public void run() {
                            FontsPickerActivity.this.m1410a(str, FontsPickerActivity.this.f12523e);
                        }
                    });
                }
                Context m1419a = m1419a(context, str);
                C3851e.m1315c("", "packageName:" + str);
                m1418a(m1419a.getAssets(), "", arrayList, "ttf", str);
            } else {
                return;
            }
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            C3851e.m1315c("", "files:" + it.next());
        }
        C3851e.m1315c("", "Parse Fonts Cost:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: a */
    public static Context m1419a(Context context, String str) {
        try {
            return context.createPackageContext(str, 2);
        } catch (PackageManager.NameNotFoundException e) {
            C3851e.m1315c("", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m1418a(AssetManager assetManager, String str, ArrayList<String> arrayList, String str2, String str3) {
        String[] list;
        try {
            C3851e.m1314d("", "path:" + str);
            for (String str4 : assetManager.list(str)) {
                C3851e.m1315c("", "files:" + str4);
                if (!str4.equals("")) {
                    String str5 = str + (str.equals("") ? "" : "/") + str4;
                    if (m1411a(str5).equals(str2)) {
                        arrayList.add(str5);
                        m1409a(str3, "package", str5);
                        this.f12523e++;
                    } else if (str5.indexOf(".") > 0 || str5.toLowerCase().indexOf("fonts") < 0) {
                        C3851e.m1316b("", "SKIP:" + str5);
                    } else {
                        m1418a(assetManager, str5, arrayList, str2, str3);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m1404c() {
        ArrayList<File> arrayList = new ArrayList<>();
        for (String str : new String[]{"/system/fonts", "/system/font", "/data/fonts"}) {
            m1412a(new File(str), arrayList, "ttf", "system");
        }
        String path = m1420a((Context) this).getPath();
        for (String str2 : new String[]{path + "/GOLauncherEX/fonts", path + "/fonts"}) {
            m1412a(new File(str2), arrayList, "ttf", "external");
        }
    }

    /* renamed from: a */
    public static File m1420a(Context context) {
        File file;
        try {
            if (Build.VERSION.SDK_INT > 7) {
                file = context.getExternalFilesDir(null);
            } else {
                file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + context.getPackageName() + "/files");
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            return file;
        } catch (NullPointerException e) {
            return null;
        }
    }

    /* renamed from: a */
    private void m1412a(File file, ArrayList<File> arrayList, String str, String str2) {
        File[] listFiles;
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                C3851e.m1315c("", "Path:" + file2.getName());
                final String path = file.getPath();
                if (!this.f12524f) {
                    if (this.f12519a != null) {
                        this.f12520b.post(new Runnable() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.5
                            @Override // java.lang.Runnable
                            public void run() {
                                FontsPickerActivity.this.m1410a(path, FontsPickerActivity.this.f12523e);
                            }
                        });
                    }
                    if (file2.isDirectory()) {
                        m1412a(file2, arrayList, str, str2);
                    } else if (m1411a(file2.getName()).equals(str)) {
                        arrayList.add(file2);
                        String str3 = null;
                        try {
                            str3 = file2.getCanonicalPath();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (str3 != null) {
                            m1409a("", str2, str3);
                            this.f12523e++;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public String m1411a(String str) {
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
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C3851e.m1315c("", "onItemClick");
        C3806a c3806a = (C3806a) adapterView.getAdapter();
        c3806a.m1397a((ListView) adapterView, view, i);
        if (i == 0) {
            m1413a(new C3806a.C3807a("", "default", ""));
        } else {
            m1413a(c3806a.m1398a(i));
        }
    }

    /* renamed from: a */
    private void m1413a(C3806a.C3807a c3807a) {
        c3807a.m1392c(this);
        Intent intent = new Intent();
        intent.putExtra("package", c3807a.f12539a);
        intent.putExtra("type", c3807a.f12540b);
        intent.putExtra("path", c3807a.f12541c);
        setResult(-1, intent);
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C3852f.C3858f.imageView1) {
            m1408a(true);
        }
    }
}
