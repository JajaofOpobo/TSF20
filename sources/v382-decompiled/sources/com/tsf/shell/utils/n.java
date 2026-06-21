package com.tsf.shell.utils;

import com.flurry.android.FlurryAgent;
import java.util.Map;

/* loaded from: classes.dex */
public class n {
    public static void a(String str, Map map) {
        FlurryAgent.logEvent(str, map);
    }
}
