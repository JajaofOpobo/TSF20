package com.tsf.extend.theme;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.tsf.extend.ResourceIds;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeShareHandler {
    public static boolean a = false;
    private String b = null;
    private String c = null;
    private String d = null;

    public interface a {
        void a();

        void a(String str);
    }

    public void a(Context context, int i, String str, aq aqVar, A aVar) {
        a(context, com.tsf.extend.base.g.BaseShareHandler.a(this.b, (String) null, context.getResources().getString(ResourceIds.g.share_title), context.getResources().getString(aqVar != null ? ResourceIds.g.theme_share_content : ResourceIds.g.share_gp_theme_link), str, 2), i, aVar);
    }

    public static void a(Context context, String str, String str2, A aVar) {
        new com.tsf.extend.base.g.ShareIntentHandler(context, com.tsf.extend.base.g.BaseShareHandler.a((String) null, (String) null, TextUtils.isEmpty(str) ? context.getResources().getString(ResourceIds.g.share_on) : str, str2, (String) null, 0), aVar).a(context, false);
    }

    private void a(Context context, Intent intent, int i, A aVar) {
        com.tsf.extend.base.g.BaseShareHandler cVar;
        switch (i) {
            case 0:
                cVar = new com.tsf.extend.base.g.FacebookShare(context, intent);
                break;
            case 1:
                cVar = new com.tsf.extend.base.g.TwitterShare(context, intent);
                break;
            case 2:
                cVar = new com.tsf.extend.base.g.ShareIntentHandler(context, intent, aVar);
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
