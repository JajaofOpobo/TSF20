package com.tsf.extend.theme.p084c;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1430i;
import com.tsf.extend.theme.C1887t;
import java.util.List;
/* renamed from: com.tsf.extend.theme.c.b */
/* loaded from: classes.dex */
public class C1708b extends C1887t {
    public C1708b(Context context, List<C1887t.C1890b> list, View.OnClickListener onClickListener) {
        super(context, list, onClickListener);
    }

    @Override // com.tsf.extend.theme.C1887t
    /* renamed from: c */
    protected int mo7038c() {
        return C1536f.C1542f.theme_all_item_with_name;
    }

    @Override // com.tsf.extend.theme.C1887t
    /* renamed from: a */
    protected void mo7136a(C1887t.C1892d c1892d, View view) {
        c1892d.f6094g = (TextView) view.findViewById(C1536f.C1541e.theme_name_left);
        c1892d.f6108u = (TextView) view.findViewById(C1536f.C1541e.theme_name_mid);
        c1892d.f6101n = (TextView) view.findViewById(C1536f.C1541e.theme_name_right);
    }

    @Override // com.tsf.extend.theme.C1887t
    /* renamed from: a */
    protected void mo7135a(C1887t.C1892d c1892d, C1887t.C1890b c1890b) {
        if (c1892d != null && c1890b != null) {
            if (c1892d.f6094g != null && c1890b.m7124a() != null) {
                c1892d.f6094g.setText(c1890b.m7124a().m7294i());
            }
            if (c1892d.f6108u != null && c1890b.m7122b() != null) {
                c1892d.f6108u.setText(c1890b.m7122b().m7294i());
            }
            if (c1892d.f6101n != null && c1890b.m7120c() != null) {
                c1892d.f6101n.setText(c1890b.m7120c().m7294i());
            }
        }
    }

    @Override // com.tsf.extend.theme.C1887t
    /* renamed from: d */
    protected int mo7128d() {
        return C1430i.m8659a(42.0f);
    }
}
