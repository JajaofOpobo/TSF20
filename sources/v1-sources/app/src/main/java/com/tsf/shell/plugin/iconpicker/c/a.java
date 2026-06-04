package com.tsf.shell.plugin.iconpicker.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeDescription;
import com.tsf.shell.theme.inside.ThemeParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends com.tsf.shell.plugin.iconpicker.a {
    String[] j;
    ArrayList k;
    Map l;
    boolean m;
    private ThemeDescription n;

    public a(Context context, String str) {
        super(context, str);
        this.l = new HashMap();
        f.execute(new b(this, context, str));
    }

    static /* synthetic */ void a(a aVar, String str) {
        aVar.n = a(aVar.c);
        if (aVar.n != null) {
            aVar.m = aVar.n.isSecondParserMode;
        }
        if (!aVar.m) {
            aVar.j = aVar.b(str);
            return;
        }
        aVar.k = new ArrayList();
        Iterator it = aVar.n.icon.iconFilter.entrySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) ((Map.Entry) it.next()).getValue();
            if (aVar.n.icon.isIconExist(str2) && !aVar.k.contains(str2)) {
                aVar.k.add(str2);
            }
        }
    }

    @Override // com.tsf.shell.plugin.iconpicker.a, android.widget.Adapter
    public final int getCount() {
        if (!this.i) {
            return 0;
        }
        if (this.m) {
            return this.k.size();
        }
        if (this.j != null) {
            return this.j.length;
        }
        return 0;
    }

    @Override // com.tsf.shell.plugin.iconpicker.a, android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // com.tsf.shell.plugin.iconpicker.a, android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap a(String str) {
        InputStream inputStream;
        Bitmap bitmap;
        Integer num;
        InputStream inputStream2 = null;
        try {
            try {
                num = (Integer) this.l.get(str);
                if (num == null) {
                    num = Integer.valueOf(this.c.getResources().getIdentifier(str, "drawable", this.c.getPackageName()));
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = bitmap;
                try {
                    inputStream2.close();
                } catch (Exception e) {
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2.close();
            throw th;
        }
        if (num.intValue() == 0) {
            InputStream inputStream3 = null;
            try {
                inputStream3.close();
            } catch (Exception e3) {
            }
            return null;
        }
        this.l.put(str, num);
        inputStream = this.c.getResources().openRawResource(num.intValue());
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            try {
                inputStream.close();
                bitmap = decodeStream;
            } catch (Exception e4) {
                bitmap = decodeStream;
            }
        } catch (Exception e5) {
            e = e5;
            e.printStackTrace();
            try {
                inputStream.close();
                bitmap = 0;
            } catch (Exception e6) {
                bitmap = 0;
            }
            if (bitmap != 0) {
            }
        }
        if (bitmap != 0) {
            return null;
        }
        Bitmap copy = (bitmap.getWidth() == 96 && bitmap.getHeight() == 96) ? bitmap.copy(Bitmap.Config.ARGB_8888, false) : Bitmap.createScaledBitmap(bitmap, 96, 96, true);
        bitmap.recycle();
        return copy;
    }

    private String[] b(String str) {
        try {
            return this.a.createPackageContext(str, 2).getAssets().list("theme/icon");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ThemeDescription a(Context context) {
        ThemeParser themeParser;
        try {
            themeParser = new ThemeParser(context);
            try {
                themeParser.parser(4);
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                if (themeParser == null) {
                }
            }
        } catch (Exception e2) {
            e = e2;
            themeParser = null;
        }
        if (themeParser == null) {
            return themeParser.getThemeDescription();
        }
        return null;
    }
}
