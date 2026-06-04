package com.tsf.shell.plugin.iconpicker;

import android.view.View;
import com.tsf.shell.R;

/* loaded from: classes.dex */
final class b implements Runnable {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        view = this.a.k;
        if (view != null) {
            if (this.a.getCount() == 0) {
                view2 = this.a.k;
                View findViewById = view2.findViewById(R.id.imageView1);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                    return;
                }
                return;
            }
            if (h.a == 0) {
                this.a.a();
            }
        }
    }
}
