package com.tsf.shell.f.f.a.d.a;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.b;
import com.tsf.shell.f.i.b.e.g;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
/* loaded from: classes.dex */
public class b extends c {
    private Collator e;

    public b(int i) {
        super(b.d.drawer_sort_name, b.i.text_sort_alphabetical);
        this.a = i;
        this.e = Collator.getInstance(Locale.getDefault());
        this.b = new Comparator<com.tsf.shell.f.i.b>() { // from class: com.tsf.shell.f.f.a.d.a.b.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public final int compare(com.tsf.shell.f.i.b bVar, com.tsf.shell.f.i.b bVar2) {
                if ((bVar instanceof com.tsf.shell.f.i.b.d.b) && (bVar2 instanceof com.tsf.shell.f.i.b.d.b)) {
                    return 0;
                }
                if (bVar instanceof com.tsf.shell.f.i.b.d.b) {
                    return -1;
                }
                if (!(bVar2 instanceof com.tsf.shell.f.i.b.d.b)) {
                    return b.this.e.compare(b.b(bVar.r()), b.b(bVar2.r()));
                }
                return 1;
            }
        };
        this.c = new Comparator<i>() { // from class: com.tsf.shell.f.f.a.d.a.b.2
            @Override // java.util.Comparator
            /* renamed from: a */
            public final int compare(i iVar, i iVar2) {
                if ((iVar instanceof g) && (iVar2 instanceof g)) {
                    String b = b.b(((LauncherShortcutAppInfo) ((g) iVar).K()).title);
                    return b.this.e.compare(b.b(((LauncherShortcutAppInfo) ((g) iVar2).K()).title), b);
                }
                return 0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        return Character.toString(com.tsf.shell.f.f.a.a.b.a(str));
    }
}
