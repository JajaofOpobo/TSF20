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
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VideoOptionDialogActivity extends Activity implements View.OnClickListener, View.OnTouchListener {
    private String a;
    private String b;

    public static void a(Context context, String str, String str2) {
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
        setContentView(b.g.video_option_dialog_layout);
        try {
            Bundle extras = getIntent().getExtras();
            this.a = extras.getString("youku");
            this.b = extras.getString("youtube");
        } catch (Exception e) {
        }
        findViewById(b.e.imageView1).setOnTouchListener(this);
        findViewById(b.e.imageView2).setOnTouchListener(this);
        findViewById(b.e.bg).setOnClickListener(this);
        findViewById(b.e.dl).setOnTouchListener(null);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Uri uri;
        ImageView imageView = (ImageView) view;
        switch (motionEvent.getAction()) {
            case 0:
                imageView.getDrawable().setAlpha(ItemInfo.APP_INTENT);
                break;
            case 1:
                imageView.getDrawable().setAlpha(255);
                if (view.getId() == b.e.imageView1) {
                    uri = Uri.parse(this.b);
                } else {
                    uri = Uri.parse(this.a);
                }
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.addFlags(268435456);
                startActivity(intent);
                finish();
                break;
            case 3:
                imageView.getDrawable().setAlpha(255);
                break;
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        finish();
    }
}
