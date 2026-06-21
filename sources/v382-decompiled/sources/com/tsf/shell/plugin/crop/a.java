package com.tsf.shell.plugin.crop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes.dex */
public class a extends android.support.v4.app.g {
    private View aj;

    public a() {
        a(1, 0);
    }

    @Override // android.support.v4.app.g, android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        this.aj = layoutInflater.inflate(j.crop_size_dialog_layout, viewGroup);
        TextView textView = (TextView) this.aj.findViewById(i.textView1);
        StringBuilder sb = new StringBuilder("ImageSize: ");
        i = CropImageActivity.v;
        StringBuilder append = sb.append(i).append("x");
        i2 = CropImageActivity.w;
        textView.setText(append.append(i2).toString());
        return this.aj;
    }
}
