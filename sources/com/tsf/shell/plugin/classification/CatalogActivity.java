package com.tsf.shell.plugin.classification;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import com.tsf.shell.plugin.classification.C3777d;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3852f;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class CatalogActivity extends Activity implements View.OnClickListener, C3777d.InterfaceC3781d {

    /* renamed from: a */
    private AsyncTask f12378a;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C3852f.C3860h.package_catalog_test);
        findViewById(C3852f.C3858f.button1).setOnClickListener(this);
        findViewById(C3852f.C3858f.button2).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C3852f.C3858f.button1) {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
            this.f12378a = C3777d.m1522a(this, arrayList, this);
        } else if (id == C3852f.C3858f.button2 && this.f12378a != null) {
            this.f12378a.cancel(true);
        }
    }

    @Override // com.tsf.shell.plugin.classification.C3777d.InterfaceC3781d
    /* renamed from: a */
    public void mo1510a(C3777d.C3778a c3778a) {
        C3777d.C3779b[] c3779bArr;
        C3851e.m1317b("onCompleteClassification");
        for (C3777d.C3779b c3779b : c3778a.f12390b) {
            C3851e.m1317b("Acvivity Log:------------" + c3779b);
            c3779b.m1514a();
        }
    }

    @Override // com.tsf.shell.plugin.classification.C3777d.InterfaceC3781d
    /* renamed from: a */
    public void mo1511a() {
        C3851e.m1317b("onClassificationError");
    }
}
