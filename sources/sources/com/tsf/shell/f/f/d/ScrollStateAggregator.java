package com.tsf.shell.f.f.d;

import android.annotation.SuppressLint;
import com.censivn.C3DEngine.b.g.TweenParams;
import com.tsf.shell.f.f.d.a.ScrollBounceHandler;
import com.tsf.shell.f.f.WorkspacePage;
import com.tsf.shell.f.f.PageTouchHandler;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ScrollStateAggregator {
    private PageTouchHandler a;
    private ScrollBounceHandler b;

    public ScrollStateAggregator(PageTouchHandler nVar) {
        this.a = nVar;
        a(new com.tsf.shell.f.f.d.a.ScrollBounceAnimation());
    }

    public void a(ScrollBounceHandler bVar) {
        bVar.a(this.a);
        bVar.a(this);
        bVar.a(this.a.u());
        this.b = bVar;
    }

    public void a(WorkspacePage gVar) {
        this.b.a(gVar);
    }

    public void a(TweenParams dVar, WorkspacePage gVar) {
        this.b.a(dVar, gVar);
    }

    public void a(WorkspacePage gVar, com.censivn.C3DEngine.b.g._b.ITweenTarget aVar) {
        this.b.a(gVar, aVar);
    }

    public void b(WorkspacePage gVar, com.censivn.C3DEngine.b.g._b.ITweenTarget aVar) {
        this.b.b(gVar, aVar);
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void a(PageTouchHandler nVar, int i, ArrayList<WorkspacePage> arrayList, WorkspacePage gVar, boolean z) {
        ScrollStateAggregator();
        this.b.a(i, arrayList, gVar, z);
    }

    public void a(PageTouchHandler nVar, ArrayList<WorkspacePage> arrayList, WorkspacePage gVar, boolean z) {
        this.b.a(arrayList, gVar, z);
    }

    @SuppressLint({"WrongCall"})
    public void d() {
        this.b.a();
    }

    public void a(int i, int i2) {
        this.b.a(i, i2);
    }

    public void a(int i) {
        this.b.a(i);
    }

    public void a(float f, float f2, float f3, float f4, boolean z) {
        this.b.a(f, f2, f3, f4, z);
    }

    public int a(int i, float f, float f2, float f3, float f4, boolean z) {
        return this.b.a(i, f, f2, f3, f4, z);
    }

    public float b(int i) {
        return this.b.b(i);
    }
}
