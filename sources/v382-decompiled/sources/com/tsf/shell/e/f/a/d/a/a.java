package com.tsf.shell.e.f.a.d.a;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.R;
import com.tsf.shell.e.i.b.e.i;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* loaded from: classes.dex */
public class a extends c {
    private Collator e;

    public a(int i) {
        super(R.drawable.drawer_sort_frequency, R.string.text_sort_most_used);
        this.a = i;
        this.e = Collator.getInstance(Locale.getDefault());
        this.b = new Comparator() { // from class: com.tsf.shell.e.f.a.d.a.a.1
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(com.tsf.shell.e.i.c cVar, com.tsf.shell.e.i.c cVar2) {
                if ((cVar instanceof com.tsf.shell.e.i.b.d.b) && (cVar2 instanceof com.tsf.shell.e.i.b.d.b)) {
                    return 0;
                }
                if (cVar instanceof com.tsf.shell.e.i.b.d.b) {
                    return -1;
                }
                if (cVar2 instanceof com.tsf.shell.e.i.b.d.b) {
                    return 1;
                }
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) ((i) cVar).K();
                LauncherShortcutAppInfo launcherShortcutAppInfo2 = (LauncherShortcutAppInfo) ((i) cVar2).K();
                if (launcherShortcutAppInfo.clickCount < launcherShortcutAppInfo2.clickCount) {
                    return 1;
                }
                if (launcherShortcutAppInfo.clickCount > launcherShortcutAppInfo2.clickCount) {
                    return -1;
                }
                return a.this.e.compare(cVar.r(), cVar2.r());
            }
        };
        this.c = new Comparator() { // from class: com.tsf.shell.e.f.a.d.a.a.2
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(j jVar, j jVar2) {
                int a = a.this.a(jVar);
                int a2 = a.this.a(jVar2);
                if (a < a2) {
                    return -1;
                }
                if (a > a2) {
                    return 1;
                }
                if ((jVar instanceof com.tsf.shell.e.i.b.e.b) && (jVar2 instanceof com.tsf.shell.e.i.b.e.b)) {
                    ItemInfo K = ((com.tsf.shell.e.i.b.e.b) jVar).K();
                    return a.this.e.compare(((com.tsf.shell.e.i.b.e.b) jVar2).K().title, K.title);
                }
                return 0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(j jVar) {
        i a;
        if (!(jVar instanceof i)) {
            return -1;
        }
        i iVar = (i) jVar;
        if (iVar.bd() == null || iVar.bd().a == null || (a = com.tsf.shell.manager.a.w.a().a(iVar.bd().a.getComponent())) == null || a.K() == null) {
            return 0;
        }
        return ((LauncherShortcutAppInfo) a.K()).clickCount;
    }
}
