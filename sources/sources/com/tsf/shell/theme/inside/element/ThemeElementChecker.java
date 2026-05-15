package com.tsf.shell.theme.inside.element;

import android.content.Context;
import android.util.Log;
import com.tsf.shell.theme.inside.ThemeCacheFileManager;
import com.tsf.shell.theme.inside.description.ThemeClockDescription;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeElementChecker {
    private static ArrayList<a> checkPool = new ArrayList<>();

    private static class a {
        public String a;
        public String b;
        public boolean c;

        private a() {
        }

        public void a(String str, String str2, boolean z) {
            this.a = str2;
            this.b = str;
            this.c = z;
        }
    }

    public static void paintThemeElement(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zIsElementAbailable = isElementAbailable(context, ThemeElementType.TYPE_ACTION);
        boolean zIsElementAbailable2 = isElementAbailable(context, ThemeElementType.TYPE_APP_MUTIL_CHOICE);
        boolean zIsElementAbailable3 = isElementAbailable(context, 8);
        boolean zIsElementAbailable4 = isElementAbailable(context, 16);
        boolean zIsElementAbailable5 = isElementAbailable(context, 4);
        boolean zIsElementAbailable6 = isElementAbailable(context, ThemeElementType.TYPE_ICON_MENU);
        boolean zIsElementAbailable7 = isElementAbailable(context, ThemeElementType.TYPE_ARRANGE);
        boolean zIsElementAbailable8 = isElementAbailable(context, ThemeElementType.TYPE_LASSO);
        boolean zIsElementAbailable9 = isElementAbailable(context, ThemeElementType.TYPE_DESKTOP);
        boolean zIsElementAbailable10 = isElementAbailable(context, 33);
        boolean zIsElementAbailable11 = isElementAbailable(context, ThemeElementType.TYPE_UNREAD_COUNT);
        boolean zIsElementAbailable12 = isElementAbailable(context, ThemeElementType.TYPE_WIDGET_RESIZE);
        boolean zIsElementAbailable13 = isElementAbailable(context, ThemeElementType.TYPE_SMART_BUTTON);
        Log.w("TSF Shell", "element state check time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        Log.w("TSF Shell", "element state action:" + zIsElementAbailable);
        Log.w("TSF Shell", "element state mutil_choice:" + zIsElementAbailable2);
        Log.w("TSF Shell", "element state folder:" + zIsElementAbailable3);
        Log.w("TSF Shell", "element state contact:" + zIsElementAbailable4);
        Log.w("TSF Shell", "element state clock:" + zIsElementAbailable5);
        Log.w("TSF Shell", "element state icon_menu:" + zIsElementAbailable6);
        Log.w("TSF Shell", "element state arrangement:" + zIsElementAbailable7);
        Log.w("TSF Shell", "element state line_picker:" + zIsElementAbailable8);
        Log.w("TSF Shell", "element state desktop:" + zIsElementAbailable9);
        Log.w("TSF Shell", "element state other:" + zIsElementAbailable10);
        Log.w("TSF Shell", "element state unread_count:" + zIsElementAbailable11);
        Log.w("TSF Shell", "element state widget_resize:" + zIsElementAbailable12);
        Log.w("TSF Shell", "element state smart_button:" + zIsElementAbailable13);
    }

    public static boolean isElementAbailable(Context context, int i) {
        ArrayList<a> arrayList = new ArrayList();
        if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_ACTION)) {
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ACTION_APP_DRAWER_ICON, false));
        } else if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_APP_MUTIL_CHOICE)) {
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.APP_MULTI_CHOICE, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.APP_MULTI_NOT_CHOICE, false));
        } else if (ThemeElementType.getParserState(i, 8)) {
            arrayList.add(applyDrawableCheckElement(ThemeFolderDescription.ICON, false));
            arrayList.add(applyXmlCheckElement(ThemeCacheFileManager.FILE_NAME_DESCRIPTION_FOLDER2, false));
        } else if (ThemeElementType.getParserState(i, 4)) {
            arrayList.add(applyDrawableCheckElement(ThemeClockDescription.CLOCK_THEME_ICON, false));
            arrayList.add(applyXmlCheckElement(ThemeCacheFileManager.FILE_NAME_DESCRIPTION_CLOCK, false));
        } else if (ThemeElementType.getParserState(i, 16)) {
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.CONTACT_PORTRAIT_DEFAULT, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.CONTACT_PORTRAIT_BACK, true));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.CONTACT_PORTRAIT_UPON, true));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.CONTACT_PORTRAIT_MASK, true));
        } else if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_ICON_MENU)) {
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_OFF, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_MUTIL_CHOICE_ON, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_RESET_OFF, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_RESET_ON, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_ALIGN_OFF, true));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_ALIGN_ON, true));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_DELETE_OFF, true));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_DELETE_ON, true));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_DETAIL_OFF, true));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_DETAIL_ON, true));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_EDIT_OFF, true));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_EDIT_ON, true));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_UNINSTALL_OFF, true));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.ICON_MENU_UNINSTALL_ON, true));
        } else if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_ARRANGE)) {
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.INTERACTIVE_ARRANGE_BG, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.INTERACTIVE_ARRANGE_SCALE_BUTTON, false));
        } else if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_LASSO)) {
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.PICKER_MENU, false));
        } else if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_DESKTOP_EFFECT)) {
            arrayList.add(applyXmlCheckElement(ThemeCacheFileManager.FILE_NAME_DESCRIPTION_ELEMENT, false));
        } else if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_DESKTOP)) {
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.PAGE_PREVIEW_SELECT, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.PAGE_PREVIEW_UNSELECT, false));
        } else if (ThemeElementType.getParserState(i, 33)) {
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.PUBLIC_BUTTON_CLOSE, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.PUBLIC_BUTTON_CONFIRM, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.PUBLIC_BUTTON_DELETE, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.PUBLIC_BUTTON_RETURN, true));
        } else if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_UNREAD_COUNT)) {
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.UNREAD_COUNT_BG, false));
        } else if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_WIDGET_RESIZE)) {
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.WIDGET_ANDROID_RESIZE_MATCH_BOX, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.WIDGET_ANDROID_RESIZE_UNMATCH_BOX, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.WIDGET_BORDER_BOX, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.WIDGET_RESIZE_MATCH_BUTTON, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.WIDGET_RESIZE_UNMATCH_BUTTON, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.WIDGET_TSF_RESIZE_BOX, false));
        } else if (ThemeElementType.getParserState(i, ThemeElementType.TYPE_SMART_BUTTON)) {
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.SHORTCUT_ADD, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.SHORTCUT_LASSO_MODE, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.SHORTCUT_MULTI_CHOICE, false));
            arrayList.add(applyDrawableCheckElement(ThemeShellDescription.SHORTCUT_DESKTOP_EDITOR, false));
        }
        boolean z = false;
        for (a aVar : arrayList) {
            int identifier = context.getResources().getIdentifier(aVar.a, aVar.b, context.getPackageName());
            if (identifier == 0 && !aVar.c) {
                return false;
            }
            z = identifier > 0 ? true : z;
        }
        return z;
    }

    private static a applyDrawableCheckElement(String str, boolean z) {
        return applyCheckElement("drawable", str, z);
    }

    public static a applyXmlCheckElement(String str, boolean z) {
        return applyCheckElement("raw", str, z);
    }

    private static a applyCheckElement(String str, String str2, boolean z) {
        a aVarRemove;
        if (checkPool.isEmpty()) {
            aVarRemove = new a();
        } else {
            aVarRemove = checkPool.remove(0);
        }
        aVarRemove.a(str, str2, z);
        return aVarRemove;
    }

    private static void releaseCheckElement(a aVar) {
        checkPool.add(aVar);
    }
}
