package com.tsf.shell.manager.h;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tsf.shell.R;
import com.tsf.shell.k;
import com.tsf.shell.manager.b.g;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class a {
    private static Paint b;
    private static int e;
    public boolean a;
    private Paint c;
    private Bitmap d;
    private AlertDialog f;
    private boolean g = false;
    private boolean h;
    private boolean i;

    public a() {
        this.a = false;
        this.h = false;
        this.i = false;
        boolean q = g.q();
        this.i = q;
        this.a = q;
        this.h = g.r();
    }

    public boolean a() {
        if (!this.a) {
            return true;
        }
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.manager.h.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.i();
                w.a();
            }
        });
        return false;
    }

    public void b() {
        if (this.a) {
            a(true);
        } else {
            f();
        }
    }

    public void c() {
        this.g = true;
    }

    public boolean d() {
        return this.i;
    }

    public void e() {
        if (this.g) {
            this.g = false;
        } else if (this.h && this.i) {
            f();
        }
    }

    public void a(boolean z) {
        this.a = false;
        k.a(R.string.advanced_setting_screen_unlocked);
        if (z || !this.h) {
            this.i = false;
            g.a((Boolean) false);
        }
    }

    public void f() {
        this.a = true;
        g.a((Boolean) true);
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f == null) {
            e = com.censivn.C3DEngine.a.d().getResources().getColor(android.R.color.tertiary_text_light);
            this.c = new Paint();
            this.c.setColor(e);
            this.c.setAntiAlias(true);
            this.c.setStyle(Paint.Style.STROKE);
            this.c.setStrokeWidth(10.0f);
            b = new Paint();
            b.setColor(e);
            b.setAntiAlias(true);
            Bitmap a = x.a(com.censivn.C3DEngine.a.d(), R.drawable.lock_dialog_unlock_icon);
            Bitmap createBitmap = Bitmap.createBitmap(a.getWidth(), a.getHeight(), Bitmap.Config.ARGB_8888);
            Bitmap extractAlpha = a.extractAlpha();
            a.recycle();
            new Canvas(createBitmap).drawBitmap(extractAlpha, 0.0f, 0.0f, b);
            extractAlpha.recycle();
            this.d = createBitmap;
            AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
            builder.setTitle(R.string.notic_lock_desktop_notic);
            builder.setNegativeButton(x.c(R.string.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.h.a.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(com.censivn.C3DEngine.a.d()).inflate(R.layout.screen_lock_dialog, (ViewGroup) null);
            RelativeLayout relativeLayout = (RelativeLayout) linearLayout.findViewById(R.id.sliding_layout);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.rightMargin = (int) (40.0f * com.censivn.C3DEngine.b.b.a.e);
            layoutParams.leftMargin = (int) (com.censivn.C3DEngine.b.b.a.e * 10.0f);
            relativeLayout.addView(new c(com.censivn.C3DEngine.a.d()), layoutParams);
            relativeLayout.addView(new b(com.censivn.C3DEngine.a.d()), new RelativeLayout.LayoutParams(-1, -1));
            relativeLayout.addView(new d(this, com.censivn.C3DEngine.a.d()), new RelativeLayout.LayoutParams(120, -1));
            ((ImageView) linearLayout.findViewById(R.id.unlock_icon)).setImageBitmap(this.d);
            CheckBox checkBox = (CheckBox) linearLayout.findViewById(R.id.checkbox);
            checkBox.setChecked(g.r());
            final TextView textView = (TextView) linearLayout.findViewById(R.id.relock_notic_text);
            a(textView);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.tsf.shell.manager.h.a.3
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    g.d(z);
                    a.this.h = z;
                    a.this.a(textView);
                }
            });
            builder.setView(linearLayout);
            this.f = builder.create();
        }
        this.f.show();
    }

    public void a(TextView textView) {
        if (g.r()) {
            textView.setText(R.string.mn_lock_relock_summary);
        } else {
            textView.setText(R.string.mn_lock_no_relock_summary);
        }
    }
}
