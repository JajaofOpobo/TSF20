package com.tsf.shell.theme.inside.parser;

import android.content.Context;
import android.util.Xml;
import com.tsf.shell.theme.inside.description.ThemeIconDescription;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeIconPackageParser {
    public ThemeIconDescription parser(Context context) {
        try {
            return startParse(context, new ThemeIconDescription(context), true);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ThemeIconDescription parser(Context context, ThemeIconDescription themeIconDescription, boolean z) {
        try {
            return startParse(context, themeIconDescription, z);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private ThemeIconDescription startParse(Context context, ThemeIconDescription themeIconDescription, boolean z) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser;
        try {
            xmlPullParserNewPullParser = context.getResources().getXml(context.getResources().getIdentifier("appfilter", "xml", context.getPackageName()));
        } catch (Exception e) {
            InputStream inputStreamOpen = context.getAssets().open("appfilter.xml");
            xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStreamOpen, "UTF-8");
        }
        String string = "";
        try {
            string = context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Exception e2) {
        }
        themeIconDescription.themeName = string;
        float f = 1.0f;
        while (xmlPullParserNewPullParser.getEventType() != 1) {
            if (xmlPullParserNewPullParser.getEventType() == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if (name.endsWith("item")) {
                    if (z) {
                        themeIconDescription.addIconFilterItem(xmlPullParserNewPullParser.getAttributeValue(0), xmlPullParserNewPullParser.getAttributeValue(1));
                    }
                } else if (name.endsWith("scale")) {
                    f = Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(0));
                } else if (name.endsWith("iconback")) {
                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                    for (int i = 0; i < attributeCount; i++) {
                        themeIconDescription.addIconBack(xmlPullParserNewPullParser.getAttributeValue(i));
                    }
                } else if (name.endsWith("iconupon")) {
                    int attributeCount2 = xmlPullParserNewPullParser.getAttributeCount();
                    for (int i2 = 0; i2 < attributeCount2; i2++) {
                        themeIconDescription.addIconUpon(xmlPullParserNewPullParser.getAttributeValue(i2));
                    }
                } else if (name.endsWith("iconmask")) {
                    int attributeCount3 = xmlPullParserNewPullParser.getAttributeCount();
                    for (int i3 = 0; i3 < attributeCount3; i3++) {
                        themeIconDescription.addIconMask(xmlPullParserNewPullParser.getAttributeValue(i3));
                    }
                } else if (name.endsWith("effect")) {
                    int attributeCount4 = xmlPullParserNewPullParser.getAttributeCount();
                    for (int i4 = 0; i4 < attributeCount4; i4++) {
                        String attributeName = xmlPullParserNewPullParser.getAttributeName(i4);
                        if (attributeName.equals("poly")) {
                            themeIconDescription.parsePolyParam(xmlPullParserNewPullParser.getAttributeValue(i4));
                        } else if (attributeName.equals("colorize")) {
                            themeIconDescription.parseColorizeParam(xmlPullParserNewPullParser.getAttributeValue(i4));
                        }
                    }
                }
            } else if (xmlPullParserNewPullParser.getEventType() == 3 || xmlPullParserNewPullParser.getEventType() == 4) {
            }
            xmlPullParserNewPullParser.next();
        }
        themeIconDescription.resetIconItemScale(f);
        themeIconDescription.scale = f;
        return themeIconDescription;
    }

    public static boolean parseBoolean(String str, boolean z) {
        if (str != null && !str.equals("")) {
            try {
                return Boolean.parseBoolean(str);
            } catch (Exception e) {
                return z;
            }
        }
        return z;
    }
}
