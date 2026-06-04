package com.tsf.shell.theme;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class ThemePagePointer extends LinearLayout {
    private Context a;
    private int b;

    public ThemePagePointer(Context context) {
        super(context);
        this.b = 0;
        this.a = context;
    }

    public ThemePagePointer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.a = context;
    }

    public final void a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ImageView imageView = new ImageView(this.a);
            imageView.setBackgroundResource(R.drawable.theme_page_pointer_selector);
            addView(imageView);
        }
        if (i > 0) {
            b(0);
        }
    }

    public final void b(int i) {
        getChildAt(this.b).setSelected(false);
        this.b = i;
        getChildAt(this.b).setSelected(true);
    }
}
