package com.tsf.shell.plugin.themepicker.icondesigner;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.C3897k;
import com.tsf.shell.plugin.themepicker.icondesigner.C3875c;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class TestIconDesignerActivity extends Activity implements View.OnClickListener, C3875c.InterfaceC3877a, C3897k.InterfaceC3904f {

    /* renamed from: a */
    List<ResolveInfo> f12678a;

    /* renamed from: b */
    private ArrayList<C3873a> f12679b;

    /* renamed from: c */
    private int f12680c = 0;

    /* renamed from: d */
    private int f12681d;

    /* renamed from: e */
    private int f12682e;

    /* renamed from: f */
    private C3878d f12683f;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C3852f.C3860h.theme_preview_test_icon_designer);
        C3875c.m1293a((Context) this, (C3875c.InterfaceC3877a) this);
        ((Button) findViewById(C3852f.C3858f.button1)).setOnClickListener(this);
        long currentTimeMillis = System.currentTimeMillis();
        this.f12683f = new C3878d();
        C3851e.m1317b("getThemePreviewCount Cost :" + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // com.tsf.shell.plugin.themepicker.icondesigner.C3875c.InterfaceC3877a
    /* renamed from: a */
    public void mo1276a() {
        C3851e.m1317b("onDeviceThemeInfoUpdate");
        this.f12679b = C3875c.m1296a(this);
        this.f12681d = this.f12679b.size();
        C3851e.m1317b("backs max:" + this.f12681d);
        C3897k.m1237a(this, this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        String str = this.f12678a.get(this.f12680c).activityInfo.packageName;
        C3851e.m1317b("packagename:" + str);
        Bitmap m1273a = this.f12683f.m1273a(this, str, 500);
        C3851e.m1317b("load bitmap Cost :" + (System.currentTimeMillis() - currentTimeMillis));
        ((ImageView) findViewById(C3852f.C3858f.imageView1)).setImageBitmap(m1273a);
        this.f12680c++;
        this.f12682e = this.f12678a.size();
        if (this.f12680c >= this.f12682e) {
            this.f12680c = 0;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.C3897k.InterfaceC3904f
    /* renamed from: a */
    public void mo1003a(List<ResolveInfo> list) {
        this.f12678a = list;
    }
}
