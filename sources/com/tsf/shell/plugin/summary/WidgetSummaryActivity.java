package com.tsf.shell.plugin.summary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.plugin.summary.C3826c;
import java.util.Locale;
/* loaded from: classes.dex */
public class WidgetSummaryActivity extends Activity implements MediaPlayer.OnPreparedListener, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public static String f12562a = "title";

    /* renamed from: b */
    private AbsoluteLayout f12563b;

    /* renamed from: c */
    private VideoView f12564c;

    /* renamed from: d */
    private float f12565d = 0.0f;

    /* renamed from: e */
    private float f12566e = 0.0f;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 19) {
            window.addFlags(134217728);
            window.addFlags(67108864);
        } else {
            window.addFlags(ItemInfo.APP_VERSION_NAME);
        }
        try {
            str = getIntent().getExtras().getString(f12562a);
        } catch (Exception e) {
            str = null;
        }
        if (str == null && m1353a(this)) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(320864256);
            intent.setPackage("com.tsf.shell");
            startActivity(intent);
            finish();
            return;
        }
        setRequestedOrientation(1);
        setContentView(C3826c.C3829c.activity_main_widget_summary);
        if (str != null) {
            ((TextView) findViewById(C3826c.C3828b.textView1)).setText(str);
        }
        if (Locale.getDefault().getLanguage().equals("zh")) {
            ((ImageView) findViewById(C3826c.C3828b.imageView3)).setImageResource(C3826c.C3827a.launcher_text_summary_cn);
        }
        this.f12563b = (AbsoluteLayout) findViewById(C3826c.C3828b.AbsoluteLayout1);
        this.f12563b.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f12564c = (VideoView) findViewById(C3826c.C3828b.videoView1);
        this.f12564c.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/raw/preview_color_hd"));
        this.f12564c.setOnPreparedListener(this);
        this.f12564c.setZOrderOnTop(false);
        this.f12564c.start();
        findViewById(C3826c.C3828b.imageView1).setOnClickListener(this);
        findViewById(C3826c.C3828b.imageView2).setOnClickListener(this);
        findViewById(C3826c.C3828b.imageView3).setOnClickListener(this);
        findViewById(C3826c.C3828b.imageView4).setOnClickListener(this);
        findViewById(C3826c.C3828b.imageView5).setOnClickListener(this);
    }

    /* renamed from: a */
    private boolean m1353a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.tsf.shell", 64);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        float width = this.f12563b.getWidth();
        float height = this.f12563b.getHeight();
        float max = Math.max(width / 358.0f, height / 638.0f);
        C3825b.m1350a("", "viewW:" + width + "   viewH:" + height);
        if (this.f12565d != width || this.f12566e != height) {
            this.f12565d = width;
            this.f12566e = height;
            int i = (int) (358.0f * max);
            int i2 = (int) (638.0f * max);
            this.f12564c.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, -((int) ((i - width) / 2.0f)), -((int) ((i2 - height) / 2.0f))));
            findViewById(C3826c.C3828b.framelayout1).setLayoutParams(new AbsoluteLayout.LayoutParams((int) width, (int) height, 0, 0));
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C3826c.C3828b.imageView1) {
            m1352b();
        } else if (id == C3826c.C3828b.imageView2) {
            m1352b();
        } else if (id == C3826c.C3828b.imageView3) {
            m1352b();
        } else if (id == C3826c.C3828b.imageView4) {
            m1352b();
        } else if (id == C3826c.C3828b.imageView5) {
            m1354a();
        }
    }

    /* renamed from: a */
    private void m1354a() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.facebook.com/tsfapp")));
    }

    /* renamed from: b */
    private void m1352b() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.tsf.shell")));
    }
}
