package com.tsf.shell.theme;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes.dex */
public final class o extends DefaultHandler {
    DocumentBuilderFactory a;
    DocumentBuilder b;
    Document c;
    InputStream d;
    private n e;

    public o(Context context) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = new n(context);
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        this.e.a = packageInfo.versionName;
        this.e.b = packageInfo.versionCode;
        this.e.g = packageInfo.packageName;
        try {
            this.d = context.getAssets().open("theme/PreviewDescription.xml");
        } catch (Exception e) {
            try {
                this.d = context.getAssets().open("theme/preview_description.xml");
            } catch (Exception e2) {
                this.d = context.getResources().openRawResource(context.getResources().getIdentifier("preview_description", "raw", context.getPackageName()));
                this.e.j = true;
            }
        }
        this.a = DocumentBuilderFactory.newInstance();
        this.b = this.a.newDocumentBuilder();
        this.c = this.b.parse(this.d);
        NodeList childNodes = this.c.getDocumentElement().getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element = (Element) item;
                String nodeName = element.getNodeName();
                if (nodeName.equals("info")) {
                    n nVar = this.e;
                    String attribute = element.getAttribute("supportHD");
                    nVar.i = (attribute == null || attribute.equals("")) ? false : Boolean.parseBoolean(attribute);
                    this.e.d = element.getAttribute("date");
                    this.e.e = element.getAttribute("author");
                    this.e.f = element.getAttribute("name");
                } else if (nodeName.equals("preview")) {
                    a(element);
                }
            }
        }
        this.d.close();
    }

    public final void a() {
        try {
            this.d.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(Element element) {
        NodeList childNodes = element.getChildNodes();
        this.e.c = element.getAttribute("frontcover");
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                this.e.a(((Element) item).getAttribute("image"));
            }
        }
    }

    public final n b() {
        return this.e;
    }
}
