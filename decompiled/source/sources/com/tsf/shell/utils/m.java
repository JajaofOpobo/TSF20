package com.tsf.shell.utils;

import com.flurry.android.FlurryAgent;
import java.util.Map;
/* loaded from: classes.dex */
public class m {
    public static void a(String str, Map<String, String> map) {
        FlurryAgent.logEvent(str, map);
    }
}
