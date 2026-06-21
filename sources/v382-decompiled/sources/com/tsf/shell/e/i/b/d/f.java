package com.tsf.shell.e.i.b.d;

import com.tsf.shell.R;
import com.tsf.shell.utils.w;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends com.tsf.shell.e.e.d.a.h {
    public f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.tsf.shell.e.e.d.a.g(R.string.menu_add, R.drawable.widget_folder_add_button) { // from class: com.tsf.shell.e.i.b.d.f.1
            @Override // com.tsf.shell.e.e.d.a.g
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.n.a(b.k);
                }
            }

            @Override // com.tsf.shell.e.e.d.a.g
            public boolean b() {
                return (b.k == null || b.k.aC()) ? false : true;
            }
        });
        arrayList.add(new com.tsf.shell.e.e.d.a.g(R.string.menu_multiple_choice, R.drawable.widget_folder_multi_choice) { // from class: com.tsf.shell.e.i.b.d.f.2
            @Override // com.tsf.shell.e.e.d.a.g
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.k.aE().d();
                }
            }
        });
        arrayList.add(new com.tsf.shell.e.e.d.a.g(R.string.text_rename, R.drawable.widget_folder_rename) { // from class: com.tsf.shell.e.i.b.d.f.3
            @Override // com.tsf.shell.e.e.d.a.g
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.l.a(b.k);
                }
            }
        });
        arrayList.add(new com.tsf.shell.e.e.d.a.g(R.string.text_preferences, R.drawable.widget_folder_preferences) { // from class: com.tsf.shell.e.i.b.d.f.4
            @Override // com.tsf.shell.e.e.d.a.g
            public void a() {
                w.b();
                b.l.a();
            }
        });
        com.tsf.shell.e.e.d.a.g gVar = new com.tsf.shell.e.e.d.a.g(R.string.text_sort, R.drawable.widget_folder_sort);
        gVar.a(l());
        arrayList.add(gVar);
        a(arrayList);
    }

    private ArrayList l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.tsf.shell.e.e.d.a.g(R.string.text_sort_alphabetical, R.drawable.widget_folder_sort_name) { // from class: com.tsf.shell.e.i.b.d.f.5
            @Override // com.tsf.shell.e.e.d.a.g
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.k.b(0);
                }
            }
        });
        arrayList.add(new com.tsf.shell.e.e.d.a.g(R.string.text_sort_latest_installed, R.drawable.widget_folder_sort_time_earliest) { // from class: com.tsf.shell.e.i.b.d.f.6
            @Override // com.tsf.shell.e.e.d.a.g
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.k.b(2);
                }
            }
        });
        arrayList.add(new com.tsf.shell.e.e.d.a.g(R.string.text_sort_earliest_installed, R.drawable.widget_folder_sort_time_latest) { // from class: com.tsf.shell.e.i.b.d.f.7
            @Override // com.tsf.shell.e.e.d.a.g
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.k.b(1);
                }
            }
        });
        arrayList.add(new com.tsf.shell.e.e.d.a.g(R.string.text_sort_most_used, R.drawable.widget_folder_sort_frequency) { // from class: com.tsf.shell.e.i.b.d.f.8
            @Override // com.tsf.shell.e.e.d.a.g
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.k.b(3);
                }
            }
        });
        return arrayList;
    }
}
