package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.x;
import android.support.v7.view.b;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AppCompatActivity extends FragmentActivity implements ac.a, c {
    private d m;
    private int n = 0;
    private boolean o;
    private Resources p;

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        d dVarJ = j();
        dVarJ.g();
        dVarJ.a(bundle);
        if (dVarJ.h() && this.n != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.n, false);
            } else {
                setTheme(this.n);
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        this.n = i;
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        j().b(bundle);
    }

    public ActionBar g() {
        return j().a();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return j().b();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        j().b(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        j().a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j().a(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j().b(view, layoutParams);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j().a(configuration);
        if (this.p != null) {
            this.p.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        j().c();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        j().d();
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        return j().a(i);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar actionBarG = g();
        if (menuItem.getItemId() == 16908332 && actionBarG != null && (actionBarG.a() & 4) != 0) {
            return h();
        }
        return false;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        j().f();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        j().a(charSequence);
    }

    @Override // android.support.v4.app.FragmentActivity
    public void d() {
        j().e();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        j().e();
    }

    @Override // android.support.v7.app.c
    public void a(android.support.v7.view.b bVar) {
    }

    @Override // android.support.v7.app.c
    public void b(android.support.v7.view.b bVar) {
    }

    @Override // android.support.v7.app.c
    public android.support.v7.view.b a(b.a aVar) {
        return null;
    }

    public void a(ac acVar) {
        acVar.a((Activity) this);
    }

    public void b(ac acVar) {
    }

    public boolean h() {
        Intent intentA = a();
        if (intentA != null) {
            if (a(intentA)) {
                ac acVarA = ac.a((Context) this);
                a(acVarA);
                b(acVarA);
                acVarA.a();
                try {
                    android.support.v4.app.a.a(this);
                } catch (IllegalStateException e) {
                    finish();
                }
            } else {
                b(intentA);
            }
            return true;
        }
        return false;
    }

    @Override // android.support.v4.app.ac.a
    public Intent a() {
        return x.a(this);
    }

    public boolean a(Intent intent) {
        return x.a(this, intent);
    }

    public void b(Intent intent) {
        x.b(this, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        i();
    }

    @Deprecated
    public void i() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        j().c(bundle);
    }

    public d j() {
        if (this.m == null) {
            this.m = d.a(this, this);
        }
        return this.m;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (android.support.v4.view.g.a(keyEvent, 4096) && keyEvent.getUnicodeChar(keyEvent.getMetaState() & (-28673)) == 60) {
            int action = keyEvent.getAction();
            if (action == 0) {
                ActionBar actionBarG = g();
                if (actionBarG != null && actionBarG.b() && actionBarG.g()) {
                    this.o = true;
                    return true;
                }
            } else if (action == 1 && this.o) {
                this.o = false;
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.p == null && android.support.v7.widget.ac.a()) {
            this.p = new android.support.v7.widget.ac(this, super.getResources());
        }
        return this.p == null ? super.getResources() : this.p;
    }
}
