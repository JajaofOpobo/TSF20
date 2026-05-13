package com.tsf.shell.preference;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.widget.Toast;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p035c.C0913a;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.InterfaceC2185a;
import com.tsf.shell.manager.action.C3390c;
import com.tsf.shell.manager.action.C3398f;
import java.util.HashMap;
import org.acra.ACRAConstants;
/* loaded from: classes.dex */
public class SettingGesturePreferenceActivity extends PreferenceActivity implements Preference.OnPreferenceClickListener, InterfaceC2185a {

    /* renamed from: b */
    private HashMap<Integer, String> f13078b;

    /* renamed from: a */
    private HashMap<Integer, C0913a.InterfaceC0914a> f13077a = new HashMap<>();

    /* renamed from: c */
    private int f13079c = ACRAConstants.DEFAULT_SOCKET_TIMEOUT;

    /* renamed from: a */
    public static void m931a() {
        Intent intent = new Intent();
        intent.setClass(C0853a.m10856d(), SettingGesturePreferenceActivity.class);
        int[] iArr = {8, 7, 6, 0, 1, 2, 3, 4, 5, 100, 101};
        int length = iArr.length;
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < length; i++) {
            strArr[i] = C3398f.m2649a(iArr[i]).f11230b;
        }
        intent.putExtra("idList", iArr);
        intent.putExtra("stringList", strArr);
        Home.m6177b().startActivity(intent);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(C1306b.C1317k.preferences_gesture);
        this.f13078b = new HashMap<>();
        String[] stringArrayExtra = getIntent().getStringArrayExtra("stringList");
        int[] intArrayExtra = getIntent().getIntArrayExtra("idList");
        int length = intArrayExtra.length;
        for (int i = 0; i < length; i++) {
            this.f13078b.put(Integer.valueOf(intArrayExtra[i]), stringArrayExtra[i]);
        }
        m925b();
        findPreference("gesture_double_tap").setOnPreferenceClickListener(this);
        findPreference("gesture_double_tap").setSummary(m930a(8));
        findPreference("gesture_swipe_up").setOnPreferenceClickListener(this);
        findPreference("gesture_swipe_up").setSummary(m930a(7));
        findPreference("gesture_swipe_down").setOnPreferenceClickListener(this);
        findPreference("gesture_swipe_down").setSummary(m930a(6));
        findPreference("gesture_pinch_in").setOnPreferenceClickListener(this);
        findPreference("gesture_pinch_in").setSummary(m930a(0));
        findPreference("gesture_pinch_out").setOnPreferenceClickListener(this);
        findPreference("gesture_pinch_out").setSummary(m930a(1));
        findPreference("gesture_two_up").setOnPreferenceClickListener(this);
        findPreference("gesture_two_up").setSummary(m930a(2));
        findPreference("gesture_two_down").setOnPreferenceClickListener(this);
        findPreference("gesture_two_down").setSummary(m930a(3));
        findPreference("gesture_two_left").setOnPreferenceClickListener(this);
        findPreference("gesture_two_left").setSummary(m930a(4));
        findPreference("gesture_two_right").setOnPreferenceClickListener(this);
        findPreference("gesture_two_right").setSummary(m930a(5));
    }

    /* renamed from: a */
    private String m930a(int i) {
        String str = this.f13078b.get(Integer.valueOf(i));
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    private void m925b() {
        findPreference("back_key_action").setOnPreferenceClickListener(this);
        findPreference("back_key_action").setSummary(m930a(100));
        findPreference("home_key_action").setOnPreferenceClickListener(this);
        findPreference("home_key_action").setSummary(m930a(101));
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    public void onDestroy() {
        try {
            System.exit(0);
        } catch (Exception e) {
        }
        super.onDestroy();
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(Preference preference) {
        if ("back_key_action".equals(preference.getKey())) {
            new C3390c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.1
                @Override // com.tsf.shell.manager.action.C3390c
                /* renamed from: a */
                public void mo924a(C3390c.C3391a c3391a) {
                    super.mo924a(c3391a);
                    SettingGesturePreferenceActivity.this.findPreference("back_key_action").setSummary(c3391a.f11205a);
                    SettingGesturePreferenceActivity.this.m929a(100, c3391a);
                }
            };
            return true;
        } else if ("home_key_action".equals(preference.getKey())) {
            new C3390c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.5
                @Override // com.tsf.shell.manager.action.C3390c
                /* renamed from: a */
                public void mo924a(C3390c.C3391a c3391a) {
                    super.mo924a(c3391a);
                    SettingGesturePreferenceActivity.this.findPreference("home_key_action").setSummary(c3391a.f11205a);
                    SettingGesturePreferenceActivity.this.m929a(101, c3391a);
                }
            };
            return true;
        } else if ("gesture_double_tap".equals(preference.getKey())) {
            new C3390c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.6
                @Override // com.tsf.shell.manager.action.C3390c
                /* renamed from: a */
                public void mo924a(C3390c.C3391a c3391a) {
                    super.mo924a(c3391a);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_double_tap").setSummary(c3391a.f11205a);
                    SettingGesturePreferenceActivity.this.m929a(8, c3391a);
                }
            };
            return true;
        } else if ("gesture_swipe_up".equals(preference.getKey())) {
            new C3390c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.7
                @Override // com.tsf.shell.manager.action.C3390c
                /* renamed from: a */
                public void mo924a(C3390c.C3391a c3391a) {
                    super.mo924a(c3391a);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_swipe_up").setSummary(c3391a.f11205a);
                    SettingGesturePreferenceActivity.this.m929a(7, c3391a);
                }
            };
            return true;
        } else if ("gesture_swipe_down".equals(preference.getKey())) {
            new C3390c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.8
                @Override // com.tsf.shell.manager.action.C3390c
                /* renamed from: a */
                public void mo924a(C3390c.C3391a c3391a) {
                    super.mo924a(c3391a);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_swipe_down").setSummary(c3391a.f11205a);
                    SettingGesturePreferenceActivity.this.m929a(6, c3391a);
                }
            };
            return true;
        } else if ("gesture_pinch_in".equals(preference.getKey())) {
            new C3390c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.9
                @Override // com.tsf.shell.manager.action.C3390c
                /* renamed from: a */
                public void mo924a(C3390c.C3391a c3391a) {
                    super.mo924a(c3391a);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_pinch_in").setSummary(c3391a.f11205a);
                    SettingGesturePreferenceActivity.this.m929a(0, c3391a);
                }
            };
            return true;
        } else if ("gesture_pinch_out".equals(preference.getKey())) {
            new C3390c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.10
                @Override // com.tsf.shell.manager.action.C3390c
                /* renamed from: a */
                public void mo924a(C3390c.C3391a c3391a) {
                    super.mo924a(c3391a);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_pinch_out").setSummary(c3391a.f11205a);
                    SettingGesturePreferenceActivity.this.m929a(1, c3391a);
                }
            };
            return true;
        } else if ("gesture_two_up".equals(preference.getKey())) {
            new C3390c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.11
                @Override // com.tsf.shell.manager.action.C3390c
                /* renamed from: a */
                public void mo924a(C3390c.C3391a c3391a) {
                    super.mo924a(c3391a);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_two_up").setSummary(c3391a.f11205a);
                    SettingGesturePreferenceActivity.this.m929a(2, c3391a);
                }
            };
            return true;
        } else if ("gesture_two_down".equals(preference.getKey())) {
            new C3390c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.12
                @Override // com.tsf.shell.manager.action.C3390c
                /* renamed from: a */
                public void mo924a(C3390c.C3391a c3391a) {
                    super.mo924a(c3391a);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_two_down").setSummary(c3391a.f11205a);
                    SettingGesturePreferenceActivity.this.m929a(3, c3391a);
                }
            };
            return true;
        } else if ("gesture_two_left".equals(preference.getKey())) {
            new C3390c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.2
                @Override // com.tsf.shell.manager.action.C3390c
                /* renamed from: a */
                public void mo924a(C3390c.C3391a c3391a) {
                    super.mo924a(c3391a);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_two_left").setSummary(c3391a.f11205a);
                    SettingGesturePreferenceActivity.this.m929a(4, c3391a);
                }
            };
            return true;
        } else if ("gesture_two_right".equals(preference.getKey())) {
            new C3390c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.3
                @Override // com.tsf.shell.manager.action.C3390c
                /* renamed from: a */
                public void mo924a(C3390c.C3391a c3391a) {
                    super.mo924a(c3391a);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_two_right").setSummary(c3391a.f11205a);
                    SettingGesturePreferenceActivity.this.m929a(5, c3391a);
                }
            };
            return true;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m929a(int i, C3390c.C3391a c3391a) {
        Intent intent = new Intent("com.tsf.shell.SET_ACTION");
        intent.putExtra("gesture_action", i);
        intent.putExtra("gesture_name", c3391a.f11205a);
        intent.putExtra("gesture_url", c3391a.f11206b);
        sendBroadcast(intent);
    }

    @Override // com.tsf.shell.InterfaceC2185a
    /* renamed from: a */
    public int mo927a(Intent intent, C0913a.InterfaceC0914a interfaceC0914a) {
        int i = this.f13079c;
        this.f13077a.put(Integer.valueOf(this.f13079c), interfaceC0914a);
        m928a(intent, this.f13079c);
        overridePendingTransition(C1306b.C1307a.app_enter, C1306b.C1307a.app_exit);
        this.f13079c++;
        return i;
    }

    /* renamed from: a */
    public void m928a(Intent intent, int i) {
        try {
            startActivityForResult(intent, i);
        } catch (Exception e) {
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(Home.m6177b(), C1306b.C1315i.activity_not_found, 0).show();
                }
            });
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.f13077a.containsKey(Integer.valueOf(i))) {
            this.f13077a.get(Integer.valueOf(i)).onActivityResult(i, i2, intent);
            this.f13077a.remove(Integer.valueOf(i));
        }
    }
}
