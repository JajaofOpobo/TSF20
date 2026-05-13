package com.tsf.shell.widget.alarm.p205d.p206a;

import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.p205d.C4292c;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* renamed from: com.tsf.shell.widget.alarm.d.a.b */
/* loaded from: classes.dex */
public class C4286b extends DefaultHandler {

    /* renamed from: a */
    private StringBuilder f13884a = new StringBuilder();

    /* renamed from: b */
    private C4292c f13885b;

    public C4286b(C4292c c4292c) {
        this.f13885b = c4292c;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.f13884a.setLength(0);
        if (str2.equalsIgnoreCase("currentconditions")) {
            C4305i.m259c("daylight:" + Boolean.parseBoolean(attributes.getValue("daylight")));
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        String sb = this.f13884a.toString();
        if (str2.equalsIgnoreCase("country") && this.f13885b.f13896c.equals("")) {
            this.f13885b.f13896c = sb;
        } else if (str2.equalsIgnoreCase("city") && this.f13885b.f13895b.equals("-- --")) {
            this.f13885b.f13895b = sb;
        } else if (str2.equalsIgnoreCase("temperature") && this.f13885b.f13902i.equals("--")) {
            this.f13885b.f13902i = sb;
            this.f13885b.f13899f = m309a(sb);
        } else if (str2.equalsIgnoreCase("hightemperature") && this.f13885b.f13900g.equals("--")) {
            this.f13885b.f13900g = sb;
            this.f13885b.f13897d = m309a(sb);
        } else if (str2.equalsIgnoreCase("lowtemperature") && this.f13885b.f13901h.equals("--")) {
            this.f13885b.f13901h = sb;
            this.f13885b.f13898e = m309a(sb);
        } else if (str2.equalsIgnoreCase("weathericon") && this.f13885b.f13894a == -1) {
            try {
                this.f13885b.f13894a = Integer.valueOf(sb).intValue();
            } catch (Exception e) {
                this.f13885b.f13894a = -2;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        super.characters(cArr, i, i2);
        this.f13884a.append(cArr, i, i2);
    }

    /* renamed from: a */
    public int m310a(int i) {
        return Math.round(((i - 32) * 5) / 9.0f);
    }

    /* renamed from: a */
    public String m309a(String str) {
        try {
            return String.valueOf(m310a(Integer.parseInt(str)));
        } catch (Exception e) {
            e.printStackTrace();
            return "--";
        }
    }
}
