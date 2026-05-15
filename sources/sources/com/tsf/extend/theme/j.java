package com.tsf.extend.theme;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class j {
    public static boolean a = false;
    private String b = null;
    private String c = null;
    private String d = null;

    public interface a {
        void a();

        void a(String str);
    }

    public void a(Context context, int i, String str, aq aqVar, a aVar) {
        a(context, com.tsf.extend.base.g.d.a(this.b, (String) null, context.getResources().getString(f.g.share_title), context.getResources().getString(aqVar != null ? f.g.theme_share_content : f.g.share_gp_theme_link), str, 2), i, aVar);
    }

    public static void a(Context context, String str, String str2, a aVar) {
        new com.tsf.extend.base.g.c(context, com.tsf.extend.base.g.d.a((String) null, (String) null, TextUtils.isEmpty(str) ? context.getResources().getString(f.g.share_on) : str, str2, (String) null, 0), aVar).a(context, false);
    }

    private void a(Context context, Intent intent, int i, a aVar) {
        com.tsf.extend.base.g.d cVar;
        switch (i) {
            case 0:
                cVar = new com.tsf.extend.base.g.a(context, intent);
                break;
            case 1:
                cVar = new com.tsf.extend.base.g.e(context, intent);
                break;
            case 2:
                cVar = new com.tsf.extend.base.g.c(context, intent, aVar);
                break;
            default:
                return;
        }
        if (cVar != null) {
            cVar.a(context);
        }
    }

    public static Bitmap a(Context context, String str) {
        return BitmapFactory.decodeFile(str);
    }
}
