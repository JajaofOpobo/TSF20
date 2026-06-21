package com.tsf.shell.widget.alarm.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.shell.widget.alarm.aa;
import com.tsf.shell.widget.alarm.ac;
import com.tsf.shell.widget.alarm.ad;
import com.tsf.shell.widget.alarm.u;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class SettingActivity extends Activity implements com.tsf.shell.widget.alarm.service.j {
    public static Context a;
    private static boolean b;
    private i c;
    private View d;
    private ListView e;
    private a f;
    private ListView g;
    private h h;
    private b i;
    private com.tsf.shell.widget.alarm.service.g j;
    private j k;
    private Handler l;
    private final int m = 0;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ad.activity_setting_main_layout);
        b();
    }

    private void b() {
        this.l = new Handler();
        a = getApplicationContext();
        this.k = new j(this);
        this.j = new com.tsf.shell.widget.alarm.service.g(a);
        this.j.a(this);
        this.c = new i(this);
        this.i = new b(this);
        this.e = (ListView) findViewById(ac.settinglist);
        this.e.setAdapter((ListAdapter) this.i);
        this.e.setOnItemClickListener(this.c);
        this.d = findViewById(ac.search_city_layout);
        this.h = new h(this);
        this.f = new a();
        this.g = (ListView) findViewById(ac.searchcity_list);
        this.g.setAdapter((ListAdapter) this.f);
        this.g.setOnItemClickListener(this.h);
        final EditText editText = (EditText) findViewById(ac.edittext_cityname);
        editText.getBackground().setColorFilter(getResources().getInteger(aa.material_catalog_color), PorterDuff.Mode.SRC_IN);
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && i == 66) {
                    u.c("Enter on Key");
                    ((InputMethodManager) SettingActivity.this.getSystemService("input_method")).toggleSoftInput(1, 2);
                    SettingActivity.this.a(editText.getText().toString());
                    return false;
                }
                return false;
            }
        });
        editText.addTextChangedListener(new TextWatcher() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int length = charSequence.length();
                if (length <= 3) {
                    SettingActivity.this.f.a();
                } else {
                    if (length <= 3) {
                        return;
                    }
                    SettingActivity.this.a(charSequence.toString());
                }
            }
        });
        ((ImageView) findViewById(ac.imageButton1)).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingActivity.this.a(editText.getText().toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tsf.shell.widget.alarm.setting.SettingActivity$4] */
    public void a(final String str) {
        if (!str.equals("")) {
            new Thread() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.4
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    final ArrayList a2 = com.tsf.shell.widget.alarm.d.a.a.a(str);
                    SettingActivity.this.l.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            SettingActivity.this.f.a(a2);
                        }
                    });
                }
            }.start();
        }
    }

    public void a(boolean z) {
        if (z) {
            this.d.setVisibility(0);
            this.e.setVisibility(4);
        } else {
            this.d.setVisibility(4);
            this.e.setVisibility(0);
        }
        b = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        j.f = -1L;
        this.i.notifyDataSetChanged();
        this.j.a(new com.tsf.shell.widget.alarm.service.h() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.5
            @Override // com.tsf.shell.widget.alarm.service.h
            public void a(com.tsf.shell.widget.alarm.service.d dVar) {
                dVar.a(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        j.b = !j.b;
        b.a(j.b, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.widget.alarm.d.a aVar) {
        if (aVar == null) {
            u.c("PositionOnChange item null");
            j.a = true;
        } else {
            u.c("PositionOnChange item " + aVar.a + " code:" + aVar.c);
            j.a = false;
            j.c = aVar.a;
            j.d = aVar.c;
            d.a(aVar);
        }
        this.k.c();
        c();
        this.i.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        startActivityForResult(new Intent("android.intent.action.RINGTONE_PICKER"), 0);
    }

    private void a(int i, Intent intent) {
        if (intent != null && i == -1) {
            this.i.a.a((Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI"));
            this.i.a();
            this.i.notifyDataSetChanged();
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 0:
                a(i2, intent);
                break;
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        this.j.b();
        this.k.c();
        this.k.f();
        super.onPause();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (b) {
            a(false);
        } else {
            finish();
        }
    }

    @Override // com.tsf.shell.widget.alarm.service.j
    public void a(int i, byte[] bArr) {
        u.c("Weather Setting Onload");
        this.l.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.6
            @Override // java.lang.Runnable
            public void run() {
                SettingActivity.this.k.d();
                SettingActivity.this.i.notifyDataSetChanged();
            }
        });
    }

    public void a() {
        this.i.b = !this.i.b;
        this.i.a();
        this.i.notifyDataSetChanged();
    }
}
