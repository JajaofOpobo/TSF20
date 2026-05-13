package android.support.p013v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b;
import android.support.p002v4.view.AbstractC0388d;
import android.support.p002v4.view.C0419q;
import android.support.p013v7.view.menu.InterfaceC0645m;
import android.support.p013v7.widget.C0742g;
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
/* renamed from: android.support.v7.view.menu.h */
/* loaded from: classes.dex */
public final class C0632h implements InterfaceMenuItemC0128b {

    /* renamed from: w */
    private static String f1548w;

    /* renamed from: x */
    private static String f1549x;

    /* renamed from: y */
    private static String f1550y;

    /* renamed from: z */
    private static String f1551z;

    /* renamed from: a */
    private final int f1552a;

    /* renamed from: b */
    private final int f1553b;

    /* renamed from: c */
    private final int f1554c;

    /* renamed from: d */
    private final int f1555d;

    /* renamed from: e */
    private CharSequence f1556e;

    /* renamed from: f */
    private CharSequence f1557f;

    /* renamed from: g */
    private Intent f1558g;

    /* renamed from: h */
    private char f1559h;

    /* renamed from: i */
    private char f1560i;

    /* renamed from: j */
    private Drawable f1561j;

    /* renamed from: l */
    private C0628f f1563l;

    /* renamed from: m */
    private SubMenuC0649p f1564m;

    /* renamed from: n */
    private Runnable f1565n;

    /* renamed from: o */
    private MenuItem.OnMenuItemClickListener f1566o;

    /* renamed from: q */
    private int f1568q;

    /* renamed from: r */
    private View f1569r;

    /* renamed from: s */
    private AbstractC0388d f1570s;

    /* renamed from: t */
    private C0419q.InterfaceC0424e f1571t;

    /* renamed from: v */
    private ContextMenu.ContextMenuInfo f1573v;

    /* renamed from: k */
    private int f1562k = 0;

    /* renamed from: p */
    private int f1567p = 16;

    /* renamed from: u */
    private boolean f1572u = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0632h(C0628f c0628f, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1568q = 0;
        this.f1563l = c0628f;
        this.f1552a = i2;
        this.f1553b = i;
        this.f1554c = i3;
        this.f1555d = i4;
        this.f1556e = charSequence;
        this.f1568q = i5;
    }

    /* renamed from: b */
    public boolean m11729b() {
        if ((this.f1566o == null || !this.f1566o.onMenuItemClick(this)) && !this.f1563l.mo11674a(this.f1563l.mo11669p(), this)) {
            if (this.f1565n != null) {
                this.f1565n.run();
                return true;
            }
            if (this.f1558g != null) {
                try {
                    this.f1563l.m11755e().startActivity(this.f1558g);
                    return true;
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                }
            }
            return this.f1570s != null && this.f1570s.mo11707d();
        }
        return true;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1567p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1567p |= 16;
        } else {
            this.f1567p &= -17;
        }
        this.f1563l.m11761b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1553b;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1552a;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1554c;
    }

    /* renamed from: c */
    public int m11726c() {
        return this.f1555d;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1558g;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1558g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1560i;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1560i != c) {
            this.f1560i = Character.toLowerCase(c);
            this.f1563l.m11761b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1559h;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f1559h != c) {
            this.f1559h = c;
            this.f1563l.m11761b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1559h = c;
        this.f1560i = Character.toLowerCase(c2);
        this.f1563l.m11761b(false);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public char m11724d() {
        return this.f1563l.mo11673b() ? this.f1560i : this.f1559h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m11722e() {
        char m11724d = m11724d();
        if (m11724d == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(f1548w);
        switch (m11724d) {
            case '\b':
                sb.append(f1550y);
                break;
            case '\n':
                sb.append(f1549x);
                break;
            case ' ':
                sb.append(f1551z);
                break;
            default:
                sb.append(m11724d);
                break;
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m11720f() {
        return this.f1563l.mo11672c() && m11724d() != 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1564m;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1564m != null;
    }

    /* renamed from: a */
    public void m11733a(SubMenuC0649p subMenuC0649p) {
        this.f1564m = subMenuC0649p;
        subMenuC0649p.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1556e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence m11734a(InterfaceC0645m.InterfaceC0646a interfaceC0646a) {
        return (interfaceC0646a == null || !interfaceC0646a.mo11681a()) ? getTitle() : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1556e = charSequence;
        this.f1563l.m11761b(false);
        if (this.f1564m != null) {
            this.f1564m.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f1563l.m11755e().getString(i));
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1557f != null ? this.f1557f : this.f1556e;
        if (Build.VERSION.SDK_INT < 18 && charSequence != null && !(charSequence instanceof String)) {
            return charSequence.toString();
        }
        return charSequence;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1557f = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f1556e;
        }
        this.f1563l.m11761b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        if (this.f1561j != null) {
            return this.f1561j;
        }
        if (this.f1562k != 0) {
            Drawable m11211a = C0742g.m11215a().m11211a(this.f1563l.m11755e(), this.f1562k);
            this.f1562k = 0;
            this.f1561j = m11211a;
            return m11211a;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1562k = 0;
        this.f1561j = drawable;
        this.f1563l.m11761b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1561j = null;
        this.f1562k = i;
        this.f1563l.m11761b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1567p & 1) == 1;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f1567p;
        this.f1567p = (z ? 1 : 0) | (this.f1567p & (-2));
        if (i != this.f1567p) {
            this.f1563l.m11761b(false);
        }
        return this;
    }

    /* renamed from: a */
    public void m11730a(boolean z) {
        this.f1567p = (z ? 4 : 0) | (this.f1567p & (-5));
    }

    /* renamed from: g */
    public boolean m11719g() {
        return (this.f1567p & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1567p & 2) == 2;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f1567p & 4) != 0) {
            this.f1563l.m11773a((MenuItem) this);
        } else {
            m11727b(z);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m11727b(boolean z) {
        int i = this.f1567p;
        this.f1567p = (z ? 2 : 0) | (this.f1567p & (-3));
        if (i != this.f1567p) {
            this.f1563l.m11761b(false);
        }
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1570s == null || !this.f1570s.mo11699b()) ? (this.f1567p & 8) == 0 : (this.f1567p & 8) == 0 && this.f1570s.mo11698c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m11725c(boolean z) {
        int i = this.f1567p;
        this.f1567p = (z ? 0 : 8) | (this.f1567p & (-9));
        return i != this.f1567p;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m11725c(z)) {
            this.f1563l.m11777a(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1566o = onMenuItemClickListener;
        return this;
    }

    public String toString() {
        if (this.f1556e != null) {
            return this.f1556e.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11732a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1573v = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1573v;
    }

    /* renamed from: h */
    public void m11718h() {
        this.f1563l.m11763b(this);
    }

    /* renamed from: i */
    public boolean m11717i() {
        return this.f1563l.m11743q();
    }

    /* renamed from: j */
    public boolean m11716j() {
        return (this.f1567p & 32) == 32;
    }

    /* renamed from: k */
    public boolean m11715k() {
        return (this.f1568q & 1) == 1;
    }

    /* renamed from: l */
    public boolean m11714l() {
        return (this.f1568q & 2) == 2;
    }

    /* renamed from: d */
    public void m11723d(boolean z) {
        if (z) {
            this.f1567p |= 32;
        } else {
            this.f1567p &= -33;
        }
    }

    /* renamed from: m */
    public boolean m11713m() {
        return (this.f1568q & 4) == 4;
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f1568q = i;
                this.f1563l.m11763b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    /* renamed from: a */
    public InterfaceMenuItemC0128b setActionView(View view) {
        this.f1569r = view;
        this.f1570s = null;
        if (view != null && view.getId() == -1 && this.f1552a > 0) {
            view.setId(this.f1552a);
        }
        this.f1563l.m11763b(this);
        return this;
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    /* renamed from: a */
    public InterfaceMenuItemC0128b setActionView(int i) {
        Context m11755e = this.f1563l.m11755e();
        setActionView(LayoutInflater.from(m11755e).inflate(i, (ViewGroup) new LinearLayout(m11755e), false));
        return this;
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    public View getActionView() {
        if (this.f1569r != null) {
            return this.f1569r;
        }
        if (this.f1570s != null) {
            this.f1569r = this.f1570s.mo11700a(this);
            return this.f1569r;
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

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b
    /* renamed from: a */
    public AbstractC0388d mo11739a() {
        return this.f1570s;
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b
    /* renamed from: a */
    public InterfaceMenuItemC0128b mo11737a(AbstractC0388d abstractC0388d) {
        if (this.f1570s != null) {
            this.f1570s.m12649f();
        }
        this.f1569r = null;
        this.f1570s = abstractC0388d;
        this.f1563l.m11761b(true);
        if (this.f1570s != null) {
            this.f1570s.mo11701a(new AbstractC0388d.InterfaceC0390b() { // from class: android.support.v7.view.menu.h.1
                @Override // android.support.p002v4.view.AbstractC0388d.InterfaceC0390b
                /* renamed from: a */
                public void mo11711a(boolean z) {
                    C0632h.this.f1563l.m11777a(C0632h.this);
                }
            });
        }
        return this;
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    /* renamed from: b */
    public InterfaceMenuItemC0128b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    public boolean expandActionView() {
        if (m11712n()) {
            if (this.f1571t == null || this.f1571t.mo11704a(this)) {
                return this.f1563l.mo11671c(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1568q & 8) == 0) {
            return false;
        }
        if (this.f1569r == null) {
            return true;
        }
        if (this.f1571t == null || this.f1571t.mo11703b(this)) {
            return this.f1563l.mo11670d(this);
        }
        return false;
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b
    /* renamed from: a */
    public InterfaceMenuItemC0128b mo11736a(C0419q.InterfaceC0424e interfaceC0424e) {
        this.f1571t = interfaceC0424e;
        return this;
    }

    /* renamed from: n */
    public boolean m11712n() {
        if ((this.f1568q & 8) != 0) {
            if (this.f1569r == null && this.f1570s != null) {
                this.f1569r = this.f1570s.mo11700a(this);
            }
            return this.f1569r != null;
        }
        return false;
    }

    /* renamed from: e */
    public void m11721e(boolean z) {
        this.f1572u = z;
        this.f1563l.m11761b(false);
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1572u;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }
}
