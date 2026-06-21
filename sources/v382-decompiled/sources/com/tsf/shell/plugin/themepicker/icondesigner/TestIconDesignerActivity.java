package com.tsf.shell.plugin.themepicker.icondesigner;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.tsf.shell.plugin.themepicker.ac;
import com.tsf.shell.plugin.themepicker.ai;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class TestIconDesignerActivity extends Activity implements View.OnClickListener, ai, d {
    List a;
    private ArrayList b;
    private int c = 0;
    private int d;
    private int e;
    private e f;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p.theme_preview_test_icon_designer);
        c.a((Context) this, (d) this);
        ((Button) findViewById(n.button1)).setOnClickListener(this);
        long currentTimeMillis = System.currentTimeMillis();
        this.f = new e();
        com.tsf.shell.plugin.themepicker.g.b("getThemePreviewCount Cost :" + (System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // com.tsf.shell.plugin.themepicker.icondesigner.d
    public void a() {
        com.tsf.shell.plugin.themepicker.g.b("onDeviceThemeInfoUpdate");
        this.b = c.a(this);
        this.d = this.b.size();
        com.tsf.shell.plugin.themepicker.g.b("backs max:" + this.d);
        ac.a(this, this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = (ImageView) findViewById(n.imageView1);
        long currentTimeMillis = System.currentTimeMillis();
        String str = ((ResolveInfo) this.a.get(this.c)).activityInfo.packageName;
        com.tsf.shell.plugin.themepicker.g.b("packagename:" + str);
        Bitmap a = this.f.a(this, str, 500);
        com.tsf.shell.plugin.themepicker.g.b("load bitmap Cost :" + (System.currentTimeMillis() - currentTimeMillis));
        imageView.setImageBitmap(a);
        this.c++;
        this.e = this.a.size();
        if (this.c >= this.e) {
            this.c = 0;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.ai
    public void a(List list) {
        this.a = list;
    }
}
