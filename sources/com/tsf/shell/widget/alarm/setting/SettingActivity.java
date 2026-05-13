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
import com.tsf.shell.p086a.p087a.C2186a;
import com.tsf.shell.p086a.p087a.C2202d;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.C4314m;
import com.tsf.shell.widget.alarm.p205d.C4284a;
import com.tsf.shell.widget.alarm.p205d.p206a.C4285a;
import com.tsf.shell.widget.alarm.service.InterfaceC4340b;
import com.tsf.shell.widget.alarm.service.ServiceConnectionC4343c;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class SettingActivity extends Activity implements ServiceConnectionC4343c.InterfaceC4346c {

    /* renamed from: a */
    public static Context f14091a;

    /* renamed from: b */
    private static boolean f14092b;

    /* renamed from: c */
    private C4361b f14093c;

    /* renamed from: d */
    private View f14094d;

    /* renamed from: e */
    private ListView f14095e;

    /* renamed from: f */
    private C4362a f14096f;

    /* renamed from: g */
    private ListView f14097g;

    /* renamed from: h */
    private C4359a f14098h;

    /* renamed from: i */
    private C4363b f14099i;

    /* renamed from: j */
    private ServiceConnectionC4343c f14100j;

    /* renamed from: k */
    private C4371e f14101k;

    /* renamed from: l */
    private Handler f14102l;

    /* renamed from: m */
    private final int f14103m = 0;

    /* renamed from: n */
    private C2186a f14104n;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C4314m.C4318d.activity_setting_main_layout);
        m161b();
    }

    /* renamed from: b */
    private void m161b() {
        this.f14102l = new Handler();
        f14091a = getApplicationContext();
        this.f14104n = new C2186a(this);
        this.f14101k = new C4371e(this);
        this.f14100j = new ServiceConnectionC4343c(f14091a);
        this.f14100j.m190a(this);
        this.f14093c = new C4361b();
        this.f14099i = new C4363b(this);
        this.f14095e = (ListView) findViewById(C4314m.C4317c.settinglist);
        this.f14095e.setAdapter((ListAdapter) this.f14099i);
        this.f14095e.setOnItemClickListener(this.f14093c);
        this.f14094d = findViewById(C4314m.C4317c.search_city_layout);
        this.f14098h = new C4359a();
        this.f14096f = new C4362a();
        this.f14097g = (ListView) findViewById(C4314m.C4317c.searchcity_list);
        this.f14097g.setAdapter((ListAdapter) this.f14096f);
        this.f14097g.setOnItemClickListener(this.f14098h);
        final EditText editText = (EditText) findViewById(C4314m.C4317c.edittext_cityname);
        editText.getBackground().setColorFilter(getResources().getInteger(C4314m.C4315a.material_catalog_color), PorterDuff.Mode.SRC_IN);
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && i == 66) {
                    C4305i.m259c("Enter on Key");
                    ((InputMethodManager) SettingActivity.this.getSystemService("input_method")).toggleSoftInput(1, 2);
                    SettingActivity.this.m163a(editText.getText().toString());
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
                    SettingActivity.this.f14096f.m151a();
                } else if (length > 3) {
                    SettingActivity.this.m163a(charSequence.toString());
                }
            }
        });
        ((ImageView) findViewById(C4314m.C4317c.imageButton1)).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingActivity.this.m163a(editText.getText().toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tsf.shell.widget.alarm.setting.SettingActivity$4] */
    /* renamed from: a */
    public void m163a(final String str) {
        if (!str.equals("")) {
            new Thread() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.4
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    final ArrayList<C4284a> m312a = C4285a.m312a(str);
                    SettingActivity.this.f14102l.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            SettingActivity.this.f14096f.m149a(m312a);
                        }
                    });
                }
            }.start();
        }
    }

    /* renamed from: a */
    public void m162a(boolean z) {
        if (z) {
            this.f14094d.setVisibility(0);
            this.f14095e.setVisibility(4);
        } else {
            this.f14094d.setVisibility(4);
            this.f14095e.setVisibility(0);
        }
        f14092b = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m159c() {
        C4371e.f14142f = -1L;
        this.f14099i.notifyDataSetChanged();
        this.f14100j.m191a(new ServiceConnectionC4343c.InterfaceC4344a() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.5
            @Override // com.tsf.shell.widget.alarm.service.ServiceConnectionC4343c.InterfaceC4344a
            /* renamed from: a */
            public void mo153a(InterfaceC4340b interfaceC4340b) {
                interfaceC4340b.mo195a(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m170a(View view) {
        C4371e.f14138b = !C4371e.f14138b;
        C4363b.m142a(C4371e.f14138b, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m168a(C4284a c4284a) {
        if (c4284a == null) {
            C4305i.m259c("PositionOnChange item null");
            C4371e.f14137a = true;
        } else {
            C4305i.m259c("PositionOnChange item " + c4284a.f13881a + " code:" + c4284a.f13883c);
            C4371e.f14137a = false;
            C4371e.f14139c = c4284a.f13881a;
            C4371e.f14140d = c4284a.f13883c;
            C4370d.m120a(c4284a);
        }
        this.f14101k.m116c();
        m159c();
        this.f14099i.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m157d() {
        startActivityForResult(new Intent("android.intent.action.RINGTONE_PICKER"), 0);
    }

    /* renamed from: a */
    private void m172a(int i, Intent intent) {
        if (intent != null && i == -1) {
            this.f14099i.f14121a.m123a((Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI"));
            this.f14099i.m148a();
            this.f14099i.notifyDataSetChanged();
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 0:
                m172a(i2, intent);
                return;
            default:
                return;
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        this.f14100j.m188b();
        this.f14101k.m116c();
        this.f14101k.m113f();
        super.onPause();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (f14092b) {
            m162a(false);
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.setting.SettingActivity$b */
    /* loaded from: classes.dex */
    public class C4361b implements AdapterView.OnItemClickListener {
        C4361b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (i) {
                case 1:
                    SettingActivity.this.m162a(true);
                    return;
                case 2:
                    SettingActivity.this.m159c();
                    return;
                case 3:
                case 5:
                default:
                    return;
                case 4:
                    SettingActivity.this.m170a(view);
                    return;
                case 6:
                    SettingActivity.this.m157d();
                    return;
                case 7:
                    SettingActivity.this.m173a();
                    return;
            }
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.f14104n != null) {
            this.f14104n.m6127a(65535 & i, strArr, iArr);
        }
    }

    /* renamed from: a */
    public boolean m169a(C2202d.InterfaceC2204b interfaceC2204b, boolean z, int i, String... strArr) {
        if (this.f14104n != null) {
            return this.f14104n.m6120a(interfaceC2204b, z, i, strArr);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.setting.SettingActivity$a */
    /* loaded from: classes.dex */
    public class C4359a implements AdapterView.OnItemClickListener {
        C4359a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                if (SettingActivity.this.m169a(new C2202d.InterfaceC2204b() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.a.1
                    @Override // com.tsf.shell.p086a.p087a.C2202d.InterfaceC2204b
                    /* renamed from: a */
                    public void mo152a(int i2, boolean z, C2202d.EnumC2203a enumC2203a) {
                    }
                }, true, 2, C2202d.f7238e)) {
                    SettingActivity.this.m168a((C4284a) null);
                    SettingActivity.this.m162a(false);
                    return;
                }
                return;
            }
            SettingActivity.this.m168a((C4284a) view.getTag());
            SettingActivity.this.m162a(false);
        }
    }

    @Override // com.tsf.shell.widget.alarm.service.ServiceConnectionC4343c.InterfaceC4346c
    /* renamed from: a */
    public void mo171a(int i, byte[] bArr) {
        C4305i.m259c("Weather Setting Onload");
        this.f14102l.post(new Runnable() { // from class: com.tsf.shell.widget.alarm.setting.SettingActivity.6
            @Override // java.lang.Runnable
            public void run() {
                SettingActivity.this.f14101k.m115d();
                SettingActivity.this.f14099i.notifyDataSetChanged();
            }
        });
    }

    /* renamed from: a */
    public void m173a() {
        this.f14099i.f14122b = !this.f14099i.f14122b;
        this.f14099i.m148a();
        this.f14099i.notifyDataSetChanged();
    }
}
