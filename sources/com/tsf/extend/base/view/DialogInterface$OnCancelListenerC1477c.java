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
import com.tsf.extend.C1536f;
import com.tsf.extend.DialogC1546g;
import com.tsf.extend.base.p080j.C1437p;
/* renamed from: com.tsf.extend.base.view.c */
/* loaded from: classes.dex */
public class DialogInterface$OnCancelListenerC1477c extends DialogC1546g implements DialogInterface.OnCancelListener, View.OnClickListener {

    /* renamed from: a */
    private ImageView f4606a;

    /* renamed from: b */
    private ImageView f4607b;

    /* renamed from: c */
    private TextView f4608c;

    /* renamed from: f */
    private TextView f4609f;

    /* renamed from: g */
    private TextView f4610g;

    /* renamed from: h */
    private FrameLayout f4611h;

    /* renamed from: i */
    private View.OnClickListener f4612i;

    /* renamed from: j */
    private DialogInterface.OnCancelListener f4613j;

    /* renamed from: k */
    private int f4614k;

    /* renamed from: l */
    private RelativeLayout f4615l;

    /* renamed from: m */
    private InterfaceC1478a f4616m;

    /* renamed from: com.tsf.extend.base.view.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1478a {
        /* renamed from: g */
        void mo6715g();

        /* renamed from: h */
        void mo6714h();

        /* renamed from: i */
        void mo6713i();
    }

    public DialogInterface$OnCancelListenerC1477c(Context context, int i) {
        super(context);
        this.f4614k = i;
        m8458b();
    }

    @Override // com.tsf.extend.DialogC1546g
    /* renamed from: a */
    public void mo6561a(WindowManager.LayoutParams layoutParams) {
        layoutParams.dimAmount = 0.7f;
    }

    /* renamed from: b */
    private void m8458b() {
        setContentView(C1536f.C1542f.install_app_dialog);
        this.f4606a = (ImageView) findViewById(C1536f.C1541e.app_img);
        this.f4607b = (ImageView) findViewById(C1536f.C1541e.close_dialog);
        this.f4608c = (TextView) findViewById(C1536f.C1541e.sub_title);
        this.f4609f = (TextView) findViewById(C1536f.C1541e.content);
        this.f4611h = (FrameLayout) findViewById(C1536f.C1541e.title_layout);
        this.f4610g = (TextView) findViewById(C1536f.C1541e.ok_btn);
        this.f4615l = (RelativeLayout) findViewById(C1536f.C1541e.btn_cancel);
        this.f4615l.setOnClickListener(this);
        this.f4610g.setOnClickListener(this);
        this.f4607b.setOnClickListener(this);
        super.setOnCancelListener(this);
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.f4613j = onCancelListener;
    }

    /* renamed from: a */
    public void m8459a(InterfaceC1478a interfaceC1478a) {
        this.f4616m = interfaceC1478a;
    }

    /* renamed from: a */
    public void m8461a(int i, int i2, int i3, int i4, Bitmap bitmap, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        if (bitmap != null) {
            this.f4606a.setImageBitmap(bitmap);
        }
        if (i > 0) {
            this.f4608c.setText(i);
        } else {
            this.f4608c.setVisibility(8);
        }
        if (i2 > 0) {
            this.f4609f.setText(i2);
        } else {
            this.f4609f.setVisibility(8);
        }
        this.f4610g.setText(i3);
        this.f4612i = onClickListener;
        if (i4 > 0) {
            TextView textView = (TextView) findViewById(C1536f.C1541e.cancel_btn);
            textView.setText(i4);
            textView.setVisibility(0);
            textView.setOnClickListener(onClickListener2);
        }
    }

    /* renamed from: a */
    public void m8460a(int i, int i2, int i3, int i4, Bitmap bitmap, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i5) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4611h.getLayoutParams();
        layoutParams.height = -2;
        this.f4611h.setLayoutParams(layoutParams);
        this.f4611h.setBackgroundResource(i5);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f4606a.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        this.f4606a.setLayoutParams(layoutParams2);
        this.f4606a.setImageBitmap(bitmap);
        m8461a(i, i2, i3, i4, null, onClickListener, onClickListener2);
    }

    @Override // com.tsf.extend.DialogC1546g
    /* renamed from: a */
    public FrameLayout.LayoutParams mo6413a() {
        return new FrameLayout.LayoutParams((int) (C1437p.m8619b() * f4876d), -1);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1536f.C1541e.ok_btn) {
            if (this.f4612i != null) {
                this.f4612i.onClick(view);
            }
            m8457c();
            dismiss();
            if (this.f4616m != null) {
                this.f4616m.mo6715g();
            }
        } else if (id == C1536f.C1541e.close_dialog) {
            onCancel(this);
            dismiss();
            if (this.f4616m != null) {
                this.f4616m.mo6714h();
            }
        } else if (id == C1536f.C1541e.btn_cancel) {
            onCancel(this);
            dismiss();
            if (this.f4616m != null) {
                this.f4616m.mo6714h();
            }
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        m8456e();
        if (this.f4613j != null) {
            this.f4613j.onCancel(dialogInterface);
        }
    }

    /* renamed from: c */
    private void m8457c() {
        if (this.f4614k > 0) {
        }
    }

    /* renamed from: e */
    private void m8456e() {
        if (this.f4614k > 0) {
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (this.f4616m != null) {
            this.f4616m.mo6713i();
        }
        super.onBackPressed();
    }
}
