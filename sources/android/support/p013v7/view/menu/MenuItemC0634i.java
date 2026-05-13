package android.support.p013v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b;
import android.support.p002v4.view.AbstractC0388d;
import android.support.p002v4.view.C0419q;
import android.support.p013v7.view.InterfaceC0609c;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
@TargetApi(14)
/* renamed from: android.support.v7.view.menu.i */
/* loaded from: classes.dex */
public class MenuItemC0634i extends AbstractC0624c<InterfaceMenuItemC0128b> implements MenuItem {

    /* renamed from: c */
    private Method f1575c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuItemC0634i(Context context, InterfaceMenuItemC0128b interfaceMenuItemC0128b) {
        super(context, interfaceMenuItemC0128b);
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((InterfaceMenuItemC0128b) this.f1507b).getItemId();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((InterfaceMenuItemC0128b) this.f1507b).getGroupId();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((InterfaceMenuItemC0128b) this.f1507b).getOrder();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((InterfaceMenuItemC0128b) this.f1507b).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        ((InterfaceMenuItemC0128b) this.f1507b).setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return ((InterfaceMenuItemC0128b) this.f1507b).getTitle();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((InterfaceMenuItemC0128b) this.f1507b).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return ((InterfaceMenuItemC0128b) this.f1507b).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((InterfaceMenuItemC0128b) this.f1507b).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        ((InterfaceMenuItemC0128b) this.f1507b).setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return ((InterfaceMenuItemC0128b) this.f1507b).getIcon();
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        ((InterfaceMenuItemC0128b) this.f1507b).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return ((InterfaceMenuItemC0128b) this.f1507b).getIntent();
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        ((InterfaceMenuItemC0128b) this.f1507b).setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        ((InterfaceMenuItemC0128b) this.f1507b).setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((InterfaceMenuItemC0128b) this.f1507b).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        ((InterfaceMenuItemC0128b) this.f1507b).setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((InterfaceMenuItemC0128b) this.f1507b).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        ((InterfaceMenuItemC0128b) this.f1507b).setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((InterfaceMenuItemC0128b) this.f1507b).isCheckable();
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        ((InterfaceMenuItemC0128b) this.f1507b).setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((InterfaceMenuItemC0128b) this.f1507b).isChecked();
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return ((InterfaceMenuItemC0128b) this.f1507b).setVisible(z);
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((InterfaceMenuItemC0128b) this.f1507b).isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        ((InterfaceMenuItemC0128b) this.f1507b).setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((InterfaceMenuItemC0128b) this.f1507b).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((InterfaceMenuItemC0128b) this.f1507b).hasSubMenu();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m11794a(((InterfaceMenuItemC0128b) this.f1507b).getSubMenu());
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((InterfaceMenuItemC0128b) this.f1507b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC0638d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((InterfaceMenuItemC0128b) this.f1507b).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        ((InterfaceMenuItemC0128b) this.f1507b).setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        ((InterfaceMenuItemC0128b) this.f1507b).setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0636b(view);
        }
        ((InterfaceMenuItemC0128b) this.f1507b).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        ((InterfaceMenuItemC0128b) this.f1507b).setActionView(i);
        View actionView = ((InterfaceMenuItemC0128b) this.f1507b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((InterfaceMenuItemC0128b) this.f1507b).setActionView(new C0636b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = ((InterfaceMenuItemC0128b) this.f1507b).getActionView();
        if (actionView instanceof C0636b) {
            return ((C0636b) actionView).m11705c();
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((InterfaceMenuItemC0128b) this.f1507b).mo11737a(actionProvider != null ? mo11702a(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0388d mo11739a = ((InterfaceMenuItemC0128b) this.f1507b).mo11739a();
        if (mo11739a instanceof C0635a) {
            return ((C0635a) mo11739a).f1576a;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((InterfaceMenuItemC0128b) this.f1507b).expandActionView();
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((InterfaceMenuItemC0128b) this.f1507b).collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((InterfaceMenuItemC0128b) this.f1507b).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((InterfaceMenuItemC0128b) this.f1507b).mo11736a(onActionExpandListener != null ? new C0637c(onActionExpandListener) : null);
        return this;
    }

    /* renamed from: a */
    public void m11710a(boolean z) {
        try {
            if (this.f1575c == null) {
                this.f1575c = ((InterfaceMenuItemC0128b) this.f1507b).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f1575c.invoke(this.f1507b, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    /* renamed from: a */
    C0635a mo11702a(ActionProvider actionProvider) {
        return new C0635a(this.f1504a, actionProvider);
    }

    /* renamed from: android.support.v7.view.menu.i$d */
    /* loaded from: classes.dex */
    private class MenuItem$OnMenuItemClickListenerC0638d extends C0625d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        MenuItem$OnMenuItemClickListenerC0638d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f1507b).onMenuItemClick(MenuItemC0634i.this.m11795a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.i$c */
    /* loaded from: classes.dex */
    private class C0637c extends C0625d<MenuItem.OnActionExpandListener> implements C0419q.InterfaceC0424e {
        C0637c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0424e
        /* renamed from: a */
        public boolean mo11704a(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1507b).onMenuItemActionExpand(MenuItemC0634i.this.m11795a(menuItem));
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0424e
        /* renamed from: b */
        public boolean mo11703b(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1507b).onMenuItemActionCollapse(MenuItemC0634i.this.m11795a(menuItem));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.view.menu.i$a */
    /* loaded from: classes.dex */
    public class C0635a extends AbstractC0388d {

        /* renamed from: a */
        final ActionProvider f1576a;

        public C0635a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1576a = actionProvider;
        }

        @Override // android.support.p002v4.view.AbstractC0388d
        /* renamed from: a */
        public View mo11709a() {
            return this.f1576a.onCreateActionView();
        }

        @Override // android.support.p002v4.view.AbstractC0388d
        /* renamed from: d */
        public boolean mo11707d() {
            return this.f1576a.onPerformDefaultAction();
        }

        @Override // android.support.p002v4.view.AbstractC0388d
        /* renamed from: e */
        public boolean mo11706e() {
            return this.f1576a.hasSubMenu();
        }

        @Override // android.support.p002v4.view.AbstractC0388d
        /* renamed from: a */
        public void mo11708a(SubMenu subMenu) {
            this.f1576a.onPrepareSubMenu(MenuItemC0634i.this.m11794a(subMenu));
        }
    }

    /* renamed from: android.support.v7.view.menu.i$b */
    /* loaded from: classes.dex */
    static class C0636b extends FrameLayout implements InterfaceC0609c {

        /* renamed from: a */
        final CollapsibleActionView f1578a;

        C0636b(View view) {
            super(view.getContext());
            this.f1578a = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // android.support.p013v7.view.InterfaceC0609c
        /* renamed from: a */
        public void mo11453a() {
            this.f1578a.onActionViewExpanded();
        }

        @Override // android.support.p013v7.view.InterfaceC0609c
        /* renamed from: b */
        public void mo11433b() {
            this.f1578a.onActionViewCollapsed();
        }

        /* renamed from: c */
        View m11705c() {
            return (View) this.f1578a;
        }
    }
}
