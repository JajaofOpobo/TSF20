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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.CustomActivity;
import com.tsf.extend.theme.AbstractC1700aq;
import com.tsf.extend.theme.C1673ah;
import com.tsf.extend.theme.DialogC1859o;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ThemeDIYShareActivity extends CustomActivity {

    /* renamed from: d */
    private C1801a f5816d;

    /* renamed from: i */
    private String f5821i;

    /* renamed from: j */
    private String f5822j;

    /* renamed from: e */
    private JSONObject f5817e = null;

    /* renamed from: f */
    private JSONObject f5818f = null;

    /* renamed from: g */
    private JSONObject f5819g = null;

    /* renamed from: h */
    private AbstractC1700aq f5820h = null;

    /* renamed from: k */
    private DialogC1859o f5823k = null;

    /* renamed from: com.tsf.extend.theme.diy.ThemeDIYShareActivity$a */
    /* loaded from: classes.dex */
    class C1801a extends BroadcastReceiver {
        C1801a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!TextUtils.isEmpty(ThemeDIYShareActivity.this.f5821i)) {
                C1673ah.m7864a().m7845a(ThemeDIYShareActivity.this.f5821i, 2, true);
            }
            ThemeDIYShareActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m7439a();
        final View inflate = LayoutInflater.from(this).inflate(C1536f.C1542f.theme_diy_share_layout, (ViewGroup) null);
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.extend.theme.diy.ThemeDIYShareActivity.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT >= 16) {
                    inflate.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    inflate.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
        });
        setContentView(inflate);
        this.f5816d = new C1801a();
        registerReceiver(this.f5816d, new IntentFilter("cml.intent.action.DIY_SUBMIT"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onDestroy() {
        m7437b();
        unregisterReceiver(this.f5816d);
        this.f5816d = null;
        super.onDestroy();
    }

    /* renamed from: a */
    private void m7439a() {
        if (getIntent() == null || getIntent().getStringExtra("cml.intent.extra.APPLY_DATA") == null) {
            finish();
            return;
        }
        this.f5822j = getIntent().getStringExtra("launch_host");
        try {
            this.f5817e = new JSONObject(getIntent().getStringExtra("cml.intent.extra.APPLY_DATA"));
            this.f5818f = this.f5817e.getJSONObject("SHOW_SHARE_TIP");
            this.f5819g = this.f5817e.optJSONObject("upload_wallpaper_data");
            this.f5820h = AbstractC1700aq.m7760a(this.f5818f);
            if (this.f5818f == null || this.f5819g == null || this.f5820h == null) {
                finish();
            } else {
                this.f5821i = UUID.randomUUID().toString();
                C1673ah.m7864a().m7835b(this.f5821i);
                C1673ah.m7864a().m7846a(this.f5821i, 12);
            }
        } catch (JSONException e) {
            finish();
        }
    }

    /* renamed from: b */
    private void m7437b() {
        if (this.f5823k != null) {
            try {
                this.f5823k.dismiss();
            } catch (Exception e) {
            }
            this.f5823k = null;
        }
    }
}
