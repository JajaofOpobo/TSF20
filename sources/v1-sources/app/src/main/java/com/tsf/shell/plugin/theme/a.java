package com.tsf.shell.plugin.theme;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeDescription;
import com.tsf.shell.theme.inside.element.ThemePageManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends ArrayAdapter {
    int a;
    private final ArrayList b;
    private final Context c;

    public a(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.a = 0;
        this.b = arrayList;
        this.c = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ThemeElementSubItem themeElementSubItem;
        if (view == null) {
            view = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.theme_element_item, (ViewGroup) null);
        }
        if (i < getCount() && (themeElementSubItem = (ThemeElementSubItem) this.b.get(i)) != null) {
            TextView textView = (TextView) view.findViewById(R.id.title);
            TextView textView2 = (TextView) view.findViewById(R.id.count);
            ImageView imageView = (ImageView) view.findViewById(R.id.image);
            textView.setText(themeElementSubItem.b);
            textView2.setVisibility(8);
            if (themeElementSubItem.a == null) {
                String[] strArr = themeElementSubItem.d;
                if (themeElementSubItem.g == 5) {
                    Bitmap createPreviewBitmap = ThemePageManager.createPreviewBitmap(ThemeDescription.getBitmp(this.c, themeElementSubItem.c, themeElementSubItem.d[0], themeElementSubItem.e, themeElementSubItem.f), ThemeDescription.getBitmp(this.c, themeElementSubItem.c, themeElementSubItem.d[1], themeElementSubItem.e, themeElementSubItem.f));
                    if (createPreviewBitmap != null) {
                        themeElementSubItem.a = createPreviewBitmap;
                    } else {
                        this.b.remove(i);
                        notifyDataSetChanged();
                    }
                } else if (strArr.length <= 1) {
                    Bitmap bitmp = ThemeDescription.getBitmp(this.c, themeElementSubItem.c, themeElementSubItem.d[0], themeElementSubItem.e, themeElementSubItem.f);
                    if (bitmp != null) {
                        themeElementSubItem.a = bitmp;
                    } else {
                        this.b.remove(i);
                        notifyDataSetChanged();
                    }
                } else {
                    Bitmap bitmp2 = ThemeDescription.getBitmp(this.c, themeElementSubItem.c, themeElementSubItem.d[0], themeElementSubItem.e, themeElementSubItem.f);
                    if (bitmp2 != null) {
                        Bitmap copy = bitmp2.copy(Bitmap.Config.ARGB_8888, true);
                        bitmp2.recycle();
                        Canvas canvas = new Canvas(copy);
                        for (int i2 = 1; i2 < strArr.length; i2++) {
                            Bitmap bitmp3 = ThemeDescription.getBitmp(this.c, themeElementSubItem.c, themeElementSubItem.d[i2], themeElementSubItem.e, themeElementSubItem.f);
                            if (bitmp3 != null) {
                                canvas.drawBitmap(bitmp3, (copy.getWidth() - bitmp3.getWidth()) / 2, (copy.getHeight() - bitmp3.getHeight()) / 2, (Paint) null);
                                bitmp3.recycle();
                            }
                        }
                        themeElementSubItem.a = copy;
                    } else {
                        this.b.remove(i);
                        notifyDataSetChanged();
                    }
                }
            }
            imageView.setImageBitmap(themeElementSubItem.a);
        }
        return view;
    }
}
