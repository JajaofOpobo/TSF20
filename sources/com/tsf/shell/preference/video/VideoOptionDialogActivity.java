package com.tsf.shell.preference.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.C1306b;
/* loaded from: classes.dex */
public class VideoOptionDialogActivity extends Activity implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: a */
    private String f13310a;

    /* renamed from: b */
    private String f13311b;

    /* renamed from: a */
    public static void m793a(Context context, String str, String str2) {
        try {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("youku", str2);
            bundle.putString("youtube", str);
            intent.putExtras(bundle);
            intent.setClass(context, VideoOptionDialogActivity.class);
            context.startActivity(intent);
        } catch (Exception e) {
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1306b.C1313g.video_option_dialog_layout);
        try {
            Bundle extras = getIntent().getExtras();
            this.f13310a = extras.getString("youku");
            this.f13311b = extras.getString("youtube");
        } catch (Exception e) {
        }
        findViewById(C1306b.C1311e.imageView1).setOnTouchListener(this);
        findViewById(C1306b.C1311e.imageView2).setOnTouchListener(this);
        findViewById(C1306b.C1311e.f4116bg).setOnClickListener(this);
        findViewById(C1306b.C1311e.f4117dl).setOnTouchListener(null);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Uri parse;
        ImageView imageView = (ImageView) view;
        switch (motionEvent.getAction()) {
            case 0:
                imageView.getDrawable().setAlpha(ItemInfo.APP_INTENT);
                return true;
            case 1:
                imageView.getDrawable().setAlpha(255);
                if (view.getId() == C1306b.C1311e.imageView1) {
                    parse = Uri.parse(this.f13311b);
                } else {
                    parse = Uri.parse(this.f13310a);
                }
                Intent intent = new Intent("android.intent.action.VIEW", parse);
                intent.addFlags(268435456);
                startActivity(intent);
                finish();
                return true;
            case 2:
            default:
                return true;
            case 3:
                imageView.getDrawable().setAlpha(255);
                return true;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        finish();
    }
}
