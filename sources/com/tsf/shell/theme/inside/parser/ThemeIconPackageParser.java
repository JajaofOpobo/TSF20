package com.tsf.shell.theme.inside.parser;

import android.content.Context;
import android.util.Xml;
import com.tsf.shell.theme.inside.description.ThemeIconDescription;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
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

    private ThemeIconDescription startParse(Context context, ThemeIconDescription themeIconDescription, boolean z) {
        XmlPullParser newPullParser;
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
                    if (z) {
                        themeIconDescription.addIconFilterItem(newPullParser.getAttributeValue(0), newPullParser.getAttributeValue(1));
                    }
                } else if (name.endsWith("scale")) {
                    f = Float.parseFloat(newPullParser.getAttributeValue(0));
                } else if (name.endsWith("iconback")) {
                    int attributeCount = newPullParser.getAttributeCount();
                    for (int i = 0; i < attributeCount; i++) {
                        themeIconDescription.addIconBack(newPullParser.getAttributeValue(i));
                    }
                } else if (name.endsWith("iconupon")) {
                    int attributeCount2 = newPullParser.getAttributeCount();
                    for (int i2 = 0; i2 < attributeCount2; i2++) {
                        themeIconDescription.addIconUpon(newPullParser.getAttributeValue(i2));
                    }
                } else if (name.endsWith("iconmask")) {
                    int attributeCount3 = newPullParser.getAttributeCount();
                    for (int i3 = 0; i3 < attributeCount3; i3++) {
                        themeIconDescription.addIconMask(newPullParser.getAttributeValue(i3));
                    }
                } else if (name.endsWith("effect")) {
                    int attributeCount4 = newPullParser.getAttributeCount();
                    for (int i4 = 0; i4 < attributeCount4; i4++) {
                        String attributeName = newPullParser.getAttributeName(i4);
                        if (attributeName.equals("poly")) {
                            themeIconDescription.parsePolyParam(newPullParser.getAttributeValue(i4));
                        } else if (attributeName.equals("colorize")) {
                            themeIconDescription.parseColorizeParam(newPullParser.getAttributeValue(i4));
                        }
                    }
                }
            } else if (newPullParser.getEventType() != 3 && newPullParser.getEventType() != 4) {
            }
            newPullParser.next();
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
