package com.tsf.shell.theme.inside.element;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeElementType {
    public static final int PARSER_CONFIG_ALL = 16777215;
    public static final int TYPE_ACTION = 524289;
    public static final int TYPE_APP_MUTIL_CHOICE = 131073;
    public static final int TYPE_ARRANGE = 16385;
    public static final int TYPE_CLOCK = 4;
    public static final int TYPE_CONTACT = 16;
    public static final int TYPE_DESKTOP = 257;
    public static final int TYPE_DESKTOP_EFFECT = 513;
    public static final int TYPE_FOLDER = 8;
    public static final int TYPE_ICON = 2;
    public static final int TYPE_ICON_MENU = 2049;
    public static final int TYPE_LASSO = 8193;
    public static final int TYPE_SHELL = 1;
    public static final int TYPE_SHELL_OTHER = 33;
    public static final int TYPE_SMART_BUTTON = 1025;
    public static final int TYPE_UNREAD_COUNT = 32769;
    public static final int TYPE_WALLPAPER = 2097152;
    public static final int TYPE_WIDGET_RESIZE = 4097;

    public static boolean getParserState(int i, int i2) {
        return (i & i2) == i2;
    }
}
