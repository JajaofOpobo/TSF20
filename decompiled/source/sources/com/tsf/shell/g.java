package com.tsf.shell;

import android.net.Uri;
import android.provider.BaseColumns;
/* loaded from: classes.dex */
public class g {

    /* loaded from: classes.dex */
    public interface c extends BaseColumns {
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/dock?notify=false");
    }

    /* loaded from: classes.dex */
    public static final class f {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/quicklaunch?notify=false");
    }

    /* renamed from: com.tsf.shell.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0121g {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/menu?notify=false");
    }

    /* loaded from: classes.dex */
    public static final class h {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/slidingdock?notify=false");
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/action?notify=false");

        public static Uri a(long j) {
            return Uri.parse("content://" + ShellProvider.a + "/action/" + j + "?notify=false");
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/application?notify=false");

        public static Uri a(long j, boolean z) {
            return Uri.parse("content://" + ShellProvider.a + "/application/" + j + "?notify=" + z);
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements c {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/favorites?notify=false");

        public static Uri a(long j, boolean z) {
            return Uri.parse("content://" + ShellProvider.a + "/favorites/" + j + "?notify=" + z);
        }
    }
}
