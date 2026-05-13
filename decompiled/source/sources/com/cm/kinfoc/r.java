package com.cm.kinfoc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;
/* loaded from: classes.dex */
public class r {
    protected com.ksmobile.a.b.a<String, Properties> a = new com.ksmobile.a.b.a<>();
    private transient String b;
    private transient Properties c;

    public r(String str) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
        a(bufferedReader);
        bufferedReader.close();
    }

    protected void a(BufferedReader bufferedReader) {
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                a(readLine);
            } else {
                return;
            }
        }
    }

    protected void a(String str) {
        String trim = str.trim();
        if (trim.matches("\\[.*\\]")) {
            this.b = trim.replaceFirst("\\[(.*)\\]", "$1");
            this.c = new Properties();
        } else if (trim.matches(".*=.*")) {
            int indexOf = trim.indexOf(61);
            this.c.setProperty(trim.substring(0, indexOf), trim.substring(indexOf + 1));
            this.a.put(this.b, this.c);
        }
    }

    public int a(String str, String str2, int i) {
        try {
            return Integer.parseInt(a(str, str2, Integer.toString(i)));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return i;
        }
    }

    public String a(String str, String str2, String str3) {
        String property;
        Properties properties = this.a.get(str);
        return (properties == null || (property = properties.getProperty(str2)) == null) ? str3 : property;
    }
}
