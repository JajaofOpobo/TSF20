package android.support.p013v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.p002v4.content.C0144a;
import android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b;
import android.support.p002v4.view.AbstractC0388d;
import android.support.p002v4.view.C0419q;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* renamed from: android.support.v7.view.menu.a */
/* loaded from: classes.dex */
public class C0622a implements InterfaceMenuItemC0128b {

    /* renamed from: a */
    private final int f1480a;

    /* renamed from: b */
    private final int f1481b;

    /* renamed from: c */
    private final int f1482c;

    /* renamed from: d */
    private final int f1483d;

    /* renamed from: e */
    private CharSequence f1484e;

    /* renamed from: f */
    private CharSequence f1485f;

    /* renamed from: g */
    private Intent f1486g;

    /* renamed from: h */
    private char f1487h;

    /* renamed from: i */
    private char f1488i;

    /* renamed from: j */
    private Drawable f1489j;

    /* renamed from: l */
    private Context f1491l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f1492m;

    /* renamed from: k */
    private int f1490k = 0;

    /* renamed from: n */
    private int f1493n = 16;

    public C0622a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1491l = context;
        this.f1480a = i2;
        this.f1481b = i;
        this.f1482c = i3;
        this.f1483d = i4;
        this.f1484e = charSequence;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1488i;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1481b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1489j;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1486g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1480a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1487h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1483d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1484e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f1485f != null ? this.f1485f : this.f1484e;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1493n & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1493n & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1493n & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1493n & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f1488i = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f1493n = (z ? 1 : 0) | (this.f1493n & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f1493n = (z ? 2 : 0) | (this.f1493n & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1493n = (z ? 16 : 0) | (this.f1493n & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1489j = drawable;
        this.f1490k = 0;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1490k = i;
        this.f1489j = C0144a.m13403a(this.f1491l, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1486g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f1487h = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1492m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1487h = c;
        this.f1488i = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1484e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f1484e = this.f1491l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1485f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f1493n = (z ? 0 : 8) | (this.f1493n & 8);
        return this;
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    /* renamed from: a */
    public InterfaceMenuItemC0128b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    /* renamed from: a */
    public InterfaceMenuItemC0128b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b
    /* renamed from: a */
    public AbstractC0388d mo11739a() {
        return null;
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b
    /* renamed from: a */
    public InterfaceMenuItemC0128b mo11737a(AbstractC0388d abstractC0388d) {
        throw new UnsupportedOperationException();
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    /* renamed from: b */
    public InterfaceMenuItemC0128b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b
    /* renamed from: a */
    public InterfaceMenuItemC0128b mo11736a(C0419q.InterfaceC0424e interfaceC0424e) {
        return this;
    }
}
