package com.tsf.shell.preference.video;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.R;
import java.util.List;

/* loaded from: classes.dex */
final class a extends BaseAdapter {
    final /* synthetic */ VideoViwerActivity a;

    public a(VideoViwerActivity videoViwerActivity) {
        this.a = videoViwerActivity;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        List list;
        Context context;
        if (view == null) {
            context = this.a.c;
            ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.video_item_layout, (ViewGroup) null);
            viewGroup3.setLayoutParams(new AbsListView.LayoutParams(250, 200));
            viewGroup3.setOnTouchListener(new b(this, i, (ImageView) viewGroup3.findViewById(R.id.imageView1)));
            viewGroup2 = viewGroup3;
        } else {
            viewGroup2 = (ViewGroup) view;
        }
        list = this.a.d;
        c cVar = (c) list.get(i);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.imageView1);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(cVar.a);
        ((TextView) viewGroup2.findViewById(R.id.textView1)).setText(cVar.c);
        return viewGroup2;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List list;
        list = this.a.d;
        return list.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        List list;
        list = this.a.d;
        return list.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }
}
