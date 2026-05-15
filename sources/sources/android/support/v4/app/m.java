package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class m {
    private final n<?> a;

    public static final m a(n<?> nVar) {
        return new m(nVar);
    }

    private m(n<?> nVar) {
        this.a = nVar;
    }

    public o a() {
        return this.a.i();
    }

    Fragment a(String str) {
        return this.a.d.b(str);
    }

    public void a(Fragment fragment) {
        this.a.d.a(this.a, this.a, fragment);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.d.a(view, str, context, attributeSet);
    }

    public void b() {
        this.a.d.j();
    }

    public Parcelable c() {
        return this.a.d.i();
    }

    public void a(Parcelable parcelable, List<Fragment> list) {
        this.a.d.a(parcelable, list);
    }

    public List<Fragment> d() {
        return this.a.d.h();
    }

    public void e() {
        this.a.d.k();
    }

    public void f() {
        this.a.d.l();
    }

    public void g() {
        this.a.d.m();
    }

    public void h() {
        this.a.d.n();
    }

    public void i() {
        this.a.d.o();
    }

    public void j() {
        this.a.d.p();
    }

    public void k() {
        this.a.d.q();
    }

    public void l() {
        this.a.d.s();
    }

    public void a(Configuration configuration) {
        this.a.d.a(configuration);
    }

    public void m() {
        this.a.d.t();
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        return this.a.d.a(menu, menuInflater);
    }

    public boolean a(Menu menu) {
        return this.a.d.a(menu);
    }

    public boolean a(MenuItem menuItem) {
        return this.a.d.a(menuItem);
    }

    public boolean b(MenuItem menuItem) {
        return this.a.d.b(menuItem);
    }

    public void b(Menu menu) {
        this.a.d.b(menu);
    }

    public boolean n() {
        return this.a.d.f();
    }

    public void o() {
        this.a.k();
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public void p() {
        this.a.l();
    }

    public void q() {
        this.a.m();
    }

    public android.support.v4.d.h<String, v> r() {
        return this.a.n();
    }

    public void a(android.support.v4.d.h<String, v> hVar) {
        this.a.a(hVar);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.a.b(str, fileDescriptor, printWriter, strArr);
    }
}
