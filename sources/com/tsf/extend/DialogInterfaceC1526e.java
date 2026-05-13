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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1420ab;
import com.tsf.extend.base.p080j.C1421b;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1440s;
import com.tsf.extend.base.view.C1479d;
import java.lang.ref.WeakReference;
/* renamed from: com.tsf.extend.e */
/* loaded from: classes.dex */
public class DialogInterfaceC1526e extends DialogC1546g implements DialogInterface {

    /* renamed from: f */
    private static int f4812f = 24;

    /* renamed from: g */
    private static int f4813g = 50;

    /* renamed from: h */
    private static int f4814h = 18;

    /* renamed from: i */
    private static int f4815i = -13421773;

    /* renamed from: j */
    private static int f4816j = 855638016;

    /* renamed from: k */
    private static int f4817k = 1;

    /* renamed from: a */
    public boolean f4818a;

    /* renamed from: b */
    public C1535d f4819b;

    /* renamed from: c */
    public String f4820c;

    /* renamed from: l */
    private InterfaceC1534c f4821l;

    /* renamed from: m */
    private LinearLayout f4822m;

    /* renamed from: n */
    private TextView f4823n;

    /* renamed from: o */
    private LinearLayout f4824o;

    /* renamed from: p */
    private LinearLayout f4825p;

    /* renamed from: q */
    private LinearLayout f4826q;

    /* renamed from: r */
    private Button f4827r;

    /* renamed from: s */
    private Button f4828s;

    /* renamed from: t */
    private FrameLayout f4829t;

    /* renamed from: u */
    private TextView f4830u;

    /* renamed from: v */
    private FrameLayout f4831v;

    /* renamed from: w */
    private AnimationSet f4832w;

    /* renamed from: x */
    private AnimationSet f4833x;

    /* renamed from: y */
    private boolean f4834y;

    /* renamed from: z */
    private boolean f4835z;

    /* renamed from: com.tsf.extend.e$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1534c {
        /* renamed from: a */
        void m8296a();
    }

    public DialogInterfaceC1526e(Context context) {
        super(context);
        this.f4818a = false;
        this.f4832w = null;
        this.f4833x = null;
        this.f4834y = false;
        this.f4819b = null;
        this.f4835z = true;
        m8304e();
    }

    public DialogInterfaceC1526e(Context context, int i) {
        super(context, i);
        this.f4818a = false;
        this.f4832w = null;
        this.f4833x = null;
        this.f4834y = false;
        this.f4819b = null;
        this.f4835z = true;
        m8304e();
    }

    /* renamed from: e */
    private void m8304e() {
        View inflate = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.custom_alert_dialog, (ViewGroup) null);
        this.f4822m = (LinearLayout) inflate.findViewById(C1536f.C1541e.title_layout);
        this.f4831v = (FrameLayout) inflate.findViewById(C1536f.C1541e.header_layout);
        this.f4823n = (TextView) inflate.findViewById(C1536f.C1541e.title_text);
        this.f4824o = (LinearLayout) inflate.findViewById(C1536f.C1541e.btn_layout);
        this.f4827r = (Button) inflate.findViewById(C1536f.C1541e.btn_positive);
        this.f4828s = (Button) inflate.findViewById(C1536f.C1541e.btn_negative);
        this.f4825p = (LinearLayout) inflate.findViewById(C1536f.C1541e.btn_positive_layout);
        this.f4826q = (LinearLayout) inflate.findViewById(C1536f.C1541e.btn_negative_layout);
        this.f4829t = (FrameLayout) inflate.findViewById(C1536f.C1541e.content_layout);
        this.f4830u = (TextView) inflate.findViewById(C1536f.C1541e.content);
        setContentView(inflate);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f4818a) {
        }
        m8321a((DialogInterface.OnClickListener) null, 0);
        if (this.f4834y) {
            m8313b();
        }
    }

    /* renamed from: a */
    public void m8321a(DialogInterface.OnClickListener onClickListener, int i) {
        if (!this.f4834y) {
            m8311b(onClickListener, i);
        } else if (this.f4832w == null && this.f4833x == null) {
            m8306c(onClickListener, i);
        }
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(final DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener((DialogInterface.OnDismissListener) new WeakReference(new DialogInterface.OnDismissListener() { // from class: com.tsf.extend.e.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                DialogInterfaceC1526e.this.f4832w = null;
                DialogInterfaceC1526e.this.f4833x = null;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
            }
        }).get());
    }

    /* renamed from: b */
    public void m8311b(DialogInterface.OnClickListener onClickListener, int i) {
        if (onClickListener != null) {
            onClickListener.onClick(this, i);
        }
        super.dismiss();
    }

    @Override // com.tsf.extend.DialogC1546g, android.app.Dialog
    public void show() {
        m8314a(false);
    }

    /* renamed from: a */
    public void m8314a(boolean z) {
        this.f4834y = z;
        if (z) {
            if (this.f4832w == null && this.f4833x == null) {
                this.f4824o.setPadding(0, 0, 0, 0);
                ((ViewGroup.MarginLayoutParams) this.f4825p.getLayoutParams()).setMargins(0, 0, 0, 0);
                ((ViewGroup.MarginLayoutParams) this.f4826q.getLayoutParams()).setMargins(0, 0, 0, 0);
                int m8623a = (int) (24.0f * C1437p.m8623a());
                int parseColor = Color.parseColor("#333333");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4830u.getLayoutParams();
                marginLayoutParams.setMargins(m8623a, m8623a, m8623a, m8623a);
                this.f4830u.setTextColor(parseColor);
                if (this.f4819b != null && this.f4819b.f4873g) {
                    int m8623a2 = (int) C1437p.m8623a();
                    marginLayoutParams.setMargins(this.f4819b.f4867a * m8623a2, this.f4819b.f4868b * m8623a2, this.f4819b.f4869c * m8623a2, m8623a2 * this.f4819b.f4870d);
                    this.f4830u.setTextColor(this.f4819b.f4872f);
                    this.f4830u.setTextSize(this.f4819b.f4871e);
                }
                Typeface m8700a = C1420ab.m8700a(getContext().getAssets(), "fonts/OpenSans-Light-bold.ttf");
                if (this.f4835z) {
                    this.f4827r.setTypeface(m8700a, 1);
                    this.f4828s.setTextColor(parseColor);
                    this.f4827r.setTextColor(Color.parseColor("#4480F7"));
                    C1421b.m8699a(this.f4826q, (Drawable) null);
                    if (Build.VERSION.SDK_INT >= 12) {
                        C1440s.m8600a(this.f4825p, true);
                    }
                } else {
                    this.f4828s.setTypeface(m8700a, 1);
                    this.f4827r.setTextColor(parseColor);
                    this.f4828s.setTextColor(Color.parseColor("#4480F7"));
                    C1421b.m8699a(this.f4825p, (Drawable) null);
                    if (Build.VERSION.SDK_INT >= 12) {
                        C1440s.m8600a(this.f4826q, true);
                    }
                }
                findViewById(C1536f.C1541e.seprator).setVisibility(0);
                findViewById(C1536f.C1541e.hori_seprator).setVisibility(0);
                if (Build.VERSION.SDK_INT >= 11) {
                    C1440s.m8599b(this.f4827r, 1.0f, 0.85f);
                    C1440s.m8599b(this.f4828s, 1.0f, 0.85f);
                }
                m8303f();
            } else {
                return;
            }
        }
        super.show();
    }

    @Override // com.tsf.extend.DialogC1546g
    /* renamed from: a */
    public FrameLayout.LayoutParams mo6413a() {
        return new FrameLayout.LayoutParams((int) (getContext().getResources().getDisplayMetrics().widthPixels * f4876d), -1);
    }

    @Override // com.tsf.extend.DialogC1546g, android.app.Dialog
    public void setContentView(int i) {
        setContentView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null));
    }

    @Override // com.tsf.extend.DialogC1546g, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(view);
    }

    /* renamed from: a */
    public void m8319a(View view) {
        this.f4822m.removeAllViews();
        this.f4822m.addView(view);
        this.f4822m.setVisibility(0);
    }

    /* renamed from: a */
    public void m8316a(CharSequence charSequence) {
        this.f4829t.setVisibility(0);
        this.f4830u.setText(charSequence);
    }

    /* renamed from: a */
    public void m8318a(C1535d c1535d) {
        this.f4819b = c1535d;
    }

    /* renamed from: a */
    public void m8323a(int i) {
    }

    /* renamed from: a */
    public void m8320a(Drawable drawable) {
    }

    /* renamed from: b */
    public void m8312b(int i) {
        switch (i) {
            case -2:
                this.f4826q.setVisibility(8);
                return;
            case ItemInfo.NO_ID /* -1 */:
                this.f4825p.setVisibility(8);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void m8322a(final int i, CharSequence charSequence, final DialogInterface.OnClickListener onClickListener) {
        switch (i) {
            case -2:
                this.f4824o.setVisibility(0);
                this.f4828s.setText(charSequence);
                this.f4828s.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.e.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (onClickListener != null) {
                            onClickListener.onClick(DialogInterfaceC1526e.this, i);
                        }
                        DialogInterfaceC1526e.this.dismiss();
                    }
                });
                return;
            case ItemInfo.NO_ID /* -1 */:
                this.f4824o.setVisibility(0);
                this.f4827r.setText(charSequence);
                this.f4827r.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.extend.e.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        DialogInterfaceC1526e.this.m8321a(onClickListener, i);
                    }
                });
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public void m8310b(View view) {
        this.f4829t.setVisibility(0);
        this.f4829t.removeAllViews();
        this.f4829t.addView(view);
    }

    /* renamed from: c */
    public void m8305c(View view) {
        this.f4831v.setVisibility(0);
        this.f4831v.removeAllViews();
        this.f4831v.addView(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.f4822m.setVisibility(0);
        this.f4823n.setText(charSequence);
    }

    /* renamed from: b */
    public void m8313b() {
        Object tag = this.f4825p.getTag(this.f4825p.getId());
        if (tag != null && (tag instanceof Animator) && Build.VERSION.SDK_INT >= 11) {
            ((Animator) tag).end();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.e$d */
    /* loaded from: classes.dex */
    public static class C1535d {

        /* renamed from: a */
        public int f4867a;

        /* renamed from: b */
        public int f4868b;

        /* renamed from: c */
        public int f4869c;

        /* renamed from: d */
        public int f4870d;

        /* renamed from: e */
        public int f4871e;

        /* renamed from: f */
        public int f4872f;

        /* renamed from: g */
        public boolean f4873g;

        private C1535d() {
            this.f4873g = false;
        }
    }

    /* renamed from: com.tsf.extend.e$b */
    /* loaded from: classes.dex */
    private static class C1533b {

        /* renamed from: a */
        public Context f4849a;

        /* renamed from: b */
        public int f4850b;

        /* renamed from: c */
        public CharSequence f4851c;

        /* renamed from: d */
        public View f4852d;

        /* renamed from: e */
        public CharSequence f4853e;

        /* renamed from: f */
        public int f4854f;

        /* renamed from: g */
        public Drawable f4855g;

        /* renamed from: h */
        public CharSequence f4856h;

        /* renamed from: i */
        public DialogInterface.OnClickListener f4857i;

        /* renamed from: j */
        public CharSequence f4858j;

        /* renamed from: k */
        public View f4859k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f4860l;

        /* renamed from: n */
        public DialogInterface.OnCancelListener f4862n;

        /* renamed from: o */
        public DialogInterface.OnDismissListener f4863o;

        /* renamed from: p */
        public DialogInterface.OnKeyListener f4864p;

        /* renamed from: q */
        public View f4865q;

        /* renamed from: m */
        public boolean f4861m = true;

        /* renamed from: r */
        public C1535d f4866r = new C1535d();

        public C1533b(Context context, int i) {
            this.f4849a = context;
            this.f4850b = i;
        }

        /* renamed from: a */
        public void m8297a(DialogInterfaceC1526e dialogInterfaceC1526e) {
            if (this.f4852d != null) {
                dialogInterfaceC1526e.m8319a(this.f4852d);
            } else {
                if (this.f4851c != null) {
                    dialogInterfaceC1526e.setTitle(this.f4851c);
                }
                if (this.f4855g != null) {
                    dialogInterfaceC1526e.m8320a(this.f4855g);
                }
                if (this.f4854f >= 0) {
                    dialogInterfaceC1526e.m8323a(this.f4854f);
                }
            }
            if (this.f4853e != null) {
                dialogInterfaceC1526e.m8316a(this.f4853e);
            }
            if (this.f4866r.f4873g) {
                dialogInterfaceC1526e.m8318a(this.f4866r);
            }
            if (this.f4856h != null) {
                dialogInterfaceC1526e.m8322a(-1, this.f4856h, this.f4857i);
            } else {
                dialogInterfaceC1526e.m8312b(-1);
            }
            if (this.f4858j != null) {
                dialogInterfaceC1526e.m8322a(-2, this.f4858j, this.f4860l);
            } else {
                dialogInterfaceC1526e.m8312b(-2);
            }
            if (this.f4859k != null) {
                dialogInterfaceC1526e.m8305c(this.f4859k);
            }
            if (this.f4865q != null) {
                dialogInterfaceC1526e.m8310b(this.f4865q);
            }
        }
    }

    /* renamed from: com.tsf.extend.e$a */
    /* loaded from: classes.dex */
    public static class C1532a {

        /* renamed from: a */
        private C1533b f4848a;

        public C1532a(Context context) {
            this(context, 0);
        }

        public C1532a(Context context, int i) {
            this.f4848a = new C1533b(context, i);
        }

        /* renamed from: a */
        public C1532a m8301a(int i) {
            try {
                this.f4848a.f4853e = this.f4848a.f4849a.getString(i);
            } catch (Exception e) {
            }
            return this;
        }

        /* renamed from: a */
        public C1532a m8299a(CharSequence charSequence) {
            this.f4848a.f4853e = charSequence;
            return this;
        }

        /* renamed from: a */
        public C1532a m8300a(int i, DialogInterface.OnClickListener onClickListener) {
            this.f4848a.f4856h = this.f4848a.f4849a.getString(i);
            this.f4848a.f4857i = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C1532a m8298b(int i, DialogInterface.OnClickListener onClickListener) {
            this.f4848a.f4858j = this.f4848a.f4849a.getText(i);
            this.f4848a.f4860l = onClickListener;
            return this;
        }

        /* renamed from: a */
        public DialogInterfaceC1526e m8302a() {
            DialogInterfaceC1526e dialogInterfaceC1526e = this.f4848a.f4850b == 0 ? new DialogInterfaceC1526e(this.f4848a.f4849a) : new DialogInterfaceC1526e(this.f4848a.f4849a, this.f4848a.f4850b);
            this.f4848a.m8297a(dialogInterfaceC1526e);
            dialogInterfaceC1526e.setCancelable(this.f4848a.f4861m);
            if (this.f4848a.f4861m) {
                dialogInterfaceC1526e.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC1526e.setOnCancelListener(this.f4848a.f4862n);
            dialogInterfaceC1526e.setOnDismissListener(this.f4848a.f4863o);
            dialogInterfaceC1526e.setOnKeyListener(this.f4848a.f4864p);
            return dialogInterfaceC1526e;
        }
    }

    /* renamed from: a */
    public void m8315a(String str) {
        this.f4820c = str;
    }

    /* renamed from: c */
    public String m8307c() {
        return this.f4820c;
    }

    /* renamed from: f */
    private void m8303f() {
        this.f4833x = new AnimationSet(true);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1536f.C1537a.material_dialog_anim);
        loadAnimation.setDuration(200L);
        this.f4833x.addAnimation(loadAnimation);
        C1479d m8308b = m8308b(false);
        m8308b.setDuration(100L);
        m8308b.setStartOffset(100L);
        this.f4833x.addAnimation(m8308b);
        this.f4833x.setInterpolator(new DecelerateInterpolator());
        this.f4833x.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.e.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DialogInterfaceC1526e.this.f4833x = null;
            }
        });
        m8295d().startAnimation(this.f4833x);
    }

    /* renamed from: c */
    private void m8306c(final DialogInterface.OnClickListener onClickListener, final int i) {
        this.f4832w = new AnimationSet(true);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1536f.C1537a.material_dialog_anim_reverse);
        loadAnimation.setDuration(150L);
        this.f4832w.addAnimation(loadAnimation);
        this.f4832w.setAnimationListener(new Animation.AnimationListener() { // from class: com.tsf.extend.e.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DialogInterfaceC1526e.this.m8311b(onClickListener, i);
                DialogInterfaceC1526e.this.f4832w = null;
            }
        });
        m8295d().startAnimation(this.f4832w);
    }

    /* renamed from: b */
    private C1479d m8308b(boolean z) {
        return new C1479d(z ? 0.0f : -2.0f, z ? -2.0f : 0.0f, C1437p.m8619b() / 2, 0.0f, 5.0f, z, false);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        if (this.f4821l != null) {
            this.f4821l.m8296a();
        }
    }
}
