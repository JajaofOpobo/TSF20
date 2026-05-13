package com.tsf.shell.plugin.themepicker;

import com.tsf.shell.plugin.themepicker.C3897k;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* renamed from: com.tsf.shell.plugin.themepicker.j */
/* loaded from: classes.dex */
public class C3896j extends DefaultHandler {

    /* renamed from: b */
    private StringBuilder f12788b = new StringBuilder();

    /* renamed from: a */
    public List<C3897k.C3903e> f12787a = new ArrayList();

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.f12788b.setLength(0);
        if (str2.equals("item")) {
            C3897k.C3903e c3903e = new C3897k.C3903e();
            c3903e.f12797b = attributes.getValue("package");
            c3903e.f12798c = attributes.getValue("preview");
            c3903e.f12796a = attributes.getValue("title");
            this.f12787a.add(c3903e);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        this.f12788b.toString();
        if (str2.equals("preview")) {
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        super.characters(cArr, i, i2);
        this.f12788b.append(cArr, i, i2);
    }
}
