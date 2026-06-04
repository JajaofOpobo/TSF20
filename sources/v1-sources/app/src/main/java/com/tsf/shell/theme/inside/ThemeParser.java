package com.tsf.shell.theme.inside;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import com.tsf.shell.theme.inside.widget.SystemContactTheme;
import com.tsf.shell.theme.inside.widget.SystemFolderTheme;
import com.tsf.shell.workspace3D.k.b.ap;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes.dex */
public class ThemeParser extends DefaultHandler {
    public static final int PARSER_CONFIG_ALL = 65535;
    public static final int PARSER_CONFIG_ONLY_ICON = 6;
    public static final int PARSER_CONFIG_SURPLUS = 16379;
    public static final int TYPE_CONTACT = 16;
    public static final int TYPE_DOCK = 65;
    public static final int TYPE_FOLDER = 8;
    public static final int TYPE_ICON = 2;
    public static final int TYPE_ICON_FILTER = 4;
    public static final int TYPE_ICON_MENU = 2049;
    public static final int TYPE_LINE_PICKER = 8193;
    public static final int TYPE_MENU = 129;
    public static final int TYPE_OPTION_MENU = 1025;
    public static final int TYPE_POP_UP_MENU = 513;
    public static final int TYPE_PREVIEW = 257;
    public static final int TYPE_SHELL = 1;
    public static final int TYPE_SHELL_OTHER = 33;
    public static final int TYPE_WALLPAPER = 16384;
    public static final int TYPE_WIDGET_RESIZE = 4097;
    private Context mContext;
    private ThemeDescription resultThemeDescription;
    DocumentBuilderFactory factory = null;
    DocumentBuilder builder = null;
    Document document = null;
    InputStream inputStream = null;

    public ThemeParser(Context context) {
        this.mContext = context;
    }

    private void setTextureName(ThemeDescription themeDescription, String str) {
        themeDescription.themeName = str;
        if (themeDescription.icon != null && themeDescription.icon.themeName == null) {
            themeDescription.icon.themeName = str;
        }
        if (themeDescription.dock != null && themeDescription.dock.themeName == null) {
            themeDescription.dock.themeName = str;
        }
        if (themeDescription.shell != null && themeDescription.shell.themeName == null) {
            themeDescription.shell.themeName = str;
        }
        if (themeDescription.optionMenu != null && themeDescription.optionMenu.themeName == null) {
            themeDescription.optionMenu.themeName = str;
        }
        if (themeDescription.wallpaper != null && themeDescription.wallpaper.themeName == null) {
            themeDescription.wallpaper.themeName = str;
        }
        if (themeDescription.widget != null) {
            if (themeDescription.widget.folder != null && themeDescription.widget.folder.themeName == null) {
                themeDescription.widget.folder.themeName = str;
            }
            if (themeDescription.widget.contact != null && themeDescription.widget.contact.themeName == null) {
                themeDescription.widget.contact.themeName = str;
            }
        }
    }

    public void parserAllElement() {
        parser(PARSER_CONFIG_ALL);
    }

    public void parser(int i) {
        String str;
        ThemeDescription themeDescription = new ThemeDescription(this.mContext);
        try {
            this.inputStream = this.mContext.getAssets().open("theme/ThemeDescription.xml");
        } catch (Exception e) {
            try {
                this.inputStream = this.mContext.getAssets().open("theme/theme_description.xml");
            } catch (Exception e2) {
                this.inputStream = this.mContext.getResources().openRawResource(this.mContext.getResources().getIdentifier("theme_description", "raw", this.mContext.getPackageName()));
                themeDescription.isSecondParserMode = true;
            }
        }
        PackageInfo packageInfo = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0);
        themeDescription.versionName = packageInfo.versionName;
        themeDescription.versionCode = packageInfo.versionCode;
        themeDescription.packagename = this.mContext.getPackageName();
        themeDescription.icon.isSecondParserMode = themeDescription.isSecondParserMode;
        try {
            str = this.mContext.getResources().getString(packageInfo.applicationInfo.labelRes);
        } catch (Exception e3) {
            str = "";
        }
        this.factory = DocumentBuilderFactory.newInstance();
        this.builder = this.factory.newDocumentBuilder();
        this.document = this.builder.parse(this.inputStream);
        NodeList childNodes = this.document.getDocumentElement().getChildNodes();
        int length = childNodes.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            Node item = childNodes.item(i2);
            if (item.getNodeType() == 1) {
                Element element = (Element) item;
                String nodeName = element.getNodeName();
                if (nodeName.equals("info")) {
                    parseInfo(element, themeDescription);
                } else if (nodeName.equals("icon-default")) {
                    if (getParserState(i, 2)) {
                        parseIconDefault(element, themeDescription);
                    }
                } else if (nodeName.equals("icon-mask")) {
                    if (getParserState(i, 2)) {
                        parseIconDefaultMask(element, themeDescription);
                    }
                } else if (nodeName.equals("icon-filter")) {
                    if (getParserState(i, 4)) {
                        parseIconFilter(element, themeDescription);
                    }
                } else if (nodeName.equals("widget")) {
                    parseWidget(element, i, themeDescription);
                } else if (nodeName.equals("shell")) {
                    if (getParserState(i, 1)) {
                        parseShell(element, i, themeDescription);
                    }
                } else if (nodeName.equals("wallpaper") && getParserState(i, TYPE_WALLPAPER)) {
                    parseWallpaper(element, themeDescription);
                }
            }
        }
        ThemeDescription themeDescription2 = null;
        if (ThemeManager.getInstance() != null) {
            themeDescription2 = ThemeManager.getInstance().getSystemThemeDescription();
        }
        if (themeDescription.widget == null && themeDescription2 != null) {
            themeDescription.widget = themeDescription2.widget;
        } else {
            if (themeDescription.widget.folder == null && themeDescription2 != null) {
                themeDescription.widget.folder = themeDescription2.widget.folder;
            }
            if (themeDescription.widget.contact == null && themeDescription2 != null) {
                themeDescription.widget.contact = themeDescription2.widget.contact;
            }
        }
        if (themeDescription.shell == null && themeDescription2 != null) {
            themeDescription.shell = themeDescription2.shell;
        }
        if (themeDescription.dock == null && themeDescription2 != null) {
            themeDescription.dock = themeDescription2.dock;
        }
        if (themeDescription.optionMenu == null && themeDescription2 != null) {
            themeDescription.optionMenu = themeDescription2.optionMenu;
        }
        setTextureName(themeDescription, str);
        this.inputStream.close();
        this.resultThemeDescription = themeDescription;
    }

    private boolean getParserState(int i, int i2) {
        return (i & i2) == i2;
    }

    public void exceptionClose() {
        try {
            this.inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void parseInfo(Element element, ThemeDescription themeDescription) {
        themeDescription.supportHD = parseBoolean(element.getAttribute("supportHD"), false);
    }

    private void parseIconDefaultMask(Element element, ThemeDescription themeDescription) {
        NodeList childNodes = element.getChildNodes();
        themeDescription.icon.defaultMask = parseInteger(element.getAttribute("default"), -1);
        themeDescription.icon.isSecondParserMode = themeDescription.isSecondParserMode;
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                themeDescription.icon.addDefaultIconUponItem(((Element) item).getAttribute("image"));
            }
        }
    }

    private void parseIconDefault(Element element, ThemeDescription themeDescription) {
        NodeList childNodes = element.getChildNodes();
        themeDescription.icon.globalScale = parseFloat(element.getAttribute("globalScale"), 1.05f);
        themeDescription.icon.scale = Float.valueOf(element.getAttribute("scale")).floatValue();
        themeDescription.icon.leftOffset = Float.valueOf(element.getAttribute("leftOffset")).floatValue();
        themeDescription.icon.rightOffset = Float.valueOf(element.getAttribute("rightOffset")).floatValue();
        themeDescription.icon.topOffset = Float.valueOf(element.getAttribute("topOffset")).floatValue();
        themeDescription.icon.bottomOffset = Float.valueOf(element.getAttribute("bottomOffset")).floatValue();
        themeDescription.icon.defaultIcon = parseInteger(element.getAttribute("default"), -1);
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                float f = themeDescription.icon.scale;
                if (element2.hasAttribute("scale")) {
                    f = Float.valueOf(element2.getAttribute("scale")).floatValue();
                }
                if (f == 0.0f) {
                    f = 0.8f;
                }
                themeDescription.icon.addDefaultIconBack(element2.getAttribute("image"), f);
            }
        }
    }

    private void parseWallpaper(Element element, ThemeDescription themeDescription) {
        NodeList childNodes = element.getChildNodes();
        themeDescription.wallpaper = new ThemeWallpaperDescription(this.mContext);
        themeDescription.wallpaper.setDefaultIndex(parseInteger(element.getAttribute("default"), 0));
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                themeDescription.wallpaper.addItem(new String[]{element2.getAttribute("image"), element2.getAttribute("thumb")});
            }
        }
    }

    private void parseIconFilter(Element element, ThemeDescription themeDescription) {
        System.currentTimeMillis();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                if (element2.getNodeName().equals("item")) {
                    String attribute = element2.getAttribute("component");
                    if (attribute != null && !attribute.contains("ComponentInfo")) {
                        attribute = "ComponentInfo{" + attribute + "}";
                    }
                    String attribute2 = element2.getAttribute("image");
                    themeDescription.icon.addIconFilterItem(attribute, attribute2 == null ? element2.getAttribute("drawable") : attribute2);
                }
            }
        }
    }

    private void parseShell(Element element, int i, ThemeDescription themeDescription) {
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        if (length > 0) {
            themeDescription.shell = new ThemeShellDescription(this.mContext);
        }
        themeDescription.shell.isSecondParserMode = themeDescription.isSecondParserMode;
        for (int i2 = 0; i2 < length; i2++) {
            Node item = childNodes.item(i2);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                String nodeName = element2.getNodeName();
                if (nodeName.equals("menu")) {
                    if (getParserState(i, TYPE_MENU)) {
                        themeDescription.shell.menuToolButton = element2.getAttribute("toolButton");
                        themeDescription.shell.menuThemeButton = element2.getAttribute("themeButton");
                        themeDescription.shell.menuUserButton = element2.getAttribute("userButton");
                        themeDescription.shell.menuSettingButton = element2.getAttribute("settingButton");
                        themeDescription.shell.menuBG = element2.getAttribute("bg");
                        themeDescription.shell.menuBgOffsetX = parseInteger(element2.getAttribute("bgOffsetX"), 0);
                        themeDescription.shell.menuWidthOffset = parseInteger(element2.getAttribute("widthOffset"), 0);
                        themeDescription.shell.menuItemsOffsetX = parseInteger(element2.getAttribute("itemsOffset"), 0);
                    }
                } else if (nodeName.equals("pageNavigationBar")) {
                    if (getParserState(i, TYPE_PREVIEW)) {
                        themeDescription.shell.pageNavigationBarColor = parseColor(element2.getAttribute("barColor"), -14276567);
                        themeDescription.shell.pageNavigationBgColor = parseColor(element2.getAttribute("bgColor"), -12466442);
                    }
                } else if (nodeName.equals("applicationPage")) {
                    if (getParserState(i, TYPE_PREVIEW)) {
                        themeDescription.shell.applicationPage_effectButton = element2.getAttribute("effectButton");
                        themeDescription.shell.applicationPage_nvPoint = element2.getAttribute("nvPoint");
                        themeDescription.shell.applicationPage_editModeOn = element2.getAttribute("editModeOn");
                        themeDescription.shell.applicationPage_editModeOff = element2.getAttribute("editModeOff");
                        themeDescription.shell.applicationPage_delButton = element2.getAttribute("delButton");
                        themeDescription.shell.applicationPage_hideLogo = element2.getAttribute("hideLogo");
                        themeDescription.shell.applicationPage_transition_icon = element2.getAttribute("transitionIcon");
                        themeDescription.shell.applicationPage_transition3d_icon = element2.getAttribute("transition3dIcon");
                        themeDescription.shell.applicationPage_edit_icon = element2.getAttribute("editIcon");
                        themeDescription.shell.applicationPage_sort_icon = element2.getAttribute("sortIcon");
                    }
                } else if (nodeName.equals("linePicker")) {
                    if (getParserState(i, TYPE_LINE_PICKER)) {
                        themeDescription.shell.pickerLine = element2.getAttribute("line");
                        themeDescription.shell.pickerPoint = element2.getAttribute("point");
                        themeDescription.shell.pickerFocus = element2.getAttribute("focus");
                        themeDescription.shell.pickerNotic = element2.getAttribute("notic");
                    }
                } else if (nodeName.equals("pickerMenu")) {
                    if (getParserState(i, 513)) {
                        themeDescription.shell.pickerMenu = element2.getAttribute("image");
                        themeDescription.shell.pickerMenuNotic = element2.getAttribute("notic");
                    }
                } else if (nodeName.equals("pagePreview")) {
                    if (getParserState(i, TYPE_PREVIEW)) {
                        themeDescription.shell.pagePreviewBackground = element2.getAttribute("background");
                        themeDescription.shell.pagePreviewSelect = element2.getAttribute("select");
                        themeDescription.shell.pagePreviewUnselect = element2.getAttribute("unselect");
                        themeDescription.shell.pagePreviewEditButton = element2.getAttribute("editButton");
                        themeDescription.shell.pagePreviewEditExitButton = element2.getAttribute("editExitButton");
                        themeDescription.shell.pagePreviewHomepageMark = element2.getAttribute("homepageMark");
                        themeDescription.shell.pagePreviewDrawerMark = element2.getAttribute("drawerMark");
                        themeDescription.shell.pageSelectCountDown = element2.getAttribute("countDown");
                        themeDescription.shell.pageSelecting360ModeOffButton = element2.getAttribute("selecting360ModeOffButton");
                        themeDescription.shell.pageSelecting360ModeOnButton = element2.getAttribute("selecting360ModeOnButton");
                        themeDescription.shell.pageAddButton = element2.getAttribute("addButton");
                    }
                } else if (nodeName.equals("interactiveArrange")) {
                    if (getParserState(i, 33)) {
                        themeDescription.shell.interactiveArrangeBg = element2.getAttribute("bg");
                        themeDescription.shell.interactiveArrangeScaleButton = element2.getAttribute("scaleButton");
                    }
                } else if (nodeName.equals("publicButton")) {
                    if (getParserState(i, 33)) {
                        themeDescription.shell.publicButtonClose = element2.getAttribute("close");
                        themeDescription.shell.publicButtonReturn = element2.getAttribute("return");
                        themeDescription.shell.publicButtonConfirm = element2.getAttribute("confirm");
                    }
                } else if (nodeName.equals("app")) {
                    themeDescription.shell.appMultiChoice = element2.getAttribute("multiChoice");
                    themeDescription.shell.appMultiNotChoice = element2.getAttribute("multiNotChoice");
                } else if (nodeName.equals("dockMenu")) {
                    if (getParserState(i, 65)) {
                        if (themeDescription.dock == null) {
                            themeDescription.dock = new ThemeDockDescription(this.mContext);
                            themeDescription.dock.isSecondParserMode = themeDescription.isSecondParserMode;
                        }
                        themeDescription.dock.dockMenuLassoButtonOn = element2.getAttribute("lassoButtonOn");
                        themeDescription.dock.dockMenuLassoButtonOff = element2.getAttribute("lassoButtonOff");
                        themeDescription.dock.dockLassoMode = element2.getAttribute("dockLassoMode");
                        themeDescription.dock.dockMenuAddButtonOn = element2.getAttribute("addButtonOn");
                        themeDescription.dock.dockMenuAddButtonOff = element2.getAttribute("addButtonOff");
                        themeDescription.dock.dockMenuAlignmentButoonOn = element2.getAttribute("alignmentButtonOn");
                        themeDescription.dock.dockMenuAlignmentButoonOff = element2.getAttribute("alignmentButtonOff");
                        themeDescription.dock.dockMenuResetButtonOn = element2.getAttribute("resetButtonOn");
                        themeDescription.dock.dockMenuResetButtonOff = element2.getAttribute("resetButtonOff");
                        themeDescription.dock.dockMenuHomepageButtonOn = element2.getAttribute("homepageButtonOn");
                        themeDescription.dock.dockMenuHomepageButtonOff = element2.getAttribute("homepageButtonOff");
                        themeDescription.dock.dockMenuEditButtonOn = element2.getAttribute("editButtonOn");
                        themeDescription.dock.dockMenuEditButtonOff = element2.getAttribute("editButtonOff");
                        themeDescription.dock.dockMenuSettingButtonOn = element2.getAttribute("settingButtonOn");
                        themeDescription.dock.dockMenuSettingButtonOff = element2.getAttribute("settingButtonOff");
                        themeDescription.dock.dockMenuMulitChoiceButtonOn = element2.getAttribute("mulitChoiceButtonOn");
                        themeDescription.dock.dockMenuMulitChoiceButtonOff = element2.getAttribute("mulitChoiceButtonOff");
                    }
                } else if (nodeName.equals("widgetResize")) {
                    if (getParserState(i, TYPE_WIDGET_RESIZE)) {
                        themeDescription.shell.shellWidgetAndroidResizeMatchBox = element2.getAttribute("androidMatchBox");
                        themeDescription.shell.shellWidgetAndroidResizeUnmatchBox = element2.getAttribute("androidUnmatchBox");
                        themeDescription.shell.shellWidgetTSFResizeBox = element2.getAttribute("tsfBox");
                        themeDescription.shell.shellWidgetBorderBox = element2.getAttribute("borderBox");
                        themeDescription.shell.shellWidgetResizeMatchButton = element2.getAttribute("matchButton");
                        themeDescription.shell.shellWidgetResizeUnmatchButton = element2.getAttribute("unmatchButton");
                    }
                } else if (nodeName.equals("iconMenu")) {
                    if (getParserState(i, TYPE_ICON_MENU)) {
                        themeDescription.shell.iconMenuAlignOn = element2.getAttribute("alignOn");
                        themeDescription.shell.iconMenuAlignOff = element2.getAttribute("alignOff");
                        themeDescription.shell.iconMenuDeleteOn = element2.getAttribute("deleteOn");
                        themeDescription.shell.iconMenuDeleteOff = element2.getAttribute("deleteOff");
                        themeDescription.shell.iconMenuDetailOn = element2.getAttribute("detailOn");
                        themeDescription.shell.iconMenuDetailOff = element2.getAttribute("detailOff");
                        themeDescription.shell.iconMenuIconOn = element2.getAttribute("iconOn");
                        themeDescription.shell.iconMenuIconOff = element2.getAttribute("iconOff");
                        themeDescription.shell.iconMenuMutilChoiceOn = element2.getAttribute("mutilChoiceOn");
                        themeDescription.shell.iconMenuMutilChoiceOff = element2.getAttribute("mutilChoiceOff");
                        themeDescription.shell.iconMenuRenameOn = element2.getAttribute("renameOn");
                        themeDescription.shell.iconMenuRenameOff = element2.getAttribute("renameOff");
                        themeDescription.shell.iconMenuResetOn = element2.getAttribute("resetOn");
                        themeDescription.shell.iconMenuResetOff = element2.getAttribute("resetOff");
                        themeDescription.shell.iconMenuUninstallOn = element2.getAttribute("uninstallOn");
                        themeDescription.shell.iconMenuUninstallOff = element2.getAttribute("uninstallOff");
                        themeDescription.shell.iconMenuMoreOn = element2.getAttribute("moreOn");
                        themeDescription.shell.iconMenuMoreOff = element2.getAttribute("moreOff");
                        themeDescription.shell.iconMenuShadowBg = element2.getAttribute("shadow_bg");
                    }
                } else if (nodeName.equals("unreadCount")) {
                    themeDescription.shell.unreadCountBg = element2.getAttribute("bg");
                } else if (nodeName.equals("appAdder")) {
                    themeDescription.shell.appAdderBg = element2.getAttribute("bg");
                } else if (nodeName.equals("dock")) {
                    if (getParserState(i, 65)) {
                        if (themeDescription.dock == null) {
                            themeDescription.dock = new ThemeDockDescription(this.mContext);
                            themeDescription.dock.isSecondParserMode = themeDescription.isSecondParserMode;
                        }
                        themeDescription.dock.dockBar = element2.getAttribute("bar");
                        themeDescription.dock.dockDesktopSelectorButtonOn = element2.getAttribute("desktopSelectorButtonOn");
                        themeDescription.dock.dockDesktopSelectorButtonOff = element2.getAttribute("desktopSelectorButtonOff");
                        themeDescription.dock.dockMenuButtonOn = element2.getAttribute("menuButtonOn");
                        themeDescription.dock.dockMenuButtonOff = element2.getAttribute("menuButtonOff");
                        themeDescription.dock.dockMenuPoint = element2.getAttribute("menuPoint");
                        themeDescription.dock.dockTrashcanCloseButton = element2.getAttribute("trashcanCloseButton");
                        themeDescription.dock.dockTrashcanOpenButton = element2.getAttribute("trashcanOpenButton");
                        themeDescription.dock.dockDesktopSelectorButtonPoint = element2.getAttribute("desktopSelectorButtonPoint");
                        themeDescription.dock.dockTrashcanButtonPoint = element2.getAttribute("trashcanButtonPoint");
                        themeDescription.dock.dockDesktopSelectorButtonPointOffsetX = parseInteger(element2.getAttribute("desktopSelectorButtonPointOffsetX"), 0);
                        themeDescription.dock.dockDesktopSelectorButtonPointOffsetY = parseInteger(element2.getAttribute("desktopSelectorButtonPointOffsetY"), 0);
                        themeDescription.dock.dockTrashcanButtonPointOffsetX = parseInteger(element2.getAttribute("trashcanButtonPointOffsetX"), 0);
                        themeDescription.dock.dockTrashcanButtonPointOffsetY = parseInteger(element2.getAttribute("trashcanButtonPointOffsetY"), 0);
                        float f = com.censivn.C3DEngine.a.b;
                        themeDescription.dock.dockItemStartMargin = parseInteger(element2.getAttribute("itemStartMargin"), 0) * f;
                        themeDescription.dock.dockItemEndMargin = parseInteger(element2.getAttribute("itemEndMargin"), 0) * f;
                        themeDescription.dock.dockOnFocusItemStartMargin = parseInteger(element2.getAttribute("itemOnFocusStartMargin"), 0) * f;
                        themeDescription.dock.dockOnFocusItemEndMargin = parseInteger(element2.getAttribute("itemOnFocusEndMargin"), 0) * f;
                        themeDescription.dock.dockBottomMargin = parseInteger(element2.getAttribute("bottomMargin"), 0) * f;
                        themeDescription.dock.dockTopMargin = parseInteger(element2.getAttribute("topMargin"), 0) * f;
                        themeDescription.dock.dockLeftMargin = parseInteger(element2.getAttribute("leftMargin"), 0) * f;
                        themeDescription.dock.dockRightMargin = f * parseInteger(element2.getAttribute("rightMargin"), 0);
                        themeDescription.dock.dockScrollModeBg = element2.getAttribute("scrollingModeBg");
                    }
                } else if (nodeName.equals("OptionMenu") && getParserState(i, TYPE_OPTION_MENU)) {
                    themeDescription.optionMenu = new ThemeOptionMenuDescription(this.mContext);
                    themeDescription.optionMenu.isSecondParserMode = themeDescription.isSecondParserMode;
                    themeDescription.optionMenu.optionMenuBg = element2.getAttribute("bg");
                    themeDescription.optionMenu.optionMenuSecondBg = element2.getAttribute("secondBg");
                    themeDescription.optionMenu.optionMenuItemBg = element2.getAttribute("itemBg");
                    themeDescription.optionMenu.optionMenuSecondItemBg = element2.getAttribute("secondItemBg");
                    themeDescription.optionMenu.optionMenuLabelBg = element2.getAttribute("labelBg");
                    themeDescription.optionMenu.optionMenuAdd = element2.getAttribute("addButton");
                    themeDescription.optionMenu.optionMenuAddApp = element2.getAttribute("addAppButton");
                    themeDescription.optionMenu.optionMenuAddTSFWidget = element2.getAttribute("addTSFWidgetButton");
                    themeDescription.optionMenu.optionMenuAddAndroidWidget = element2.getAttribute("addAndroidWidgetButton");
                    themeDescription.optionMenu.optionMenuAddShortcut = element2.getAttribute("addShortcutButton");
                    themeDescription.optionMenu.optionMenuAddFolder = element2.getAttribute("addFolderButton");
                    themeDescription.optionMenu.optionMenuAddTSFShortcut = element2.getAttribute("addTSFShortcutButton");
                    themeDescription.optionMenu.optionMenuTool = element2.getAttribute("toolButton");
                    themeDescription.optionMenu.optionMenuToolLasso = element2.getAttribute("toolLassoButton");
                    themeDescription.optionMenu.optionMenuToolMutilChoice = element2.getAttribute("toolMutilChoiceButton");
                    themeDescription.optionMenu.optionMenuToolDesktopEditor = element2.getAttribute("toolDesktopEditorButton");
                    themeDescription.optionMenu.optionMenuTSF = element2.getAttribute("tsfButton");
                    themeDescription.optionMenu.optionMenuWallpaper = element2.getAttribute("wallpaperButton");
                    themeDescription.optionMenu.optionMenuFavorite = element2.getAttribute("favoriteButton");
                    themeDescription.optionMenu.optionMenuFavoriteAdd = element2.getAttribute("favoriteAddButton");
                    themeDescription.optionMenu.optionMenuFavoriteDelete = element2.getAttribute("favoriteDeleteButton");
                    themeDescription.optionMenu.optionMenuFavoriteReturn = element2.getAttribute("favoriteReturnButton");
                    themeDescription.optionMenu.optionMenuButtonStandardColor = parseColor(element2.getAttribute("buttonStandardColor"), 0);
                    themeDescription.optionMenu.optionMenuLabelTextColor = parseColor(element2.getAttribute("labelTextColor"), themeDescription.optionMenu.optionMenuButtonStandardColor);
                }
            }
        }
    }

    private void parseWidget(Element element, int i, ThemeDescription themeDescription) {
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        if (length > 0) {
            themeDescription.widget = new ThemeWidgetDescription();
        }
        for (int i2 = 0; i2 < length; i2++) {
            Node item = childNodes.item(i2);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                String attribute = element2.getAttribute("type");
                if (attribute.equals("widget_system_folder")) {
                    if (getParserState(i, 8)) {
                        parseFolderWidget(element2, themeDescription);
                    }
                } else if (attribute.equals("widget_system_contact") && getParserState(i, 16)) {
                    parseContactWidget(element2, themeDescription);
                }
            }
        }
    }

    private void parseContactWidget(Element element, ThemeDescription themeDescription) {
        SystemContactTheme systemContactTheme = new SystemContactTheme(this.mContext);
        systemContactTheme.isSecondParserMode = themeDescription.isSecondParserMode;
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                String nodeName = element2.getNodeName();
                if (nodeName.equals("icon")) {
                    systemContactTheme.icon = element2.getAttribute("image");
                } else if (nodeName.equals("backPlane")) {
                    systemContactTheme.backPlane = element2.getAttribute("image");
                    systemContactTheme.backPlaneX = parseInteger(element2.getAttribute("x"), 0);
                    systemContactTheme.backPlaneY = parseInteger(element2.getAttribute("y"), 0);
                } else if (nodeName.equals("photoPlane")) {
                    systemContactTheme.photoPlaneWidth = parseInteger(element2.getAttribute("width"), 0);
                    systemContactTheme.photoPlaneHeight = parseInteger(element2.getAttribute("height"), 0);
                    systemContactTheme.photoPlaneX = parseInteger(element2.getAttribute("x"), 0);
                    systemContactTheme.photoPlaneY = parseInteger(element2.getAttribute("y"), 0);
                } else if (nodeName.equals("frontPlane")) {
                    systemContactTheme.frontPlane = element2.getAttribute("image");
                    systemContactTheme.frontPlaneX = parseInteger(element2.getAttribute("x"), 0);
                    systemContactTheme.frontPlaneY = parseInteger(element2.getAttribute("y"), 0);
                }
            }
        }
        if (systemContactTheme.check()) {
            themeDescription.widget.contact = systemContactTheme;
        } else if (ThemeManager.getInstance() != null) {
            themeDescription.widget.contact = ThemeManager.getInstance().getSystemThemeDescription().widget.contact;
        }
    }

    private void parseFolderWidget(Element element, ThemeDescription themeDescription) {
        SystemFolderTheme systemFolderTheme = new SystemFolderTheme(this.mContext);
        systemFolderTheme.isSecondParserMode = themeDescription.isSecondParserMode;
        systemFolderTheme.supportHD = element.getAttribute("supportHD").equals("true");
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                String nodeName = element2.getNodeName();
                if (nodeName.equals("icon")) {
                    systemFolderTheme.icon = element2.getAttribute("image");
                } else if (nodeName.equals("frame")) {
                    systemFolderTheme.frame = element2.getAttribute("image");
                } else if (nodeName.equals("scrolling")) {
                    systemFolderTheme.scrollingPoint = element2.getAttribute("point");
                } else if (nodeName.equals("addButton")) {
                    float f = systemFolderTheme.supportHD ? com.censivn.C3DEngine.a.b : com.censivn.C3DEngine.a.a;
                    systemFolderTheme.addButton = element2.getAttribute("image");
                    systemFolderTheme.addButtonOffsetY = (int) (parseInteger(element2.getAttribute("offsetY"), 9) * f);
                } else if (nodeName.equals("order")) {
                    parseFolderOrder(systemFolderTheme, element2);
                } else if (nodeName.equals("child")) {
                    parseFolderChild(systemFolderTheme, element2);
                } else if (nodeName.equals("border")) {
                    float f2 = systemFolderTheme.supportHD ? com.censivn.C3DEngine.a.b : com.censivn.C3DEngine.a.a;
                    systemFolderTheme.borderTop = (int) (parseInteger(element2.getAttribute("top"), 0) * f2);
                    systemFolderTheme.borderBottom = (int) (parseInteger(element2.getAttribute("bottom"), 0) * f2);
                    systemFolderTheme.borderRight = (int) (parseInteger(element2.getAttribute("right"), 0) * f2);
                    systemFolderTheme.borderLeft = (int) (parseInteger(element2.getAttribute("left"), 0) * f2);
                } else if (nodeName.equals("dockParam")) {
                    float f3 = systemFolderTheme.supportHD ? com.censivn.C3DEngine.a.b : com.censivn.C3DEngine.a.a;
                    systemFolderTheme.followRotation = parseBoolean(element2.getAttribute("followRotation"), false);
                    systemFolderTheme.dockBottomOffset = parseInteger(element2.getAttribute("bottomModeOffset"), 0) * f3;
                    systemFolderTheme.dockTopOffset = parseInteger(element2.getAttribute("topModeOffset"), 0) * f3;
                    systemFolderTheme.dockLefOffset = parseInteger(element2.getAttribute("leftModeOffset"), 0) * f3;
                    systemFolderTheme.dockRightOffset = parseInteger(element2.getAttribute("rightModeOffset"), 0) * f3;
                }
            }
        }
        if (systemFolderTheme.check()) {
            themeDescription.widget.folder = systemFolderTheme;
        } else if (ThemeManager.getInstance() != null) {
            themeDescription.widget.folder = ThemeManager.getInstance().getSystemThemeDescription().widget.folder;
        }
    }

    private void parseFolderOrder(SystemFolderTheme systemFolderTheme, Element element) {
        NodeList childNodes = element.getChildNodes();
        float f = systemFolderTheme.supportHD ? com.censivn.C3DEngine.a.b : com.censivn.C3DEngine.a.a;
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                String nodeName = element2.getNodeName();
                if (nodeName.equals("textPlane")) {
                    systemFolderTheme.textPlane = element2.getAttribute("image");
                    systemFolderTheme.textPlaneX = (int) (parseInteger(element2.getAttribute("x"), 0) * f);
                    systemFolderTheme.textPlaneY = (int) (parseInteger(element2.getAttribute("y"), 0) * f);
                    systemFolderTheme.textPlaneWidth = getFixValue((int) (parseInteger(element2.getAttribute("width"), 128) * f));
                    systemFolderTheme.textPlaneHeight = getFixValue((int) (parseInteger(element2.getAttribute("height"), 32) * f));
                    systemFolderTheme.textWidth = parseInteger(element2.getAttribute("width"), 128);
                    systemFolderTheme.textHeight = parseInteger(element2.getAttribute("height"), 32);
                    systemFolderTheme.nameTextFormat.color = parseColor(element2.getAttribute("textColor"), -1);
                    systemFolderTheme.nameTextFormat.x = parseInteger(element2.getAttribute("textX"), 0);
                    systemFolderTheme.nameTextFormat.y = parseInteger(element2.getAttribute("textY"), 0);
                    systemFolderTheme.nameTextFormat.size = parseInteger(element2.getAttribute("textSize"), 16);
                    systemFolderTheme.nameTextFormat.width = parseInteger(element2.getAttribute("textWidth"), systemFolderTheme.textWidth);
                    systemFolderTheme.nameTextFormat.auto = false;
                    systemFolderTheme.order.add(0);
                } else if (nodeName.equals("frontPlane")) {
                    systemFolderTheme.frontPlane = element2.getAttribute("image");
                    systemFolderTheme.frontPlaneX = (int) (parseInteger(element2.getAttribute("x"), 0) * f);
                    systemFolderTheme.frontPlaneY = (int) (parseInteger(element2.getAttribute("y"), 0) * f);
                    systemFolderTheme.frontPlaneEnable = true;
                    systemFolderTheme.order.add(1);
                } else if (nodeName.equals("backPlane")) {
                    systemFolderTheme.backPlane = element2.getAttribute("image");
                    systemFolderTheme.backPlaneX = (int) (parseInteger(element2.getAttribute("x"), 0) * f);
                    systemFolderTheme.backPlaneY = (int) (parseInteger(element2.getAttribute("y"), 0) * f);
                    systemFolderTheme.backPlaneEnable = true;
                    systemFolderTheme.order.add(2);
                } else if (nodeName.equals("childContainer")) {
                    systemFolderTheme.childContainerX = (int) (parseInteger(element2.getAttribute("x"), 0) * f);
                    systemFolderTheme.childContainerY = (int) (parseInteger(element2.getAttribute("y"), 0) * f);
                    systemFolderTheme.order.add(3);
                } else if (nodeName.equals("sizePlane")) {
                    systemFolderTheme.sizePlane = element2.getAttribute("image");
                    systemFolderTheme.sizePlaneX = (int) (parseInteger(element2.getAttribute("x"), 0) * f);
                    systemFolderTheme.sizePlaneY = (int) (parseInteger(element2.getAttribute("y"), 0) * f);
                    systemFolderTheme.sizePlaneWidth = getFixValue((int) (parseInteger(element2.getAttribute("width"), 128) * f));
                    systemFolderTheme.sizePlaneHeight = getFixValue((int) (parseInteger(element2.getAttribute("height"), 32) * f));
                    systemFolderTheme.sizeTextWidth = parseInteger(element2.getAttribute("width"), 128);
                    systemFolderTheme.sizeTextHeight = parseInteger(element2.getAttribute("height"), 32);
                    systemFolderTheme.sizeTextFormat.colorFull = parseColor(element2.getAttribute("textColorFull"), -1);
                    systemFolderTheme.sizeTextFormat.color = parseColor(element2.getAttribute("textColor"), -1);
                    systemFolderTheme.sizeTextFormat.width = parseInteger(element2.getAttribute("textWidth"), 0);
                    systemFolderTheme.sizeTextFormat.x = parseInteger(element2.getAttribute("textX"), 0);
                    systemFolderTheme.sizeTextFormat.y = parseInteger(element2.getAttribute("textY"), 0);
                    systemFolderTheme.sizeTextFormat.size = parseInteger(element2.getAttribute("textSize"), 16);
                    systemFolderTheme.sizePlaneEnable = true;
                    systemFolderTheme.order.add(4);
                }
            }
        }
        if (systemFolderTheme.nameTextFormat.auto) {
            systemFolderTheme.textPlane = "";
            systemFolderTheme.textPlaneX = 0;
            systemFolderTheme.textPlaneY = (int) ((-52.0f) * com.censivn.C3DEngine.a.b);
            systemFolderTheme.textPlaneWidth = ap.J;
            systemFolderTheme.textPlaneHeight = ap.K + 2;
            systemFolderTheme.textWidth = ap.C;
            systemFolderTheme.textHeight = ap.D + 2;
            systemFolderTheme.order.add(1, 0);
        }
        systemFolderTheme.sampleCount = systemFolderTheme.sampleList.size();
    }

    private int getFixValue(int i) {
        return (i % 2) + i;
    }

    private void parseFolderChild(SystemFolderTheme systemFolderTheme, Element element) {
        float f = systemFolderTheme.supportHD ? com.censivn.C3DEngine.a.b : com.censivn.C3DEngine.a.a;
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                systemFolderTheme.addChildInformation(Float.parseFloat(element2.getAttribute("x")) * f, Float.parseFloat(element2.getAttribute("y")) * f, Float.parseFloat(element2.getAttribute("z")) * f, Float.parseFloat(element2.getAttribute("rx")), Float.parseFloat(element2.getAttribute("ry")), Float.parseFloat(element2.getAttribute("rz")), Float.parseFloat(element2.getAttribute("sx")), Float.parseFloat(element2.getAttribute("sy")), Float.parseFloat(element2.getAttribute("sz")));
            }
        }
        systemFolderTheme.sampleCount = systemFolderTheme.sampleList.size();
    }

    public ThemeDescription getThemeDescription() {
        return this.resultThemeDescription;
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
