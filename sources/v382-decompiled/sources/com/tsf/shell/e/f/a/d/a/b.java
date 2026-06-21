package com.tsf.shell.e.f.a.d.a;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.R;
import com.tsf.shell.e.i.b.e.i;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* loaded from: classes.dex */
public class b extends c {
    private Collator e;

    public b(int i) {
        super(R.drawable.drawer_sort_name, R.string.text_sort_alphabetical);
        this.a = i;
        this.e = Collator.getInstance(Locale.getDefault());
        this.b = new Comparator() { // from class: com.tsf.shell.e.f.a.d.a.b.1
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
                return b.this.e.compare(b.b(cVar.r()), b.b(cVar2.r()));
            }
        };
        this.c = new Comparator() { // from class: com.tsf.shell.e.f.a.d.a.b.2
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(j jVar, j jVar2) {
                if (!(jVar instanceof i) || !(jVar2 instanceof i)) {
                    return 0;
                }
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) ((i) jVar).K();
                LauncherShortcutAppInfo launcherShortcutAppInfo2 = (LauncherShortcutAppInfo) ((i) jVar2).K();
                String b = b.b(launcherShortcutAppInfo.title);
                return b.this.e.compare(b.b(launcherShortcutAppInfo2.title), b);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        return Character.toString(com.tsf.shell.e.f.a.a.b.a(str));
    }
}
