package com.tsf.shell.theme.inside.parser;

import android.content.Context;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes.dex */
class a extends DefaultHandler {
    public ArrayList a;
    private StringBuilder b;
    private int c;
    private Context d;

    private a() {
        this.b = new StringBuilder();
        this.a = new ArrayList();
        this.c = 0;
    }

    /* synthetic */ a(a aVar) {
        this();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        int drawableResourceId;
        this.b.setLength(0);
        if (str2.equals("item")) {
            drawableResourceId = IconPreviewLoader.getDrawableResourceId(this.d, attributes.getValue("drawable"));
            Integer valueOf = Integer.valueOf(drawableResourceId);
            if (valueOf.intValue() != 0) {
                this.a.add(valueOf);
                if (this.a.size() >= this.c) {
                    throw new SAXException();
                }
            }
        }
    }

    public void a(int i) {
        this.c = i;
    }

    public void a(Context context) {
        this.d = context;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        super.characters(cArr, i, i2);
        this.b.append(cArr, i, i2);
    }
}
