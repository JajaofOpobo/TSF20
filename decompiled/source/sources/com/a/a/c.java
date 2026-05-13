package com.a.a;

import java.io.InputStream;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;
/* loaded from: classes.dex */
public class c {
    public static void a(String str, DefaultHandler defaultHandler) {
        a(b.a(str), defaultHandler);
    }

    public static void a(InputStream inputStream, DefaultHandler defaultHandler) {
        SAXParserFactory.newInstance().newSAXParser().parse(inputStream, defaultHandler);
    }
}
