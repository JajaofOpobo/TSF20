package com.tsf.shell.activity.actionselector;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.tsf.C1306b;
import java.util.List;
import java.util.Map;
/* renamed from: com.tsf.shell.activity.actionselector.a */
/* loaded from: classes.dex */
public class C2219a extends SimpleAdapter {

    /* renamed from: a */
    private int[] f7288a;

    /* renamed from: b */
    private String[] f7289b;

    /* renamed from: c */
    private SimpleAdapter.ViewBinder f7290c;

    /* renamed from: d */
    private List<? extends Map<String, ?>> f7291d;

    /* renamed from: e */
    private int f7292e;

    /* renamed from: f */
    private LayoutInflater f7293f;

    public C2219a(Context context, List<? extends Map<String, ?>> list, int i, String[] strArr, int[] iArr) {
        super(context, list, i, strArr, iArr);
        this.f7291d = list;
        this.f7292e = i;
        this.f7289b = strArr;
        this.f7288a = iArr;
        this.f7293f = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.widget.SimpleAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return m6063a(i, view, viewGroup, this.f7292e);
    }

    /* renamed from: a */
    private View m6063a(int i, View view, ViewGroup viewGroup, int i2) {
        if (view == null) {
            view = this.f7293f.inflate(i2, viewGroup, false);
            view.setBackgroundResource(C1306b.C1310d.action_item_selector);
            int[] iArr = this.f7288a;
            int length = iArr.length;
            View[] viewArr = new View[length];
            for (int i3 = 0; i3 < length; i3++) {
                viewArr[i3] = view.findViewById(iArr[i3]);
            }
            view.setTag(viewArr);
        }
        m6064a(i, view);
        return view;
    }

    /* renamed from: a */
    private void m6064a(int i, View view) {
        Map<String, ?> map = this.f7291d.get(i);
        if (map != null) {
            SimpleAdapter.ViewBinder viewBinder = this.f7290c;
            View[] viewArr = (View[]) view.getTag();
            String[] strArr = this.f7289b;
            int length = this.f7288a.length;
            for (int i2 = 0; i2 < length; i2++) {
                View view2 = viewArr[i2];
                if (view2 != null) {
                    Object obj = map.get(strArr[i2]);
                    String obj2 = obj == null ? "" : obj.toString();
                    String str = obj2 == null ? "" : obj2;
                    if (viewBinder != null ? viewBinder.setViewValue(view2, obj, str) : false) {
                        continue;
                    } else if (view2 instanceof TextView) {
                        setViewText((TextView) view2, str);
                    } else if (view2 instanceof ImageView) {
                        m6062a((ImageView) view2, (Drawable) obj);
                    } else {
                        throw new IllegalStateException(view2.getClass().getName() + " is not a view that can be bounds by this SimpleAdapter");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m6062a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
    }
}
