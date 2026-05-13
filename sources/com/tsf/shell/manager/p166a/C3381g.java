package com.tsf.shell.manager.p166a;

import android.content.ComponentName;
import android.content.SharedPreferences;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.shell.ShellActivity;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p166a.C3364c;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.utils.C4171h;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.a.g */
/* loaded from: classes.dex */
public class C3381g {

    /* renamed from: e */
    private static SharedPreferences f11180e;

    /* renamed from: b */
    private ArrayList<C3384b> f11182b = new ArrayList<>();

    /* renamed from: c */
    private ArrayList<C3222g> f11183c = new ArrayList<>();

    /* renamed from: a */
    private ArrayList<C3222g> f11181a = new ArrayList<>();

    /* renamed from: d */
    private C3383a f11184d = new C3383a() { // from class: com.tsf.shell.manager.a.g.1
        @Override // com.tsf.shell.manager.p166a.C3381g.C3383a, com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
        /* renamed from: b */
        public void mo2676b(C3222g c3222g, boolean z) {
            if (C3381g.this.f11181a.contains(c3222g)) {
                C3381g.this.f11181a.remove(c3222g);
                C3381g.this.m2680f();
            }
        }
    };

    /* renamed from: com.tsf.shell.manager.a.g$b */
    /* loaded from: classes.dex */
    public static class C3384b {
        /* renamed from: a */
        public void mo2674a(ArrayList<C3222g> arrayList) {
        }
    }

    /* renamed from: com.tsf.shell.manager.a.g$a */
    /* loaded from: classes.dex */
    class C3383a implements C3364c.InterfaceC3365a {
        C3383a() {
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
        }

        @Override // com.tsf.shell.manager.p166a.C3364c.InterfaceC3365a
        /* renamed from: a */
        public void mo2679a() {
        }
    }

    /* renamed from: a */
    public void m2689a(C3384b c3384b) {
        if (!this.f11182b.contains(c3384b)) {
            this.f11182b.add(c3384b);
        }
    }

    /* renamed from: a */
    public void m2693a() {
        C3359a.f11109w.m2716a().m2743a(this.f11184d);
        Iterator<Integer> it = C4171h.m680a(m2686b(), ",", false).iterator();
        while (it.hasNext()) {
            C3222g m2685b = m2685b(it.next().intValue());
            if (m2685b != null) {
                if (this.f11181a.size() < 12) {
                    this.f11181a.add(m2685b);
                } else {
                    return;
                }
            }
        }
        m2681e();
    }

    /* renamed from: e */
    private void m2681e() {
        if (this.f11181a.isEmpty()) {
            this.f11181a.add(C3359a.f11109w.m2716a().m2747a(new ComponentName(C0853a.m10856d().getPackageName(), ShellActivity.class.getName())));
        }
    }

    /* renamed from: b */
    private C3222g m2685b(int i) {
        return C3359a.f11109w.m2716a().m2748a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m2680f() {
        String str = "";
        Iterator<C3222g> it = this.f11181a.iterator();
        while (it.hasNext()) {
            C3222g next = it.next();
            str = next.m3534K() != null ? str + next.m3534K().f2532id + "," : str;
        }
        m2687a(str);
        Iterator<C3384b> it2 = this.f11182b.iterator();
        while (it2.hasNext()) {
            it2.next().mo2674a(this.f11181a);
        }
    }

    /* renamed from: a */
    public void m2691a(LauncherShortcutAppInfo launcherShortcutAppInfo) {
        if (launcherShortcutAppInfo.getWidget() != null && (launcherShortcutAppInfo.getWidget() instanceof C3222g)) {
            C3222g c3222g = (C3222g) launcherShortcutAppInfo.getWidget();
            if (!m2690a(c3222g)) {
                this.f11181a.add(c3222g);
                while (this.f11181a.size() > 12) {
                    this.f11181a.remove(0);
                }
                m2680f();
            } else if (this.f11181a.get(this.f11181a.size() - 1) != c3222g) {
                this.f11181a.remove(c3222g);
                this.f11181a.add(c3222g);
                m2680f();
            }
        }
    }

    /* renamed from: a */
    public ArrayList<C3222g> m2692a(int i) {
        this.f11183c.clear();
        int size = this.f11181a.size();
        if (i > size) {
            i = size;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f11183c.add(this.f11181a.get((size - i2) - 1));
        }
        return this.f11183c;
    }

    /* renamed from: a */
    private boolean m2690a(C3222g c3222g) {
        Iterator<C3222g> it = this.f11181a.iterator();
        while (it.hasNext()) {
            if (it.next() == c3222g) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static String m2686b() {
        return m2682d().getString("config", "");
    }

    /* renamed from: a */
    public static void m2687a(String str) {
        SharedPreferences.Editor m2683c = m2683c();
        m2683c.putString("config", str);
        m2683c.commit();
    }

    /* renamed from: c */
    public static SharedPreferences.Editor m2683c() {
        return m2682d().edit();
    }

    /* renamed from: d */
    public static SharedPreferences m2682d() {
        if (f11180e == null) {
            f11180e = C0853a.m10856d().getSharedPreferences("recent", 0);
        }
        return f11180e;
    }
}
