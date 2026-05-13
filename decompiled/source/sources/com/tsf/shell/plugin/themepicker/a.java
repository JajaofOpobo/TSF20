package com.tsf.shell.plugin.themepicker;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/* loaded from: classes.dex */
public class a extends DefaultHandler {
    private StringBuilder b = new StringBuilder();
    public List<String> a = new ArrayList();
    private boolean c = false;
    private int d = 0;

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.b.setLength(0);
        if (str2.equals("item")) {
            this.a.add(attributes.getValue("drawable"));
            if (this.c && this.a.size() >= this.d) {
                throw new SAXException();
            }
        }
    }

    public void a(int i) {
        if (i > 0) {
            this.d = i + 5;
            this.c = true;
            return;
        }
        this.c = false;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        this.b.toString();
        if (str2.equals("item")) {
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        super.characters(cArr, i, i2);
        this.b.append(cArr, i, i2);
    }
}
