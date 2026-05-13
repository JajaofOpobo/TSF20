package com.tsf.shell.p096f.p153i.p155b.p160e;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.p030a.C0869e;
import com.tsf.C1306b;
import com.tsf.shell.C2234d;
import com.tsf.shell.C2244e;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.bind.C3444a;
import com.tsf.shell.manager.bind.C3445b;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p131f.p132a.p133a.C2685b;
import com.tsf.shell.utils.C4164a;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.shell.f.i.b.e.g */
/* loaded from: classes.dex */
public class C3222g extends AbstractC3202a implements C2685b.InterfaceC2688a {

    /* renamed from: a */
    private C3377f f10528a;

    /* renamed from: b */
    private boolean f10529b;

    /* renamed from: p */
    private boolean f10530p;

    public C3222g(LauncherShortcutAppInfo launcherShortcutAppInfo, C3377f c3377f, boolean z) {
        this(launcherShortcutAppInfo, C3566b.f11839a, c3377f, z);
    }

    public C3222g() {
        super(null, C3566b.f11839a);
        this.f10529b = false;
    }

    public C3222g(LauncherShortcutAppInfo launcherShortcutAppInfo, C3560a c3560a, C3377f c3377f, boolean z) {
        super(launcherShortcutAppInfo, c3560a);
        this.f10529b = false;
        this.f10528a = c3377f;
        if (launcherShortcutAppInfo != null) {
            mo3117a((ItemInfo) launcherShortcutAppInfo);
            launcherShortcutAppInfo.intent = c3377f.f11168a;
        }
        if (z) {
            C3445b.f11406b.m2331a(this);
        } else if (C0869e.m10758l()) {
            mo1827k();
        } else {
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.g.1
                @Override // java.lang.Runnable
                public void run() {
                    C3222g.this.mo1827k();
                }
            });
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildStart() {
        super.onDrawChildEnd();
        if (this.f10529b) {
            C3359a.f11108v.f7773f.m4343h().mo5610a(this);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b, com.tsf.shell.p096f.p153i.C3231c, com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildEnd() {
        super.onDrawChildEnd();
        if (this.f10529b) {
            C3359a.f11108v.f7773f.m4343h().mo5608b(this);
        }
    }

    /* renamed from: aX */
    public void m3113aX() {
        if (!this.f10529b) {
            this.f10529b = true;
            C3359a.f11108v.f7773f.m5629a((AbstractC3208b) this);
        }
    }

    /* renamed from: aY */
    public void m3112aY() {
        if (this.f10529b) {
            this.f10529b = false;
            C3359a.f11108v.f7773f.m5628b(this);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: a */
    public void mo3117a(ItemInfo itemInfo) {
        super.mo3117a(itemInfo);
        LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) itemInfo;
        if (this.f10528a != null) {
            launcherShortcutAppInfo.intent = this.f10528a.f11168a;
        }
        launcherShortcutAppInfo.setWidget(this);
    }

    /* renamed from: b */
    public void m3110b(ItemInfo itemInfo) {
        super.mo3117a(itemInfo);
        LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) itemInfo;
        if (this.f10528a != null) {
            launcherShortcutAppInfo.intent = this.f10528a.f11168a;
            launcherShortcutAppInfo.title = this.f10528a.f11172e;
        }
        launcherShortcutAppInfo.setWidget(this);
    }

    /* renamed from: aZ */
    public TextureElement m3111aZ() {
        m3163aA();
        return this.f10528a.m2701b();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: r */
    public String mo3100r() {
        return this.f10528a != null ? this.f10528a.f11172e : "";
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p133a.C2685b.InterfaceC2688a
    /* renamed from: r_ */
    public String mo3099r_() {
        return mo3100r();
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: s */
    public long mo3098s() {
        if (this.f10528a != null) {
            return this.f10528a.f11170c;
        }
        return 0L;
    }

    /* renamed from: a */
    public static C3377f m3116a(LauncherShortcut3DInfo launcherShortcut3DInfo) {
        ResolveInfo resolveInfo;
        ResolveInfo resolveInfo2 = null;
        Intent intent = launcherShortcut3DInfo.intent;
        ComponentName component = intent.getComponent();
        C3377f m2769b = C3444a.m2356c().m2769b(component);
        if (m2769b == null) {
            C3377f m2775a = C3444a.m2356c().m2775a(component);
            if (m2775a == null) {
                PackageManager packageManager = C0853a.m10856d().getPackageManager();
                Intent intent2 = new Intent(intent.getAction(), (Uri) null);
                intent2.addCategory("android.intent.category.LAUNCHER");
                intent2.setPackage(component.getPackageName());
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo3 : queryIntentActivities) {
                        if (!new ComponentName(resolveInfo3.activityInfo.packageName, resolveInfo3.activityInfo.name).equals(component)) {
                            resolveInfo3 = resolveInfo2;
                        }
                        resolveInfo2 = resolveInfo3;
                    }
                    resolveInfo = resolveInfo2;
                } else {
                    resolveInfo = null;
                }
                ResolveInfo resolveActivity = resolveInfo == null ? packageManager.resolveActivity(intent, 0) : resolveInfo;
                if (resolveActivity != null) {
                    C3377f c3377f = new C3377f(resolveActivity);
                    C3444a.m2356c().m2762d(c3377f);
                    return c3377f;
                }
                C3377f c3377f2 = new C3377f(component, launcherShortcut3DInfo.title);
                C3444a.m2356c().m2773a(c3377f2);
                return c3377f2;
            }
            return m2775a;
        }
        return m2769b;
    }

    /* renamed from: ba */
    public C3222g m3109ba() {
        LauncherShortcutAppInfo launcherShortcutAppInfo = new LauncherShortcutAppInfo();
        launcherShortcutAppInfo.title = m3106bd().f11172e;
        C3222g c3222g = new C3222g(launcherShortcutAppInfo, this.f10528a, false);
        c3222g.position().setAll(position().f2526x, position().f2527y, 0.0f);
        c3222g.scale().setAll(1.0f, 1.0f, 1.0f);
        c3222g.rotation().setAll(0.0f, 0.0f, 0.0f);
        return c3222g;
    }

    /* renamed from: bb */
    public LauncherShortcutAppInfo m3108bb() {
        LauncherShortcutAppInfo launcherShortcutAppInfo = new LauncherShortcutAppInfo();
        launcherShortcutAppInfo.title = m3106bd().f11172e;
        launcherShortcutAppInfo.intent = this.f10528a.f11168a;
        return launcherShortcutAppInfo;
    }

    /* renamed from: bc */
    public LauncherShortcutAppInfo m3107bc() {
        LauncherShortcutAppInfo launcherShortcutAppInfo = new LauncherShortcutAppInfo();
        launcherShortcutAppInfo.title = m3106bd().f11172e;
        launcherShortcutAppInfo.intent = this.f10528a.f11168a;
        launcherShortcutAppInfo.onUpdateName(launcherShortcutAppInfo.title, true);
        return launcherShortcutAppInfo;
    }

    /* renamed from: bd */
    public C3377f m3106bd() {
        return this.f10528a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
    /* renamed from: k */
    public void mo1827k() {
        this.f10495k.textures().clear();
        this.f10495k.textures().addElement(LauncherShortcutAppInfo.getTexture(m3534K() == null ? null : (LauncherShortcutAppInfo) m3534K(), this.f10498n, this.f10528a));
        this.f10495k.visible(true);
    }

    /* renamed from: be */
    public boolean m3105be() {
        if (this.f10528a == null) {
            return true;
        }
        return this.f10528a.m2699c();
    }

    /* renamed from: bf */
    public boolean m3104bf() {
        if (this.f10528a == null) {
            return true;
        }
        return this.f10528a.f11174g;
    }

    @Override // com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: C */
    public void mo3118C() {
        super.mo3118C();
    }

    /* renamed from: bg */
    public void m3103bg() {
        if (!m3105be()) {
            C4164a.m709a(m3106bd().f11169b.getPackageName());
        } else {
            C2244e.m6020a(C1306b.C1315i.notic_uninstall_error);
        }
    }

    /* renamed from: bh */
    public void m3102bh() {
        C4164a.m710a(C0853a.m10856d(), m3106bd().f11169b.getPackageName());
    }

    /* renamed from: aV */
    public void mo3114aV() {
        if (m3106bd() != null) {
            m3106bd().m2706a();
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
    /* renamed from: l */
    public void mo3094l() {
        super.mo3094l();
        if ((m3541A() == null ? true : m3541A().mo3301a((AbstractC3208b) this)) && m3106bd() != null) {
            m3106bd().m2706a();
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b, com.tsf.shell.p096f.p153i.C3231c, com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: g */
    public void mo3055g() {
        super.mo3055g();
        m3112aY();
    }

    @Override // com.tsf.shell.p096f.p153i.C3231c, com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: n_ */
    public void mo3052n_() {
        C2234d.m6033a().m6030a("WidgetShortcutApp");
        super.mo3052n_();
    }

    @Override // com.tsf.shell.p096f.p153i.C3231c, com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: c */
    public void mo3056c() {
        C2234d.m6033a().m6027b("WidgetShortcutApp");
        super.mo3056c();
    }

    @Override // com.tsf.shell.p096f.p153i.C3231c
    /* renamed from: a */
    public ArrayList<Integer> mo3079a(ArrayList<Integer> arrayList) {
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(3);
        if (rotation().f2528z != 0.0f) {
            arrayList.add(6);
        }
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(5);
        return arrayList;
    }

    /* renamed from: a */
    public void m3115a(boolean z) {
        this.f10530p = z;
    }

    /* renamed from: bi */
    public boolean m3101bi() {
        return this.f10530p;
    }
}
