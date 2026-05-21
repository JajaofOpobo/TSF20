package com.tsf.shell.f.f.a.d.a;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.b;
import com.tsf.shell.f.i.b.e.g;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends c {
    private Collator e;

    public a(int i) {
        super(b.d.drawer_sort_frequency, b.i.text_sort_most_used);
        this.a = i;
        this.e = Collator.getInstance(Locale.getDefault());
        this.b = new Comparator<com.tsf.shell.f.i.b>() { // from class: com.tsf.shell.f.f.a.d.a.a.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(com.tsf.shell.f.i.b bVar, com.tsf.shell.f.i.b bVar2) {
                if ((bVar instanceof com.tsf.shell.f.i.b.d.b) && (bVar2 instanceof com.tsf.shell.f.i.b.d.b)) {
                    return 0;
                }
                if (bVar instanceof com.tsf.shell.f.i.b.d.b) {
                    return -1;
                }
                if (bVar2 instanceof com.tsf.shell.f.i.b.d.b) {
                    return 1;
                }
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) ((g) bVar).K();
                LauncherShortcutAppInfo launcherShortcutAppInfo2 = (LauncherShortcutAppInfo) ((g) bVar2).K();
                if (launcherShortcutAppInfo.clickCount < launcherShortcutAppInfo2.clickCount) {
                    return 1;
                }
                if (launcherShortcutAppInfo.clickCount > launcherShortcutAppInfo2.clickCount) {
                    return -1;
                }
                return a.this.e.compare(bVar.r(), bVar2.r());
            }
        };
        this.c = new Comparator<i>() { // from class: com.tsf.shell.f.f.a.d.a.a.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(i iVar, i iVar2) {
                int iA = a.this.a(iVar);
                int iA2 = a.this.a(iVar2);
                if (iA < iA2) {
                    return -1;
                }
                if (iA > iA2) {
                    return 1;
                }
                if ((iVar instanceof com.tsf.shell.f.i.b.e.b) && (iVar2 instanceof com.tsf.shell.f.i.b.e.b)) {
                    ItemInfo itemInfoK = ((com.tsf.shell.f.i.b.e.b) iVar).K();
                    return a.this.e.compare(((com.tsf.shell.f.i.b.e.b) iVar2).K().title, itemInfoK.title);
                }
                return 0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(i iVar) {
        g gVarA;
        if (!(iVar instanceof g)) {
            return -1;
        }
        g gVar = (g) iVar;
        if (gVar.bd() == null || gVar.bd().a == null || (gVarA = com.tsf.shell.manager.a.w.a().a(gVar.bd().a.getComponent())) == null || gVarA.K() == null) {
            return 0;
        }
        return ((LauncherShortcutAppInfo) gVarA.K()).clickCount;
    }
}
