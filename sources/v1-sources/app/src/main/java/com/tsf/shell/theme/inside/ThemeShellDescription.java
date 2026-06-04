package com.tsf.shell.theme.inside;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ThemeShellDescription {
    public static final int APP_ADDER_BG = 1600;
    public static final int APP_MULTI_CHOICE = 600;
    public static final int APP_MULTI_NOT_CHOICE = 601;
    public static final int APP_PAGE_DEL_BUTTON = 404;
    public static final int APP_PAGE_EDIT_ICON = 408;
    public static final int APP_PAGE_EDIT_MODE_OFF = 403;
    public static final int APP_PAGE_EDIT_MODE_ON = 402;
    public static final int APP_PAGE_EFFECT_BUTTON = 400;
    public static final int APP_PAGE_EFFECT_NV_POINT = 401;
    public static final int APP_PAGE_HIDE_LOGO = 405;
    public static final int APP_PAGE_SORT_ICON = 409;
    public static final int APP_PAGE_TRANSITION3D_ICON = 407;
    public static final int APP_PAGE_TRANSITION_ICON = 406;
    public static final int ICON_MENU_ALIGN_OFF = 1202;
    public static final int ICON_MENU_ALIGN_ON = 1201;
    public static final int ICON_MENU_DELETE_OFF = 1204;
    public static final int ICON_MENU_DELETE_ON = 1203;
    public static final int ICON_MENU_DETAIL_OFF = 1206;
    public static final int ICON_MENU_DETAIL_ON = 1205;
    public static final int ICON_MENU_ICON_OFF = 1208;
    public static final int ICON_MENU_ICON_ON = 1207;
    public static final int ICON_MENU_MORE_OFF = 1218;
    public static final int ICON_MENU_MORE_ON = 1217;
    public static final int ICON_MENU_MUTIL_CHOICE_OFF = 1210;
    public static final int ICON_MENU_MUTIL_CHOICE_ON = 1209;
    public static final int ICON_MENU_RENAME_OFF = 1212;
    public static final int ICON_MENU_RENAME_ON = 1211;
    public static final int ICON_MENU_RESET_OFF = 1214;
    public static final int ICON_MENU_RESET_ON = 1213;
    public static final int ICON_MENU_SHADOW_BG = 1200;
    public static final int ICON_MENU_UNINSTALL_OFF = 1216;
    public static final int ICON_MENU_UNINSTALL_ON = 1215;
    public static final int INTERACTIVE_ARRANGE_BG = 700;
    public static final int INTERACTIVE_ARRANGE_SCALE_BUTTON = 701;
    public static final int MENU_BG = 300;
    public static final int MENU_SETTING_BUTTON = 203;
    public static final int MENU_THEME_BUTTON = 200;
    public static final int MENU_TOOL_BUTTON = 201;
    public static final int MENU_USER_BUTTON = 202;
    public static final int PAGE_ADD_BUTTON = 511;
    public static final int PAGE_PREVIEW_BACKGROUND = 507;
    public static final int PAGE_PREVIEW_DRAWER_MARK = 505;
    public static final int PAGE_PREVIEW_EDIT_BUTTON = 502;
    public static final int PAGE_PREVIEW_EDIT_EXIT_BUTTON = 503;
    public static final int PAGE_PREVIEW_HOMEPAGE_MARK = 504;
    public static final int PAGE_PREVIEW_SELECT = 500;
    public static final int PAGE_PREVIEW_UNSELECT = 501;
    public static final int PAGE_SELECTING_360_MODE_OFF_BUTTON = 509;
    public static final int PAGE_SELECTING_360_MODE_ON_BUTTON = 510;
    public static final int PAGE_SELECT_COUNT_DOWN = 506;
    public static final int PICKER_FOCUS = 902;
    public static final int PICKER_LINE = 900;
    public static final int PICKER_MENU = 1000;
    public static final int PICKER_MENU_NOTIC = 1001;
    public static final int PICKER_NOTIC = 903;
    public static final int PICKER_POINT = 901;
    public static final int PUBLIC_BUTTON_CLOSE = 800;
    public static final int PUBLIC_BUTTON_CONFIRM = 802;
    public static final int PUBLIC_BUTTON_RETURN = 801;
    public static final int UNREAD_COUNT_BG = 1500;
    public static final int WIDGET_ANDROID_RESIZE_MATCH_BOX = 1100;
    public static final int WIDGET_ANDROID_RESIZE_UNMATCH_BOX = 1101;
    public static final int WIDGET_BORDER_BOX = 1103;
    public static final int WIDGET_RESIZE_MATCH_BUTTON = 1104;
    public static final int WIDGET_RESIZE_UNMATCH_BUTTON = 1105;
    public static final int WIDGET_TSF_RESIZE_BOX = 1102;
    public String appAdderBg;
    public String appMultiChoice;
    public String appMultiNotChoice;
    public String applicationPage_delButton;
    public String applicationPage_editModeOff;
    public String applicationPage_editModeOn;
    public String applicationPage_edit_icon;
    public String applicationPage_effectButton;
    public String applicationPage_hideLogo;
    public String applicationPage_nvPoint;
    public String applicationPage_sort_icon;
    public String applicationPage_transition3d_icon;
    public String applicationPage_transition_icon;
    public String iconMenuAlignOff;
    public String iconMenuAlignOn;
    public String iconMenuDeleteOff;
    public String iconMenuDeleteOn;
    public String iconMenuDetailOff;
    public String iconMenuDetailOn;
    public String iconMenuIconOff;
    public String iconMenuIconOn;
    public String iconMenuMoreOff;
    public String iconMenuMoreOn;
    public String iconMenuMutilChoiceOff;
    public String iconMenuMutilChoiceOn;
    public String iconMenuRenameOff;
    public String iconMenuRenameOn;
    public String iconMenuResetOff;
    public String iconMenuResetOn;
    public String iconMenuShadowBg;
    public String iconMenuUninstallOff;
    public String iconMenuUninstallOn;
    public String interactiveArrangeBg;
    public String interactiveArrangeScaleButton;
    private Context mContext;
    public String menuBG;
    public int menuBgOffsetX;
    public int menuItemsOffsetX;
    public String menuSettingButton;
    public String menuThemeButton;
    public String menuToolButton;
    public String menuUserButton;
    public int menuWidthOffset;
    public String packagename;
    public String pageAddButton;
    public String pagePreviewBackground;
    public String pagePreviewDrawerMark;
    public String pagePreviewEditButton;
    public String pagePreviewEditExitButton;
    public String pagePreviewHomepageMark;
    public String pagePreviewSelect;
    public String pagePreviewUnselect;
    public String pageSelectCountDown;
    public String pageSelecting360ModeOffButton;
    public String pageSelecting360ModeOnButton;
    public String pickerFocus;
    public String pickerLine;
    public String pickerMenu;
    public String pickerMenuNotic;
    public String pickerNotic;
    public String pickerPoint;
    public String publicButtonClose;
    public String publicButtonConfirm;
    public String publicButtonReturn;
    public String shellWidgetAndroidResizeMatchBox;
    public String shellWidgetAndroidResizeUnmatchBox;
    public String shellWidgetBorderBox;
    public String shellWidgetResizeMatchButton;
    public String shellWidgetResizeUnmatchButton;
    public String shellWidgetTSFResizeBox;
    public String themeName;
    public String unreadCountBg;
    public boolean isSystem = false;
    public boolean isSecondParserMode = false;
    public int pageNavigationBarColor = -14276567;
    public int pageNavigationBgColor = -12466442;

    public ThemeShellDescription(Context context) {
        this.mContext = context;
        this.packagename = context.getPackageName();
    }

    public void destroy() {
        if (!this.isSystem) {
            this.mContext = null;
        }
    }

    public Bitmap getBitmap(int i) {
        String str;
        switch (i) {
            case 200:
                str = this.menuThemeButton;
                break;
            case 201:
                str = this.menuToolButton;
                break;
            case 202:
                str = this.menuUserButton;
                break;
            case MENU_SETTING_BUTTON /* 203 */:
                str = this.menuSettingButton;
                break;
            case 300:
                str = this.menuBG;
                break;
            case 400:
                str = this.applicationPage_effectButton;
                break;
            case 401:
                str = this.applicationPage_nvPoint;
                break;
            case 402:
                str = this.applicationPage_editModeOn;
                break;
            case 403:
                str = this.applicationPage_editModeOff;
                break;
            case APP_PAGE_DEL_BUTTON /* 404 */:
                str = this.applicationPage_delButton;
                break;
            case APP_PAGE_HIDE_LOGO /* 405 */:
                str = this.applicationPage_hideLogo;
                break;
            case APP_PAGE_TRANSITION_ICON /* 406 */:
                str = this.applicationPage_transition_icon;
                break;
            case APP_PAGE_TRANSITION3D_ICON /* 407 */:
                str = this.applicationPage_transition3d_icon;
                break;
            case APP_PAGE_EDIT_ICON /* 408 */:
                str = this.applicationPage_edit_icon;
                break;
            case APP_PAGE_SORT_ICON /* 409 */:
                str = this.applicationPage_sort_icon;
                break;
            case PAGE_PREVIEW_SELECT /* 500 */:
                str = this.pagePreviewSelect;
                break;
            case PAGE_PREVIEW_UNSELECT /* 501 */:
                str = this.pagePreviewUnselect;
                break;
            case PAGE_PREVIEW_EDIT_BUTTON /* 502 */:
                str = this.pagePreviewEditButton;
                break;
            case PAGE_PREVIEW_EDIT_EXIT_BUTTON /* 503 */:
                str = this.pagePreviewEditExitButton;
                break;
            case PAGE_PREVIEW_HOMEPAGE_MARK /* 504 */:
                str = this.pagePreviewHomepageMark;
                break;
            case PAGE_PREVIEW_DRAWER_MARK /* 505 */:
                str = this.pagePreviewDrawerMark;
                break;
            case PAGE_SELECT_COUNT_DOWN /* 506 */:
                str = this.pageSelectCountDown;
                break;
            case PAGE_PREVIEW_BACKGROUND /* 507 */:
                str = this.pagePreviewBackground;
                break;
            case 509:
                str = this.pageSelecting360ModeOffButton;
                break;
            case 510:
                str = this.pageSelecting360ModeOnButton;
                break;
            case 511:
                str = this.pageAddButton;
                break;
            case 600:
                str = this.appMultiChoice;
                break;
            case APP_MULTI_NOT_CHOICE /* 601 */:
                str = this.appMultiNotChoice;
                break;
            case INTERACTIVE_ARRANGE_BG /* 700 */:
                str = this.interactiveArrangeBg;
                break;
            case INTERACTIVE_ARRANGE_SCALE_BUTTON /* 701 */:
                str = this.interactiveArrangeScaleButton;
                break;
            case PUBLIC_BUTTON_CLOSE /* 800 */:
                str = this.publicButtonClose;
                break;
            case PUBLIC_BUTTON_RETURN /* 801 */:
                str = this.publicButtonReturn;
                break;
            case PUBLIC_BUTTON_CONFIRM /* 802 */:
                str = this.publicButtonConfirm;
                break;
            case PICKER_LINE /* 900 */:
                str = this.pickerLine;
                break;
            case PICKER_POINT /* 901 */:
                str = this.pickerPoint;
                break;
            case PICKER_FOCUS /* 902 */:
                str = this.pickerFocus;
                break;
            case PICKER_NOTIC /* 903 */:
                str = this.pickerNotic;
                break;
            case PICKER_MENU /* 1000 */:
                str = this.pickerMenu;
                break;
            case PICKER_MENU_NOTIC /* 1001 */:
                str = this.pickerMenuNotic;
                break;
            case WIDGET_ANDROID_RESIZE_MATCH_BOX /* 1100 */:
                str = this.shellWidgetAndroidResizeMatchBox;
                break;
            case WIDGET_ANDROID_RESIZE_UNMATCH_BOX /* 1101 */:
                str = this.shellWidgetAndroidResizeUnmatchBox;
                break;
            case WIDGET_TSF_RESIZE_BOX /* 1102 */:
                str = this.shellWidgetTSFResizeBox;
                break;
            case WIDGET_BORDER_BOX /* 1103 */:
                str = this.shellWidgetBorderBox;
                break;
            case WIDGET_RESIZE_MATCH_BUTTON /* 1104 */:
                str = this.shellWidgetResizeMatchButton;
                break;
            case WIDGET_RESIZE_UNMATCH_BUTTON /* 1105 */:
                str = this.shellWidgetResizeUnmatchButton;
                break;
            case ICON_MENU_SHADOW_BG /* 1200 */:
                str = this.iconMenuShadowBg;
                break;
            case ICON_MENU_ALIGN_ON /* 1201 */:
                str = this.iconMenuAlignOn;
                break;
            case ICON_MENU_ALIGN_OFF /* 1202 */:
                str = this.iconMenuAlignOff;
                break;
            case ICON_MENU_DELETE_ON /* 1203 */:
                str = this.iconMenuDeleteOn;
                break;
            case ICON_MENU_DELETE_OFF /* 1204 */:
                str = this.iconMenuDeleteOff;
                break;
            case ICON_MENU_DETAIL_ON /* 1205 */:
                str = this.iconMenuDetailOn;
                break;
            case ICON_MENU_DETAIL_OFF /* 1206 */:
                str = this.iconMenuDetailOff;
                break;
            case ICON_MENU_ICON_ON /* 1207 */:
                str = this.iconMenuIconOn;
                break;
            case ICON_MENU_ICON_OFF /* 1208 */:
                str = this.iconMenuIconOff;
                break;
            case ICON_MENU_MUTIL_CHOICE_ON /* 1209 */:
                str = this.iconMenuMutilChoiceOn;
                break;
            case ICON_MENU_MUTIL_CHOICE_OFF /* 1210 */:
                str = this.iconMenuMutilChoiceOff;
                break;
            case ICON_MENU_RENAME_ON /* 1211 */:
                str = this.iconMenuRenameOn;
                break;
            case ICON_MENU_RENAME_OFF /* 1212 */:
                str = this.iconMenuRenameOff;
                break;
            case ICON_MENU_RESET_ON /* 1213 */:
                str = this.iconMenuResetOn;
                break;
            case ICON_MENU_RESET_OFF /* 1214 */:
                str = this.iconMenuResetOff;
                break;
            case ICON_MENU_UNINSTALL_ON /* 1215 */:
                str = this.iconMenuUninstallOn;
                break;
            case ICON_MENU_UNINSTALL_OFF /* 1216 */:
                str = this.iconMenuUninstallOff;
                break;
            case ICON_MENU_MORE_ON /* 1217 */:
                str = this.iconMenuMoreOn;
                break;
            case ICON_MENU_MORE_OFF /* 1218 */:
                str = this.iconMenuMoreOff;
                break;
            case UNREAD_COUNT_BG /* 1500 */:
                str = this.unreadCountBg;
                break;
            case APP_ADDER_BG /* 1600 */:
                str = this.appAdderBg;
                break;
            default:
                str = null;
                break;
        }
        Bitmap bitmp = str != null ? getBitmp(str) : null;
        if (bitmp == null) {
            if (this.isSystem) {
                return Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
            }
            return ThemeManager.getInstance().getSystemThemeDescription().shell.getBitmap(i);
        }
        Bitmap copy = bitmp.copy(Bitmap.Config.ARGB_8888, true);
        bitmp.recycle();
        return copy;
    }

    private Bitmap getBitmp(String str) {
        InputStream inputStream;
        Throwable th;
        Bitmap bitmap = null;
        if (str != null && str != "") {
            try {
                if (!this.isSecondParserMode) {
                    inputStream = this.mContext.getAssets().open("theme/shell/" + str + ".png");
                } else {
                    inputStream = this.mContext.getResources().openRawResource(this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName()));
                }
                try {
                    bitmap = BitmapFactory.decodeStream(inputStream);
                    try {
                        inputStream.close();
                    } catch (Exception e) {
                    }
                } catch (Exception e2) {
                    try {
                        inputStream.close();
                    } catch (Exception e3) {
                    }
                    return bitmap;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream.close();
                    } catch (Exception e4) {
                    }
                    throw th;
                }
            } catch (Exception e5) {
                inputStream = null;
            } catch (Throwable th3) {
                inputStream = null;
                th = th3;
            }
        }
        return bitmap;
    }
}
