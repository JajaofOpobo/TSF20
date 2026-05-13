package com.tsf.shell.theme.inside.element;

import android.content.Context;
import android.util.Xml;
import com.censivn.C3DEngine.a;
import com.tsf.shell.theme.inside.ThemeCacheFileManager;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeClockDescription;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.parser.ThemeParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlSerializer;
/* loaded from: classes.dex */
public class ThemeElementCacher {
    public static void cacheThemeImage(Context context, int i) {
        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_ACTION)) {
            cacheImageFile(context, ThemeShellDescription.ACTION_APP_DRAWER_ICON);
            cacheImageFile(context, ThemeShellDescription.ACTION_APP_DRAWER_POINT);
        }
        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_APP_MUTIL_CHOICE)) {
            cacheImageFile(context, ThemeShellDescription.APP_MULTI_CHOICE);
            cacheImageFile(context, ThemeShellDescription.APP_MULTI_NOT_CHOICE);
        }
        if (ThemeElementType.getParserState(i, 8)) {
            cacheImageFile(context, ThemeFolderDescription.ICON);
            cacheImageFile(context, ThemeFolderDescription.BACK_PLANE);
            cacheImageFile(context, ThemeFolderDescription.FRONT_PLANE);
            cacheImageFile(context, ThemeFolderDescription.SIZE_PLANE);
            cacheImageFile(context, ThemeFolderDescription.SCROLLING_POINT);
        }
        if (ThemeElementType.getParserState(i, 4)) {
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_ICON);
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_ALARM_BTN);
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_ALARM_TOGGLE_OFF);
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_ALARM_TOGGLE_ON);
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_BACK_BIG_CIRCLE);
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_BACK_TIME_BAR);
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_BACK_NUMBER);
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_BACK_NUMBER_MINUTE);
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_BACK_SMALL_CIRCLE);
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_CLOCK_THEME_FRONT_CIRCLE_BG);
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_DIGITAL_CLOCK);
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_PROGRESS_BAR);
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_WEEK_TOGGLE_OFF);
            cacheImageFile(context, ThemeClockDescription.CLOCK_THEME_WEEK_TOGGLE_ON);
        }
        if (ThemeElementType.getParserState(i, 16)) {
            cacheImageFile(context, ThemeShellDescription.CONTACT_PORTRAIT_DEFAULT);
            cacheImageFile(context, ThemeShellDescription.CONTACT_PORTRAIT_BACK);
            cacheImageFile(context, ThemeShellDescription.CONTACT_PORTRAIT_MASK);
            cacheImageFile(context, ThemeShellDescription.CONTACT_PORTRAIT_UPON);
            cacheImageFile(context, ThemeShellDescription.CONTACT_PORTRAIT_DEFAULT_HD);
            cacheImageFile(context, ThemeShellDescription.CONTACT_PORTRAIT_BACK_HD);
            cacheImageFile(context, ThemeShellDescription.CONTACT_PORTRAIT_MASK_HD);
            cacheImageFile(context, ThemeShellDescription.CONTACT_PORTRAIT_UPON_HD);
        }
        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_ICON_MENU)) {
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_EDIT_OFF);
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_EDIT_ON);
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_OFF);
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_ON);
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_ALIGN_OFF);
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_ALIGN_ON);
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_DELETE_OFF);
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_DELETE_ON);
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_DETAIL_OFF);
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_DETAIL_ON);
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_RESET_OFF);
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_RESET_ON);
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_UNINSTALL_OFF);
            cacheImageFile(context, ThemeShellDescription.ICON_MENU_UNINSTALL_ON);
        }
        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_ARRANGE)) {
            cacheImageFile(context, ThemeShellDescription.INTERACTIVE_ARRANGE_BG);
            cacheImageFile(context, ThemeShellDescription.INTERACTIVE_ARRANGE_SCALE_BUTTON);
        }
        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_LASSO)) {
            cacheImageFile(context, ThemeShellDescription.PICKER_FOCUS);
            cacheImageFile(context, ThemeShellDescription.PICKER_MENU);
            cacheImageFile(context, ThemeShellDescription.PICKER_POINT);
        }
        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_DESKTOP)) {
            cacheImageFile(context, ThemeShellDescription.PAGE_ADD_BUTTON);
            cacheImageFile(context, ThemeShellDescription.PAGE_PREVIEW_BACKGROUND);
            cacheImageFile(context, ThemeShellDescription.PAGE_PREVIEW_DRAWER_MARK);
            cacheImageFile(context, ThemeShellDescription.PAGE_PREVIEW_HOMEPAGE_MARK);
            cacheImageFile(context, ThemeShellDescription.PAGE_PREVIEW_INDICATOR);
            cacheImageFile(context, ThemeShellDescription.PAGE_PREVIEW_SELECT);
            cacheImageFile(context, ThemeShellDescription.PAGE_PREVIEW_UNSELECT);
            cacheImageFile(context, ThemeShellDescription.PAGE_FRAME_BACKGROUND);
        }
        if (ThemeElementType.getParserState(i, 33)) {
            cacheImageFile(context, ThemeShellDescription.PUBLIC_BUTTON_CLOSE);
            cacheImageFile(context, ThemeShellDescription.PUBLIC_BUTTON_CONFIRM);
            cacheImageFile(context, ThemeShellDescription.PUBLIC_BUTTON_DELETE);
            cacheImageFile(context, ThemeShellDescription.PUBLIC_BUTTON_RETURN);
        }
        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_UNREAD_COUNT)) {
            cacheImageFile(context, ThemeShellDescription.UNREAD_COUNT_BG);
        }
        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_WALLPAPER)) {
        }
        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_WIDGET_RESIZE)) {
            cacheImageFile(context, ThemeShellDescription.WIDGET_ANDROID_RESIZE_MATCH_BOX);
            cacheImageFile(context, ThemeShellDescription.WIDGET_ANDROID_RESIZE_UNMATCH_BOX);
            cacheImageFile(context, ThemeShellDescription.WIDGET_BORDER_BOX);
            cacheImageFile(context, ThemeShellDescription.WIDGET_RESIZE_MATCH_BUTTON);
            cacheImageFile(context, ThemeShellDescription.WIDGET_RESIZE_UNMATCH_BUTTON);
            cacheImageFile(context, ThemeShellDescription.WIDGET_TSF_RESIZE_BOX);
        }
        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_SMART_BUTTON)) {
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_ADD);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_THEME);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_SCALE);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_DESKTOP_EDITOR);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_DESKTOP_EFFECT);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_DOCK);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_SIDE_MENU);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_GESTURE);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_LASSO_MODE);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_MULTI_CHOICE);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_RESTART);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_WALLPAPER);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_UNREAD);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_BACKUP);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_ADVANCED);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_ABOUT);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_DESKTOP);
            cacheImageFile(context, ThemeShellDescription.SHORTCUT_DEMO);
        }
    }

    public static boolean cacheThemeXml(Context context, int i) {
        FileOutputStream fileOutputStream;
        boolean z = false;
        if (ThemeElementType.getParserState(i, 8)) {
            cacheXmlFile(context, ThemeCacheFileManager.FILE_NAME_DESCRIPTION_FOLDER2);
            z = true;
        }
        if (ThemeElementType.getParserState(i, 4)) {
            cacheXmlFile(context, ThemeCacheFileManager.FILE_NAME_DESCRIPTION_CLOCK);
            z = true;
        }
        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_LASSO) || ThemeElementType.getParserState(i, ThemeElementType.TYPE_SMART_BUTTON) || ThemeElementType.getParserState(i, ThemeElementType.TYPE_DESKTOP_EFFECT)) {
            try {
                InputStream openRawResource = context.getResources().openRawResource(context.getResources().getIdentifier(ThemeCacheFileManager.FILE_NAME_DESCRIPTION_ELEMENT, "raw", context.getPackageName()));
                ThemeDescription themeDescription = new ThemeDescription(context);
                ThemeParser.parserElement(openRawResource, i, themeDescription);
                File fileDescriptionElement = ThemeManager.getInstance().getFileManager().getFileDescriptionElement();
                try {
                    if (!fileDescriptionElement.exists()) {
                        fileDescriptionElement.createNewFile();
                    }
                } catch (IOException e) {
                }
                try {
                    fileOutputStream = new FileOutputStream(fileDescriptionElement);
                } catch (FileNotFoundException e2) {
                    fileOutputStream = null;
                }
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(fileOutputStream, "UTF-8");
                    newSerializer.startDocument(null, true);
                    newSerializer.startTag("", "Element");
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_LASSO)) {
                        newSerializer.startTag(null, "lasso");
                        newSerializer.attribute(null, "lassoColor", themeDescription.shell.xml_lassoLineColor);
                        newSerializer.attribute(null, "lassoTargetColor", themeDescription.shell.xml_lassoTargetColor);
                        newSerializer.attribute(null, "labelBgColor", themeDescription.shell.xml_lassoLabelBgColor);
                        newSerializer.attribute(null, "labelTextColor", themeDescription.shell.xml_lassoLabelTextColor);
                        newSerializer.endTag(null, "lasso");
                    }
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_SMART_BUTTON) && themeDescription.shell.xml_smartButton_windows_color != null) {
                        newSerializer.startTag(null, "smartButton");
                        newSerializer.attribute(null, "windowColor", themeDescription.shell.xml_smartButton_windows_color);
                        newSerializer.endTag(null, "smartButton");
                    }
                    if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_DESKTOP_EFFECT) && themeDescription.shell.xml_desktop_effect_hue != null && themeDescription.shell.xml_desktop_effect_saturation != null && themeDescription.shell.xml_desktop_effect_select_color != null) {
                        newSerializer.startTag(null, "desktopEffect");
                        newSerializer.attribute(null, "hue", themeDescription.shell.xml_desktop_effect_hue);
                        newSerializer.attribute(null, "saturation", themeDescription.shell.xml_desktop_effect_saturation);
                        newSerializer.attribute(null, "selectColor", themeDescription.shell.xml_desktop_effect_select_color);
                        newSerializer.endTag(null, "desktopEffect");
                    }
                    newSerializer.endTag("", "Element");
                    newSerializer.endDocument();
                    newSerializer.flush();
                    fileOutputStream.close();
                    return true;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return true;
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                return true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Exception] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void cacheImageFile(android.content.Context r5, java.lang.String r6) {
        /*
            if (r6 == 0) goto L6
            java.lang.String r0 = ""
            if (r6 != r0) goto L7
        L6:
            return
        L7:
            r0 = 0
            android.content.res.Resources r1 = r5.getResources()
            java.lang.String r2 = "drawable"
            java.lang.String r3 = r5.getPackageName()
            int r1 = r1.getIdentifier(r6, r2, r3)
            if (r1 == 0) goto L32
            android.content.res.Resources r2 = r5.getResources()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L49
            java.io.InputStream r0 = r2.openRawResource(r1)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L49
            com.tsf.shell.theme.inside.ThemeManager r1 = com.tsf.shell.theme.inside.ThemeManager.getInstance()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L55
            r1.getFileManager()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L55
            com.tsf.shell.theme.inside.ThemeCacheFileManager.cacheImageFile(r0, r6)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L55
            if (r0 == 0) goto L6
            r0.close()     // Catch: java.lang.Exception -> L30
            goto L6
        L30:
            r0 = move-exception
            goto L6
        L32:
            cacheImageFromSystemTheme(r5, r6)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L49
            if (r0 == 0) goto L6
            r0.close()     // Catch: java.lang.Exception -> L3b
            goto L6
        L3b:
            r0 = move-exception
            goto L6
        L3d:
            r1 = move-exception
            cacheImageFromSystemTheme(r5, r6)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L6
            r0.close()     // Catch: java.lang.Exception -> L47
            goto L6
        L47:
            r0 = move-exception
            goto L6
        L49:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L4d:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.lang.Exception -> L53
        L52:
            throw r0
        L53:
            r1 = move-exception
            goto L52
        L55:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.theme.inside.element.ThemeElementCacher.cacheImageFile(android.content.Context, java.lang.String):void");
    }

    public static void cacheImageFromSystemTheme(Context context, String str) {
        if (!context.getPackageName().equals(a.b())) {
            cacheImageFile(a.d(), str);
        }
    }

    public static void cacheXmlFile(Context context, String str) {
        InputStream inputStream;
        Throwable th;
        if (str != null && str != "") {
            InputStream inputStream2 = null;
            int identifier = context.getResources().getIdentifier(str, "raw", context.getPackageName());
            try {
                try {
                    try {
                        if (identifier != 0) {
                            inputStream2 = context.getResources().openRawResource(identifier);
                            ThemeManager.getInstance().getFileManager();
                            ThemeCacheFileManager.cacheXmlFile(inputStream2, str);
                        } else {
                            cacheXmlFile(a.d(), str);
                        }
                        try {
                            inputStream2.close();
                        } catch (Exception e) {
                        }
                    } catch (Throwable th2) {
                        inputStream = inputStream2;
                        th = th2;
                        try {
                            inputStream.close();
                        } catch (Exception e2) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    inputStream = inputStream2;
                    th = th3;
                    inputStream.close();
                    throw th;
                }
            } catch (Exception e3) {
                cacheXmlFile(a.d(), str);
                try {
                    inputStream2.close();
                } catch (Exception e4) {
                }
            }
        }
    }
}
