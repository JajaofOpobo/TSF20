package com.tsf.shell.f.f.d.a;

import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.g.TweenParams;
import com.tsf.shell.f.f.WorkspacePage;
import com.tsf.shell.f.f.PageTouchHandler;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public interface ScrollBounceHandler {
    int a(int i, float f, float f2, float f3, float f4, boolean z);

    void a();

    void a(float f, float f2, float f3, float f4, boolean z);

    void a(int i);

    void a(int i, int i2);

    void a(int i, ArrayList<WorkspacePage> arrayList, WorkspacePage gVar, boolean z);

    void a(BaseRenderable jVar);

    void a(TweenParams dVar, WorkspacePage gVar);

    void a(com.tsf.shell.f.f.d.ScrollStateAggregator aVar);

    void a(WorkspacePage gVar);

    void a(WorkspacePage gVar, com.censivn.C3DEngine.b.g._b.ITweenTarget aVar);

    void a(PageTouchHandler nVar);

    void a(ArrayList<WorkspacePage> arrayList, WorkspacePage gVar, boolean z);

    float b(int i);

    void b(WorkspacePage gVar, com.censivn.C3DEngine.b.g._b.ITweenTarget aVar);
}
