package com.tsf.shell.widget.alarm.d;

import com.tsf.shell.widget.alarm.i;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class c extends b {
    public byte[] j;
    public int a = -1;
    public String b = "-- --";
    public String c = "";
    public String d = "--";
    public String e = "--";
    public String f = "--";
    public String g = "--";
    public String h = "--";
    public String i = "--";
    public boolean k = true;

    public void b() {
        Field[] declaredFields;
        for (Field field : c.class.getDeclaredFields()) {
            i.a(field.getName());
            try {
                Object obj = field.get(this);
                if (obj instanceof String) {
                    i.c("Name:" + field.getName() + "  Value:" + obj);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        }
    }
}
