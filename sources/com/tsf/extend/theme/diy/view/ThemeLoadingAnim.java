package com.tsf.extend.theme.diy.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.extend.C1536f;
/* loaded from: classes.dex */
public class ThemeLoadingAnim extends LinearLayout {

    /* renamed from: a */
    private Context f5892a;

    /* renamed from: b */
    private ImageView f5893b;

    /* renamed from: c */
    private TextView f5894c;

    /* renamed from: d */
    private TextView f5895d;

    /* renamed from: e */
    private String f5896e;

    /* renamed from: f */
    private Handler f5897f;

    public ThemeLoadingAnim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5896e = null;
        this.f5897f = new Handler() { // from class: com.tsf.extend.theme.diy.view.ThemeLoadingAnim.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        int i = message.arg1 % 3;
                        StringBuilder sb = new StringBuilder();
                        sb.append(".");
                        for (int i2 = 0; i2 < i; i2++) {
                            sb.append(".");
                        }
                        ThemeLoadingAnim.this.f5895d.setText(sb);
                        if (ThemeLoadingAnim.this.f5897f != null) {
                            ThemeLoadingAnim.this.f5897f.sendMessageDelayed(ThemeLoadingAnim.this.f5897f.obtainMessage(1, message.arg1 + 1, 0), 300L);
                            break;
                        }
                        break;
                }
                super.handleMessage(message);
            }
        };
        setOrientation(1);
        setGravity(17);
        this.f5892a = context.getApplicationContext();
        m7362b();
    }

    /* renamed from: b */
    private void m7362b() {
        inflate(this.f5892a, C1536f.C1542f.common_loading_anim, this);
        this.f5893b = (ImageView) findViewById(C1536f.C1541e.loading_icon);
        this.f5894c = (TextView) findViewById(C1536f.C1541e.loading_text);
        this.f5895d = (TextView) findViewById(C1536f.C1541e.loading_symbol);
        if (this.f5896e == null) {
            this.f5894c.setText(C1536f.C1543g.theme_diy_generating);
        } else {
            this.f5894c.setText(this.f5896e);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.f5893b.startAnimation(AnimationUtils.loadAnimation(this.f5892a, C1536f.C1537a.data_loading_rotate));
            if (this.f5897f != null) {
                this.f5897f.sendMessage(this.f5897f.obtainMessage(1, 0, 0));
                return;
            }
            return;
        }
        this.f5893b.clearAnimation();
        if (this.f5897f != null) {
            this.f5897f.removeMessages(1);
        }
    }

    public void setText(int i) {
        this.f5894c.setText(i);
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f5894c.setVisibility(8);
            this.f5895d.setVisibility(8);
            return;
        }
        this.f5894c.setVisibility(0);
        this.f5895d.setVisibility(0);
        this.f5894c.setText(str);
    }

    /* renamed from: a */
    public void m7364a() {
        if (this.f5897f != null) {
            this.f5897f.removeCallbacksAndMessages(null);
            this.f5897f = null;
        }
    }

    public void setTextColor(int i) {
        this.f5894c.setTextColor(i);
    }

    public void setLoadingIconTint(int i) {
        this.f5893b.setColorFilter(i);
    }
}
