package android.support.p013v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b;
import android.support.p002v4.view.AbstractC0388d;
import android.support.p013v7.view.menu.MenuItemC0634i;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(16)
/* renamed from: android.support.v7.view.menu.j */
/* loaded from: classes.dex */
public class C0639j extends MenuItemC0634i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0639j(Context context, InterfaceMenuItemC0128b interfaceMenuItemC0128b) {
        super(context, interfaceMenuItemC0128b);
    }

    @Override // android.support.p013v7.view.menu.MenuItemC0634i
    /* renamed from: a */
    MenuItemC0634i.C0635a mo11702a(ActionProvider actionProvider) {
        return new ActionProvider$VisibilityListenerC0640a(this.f1504a, actionProvider);
    }

    /* renamed from: android.support.v7.view.menu.j$a */
    /* loaded from: classes.dex */
    class ActionProvider$VisibilityListenerC0640a extends MenuItemC0634i.C0635a implements ActionProvider.VisibilityListener {

        /* renamed from: c */
        AbstractC0388d.InterfaceC0390b f1581c;

        public ActionProvider$VisibilityListenerC0640a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // android.support.p002v4.view.AbstractC0388d
        /* renamed from: a */
        public View mo11700a(MenuItem menuItem) {
            return this.f1576a.onCreateActionView(menuItem);
        }

        @Override // android.support.p002v4.view.AbstractC0388d
        /* renamed from: b */
        public boolean mo11699b() {
            return this.f1576a.overridesItemVisibility();
        }

        @Override // android.support.p002v4.view.AbstractC0388d
        /* renamed from: c */
        public boolean mo11698c() {
            return this.f1576a.isVisible();
        }

        @Override // android.support.p002v4.view.AbstractC0388d
        /* renamed from: a */
        public void mo11701a(AbstractC0388d.InterfaceC0390b interfaceC0390b) {
            this.f1581c = interfaceC0390b;
            ActionProvider actionProvider = this.f1576a;
            if (interfaceC0390b == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.f1581c != null) {
                this.f1581c.mo11711a(z);
            }
        }
    }
}
