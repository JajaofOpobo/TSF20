package com.tsf.shell.widget.alarm;

import android.graphics.Color;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes.dex */
public class k extends DefaultHandler {
    private l a = new l();

    public l a() {
        return this.a;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str2.equals("high")) {
            this.a.c = Color.parseColor(attributes.getValue("color"));
            return;
        }
        if (str2.equals("low")) {
            this.a.b = Color.parseColor(attributes.getValue("color"));
            return;
        }
        if (str2.equals("text")) {
            this.a.f = Color.parseColor(attributes.getValue("color"));
            return;
        }
        if (str2.equals("week")) {
            this.a.d = Color.parseColor(attributes.getValue("color"));
        } else if (str2.equals("ampm")) {
            this.a.e = Color.parseColor(attributes.getValue("color"));
        } else if (str2.equals("doubleSizeEnable")) {
            this.a.a = Boolean.valueOf(attributes.getValue("enable")).booleanValue();
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
    }
}
