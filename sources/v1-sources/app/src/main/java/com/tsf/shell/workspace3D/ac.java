package com.tsf.shell.workspace3D;

import android.widget.CompoundButton;
import android.widget.TextView;

/* loaded from: classes.dex */
final class ac implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ TextView a;

    ac(TextView textView) {
        this.a = textView;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        com.tsf.shell.a.t.a(z);
        z.a(this.a);
    }
}
