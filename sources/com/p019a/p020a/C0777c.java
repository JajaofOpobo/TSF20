package com.p019a.p020a;

import java.io.InputStream;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;
/* renamed from: com.a.a.c */
/* loaded from: classes.dex */
public class C0777c {
    /* renamed from: a */
    public static void m11052a(String str, DefaultHandler defaultHandler) {
        m11053a(C0776b.m11054a(str), defaultHandler);
    }

    /* renamed from: a */
    public static void m11053a(InputStream inputStream, DefaultHandler defaultHandler) {
        SAXParserFactory.newInstance().newSAXParser().parse(inputStream, defaultHandler);
    }
}
