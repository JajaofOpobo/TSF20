package com.tsf.shell.plugin.notice;

import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
/* loaded from: classes.dex */
public class c {
    public static Element a(String str) {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(d.b(str)).getDocumentElement();
        } catch (Exception e) {
            e.c(e.getMessage());
            return null;
        }
    }
}
