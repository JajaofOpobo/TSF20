package android.support.p002v4.view;

import android.content.Context;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;
/* renamed from: android.support.v4.view.ad */
/* loaded from: classes.dex */
class C0300ad {
    /* renamed from: a */
    public static void m12939a(TextView textView) {
        textView.setTransformationMethod(new C0301a(textView.getContext()));
    }

    /* renamed from: android.support.v4.view.ad$a */
    /* loaded from: classes.dex */
    private static class C0301a extends SingleLineTransformationMethod {

        /* renamed from: a */
        private Locale f749a;

        public C0301a(Context context) {
            this.f749a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f749a);
            }
            return null;
        }
    }
}
