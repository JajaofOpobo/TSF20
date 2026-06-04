package android.support.v4.view;

import android.widget.TextView;

/* loaded from: classes.dex */
final class ab implements z {
    ab() {
    }

    @Override // android.support.v4.view.z
    public final void a(TextView textView) {
        textView.setTransformationMethod(new ad(textView.getContext()));
    }
}
