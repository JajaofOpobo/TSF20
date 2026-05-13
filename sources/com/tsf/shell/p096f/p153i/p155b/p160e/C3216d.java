package com.tsf.shell.p096f.p153i.p155b.p160e;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.p030a.C0869e;
import com.tsf.shell.manager.bind.C3445b;
import com.tsf.shell.manager.p183o.C3560a;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.i.b.e.d */
/* loaded from: classes.dex */
public class C3216d extends AbstractC3202a {
    public C3216d(LauncherShortcut3DInfo launcherShortcut3DInfo, C3560a c3560a, boolean z) {
        super(launcherShortcut3DInfo, c3560a);
        if (z) {
            C3445b.f11406b.m2331a(this);
        } else if (C0869e.m10758l()) {
            mo1827k();
        } else {
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.d.1
                @Override // java.lang.Runnable
                public void run() {
                    C3216d.this.mo1827k();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
    /* renamed from: k */
    public void mo1827k() {
        this.f10495k.textures().clear();
        this.f10495k.textures().addElement(((LauncherShortcutStandardInfo) m3534K()).getTexture(mo3122aW(), m3159aE()));
        this.f10495k.visible(true);
    }

    @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b, com.tsf.shell.p096f.p153i.C3231c, com.tsf.shell.p096f.p153i.C3112b
    /* renamed from: g */
    public void mo3055g() {
        super.mo3055g();
    }

    /* renamed from: aW */
    public LauncherShortcutStandardInfo.ResourceControler mo3122aW() {
        return null;
    }

    @Override // com.tsf.shell.p096f.p153i.C3231c
    /* renamed from: a */
    public ArrayList<Integer> mo3079a(ArrayList<Integer> arrayList) {
        arrayList.add(1);
        if (rotation().f2528z != 0.0f) {
            arrayList.add(6);
        }
        arrayList.add(7);
        return arrayList;
    }
}
