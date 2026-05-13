package com.tsf.shell.theme.inside.parser;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import com.censivn.C3DEngine.a;
import com.tsf.shell.f.h.b;
import com.tsf.shell.theme.inside.ThemeCacheFileManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import com.tsf.shell.utils.j;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.helpers.DefaultHandler;
/* loaded from: classes.dex */
public class ThemeParser extends DefaultHandler {
    private Context mContext;
    private String name = "";
    private ThemeDescription resultThemeDescription;

    /* loaded from: classes.dex */
    public static class ThemeInfo {
        public String name;
        public String packagename;
        public int versionCode;
        public String versionName;
    }

    /* loaded from: classes.dex */
    public static class InputStreamCallback {
        private Context mContext;

        public InputStreamCallback(Context context) {
            this.mContext = context;
        }

        public InputStreamCallback(String str) {
            try {
                this.mContext = a.d().createPackageContext(str, 3);
            } catch (PackageManager.NameNotFoundException e) {
            }
        }

        public InputStream getElementStream() {
            return this.mContext.getResources().openRawResource(this.mContext.getResources().getIdentifier(ThemeCacheFileManager.FILE_NAME_DESCRIPTION_ELEMENT, "raw", this.mContext.getPackageName()));
        }

        public InputStream getFolderStream() {
            return this.mContext.getResources().openRawResource(this.mContext.getResources().getIdentifier(ThemeCacheFileManager.FILE_NAME_DESCRIPTION_FOLDER2, "raw", this.mContext.getPackageName()));
        }

        public Context getContext() {
            return this.mContext;
        }
    }

    public static ThemeInfo getThemeInfo(Context context) {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        ThemeInfo themeInfo = new ThemeInfo();
        try {
            themeInfo.name = context.getResources().getString(packageInfo.applicationInfo.labelRes);
        } catch (Exception e) {
        }
        themeInfo.versionName = packageInfo.versionName;
        themeInfo.versionCode = packageInfo.versionCode;
        themeInfo.packagename = context.getPackageName();
        return themeInfo;
    }

    public void parser(InputStreamCallback inputStreamCallback, int i) {
        InputStream inputStream = null;
        this.mContext = inputStreamCallback.getContext();
        ThemeDescription themeDescription = new ThemeDescription(this.mContext);
        ThemeInfo themeInfo = getThemeInfo(this.mContext);
        themeDescription.versionName = themeInfo.versionName;
        themeDescription.versionCode = themeInfo.versionCode;
        themeDescription.packagename = themeInfo.packagename;
        String str = themeInfo.name;
        this.name = str;
        themeDescription.themeName = str;
        themeDescription.parserElement(i);
        try {
            inputStream = inputStreamCallback.getElementStream();
            parserElement(inputStream, i, themeDescription);
            try {
                inputStream = inputStreamCallback.getFolderStream();
                parserFolder(inputStream, i, themeDescription);
                this.resultThemeDescription = themeDescription;
            } catch (Exception e) {
                e.printStackTrace();
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public void parser(Context context, int i) {
        parser(new InputStreamCallback(context), i);
    }

    public void parser(String str, int i) {
        parser(new InputStreamCallback(str), i);
    }

    public static void parserElement(InputStream inputStream, int i, ThemeDescription themeDescription) {
        NodeList childNodes = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getDocumentElement().getChildNodes();
        if (ThemeElementType.getParserState(i, 1)) {
            int length = childNodes.getLength();
            themeDescription.shell = new ThemeShellDescription(themeDescription);
            for (int i2 = 0; i2 < length; i2++) {
                Node item = childNodes.item(i2);
                if (item.getNodeType() == 1) {
                    Element element = (Element) item;
                    String nodeName = element.getNodeName();
                    if (nodeName.equals("lasso")) {
                        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_LASSO)) {
                            themeDescription.shell.xml_lassoLabelBgColor = element.getAttribute("labelBgColor");
                            themeDescription.shell.xml_lassoLabelTextColor = element.getAttribute("labelTextColor");
                            themeDescription.shell.xml_lassoLineColor = element.getAttribute("lassoColor");
                            themeDescription.shell.xml_lassoTargetColor = element.getAttribute("lassoTargetColor");
                            themeDescription.shell.lassoLineColor = parseColor(themeDescription.shell.xml_lassoLineColor, -65536);
                            themeDescription.shell.lassoSelectColor = parseColor(themeDescription.shell.xml_lassoTargetColor, -34816);
                            themeDescription.shell.lassoLabelBgColor = parseColor(themeDescription.shell.xml_lassoLabelBgColor, -1156509423);
                            themeDescription.shell.lassoLabelTextColor = parseColor(themeDescription.shell.xml_lassoLabelTextColor, -4473925);
                        }
                    } else if (nodeName.equals("smartButton")) {
                        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_SMART_BUTTON)) {
                            themeDescription.shell.xml_smartButton_windows_color = element.getAttribute("windowColor");
                            themeDescription.shell.smartButtonWindowsColor = parseColor(themeDescription.shell.xml_smartButton_windows_color, b.b);
                        }
                    } else if (nodeName.equals("desktopEffect") && ThemeElementType.getParserState(i, ThemeElementType.TYPE_DESKTOP_EFFECT)) {
                        themeDescription.shell.xml_desktop_effect_hue = element.getAttribute("hue");
                        themeDescription.shell.xml_desktop_effect_saturation = element.getAttribute("saturation");
                        themeDescription.shell.xml_desktop_effect_select_color = element.getAttribute("selectColor");
                        themeDescription.shell.desktopEffectHue = parseInteger(themeDescription.shell.xml_desktop_effect_hue, 0);
                        themeDescription.shell.desktopEffectSaturation = parseInteger(themeDescription.shell.xml_desktop_effect_saturation, 0);
                        themeDescription.shell.desktopEffectSelectColor = parseColor(themeDescription.shell.xml_desktop_effect_select_color, -1);
                    }
                }
            }
        }
        inputStream.close();
    }

    private void parserFolder(InputStream inputStream, int i, ThemeDescription themeDescription) {
        NodeList childNodes = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getDocumentElement().getChildNodes();
        if (ThemeElementType.getParserState(i, 8)) {
            ThemeFolderDescription themeFolderDescription = new ThemeFolderDescription(themeDescription);
            int length = childNodes.getLength();
            for (int i2 = 0; i2 < length; i2++) {
                Node item = childNodes.item(i2);
                if (item.getNodeType() == 1) {
                    Element element = (Element) item;
                    String nodeName = element.getNodeName();
                    if (nodeName.equals("order")) {
                        parseFolderOrder(themeFolderDescription, element);
                    } else if (nodeName.equals("child")) {
                        parseFolderChild(themeFolderDescription, element);
                    }
                }
            }
            themeDescription.folder = themeFolderDescription;
        }
    }

    private void parseFolderOrder(ThemeFolderDescription themeFolderDescription, Element element) {
        NodeList childNodes = element.getChildNodes();
        float f = com.tsf.shell.manager.o.b.a.A;
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                String nodeName = element2.getNodeName();
                if (nodeName.equals("textPlane")) {
                    themeFolderDescription.textPlaneX = parseDimension(element2.getAttribute("x"), f);
                    themeFolderDescription.textPlaneY = parseDimension(element2.getAttribute("y"), f);
                    ThemeFolderDescription.TextFormat textFormat = themeFolderDescription.nameTextFormat;
                    int parseDimension = parseDimension(element2.getAttribute("width"), f);
                    textFormat.width = parseDimension;
                    themeFolderDescription.textWidth = parseDimension;
                    themeFolderDescription.textPlaneWidth = parseDimension;
                    ThemeFolderDescription.TextFormat textFormat2 = themeFolderDescription.nameTextFormat;
                    int parseDimension2 = parseDimension(element2.getAttribute("height"), f);
                    textFormat2.height = parseDimension2;
                    themeFolderDescription.textHeight = parseDimension2;
                    themeFolderDescription.textPlaneHeight = parseDimension2;
                    themeFolderDescription.nameTextFormat.color = parseColor(element2.getAttribute("textColor"), -1);
                    themeFolderDescription.nameTextFormat.size = parseDimension(element2.getAttribute("textSize"), f);
                    themeFolderDescription.nameTextFormat.auto = false;
                    themeFolderDescription.order.add(0);
                } else if (nodeName.equals("sizePlane")) {
                    themeFolderDescription.sizePlaneX = parseDimension(element2.getAttribute("x"), f);
                    themeFolderDescription.sizePlaneY = parseDimension(element2.getAttribute("y"), f);
                    ThemeFolderDescription.TextFormat textFormat3 = themeFolderDescription.sizeTextFormat;
                    int parseDimension3 = parseDimension(element2.getAttribute("width"), f);
                    textFormat3.width = parseDimension3;
                    themeFolderDescription.sizeTextWidth = parseDimension3;
                    themeFolderDescription.sizePlaneWidth = parseDimension3;
                    ThemeFolderDescription.TextFormat textFormat4 = themeFolderDescription.sizeTextFormat;
                    int parseDimension4 = parseDimension(element2.getAttribute("height"), f);
                    textFormat4.height = parseDimension4;
                    themeFolderDescription.sizeTextHeight = parseDimension4;
                    themeFolderDescription.sizePlaneHeight = parseDimension4;
                    themeFolderDescription.sizeTextFormat.color = parseColor(element2.getAttribute("textColor"), -1);
                    themeFolderDescription.sizeTextFormat.size = parseDimension(element2.getAttribute("textSize"), f);
                    themeFolderDescription.sizePlaneEnable = true;
                    themeFolderDescription.order.add(4);
                } else if (nodeName.equals("frontPlane")) {
                    themeFolderDescription.frontPlaneX = parseDimension(element2.getAttribute("x"), f);
                    themeFolderDescription.frontPlaneY = parseDimension(element2.getAttribute("y"), f);
                    themeFolderDescription.frontPlaneWidth = parseDimension(element2.getAttribute("width"), f);
                    themeFolderDescription.frontPlaneHeight = parseDimension(element2.getAttribute("height"), f);
                    themeFolderDescription.frontPlaneEnable = true;
                    themeFolderDescription.order.add(1);
                } else if (nodeName.equals("backPlane")) {
                    themeFolderDescription.backPlaneX = parseDimension(element2.getAttribute("x"), f);
                    themeFolderDescription.backPlaneY = parseDimension(element2.getAttribute("y"), f);
                    themeFolderDescription.backPlaneWidth = parseDimension(element2.getAttribute("width"), f);
                    themeFolderDescription.backPlaneHeight = parseDimension(element2.getAttribute("height"), f);
                    themeFolderDescription.backPlaneEnable = true;
                    themeFolderDescription.order.add(2);
                } else if (nodeName.equals("childContainer")) {
                    themeFolderDescription.childContainerX = parseDimension(element2.getAttribute("x"), f);
                    themeFolderDescription.childContainerY = parseDimension(element2.getAttribute("y"), f);
                    themeFolderDescription.order.add(3);
                } else {
                    element.removeChild(element2);
                }
            }
        }
        if (themeFolderDescription.nameTextFormat.auto) {
            themeFolderDescription.textPlaneEnable = false;
            themeFolderDescription.textPlaneX = 0;
            themeFolderDescription.textPlaneY = com.tsf.shell.manager.o.b.a.aa;
            themeFolderDescription.textPlaneWidth = com.tsf.shell.manager.o.b.a.J + 2;
            themeFolderDescription.textPlaneHeight = com.tsf.shell.manager.o.b.a.K + 2;
            themeFolderDescription.textWidth = com.tsf.shell.manager.o.b.a.J + 2;
            themeFolderDescription.textHeight = com.tsf.shell.manager.o.b.a.K + 2;
            themeFolderDescription.order.add(1, 0);
        } else {
            themeFolderDescription.textPlaneEnable = true;
        }
        themeFolderDescription.sampleCount = themeFolderDescription.sampleList.size();
    }

    private int getFixValue(int i) {
        return (i % 2) + i;
    }

    private void parseFolderChild(ThemeFolderDescription themeFolderDescription, Element element) {
        float f = com.tsf.shell.manager.o.b.a.A;
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                themeFolderDescription.addChildInformation(parseDimension(element2.getAttribute("x"), f), parseDimension(element2.getAttribute("y"), f), parseDimension(element2.getAttribute("z"), f), Float.parseFloat(element2.getAttribute("rx")), Float.parseFloat(element2.getAttribute("ry")), Float.parseFloat(element2.getAttribute("rz")), Float.parseFloat(element2.getAttribute("sx")), Float.parseFloat(element2.getAttribute("sy")), Float.parseFloat(element2.getAttribute("sz")));
            }
        }
        themeFolderDescription.sampleCount = themeFolderDescription.sampleList.size();
    }

    public ThemeDescription getThemeDescription() {
        return this.resultThemeDescription;
    }

    public static String parseColor(int i) {
        return "0xFFFFFFFF";
    }

    public static int parseColor(String str, int i) {
        if (str != null && !str.equals("")) {
            try {
                return Color.parseColor(str);
            } catch (Exception e) {
                return i;
            }
        }
        return i;
    }

    public static float parseFloat(String str, float f) {
        if (str != null && !str.equals("") && !str.equals("none")) {
            try {
                return Float.parseFloat(str);
            } catch (Exception e) {
                return f;
            }
        }
        return f;
    }

    public static int parseDimension(String str) {
        return j.a(str);
    }

    public static int parseDimension(String str, float f) {
        return (int) (j.a(str) * f * com.censivn.C3DEngine.b.b.a.f);
    }

    public static int parseInteger(String str, int i) {
        if (str != null && !str.equals("") && !str.equals("none")) {
            try {
                return Integer.parseInt(str);
            } catch (Exception e) {
                return i;
            }
        }
        return i;
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
