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
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.shell.a.a.d;
import com.tsf.shell.widget.alarm.i;
import com.tsf.shell.widget.alarm.m;
import com.tsf.shell.widget.alarm.service.c;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class SettingActivity extends Activity implements c.InterfaceC0180c {
    public static Context a;
    private static boolean b;
    private b c;
    private View d;
    private ListView e;
    private com.tsf.shell.widget.alarm.setting.a f;
    private ListView g;
    private a h;
    private com.tsf.shell.widget.alarm.setting.b i;
    private com.tsf.shell.widget.alarm.service.c j;
    private e k;
    private Handler l;
    private final int m = 0;
    private com.tsf.shell.a.a.a n;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m.d.activity_setting_main_layout);
        b();
    }

    private void b() {
        this.l = new Handler();
        a = getApplicationContext();
        this.n = new com.tsf.shell.a.a.a(this);
        this.k = new e(this);
        this.j = new com.tsf.shell.widget.alarm.service.c(a);
        this.j.a(this);
        this.c = new b();
        this.i = new com.tsf.shell.widget.alarm.setting.b(this);
        this.e = (ListView) findViewById(m.c.settinglist);
        this.e.setAdapter((ListAdapter) this.i);
        this.e.setOnItemClickListener(this.c);
        this.d = findViewById(m.c.search_city_layout);
        this.h = new a();
        this.f = new com.tsf.shell.widget.alarm.setting.a();
        this.g = (ListView) findViewById(m.c.searchcity_list);
        this.g.setAdapter((ListAdapter) this.f);
        this.g.setOnItemClickListener(this.h);
        final EditText editText = (EditText) findViewById(m.c.edittext_cityname);
        editText.getBackground().setColorFilter(getResources().getInteger(m.a.material_catalog_color), PorterDuff.Mode.SRC_IN);
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && i == 66) {
                    i.c("Enter on Key");
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
                } else if (length > 3) {
                    SettingActivity.this.a(charSequence.toString());
                }
            }
        });
        ((ImageView) findViewById(m.c.imageButton1)).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.3
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
                    final ArrayList<com.tsf.shell.widget.alarm.d.a> a2 = com.tsf.shell.widget.alarm.d.a.a.a(str);
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
        e.f = -1L;
        this.i.notifyDataSetChanged();
        this.j.a(new c.a() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.5
            @Override // com.tsf.shell.widget.alarm.service.c.a
            public void a(com.tsf.shell.widget.alarm.service.b bVar) {
                bVar.a(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        e.b = !e.b;
        com.tsf.shell.widget.alarm.setting.b.a(e.b, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.widget.alarm.d.a aVar) {
        if (aVar == null) {
            i.c("PositionOnChange item null");
            e.a = true;
        } else {
            i.c("PositionOnChange item " + aVar.a + " code:" + aVar.c);
            e.a = false;
            e.c = aVar.a;
            e.d = aVar.c;
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
                return;
            default:
                return;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (i) {
                case 1:
                    SettingActivity.this.a(true);
                    return;
                case 2:
                    SettingActivity.this.c();
                    return;
                case 3:
                case 5:
                default:
                    return;
                case 4:
                    SettingActivity.this.a(view);
                    return;
                case 6:
                    SettingActivity.this.d();
                    return;
                case 7:
                    SettingActivity.this.a();
                    return;
            }
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.n != null) {
            this.n.a(65535 & i, strArr, iArr);
        }
    }

    public boolean a(d.b bVar, boolean z, int i, String... strArr) {
        if (this.n != null) {
            return this.n.a(bVar, z, i, strArr);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                if (SettingActivity.this.a(new d.b() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.a.1
                    @Override // com.tsf.shell.a.a.d.b
                    public void a(int i2, boolean z, d.a aVar) {
                    }
                }, true, 2, com.tsf.shell.a.a.d.e)) {
                    SettingActivity.this.a((com.tsf.shell.widget.alarm.d.a) null);
                    SettingActivity.this.a(false);
                    return;
                }
                return;
            }
            SettingActivity.this.a((com.tsf.shell.widget.alarm.d.a) view.getTag());
            SettingActivity.this.a(false);
        }
    }

    @Override // com.tsf.shell.widget.alarm.service.c.InterfaceC0180c
    public void a(int i, byte[] bArr) {
        i.c("Weather Setting Onload");
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
