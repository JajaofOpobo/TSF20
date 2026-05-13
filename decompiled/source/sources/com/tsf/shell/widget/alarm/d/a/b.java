package com.tsf.shell.widget.alarm.d.a;

import com.tsf.shell.widget.alarm.i;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* loaded from: classes.dex */
public class b extends DefaultHandler {
    private StringBuilder a = new StringBuilder();
    private com.tsf.shell.widget.alarm.d.c b;

    public b(com.tsf.shell.widget.alarm.d.c cVar) {
        this.b = cVar;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.a.setLength(0);
        if (str2.equalsIgnoreCase("currentconditions")) {
            i.c("daylight:" + Boolean.parseBoolean(attributes.getValue("daylight")));
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        String sb = this.a.toString();
        if (str2.equalsIgnoreCase("country") && this.b.c.equals("")) {
            this.b.c = sb;
        } else if (str2.equalsIgnoreCase("city") && this.b.b.equals("-- --")) {
            this.b.b = sb;
        } else if (str2.equalsIgnoreCase("temperature") && this.b.i.equals("--")) {
            this.b.i = sb;
            this.b.f = a(sb);
        } else if (str2.equalsIgnoreCase("hightemperature") && this.b.g.equals("--")) {
            this.b.g = sb;
            this.b.d = a(sb);
        } else if (str2.equalsIgnoreCase("lowtemperature") && this.b.h.equals("--")) {
            this.b.h = sb;
            this.b.e = a(sb);
        } else if (str2.equalsIgnoreCase("weathericon") && this.b.a == -1) {
            try {
                this.b.a = Integer.valueOf(sb).intValue();
            } catch (Exception e) {
                this.b.a = -2;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        super.characters(cArr, i, i2);
        this.a.append(cArr, i, i2);
    }

    public int a(int i) {
        return Math.round(((i - 32) * 5) / 9.0f);
    }

    public String a(String str) {
        try {
            return String.valueOf(a(Integer.parseInt(str)));
        } catch (Exception e) {
            e.printStackTrace();
            return "--";
        }
    }
}
