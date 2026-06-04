package com.tsf.shell.theme.inside;

import android.content.Context;
import android.util.Xml;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class ThemeIconPackageParser {
    public ThemeIconDescription parser(Context context) {
        try {
            return startParse(context);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private ThemeIconDescription startParse(Context context) {
        XmlPullParser newPullParser;
        ThemeIconDescription themeIconDescription = new ThemeIconDescription(context);
        themeIconDescription.isSecondParserMode = true;
        try {
            newPullParser = context.getResources().getXml(context.getResources().getIdentifier("appfilter", "xml", context.getPackageName()));
        } catch (Exception e) {
            InputStream open = context.getAssets().open("appfilter.xml");
            newPullParser = Xml.newPullParser();
            newPullParser.setInput(open, "UTF-8");
        }
        String str = "";
        try {
            str = context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Exception e2) {
        }
        themeIconDescription.themeName = str;
        float f = 1.0f;
        while (newPullParser.getEventType() != 1) {
            if (newPullParser.getEventType() == 2) {
                String name = newPullParser.getName();
                if (name.endsWith("item")) {
                    themeIconDescription.addIconFilterItem(newPullParser.getAttributeValue(0), newPullParser.getAttributeValue(1));
                } else if (name.endsWith("scale")) {
                    f = Float.parseFloat(newPullParser.getAttributeValue(0));
                } else if (name.endsWith("iconback")) {
                    int attributeCount = newPullParser.getAttributeCount();
                    for (int i = 0; i < attributeCount; i++) {
                        themeIconDescription.addDefaultIconBack(newPullParser.getAttributeValue(i), 1.0f);
                    }
                } else if (name.endsWith("iconupon")) {
                    int attributeCount2 = newPullParser.getAttributeCount();
                    for (int i2 = 0; i2 < attributeCount2; i2++) {
                        themeIconDescription.addDefaultIconUponItem(newPullParser.getAttributeValue(i2));
                    }
                }
            } else if (newPullParser.getEventType() != 3) {
                newPullParser.getEventType();
            }
            newPullParser.next();
            themeIconDescription.resetIconItemScale(f);
            themeIconDescription.globalScale = f;
            themeIconDescription.scale = f;
        }
        return themeIconDescription;
    }
}
