package com.tsf.shell.plugin.themepicker;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes.dex */
public class ab extends DefaultHandler {
    private StringBuilder b = new StringBuilder();
    public List a = new ArrayList();

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.b.setLength(0);
        if (str2.equals("item")) {
            ah ahVar = new ah();
            ahVar.b = attributes.getValue("package");
            ahVar.c = attributes.getValue("preview");
            ahVar.a = attributes.getValue("title");
            this.a.add(ahVar);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        this.b.toString();
        str2.equals("preview");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        super.characters(cArr, i, i2);
        this.b.append(cArr, i, i2);
    }
}
