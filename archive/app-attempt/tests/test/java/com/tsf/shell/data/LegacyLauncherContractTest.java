package com.tsf.shell.data;

import com.tsf.shell.data.local.entity.FavoriteItem;
import org.junit.Test;
import static org.junit.Assert.*;

public class LegacyLauncherContractTest {

    @Test
    public void databaseVersion_is34() {
        assertEquals(34, LegacyLauncherContract.DATABASE_VERSION);
    }

    @Test
    public void favorites_entityTypes_defined() {
        assertEquals(FavoriteItem.TYPE_APPLICATION, 0);
        assertEquals(FavoriteItem.TYPE_FOLDER, 1);
        assertEquals(FavoriteItem.TYPE_WIDGET, 2);
        assertEquals(FavoriteItem.TYPE_SHORTCUT, 4);
    }

    @Test
    public void tableNames_notEmpty() {
        assertFalse(LegacyLauncherContract.TABLE_FAVORITES.isEmpty());
        assertFalse(LegacyLauncherContract.TABLE_APPLICATION.isEmpty());
        assertFalse(LegacyLauncherContract.TABLE_DOCK.isEmpty());
    }
}