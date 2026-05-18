package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.support.v4.view.bb;
import android.support.v4.view.bg;
import android.support.v7.a.a;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.l;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ab implements n {
    private Toolbar a;
    private int b;
    private View c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    private CharSequence i;
    private CharSequence j;
    private CharSequence k;
    private Window.Callback l;
    private boolean m;
    private ActionMenuPresenter n;
    private int o;
    private final g p;
    private int q;
    private Drawable r;

    public ab(Toolbar toolbar, boolean z) {
        this(toolbar, z, a.i.abc_action_bar_up_description, a.e.abc_ic_ab_back_mtrl_am_alpha);
    }

    public ab(Toolbar toolbar, boolean z, int i, int i2) {
        this.o = 0;
        this.q = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        if (z) {
            aa aaVarA = aa.a(toolbar.getContext(), null, a.k.ActionBar, a.C0012a.actionBarStyle, 0);
            CharSequence charSequenceC = aaVarA.c(a.k.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceC)) {
                b(charSequenceC);
            }
            CharSequence charSequenceC2 = aaVarA.c(a.k.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceC2)) {
                c(charSequenceC2);
            }
            Drawable drawableA = aaVarA.a(a.k.ActionBar_logo);
            if (drawableA != null) {
                c(drawableA);
            }
            Drawable drawableA2 = aaVarA.a(a.k.ActionBar_icon);
            if (this.g == null && drawableA2 != null) {
                a(drawableA2);
            }
            Drawable drawableA3 = aaVarA.a(a.k.ActionBar_homeAsUpIndicator);
            if (drawableA3 != null) {
                d(drawableA3);
            }
            c(aaVarA.a(a.k.ActionBar_displayOptions, 0));
            int iG = aaVarA.g(a.k.ActionBar_customNavigationLayout, 0);
            if (iG != 0) {
                a(LayoutInflater.from(this.a.getContext()).inflate(iG, (ViewGroup) this.a, false));
                c(this.b | 16);
            }
            int iF = aaVarA.f(a.k.ActionBar_height, 0);
            if (iF > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = iF;
                this.a.setLayoutParams(layoutParams);
            }
            int iD = aaVarA.d(a.k.ActionBar_contentInsetStart, -1);
            int iD2 = aaVarA.d(a.k.ActionBar_contentInsetEnd, -1);
            if (iD >= 0 || iD2 >= 0) {
                this.a.a(Math.max(iD, 0), Math.max(iD2, 0));
            }
            int iG2 = aaVarA.g(a.k.ActionBar_titleTextStyle, 0);
            if (iG2 != 0) {
                this.a.a(this.a.getContext(), iG2);
            }
            int iG3 = aaVarA.g(a.k.ActionBar_subtitleTextStyle, 0);
            if (iG3 != 0) {
                this.a.b(this.a.getContext(), iG3);
            }
            int iG4 = aaVarA.g(a.k.ActionBar_popupTheme, 0);
            if (iG4 != 0) {
                this.a.setPopupTheme(iG4);
            }
            aaVarA.a();
        } else {
            this.b = s();
        }
        this.p = g.a();
        d(i);
        this.k = this.a.getNavigationContentDescription();
        b(this.p.a(b(), i2));
        this.a.setNavigationOnClickListener(new View.OnClickListener() { // from class: android.support.v7.widget.ab.1
            final android.support.v7.view.menu.a a;

            {
                this.a = new android.support.v7.view.menu.a(ab.this.a.getContext(), 0, R.id.home, 0, 0, ab.this.i);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ab.this.l != null && ab.this.m) {
                    ab.this.l.onMenuItemSelected(0, this.a);
                }
            }
        });
    }

    public void d(int i) {
        if (i != this.q) {
            this.q = i;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                e(this.q);
            }
        }
    }

    public void b(Drawable drawable) {
        if (this.r != drawable) {
            this.r = drawable;
            v();
        }
    }

    private int s() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        return 15;
    }

    @Override // android.support.v7.widget.n
    public ViewGroup a() {
        return this.a;
    }

    @Override // android.support.v7.widget.n
    public Context b() {
        return this.a.getContext();
    }

    @Override // android.support.v7.widget.n
    public boolean c() {
        return this.a.g();
    }

    @Override // android.support.v7.widget.n
    public void d() {
        this.a.h();
    }

    @Override // android.support.v7.widget.n
    public void a(Window.Callback callback) {
        this.l = callback;
    }

    @Override // android.support.v7.widget.n
    public void a(CharSequence charSequence) {
        if (!this.h) {
            e(charSequence);
        }
    }

    @Override // android.support.v7.widget.n
    public CharSequence e() {
        return this.a.getTitle();
    }

    public void b(CharSequence charSequence) {
        this.h = true;
        e(charSequence);
    }

    private void e(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    public void c(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // android.support.v7.widget.n
    public void f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.n
    public void g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.v7.widget.n
    public void a(int i) {
        a(i != 0 ? this.p.a(b(), i) : null);
    }

    @Override // android.support.v7.widget.n
    public void a(Drawable drawable) {
        this.e = drawable;
        t();
    }

    @Override // android.support.v7.widget.n
    public void b(int i) {
        c(i != 0 ? this.p.a(b(), i) : null);
    }

    public void c(Drawable drawable) {
        this.f = drawable;
        t();
    }

    private void t() {
        Drawable drawable = null;
        if ((this.b & 2) != 0) {
            drawable = ((this.b & 1) == 0 || this.f == null) ? this.e : this.f;
        }
        this.a.setLogo(drawable);
    }

    @Override // android.support.v7.widget.n
    public boolean h() {
        return this.a.a();
    }

    @Override // android.support.v7.widget.n
    public boolean i() {
        return this.a.b();
    }

    @Override // android.support.v7.widget.n
    public boolean j() {
        return this.a.c();
    }

    @Override // android.support.v7.widget.n
    public boolean k() {
        return this.a.d();
    }

    @Override // android.support.v7.widget.n
    public boolean l() {
        return this.a.e();
    }

    @Override // android.support.v7.widget.n
    public void m() {
        this.m = true;
    }

    @Override // android.support.v7.widget.n
    public void a(Menu menu, l.a aVar) {
        if (this.n == null) {
            this.n = new ActionMenuPresenter(this.a.getContext());
            this.n.a(a.f.action_menu_presenter);
        }
        this.n.a(aVar);
        this.a.a((android.support.v7.view.menu.f) menu, this.n);
    }

    @Override // android.support.v7.widget.n
    public void n() {
        this.a.f();
    }

    @Override // android.support.v7.widget.n
    public int o() {
        return this.b;
    }

    @Override // android.support.v7.widget.n
    public void c(int i) {
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    v();
                    u();
                } else {
                    this.a.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                t();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && this.d != null) {
                if ((i & 16) != 0) {
                    this.a.addView(this.d);
                } else {
                    this.a.removeView(this.d);
                }
            }
        }
    }

    @Override // android.support.v7.widget.n
    public void a(t tVar) {
        if (this.c != null && this.c.getParent() == this.a) {
            this.a.removeView(this.c);
        }
        this.c = tVar;
        if (tVar != null && this.o == 2) {
            this.a.addView(this.c, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.c.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.a = 8388691;
            tVar.setAllowCollapse(true);
        }
    }

    @Override // android.support.v7.widget.n
    public void a(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // android.support.v7.widget.n
    public void b(boolean z) {
    }

    @Override // android.support.v7.widget.n
    public int p() {
        return this.o;
    }

    public void a(View view) {
        if (this.d != null && (this.b & 16) != 0) {
            this.a.removeView(this.d);
        }
        this.d = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(this.d);
        }
    }

    @Override // android.support.v7.widget.n
    public bb a(final int i, long j) {
        return ai.l(this.a).a(i == 0 ? 1.0f : 0.0f).a(j).a(new bg() { // from class: android.support.v7.widget.ab.2
            private boolean c = false;

            @Override // android.support.v4.view.bg, android.support.v4.view.bf
            public void a(View view) {
                ab.this.a.setVisibility(0);
            }

            @Override // android.support.v4.view.bg, android.support.v4.view.bf
            public void b(View view) {
                if (!this.c) {
                    ab.this.a.setVisibility(i);
                }
            }

            @Override // android.support.v4.view.bg, android.support.v4.view.bf
            public void c(View view) {
                this.c = true;
            }
        });
    }

    public void d(Drawable drawable) {
        this.g = drawable;
        v();
    }

    public void d(CharSequence charSequence) {
        this.k = charSequence;
        u();
    }

    public void e(int i) {
        d(i == 0 ? null : b().getString(i));
    }

    private void u() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.q);
            } else {
                this.a.setNavigationContentDescription(this.k);
            }
        }
    }

    private void v() {
        if ((this.b & 4) != 0) {
            this.a.setNavigationIcon(this.g != null ? this.g : this.r);
        }
    }

    @Override // android.support.v7.widget.n
    public int q() {
        return this.a.getVisibility();
    }

    @Override // android.support.v7.widget.n
    public void a(l.a aVar, f.a aVar2) {
        this.a.a(aVar, aVar2);
    }

    @Override // android.support.v7.widget.n
    public Menu r() {
        return this.a.getMenu();
    }
}
