package com.tsf.extend.theme;
/* renamed from: com.tsf.extend.theme.h */
/* loaded from: classes.dex */
public class C1844h {
    /* renamed from: a */
    public static boolean m7341a(String str) {
        return "theme_promotion_menu".equals(str) || "theme_push_desk_icon".equals(str) || "theme_promotion_allapp".equals(str) || "theme_promotion_weather".equals(str) || "theme_from_screensaver".equals(str) || "5".equals(str) || "4".equals(str) || "2".equals(str) || "15".equals(str) || "16".equals(str) || "17".equals(str);
    }

    /* renamed from: b */
    public static String m7340b(String str) {
        if (str.equals("theme_promotion_menu")) {
            return "112";
        }
        if (str.equals("theme_push_desk_icon")) {
            return "115";
        }
        if (str.equals("theme_promotion_allapp")) {
            return "111";
        }
        if (str.equals("theme_promotion_weather")) {
            return "113";
        }
        if (str.equals("theme_from_screensaver")) {
            return "116";
        }
        if ("5".equals(str)) {
            return "106";
        }
        if ("4".equals(str)) {
            return "105";
        }
        if ("2".equals(str)) {
            return "107";
        }
        if ("15".equals(str) || "16".equals(str) || "17".equals(str)) {
            return "119";
        }
        return "";
    }
}
