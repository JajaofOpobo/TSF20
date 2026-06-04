package com.tsf.shell.plugin.iconpicker;

import android.graphics.Bitmap;
import android.view.View;
import com.tsf.shell.R;

/* loaded from: classes.dex */
final class g implements View.OnClickListener {
    final /* synthetic */ IconPicker a;

    g(IconPicker iconPicker) {
        this.a = iconPicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.reset /* 2131623954 */:
                IconPicker.a((Bitmap) null);
                break;
            case R.id.gallery /* 2131623955 */:
                IconPicker.a(this.a);
                break;
            case R.id.file /* 2131623956 */:
                IconPicker.b(this.a);
                break;
        }
    }
}
