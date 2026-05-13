package com.tsf.shell.plugin.themepicker;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/* renamed from: com.tsf.shell.plugin.themepicker.a */
/* loaded from: classes.dex */
public class C3845a extends DefaultHandler {

    /* renamed from: b */
    private StringBuilder f12622b = new StringBuilder();

    /* renamed from: a */
    public List<String> f12621a = new ArrayList();

    /* renamed from: c */
    private boolean f12623c = false;

    /* renamed from: d */
    private int f12624d = 0;

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.f12622b.setLength(0);
        if (str2.equals("item")) {
            this.f12621a.add(attributes.getValue("drawable"));
            if (this.f12623c && this.f12621a.size() >= this.f12624d) {
                throw new SAXException();
            }
        }
    }

    /* renamed from: a */
    public void m1330a(int i) {
        if (i > 0) {
            this.f12624d = i + 5;
            this.f12623c = true;
            return;
        }
        this.f12623c = false;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        this.f12622b.toString();
        if (str2.equals("item")) {
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        super.characters(cArr, i, i2);
        this.f12622b.append(cArr, i, i2);
    }
}
