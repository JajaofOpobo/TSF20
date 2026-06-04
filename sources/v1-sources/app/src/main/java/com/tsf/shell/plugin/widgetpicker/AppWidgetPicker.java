package com.tsf.shell.plugin.widgetpicker;

import android.app.Activity;
import android.app.ProgressDialog;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class AppWidgetPicker extends Activity {
    private ArrayList d;
    private int e;
    private Intent a = null;
    private PackageManager b = null;
    private AppWidgetManager c = null;
    private Handler f = new Handler();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("");
        requestWindowFeature(1);
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(R.string.tsf_loading_content));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.show();
        this.a = getIntent();
        Intent intent = getIntent();
        if (intent.hasExtra("appWidgetId")) {
            this.e = intent.getIntExtra("appWidgetId", 0);
            this.b = getPackageManager();
            this.c = AppWidgetManager.getInstance(this);
            this.d = new ArrayList();
            new a(this, progressDialog).start();
            return;
        }
        finish();
    }

    public final ArrayList a() {
        return this.d;
    }

    public final void a(j jVar) {
        Intent intent;
        if (jVar.a != null) {
            Parcelable parcelableExtra = this.a.getParcelableExtra("android.intent.extra.INTENT");
            if (parcelableExtra instanceof Intent) {
                intent = new Intent((Intent) parcelableExtra);
            } else {
                intent = new Intent("android.intent.action.MAIN", (Uri) null);
                intent.addCategory("android.intent.category.DEFAULT");
            }
            if (jVar.f() != null) {
                intent.setClassName(jVar.f().getPackageName(), jVar.f().getClassName());
            } else {
                intent.setAction("android.intent.action.CREATE_SHORTCUT");
                intent.putExtra("android.intent.extra.shortcut.NAME", jVar.b());
            }
            if (jVar.a != null) {
                intent.putExtras(jVar.a);
            }
            setResult(-1, intent);
        } else {
            try {
                if (!this.c.bindAppWidgetIdIfAllowed(this.e, jVar.f())) {
                    Intent intent2 = new Intent("android.appwidget.action.APPWIDGET_BIND");
                    intent2.putExtra("appWidgetId", this.e);
                    intent2.putExtra("appWidgetProvider", jVar.f());
                    startActivityForResult(intent2, 0);
                    return;
                }
            } catch (Exception e) {
            }
            setResult(-1, this.a);
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 == -1) {
            setResult(-1, this.a);
        }
        finish();
    }

    private d a(AppWidgetProviderInfo appWidgetProviderInfo) {
        String packageName = appWidgetProviderInfo.provider.getPackageName();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar instanceof d) {
                d dVar = (d) jVar;
                if (dVar.d().equals(packageName)) {
                    return dVar;
                }
            }
        }
        try {
            ApplicationInfo applicationInfo = this.b.getApplicationInfo(appWidgetProviderInfo.provider.getPackageName(), 0);
            d dVar2 = new d(this.b.getApplicationLabel(applicationInfo).toString(), this.b.getApplicationIcon(applicationInfo), appWidgetProviderInfo.previewImage != 0 ? this.b.getDrawable(appWidgetProviderInfo.provider.getPackageName(), appWidgetProviderInfo.previewImage, applicationInfo) : null);
            dVar2.a(packageName);
            dVar2.a(appWidgetProviderInfo.minHeight);
            dVar2.b(appWidgetProviderInfo.minWidth);
            this.d.add(dVar2);
            return dVar2;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    static /* synthetic */ void a(AppWidgetPicker appWidgetPicker) {
        for (AppWidgetProviderInfo appWidgetProviderInfo : appWidgetPicker.c.getInstalledProviders()) {
            try {
                ApplicationInfo applicationInfo = appWidgetPicker.b.getApplicationInfo(appWidgetProviderInfo.provider.getPackageName(), 0);
                j jVar = new j(appWidgetProviderInfo.label, appWidgetPicker.b.getDrawable(appWidgetProviderInfo.provider.getPackageName(), appWidgetProviderInfo.icon, applicationInfo), appWidgetPicker.b.getDrawable(appWidgetProviderInfo.provider.getPackageName(), appWidgetProviderInfo.previewImage, applicationInfo));
                jVar.a(appWidgetProviderInfo.provider);
                jVar.a(appWidgetProviderInfo.minHeight);
                jVar.b(appWidgetProviderInfo.minWidth);
                appWidgetPicker.a(appWidgetProviderInfo).a().add(jVar);
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
    }

    static /* synthetic */ void b(AppWidgetPicker appWidgetPicker) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Bundle extras = appWidgetPicker.a.getExtras();
        ArrayList parcelableArrayList = extras.getParcelableArrayList("customInfo");
        if (parcelableArrayList == null || parcelableArrayList.size() == 0) {
            arrayList = null;
            arrayList2 = parcelableArrayList;
        } else {
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Parcelable parcelable = (Parcelable) parcelableArrayList.get(i);
                if (parcelable == null || !(parcelable instanceof AppWidgetProviderInfo)) {
                    arrayList = null;
                    arrayList2 = null;
                    break;
                }
            }
            ArrayList parcelableArrayList2 = extras.getParcelableArrayList("customExtras");
            if (parcelableArrayList2 == null) {
                arrayList = parcelableArrayList2;
                arrayList2 = null;
            } else {
                int size2 = parcelableArrayList2.size();
                if (size == size2) {
                    for (int i2 = 0; i2 < size2; i2++) {
                        Parcelable parcelable2 = (Parcelable) parcelableArrayList2.get(i2);
                        if (parcelable2 == null || !(parcelable2 instanceof Bundle)) {
                            arrayList = null;
                            arrayList2 = null;
                            break;
                        }
                    }
                }
                arrayList = parcelableArrayList2;
                arrayList2 = parcelableArrayList;
            }
        }
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                AppWidgetProviderInfo appWidgetProviderInfo = (AppWidgetProviderInfo) arrayList2.get(i3);
                String str = appWidgetProviderInfo.label.toString();
                Drawable drawable = appWidgetProviderInfo.icon != 0 ? appWidgetPicker.b.getDrawable(appWidgetProviderInfo.provider.getPackageName(), appWidgetProviderInfo.icon, null) : null;
                Drawable drawable2 = appWidgetProviderInfo.previewImage != 0 ? appWidgetPicker.b.getDrawable(appWidgetProviderInfo.provider.getPackageName(), appWidgetProviderInfo.previewImage, null) : null;
                d dVar = new d(str, drawable, drawable2);
                j jVar = new j(str, drawable, drawable2);
                dVar.a().add(jVar);
                dVar.a(appWidgetProviderInfo.provider.getPackageName());
                if (arrayList != null) {
                    jVar.a = (Bundle) arrayList.get(i3);
                }
                appWidgetPicker.d.add(dVar);
            }
        }
    }
}
