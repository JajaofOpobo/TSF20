package com.cm.kinfoc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class r {
    protected com.ksmobile.a.b.a<String, Properties> a = new com.ksmobile.a.b.a<>();
    private transient String b;
    private transient Properties c;

    public r(String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
        a(bufferedReader);
        bufferedReader.close();
    }

    protected void a(BufferedReader bufferedReader) throws IOException {
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                a(line);
            } else {
                return;
            }
        }
    }

    protected void a(String str) {
        String strTrim = str.trim();
        if (strTrim.matches("\\[.*\\]")) {
            this.b = strTrim.replaceFirst("\\[(.*)\\]", "$1");
            this.c = new Properties();
        } else if (strTrim.matches(".*=.*")) {
            int iIndexOf = strTrim.indexOf(61);
            this.c.setProperty(strTrim.substring(0, iIndexOf), strTrim.substring(iIndexOf + 1));
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
