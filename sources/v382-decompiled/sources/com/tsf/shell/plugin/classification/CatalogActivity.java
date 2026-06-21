package com.tsf.shell.plugin.classification;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class CatalogActivity extends Activity implements View.OnClickListener, h {
    private AsyncTask a;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p.package_catalog_test);
        findViewById(n.button1).setOnClickListener(this);
        findViewById(n.button2).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == n.button1) {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().activityInfo.packageName);
            }
            this.a = d.a(this, arrayList, this);
            return;
        }
        if (id == n.button2 && this.a != null) {
            this.a.cancel(true);
        }
    }

    @Override // com.tsf.shell.plugin.classification.h
    public void a(e eVar) {
        com.tsf.shell.plugin.themepicker.g.b("onCompleteClassification");
        for (f fVar : eVar.b) {
            com.tsf.shell.plugin.themepicker.g.b("Acvivity Log:------------" + fVar);
            fVar.a();
        }
    }

    @Override // com.tsf.shell.plugin.classification.h
    public void a() {
        com.tsf.shell.plugin.themepicker.g.b("onClassificationError");
    }
}
