package com.tsf.extend;

import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.extend.base.j.ab;
import com.tsf.extend.base.j.p;
import com.tsf.extend.base.j.s;
import com.tsf.extend.f;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends g implements DialogInterface {
    private static int f = 24;
    private static int g = 50;
    private static int h = 18;
    private static int i = -13421773;
    private static int j = 855638016;
    private static int k = 1;
    public boolean a;
    public d b;
    public String c;
    private c l;
    private LinearLayout m;
    private TextView n;
    private LinearLayout o;
    private LinearLayout p;
    private LinearLayout q;
    private Button r;
    private Button s;
    private FrameLayout t;
    private TextView u;
    private FrameLayout v;
    private AnimationSet w;
    private AnimationSet x;
    private boolean y;
    private boolean z;

    public interface c {
        void a();
    }

    public e(Context context) {
        super(context);
        this.a = false;
        this.w = null;
        this.x = null;
        this.y = false;
        this.b = null;
        this.z = true;
        e();
    }

    public e(Context context, int i2) {
        super(context, i2);
        this.a = false;
        this.w = null;
        this.x = null;
        this.y = false;
        this.b = null;
        this.z = true;
        e();
    }

    private void e() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f.C0052f.custom_alert_dialog, (ViewGroup) null);
        this.m = (LinearLayout) viewInflate.findViewById(f.e.title_layout);
        this.v = (FrameLayout) viewInflate.findViewById(f.e.header_layout);
        this.n = (TextView) viewInflate.findViewById(f.e.title_text);
        this.o = (LinearLayout) viewInflate.findViewById(f.e.btn_layout);
        this.r = (Button) viewInflate.findViewById(f.e.btn_positive);
        this.s = (Button) viewInflate.findViewById(f.e.btn_negative);
        this.p = (LinearLayout) viewInflate.findViewById(f.e.btn_positive_layout);
        this.q = (LinearLayout) viewInflate.findViewById(f.e.btn_negative_layout);
        this.t = (FrameLayout) viewInflate.findViewById(f.e.content_layout);
        this.u = (TextView) viewInflate.findViewById(f.e.content);
        setContentView(viewInflate);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.a) {
        }
        a((DialogInterface.OnClickListener) null, 0);
        if (this.y) {
            b();
        }
    }

    public void a(DialogInterface.OnClickListener onClickListener, int i2) {
        if (!this.y) {
            b(onClickListener, i2);
        } else if (this.w == null && this.x == null) {
            c(onClickListener, i2);
        }
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(final DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener((DialogInterface.OnDismissListener) new WeakReference(new DialogInterface.OnDismissListener() { // from class: com.tsf.extend.e.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                e.this.w = null;
                e.this.x = null;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
            }
        }).get());
    }

    public void b(DialogInterface.OnClickListener onClickListener, int i2) {
        if (onClickListener != null) {
            onClickListener.onClick(this, i2);
        }
        super.dismiss();
    }

    @Override // com.tsf.extend.g, android.app.Dialog
    public void show() {
        a(false);
    }

    public void a(boolean z) {
        this.y = z;
        if (z) {
            if (this.w == null && this.x == null) {
                this.o.setPadding(0, 0, 0, 0);
                ((ViewGroup.MarginLayoutParams) this.p.getLayoutParams()).setMargins(0, 0, 0, 0);
                ((ViewGroup.MarginLayoutParams) this.q.getLayoutParams()).setMargins(0, 0, 0, 0);
                int iA = (int) (24.0f * p.a());
                int color = Color.parseColor("#333333");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.u.getLayoutParams();
                marginLayoutParams.setMargins(iA, iA, iA, iA);
                this.u.setTextColor(color);
                if (this.b != null && this.b.g) {
                    int iA2 = (int) p.a();
                    marginLayoutParams.setMargins(this.b.a * iA2, this.b.b * iA2, this.b.c * iA2, iA2 * this.b.d);
                    this.u.setTextColor(this.b.f);
                    this.u.setTextSize(this.b.e);
                }
                Typeface typefaceA = ab.a(getContext().getAssets(), "fonts/OpenSans-Light-bold.ttf");
                if (this.z) {
                    this.r.setTypeface(typefaceA, 1);
                    this.s.setTextColor(color);
                    this.r.setTextColor(Color.parseColor("#4480F7"));
                    com.tsf.extend.base.j.b.a(this.q, (Drawable) null);
                    if (Build.VERSION.SDK_INT >= 12) {
                        s.a(this.p, true);
                    }
                } else {
                    this.s.setTypeface(typefaceA, 1);
                    this.r.setTextColor(color);
                    this.s.setTextColor(Color.parseColor("#4480F7"));
                    com.tsf.extend.base.j.b.a(this.p, (Drawable) null);
                    if (Build.VERSION.SDK_INT >= 12) {
                        s.a(this.q, true);
                    }
                }
                findViewById(f.e.seprator).setVisibility(0);
                findViewById(f.e.hori_seprator).setVisibility(0);
                if (Build.VERSION.SDK_INT >= 11) {
                    s.b(this.r, 1.0f, 0.85f);
                    s.b(this.s, 1.0f, 0.85f);
                }
                f();
            } else {
                return;
            }
        }
        super.show();
    }

    @Override // com.tsf.extend.g
    public FrameLayout.LayoutParams a() {
        return new FrameLayout.LayoutParams((int) (getContext().getResources().getDisplayMetrics().widthPixels * d), -1);
    }

    @Override // com.tsf.extend.g, android.app.Dialog
    public void setContentView(int i2) {
        setContentView(LayoutInflater.from(getContext()).inflate(i2, (ViewGroup) null));
    }

    @Override // com.tsf.extend.g, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(view);
    }

    public void a(View view) {
        this.m.removeAllViews();
        this.m.addView(view);
        this.m.setVisibility(0);
    }

    public void a(CharSequence charSequence) {
        this.t.setVisibility(0);
        this.u.setText(charSequence);
    }

    public void a(d dVar) {
        this.b = dVar;
    }

    public void a(int i2) {
    }

    public void a(Drawable drawable) {
    }

    public void b(int i2) {
        switch (i2) {
            case -2:
                this.q.setVisibility(8);
                break;
            case ItemInfo.NO_ID /* -1 */:
                this.p.setVisibility(8);
                break;
        }
    }

    public void a(final int i2, CharSequence charSequence, final DialogInterface.OnClickListener onClickListener) {
        switch (i2) {
            case -2:
                this.o.setVisibility(0);
                this.s.setText(charSequence);
                this.s.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.e.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (onClickListener != null) {
                            onClickListener.onClick(e.this, i2);
                        }
                        e.this.dismiss();
                    }
                });
                break;
            case ItemInfo.NO_ID /* -1 */:
                this.o.setVisibility(0);
                this.r.setText(charSequence);
                this.r.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.e.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        e.this.a(onClickListener, i2);
                    }
                });
                break;
        }
    }

    public void b(View view) {
        this.t.setVisibility(0);
        this.t.removeAllViews();
        this.t.addView(view);
    }

    public void c(View view) {
        this.v.setVisibility(0);
        this.v.removeAllViews();
        this.v.addView(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.m.setVisibility(0);
        this.n.setText(charSequence);
    }

    public void b() {
        Object tag = this.p.getTag(this.p.getId());
        if (tag != null && (tag instanceof Animator) && Build.VERSION.SDK_INT >= 11) {
            ((Animator) tag).end();
        }
    }

    private static class d {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public boolean g;

        private d() {
            this.g = false;
        }
    }

    private static class b {
        public Context a;
        public int b;
        public CharSequence c;
        public View d;
        public CharSequence e;
        public int f;
        public Drawable g;
        public CharSequence h;
        public DialogInterface.OnClickListener i;
        public CharSequence j;
        public View k;
        public DialogInterface.OnClickListener l;
        public DialogInterface.OnCancelListener n;
        public DialogInterface.OnDismissListener o;
        public DialogInterface.OnKeyListener p;
        public View q;
        public boolean m = true;
        public d r = new d();

        public b(Context context, int i) {
            this.a = context;
            this.b = i;
        }

        public void a(e eVar) {
            if (this.d != null) {
                eVar.a(this.d);
            } else {
                if (this.c != null) {
                    eVar.setTitle(this.c);
                }
                if (this.g != null) {
                    eVar.a(this.g);
                }
                if (this.f >= 0) {
                    eVar.a(this.f);
                }
            }
            if (this.e != null) {
                eVar.a(this.e);
            }
            if (this.r.g) {
                eVar.a(this.r);
            }
            if (this.h != null) {
                eVar.a(-1, this.h, this.i);
            } else {
                eVar.b(-1);
            }
            if (this.j != null) {
                eVar.a(-2, this.j, this.l);
            } else {
                eVar.b(-2);
            }
            if (this.k != null) {
                eVar.c(this.k);
            }
            if (this.q != null) {
                eVar.b(this.q);
            }
        }
    }

    public static class a {
        private b a;

        public a(Context context) {
            this(context, 0);
        }

        public a(Context context, int i) {
            this.a = new b(context, i);
        }

        public a a(int i) {
            try {
                this.a.e = this.a.a.getString(i);
            } catch (Exception e) {
            }
            return this;
        }

        public a a(CharSequence charSequence) {
            this.a.e = charSequence;
            return this;
        }

        public a a(int i, DialogInterface.OnClickListener onClickListener) {
            this.a.h = this.a.a.getString(i);
            this.a.i = onClickListener;
            return this;
        }

        public a b(int i, DialogInterface.OnClickListener onClickListener) {
            this.a.j = this.a.a.getText(i);
            this.a.l = onClickListener;
            return this;
        }

        public e a() {
            e eVar = this.a.b == 0 ? new e(this.a.a) : new e(this.a.a, this.a.b);
            this.a.a(eVar);
            eVar.setCancelable(this.a.m);
            if (this.a.m) {
                eVar.setCanceledOnTouchOutside(true);
            }
            eVar.setOnCancelListener(this.a.n);
            eVar.setOnDismissListener(this.a.o);
            eVar.setOnKeyListener(this.a.p);
            return eVar;
        }
    }

    public void a(String str) {
        this.c = str;
    }

    public String c() {
        return this.c;
    }

    private void f() {
        this.x = new AnimationSet(true);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), f.a.material_dialog_anim);
        animationLoadAnimation.setDuration(200L);
        this.x.addAnimation(animationLoadAnimation);
        com.tsf.extend.base.view.d dVarB = b(false);
        dVarB.setDuration(100L);
        dVarB.setStartOffset(100L);
        this.x.addAnimation(dVarB);
        this.x.setInterpolator(new DecelerateInterpolator());
        this.x.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.e.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                e.this.x = null;
            }
        });
        d().startAnimation(this.x);
    }

    private void c(final DialogInterface.OnClickListener onClickListener, final int i2) {
        this.w = new AnimationSet(true);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), f.a.material_dialog_anim_reverse);
        animationLoadAnimation.setDuration(150L);
        this.w.addAnimation(animationLoadAnimation);
        this.w.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.e.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                e.this.b(onClickListener, i2);
                e.this.w = null;
            }
        });
        d().startAnimation(this.w);
    }

    private com.tsf.extend.base.view.d b(boolean z) {
        return new com.tsf.extend.base.view.d(z ? 0.0f : -2.0f, z ? -2.0f : 0.0f, p.b() / 2, 0.0f, 5.0f, z, false);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        if (this.l != null) {
            this.l.a();
        }
    }
}
