package android.support.p002v4.app;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
/* renamed from: android.support.v4.app.j */
/* loaded from: classes.dex */
abstract class AbstractActivityC0089j extends AbstractActivityC0088i {
    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo13640a(view, str, context, attributeSet);
        if (a == null && Build.VERSION.SDK_INT >= 11) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return a;
    }
}
