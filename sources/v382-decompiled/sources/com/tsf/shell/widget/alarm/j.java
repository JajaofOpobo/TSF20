package com.tsf.shell.widget.alarm;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/* loaded from: classes.dex */
public class j {
    public static l a = new l();

    public static void a(Context context) {
        InputStream openRawResource;
        try {
            File file = new File(String.valueOf(context.getCacheDir().getPath()) + "/theme/theme_clock.xml");
            if (file.exists()) {
                openRawResource = new BufferedInputStream(new FileInputStream(file));
            } else {
                openRawResource = context.getResources().openRawResource(ae.theme_clock);
            }
            SAXParser newSAXParser = SAXParserFactory.newInstance().newSAXParser();
            k kVar = new k();
            newSAXParser.parse(openRawResource, kVar);
            a = kVar.a();
            openRawResource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
