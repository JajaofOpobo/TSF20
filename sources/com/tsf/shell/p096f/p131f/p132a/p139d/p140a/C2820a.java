package com.tsf.shell.p096f.p131f.p132a.p139d.p140a;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
/* renamed from: com.tsf.shell.f.f.a.d.a.a */
/* loaded from: classes.dex */
public class C2820a extends C2826c {

    /* renamed from: e */
    private Collator f9196e;

    public C2820a(int i) {
        super(C1306b.C1310d.drawer_sort_frequency, C1306b.C1315i.text_sort_most_used);
        this.f9202a = i;
        this.f9196e = Collator.getInstance(Locale.getDefault());
        this.f9203b = new Comparator<C3112b>() { // from class: com.tsf.shell.f.f.a.d.a.a.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public final int compare(C3112b c3112b, C3112b c3112b2) {
                if ((c3112b instanceof C3145b) && (c3112b2 instanceof C3145b)) {
                    return 0;
                }
                if (c3112b instanceof C3145b) {
                    return -1;
                }
                if (c3112b2 instanceof C3145b) {
                    return 1;
                }
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) ((C3222g) c3112b).m3534K();
                LauncherShortcutAppInfo launcherShortcutAppInfo2 = (LauncherShortcutAppInfo) ((C3222g) c3112b2).m3534K();
                if (launcherShortcutAppInfo.clickCount < launcherShortcutAppInfo2.clickCount) {
                    return 1;
                }
                if (launcherShortcutAppInfo.clickCount > launcherShortcutAppInfo2.clickCount) {
                    return -1;
                }
                return C2820a.this.f9196e.compare(c3112b.mo3100r(), c3112b2.mo3100r());
            }
        };
        this.f9204c = new Comparator<C0975i>() { // from class: com.tsf.shell.f.f.a.d.a.a.2
            @Override // java.util.Comparator
            /* renamed from: a */
            public final int compare(C0975i c0975i, C0975i c0975i2) {
                int m4585a = C2820a.this.m4585a(c0975i);
                int m4585a2 = C2820a.this.m4585a(c0975i2);
                if (m4585a < m4585a2) {
                    return -1;
                }
                if (m4585a > m4585a2) {
                    return 1;
                }
                if ((c0975i instanceof AbstractC3208b) && (c0975i2 instanceof AbstractC3208b)) {
                    ItemInfo K = ((AbstractC3208b) c0975i).m3534K();
                    return C2820a.this.f9196e.compare(((AbstractC3208b) c0975i2).m3534K().title, K.title);
                }
                return 0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m4585a(C0975i c0975i) {
        C3222g m2747a;
        if (!(c0975i instanceof C3222g)) {
            return -1;
        }
        C3222g c3222g = (C3222g) c0975i;
        if (c3222g.m3106bd() == null || c3222g.m3106bd().f11168a == null || (m2747a = C3359a.f11109w.m2716a().m2747a(c3222g.m3106bd().f11168a.getComponent())) == null || m2747a.m3534K() == null) {
            return 0;
        }
        return ((LauncherShortcutAppInfo) m2747a.m3534K()).clickCount;
    }
}
