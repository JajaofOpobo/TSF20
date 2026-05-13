package android.support.p013v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.AbstractC0607b;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: android.support.v7.app.i */
/* loaded from: classes.dex */
public class DialogC0587i extends Dialog implements InterfaceC0578c {

    /* renamed from: a */
    private AbstractC0579d f1309a;

    public DialogC0587i(Context context, int i) {
        super(context, m11949a(context, i));
        m11951a().mo11960a((Bundle) null);
        m11951a().mo11957h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m11951a().mo11980g();
        super.onCreate(bundle);
        m11951a().mo11960a(bundle);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m11951a().mo11987b(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m11951a().mo11989a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m11951a().mo11988a(view, layoutParams);
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        return m11951a().mo11994a(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m11951a().mo11972a(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m11951a().mo11972a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m11951a().mo11985b(view, layoutParams);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m11951a().mo11984c();
    }

    /* renamed from: a */
    public boolean m11950a(int i) {
        return m11951a().mo11983c(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m11951a().mo11981e();
    }

    /* renamed from: a */
    public AbstractC0579d m11951a() {
        if (this.f1309a == null) {
            this.f1309a = AbstractC0579d.m11992a(this, this);
        }
        return this.f1309a;
    }

    /* renamed from: a */
    private static int m11949a(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C0535a.C0536a.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
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
}
