package com.tsf.shell.plugin.iconpicker.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tsf.shell.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public final class a extends com.tsf.shell.plugin.iconpicker.a {
    List j;

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
        Context context2 = null;
        ArrayList arrayList = new ArrayList();
        e eVar = new e();
        try {
            context2 = context.createPackageContext(str, 2);
            InputStream open = context2.getAssets().open("drawable.xml");
            if (open != null) {
                SAXParserFactory.newInstance().newSAXParser().parse(open, eVar);
                open.close();
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (ParserConfigurationException e3) {
            e3.printStackTrace();
        } catch (SAXException e4) {
            e4.printStackTrace();
        }
        if (context2 != null) {
            Resources resources = context2.getResources();
            int size = eVar.a.size();
            for (int i = 0; i < size; i++) {
                try {
                    int identifier = resources.getIdentifier(String.valueOf(str) + ":drawable/" + ((String) eVar.a.get(i)), null, null);
                    if (identifier != 0) {
                        arrayList.add(Integer.valueOf(identifier));
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}
