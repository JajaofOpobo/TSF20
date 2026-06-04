package com.flurry.android;

import java.io.File;

/* loaded from: classes.dex */
final class bo {
    private static String a = "FlurryAgent";

    static boolean a(File file) {
        if (file == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        if (!parentFile.mkdirs() && !parentFile.exists()) {
            Cdo.b(a, "Unable to create persistent dir: " + parentFile);
            return false;
        }
        return true;
    }
}
