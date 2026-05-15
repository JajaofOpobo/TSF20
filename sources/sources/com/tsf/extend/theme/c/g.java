package com.tsf.extend.theme.c;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import com.tsf.extend.base.j.ab;
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g extends TextView {
    private int a;
    private int b;
    private Typeface c;

    public g(Context context) {
        super(context);
        this.a = 0;
        this.b = 0;
        this.a = com.tsf.extend.base.j.i.a(15.0f);
        this.b = com.tsf.extend.base.j.i.a(6.0f);
        setPadding(this.a, this.b, this.a, this.b);
        a();
        setBackgroundResource(f.d.theme_search_tag_bg);
        setTextColor(getResources().getColorStateList(f.b.theme_search_tag_color));
        setTextSize(14.0f);
        setGravity(17);
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
    }

    private void a() {
        if (this.c == null) {
            this.c = ab.a(getContext().getAssets(), "fonts/OpenSans-Light-bold.ttf");
        }
        setTypeface(this.c);
    }
}
