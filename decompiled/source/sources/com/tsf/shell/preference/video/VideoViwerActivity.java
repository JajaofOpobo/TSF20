package com.tsf.shell.preference.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.b;
import com.tsf.shell.manager.b.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class VideoViwerActivity extends Activity {
    public static String a = "V2.0";
    private GridView b;
    private Context c;
    private List<b> d;

    public static void a(Context context) {
        try {
            e.a(a);
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
        setContentView(b.g.video_layout);
        a();
        this.b = (GridView) findViewById(b.e.myGrid);
        this.b.setAdapter((ListAdapter) new a());
        this.b.setSelector(new ColorDrawable(0));
    }

    private void a() {
        InputStream inputStream;
        InputStream inputStream2 = null;
        this.d = new ArrayList();
        b bVar = new b();
        bVar.c = "V3.0";
        bVar.b = "video/TSFSHELL30.jpg";
        bVar.d = "http://v.youku.com/v_show/id_XODU2OTYxOTE2.html";
        bVar.e = "http://youtu.be/0HhGk-FJe-I";
        this.d.add(bVar);
        b bVar2 = new b();
        bVar2.c = "V2.0";
        bVar2.b = "video/TSFSHELL.jpg";
        bVar2.d = "http://v.youku.com/v_show/id_XNjQ3MTM0NTcy.html";
        bVar2.e = "http://youtu.be/-07hcHuTT6s";
        this.d.add(bVar2);
        b bVar3 = new b();
        bVar3.c = "V2.0";
        bVar3.b = "video/TSFSHELL20.jpg";
        bVar3.d = "http://v.youku.com/v_show/id_XNjQ3MTk5MjYw.html";
        bVar3.e = "http://youtu.be/vemTo705Vig";
        this.d.add(bVar3);
        Bitmap bitmap = null;
        for (int i = 0; i < this.d.size(); i++) {
            b bVar4 = this.d.get(i);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        public Bitmap a;
        public String b;
        public String c;
        public String d;
        public String e;

        private b() {
            this.a = null;
            this.b = "video/default.jpg";
            this.c = "demo";
            this.d = "http://v.youku.com/v_show/id_XNTQ2MjMxNjg4.html";
            this.e = "http://www.youtube.com/watch?v=m4pnrB0ELcE";
        }
    }

    /* loaded from: classes.dex */
    private class a extends BaseAdapter {
        public a() {
        }

        @Override // android.widget.Adapter
        public View getView(final int i, View view, ViewGroup viewGroup) {
            ViewGroup viewGroup2;
            if (view == null) {
                ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(VideoViwerActivity.this.c).inflate(b.g.video_item_layout, (ViewGroup) null);
                viewGroup3.setLayoutParams(new AbsListView.LayoutParams(250, (int) VEasing.Back.easeIn));
                final ImageView imageView = (ImageView) viewGroup3.findViewById(b.e.imageView1);
                viewGroup3.setOnTouchListener(new View.OnTouchListener() { // from class: com.tsf.shell.preference.video.VideoViwerActivity.a.1
                    b a;

                    {
                        this.a = (b) VideoViwerActivity.this.d.get(i);
                    }

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (motionEvent.getAction()) {
                            case 0:
                                imageView.getDrawable().setAlpha(ItemInfo.APP_INTENT);
                                return true;
                            case 1:
                                imageView.getDrawable().setAlpha(255);
                                VideoOptionDialogActivity.a(VideoViwerActivity.this, this.a.e, this.a.d);
                                return true;
                            case 2:
                            default:
                                return true;
                            case 3:
                                imageView.getDrawable().setAlpha(255);
                                return true;
                        }
                    }
                });
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = (ViewGroup) view;
            }
            b bVar = (b) VideoViwerActivity.this.d.get(i);
            ImageView imageView2 = (ImageView) viewGroup2.findViewById(b.e.imageView1);
            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView2.setImageBitmap(bVar.a);
            ((TextView) viewGroup2.findViewById(b.e.textView1)).setText(bVar.c);
            return viewGroup2;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return VideoViwerActivity.this.d.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return VideoViwerActivity.this.d.get(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
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
