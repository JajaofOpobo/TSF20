package com.p060cm.kinfoc;

import com.ksmobile.p063a.p065b.C1281a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;
/* renamed from: com.cm.kinfoc.r */
/* loaded from: classes.dex */
public class C1172r {

    /* renamed from: a */
    protected C1281a<String, Properties> f3723a = new C1281a<>();

    /* renamed from: b */
    private transient String f3724b;

    /* renamed from: c */
    private transient Properties f3725c;

    public C1172r(String str) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
        m9592a(bufferedReader);
        bufferedReader.close();
    }

    /* renamed from: a */
    protected void m9592a(BufferedReader bufferedReader) {
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                m9591a(readLine);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    protected void m9591a(String str) {
        String trim = str.trim();
        if (trim.matches("\\[.*\\]")) {
            this.f3724b = trim.replaceFirst("\\[(.*)\\]", "$1");
            this.f3725c = new Properties();
        } else if (trim.matches(".*=.*")) {
            int indexOf = trim.indexOf(61);
            this.f3725c.setProperty(trim.substring(0, indexOf), trim.substring(indexOf + 1));
            this.f3723a.put(this.f3724b, this.f3725c);
        }
    }

    /* renamed from: a */
    public int m9590a(String str, String str2, int i) {
        try {
            return Integer.parseInt(m9589a(str, str2, Integer.toString(i)));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return i;
        }
    }

    /* renamed from: a */
    public String m9589a(String str, String str2, String str3) {
        String property;
        Properties properties = this.f3723a.get(str);
        return (properties == null || (property = properties.getProperty(str2)) == null) ? str3 : property;
    }
}
