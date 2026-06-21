package com.tsf.shell.plugin.summary;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.VideoView;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.util.Locale;

/* loaded from: classes.dex */
public class ShellSummaryActivity extends Activity implements MediaPlayer.OnPreparedListener, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {
    private AbsoluteLayout a;
    private VideoView b;
    private float c = 0.0f;
    private float d = 0.0f;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 19) {
            window.addFlags(134217728);
            window.addFlags(67108864);
        } else {
            window.addFlags(ItemInfo.APP_VERSION_NAME);
        }
        setRequestedOrientation(1);
        setContentView(e.activity_main_shell_summary);
        if (Locale.getDefault().getLanguage().equals("zh")) {
            ((ImageView) findViewById(d.imageView4)).setImageResource(c.launcher_text_summary_cn);
        }
        findViewById(d.relativeLayout1).setOnClickListener(this);
        findViewById(d.linearlayer1).setOnClickListener(this);
        findViewById(d.framelayout1).setOnClickListener(this);
        this.a = (AbsoluteLayout) findViewById(d.AbsoluteLayout1);
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.b = (VideoView) findViewById(d.videoView1);
        try {
            Uri parse = Uri.parse("android.resource://" + getPackageName() + "/raw/preview_color_hd");
            if (getContentResolver().openAssetFileDescriptor(parse, "r") != null) {
                this.b.setVideoURI(parse);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.b.setOnPreparedListener(this);
        this.b.setZOrderOnTop(false);
        this.b.start();
        ImageView imageView = (ImageView) findViewById(d.imageView2);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        imageView.setAnimation(rotateAnimation);
        rotateAnimation.startNow();
    }

    private void a() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(320864256);
        intent.setPackage(getPackageName());
        startActivity(intent);
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        a();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        float width = this.a.getWidth();
        float height = this.a.getHeight();
        float max = Math.max(width / 360.0f, height / 640.0f);
        a.a("", "viewW:" + width + "   viewH:" + height);
        if (this.c != width || this.d != height) {
            this.c = width;
            this.d = height;
            int i = (int) (360.0f * max);
            int i2 = (int) (640.0f * max);
            this.b.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, -((int) ((i - width) / 2.0f)), -((int) ((i2 - height) / 2.0f))));
            findViewById(d.framelayout1).setLayoutParams(new AbsoluteLayout.LayoutParams((int) width, (int) height, 0, 0));
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        a.a("onPreparedonPreparedonPreparedonPreparedonPrepared");
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == d.framelayout1) {
            finish();
        } else {
            a();
        }
    }
}
