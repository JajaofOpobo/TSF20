package android.support.p002v4.app;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* renamed from: android.support.v4.app.z */
/* loaded from: classes.dex */
class C0126z extends FrameLayout {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ViewGroup m13424a(View view) {
        C0126z c0126z = new C0126z(view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            c0126z.setLayoutParams(layoutParams);
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c0126z.addView(view);
        return c0126z;
    }

    public C0126z(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }
}
