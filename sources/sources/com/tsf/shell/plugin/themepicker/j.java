package com.tsf.shell.plugin.themepicker;

import com.tsf.shell.plugin.themepicker.k;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class j extends DefaultHandler {
    private StringBuilder b = new StringBuilder();
    public List<k.e> a = new ArrayList();

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.b.setLength(0);
        if (str2.equals("item")) {
            k.e eVar = new k.e();
            eVar.b = attributes.getValue("package");
            eVar.c = attributes.getValue("preview");
            eVar.a = attributes.getValue("title");
            this.a.add(eVar);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        this.b.toString();
        if (str2.equals("preview")) {
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        super.characters(cArr, i, i2);
        this.b.append(cArr, i, i2);
    }
}
