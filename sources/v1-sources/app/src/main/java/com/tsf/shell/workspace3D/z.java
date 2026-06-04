package com.tsf.shell.workspace3D;

import android.R;
import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class z {
    private static Paint b;
    private static Paint c;
    private static Bitmap d;
    private static int e;
    private static AlertDialog f;
    private static boolean g = false;
    public static boolean a = false;

    public static boolean a() {
        if (!a) {
            return true;
        }
        aa aaVar = new aa();
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(aaVar);
        return false;
    }

    public static void b() {
        g = true;
    }

    public static void c() {
        if (g) {
            g = false;
        } else if (com.tsf.shell.a.t.f() && com.tsf.shell.a.t.e()) {
            a = true;
        }
    }

    public static void d() {
        if (!com.tsf.shell.a.t.f()) {
            com.tsf.shell.a.t.a((Boolean) false);
        }
        a = false;
    }

    static /* synthetic */ void i() {
        if (f == null) {
            e = com.censivn.C3DEngine.a.c().getResources().getColor(R.color.tertiary_text_light);
            Paint paint = new Paint();
            c = paint;
            paint.setColor(e);
            c.setAntiAlias(true);
            c.setStyle(Paint.Style.STROKE);
            c.setStrokeWidth(10.0f);
            Paint paint2 = new Paint();
            b = paint2;
            paint2.setColor(e);
            b.setAntiAlias(true);
            Bitmap a2 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), com.tsf.shell.R.drawable.lock_dialog_unlock_icon);
            Bitmap createBitmap = Bitmap.createBitmap(a2.getWidth(), a2.getHeight(), Bitmap.Config.ARGB_8888);
            Bitmap extractAlpha = a2.extractAlpha();
            a2.recycle();
            new Canvas(createBitmap).drawBitmap(extractAlpha, 0.0f, 0.0f, b);
            extractAlpha.recycle();
            d = createBitmap;
            AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.c());
            builder.setTitle(com.tsf.shell.R.string.notic_lock_desktop_notic);
            builder.setNegativeButton(com.censivn.C3DEngine.h.a.c(com.tsf.shell.R.string.public_action_cancel), new ab());
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(com.censivn.C3DEngine.a.c()).inflate(com.tsf.shell.R.layout.screen_lock_dialog, (ViewGroup) null);
            RelativeLayout relativeLayout = (RelativeLayout) linearLayout.findViewById(com.tsf.shell.R.id.sliding_layout);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.rightMargin = (int) (40.0f * com.censivn.C3DEngine.a.d);
            layoutParams.leftMargin = (int) (com.censivn.C3DEngine.a.d * 10.0f);
            relativeLayout.addView(new ae(com.censivn.C3DEngine.a.c()), layoutParams);
            relativeLayout.addView(new ad(com.censivn.C3DEngine.a.c()), new RelativeLayout.LayoutParams(-1, -1));
            relativeLayout.addView(new af(com.censivn.C3DEngine.a.c()), new RelativeLayout.LayoutParams(120, -1));
            ((ImageView) linearLayout.findViewById(com.tsf.shell.R.id.unlock_icon)).setImageBitmap(d);
            CheckBox checkBox = (CheckBox) linearLayout.findViewById(com.tsf.shell.R.id.checkbox);
            checkBox.setChecked(com.tsf.shell.a.t.f());
            TextView textView = (TextView) linearLayout.findViewById(com.tsf.shell.R.id.relock_notic_text);
            a(textView);
            checkBox.setOnCheckedChangeListener(new ac(textView));
            builder.setView(linearLayout);
            f = builder.create();
        }
        f.show();
    }

    public static void a(TextView textView) {
        if (com.tsf.shell.a.t.f()) {
            textView.setText(com.tsf.shell.R.string.mn_lock_relock_summary);
        } else {
            textView.setText(com.tsf.shell.R.string.mn_lock_no_relock_summary);
        }
    }
}
