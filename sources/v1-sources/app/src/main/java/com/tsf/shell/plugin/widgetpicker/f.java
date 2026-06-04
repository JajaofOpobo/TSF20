package com.tsf.shell.plugin.widgetpicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends ArrayAdapter {
    public int a;
    public int b;
    private final ArrayList c;
    private final Context d;

    public f(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.a = 120;
        this.b = 150;
        this.c = arrayList;
        this.d = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.d).inflate(R.layout.appwidget_grid_item, (ViewGroup) null);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView1);
        j jVar = (j) this.c.get(i);
        if (jVar.g() != null) {
            imageView.setImageDrawable(jVar.g());
        } else {
            imageView.setImageDrawable(jVar.c());
        }
        ((TextView) view.findViewById(R.id.textView1)).setText(jVar.b());
        TextView textView = (TextView) view.findViewById(R.id.textView2);
        int ceil = (int) Math.ceil(jVar.i() / this.a);
        int ceil2 = (int) Math.ceil(jVar.h() / this.b);
        if (ceil > 4) {
            ceil = 4;
        }
        int i2 = ceil2 <= 4 ? ceil2 : 4;
        if (jVar instanceof d) {
            int size = ((d) jVar).a().size();
            if (size > 1) {
                textView.setText("x" + size);
                textView.setVisibility(0);
            } else {
                textView.setText(String.valueOf(ceil) + " x " + i2);
            }
        } else {
            textView.setText(String.valueOf(ceil) + " x " + i2);
        }
        return view;
    }
}
