package com.tsf.shell.settings;

import android.content.Context;
import org.junit.Test;
import static org.junit.Assert.*;

public class LauncherPreferencesTest {

    @Test
    public void actionConstants_defined() {
        assertEquals(0, LauncherPreferences.ACTION_NONE);
        assertEquals(1, LauncherPreferences.ACTION_HOME);
        assertEquals(2, LauncherPreferences.ACTION_BACK);
    }

    @Test
    public void availableActions_hasExpectedLength() {
        int[] actions = LauncherPreferences.getAvailableActions();
        assertTrue(actions.length >= 9);
    }
}