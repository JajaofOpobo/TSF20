package com.tsf.extend.theme.c;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tsf.extend.f;
import com.tsf.extend.theme.t;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends t {
    public b(Context context, List<t.b> list, View.OnClickListener onClickListener) {
        super(context, list, onClickListener);
    }

    @Override // com.tsf.extend.theme.t
    protected int c() {
        return f.C0052f.theme_all_item_with_name;
    }

    @Override // com.tsf.extend.theme.t
    protected void a(t.d dVar, View view) {
        dVar.g = (TextView) view.findViewById(f.e.theme_name_left);
        dVar.u = (TextView) view.findViewById(f.e.theme_name_mid);
        dVar.n = (TextView) view.findViewById(f.e.theme_name_right);
    }

    @Override // com.tsf.extend.theme.t
    protected void a(t.d dVar, t.b bVar) {
        if (dVar != null && bVar != null) {
            if (dVar.g != null && bVar.a() != null) {
                dVar.g.setText(bVar.a().i());
            }
            if (dVar.u != null && bVar.b() != null) {
                dVar.u.setText(bVar.b().i());
            }
            if (dVar.n != null && bVar.c() != null) {
                dVar.n.setText(bVar.c().i());
            }
        }
    }

    @Override // com.tsf.extend.theme.t
    protected int d() {
        return com.tsf.extend.base.j.i.a(42.0f);
    }
}
