package com.tsf.shell.preference.video;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.R;
import java.util.List;

/* loaded from: classes.dex */
class a extends BaseAdapter {
    final /* synthetic */ VideoViwerActivity a;

    public a(VideoViwerActivity videoViwerActivity) {
        this.a = videoViwerActivity;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        List list;
        Context context;
        if (view == null) {
            context = this.a.c;
            ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.video_item_layout, (ViewGroup) null);
            viewGroup3.setLayoutParams(new AbsListView.LayoutParams(250, VEasing.Back.easeIn));
            viewGroup3.setOnTouchListener(new View.OnTouchListener(i, (ImageView) viewGroup3.findViewById(R.id.imageView1)) { // from class: com.tsf.shell.preference.video.a.1
                b a;
                private final /* synthetic */ ImageView c;

                {
                    List list2;
                    this.c = r4;
                    list2 = a.this.a.d;
                    this.a = (b) list2.get(i);
                }

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            this.c.getDrawable().setAlpha(ItemInfo.APP_INTENT);
                            break;
                        case 1:
                            this.c.getDrawable().setAlpha(255);
                            VideoOptionDialogActivity.a(a.this.a, this.a.e, this.a.d);
                            break;
                        case 3:
                            this.c.getDrawable().setAlpha(255);
                            break;
                    }
                    return true;
                }
            });
            viewGroup2 = viewGroup3;
        } else {
            viewGroup2 = (ViewGroup) view;
        }
        list = this.a.d;
        b bVar = (b) list.get(i);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.imageView1);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(bVar.a);
        ((TextView) viewGroup2.findViewById(R.id.textView1)).setText(bVar.c);
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
