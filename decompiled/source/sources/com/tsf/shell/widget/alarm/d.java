package com.tsf.shell.widget.alarm;

import android.content.Context;
import android.graphics.Color;
import com.tsf.shell.widget.alarm.m;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* loaded from: classes.dex */
public class d {
    public static b a = new b();

    /* loaded from: classes.dex */
    public static class b {
        public boolean a = true;
        public int b = -16777216;
        public int c = -16777216;
        public int d = -16777216;
        public int e = -16777216;
        public int f = -16777216;
    }

    public static void a(Context context) {
        InputStream openRawResource;
        try {
            File file = new File(context.getCacheDir().getPath() + "/theme/theme_clock.xml");
            if (file.exists()) {
                openRawResource = new BufferedInputStream(new FileInputStream(file));
            } else {
                openRawResource = context.getResources().openRawResource(m.e.theme_clock);
            }
            SAXParser newSAXParser = SAXParserFactory.newInstance().newSAXParser();
            a aVar = new a();
            newSAXParser.parse(openRawResource, aVar);
            a = aVar.a();
            openRawResource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* loaded from: classes.dex */
    public static class a extends DefaultHandler {
        private b a = new b();

        public b a() {
            return this.a;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            if (str2.equals("high")) {
                this.a.c = Color.parseColor(attributes.getValue("color"));
            } else if (str2.equals("low")) {
                this.a.b = Color.parseColor(attributes.getValue("color"));
            } else if (str2.equals("text")) {
                this.a.f = Color.parseColor(attributes.getValue("color"));
            } else if (str2.equals("week")) {
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
}
