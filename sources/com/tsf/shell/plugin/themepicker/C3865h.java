package com.tsf.shell.plugin.themepicker;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* renamed from: com.tsf.shell.plugin.themepicker.h */
/* loaded from: classes.dex */
public class C3865h extends DefaultHandler {

    /* renamed from: b */
    private StringBuilder f12652b = new StringBuilder();

    /* renamed from: a */
    public List<String> f12651a = new ArrayList();

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.f12652b.setLength(0);
        if (str2.equals("preview")) {
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                String value = attributes.getValue(i);
                this.f12651a.add(value);
                C3851e.m1317b("preview:" + value);
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        this.f12652b.toString();
        if (str2.equals("preview")) {
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        super.characters(cArr, i, i2);
        this.f12652b.append(cArr, i, i2);
    }
}
