package com.tsf.shell.widget.alarm.d.a;

import android.content.Context;
import com.tsf.shell.widget.alarm.d.AlarmConfigManager;
import com.tsf.shell.widget.alarm.AlarmState;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmConfigParser {
    public static com.tsf.shell.widget.alarm.d.AlarmConfigDefault a(Context context) {
        try {
            com.tsf.shell.widget.alarm.d.b.AlarmConfigData.a(context);
            String str = "http://androiddoes.accu-weather.com/widget/androiddoes/weather-data.asp?slat=" + com.tsf.shell.widget.alarm.d.b.AlarmConfigData.a() + "&slon=" + com.tsf.shell.widget.alarm.d.b.AlarmConfigData.b();
            i.c("target:" + str);
            com.tsf.shell.widget.alarm.d.AlarmConfigDefault cVar = new com.tsf.shell.widget.alarm.d.AlarmConfigDefault();
            try {
                com.a.a.c.a(str, new AlarmConfigDefaultHandler(cVar));
                cVar.j = d.a(context, cVar.a);
                cVar.b = com.tsf.shell.widget.alarm.d.b.AlarmConfigData.a(cVar.b);
                cVar.k = false;
                return cVar;
            } catch (Exception e) {
                e.printStackTrace();
                return cVar;
            }
        } catch (com.tsf.shell.widget.alarm.d.b.AlarmConfigException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static com.tsf.shell.widget.alarm.d.AlarmConfigDefault a(Context context, String str) {
        try {
            str = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String str2 = "http://androiddoes.accu-weather.com/widget/androiddoes/weather-data.asp?location=" + str;
        i.c("target:" + str2);
        com.tsf.shell.widget.alarm.d.AlarmConfigDefault cVar = new com.tsf.shell.widget.alarm.d.AlarmConfigDefault();
        try {
            com.a.a.c.a(str2, new AlarmConfigDefaultHandler(cVar));
            cVar.j = d.a(context, cVar.a);
            cVar.k = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return cVar;
    }

    public static ArrayList<com.tsf.shell.widget.alarm.d.AlarmConfigEmpty> a(String str) {
        try {
            str = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String str2 = "http://androiddoes.accu-weather.com/widget/androiddoes/city-find.asp?location=" + str;
        i.c("getCityList request:" + str2);
        c cVar = new AlarmConfigThemeHandler();
        try {
            com.a.a.c.a(str2, cVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return cVar.a();
    }

    public static void a(Context context, byte[] bArr) {
        try {
            com.a.a.a.a(context, "CacheV2", bArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] b(Context context) {
        try {
            return com.a.a.a.b(context, "CacheV2");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
