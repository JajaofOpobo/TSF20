package com.tsf.shell.data;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public final class LegacyLauncherContractTest {
    @Test
    public void legacyDatabaseIdentityMatchesRecoveredProvider() {
        assertEquals("TSFLauncher-database.db", LegacyLauncherContract.DATABASE_NAME);
        assertEquals(34, LegacyLauncherContract.DATABASE_VERSION);
    }

    @Test
    public void legacyLayoutTablesMatchRecoveredProvider() {
        assertEquals("favorites", LegacyLauncherContract.TABLE_FAVORITES);
        assertEquals("application", LegacyLauncherContract.TABLE_APPLICATION);
        assertEquals("dock", LegacyLauncherContract.TABLE_DOCK);
        assertEquals("slidingdock", LegacyLauncherContract.TABLE_SLIDING_DOCK);
        assertEquals("menu", LegacyLauncherContract.TABLE_MENU);
        assertEquals("quicklaunch", LegacyLauncherContract.TABLE_QUICK_LAUNCH);
    }

    @Test
    public void favoriteColumnsCoverWidgetAnd3dPlacementState() {
        assertEquals("rotation", LegacyLauncherContract.Favorites.ROTATION);
        assertEquals("scale", LegacyLauncherContract.Favorites.SCALE);
        assertEquals("appWidgetProvider", LegacyLauncherContract.Favorites.APP_WIDGET_PROVIDER);
    }
}
