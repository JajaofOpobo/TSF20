package com.tsf.shell.theme.inside;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ThemeOptionMenuDescription {
    public static final int OPTION_MENU_ADD = 2100;
    public static final int OPTION_MENU_ADD_ANDROID_WIDGET = 2102;
    public static final int OPTION_MENU_ADD_APP = 2101;
    public static final int OPTION_MENU_ADD_FOLDER = 2105;
    public static final int OPTION_MENU_ADD_SHORTCUT = 2104;
    public static final int OPTION_MENU_ADD_TSF_SHORTCUT = 2106;
    public static final int OPTION_MENU_ADD_TSF_WIDGET = 2103;
    public static final int OPTION_MENU_BG = 2000;
    public static final int OPTION_MENU_FAVORITE = 2500;
    public static final int OPTION_MENU_FAVORITE_ADD = 2501;
    public static final int OPTION_MENU_FAVORITE_DELETE = 2502;
    public static final int OPTION_MENU_FAVORITE_RETURN = 2503;
    public static final int OPTION_MENU_ITEM_BG = 2002;
    public static final int OPTION_MENU_LABEL_BG = 2004;
    public static final int OPTION_MENU_SECOND_BG = 2001;
    public static final int OPTION_MENU_SECOND_ITEM_BG = 2003;
    public static final int OPTION_MENU_TOOL = 2200;
    public static final int OPTION_MENU_TOOL_DESKTOP_EDITOR = 2203;
    public static final int OPTION_MENU_TOOL_LASSO = 2201;
    public static final int OPTION_MENU_TOOL_MUTIL_CHOICE = 2202;
    public static final int OPTION_MENU_TSF = 2300;
    public static final int OPTION_MENU_WALLPAPER = 2400;
    public boolean isSystem;
    private Context mContext;
    public String optionMenuAdd;
    public String optionMenuAddAndroidWidget;
    public String optionMenuAddApp;
    public String optionMenuAddFolder;
    public String optionMenuAddShortcut;
    public String optionMenuAddTSFShortcut;
    public String optionMenuAddTSFWidget;
    public String optionMenuBg;
    public String optionMenuFavorite;
    public String optionMenuFavoriteAdd;
    public String optionMenuFavoriteDelete;
    public String optionMenuFavoriteReturn;
    public String optionMenuItemBg;
    public String optionMenuLabelBg;
    public String optionMenuSecondBg;
    public String optionMenuSecondItemBg;
    public String optionMenuTSF;
    public String optionMenuTool;
    public String optionMenuToolDesktopEditor;
    public String optionMenuToolLasso;
    public String optionMenuToolMutilChoice;
    public String optionMenuWallpaper;
    public String themeName;
    public boolean isSecondParserMode = false;
    public int optionMenuButtonStandardColor = -6710887;
    public int optionMenuButtonPressedColor = -1;
    public int optionMenuLabelTextColor = -6710887;

    public ThemeOptionMenuDescription(Context context) {
        this.mContext = context;
    }

    public void destroy() {
        if (!this.isSystem) {
            this.mContext = null;
        }
    }

    public Bitmap getBitmap(int i) {
        String str = null;
        switch (i) {
            case OPTION_MENU_BG /* 2000 */:
                str = this.optionMenuBg;
                break;
            case OPTION_MENU_SECOND_BG /* 2001 */:
                str = this.optionMenuSecondBg;
                break;
            case OPTION_MENU_ITEM_BG /* 2002 */:
                str = this.optionMenuItemBg;
                break;
            case OPTION_MENU_SECOND_ITEM_BG /* 2003 */:
                str = this.optionMenuSecondItemBg;
                break;
            case OPTION_MENU_LABEL_BG /* 2004 */:
                str = this.optionMenuLabelBg;
                break;
            case OPTION_MENU_ADD /* 2100 */:
                str = this.optionMenuAdd;
                break;
            case OPTION_MENU_ADD_APP /* 2101 */:
                str = this.optionMenuAddApp;
                break;
            case OPTION_MENU_ADD_ANDROID_WIDGET /* 2102 */:
                str = this.optionMenuAddAndroidWidget;
                break;
            case OPTION_MENU_ADD_TSF_WIDGET /* 2103 */:
                str = this.optionMenuAddTSFWidget;
                break;
            case OPTION_MENU_ADD_SHORTCUT /* 2104 */:
                str = this.optionMenuAddShortcut;
                break;
            case OPTION_MENU_ADD_FOLDER /* 2105 */:
                str = this.optionMenuAddFolder;
                break;
            case OPTION_MENU_ADD_TSF_SHORTCUT /* 2106 */:
                str = this.optionMenuAddTSFShortcut;
                break;
            case OPTION_MENU_TOOL /* 2200 */:
                str = this.optionMenuTool;
                break;
            case OPTION_MENU_TOOL_LASSO /* 2201 */:
                str = this.optionMenuToolLasso;
                break;
            case OPTION_MENU_TOOL_MUTIL_CHOICE /* 2202 */:
                str = this.optionMenuToolMutilChoice;
                break;
            case OPTION_MENU_TOOL_DESKTOP_EDITOR /* 2203 */:
                str = this.optionMenuToolDesktopEditor;
                break;
            case OPTION_MENU_TSF /* 2300 */:
                str = this.optionMenuTSF;
                break;
            case OPTION_MENU_WALLPAPER /* 2400 */:
                str = this.optionMenuWallpaper;
                break;
            case OPTION_MENU_FAVORITE /* 2500 */:
                str = this.optionMenuFavorite;
                break;
            case OPTION_MENU_FAVORITE_ADD /* 2501 */:
                str = this.optionMenuFavoriteAdd;
                break;
            case OPTION_MENU_FAVORITE_DELETE /* 2502 */:
                str = this.optionMenuFavoriteDelete;
                break;
            case OPTION_MENU_FAVORITE_RETURN /* 2503 */:
                str = this.optionMenuFavoriteReturn;
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
