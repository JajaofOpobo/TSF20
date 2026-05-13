package com.tsf.extend.theme.p084c;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1420ab;
import com.tsf.extend.base.p080j.C1430i;
/* renamed from: com.tsf.extend.theme.c.g */
/* loaded from: classes.dex */
public class C1729g extends TextView {

    /* renamed from: a */
    private int f5559a;

    /* renamed from: b */
    private int f5560b;

    /* renamed from: c */
    private Typeface f5561c;

    public C1729g(Context context) {
        super(context);
        this.f5559a = 0;
        this.f5560b = 0;
        this.f5559a = C1430i.m8659a(15.0f);
        this.f5560b = C1430i.m8659a(6.0f);
        setPadding(this.f5559a, this.f5560b, this.f5559a, this.f5560b);
        m7649a();
        setBackgroundResource(C1536f.C1540d.theme_search_tag_bg);
        setTextColor(getResources().getColorStateList(C1536f.C1538b.theme_search_tag_color));
        setTextSize(14.0f);
        setGravity(17);
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
    }

    /* renamed from: a */
    private void m7649a() {
        if (this.f5561c == null) {
            this.f5561c = C1420ab.m8700a(getContext().getAssets(), "fonts/OpenSans-Light-bold.ttf");
        }
        setTypeface(this.f5561c);
    }
}
