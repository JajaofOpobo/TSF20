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
import com.tsf.shell.plugin.fontspicker.a;
import com.tsf.shell.plugin.themepicker.e;
import com.tsf.shell.plugin.themepicker.f;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        setContentView(f.h.fonts_picker_activity);
        ListView listView = (ListView) findViewById(f.C0155f.listView1);
        this.d = new a(this);
        listView.setAdapter((ListAdapter) this.d);
        listView.setOnItemClickListener(this);
        findViewById(f.C0155f.imageView1).setOnClickListener(this);
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
        this.c = LayoutInflater.from(this).inflate(f.h.fonts_dialog_body_layout, (ViewGroup) null);
        this.a = new AlertDialog.Builder(this).setView(this.c).setCancelable(false).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.2
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                FontsPickerActivity.this.a();
            }
        }).setNegativeButton(f.j.apps_management_dialog_button_cancel, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.1
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
                if (z) {
                    FontsPickerActivity.this.b((Context) FontsPickerActivity.this);
                } else {
                    FontsPickerActivity.this.a(FontsPickerActivity.a(FontsPickerActivity.this, packageName).getAssets(), "", new ArrayList(), "ttf", packageName);
                }
                FontsPickerActivity.this.b.post(new Runnable() { // from class: com.tsf.shell.plugin.fontspicker.FontsPickerActivity.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        e.b("Fonts Picker Disalog Dismiss......");
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
        e.b("---Fonts Picker Activity onDestroy---");
        if (this.a != null) {
            this.a.cancel();
            this.a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i) {
        ((TextView) this.c.findViewById(f.C0155f.textView1)).setText(f.j.font_scan_package);
        ((TextView) this.c.findViewById(f.C0155f.textView2)).setText(str);
        ((TextView) this.c.findViewById(f.C0155f.textView3)).setText(getString(f.j.font_scan_summary_head) + " " + i + " " + getString(f.j.font_scan_summary_tail));
    }

    private void a(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(b.c, str);
        contentValues.put(b.a, str2);
        contentValues.put(b.b, str3);
        c.a(this).a(b.d, contentValues);
    }

    private void b() {
        e.c("", " clean data count:" + c.a(this).a(b.d, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
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
                Context contextA = a(context, str);
                e.c("", "packageName:" + str);
                a(contextA.getAssets(), "", arrayList, "ttf", str);
            } else {
                return;
            }
        }
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            e.c("", "files:" + it2.next());
        }
        e.c("", "Parse Fonts Cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static Context a(Context context, String str) {
        try {
            return context.createPackageContext(str, 2);
        } catch (PackageManager.NameNotFoundException e) {
            e.c("", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AssetManager assetManager, String str, ArrayList<String> arrayList, String str2, String str3) {
        try {
            e.d("", "path:" + str);
            for (String str4 : assetManager.list(str)) {
                e.c("", "files:" + str4);
                if (!str4.equals("")) {
                    String str5 = str + (str.equals("") ? "" : "/") + str4;
                    if (a(str5).equals(str2)) {
                        arrayList.add(str5);
                        a(str3, "package", str5);
                        this.e++;
                    } else if (str5.indexOf(".") > 0 || str5.toLowerCase().indexOf("fonts") < 0) {
                        e.b("", "SKIP:" + str5);
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
        ArrayList<File> arrayList = new ArrayList<>();
        for (String str : new String[]{"/system/fonts", "/system/font", "/data/fonts"}) {
            a(new File(str), arrayList, "ttf", "system");
        }
        String path = a((Context) this).getPath();
        for (String str2 : new String[]{path + "/GOLauncherEX/fonts", path + "/fonts"}) {
            a(new File(str2), arrayList, "ttf", "external");
        }
    }

    public static File a(Context context) {
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

    private void a(File file, ArrayList<File> arrayList, String str, String str2) {
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                e.c("", "Path:" + file2.getName());
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
                        String canonicalPath = null;
                        try {
                            canonicalPath = file2.getCanonicalPath();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (canonicalPath != null) {
                            a("", str2, canonicalPath);
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
        int iLastIndexOf;
        if (!TextUtils.isEmpty(str)) {
            int iLastIndexOf2 = str.lastIndexOf(35);
            if (iLastIndexOf2 > 0) {
                str = str.substring(0, iLastIndexOf2);
            }
            int iLastIndexOf3 = str.lastIndexOf(63);
            if (iLastIndexOf3 > 0) {
                str = str.substring(0, iLastIndexOf3);
            }
            int iLastIndexOf4 = str.lastIndexOf(47);
            if (iLastIndexOf4 >= 0) {
                str = str.substring(iLastIndexOf4 + 1);
            }
            if (!str.equals("") && Pattern.matches("[a-zA-Z_0-9\\.\\-\\(\\)\\%]+", str) && (iLastIndexOf = str.lastIndexOf(46)) >= 0) {
                return str.substring(iLastIndexOf + 1);
            }
        }
        return "";
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) throws Throwable {
        e.c("", "onItemClick");
        a aVar = (a) adapterView.getAdapter();
        aVar.a((ListView) adapterView, view, i);
        if (i == 0) {
            a(new a.C0152a("", "default", ""));
        } else {
            a(aVar.a(i));
        }
    }

    private void a(a.C0152a c0152a) throws Throwable {
        c0152a.c(this);
        Intent intent = new Intent();
        intent.putExtra("package", c0152a.a);
        intent.putExtra("type", c0152a.b);
        intent.putExtra("path", c0152a.c);
        setResult(-1, intent);
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.C0155f.imageView1) {
            a(true);
        }
    }
}
