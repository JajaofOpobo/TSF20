package com.tsf.extend.theme.diy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.tsf.extend.base.actstru.model.activi.CustomActivity;
import com.tsf.extend.f;
import com.tsf.extend.theme.ah;
import com.tsf.extend.theme.aq;
import com.tsf.extend.theme.o;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeDIYShareActivity extends CustomActivity {
    private a d;
    private String i;
    private String j;
    private JSONObject e = null;
    private JSONObject f = null;
    private JSONObject g = null;
    private aq h = null;
    private o k = null;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!TextUtils.isEmpty(ThemeDIYShareActivity.this.i)) {
                ah.a().a(ThemeDIYShareActivity.this.i, 2, true);
            }
            ThemeDIYShareActivity.this.finish();
        }
    }

    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
        final View viewInflate = LayoutInflater.from(this).inflate(f.C0052f.theme_diy_share_layout, (ViewGroup) null);
        viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.extend.theme.diy.ThemeDIYShareActivity.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewInflate.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    viewInflate.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
        });
        setContentView(viewInflate);
        this.d = new a();
        registerReceiver(this.d, new IntentFilter("cml.intent.action.DIY_SUBMIT"));
    }

    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    protected void onDestroy() {
        b();
        unregisterReceiver(this.d);
        this.d = null;
        super.onDestroy();
    }

    private void a() {
        if (getIntent() == null || getIntent().getStringExtra("cml.intent.extra.APPLY_DATA") == null) {
            finish();
            return;
        }
        this.j = getIntent().getStringExtra("launch_host");
        try {
            this.e = new JSONObject(getIntent().getStringExtra("cml.intent.extra.APPLY_DATA"));
            this.f = this.e.getJSONObject("SHOW_SHARE_TIP");
            this.g = this.e.optJSONObject("upload_wallpaper_data");
            this.h = aq.a(this.f);
            if (this.f == null || this.g == null || this.h == null) {
                finish();
            } else {
                this.i = UUID.randomUUID().toString();
                ah.a().b(this.i);
                ah.a().a(this.i, 12);
            }
        } catch (JSONException e) {
            finish();
        }
    }

    private void b() {
        if (this.k != null) {
            try {
                this.k.dismiss();
            } catch (Exception e) {
            }
            this.k = null;
        }
    }
}
