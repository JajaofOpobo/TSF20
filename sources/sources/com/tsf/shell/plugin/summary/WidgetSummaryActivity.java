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
import com.tsf.shell.plugin.summary.c;
import java.util.Locale;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetSummaryActivity extends Activity implements MediaPlayer.OnPreparedListener, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static String a = "title";
    private AbsoluteLayout b;
    private VideoView c;
    private float d = 0.0f;
    private float e = 0.0f;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        String string;
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
            string = getIntent().getExtras().getString(a);
        } catch (Exception e) {
            string = null;
        }
        if (string == null && a(this)) {
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
        setContentView(c.C0153c.activity_main_widget_summary);
        if (string != null) {
            ((TextView) findViewById(c.b.textView1)).setText(string);
        }
        if (Locale.getDefault().getLanguage().equals("zh")) {
            ((ImageView) findViewById(c.b.imageView3)).setImageResource(c.a.launcher_text_summary_cn);
        }
        this.b = (AbsoluteLayout) findViewById(c.b.AbsoluteLayout1);
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.c = (VideoView) findViewById(c.b.videoView1);
        this.c.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/raw/preview_color_hd"));
        this.c.setOnPreparedListener(this);
        this.c.setZOrderOnTop(false);
        this.c.start();
        findViewById(c.b.imageView1).setOnClickListener(this);
        findViewById(c.b.imageView2).setOnClickListener(this);
        findViewById(c.b.imageView3).setOnClickListener(this);
        findViewById(c.b.imageView4).setOnClickListener(this);
        findViewById(c.b.imageView5).setOnClickListener(this);
    }

    private boolean a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.tsf.shell", 64);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        float width = this.b.getWidth();
        float height = this.b.getHeight();
        float fMax = Math.max(width / 358.0f, height / 638.0f);
        b.a("", "viewW:" + width + "   viewH:" + height);
        if (this.d != width || this.e != height) {
            this.d = width;
            this.e = height;
            int i = (int) (358.0f * fMax);
            int i2 = (int) (638.0f * fMax);
            this.c.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, -((int) ((i - width) / 2.0f)), -((int) ((i2 - height) / 2.0f))));
            findViewById(c.b.framelayout1).setLayoutParams(new AbsoluteLayout.LayoutParams((int) width, (int) height, 0, 0));
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
        if (id == c.b.imageView1) {
            b();
            return;
        }
        if (id == c.b.imageView2) {
            b();
            return;
        }
        if (id == c.b.imageView3) {
            b();
        } else if (id == c.b.imageView4) {
            b();
        } else if (id == c.b.imageView5) {
            a();
        }
    }

    private void a() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.facebook.com/tsfapp")));
    }

    private void b() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.tsf.shell")));
    }
}
