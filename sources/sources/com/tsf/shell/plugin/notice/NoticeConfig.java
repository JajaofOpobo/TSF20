package com.tsf.shell.plugin.notice;

import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class NoticeConfig {
    public static Element a(String str) {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(NoticeRenderer.b(str)).getDocumentElement();
        } catch (Exception e) {
            NoticeEvent.c(NoticeEvent.getMessage());
            return null;
        }
    }
}
