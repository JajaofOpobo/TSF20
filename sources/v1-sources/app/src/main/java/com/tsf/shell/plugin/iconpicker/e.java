package com.tsf.shell.plugin.iconpicker;

import android.view.View;
import com.tsf.shell.R;

/* loaded from: classes.dex */
final class e implements View.OnClickListener {
    final /* synthetic */ IconPackagePicker a;

    e(IconPackagePicker iconPackagePicker) {
        this.a = iconPackagePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView1 /* 2131623942 */:
                this.a.a("", -1);
                break;
            case R.id.imageView2 /* 2131623958 */:
                int i = h.b;
                if (IconPackagePicker.n.size() == 0) {
                    this.a.finish();
                    break;
                } else {
                    IconPackagePicker iconPackagePicker = this.a;
                    IconPackagePicker iconPackagePicker2 = this.a;
                    iconPackagePicker.a(IconPackagePicker.b(i), IconPackagePicker.a(i));
                    break;
                }
            case R.id.imageView3 /* 2131623959 */:
                com.tsf.shell.g.d.b(this.a, "icon package");
                break;
        }
    }
}
