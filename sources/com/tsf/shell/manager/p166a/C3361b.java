package com.tsf.shell.manager.p166a;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.shell.manager.p166a.C3364c;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.a.b */
/* loaded from: classes.dex */
public class C3361b {

    /* renamed from: c */
    private C3364c f11124c;

    /* renamed from: a */
    private ArrayList<C3222g> f11122a = new ArrayList<>();

    /* renamed from: b */
    private ArrayList<InterfaceC3363a> f11123b = new ArrayList<>();

    /* renamed from: d */
    private C3364c.InterfaceC3365a f11125d = new C3364c.InterfaceC3365a() { // from class: com.tsf.shell.manager.a.b.1
        @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
        /* renamed from: a */
        public void mo2679a() {
            C3361b.this.m2753b();
        }

        @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
        /* renamed from: a */
        public void mo2677a(C3222g c3222g, boolean z) {
        }

        @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
        /* renamed from: a */
        public void mo2678a(C3222g c3222g) {
        }

        @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
        /* renamed from: b */
        public void mo2676b(C3222g c3222g, boolean z) {
        }

        @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
        /* renamed from: k_ */
        public void mo2675k_() {
            C3361b.this.m2753b();
        }
    };

    /* renamed from: com.tsf.shell.manager.a.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3363a {
        /* renamed from: a */
        void mo1842a();
    }

    public C3361b(C3364c c3364c) {
        this.f11124c = c3364c;
        c3364c.m2743a(this.f11125d);
    }

    /* renamed from: a */
    public void m2754a(InterfaceC3363a interfaceC3363a) {
        if (!this.f11123b.contains(interfaceC3363a)) {
            this.f11123b.add(interfaceC3363a);
        }
    }

    /* renamed from: b */
    public void m2752b(InterfaceC3363a interfaceC3363a) {
        this.f11123b.remove(interfaceC3363a);
    }

    /* renamed from: a */
    public void m2756a() {
        Iterator<InterfaceC3363a> it = this.f11123b.iterator();
        while (it.hasNext()) {
            it.next().mo1842a();
        }
    }

    /* renamed from: b */
    public void m2753b() {
        if (this.f11123b.size() > 0) {
            this.f11122a.clear();
            ArrayList<C3222g> m2736d = this.f11124c.m2736d();
            if (m2736d != null) {
                Iterator<C3222g> it = m2736d.iterator();
                while (it.hasNext()) {
                    C3222g next = it.next();
                    LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) next.m3534K();
                    if (launcherShortcutAppInfo == null || !launcherShortcutAppInfo.isHide) {
                        this.f11122a.add(next);
                    }
                }
                m2756a();
            }
        }
    }

    /* renamed from: c */
    public int m2751c() {
        if (this.f11122a == null) {
            return 0;
        }
        return this.f11122a.size();
    }

    /* renamed from: a */
    public C3222g m2755a(int i) {
        return this.f11122a.get(i);
    }

    /* renamed from: d */
    public ArrayList<C3222g> m2750d() {
        return this.f11122a;
    }
}
