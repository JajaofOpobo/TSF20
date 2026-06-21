package com.tsf.shell.widget.alarm.d;

import com.tsf.shell.widget.alarm.AlarmState;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmConfigDefault extends AlarmConfigBase {
    public byte[] j;
    public int a = -1;
    public String a;
    public String a;
    public String a;
    public String a;
    public String a;
    public String a;
    public String a;
    public String a;
    public boolean k = true;

    public void b() {
        for (Field field : AlarmConfigDefault.class.getDeclaredFields()) {
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
