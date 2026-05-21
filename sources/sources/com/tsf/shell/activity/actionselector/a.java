package com.tsf.shell.activity.actionselector;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.tsf.b;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends SimpleAdapter {
    private int[] a;
    private String[] b;
    private SimpleAdapter.ViewBinder c;
    private List<? extends Map<String, ?>> d;
    private int e;
    private LayoutInflater f;

    public a(Context context, List<? extends Map<String, ?>> list, int i, String[] strArr, int[] iArr) {
        super(context, list, i, strArr, iArr);
        this.d = list;
        this.e = i;
        this.b = strArr;
        this.a = iArr;
        this.f = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.widget.SimpleAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, this.e);
    }

    private View a(int i, View view, ViewGroup viewGroup, int i2) {
        if (view == null) {
            view = this.f.inflate(i2, viewGroup, false);
            view.setBackgroundResource(b.d.action_item_selector);
            int[] iArr = this.a;
            int length = iArr.length;
            View[] viewArr = new View[length];
            for (int i3 = 0; i3 < length; i3++) {
                viewArr[i3] = view.findViewById(iArr[i3]);
            }
            view.setTag(viewArr);
        }
        a(i, view);
        return view;
    }

    private void a(int i, View view) {
        Map<String, ?> map = this.d.get(i);
        if (map != null) {
            SimpleAdapter.ViewBinder viewBinder = this.c;
            View[] viewArr = (View[]) view.getTag();
            String[] strArr = this.b;
            int length = this.a.length;
            for (int i2 = 0; i2 < length; i2++) {
                View view2 = viewArr[i2];
                if (view2 != null) {
                    Object obj = map.get(strArr[i2]);
                    String string = obj == null ? "" : obj.toString();
                    String str = string == null ? "" : string;
                    if (viewBinder != null ? viewBinder.setViewValue(view2, obj, str) : false) {
                        continue;
                    } else if (view2 instanceof TextView) {
                        setViewText((TextView) view2, str);
                    } else if (view2 instanceof ImageView) {
                        a((ImageView) view2, (Drawable) obj);
                    } else {
                        throw new IllegalStateException(view2.getClass().getName() + " is not a view that can be bounds by this SimpleAdapter");
                    }
                }
            }
        }
    }

    public void a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
    }
}
