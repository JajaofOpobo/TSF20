package android.support.p002v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.support.p002v4.p009d.C0173h;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;
/* renamed from: android.support.v4.app.m */
/* loaded from: classes.dex */
public class C0092m {

    /* renamed from: a */
    private final AbstractC0093n<?> f282a;

    /* renamed from: a */
    public static final C0092m m13622a(AbstractC0093n<?> abstractC0093n) {
        return new C0092m(abstractC0093n);
    }

    private C0092m(AbstractC0093n<?> abstractC0093n) {
        this.f282a = abstractC0093n;
    }

    /* renamed from: a */
    public AbstractC0094o m13626a() {
        return this.f282a.m13576i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment m13616a(String str) {
        return this.f282a.f286d.m13531b(str);
    }

    /* renamed from: a */
    public void m13623a(Fragment fragment) {
        this.f282a.f286d.m13550a(this.f282a, this.f282a, fragment);
    }

    /* renamed from: a */
    public View m13617a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f282a.f286d.mo12090a(view, str, context, attributeSet);
    }

    /* renamed from: b */
    public void m13613b() {
        this.f282a.f286d.m13514j();
    }

    /* renamed from: c */
    public Parcelable m13610c() {
        return this.f282a.f286d.m13515i();
    }

    /* renamed from: a */
    public void m13624a(Parcelable parcelable, List<Fragment> list) {
        this.f282a.f286d.m13557a(parcelable, list);
    }

    /* renamed from: d */
    public List<Fragment> m13609d() {
        return this.f282a.f286d.m13516h();
    }

    /* renamed from: e */
    public void m13608e() {
        this.f282a.f286d.m13513k();
    }

    /* renamed from: f */
    public void m13607f() {
        this.f282a.f286d.m13512l();
    }

    /* renamed from: g */
    public void m13606g() {
        this.f282a.f286d.m13511m();
    }

    /* renamed from: h */
    public void m13605h() {
        this.f282a.f286d.m13510n();
    }

    /* renamed from: i */
    public void m13604i() {
        this.f282a.f286d.m13509o();
    }

    /* renamed from: j */
    public void m13603j() {
        this.f282a.f286d.m13508p();
    }

    /* renamed from: k */
    public void m13602k() {
        this.f282a.f286d.m13507q();
    }

    /* renamed from: l */
    public void m13601l() {
        this.f282a.f286d.m13505s();
    }

    /* renamed from: a */
    public void m13625a(Configuration configuration) {
        this.f282a.f286d.m13561a(configuration);
    }

    /* renamed from: m */
    public void m13600m() {
        this.f282a.f286d.m13504t();
    }

    /* renamed from: a */
    public boolean m13619a(Menu menu, MenuInflater menuInflater) {
        return this.f282a.f286d.m13548a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean m13620a(Menu menu) {
        return this.f282a.f286d.m13549a(menu);
    }

    /* renamed from: a */
    public boolean m13618a(MenuItem menuItem) {
        return this.f282a.f286d.m13547a(menuItem);
    }

    /* renamed from: b */
    public boolean m13611b(MenuItem menuItem) {
        return this.f282a.f286d.m13533b(menuItem);
    }

    /* renamed from: b */
    public void m13612b(Menu menu) {
        this.f282a.f286d.m13534b(menu);
    }

    /* renamed from: n */
    public boolean m13599n() {
        return this.f282a.f286d.m13520f();
    }

    /* renamed from: o */
    public void m13598o() {
        this.f282a.m13574k();
    }

    /* renamed from: a */
    public void m13614a(boolean z) {
        this.f282a.m13586a(z);
    }

    /* renamed from: p */
    public void m13597p() {
        this.f282a.m13573l();
    }

    /* renamed from: q */
    public void m13596q() {
        this.f282a.m13572m();
    }

    /* renamed from: r */
    public C0173h<String, AbstractC0117v> m13595r() {
        return this.f282a.m13571n();
    }

    /* renamed from: a */
    public void m13621a(C0173h<String, AbstractC0117v> c0173h) {
        this.f282a.m13590a(c0173h);
    }

    /* renamed from: a */
    public void m13615a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f282a.m13583b(str, fileDescriptor, printWriter, strArr);
    }
}
