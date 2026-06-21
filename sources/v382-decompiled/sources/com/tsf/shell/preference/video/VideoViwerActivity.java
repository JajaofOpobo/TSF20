package com.tsf.shell.preference.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tsf.shell.R;
import com.tsf.shell.manager.b.g;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class VideoViwerActivity extends Activity {
    public static String a = "V2.0";
    private GridView b;
    private Context c;
    private List d;

    public static void a(Context context) {
        try {
            g.a(a);
        } catch (Exception e) {
        }
        try {
            Intent intent = new Intent();
            intent.setClass(com.censivn.C3DEngine.a.d(), VideoViwerActivity.class);
            context.startActivity(intent);
        } catch (Exception e2) {
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = getApplicationContext();
        setContentView(R.layout.video_layout);
        a();
        this.b = (GridView) findViewById(R.id.myGrid);
        this.b.setAdapter((ListAdapter) new a(this));
        this.b.setSelector(new ColorDrawable(0));
    }

    private void a() {
        InputStream inputStream;
        InputStream inputStream2 = null;
        this.d = new ArrayList();
        b bVar = new b(this, null);
        bVar.c = "V3.0";
        bVar.b = "video/TSFSHELL30.jpg";
        bVar.d = "http://v.youku.com/v_show/id_XODU2OTYxOTE2.html";
        bVar.e = "http://youtu.be/0HhGk-FJe-I";
        this.d.add(bVar);
        b bVar2 = new b(this, null);
        bVar2.c = "V2.0";
        bVar2.b = "video/TSFSHELL.jpg";
        bVar2.d = "http://v.youku.com/v_show/id_XNjQ3MTM0NTcy.html";
        bVar2.e = "http://youtu.be/-07hcHuTT6s";
        this.d.add(bVar2);
        b bVar3 = new b(this, null);
        bVar3.c = "V2.0";
        bVar3.b = "video/TSFSHELL20.jpg";
        bVar3.d = "http://v.youku.com/v_show/id_XNjQ3MTk5MjYw.html";
        bVar3.e = "http://youtu.be/vemTo705Vig";
        this.d.add(bVar3);
        Bitmap bitmap = null;
        for (int i = 0; i < this.d.size(); i++) {
            b bVar4 = (b) this.d.get(i);
            try {
                inputStream = getAssets().open(bVar4.b);
                try {
                    try {
                        bitmap = BitmapFactory.decodeStream(inputStream);
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        bVar4.a = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    try {
                        inputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            bVar4.a = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            System.exit(0);
        } catch (Exception e) {
        }
        super.onDestroy();
    }
}
