package android.support.p013v7.p017c;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;
/* renamed from: android.support.v7.c.a */
/* loaded from: classes.dex */
public class C0604a implements TransformationMethod {

    /* renamed from: a */
    private Locale f1386a;

    public C0604a(Context context) {
        this.f1386a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f1386a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
