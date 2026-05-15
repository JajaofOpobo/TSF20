package com.a.a;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    public static void a(String str, DefaultHandler defaultHandler) throws SAXException, IOException {
        a(b.a(str), defaultHandler);
    }

    public static void a(InputStream inputStream, DefaultHandler defaultHandler) throws SAXException, IOException {
        SAXParserFactory.newInstance().newSAXParser().parse(inputStream, defaultHandler);
    }
}
