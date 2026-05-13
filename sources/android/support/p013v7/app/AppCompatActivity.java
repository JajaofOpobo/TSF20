package android.support.p013v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v4.app.C0062a;
import android.support.p002v4.app.C0067ac;
import android.support.p002v4.app.C0121x;
import android.support.p002v4.app.FragmentActivity;
import android.support.p002v4.view.C0396g;
import android.support.p013v7.view.AbstractC0607b;
import android.support.p013v7.widget.C0729ac;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: android.support.v7.app.AppCompatActivity */
/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements C0067ac.InterfaceC0068a, InterfaceC0578c {

    /* renamed from: m */
    private AbstractC0579d f1113m;

    /* renamed from: n */
    private int f1114n = 0;

    /* renamed from: o */
    private boolean f1115o;

    /* renamed from: p */
    private Resources f1116p;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.support.p002v4.app.AbstractActivityC0087h, android.app.Activity
    public void onCreate(Bundle bundle) {
        AbstractC0579d m12106j = m12106j();
        m12106j.mo11980g();
        m12106j.mo11960a(bundle);
        if (m12106j.mo11957h() && this.f1114n != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f1114n, false);
            } else {
                setTheme(this.f1114n);
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        this.f1114n = i;
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m12106j().mo11986b(bundle);
    }

    /* renamed from: g */
    public ActionBar m12109g() {
        return m12106j().mo11977a();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m12106j().mo11971b();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m12106j().mo11987b(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m12106j().mo11989a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m12106j().mo11988a(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m12106j().mo11985b(view, layoutParams);
    }

    @Override // android.support.p002v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m12106j().mo11990a(configuration);
        if (this.f1116p != null) {
            this.f1116p.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        m12106j().mo11984c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m12106j().mo11982d();
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        return m12106j().mo11994a(i);
    }

    @Override // android.support.p002v4.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar m12109g = m12109g();
        if (menuItem.getItemId() == 16908332 && m12109g != null && (m12109g.mo11925a() & 4) != 0) {
            return m12108h();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m12106j().mo11968f();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m12106j().mo11972a(charSequence);
    }

    @Override // android.support.p002v4.app.FragmentActivity
    /* renamed from: d */
    public void mo12110d() {
        m12106j().mo11981e();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m12106j().mo11981e();
    }

    @Override // android.support.p013v7.app.InterfaceC0578c
    /* renamed from: a */
    public void mo11947a(AbstractC0607b abstractC0607b) {
    }

    @Override // android.support.p013v7.app.InterfaceC0578c
    /* renamed from: b */
    public void mo11946b(AbstractC0607b abstractC0607b) {
    }

    @Override // android.support.p013v7.app.InterfaceC0578c
    /* renamed from: a */
    public AbstractC0607b mo11948a(AbstractC0607b.InterfaceC0608a interfaceC0608a) {
        return null;
    }

    /* renamed from: a */
    public void m12113a(C0067ac c0067ac) {
        c0067ac.m13692a((Activity) this);
    }

    /* renamed from: b */
    public void m12111b(C0067ac c0067ac) {
    }

    /* renamed from: h */
    public boolean m12108h() {
        Intent mo12115a = mo12115a();
        if (mo12115a != null) {
            if (m12114a(mo12115a)) {
                C0067ac m13690a = C0067ac.m13690a((Context) this);
                m12113a(m13690a);
                m12111b(m13690a);
                m13690a.m13693a();
                try {
                    C0062a.m13700a(this);
                } catch (IllegalStateException e) {
                    finish();
                }
            } else {
                m12112b(mo12115a);
            }
            return true;
        }
        return false;
    }

    @Override // android.support.p002v4.app.C0067ac.InterfaceC0068a
    /* renamed from: a */
    public Intent mo12115a() {
        return C0121x.m13439a(this);
    }

    /* renamed from: a */
    public boolean m12114a(Intent intent) {
        return C0121x.m13438a(this, intent);
    }

    /* renamed from: b */
    public void m12112b(Intent intent) {
        C0121x.m13435b(this, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m12107i();
    }

    @Deprecated
    /* renamed from: i */
    public void m12107i() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // android.support.p002v4.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m12106j().mo11959c(bundle);
    }

    /* renamed from: j */
    public AbstractC0579d m12106j() {
        if (this.f1113m == null) {
            this.f1113m = AbstractC0579d.m11993a(this, this);
        }
        return this.f1113m;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (C0396g.m12644a(keyEvent, 4096) && keyEvent.getUnicodeChar(keyEvent.getMetaState() & (-28673)) == 60) {
            int action = keyEvent.getAction();
            if (action == 0) {
                ActionBar m12109g = m12109g();
                if (m12109g != null && m12109g.mo11914b() && m12109g.mo11898g()) {
                    this.f1115o = true;
                    return true;
                }
            } else if (action == 1 && this.f1115o) {
                this.f1115o = false;
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f1116p == null && C0729ac.m11262a()) {
            this.f1116p = new C0729ac(this, super.getResources());
        }
        return this.f1116p == null ? super.getResources() : this.f1116p;
    }
}
