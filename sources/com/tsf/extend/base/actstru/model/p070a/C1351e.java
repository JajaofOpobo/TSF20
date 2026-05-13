package com.tsf.extend.base.actstru.model.p070a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.extend.base.actstru.model.C1366l;
/* renamed from: com.tsf.extend.base.actstru.model.a.e */
/* loaded from: classes.dex */
public final class C1351e {
    /* renamed from: a */
    public static final boolean m8925a(TextView textView, Typeface typeface) {
        if (textView == null || typeface == null) {
            return false;
        }
        Typeface typeface2 = textView.getTypeface();
        textView.setTypeface(typeface, typeface2 != null ? typeface2.getStyle() : 0);
        textView.setPaintFlags(textView.getPaintFlags() | ItemInfo.APP_INTENT);
        return true;
    }

    /* renamed from: a */
    public static final boolean m8926a(Context context, TextView textView, String str) {
        if (textView == null || context == null) {
            return false;
        }
        return m8925a(textView, C1366l.m8880a(context.getAssets(), str));
    }

    /* renamed from: a */
    public static final void m8928a(Context context, TextView textView, C1346a c1346a) {
        if (context != null && textView != null && c1346a != null && c1346a.m8935c()) {
            m8926a(context, textView, c1346a.m8936b());
        }
    }

    /* renamed from: a */
    public static void m8927a(Context context, TextView textView, C1346a c1346a, String str) {
        if (context != null && textView != null && c1346a != null) {
            if (TextUtils.isEmpty(str) || !m8926a(context, textView, str)) {
                m8928a(context, textView, c1346a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static final String m8929a(Context context, AttributeSet attributeSet, int i) {
        String resourceEntryName = context.getResources().getResourceEntryName(i);
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, resourceEntryName, -1);
        if (attributeResourceValue > 0) {
            return context.getString(attributeResourceValue);
        }
        return attributeSet.getAttributeValue(null, resourceEntryName);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static final String m8924b(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{i});
        try {
            return obtainStyledAttributes.getString(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static final String m8930a(Context context, int i, int i2) {
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
