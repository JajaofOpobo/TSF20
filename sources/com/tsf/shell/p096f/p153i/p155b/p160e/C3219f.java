package com.tsf.shell.p096f.p153i.p155b.p160e;

import android.graphics.Rect;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.p030a.C0869e;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.Home;
import com.tsf.shell.manager.bind.C3445b;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.utils.C4164a;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.i.b.e.f */
/* loaded from: classes.dex */
public class C3219f extends AbstractC3202a {
    public C3219f(LauncherShortcut3DInfo launcherShortcut3DInfo, C3560a c3560a, boolean z) {
        super(launcherShortcut3DInfo, c3560a);
        if (z) {
            C3445b.f11406b.m2331a(this);
        } else if (C0869e.m10758l()) {
            mo1827k();
        } else {
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.f.1
                @Override // java.lang.Runnable
                public void run() {
                    C3219f.this.mo1827k();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
    /* renamed from: k */
    public void mo1827k() {
        this.f10495k.textures().clear();
        this.f10495k.textures().addElement(((LauncherShortcutStandardInfo) m3534K()).getTexture(m3159aE()));
        this.f10495k.visible(true);
    }

    /* renamed from: aV */
    public void m3119aV() {
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) m3534K();
        if (launcherShortcut3DInfo.packagename != null) {
            C4164a.m710a(C0853a.m10856d(), launcherShortcut3DInfo.packagename);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
    /* renamed from: l */
    public void mo3094l() {
        super.mo3094l();
        if (m3541A() == null ? true : m3541A().mo3301a((AbstractC3208b) this)) {
            C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.i.b.e.f.2
                @Override // java.lang.Runnable
                public void run() {
                    LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) C3219f.this.m3534K();
                    try {
                        C3219f c3219f = C3219f.this;
                        float[] m612a = C4189x.m612a(c3219f.position().f2526x, c3219f.position().f2527y);
                        launcherShortcut3DInfo.intent.setSourceBounds(new Rect((int) (m612a[0] + c3219f.minX()), (int) (m612a[1] + c3219f.minY()), (int) (m612a[0] + c3219f.maxX()), (int) (c3219f.maxY() + m612a[1])));
                        Home.m6177b().m6182a(launcherShortcut3DInfo.intent, (Object) null);
                    } catch (Exception e) {
                        e.printStackTrace();
                        C2244e.m6012a(C0853a.m10856d().getString(C1306b.C1315i.activity_not_found));
                    }
                }
            });
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b, com.tsf.shell.p096f.p153i.C3231c, com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: g */
    public void mo3055g() {
        super.mo3055g();
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
        return arrayList;
    }
}
