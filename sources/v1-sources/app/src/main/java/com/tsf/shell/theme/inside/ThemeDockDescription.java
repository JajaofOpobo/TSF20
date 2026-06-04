package com.tsf.shell.theme.inside;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ThemeDockDescription {
    public static final int DOCK_BAR = 1700;
    public static final int DOCK_DESKTOP_SELECTOR_BUTTON_OFF = 1701;
    public static final int DOCK_DESKTOP_SELECTOR_BUTTON_ON = 1702;
    public static final int DOCK_DESKTOP_SELECTOR_BUTTON_POINT = 1707;
    public static final int DOCK_LASSO_MODE = 510;
    public static final int DOCK_MENU_ADD_BUTTON_OFF = 512;
    public static final int DOCK_MENU_ADD_BUTTON_ON = 511;
    public static final int DOCK_MENU_ALIGNMENT_BUTTON_OFF = 514;
    public static final int DOCK_MENU_ALIGNMENT_BUTTON_ON = 513;
    public static final int DOCK_MENU_BUTTON_OFF = 1703;
    public static final int DOCK_MENU_BUTTON_ON = 1704;
    public static final int DOCK_MENU_EDIT_BUTTON_OFF = 520;
    public static final int DOCK_MENU_EDIT_BUTTON_ON = 519;
    public static final int DOCK_MENU_HOMEPAGE_BUTTON_OFF = 518;
    public static final int DOCK_MENU_HOMEPAGE_BUTTON_ON = 517;
    public static final int DOCK_MENU_LASSO_BUTTON_OFF = 509;
    public static final int DOCK_MENU_LASSO_BUTTON_ON = 508;
    public static final int DOCK_MENU_MULIT_CHOICE_BUTTON_OFF = 524;
    public static final int DOCK_MENU_MULIT_CHOICE_BUTTON_ON = 523;
    public static final int DOCK_MENU_POINT = 1709;
    public static final int DOCK_MENU_RESET_BUTTON_OFF = 516;
    public static final int DOCK_MENU_RESET_BUTTON_ON = 515;
    public static final int DOCK_MENU_SETTING_BUTTON_OFF = 522;
    public static final int DOCK_MENU_SETTING_BUTTON_ON = 521;
    public static final int DOCK_SCROLLING_MODE_BG = 600;
    public static final int DOCK_TRASHCAN_BUTTON_POINT = 1708;
    public static final int DOCK_TRASHCAN_CLOSE_BUTTON = 1705;
    public static final int DOCK_TRASHCAN_OPEN_BUTTON = 1706;
    public String dockBar;
    public String dockDesktopSelectorButtonOff;
    public String dockDesktopSelectorButtonOn;
    public String dockDesktopSelectorButtonPoint;
    public int dockDesktopSelectorButtonPointOffsetX;
    public int dockDesktopSelectorButtonPointOffsetY;
    public String dockLassoMode;
    public String dockMenuAddButtonOff;
    public String dockMenuAddButtonOn;
    public String dockMenuAlignmentButoonOff;
    public String dockMenuAlignmentButoonOn;
    public String dockMenuButtonOff;
    public String dockMenuButtonOn;
    public String dockMenuEditButtonOff;
    public String dockMenuEditButtonOn;
    public String dockMenuHomepageButtonOff;
    public String dockMenuHomepageButtonOn;
    public String dockMenuLassoButtonOff;
    public String dockMenuLassoButtonOn;
    public String dockMenuMulitChoiceButtonOff;
    public String dockMenuMulitChoiceButtonOn;
    public String dockMenuPoint;
    public String dockMenuResetButtonOff;
    public String dockMenuResetButtonOn;
    public String dockMenuSettingButtonOff;
    public String dockMenuSettingButtonOn;
    public String dockScrollModeBg;
    public String dockTrashcanButtonPoint;
    public int dockTrashcanButtonPointOffsetX;
    public int dockTrashcanButtonPointOffsetY;
    public String dockTrashcanCloseButton;
    public String dockTrashcanOpenButton;
    public boolean isSystem;
    private Context mContext;
    public String packagename;
    public String themeName;
    public boolean isSecondParserMode = false;
    public float dockBottomMargin = 0.0f;
    public float dockTopMargin = 0.0f;
    public float dockLeftMargin = 0.0f;
    public float dockRightMargin = 0.0f;
    public float dockItemStartMargin = 0.0f;
    public float dockItemEndMargin = 0.0f;
    public float dockOnFocusItemStartMargin = 0.0f;
    public float dockOnFocusItemEndMargin = 0.0f;

    public ThemeDockDescription(Context context) {
        this.packagename = "";
        this.mContext = context;
        this.packagename = this.mContext.getPackageName();
    }

    public void destroy() {
        if (!this.isSystem) {
            this.mContext = null;
        }
    }

    public Bitmap getBitmap(int i) {
        String str = null;
        switch (i) {
            case DOCK_MENU_LASSO_BUTTON_ON /* 508 */:
                str = this.dockMenuLassoButtonOn;
                break;
            case 509:
                str = this.dockMenuLassoButtonOff;
                break;
            case 510:
                str = this.dockLassoMode;
                break;
            case 511:
                str = this.dockMenuAddButtonOn;
                break;
            case DOCK_MENU_ADD_BUTTON_OFF /* 512 */:
                str = this.dockMenuAddButtonOff;
                break;
            case 513:
                str = this.dockMenuAlignmentButoonOn;
                break;
            case DOCK_MENU_ALIGNMENT_BUTTON_OFF /* 514 */:
                str = this.dockMenuAlignmentButoonOff;
                break;
            case DOCK_MENU_RESET_BUTTON_ON /* 515 */:
                str = this.dockMenuResetButtonOn;
                break;
            case DOCK_MENU_RESET_BUTTON_OFF /* 516 */:
                str = this.dockMenuResetButtonOff;
                break;
            case DOCK_MENU_HOMEPAGE_BUTTON_ON /* 517 */:
                str = this.dockMenuHomepageButtonOn;
                break;
            case DOCK_MENU_HOMEPAGE_BUTTON_OFF /* 518 */:
                str = this.dockMenuHomepageButtonOff;
                break;
            case DOCK_MENU_EDIT_BUTTON_ON /* 519 */:
                str = this.dockMenuEditButtonOn;
                break;
            case DOCK_MENU_EDIT_BUTTON_OFF /* 520 */:
                str = this.dockMenuEditButtonOff;
                break;
            case DOCK_MENU_SETTING_BUTTON_ON /* 521 */:
                str = this.dockMenuSettingButtonOn;
                break;
            case DOCK_MENU_SETTING_BUTTON_OFF /* 522 */:
                str = this.dockMenuSettingButtonOff;
                break;
            case DOCK_MENU_MULIT_CHOICE_BUTTON_ON /* 523 */:
                str = this.dockMenuMulitChoiceButtonOn;
                break;
            case DOCK_MENU_MULIT_CHOICE_BUTTON_OFF /* 524 */:
                str = this.dockMenuMulitChoiceButtonOff;
                break;
            case 600:
                str = this.dockScrollModeBg;
                break;
            case DOCK_BAR /* 1700 */:
                str = this.dockBar;
                break;
            case DOCK_DESKTOP_SELECTOR_BUTTON_OFF /* 1701 */:
                str = this.dockDesktopSelectorButtonOff;
                break;
            case DOCK_DESKTOP_SELECTOR_BUTTON_ON /* 1702 */:
                str = this.dockDesktopSelectorButtonOn;
                break;
            case DOCK_MENU_BUTTON_OFF /* 1703 */:
                str = this.dockMenuButtonOff;
                break;
            case DOCK_MENU_BUTTON_ON /* 1704 */:
                str = this.dockMenuButtonOn;
                break;
            case DOCK_TRASHCAN_CLOSE_BUTTON /* 1705 */:
                str = this.dockTrashcanCloseButton;
                break;
            case DOCK_TRASHCAN_OPEN_BUTTON /* 1706 */:
                str = this.dockTrashcanOpenButton;
                break;
            case DOCK_DESKTOP_SELECTOR_BUTTON_POINT /* 1707 */:
                str = this.dockDesktopSelectorButtonPoint;
                break;
            case DOCK_TRASHCAN_BUTTON_POINT /* 1708 */:
                str = this.dockTrashcanButtonPoint;
                break;
            case DOCK_MENU_POINT /* 1709 */:
                str = this.dockMenuPoint;
                break;
        }
        Bitmap bitmp = getBitmp(str);
        if (bitmp == null) {
            if (this.isSystem) {
                return Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
            }
            return ThemeManager.getInstance().getSystemThemeDescription().dock.getBitmap(i);
        }
        Bitmap copy = bitmp.copy(Bitmap.Config.ARGB_8888, true);
        bitmp.recycle();
        return copy;
    }

    private Bitmap getBitmp(String str) {
        InputStream inputStream;
        Throwable th;
        Bitmap bitmap = null;
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
        return bitmap;
    }
}
