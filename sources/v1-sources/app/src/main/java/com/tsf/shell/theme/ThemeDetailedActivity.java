package com.tsf.shell.theme;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.tsf.shell.R;
import com.tsf.shell.au;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ThemeDetailedActivity extends Activity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    private n a;
    private ThemePagePointer b;
    private ArrayList c;
    private Gallery d;
    private TextView e;
    private LinearLayout f;
    private LinearLayout g;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.theme_detailed);
        this.a = c.a().a(this);
        if (this.a == null) {
            au.a(R.string.notic_theme_error);
            finish();
            return;
        }
        this.d = (Gallery) findViewById(R.id.theme_gallery);
        this.e = (TextView) findViewById(R.id.theme_title);
        this.e.setTypeface(com.tsf.shell.workspace3D.i.a.a);
        this.f = (LinearLayout) findViewById(R.id.theme_detail_del);
        if (this.a.g.equals("com.tsf.shell")) {
            this.f.setVisibility(4);
        } else {
            this.f.setOnClickListener(this);
        }
        this.g = (LinearLayout) findViewById(R.id.theme_detail_apply);
        if (this.a.h) {
            this.g.setVisibility(4);
        } else {
            this.g.setOnClickListener(this);
        }
        this.b = (ThemePagePointer) findViewById(R.id.theme_detail_page_pointer);
        this.e.setText(this.a.f);
        this.c = this.a.b();
        this.d.setAdapter((SpinnerAdapter) new a(this, this));
        this.d.setOnItemSelectedListener(this);
        this.b.a(this.c.size());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.theme_detail_del /* 2131623995 */:
                try {
                    getPackageManager().getPackageInfo(this.a.g, 0);
                    startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + this.a.g)));
                    finish();
                    break;
                } catch (PackageManager.NameNotFoundException e) {
                    return;
                }
            case R.id.theme_detail_apply /* 2131623997 */:
                if (this.a.g.equals("com.tsf.shell") || this.a.g.equals("com.tsf.shell.themes.hd.box")) {
                    c.a().c(this.a.g);
                    break;
                } else {
                    c.a().c(this.a.g);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.b.b(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }
}
