package com.tsf.shell.f.f.a.d.a;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.tsf.shell.f.i.b.e.DrawerItemVisual;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerNameSort extends DrawerSortBase {
    private Collator e;

    public DrawerNameSort(int i) {
        super(com.tsf.b.d.drawer_sort_name, com.tsf.b.i.text_sort_alphabetical);
        this.a = i;
        this.e = Collator.getInstance(Locale.getDefault());
        this.b = new Comparator<com.tsf.shell.f.i.PageItem>() { // from class: com.tsf.shell.f.f.a.d.a.DrawerNameSort.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(com.tsf.shell.f.i.PageItem bVar, com.tsf.shell.f.i.PageItem bVar2) {
                if ((bVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) && (bVar2 instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem)) {
                    return 0;
                }
                if (bVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
                    return -1;
                }
                if (!(bVar2 instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem)) {
                    return b.this.e.compare(b.b(bVar.r()), b.b(bVar2.r()));
                }
                return 1;
            }
        };
        this.c = new Comparator<IRenderable>() { // from class: com.tsf.shell.f.f.a.d.a.DrawerNameSort.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(i iVar, i iVar2) {
                if (!(iVar instanceof g) || !(iVar2 instanceof g)) {
                    return 0;
                }
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) ((g) iVar).K();
                LauncherShortcutAppInfo launcherShortcutAppInfo2 = (LauncherShortcutAppInfo) ((g) iVar2).K();
                String strB = b.b(launcherShortcutAppInfo.title);
                return b.this.e.compare(b.b(launcherShortcutAppInfo2.title), strB);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        return Character.toString(com.tsf.shell.f.f.a._a.b.DrawerButtonElement(str));
    }
}
