package com.tsf.shell.plugin.notice;

import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
/* renamed from: com.tsf.shell.plugin.notice.c */
/* loaded from: classes.dex */
public class C3815c {
    /* renamed from: a */
    public static Element m1374a(String str) {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(C3816d.m1372b(str)).getDocumentElement();
        } catch (Exception e) {
            C3817e.m1369c(e.getMessage());
            return null;
        }
    }
}
