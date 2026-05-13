package com.tsf.extend.theme;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p077g.C1407a;
import com.tsf.extend.base.p077g.C1409c;
import com.tsf.extend.base.p077g.C1411d;
import com.tsf.extend.base.p077g.C1412e;
/* renamed from: com.tsf.extend.theme.j */
/* loaded from: classes.dex */
public class C1846j {

    /* renamed from: a */
    public static boolean f5911a = false;

    /* renamed from: b */
    private String f5912b = null;

    /* renamed from: c */
    private String f5913c = null;

    /* renamed from: d */
    private String f5914d = null;

    /* renamed from: com.tsf.extend.theme.j$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1847a {
        /* renamed from: a */
        void mo7333a();

        /* renamed from: a */
        void mo7332a(String str);
    }

    /* renamed from: a */
    public void m7337a(Context context, int i, String str, AbstractC1700aq abstractC1700aq, InterfaceC1847a interfaceC1847a) {
        m7336a(context, C1411d.m8760a(this.f5912b, (String) null, context.getResources().getString(C1536f.C1543g.share_title), context.getResources().getString(abstractC1700aq != null ? C1536f.C1543g.theme_share_content : C1536f.C1543g.share_gp_theme_link), str, 2), i, interfaceC1847a);
    }

    /* renamed from: a */
    public static void m7334a(Context context, String str, String str2, InterfaceC1847a interfaceC1847a) {
        new C1409c(context, C1411d.m8760a((String) null, (String) null, TextUtils.isEmpty(str) ? context.getResources().getString(C1536f.C1543g.share_on) : str, str2, (String) null, 0), interfaceC1847a).m8763a(context, false);
    }

    /* renamed from: a */
    private void m7336a(Context context, Intent intent, int i, InterfaceC1847a interfaceC1847a) {
        C1411d c1409c;
        switch (i) {
            case 0:
                c1409c = new C1407a(context, intent);
                break;
            case 1:
                c1409c = new C1412e(context, intent);
                break;
            case 2:
                c1409c = new C1409c(context, intent, interfaceC1847a);
                break;
            default:
                return;
        }
        if (c1409c != null) {
            c1409c.mo8761a(context);
        }
    }

    /* renamed from: a */
    public static Bitmap m7335a(Context context, String str) {
        return BitmapFactory.decodeFile(str);
    }
}
