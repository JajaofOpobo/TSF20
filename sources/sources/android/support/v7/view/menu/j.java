package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.view.d;
import android.support.v7.view.menu.i;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
@TargetApi(16)
class j extends i {
    j(Context context, android.support.v4.b.a.b bVar) {
        super(context, bVar);
    }

    @Override // android.support.v7.view.menu.i
    i.a a(ActionProvider actionProvider) {
        return new a(this.a, actionProvider);
    }

    class a extends i.a implements ActionProvider.VisibilityListener {
        d.b c;

        public a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // android.support.v4.view.d
        public View a(MenuItem menuItem) {
            return this.a.onCreateActionView(menuItem);
        }

        @Override // android.support.v4.view.d
        public boolean b() {
            return this.a.overridesItemVisibility();
        }

        @Override // android.support.v4.view.d
        public boolean c() {
            return this.a.isVisible();
        }

        @Override // android.support.v4.view.d
        public void a(d.b bVar) {
            this.c = bVar;
            ActionProvider actionProvider = this.a;
            if (bVar == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.c != null) {
                this.c.a(z);
            }
        }
    }
}
