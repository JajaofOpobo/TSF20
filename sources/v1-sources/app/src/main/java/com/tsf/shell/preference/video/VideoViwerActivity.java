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
import com.tsf.shell.a.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class VideoViwerActivity extends Activity {
    public static String a = "V1.9.9.5";
    private GridView b;
    private Context c;
    private List d;

    public static void a(Context context) {
        try {
            t.a(a);
        } catch (Exception e) {
        }
        try {
            Intent intent = new Intent();
            intent.setClass(com.censivn.C3DEngine.a.c(), VideoViwerActivity.class);
            context.startActivity(intent);
        } catch (Exception e2) {
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        super.onCreate(bundle);
        this.c = getApplicationContext();
        setContentView(R.layout.video_layout);
        this.d = new ArrayList();
        c cVar = new c(this, (byte) 0);
        cVar.c = "V1.9.9.6";
        cVar.b = "video/TSFSHELL1996.jpg";
        cVar.d = "http://v.youku.com/v_show/id_XNTkyNTIxMTIw.html";
        cVar.e = "http://youtu.be/dINMCllFzRQ";
        this.d.add(cVar);
        c cVar2 = new c(this, (byte) 0);
        cVar2.c = "V1.9.9.5";
        cVar2.b = "video/TSFSHELL1995.jpg";
        cVar2.d = "http://v.youku.com/v_show/id_XNTY5MjM4NzQw.html";
        cVar2.e = "http://youtu.be/LSBEKzy4B28";
        this.d.add(cVar2);
        c cVar3 = new c(this, (byte) 0);
        cVar3.c = "V1.9.9.3";
        cVar3.b = "video/TSFSHELL1993.jpg";
        cVar3.d = "http://v.youku.com/v_show/id_XNTQ2MjMxNjg4.html";
        cVar3.e = "http://youtu.be/m4pnrB0ELcE";
        this.d.add(cVar3);
        c cVar4 = new c(this, (byte) 0);
        cVar4.c = "V1.7.0";
        cVar4.b = "video/TSFSHELL170.jpg";
        cVar4.d = "http://v.youku.com/v_show/id_XNDUwODE2MzI0.html";
        cVar4.e = "http://youtu.be/ia0uaql99Kc";
        this.d.add(cVar4);
        c cVar5 = new c(this, (byte) 0);
        cVar5.c = "V1.6.0";
        cVar5.b = "video/TSFSHELL160.jpg";
        cVar5.d = "http://v.youku.com/v_show/id_XNDM5MjI4MTYw.html";
        cVar5.e = "http://youtu.be/v4m-xXYmTbU";
        this.d.add(cVar5);
        c cVar6 = new c(this, (byte) 0);
        cVar6.c = "V1.5.0";
        cVar6.b = "video/TSFSHELL150.jpg";
        cVar6.d = "http://v.youku.com/v_show/id_XNDExODk1MDM2.html";
        cVar6.e = "http://youtu.be/H-Q4wJ3G0ZM";
        this.d.add(cVar6);
        c cVar7 = new c(this, (byte) 0);
        cVar7.c = "V1.4.2";
        cVar7.b = "video/TSFSHELL142.jpg";
        cVar7.d = "http://v.youku.com/v_show/id_XMzg4MTM3NzI0.html";
        cVar7.e = "http://youtu.be/iLPetqljKZ0";
        this.d.add(cVar7);
        c cVar8 = new c(this, (byte) 0);
        cVar8.c = "V1.4.0";
        cVar8.b = "video/TSFSHELL140.jpg";
        cVar8.d = "http://v.youku.com/v_show/id_XMzc1NDk3NjQ4.html";
        cVar8.e = "http://www.youtube.com/watch?v=3jiJgizx6l0";
        this.d.add(cVar8);
        Bitmap bitmap = null;
        for (int i = 0; i < this.d.size(); i++) {
            c cVar9 = (c) this.d.get(i);
            try {
                inputStream = getAssets().open(cVar9.b);
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
                        cVar9.a = bitmap.copy(Bitmap.Config.ARGB_8888, false);
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
            cVar9.a = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        }
        this.b = (GridView) findViewById(R.id.myGrid);
        this.b.setAdapter((ListAdapter) new a(this));
        this.b.setSelector(new ColorDrawable(0));
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
