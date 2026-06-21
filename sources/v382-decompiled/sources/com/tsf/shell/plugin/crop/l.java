package com.tsf.shell.plugin.crop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class l extends android.support.v4.app.g {
    private View aj;

    public l() {
        a(1, 0);
    }

    @Override // android.support.v4.app.g, android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aj = layoutInflater.inflate(j.crop_size_dialog_layout, viewGroup);
        return this.aj;
    }
}
