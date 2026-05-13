package com.tsf.shell.p096f.p153i.p155b.p159d;

import com.tsf.C1306b;
import com.tsf.shell.p096f.p118e.p123d.p124a.C2516c;
import com.tsf.shell.p096f.p118e.p123d.p124a.C2525d;
import com.tsf.shell.utils.C4187w;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.i.b.d.f */
/* loaded from: classes.dex */
public class C3174f extends C2525d {
    public C3174f() {
        ArrayList<C2516c.C2524c> arrayList = new ArrayList<>();
        arrayList.add(new C2516c.C2524c(C1306b.C1315i.menu_add, C1306b.C1310d.widget_folder_add_button) { // from class: com.tsf.shell.f.i.b.d.f.1
            @Override // com.tsf.shell.p096f.p118e.p123d.p124a.C2516c.C2524c
            /* renamed from: a */
            public void mo3280a() {
                if (C3145b.f10240k != null) {
                    C4187w.m614b();
                    C3145b.f10243n.m3297a(C3145b.f10240k);
                }
            }

            @Override // com.tsf.shell.p096f.p118e.p123d.p124a.C2516c.C2524c
            /* renamed from: b */
            public boolean mo3281b() {
                return (C3145b.f10240k == null || C3145b.f10240k.m3380aC()) ? false : true;
            }
        });
        arrayList.add(new C2516c.C2524c(C1306b.C1315i.menu_multiple_choice, C1306b.C1310d.widget_folder_multi_choice) { // from class: com.tsf.shell.f.i.b.d.f.2
            @Override // com.tsf.shell.p096f.p118e.p123d.p124a.C2516c.C2524c
            /* renamed from: a */
            public void mo3280a() {
                if (C3145b.f10240k != null) {
                    C4187w.m614b();
                    C3145b.f10240k.m3378aE().m3564d();
                }
            }
        });
        arrayList.add(new C2516c.C2524c(C1306b.C1315i.text_rename, C1306b.C1310d.widget_folder_rename) { // from class: com.tsf.shell.f.i.b.d.f.3
            @Override // com.tsf.shell.p096f.p118e.p123d.p124a.C2516c.C2524c
            /* renamed from: a */
            public void mo3280a() {
                if (C3145b.f10240k != null) {
                    C4187w.m614b();
                    C3145b.f10241l.m3230a(C3145b.f10240k);
                }
            }
        });
        arrayList.add(new C2516c.C2524c(C1306b.C1315i.text_preferences, C1306b.C1310d.widget_folder_preferences) { // from class: com.tsf.shell.f.i.b.d.f.4
            @Override // com.tsf.shell.p096f.p118e.p123d.p124a.C2516c.C2524c
            /* renamed from: a */
            public void mo3280a() {
                C4187w.m614b();
                C3145b.f10241l.m3233a();
            }
        });
        C2516c.C2524c c2524c = new C2516c.C2524c(C1306b.C1315i.text_sort, C1306b.C1310d.widget_folder_sort);
        c2524c.m5357a(m3282l());
        arrayList.add(c2524c);
        m5352a(arrayList);
    }

    /* renamed from: l */
    private ArrayList<C2516c.C2524c> m3282l() {
        ArrayList<C2516c.C2524c> arrayList = new ArrayList<>();
        arrayList.add(new C2516c.C2524c(C1306b.C1315i.text_sort_alphabetical, C1306b.C1310d.widget_folder_sort_name) { // from class: com.tsf.shell.f.i.b.d.f.5
            @Override // com.tsf.shell.p096f.p118e.p123d.p124a.C2516c.C2524c
            /* renamed from: a */
            public void mo3280a() {
                if (C3145b.f10240k != null) {
                    C4187w.m614b();
                    C3145b.f10240k.m3353b(0);
                }
            }
        });
        arrayList.add(new C2516c.C2524c(C1306b.C1315i.text_sort_latest_installed, C1306b.C1310d.widget_folder_sort_time_earliest) { // from class: com.tsf.shell.f.i.b.d.f.6
            @Override // com.tsf.shell.p096f.p118e.p123d.p124a.C2516c.C2524c
            /* renamed from: a */
            public void mo3280a() {
                if (C3145b.f10240k != null) {
                    C4187w.m614b();
                    C3145b.f10240k.m3353b(2);
                }
            }
        });
        arrayList.add(new C2516c.C2524c(C1306b.C1315i.text_sort_earliest_installed, C1306b.C1310d.widget_folder_sort_time_latest) { // from class: com.tsf.shell.f.i.b.d.f.7
            @Override // com.tsf.shell.p096f.p118e.p123d.p124a.C2516c.C2524c
            /* renamed from: a */
            public void mo3280a() {
                if (C3145b.f10240k != null) {
                    C4187w.m614b();
                    C3145b.f10240k.m3353b(1);
                }
            }
        });
        arrayList.add(new C2516c.C2524c(C1306b.C1315i.text_sort_most_used, C1306b.C1310d.widget_folder_sort_frequency) { // from class: com.tsf.shell.f.i.b.d.f.8
            @Override // com.tsf.shell.p096f.p118e.p123d.p124a.C2516c.C2524c
            /* renamed from: a */
            public void mo3280a() {
                if (C3145b.f10240k != null) {
                    C4187w.m614b();
                    C3145b.f10240k.m3353b(3);
                }
            }
        });
        return arrayList;
    }
}
