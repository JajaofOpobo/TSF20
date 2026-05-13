package com.censivn.C3DEngine.p030a;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f;
import com.censivn.C3DEngine.p056d.InterfaceC1082a;
import com.censivn.C3DEngine.p058f.C1104b;
import com.censivn.C3DEngine.p058f.C1105c;
import com.tsf.shell.utils.C4176l;
import java.util.ArrayList;
/* renamed from: com.censivn.C3DEngine.a.g */
/* loaded from: classes.dex */
public class C0872g implements InterfaceC0972f, InterfaceC1082a {

    /* renamed from: b */
    private C1104b f2501b;

    /* renamed from: c */
    private C1105c f2502c;

    /* renamed from: d */
    private boolean f2503d;

    /* renamed from: a */
    private ArrayList<C0975i> f2500a = new ArrayList<>();

    /* renamed from: e */
    private Color4 f2504e = new Color4(255, 255, 255, 255);

    /* renamed from: g */
    private float f2506g = 0.0f;

    /* renamed from: f */
    private float f2505f = 10.0f;

    /* renamed from: h */
    private boolean f2507h = false;

    /* renamed from: a */
    public void m10754a() {
        m10753a(this);
        this.f2500a = new ArrayList<>();
        this.f2501b = new C1104b();
        this.f2502c = new C1105c(0, 0, 0, 255, this);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public void addChild(C0975i c0975i) {
        if (!C0869e.m10758l()) {
            C4176l.m668a(this, "scene addChild is worng thread:" + c0975i);
        }
        if (!this.f2500a.contains(c0975i)) {
            this.f2500a.add(c0975i);
            c0975i.parent(this);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public boolean removeChild(C0975i c0975i) {
        if (!C0869e.m10758l()) {
            C4176l.m668a(this, "scene removeChild is worng thread:" + c0975i);
        }
        boolean remove = this.f2500a.remove(c0975i);
        if (remove) {
            c0975i.parent(null);
        }
        return remove;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public C0975i getChildAt(int i) {
        return this.f2500a.get(i);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public int numChildren() {
        return this.f2500a.size();
    }

    /* renamed from: b */
    public C1104b m10751b() {
        return this.f2501b;
    }

    /* renamed from: a */
    public void m10752a(boolean z) {
        this.f2503d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m10750c() {
        m10754a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public ArrayList<C0975i> m10749d() {
        return this.f2500a;
    }

    /* renamed from: a */
    private void m10753a(InterfaceC0972f interfaceC0972f) {
        for (int numChildren = interfaceC0972f.numChildren() - 1; numChildren >= 0; numChildren--) {
            C0975i childAt = interfaceC0972f.getChildAt(numChildren);
            childAt.destroy();
            if (childAt instanceof C0980j) {
                m10753a((C0980j) childAt);
            }
        }
    }

    @Override // com.censivn.C3DEngine.p056d.InterfaceC1082a
    /* renamed from: e */
    public void mo9899e() {
    }
}
