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
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.C1306b;
import com.tsf.shell.manager.p168b.C3430e;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class VideoViwerActivity extends Activity {

    /* renamed from: a */
    public static String f13312a = "V2.0";

    /* renamed from: b */
    private GridView f13313b;

    /* renamed from: c */
    private Context f13314c;

    /* renamed from: d */
    private List<C4087b> f13315d;

    /* renamed from: a */
    public static void m791a(Context context) {
        try {
            C3430e.m2537a(f13312a);
        } catch (Exception e) {
        }
        try {
            Intent intent = new Intent();
            intent.setClass(C0853a.m10856d(), VideoViwerActivity.class);
            context.startActivity(intent);
        } catch (Exception e2) {
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13314c = getApplicationContext();
        setContentView(C1306b.C1313g.video_layout);
        m792a();
        this.f13313b = (GridView) findViewById(C1306b.C1311e.myGrid);
        this.f13313b.setAdapter((ListAdapter) new C4085a());
        this.f13313b.setSelector(new ColorDrawable(0));
    }

    /* renamed from: a */
    private void m792a() {
        InputStream inputStream;
        InputStream inputStream2 = null;
        this.f13315d = new ArrayList();
        C4087b c4087b = new C4087b();
        c4087b.f13323c = "V3.0";
        c4087b.f13322b = "video/TSFSHELL30.jpg";
        c4087b.f13324d = "http://v.youku.com/v_show/id_XODU2OTYxOTE2.html";
        c4087b.f13325e = "http://youtu.be/0HhGk-FJe-I";
        this.f13315d.add(c4087b);
        C4087b c4087b2 = new C4087b();
        c4087b2.f13323c = "V2.0";
        c4087b2.f13322b = "video/TSFSHELL.jpg";
        c4087b2.f13324d = "http://v.youku.com/v_show/id_XNjQ3MTM0NTcy.html";
        c4087b2.f13325e = "http://youtu.be/-07hcHuTT6s";
        this.f13315d.add(c4087b2);
        C4087b c4087b3 = new C4087b();
        c4087b3.f13323c = "V2.0";
        c4087b3.f13322b = "video/TSFSHELL20.jpg";
        c4087b3.f13324d = "http://v.youku.com/v_show/id_XNjQ3MTk5MjYw.html";
        c4087b3.f13325e = "http://youtu.be/vemTo705Vig";
        this.f13315d.add(c4087b3);
        Bitmap bitmap = null;
        for (int i = 0; i < this.f13315d.size(); i++) {
            C4087b c4087b4 = this.f13315d.get(i);
            try {
                inputStream = getAssets().open(c4087b4.f13322b);
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
                        c4087b4.f13321a = bitmap.copy(Bitmap.Config.ARGB_8888, false);
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
            c4087b4.f13321a = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.preference.video.VideoViwerActivity$b */
    /* loaded from: classes.dex */
    public class C4087b {

        /* renamed from: a */
        public Bitmap f13321a;

        /* renamed from: b */
        public String f13322b;

        /* renamed from: c */
        public String f13323c;

        /* renamed from: d */
        public String f13324d;

        /* renamed from: e */
        public String f13325e;

        private C4087b() {
            this.f13321a = null;
            this.f13322b = "video/default.jpg";
            this.f13323c = "demo";
            this.f13324d = "http://v.youku.com/v_show/id_XNTQ2MjMxNjg4.html";
            this.f13325e = "http://www.youtube.com/watch?v=m4pnrB0ELcE";
        }
    }

    /* renamed from: com.tsf.shell.preference.video.VideoViwerActivity$a */
    /* loaded from: classes.dex */
    private class C4085a extends BaseAdapter {
        public C4085a() {
        }

        @Override // android.widget.Adapter
        public View getView(final int i, View view, ViewGroup viewGroup) {
            ViewGroup viewGroup2;
            if (view == null) {
                ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(VideoViwerActivity.this.f13314c).inflate(C1306b.C1313g.video_item_layout, (ViewGroup) null);
                viewGroup3.setLayoutParams(new AbsListView.LayoutParams(250, (int) VEasing.Back.easeIn));
                final ImageView imageView = (ImageView) viewGroup3.findViewById(C1306b.C1311e.imageView1);
                viewGroup3.setOnTouchListener(new View.OnTouchListener() { // from class: com.tsf.shell.preference.video.VideoViwerActivity.a.1

                    /* renamed from: a */
                    C4087b f13317a;

                    {
                        this.f13317a = (C4087b) VideoViwerActivity.this.f13315d.get(i);
                    }

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view2, MotionEvent motionEvent) {
                        switch (motionEvent.getAction()) {
                            case 0:
                                imageView.getDrawable().setAlpha(ItemInfo.APP_INTENT);
                                return true;
                            case 1:
                                imageView.getDrawable().setAlpha(255);
                                VideoOptionDialogActivity.m793a(VideoViwerActivity.this, this.f13317a.f13325e, this.f13317a.f13324d);
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
            C4087b c4087b = (C4087b) VideoViwerActivity.this.f13315d.get(i);
            ImageView imageView2 = (ImageView) viewGroup2.findViewById(C1306b.C1311e.imageView1);
            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView2.setImageBitmap(c4087b.f13321a);
            ((TextView) viewGroup2.findViewById(C1306b.C1311e.textView1)).setText(c4087b.f13323c);
            return viewGroup2;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return VideoViwerActivity.this.f13315d.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return VideoViwerActivity.this.f13315d.get(i);
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
