package com.tsf.shell.widget.alarm.p205d;

import com.tsf.shell.widget.alarm.C4305i;
import java.lang.reflect.Field;
/* renamed from: com.tsf.shell.widget.alarm.d.c */
/* loaded from: classes.dex */
public class C4292c extends AbstractC4288b {

    /* renamed from: j */
    public byte[] f13903j;

    /* renamed from: a */
    public int f13894a = -1;

    /* renamed from: b */
    public String f13895b = "-- --";

    /* renamed from: c */
    public String f13896c = "";

    /* renamed from: d */
    public String f13897d = "--";

    /* renamed from: e */
    public String f13898e = "--";

    /* renamed from: f */
    public String f13899f = "--";

    /* renamed from: g */
    public String f13900g = "--";

    /* renamed from: h */
    public String f13901h = "--";

    /* renamed from: i */
    public String f13902i = "--";

    /* renamed from: k */
    public boolean f13904k = true;

    /* renamed from: b */
    public void m298b() {
        Field[] declaredFields;
        for (Field field : C4292c.class.getDeclaredFields()) {
            C4305i.m262a(field.getName());
            try {
                Object obj = field.get(this);
                if (obj instanceof String) {
                    C4305i.m259c("Name:" + field.getName() + "  Value:" + obj);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        }
    }
}
