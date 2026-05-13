package com.tsf.shell.theme.inside.element;

import android.content.Context;
import android.util.Log;
import com.tsf.shell.theme.inside.ThemeCacheFileManager;
import com.tsf.shell.theme.inside.description.ThemeClockDescription;
import com.tsf.shell.theme.inside.description.ThemeFolderDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ThemeElementChecker {
    private static ArrayList<C4120a> checkPool = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.theme.inside.element.ThemeElementChecker$a */
    /* loaded from: classes.dex */
    public static class C4120a {

        /* renamed from: a */
        public String f13403a;

        /* renamed from: b */
        public String f13404b;

        /* renamed from: c */
        public boolean f13405c;

        private C4120a() {
        }

        /* renamed from: a */
        public void m737a(String str, String str2, boolean z) {
            this.f13403a = str2;
            this.f13404b = str;
            this.f13405c = z;
        }
    }

    public static void paintThemeElement(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean isElementAbailable = isElementAbailable(context, ThemeElementType.TYPE_ACTION);
        boolean isElementAbailable2 = isElementAbailable(context, ThemeElementType.TYPE_APP_MUTIL_CHOICE);
        boolean isElementAbailable3 = isElementAbailable(context, 8);
        boolean isElementAbailable4 = isElementAbailable(context, 16);
        boolean isElementAbailable5 = isElementAbailable(context, 4);
        boolean isElementAbailable6 = isElementAbailable(context, ThemeElementType.TYPE_ICON_MENU);
        boolean isElementAbailable7 = isElementAbailable(context, ThemeElementType.TYPE_ARRANGE);
        boolean isElementAbailable8 = isElementAbailable(context, ThemeElementType.TYPE_LASSO);
        boolean isElementAbailable9 = isElementAbailable(context, ThemeElementType.TYPE_DESKTOP);
        boolean isElementAbailable10 = isElementAbailable(context, 33);
        boolean isElementAbailable11 = isElementAbailable(context, ThemeElementType.TYPE_UNREAD_COUNT);
        boolean isElementAbailable12 = isElementAbailable(context, ThemeElementType.TYPE_WIDGET_RESIZE);
        boolean isElementAbailable13 = isElementAbailable(context, ThemeElementType.TYPE_SMART_BUTTON);
        Log.w("TSF Shell", "element state check time:" + (System.currentTimeMillis() - currentTimeMillis));
        Log.w("TSF Shell", "element state action:" + isElementAbailable);
        Log.w("TSF Shell", "element state mutil_choice:" + isElementAbailable2);
        Log.w("TSF Shell", "element state folder:" + isElementAbailable3);
        Log.w("TSF Shell", "element state contact:" + isElementAbailable4);
        Log.w("TSF Shell", "element state clock:" + isElementAbailable5);
        Log.w("TSF Shell", "element state icon_menu:" + isElementAbailable6);
        Log.w("TSF Shell", "element state arrangement:" + isElementAbailable7);
        Log.w("TSF Shell", "element state line_picker:" + isElementAbailable8);
        Log.w("TSF Shell", "element state desktop:" + isElementAbailable9);
        Log.w("TSF Shell", "element state other:" + isElementAbailable10);
        Log.w("TSF Shell", "element state unread_count:" + isElementAbailable11);
        Log.w("TSF Shell", "element state widget_resize:" + isElementAbailable12);
        Log.w("TSF Shell", "element state smart_button:" + isElementAbailable13);
    }

    public static boolean isElementAbailable(Context context, int i) {
        ArrayList arrayList = new ArrayList();
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
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C4120a c4120a = (C4120a) it.next();
            int identifier = context.getResources().getIdentifier(c4120a.f13403a, c4120a.f13404b, context.getPackageName());
            if (identifier == 0 && !c4120a.f13405c) {
                return false;
            }
            z = identifier > 0 ? true : z;
        }
        return z;
    }

    private static C4120a applyDrawableCheckElement(String str, boolean z) {
        return applyCheckElement("drawable", str, z);
    }

    public static C4120a applyXmlCheckElement(String str, boolean z) {
        return applyCheckElement("raw", str, z);
    }

    private static C4120a applyCheckElement(String str, String str2, boolean z) {
        C4120a remove;
        if (checkPool.isEmpty()) {
            remove = new C4120a();
        } else {
            remove = checkPool.remove(0);
        }
        remove.m737a(str, str2, z);
        return remove;
    }

    private static void releaseCheckElement(C4120a c4120a) {
        checkPool.add(c4120a);
    }
}
