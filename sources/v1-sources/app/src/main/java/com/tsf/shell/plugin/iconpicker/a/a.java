package com.tsf.shell.plugin.iconpicker.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeIconDescription;
import com.tsf.shell.theme.inside.ThemeIconPackageParser;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends com.tsf.shell.plugin.iconpicker.a {
    private List j;

    public a(Context context, String str) {
        super(context, str);
        f.execute(new b(this, str));
    }

    @Override // com.tsf.shell.plugin.iconpicker.a, android.widget.Adapter
    public final int getCount() {
        if (this.j == null) {
            return 0;
        }
        return this.j.size();
    }

    @Override // com.tsf.shell.plugin.iconpicker.a
    public final void a(View view, int i) {
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView1);
        View findViewById = view.findViewById(R.id.progress);
        Bitmap a = a(Integer.valueOf(i));
        if (a != null) {
            imageView.setVisibility(0);
            imageView.setImageBitmap(a);
            findViewById.setVisibility(8);
        } else {
            e.execute(new c(this, i, imageView, findViewById));
        }
    }

    public static List a(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        ThemeIconDescription parser = new ThemeIconPackageParser().parser(context);
        if (parser != null) {
            Iterator it = parser.iconFilter.entrySet().iterator();
            while (it.hasNext()) {
                int isIconExistId = parser.isIconExistId((String) ((Map.Entry) it.next()).getValue());
                if (isIconExistId != 0 && !arrayList.contains(Integer.valueOf(isIconExistId))) {
                    arrayList.add(Integer.valueOf(isIconExistId));
                }
            }
        } else {
            try {
                Resources resources = context.getResources();
                for (String str2 : resources.getStringArray(resources.getIdentifier(String.valueOf(str) + ":array/icon_pack", null, null))) {
                    int identifier = resources.getIdentifier(String.valueOf(str) + ":drawable/" + str2, null, null);
                    if (identifier != 0) {
                        arrayList.add(Integer.valueOf(identifier));
                    }
                }
            } catch (Exception e) {
                try {
                    Class<?> cls = Class.forName(String.valueOf(str) + ".R$drawable", true, new PathClassLoader(context.getApplicationInfo().sourceDir, ClassLoader.getSystemClassLoader()));
                    for (Field field : cls.getFields()) {
                        arrayList.add(Integer.valueOf(field.getInt(cls)));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}
