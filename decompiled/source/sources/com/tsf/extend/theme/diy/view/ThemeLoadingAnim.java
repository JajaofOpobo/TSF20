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
import com.tsf.extend.f;
/* loaded from: classes.dex */
public class ThemeLoadingAnim extends LinearLayout {
    private Context a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private String e;
    private Handler f;

    public ThemeLoadingAnim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = null;
        this.f = new Handler() { // from class: com.tsf.extend.theme.diy.view.ThemeLoadingAnim.1
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
                        ThemeLoadingAnim.this.d.setText(sb);
                        if (ThemeLoadingAnim.this.f != null) {
                            ThemeLoadingAnim.this.f.sendMessageDelayed(ThemeLoadingAnim.this.f.obtainMessage(1, message.arg1 + 1, 0), 300L);
                            break;
                        }
                        break;
                }
                super.handleMessage(message);
            }
        };
        setOrientation(1);
        setGravity(17);
        this.a = context.getApplicationContext();
        b();
    }

    private void b() {
        inflate(this.a, f.C0052f.common_loading_anim, this);
        this.b = (ImageView) findViewById(f.e.loading_icon);
        this.c = (TextView) findViewById(f.e.loading_text);
        this.d = (TextView) findViewById(f.e.loading_symbol);
        if (this.e == null) {
            this.c.setText(f.g.theme_diy_generating);
        } else {
            this.c.setText(this.e);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.b.startAnimation(AnimationUtils.loadAnimation(this.a, f.a.data_loading_rotate));
            if (this.f != null) {
                this.f.sendMessage(this.f.obtainMessage(1, 0, 0));
                return;
            }
            return;
        }
        this.b.clearAnimation();
        if (this.f != null) {
            this.f.removeMessages(1);
        }
    }

    public void setText(int i) {
        this.c.setText(i);
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        this.d.setVisibility(0);
        this.c.setText(str);
    }

    public void a() {
        if (this.f != null) {
            this.f.removeCallbacksAndMessages(null);
            this.f = null;
        }
    }

    public void setTextColor(int i) {
        this.c.setTextColor(i);
    }

    public void setLoadingIconTint(int i) {
        this.b.setColorFilter(i);
    }
}
