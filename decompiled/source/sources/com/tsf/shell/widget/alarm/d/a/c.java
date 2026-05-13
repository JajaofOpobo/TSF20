package com.tsf.shell.widget.alarm.d.a;

import com.tsf.shell.widget.alarm.i;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* loaded from: classes.dex */
public class c extends DefaultHandler {
    private StringBuilder a = new StringBuilder();
    private ArrayList<com.tsf.shell.widget.alarm.d.a> b = new ArrayList<>();

    public ArrayList<com.tsf.shell.widget.alarm.d.a> a() {
        return this.b;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.a.setLength(0);
        if (str2.equalsIgnoreCase("location")) {
            com.tsf.shell.widget.alarm.d.a aVar = new com.tsf.shell.widget.alarm.d.a();
            aVar.a = attributes.getValue("city");
            aVar.c = attributes.getValue("location");
            aVar.b = attributes.getValue("country");
            i.c("cnt:" + aVar.c);
            this.b.add(aVar);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        this.a.toString();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        super.characters(cArr, i, i2);
        this.a.append(cArr, i, i2);
    }
}
