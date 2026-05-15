package com.tsf.shell.widget.alarm.provider;

import android.net.Uri;
import android.provider.BaseColumns;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a implements BaseColumns {
    public static String a = "AUTOLocation";
    public static String b = "useCelsius";
    public static String c = "LocationName";
    public static String d = "LocationCode";
    public static String e = "AUTOUpdateDuration";
    public static String f = "updateTime";
    public static String g = "historySearch";
    public static String h = "latitude";
    public static String i = "longitude";
    public static String j = "SnoozeDuration";
    public static String k = "WidgetRefreshDuration";
    public static final Uri l = Uri.parse("content://com.tsf.shell.widget.alarm.inshell.setting.provider/settings");
}
