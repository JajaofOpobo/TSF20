package com.tsf.shell.plugin.summary;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.plugin.summary.c;
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
        setContentView(c.C0153c.activity_main_shell_summary);
        try {
            int a = a();
            if (a != 0 && a(this)) {
                findViewById(c.b.content).setPadding(0, 0, 0, a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Locale.getDefault().getLanguage().equals("zh")) {
            ((ImageView) findViewById(c.b.imageView4)).setImageResource(c.a.launcher_text_summary_cn);
        }
        TextView textView = (TextView) findViewById(c.b.tv_terms);
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(c.b.tv_private_policy);
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        textView2.setOnClickListener(this);
        findViewById(c.b.relativeLayout1).setOnClickListener(this);
        findViewById(c.b.linearlayer1).setOnClickListener(this);
        findViewById(c.b.framelayout1).setOnClickListener(this);
        this.a = (AbsoluteLayout) findViewById(c.b.AbsoluteLayout1);
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.b = (VideoView) findViewById(c.b.videoView1);
        try {
            Uri parse = Uri.parse("android.resource://" + getPackageName() + "/raw/preview_color_hd");
            if (getContentResolver().openAssetFileDescriptor(parse, "r") != null) {
                this.b.setVideoURI(parse);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.b.setOnPreparedListener(this);
        this.b.setZOrderOnTop(false);
        this.b.start();
        ImageView imageView = (ImageView) findViewById(c.b.imageView2);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        imageView.setAnimation(rotateAnimation);
        rotateAnimation.startNow();
    }

    private int a() {
        Resources resources = getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @SuppressLint({"NewApi"})
    public static boolean a(Context context) {
        return (ViewConfiguration.get(context).hasPermanentMenuKey() || KeyCharacterMap.deviceHasKey(4)) ? false : true;
    }

    private void b() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.putExtra("ShellSummaryShowed", true);
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(320864256);
        intent.setPackage(getPackageName());
        startActivity(intent);
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        float width = this.a.getWidth();
        float height = this.a.getHeight();
        float max = Math.max(width / 360.0f, height / 640.0f);
        b.a("", "viewW:" + width + "   viewH:" + height);
        if (this.c != width || this.d != height) {
            this.c = width;
            this.d = height;
            int i = (int) (360.0f * max);
            int i2 = (int) (640.0f * max);
            this.b.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, -((int) ((i - width) / 2.0f)), -((int) ((i2 - height) / 2.0f))));
            findViewById(c.b.framelayout1).setLayoutParams(new AbsoluteLayout.LayoutParams((int) width, (int) height, 0, 0));
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        b.a("onPreparedonPreparedonPreparedonPreparedonPrepared");
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == c.b.tv_terms) {
            a("启动页点击， 服务条款");
            Intent intent = new Intent();
            intent.putExtra("is_full_screen", true);
            intent.putExtra("title", getResources().getString(c.d.text_terms_service));
            intent.putExtra("url", "http://www.cmcm.com/protocol/site/tos.html");
            intent.setComponent(new ComponentName(getPackageName(), "com.tsf.shell.preference.SettingAboutWebView"));
            startActivity(intent);
        } else if (view.getId() == c.b.tv_private_policy) {
            a("启动页点击， 隐私按钮");
            Intent intent2 = new Intent();
            intent2.putExtra("is_full_screen", true);
            intent2.putExtra("title", getResources().getString(c.d.text_private_policy));
            intent2.putExtra("url", "http://www.cmcm.com/protocol/site/privacy.html");
            intent2.setComponent(new ComponentName(getPackageName(), "com.tsf.shell.preference.SettingAboutWebView"));
            startActivity(intent2);
        } else {
            a("启动页点击， 开始跳转到主界面");
            sendBroadcast(new Intent("com.tsf.shell.StartHome"));
            b();
        }
    }

    private void a(String str) {
        if (a.a.booleanValue()) {
            Log.v("TSF", str);
        }
    }
}
