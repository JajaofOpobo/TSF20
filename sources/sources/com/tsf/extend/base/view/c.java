package com.tsf.extend.base.view;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tsf.extend.base.j.p;
import com.tsf.extend.ResourceIds;
import com.tsf.extend.BaseDialog;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends g implements DialogInterface.OnCancelListener, View.OnClickListener {
    private ImageView a;
    private ImageView b;
    private TextView c;
    private TextView f;
    private TextView g;
    private FrameLayout h;
    private View.OnClickListener i;
    private DialogInterface.OnCancelListener j;
    private int k;
    private RelativeLayout l;
    private a m;

    public interface a {
        void g();

        void h();

        void i();
    }

    public c(Context context, int i) {
        super(context);
        this.k = i;
        b();
    }

    @Override // com.tsf.extend.BaseDialog
    public void a(WindowManager.LayoutParams layoutParams) {
        layoutParams.dimAmount = 0.7f;
    }

    private void b() {
        setContentView(ResourceIds.C0052f.install_app_dialog);
        this.a = (ImageView) findViewById(ResourceIds.e.app_img);
        this.b = (ImageView) findViewById(ResourceIds.e.close_dialog);
        this.c = (TextView) findViewById(ResourceIds.e.sub_title);
        this.f = (TextView) findViewById(ResourceIds.e.content);
        this.h = (FrameLayout) findViewById(ResourceIds.e.title_layout);
        this.g = (TextView) findViewById(ResourceIds.e.ok_btn);
        this.l = (RelativeLayout) findViewById(ResourceIds.e.btn_cancel);
        this.l.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.b.setOnClickListener(this);
        super.setOnCancelListener(this);
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.j = onCancelListener;
    }

    public void a(a aVar) {
        this.m = aVar;
    }

    public void a(int i, int i2, int i3, int i4, Bitmap bitmap, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        if (bitmap != null) {
            this.a.setImageBitmap(bitmap);
        }
        if (i > 0) {
            this.c.setText(i);
        } else {
            this.c.setVisibility(8);
        }
        if (i2 > 0) {
            this.ResourceIds.setText(i2);
        } else {
            this.ResourceIds.setVisibility(8);
        }
        this.g.setText(i3);
        this.i = onClickListener;
        if (i4 > 0) {
            TextView textView = (TextView) findViewById(ResourceIds.e.cancel_btn);
            textView.setText(i4);
            textView.setVisibility(0);
            textView.setOnClickListener(onClickListener2);
        }
    }

    public void a(int i, int i2, int i3, int i4, Bitmap bitmap, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i5) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.height = -2;
        this.h.setLayoutParams(layoutParams);
        this.h.setBackgroundResource(i5);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        this.a.setLayoutParams(layoutParams2);
        this.a.setImageBitmap(bitmap);
        a(i, i2, i3, i4, null, onClickListener, onClickListener2);
    }

    @Override // com.tsf.extend.BaseDialog
    public FrameLayout.LayoutParams a() {
        return new FrameLayout.LayoutParams((int) (p.b() * d), -1);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == ResourceIds.e.ok_btn) {
            if (this.i != null) {
                this.i.onClick(view);
            }
            c();
            dismiss();
            if (this.m != null) {
                this.m.g();
                return;
            }
            return;
        }
        if (id == ResourceIds.e.close_dialog) {
            onCancel(this);
            dismiss();
            if (this.m != null) {
                this.m.h();
                return;
            }
            return;
        }
        if (id == ResourceIds.e.btn_cancel) {
            onCancel(this);
            dismiss();
            if (this.m != null) {
                this.m.h();
            }
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        e();
        if (this.j != null) {
            this.j.onCancel(dialogInterface);
        }
    }

    private void c() {
        if (this.k > 0) {
        }
    }

    private void e() {
        if (this.k > 0) {
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (this.m != null) {
            this.m.i();
        }
        super.onBackPressed();
    }
}
