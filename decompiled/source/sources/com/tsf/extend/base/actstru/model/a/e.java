package com.tsf.extend.base.actstru.model.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.extend.base.actstru.model.l;
/* loaded from: classes.dex */
public final class e {
    public static final boolean a(TextView textView, Typeface typeface) {
        if (textView == null || typeface == null) {
            return false;
        }
        Typeface typeface2 = textView.getTypeface();
        textView.setTypeface(typeface, typeface2 != null ? typeface2.getStyle() : 0);
        textView.setPaintFlags(textView.getPaintFlags() | ItemInfo.APP_INTENT);
        return true;
    }

    public static final boolean a(Context context, TextView textView, String str) {
        if (textView == null || context == null) {
            return false;
        }
        return a(textView, l.a(context.getAssets(), str));
    }

    public static final void a(Context context, TextView textView, a aVar) {
        if (context != null && textView != null && aVar != null && aVar.c()) {
            a(context, textView, aVar.b());
        }
    }

    public static void a(Context context, TextView textView, a aVar, String str) {
        if (context != null && textView != null && aVar != null) {
            if (TextUtils.isEmpty(str) || !a(context, textView, str)) {
                a(context, textView, aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String a(Context context, AttributeSet attributeSet, int i) {
        String resourceEntryName = context.getResources().getResourceEntryName(i);
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, resourceEntryName, -1);
        if (attributeResourceValue > 0) {
            return context.getString(attributeResourceValue);
        }
        return attributeSet.getAttributeValue(null, resourceEntryName);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String b(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{i});
        try {
            return obtainStyledAttributes.getString(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String a(Context context, int i, int i2) {
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(typedValue.resourceId, new int[]{i2});
        try {
            return obtainStyledAttributes.getString(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
