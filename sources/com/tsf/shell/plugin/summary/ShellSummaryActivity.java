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
import com.tsf.shell.plugin.summary.C3826c;
import java.util.Locale;
/* loaded from: classes.dex */
public class ShellSummaryActivity extends Activity implements MediaPlayer.OnPreparedListener, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private AbsoluteLayout f12558a;

    /* renamed from: b */
    private VideoView f12559b;

    /* renamed from: c */
    private float f12560c = 0.0f;

    /* renamed from: d */
    private float f12561d = 0.0f;

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
        setContentView(C3826c.C3829c.activity_main_shell_summary);
        try {
            int m1358a = m1358a();
            if (m1358a != 0 && m1357a(this)) {
                findViewById(C3826c.C3828b.content).setPadding(0, 0, 0, m1358a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Locale.getDefault().getLanguage().equals("zh")) {
            ((ImageView) findViewById(C3826c.C3828b.imageView4)).setImageResource(C3826c.C3827a.launcher_text_summary_cn);
        }
        TextView textView = (TextView) findViewById(C3826c.C3828b.tv_terms);
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(C3826c.C3828b.tv_private_policy);
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        textView2.setOnClickListener(this);
        findViewById(C3826c.C3828b.relativeLayout1).setOnClickListener(this);
        findViewById(C3826c.C3828b.linearlayer1).setOnClickListener(this);
        findViewById(C3826c.C3828b.framelayout1).setOnClickListener(this);
        this.f12558a = (AbsoluteLayout) findViewById(C3826c.C3828b.AbsoluteLayout1);
        this.f12558a.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f12559b = (VideoView) findViewById(C3826c.C3828b.videoView1);
        try {
            Uri parse = Uri.parse("android.resource://" + getPackageName() + "/raw/preview_color_hd");
            if (getContentResolver().openAssetFileDescriptor(parse, "r") != null) {
                this.f12559b.setVideoURI(parse);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f12559b.setOnPreparedListener(this);
        this.f12559b.setZOrderOnTop(false);
        this.f12559b.start();
        ImageView imageView = (ImageView) findViewById(C3826c.C3828b.imageView2);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        imageView.setAnimation(rotateAnimation);
        rotateAnimation.startNow();
    }

    /* renamed from: a */
    private int m1358a() {
        Resources resources = getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m1357a(Context context) {
        return (ViewConfiguration.get(context).hasPermanentMenuKey() || KeyCharacterMap.deviceHasKey(4)) ? false : true;
    }

    /* renamed from: b */
    private void m1355b() {
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
        m1355b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        float width = this.f12558a.getWidth();
        float height = this.f12558a.getHeight();
        float max = Math.max(width / 360.0f, height / 640.0f);
        C3825b.m1350a("", "viewW:" + width + "   viewH:" + height);
        if (this.f12560c != width || this.f12561d != height) {
            this.f12560c = width;
            this.f12561d = height;
            int i = (int) (360.0f * max);
            int i2 = (int) (640.0f * max);
            this.f12559b.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, -((int) ((i - width) / 2.0f)), -((int) ((i2 - height) / 2.0f))));
            findViewById(C3826c.C3828b.framelayout1).setLayoutParams(new AbsoluteLayout.LayoutParams((int) width, (int) height, 0, 0));
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        C3825b.m1351a("onPreparedonPreparedonPreparedonPreparedonPrepared");
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C3826c.C3828b.tv_terms) {
            m1356a("启动页点击， 服务条款");
            Intent intent = new Intent();
            intent.putExtra("is_full_screen", true);
            intent.putExtra("title", getResources().getString(C3826c.C3830d.text_terms_service));
            intent.putExtra("url", "http://www.cmcm.com/protocol/site/tos.html");
            intent.setComponent(new ComponentName(getPackageName(), "com.tsf.shell.preference.SettingAboutWebView"));
            startActivity(intent);
        } else if (view.getId() == C3826c.C3828b.tv_private_policy) {
            m1356a("启动页点击， 隐私按钮");
            Intent intent2 = new Intent();
            intent2.putExtra("is_full_screen", true);
            intent2.putExtra("title", getResources().getString(C3826c.C3830d.text_private_policy));
            intent2.putExtra("url", "http://www.cmcm.com/protocol/site/privacy.html");
            intent2.setComponent(new ComponentName(getPackageName(), "com.tsf.shell.preference.SettingAboutWebView"));
            startActivity(intent2);
        } else {
            m1356a("启动页点击， 开始跳转到主界面");
            sendBroadcast(new Intent("com.tsf.shell.StartHome"));
            m1355b();
        }
    }

    /* renamed from: a */
    private void m1356a(String str) {
        if (C3824a.f12567a.booleanValue()) {
            Log.v("TSF", str);
        }
    }
}
