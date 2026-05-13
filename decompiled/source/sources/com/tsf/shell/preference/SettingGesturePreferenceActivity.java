package com.tsf.shell.preference;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.widget.Toast;
import com.censivn.C3DEngine.b.c.a;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.a;
import com.tsf.shell.manager.action.c;
import com.tsf.shell.manager.action.f;
import java.util.HashMap;
import org.acra.ACRAConstants;
/* loaded from: classes.dex */
public class SettingGesturePreferenceActivity extends PreferenceActivity implements Preference.OnPreferenceClickListener, a {
    private HashMap<Integer, String> b;
    private HashMap<Integer, a.InterfaceC0025a> a = new HashMap<>();
    private int c = ACRAConstants.DEFAULT_SOCKET_TIMEOUT;

    public static void a() {
        Intent intent = new Intent();
        intent.setClass(com.censivn.C3DEngine.a.d(), SettingGesturePreferenceActivity.class);
        int[] iArr = {8, 7, 6, 0, 1, 2, 3, 4, 5, 100, 101};
        int length = iArr.length;
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < length; i++) {
            strArr[i] = f.a(iArr[i]).b;
        }
        intent.putExtra("idList", iArr);
        intent.putExtra("stringList", strArr);
        Home.b().startActivity(intent);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(b.k.preferences_gesture);
        this.b = new HashMap<>();
        String[] stringArrayExtra = getIntent().getStringArrayExtra("stringList");
        int[] intArrayExtra = getIntent().getIntArrayExtra("idList");
        int length = intArrayExtra.length;
        for (int i = 0; i < length; i++) {
            this.b.put(Integer.valueOf(intArrayExtra[i]), stringArrayExtra[i]);
        }
        b();
        findPreference("gesture_double_tap").setOnPreferenceClickListener(this);
        findPreference("gesture_double_tap").setSummary(a(8));
        findPreference("gesture_swipe_up").setOnPreferenceClickListener(this);
        findPreference("gesture_swipe_up").setSummary(a(7));
        findPreference("gesture_swipe_down").setOnPreferenceClickListener(this);
        findPreference("gesture_swipe_down").setSummary(a(6));
        findPreference("gesture_pinch_in").setOnPreferenceClickListener(this);
        findPreference("gesture_pinch_in").setSummary(a(0));
        findPreference("gesture_pinch_out").setOnPreferenceClickListener(this);
        findPreference("gesture_pinch_out").setSummary(a(1));
        findPreference("gesture_two_up").setOnPreferenceClickListener(this);
        findPreference("gesture_two_up").setSummary(a(2));
        findPreference("gesture_two_down").setOnPreferenceClickListener(this);
        findPreference("gesture_two_down").setSummary(a(3));
        findPreference("gesture_two_left").setOnPreferenceClickListener(this);
        findPreference("gesture_two_left").setSummary(a(4));
        findPreference("gesture_two_right").setOnPreferenceClickListener(this);
        findPreference("gesture_two_right").setSummary(a(5));
    }

    private String a(int i) {
        String str = this.b.get(Integer.valueOf(i));
        if (str == null) {
            return "";
        }
        return str;
    }

    private void b() {
        findPreference("back_key_action").setOnPreferenceClickListener(this);
        findPreference("back_key_action").setSummary(a(100));
        findPreference("home_key_action").setOnPreferenceClickListener(this);
        findPreference("home_key_action").setSummary(a(101));
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
            new c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.1
                @Override // com.tsf.shell.manager.action.c
                public void a(c.a aVar) {
                    super.a(aVar);
                    SettingGesturePreferenceActivity.this.findPreference("back_key_action").setSummary(aVar.a);
                    SettingGesturePreferenceActivity.this.a(100, aVar);
                }
            };
            return true;
        } else if ("home_key_action".equals(preference.getKey())) {
            new c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.5
                @Override // com.tsf.shell.manager.action.c
                public void a(c.a aVar) {
                    super.a(aVar);
                    SettingGesturePreferenceActivity.this.findPreference("home_key_action").setSummary(aVar.a);
                    SettingGesturePreferenceActivity.this.a(101, aVar);
                }
            };
            return true;
        } else if ("gesture_double_tap".equals(preference.getKey())) {
            new c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.6
                @Override // com.tsf.shell.manager.action.c
                public void a(c.a aVar) {
                    super.a(aVar);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_double_tap").setSummary(aVar.a);
                    SettingGesturePreferenceActivity.this.a(8, aVar);
                }
            };
            return true;
        } else if ("gesture_swipe_up".equals(preference.getKey())) {
            new c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.7
                @Override // com.tsf.shell.manager.action.c
                public void a(c.a aVar) {
                    super.a(aVar);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_swipe_up").setSummary(aVar.a);
                    SettingGesturePreferenceActivity.this.a(7, aVar);
                }
            };
            return true;
        } else if ("gesture_swipe_down".equals(preference.getKey())) {
            new c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.8
                @Override // com.tsf.shell.manager.action.c
                public void a(c.a aVar) {
                    super.a(aVar);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_swipe_down").setSummary(aVar.a);
                    SettingGesturePreferenceActivity.this.a(6, aVar);
                }
            };
            return true;
        } else if ("gesture_pinch_in".equals(preference.getKey())) {
            new c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.9
                @Override // com.tsf.shell.manager.action.c
                public void a(c.a aVar) {
                    super.a(aVar);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_pinch_in").setSummary(aVar.a);
                    SettingGesturePreferenceActivity.this.a(0, aVar);
                }
            };
            return true;
        } else if ("gesture_pinch_out".equals(preference.getKey())) {
            new c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.10
                @Override // com.tsf.shell.manager.action.c
                public void a(c.a aVar) {
                    super.a(aVar);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_pinch_out").setSummary(aVar.a);
                    SettingGesturePreferenceActivity.this.a(1, aVar);
                }
            };
            return true;
        } else if ("gesture_two_up".equals(preference.getKey())) {
            new c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.11
                @Override // com.tsf.shell.manager.action.c
                public void a(c.a aVar) {
                    super.a(aVar);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_two_up").setSummary(aVar.a);
                    SettingGesturePreferenceActivity.this.a(2, aVar);
                }
            };
            return true;
        } else if ("gesture_two_down".equals(preference.getKey())) {
            new c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.12
                @Override // com.tsf.shell.manager.action.c
                public void a(c.a aVar) {
                    super.a(aVar);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_two_down").setSummary(aVar.a);
                    SettingGesturePreferenceActivity.this.a(3, aVar);
                }
            };
            return true;
        } else if ("gesture_two_left".equals(preference.getKey())) {
            new c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.2
                @Override // com.tsf.shell.manager.action.c
                public void a(c.a aVar) {
                    super.a(aVar);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_two_left").setSummary(aVar.a);
                    SettingGesturePreferenceActivity.this.a(4, aVar);
                }
            };
            return true;
        } else if ("gesture_two_right".equals(preference.getKey())) {
            new c(this, this, false) { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.3
                @Override // com.tsf.shell.manager.action.c
                public void a(c.a aVar) {
                    super.a(aVar);
                    SettingGesturePreferenceActivity.this.findPreference("gesture_two_right").setSummary(aVar.a);
                    SettingGesturePreferenceActivity.this.a(5, aVar);
                }
            };
            return true;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, c.a aVar) {
        Intent intent = new Intent("com.tsf.shell.SET_ACTION");
        intent.putExtra("gesture_action", i);
        intent.putExtra("gesture_name", aVar.a);
        intent.putExtra("gesture_url", aVar.b);
        sendBroadcast(intent);
    }

    @Override // com.tsf.shell.a
    public int a(Intent intent, a.InterfaceC0025a interfaceC0025a) {
        int i = this.c;
        this.a.put(Integer.valueOf(this.c), interfaceC0025a);
        a(intent, this.c);
        overridePendingTransition(b.a.app_enter, b.a.app_exit);
        this.c++;
        return i;
    }

    public void a(Intent intent, int i) {
        try {
            startActivityForResult(intent, i);
        } catch (Exception e) {
            com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.SettingGesturePreferenceActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(Home.b(), b.i.activity_not_found, 0).show();
                }
            });
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.a.containsKey(Integer.valueOf(i))) {
            this.a.get(Integer.valueOf(i)).onActivityResult(i, i2, intent);
            this.a.remove(Integer.valueOf(i));
        }
    }
}
