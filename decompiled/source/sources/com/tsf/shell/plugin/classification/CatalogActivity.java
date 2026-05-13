package com.tsf.shell.plugin.classification;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import com.tsf.shell.plugin.classification.d;
import com.tsf.shell.plugin.themepicker.e;
import com.tsf.shell.plugin.themepicker.f;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class CatalogActivity extends Activity implements View.OnClickListener, d.InterfaceC0151d {
    private AsyncTask a;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(f.h.package_catalog_test);
        findViewById(f.C0155f.button1).setOnClickListener(this);
        findViewById(f.C0155f.button2).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.C0155f.button1) {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
            this.a = d.a(this, arrayList, this);
        } else if (id == f.C0155f.button2 && this.a != null) {
            this.a.cancel(true);
        }
    }

    @Override // com.tsf.shell.plugin.classification.d.InterfaceC0151d
    public void a(d.a aVar) {
        d.b[] bVarArr;
        e.b("onCompleteClassification");
        for (d.b bVar : aVar.b) {
            e.b("Acvivity Log:------------" + bVar);
            bVar.a();
        }
    }

    @Override // com.tsf.shell.plugin.classification.d.InterfaceC0151d
    public void a() {
        e.b("onClassificationError");
    }
}
