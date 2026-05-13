package com.tsf.shell.widget.alarm.p205d.p206a;

import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.p205d.C4284a;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* renamed from: com.tsf.shell.widget.alarm.d.a.c */
/* loaded from: classes.dex */
public class C4287c extends DefaultHandler {

    /* renamed from: a */
    private StringBuilder f13886a = new StringBuilder();

    /* renamed from: b */
    private ArrayList<C4284a> f13887b = new ArrayList<>();

    /* renamed from: a */
    public ArrayList<C4284a> m308a() {
        return this.f13887b;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.f13886a.setLength(0);
        if (str2.equalsIgnoreCase("location")) {
            C4284a c4284a = new C4284a();
            c4284a.f13881a = attributes.getValue("city");
            c4284a.f13883c = attributes.getValue("location");
            c4284a.f13882b = attributes.getValue("country");
            C4305i.m259c("cnt:" + c4284a.f13883c);
            this.f13887b.add(c4284a);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        this.f13886a.toString();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        super.characters(cArr, i, i2);
        this.f13886a.append(cArr, i, i2);
    }
}
