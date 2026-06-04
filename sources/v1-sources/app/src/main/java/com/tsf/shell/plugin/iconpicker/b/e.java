package com.tsf.shell.plugin.iconpicker.b;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes.dex */
public final class e extends DefaultHandler {
    private StringBuilder b = new StringBuilder();
    public List a = new ArrayList();

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        this.b.setLength(0);
        if (str2.equals("item")) {
            this.a.add(attributes.getValue("drawable"));
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.b.toString();
        str2.equals("item");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        super.characters(cArr, i, i2);
        this.b.append(cArr, i, i2);
    }
}
