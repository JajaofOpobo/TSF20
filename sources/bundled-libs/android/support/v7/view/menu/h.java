package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.d;
import android.support.v4.view.q;
import android.support.v7.view.menu.m;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class h implements android.support.v4.b.a.b {
    private static String w;
    private static String x;
    private static String y;
    private static String z;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private char i;
    private Drawable j;
    private f l;
    private p m;
    private Runnable n;
    private MenuItem.OnMenuItemClickListener o;
    private int q;
    private View r;
    private android.support.v4.view.d s;
    private q.e t;
    private ContextMenu.ContextMenuInfo v;
    private int k = 0;
    private int p = 16;
    private boolean u = false;

    h(f fVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.q = 0;
        this.l = fVar;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.q = i5;
    }

    public boolean b() {
        if ((this.o != null && this.o.onMenuItemClick(this)) || this.l.a(this.l.p(), this)) {
            return true;
        }
        if (this.n != null) {
            this.n.run();
            return true;
        }
        if (this.g != null) {
            try {
                this.l.e().startActivity(this.g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.s != null && this.s.d();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.p |= 16;
        } else {
            this.p &= -17;
        }
        this.l.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.i != c) {
            this.i = Character.toLowerCase(c);
            this.l.b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.h != c) {
            this.h = c;
            this.l.b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.h = c;
        this.i = Character.toLowerCase(c2);
        this.l.b(false);
        return this;
    }

    char d() {
        return this.l.b() ? this.i : this.h;
    }

    String e() {
        char cD = d();
        if (cD == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(w);
        switch (cD) {
            case '\b':
                sb.append(y);
                break;
            case '\n':
                sb.append(x);
                break;
            case ' ':
                sb.append(z);
                break;
            default:
                sb.append(cD);
                break;
        }
        return sb.toString();
    }

    boolean f() {
        return this.l.c() && d() != 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.m != null;
    }

    public void a(p pVar) {
        this.m = pVar;
        pVar.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.e;
    }

    CharSequence a(m.a aVar) {
        return (aVar == null || !aVar.a()) ? getTitle() : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.l.b(false);
        if (this.m != null) {
            this.m.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.l.e().getString(i));
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f != null ? this.f : this.e;
        if (Build.VERSION.SDK_INT < 18 && charSequence != null && !(charSequence instanceof String)) {
            return charSequence.toString();
        }
        return charSequence;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.e;
        }
        this.l.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        if (this.j != null) {
            return this.j;
        }
        if (this.k != 0) {
            Drawable drawableA = android.support.v7.widget.g.a().a(this.l.e(), this.k);
            this.k = 0;
            this.j = drawableA;
            return drawableA;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.k = 0;
        this.j = drawable;
        this.l.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.j = null;
        this.k = i;
        this.l.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.p & 1) == 1;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        int i = this.p;
        this.p = (z2 ? 1 : 0) | (this.p & (-2));
        if (i != this.p) {
            this.l.b(false);
        }
        return this;
    }

    public void a(boolean z2) {
        this.p = (z2 ? 4 : 0) | (this.p & (-5));
    }

    public boolean g() {
        return (this.p & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.p & 2) == 2;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        if ((this.p & 4) != 0) {
            this.l.a((MenuItem) this);
        } else {
            b(z2);
        }
        return this;
    }

    void b(boolean z2) {
        int i = this.p;
        this.p = (z2 ? 2 : 0) | (this.p & (-3));
        if (i != this.p) {
            this.l.b(false);
        }
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.s == null || !this.s.b()) ? (this.p & 8) == 0 : (this.p & 8) == 0 && this.s.c();
    }

    boolean c(boolean z2) {
        int i = this.p;
        this.p = (z2 ? 0 : 8) | (this.p & (-9));
        return i != this.p;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        if (c(z2)) {
            this.l.a(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.o = onMenuItemClickListener;
        return this;
    }

    public String toString() {
        if (this.e != null) {
            return this.e.toString();
        }
        return null;
    }

    void a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.v = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.v;
    }

    public void h() {
        this.l.b(this);
    }

    public boolean i() {
        return this.l.q();
    }

    public boolean j() {
        return (this.p & 32) == 32;
    }

    public boolean k() {
        return (this.q & 1) == 1;
    }

    public boolean l() {
        return (this.q & 2) == 2;
    }

    public void d(boolean z2) {
        if (z2) {
            this.p |= 32;
        } else {
            this.p &= -33;
        }
    }

    public boolean m() {
        return (this.q & 4) == 4;
    }

    @Override // android.support.v4.b.a.b, android.view.MenuItem
    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.q = i;
                this.l.b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    @Override // android.support.v4.b.a.b, android.view.MenuItem
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public android.support.v4.b.a.b setActionView(View view) {
        this.r = view;
        this.s = null;
        if (view != null && view.getId() == -1 && this.a > 0) {
            view.setId(this.a);
        }
        this.l.b(this);
        return this;
    }

    @Override // android.support.v4.b.a.b, android.view.MenuItem
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public android.support.v4.b.a.b setActionView(int i) {
        Context contextE = this.l.e();
        setActionView(LayoutInflater.from(contextE).inflate(i, (ViewGroup) new LinearLayout(contextE), false));
        return this;
    }

    @Override // android.support.v4.b.a.b, android.view.MenuItem
    public View getActionView() {
        if (this.r != null) {
            return this.r;
        }
        if (this.s != null) {
            this.r = this.s.a(this);
            return this.r;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.support.v4.b.a.b
    public android.support.v4.view.d a() {
        return this.s;
    }

    @Override // android.support.v4.b.a.b
    public android.support.v4.b.a.b a(android.support.v4.view.d dVar) {
        if (this.s != null) {
            this.s.f();
        }
        this.r = null;
        this.s = dVar;
        this.l.b(true);
        if (this.s != null) {
            this.s.a(new d.b() { // from class: android.support.v7.view.menu.h.1
                @Override // android.support.v4.view.d.b
                public void a(boolean z2) {
                    h.this.l.a(h.this);
                }
            });
        }
        return this;
    }

    @Override // android.support.v4.b.a.b, android.view.MenuItem
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public android.support.v4.b.a.b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.support.v4.b.a.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!n()) {
            return false;
        }
        if (this.t == null || this.t.a(this)) {
            return this.l.c(this);
        }
        return false;
    }

    @Override // android.support.v4.b.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.q & 8) == 0) {
            return false;
        }
        if (this.r == null) {
            return true;
        }
        if (this.t == null || this.t.b(this)) {
            return this.l.d(this);
        }
        return false;
    }

    @Override // android.support.v4.b.a.b
    public android.support.v4.b.a.b a(q.e eVar) {
        this.t = eVar;
        return this;
    }

    public boolean n() {
        if ((this.q & 8) == 0) {
            return false;
        }
        if (this.r == null && this.s != null) {
            this.r = this.s.a(this);
        }
        return this.r != null;
    }

    public void e(boolean z2) {
        this.u = z2;
        this.l.b(false);
    }

    @Override // android.support.v4.b.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }
}
