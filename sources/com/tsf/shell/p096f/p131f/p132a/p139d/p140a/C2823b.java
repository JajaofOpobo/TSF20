package com.tsf.shell.p096f.p131f.p132a.p139d.p140a;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p131f.p132a.p133a.C2685b;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
/* renamed from: com.tsf.shell.f.f.a.d.a.b */
/* loaded from: classes.dex */
public class C2823b extends C2826c {

    /* renamed from: e */
    private Collator f9199e;

    public C2823b(int i) {
        super(C1306b.C1310d.drawer_sort_name, C1306b.C1315i.text_sort_alphabetical);
        this.f9202a = i;
        this.f9199e = Collator.getInstance(Locale.getDefault());
        this.f9203b = new Comparator<C3112b>() { // from class: com.tsf.shell.f.f.a.d.a.b.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public final int compare(C3112b c3112b, C3112b c3112b2) {
                if ((c3112b instanceof C3145b) && (c3112b2 instanceof C3145b)) {
                    return 0;
                }
                if (c3112b instanceof C3145b) {
                    return -1;
                }
                if (!(c3112b2 instanceof C3145b)) {
                    return C2823b.this.f9199e.compare(C2823b.m4578b(c3112b.mo3100r()), C2823b.m4578b(c3112b2.mo3100r()));
                }
                return 1;
            }
        };
        this.f9204c = new Comparator<C0975i>() { // from class: com.tsf.shell.f.f.a.d.a.b.2
            @Override // java.util.Comparator
            /* renamed from: a */
            public final int compare(C0975i c0975i, C0975i c0975i2) {
                if ((c0975i instanceof C3222g) && (c0975i2 instanceof C3222g)) {
                    String m4578b = C2823b.m4578b(((LauncherShortcutAppInfo) ((C3222g) c0975i).m3534K()).title);
                    return C2823b.this.f9199e.compare(C2823b.m4578b(((LauncherShortcutAppInfo) ((C3222g) c0975i2).m3534K()).title), m4578b);
                }
                return 0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static String m4578b(String str) {
        return Character.toString(C2685b.m4918a(str));
    }
}
