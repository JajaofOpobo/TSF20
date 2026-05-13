package com.tsf.shell.data;

/**
 * Constants copied from the legacy TSF Shell provider schema. These names are
 * the stable bridge for importing old layouts into the modern data layer.
 */
public final class LegacyLauncherContract {
    public static final int DATABASE_VERSION = 34;
    public static final String DATABASE_NAME = "TSFLauncher-database.db";

    public static final String TABLE_FAVORITES = "favorites";
    public static final String TABLE_APPLICATION = "application";
    public static final String TABLE_DOCK = "dock";
    public static final String TABLE_SLIDING_DOCK = "slidingdock";
    public static final String TABLE_MENU = "menu";
    public static final String TABLE_QUICK_LAUNCH = "quicklaunch";

    private LegacyLauncherContract() {
    }

    public static final class Favorites {
        public static final String ID = "_id";
        public static final String TITLE = "title";
        public static final String INTENT = "intent";
        public static final String CONTAINER = "container";
        public static final String SCREEN = "screen";
        public static final String CELL_X = "cellX";
        public static final String CELL_Y = "cellY";
        public static final String ROTATION = "rotation";
        public static final String SPAN_X = "spanX";
        public static final String SPAN_Y = "spanY";
        public static final String SCALE = "scale";
        public static final String ITEM_TYPE = "itemType";
        public static final String APP_WIDGET_ID = "appWidgetId";
        public static final String ICON_TYPE = "iconType";
        public static final String ICON_PACKAGE = "iconPackage";
        public static final String ICON_RESOURCE = "iconResource";
        public static final String ICON = "icon";
        public static final String TITLE_TYPE = "titleType";
        public static final String CONFIG = "config";
        public static final String PACKAGE_NAME = "packagename";
        public static final String CLASS_NAME = "classname";
        public static final String INTERNAL = "internal";
        public static final String APP_WIDGET_PROVIDER = "appWidgetProvider";

        private Favorites() {
        }
    }

    public static final class Application {
        public static final String ID = "_id";
        public static final String INDEX = "mindex";
        public static final String TITLE = "title";
        public static final String CLICK_COUNT = "clickcnt";
        public static final String IS_HIDDEN = "ishide";
        public static final String INTENT = "intent";
        public static final String CONTAINER = "container";
        public static final String ITEM_TYPE = "itemType";
        public static final String ICON_TYPE = "iconType";
        public static final String ICON_PACKAGE = "iconPackage";
        public static final String ICON_RESOURCE = "iconResource";
        public static final String ICON = "icon";
        public static final String TITLE_TYPE = "titleType";
        public static final String CONFIG = "config";
        public static final String VERSION_CODE = "vercode";
        public static final String VERSION_NAME = "vername";

        private Application() {
        }
    }
}
