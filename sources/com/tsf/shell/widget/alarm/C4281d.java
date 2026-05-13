package com.tsf.shell.widget.alarm;

import android.content.Context;
import android.graphics.Color;
import com.tsf.shell.widget.alarm.C4314m;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* renamed from: com.tsf.shell.widget.alarm.d */
/* loaded from: classes.dex */
public class C4281d {

    /* renamed from: a */
    public static C4283b f13873a = new C4283b();

    /* renamed from: com.tsf.shell.widget.alarm.d$b */
    /* loaded from: classes.dex */
    public static class C4283b {

        /* renamed from: a */
        public boolean f13875a = true;

        /* renamed from: b */
        public int f13876b = -16777216;

        /* renamed from: c */
        public int f13877c = -16777216;

        /* renamed from: d */
        public int f13878d = -16777216;

        /* renamed from: e */
        public int f13879e = -16777216;

        /* renamed from: f */
        public int f13880f = -16777216;
    }

    /* renamed from: a */
    public static void m317a(Context context) {
        InputStream openRawResource;
        try {
            File file = new File(context.getCacheDir().getPath() + "/theme/theme_clock.xml");
            if (file.exists()) {
                openRawResource = new BufferedInputStream(new FileInputStream(file));
            } else {
                openRawResource = context.getResources().openRawResource(C4314m.C4319e.theme_clock);
            }
            SAXParser newSAXParser = SAXParserFactory.newInstance().newSAXParser();
            C4282a c4282a = new C4282a();
            newSAXParser.parse(openRawResource, c4282a);
            f13873a = c4282a.m316a();
            openRawResource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.tsf.shell.widget.alarm.d$a */
    /* loaded from: classes.dex */
    public static class C4282a extends DefaultHandler {

        /* renamed from: a */
        private C4283b f13874a = new C4283b();

        /* renamed from: a */
        public C4283b m316a() {
            return this.f13874a;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            if (str2.equals("high")) {
                this.f13874a.f13877c = Color.parseColor(attributes.getValue("color"));
            } else if (str2.equals("low")) {
                this.f13874a.f13876b = Color.parseColor(attributes.getValue("color"));
            } else if (str2.equals("text")) {
                this.f13874a.f13880f = Color.parseColor(attributes.getValue("color"));
            } else if (str2.equals("week")) {
                this.f13874a.f13878d = Color.parseColor(attributes.getValue("color"));
            } else if (str2.equals("ampm")) {
                this.f13874a.f13879e = Color.parseColor(attributes.getValue("color"));
            } else if (str2.equals("doubleSizeEnable")) {
                this.f13874a.f13875a = Boolean.valueOf(attributes.getValue("enable")).booleanValue();
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
        }
    }
}
