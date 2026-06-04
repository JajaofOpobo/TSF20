package com.tsf.shell.action;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.tsf.shell.R;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class o extends SimpleAdapter {
    private int[] a;
    private String[] b;
    private SimpleAdapter.ViewBinder c;
    private List d;
    private int e;
    private LayoutInflater f;

    public o(Context context, List list, String[] strArr, int[] iArr) {
        super(context, list, R.layout.action_selector_lists, strArr, iArr);
        this.d = list;
        this.e = R.layout.action_selector_lists;
        this.b = strArr;
        this.a = iArr;
        this.f = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public final void a() {
        this.c = null;
        this.d.clear();
        this.f = null;
    }

    @Override // android.widget.SimpleAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = this.e;
        if (view == null) {
            view = this.f.inflate(i2, viewGroup, false);
            view.setBackgroundResource(R.drawable.action_item_selector);
            int[] iArr = this.a;
            int length = iArr.length;
            View[] viewArr = new View[length];
            for (int i3 = 0; i3 < length; i3++) {
                viewArr[i3] = view.findViewById(iArr[i3]);
            }
            view.setTag(viewArr);
        }
        Map map = (Map) this.d.get(i);
        if (map != null) {
            SimpleAdapter.ViewBinder viewBinder = this.c;
            View[] viewArr2 = (View[]) view.getTag();
            String[] strArr = this.b;
            int length2 = this.a.length;
            for (int i4 = 0; i4 < length2; i4++) {
                View view2 = viewArr2[i4];
                if (view2 != null) {
                    Object obj = map.get(strArr[i4]);
                    String obj2 = obj == null ? "" : obj.toString();
                    String str = obj2 == null ? "" : obj2;
                    if (viewBinder != null ? viewBinder.setViewValue(view2, obj, str) : false) {
                        continue;
                    } else if (view2 instanceof TextView) {
                        setViewText((TextView) view2, str);
                    } else {
                        if (!(view2 instanceof ImageView)) {
                            throw new IllegalStateException(String.valueOf(view2.getClass().getName()) + " is not a view that can be bounds by this SimpleAdapter");
                        }
                        ((ImageView) view2).setImageDrawable((Drawable) obj);
                    }
                }
            }
        }
        return view;
    }
}
