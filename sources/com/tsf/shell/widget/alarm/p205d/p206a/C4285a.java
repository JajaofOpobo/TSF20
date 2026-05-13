package com.tsf.shell.widget.alarm.p205d.p206a;

import android.content.Context;
import com.p019a.p020a.C0775a;
import com.p019a.p020a.C0777c;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.p205d.C4284a;
import com.tsf.shell.widget.alarm.p205d.C4292c;
import com.tsf.shell.widget.alarm.p205d.C4293d;
import com.tsf.shell.widget.alarm.p205d.p207b.C4289a;
import com.tsf.shell.widget.alarm.p205d.p207b.C4291b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.widget.alarm.d.a.a */
/* loaded from: classes.dex */
public class C4285a {
    /* renamed from: a */
    public static C4292c m315a(Context context) {
        try {
            C4289a.m304a(context);
            String str = "http://androiddoes.accu-weather.com/widget/androiddoes/weather-data.asp?slat=" + C4289a.m305a() + "&slon=" + C4289a.m300b();
            C4305i.m259c("target:" + str);
            C4292c c4292c = new C4292c();
            try {
                C0777c.m11052a(str, new C4286b(c4292c));
                c4292c.f13903j = C4293d.m297a(context, c4292c.f13894a);
                c4292c.f13895b = C4289a.m301a(c4292c.f13895b);
                c4292c.f13904k = false;
                return c4292c;
            } catch (Exception e) {
                e.printStackTrace();
                return c4292c;
            }
        } catch (C4291b e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C4292c m314a(Context context, String str) {
        try {
            str = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String str2 = "http://androiddoes.accu-weather.com/widget/androiddoes/weather-data.asp?location=" + str;
        C4305i.m259c("target:" + str2);
        C4292c c4292c = new C4292c();
        try {
            C0777c.m11052a(str2, new C4286b(c4292c));
            c4292c.f13903j = C4293d.m297a(context, c4292c.f13894a);
            c4292c.f13904k = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return c4292c;
    }

    /* renamed from: a */
    public static ArrayList<C4284a> m312a(String str) {
        try {
            str = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String str2 = "http://androiddoes.accu-weather.com/widget/androiddoes/city-find.asp?location=" + str;
        C4305i.m259c("getCityList request:" + str2);
        C4287c c4287c = new C4287c();
        try {
            C0777c.m11052a(str2, c4287c);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return c4287c.m308a();
    }

    /* renamed from: a */
    public static void m313a(Context context, byte[] bArr) {
        try {
            C0775a.m11058a(context, "CacheV2", bArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static byte[] m311b(Context context) {
        try {
            return C0775a.m11055b(context, "CacheV2");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
