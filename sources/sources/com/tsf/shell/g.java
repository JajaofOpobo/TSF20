package com.tsf.shell;

import android.net.Uri;
import android.provider.BaseColumns;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g {

    public interface c extends BaseColumns {
    }

    public static final class d {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/dock?notify=false");
    }

    public static final class f {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/quicklaunch?notify=false");
    }

    /* JADX INFO: renamed from: com.tsf.shell.g$g, reason: collision with other inner class name */
    public static final class C0121g {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/menu?notify=false");
    }

    public static final class h {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/slidingdock?notify=false");
    }

    public static final class a {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/action?notify=false");

        public static Uri a(long j) {
            return Uri.parse("content://" + ShellProvider.a + "/action/" + j + "?notify=false");
        }
    }

    public static final class b implements c {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/application?notify=false");

        public static Uri a(long j, boolean z) {
            return Uri.parse("content://" + ShellProvider.a + "/application/" + j + "?notify=" + z);
        }
    }

    public static final class e implements c {
        public static final Uri a = Uri.parse("content://" + ShellProvider.a + "/favorites?notify=false");

        public static Uri a(long j, boolean z) {
            return Uri.parse("content://" + ShellProvider.a + "/favorites/" + j + "?notify=" + z);
        }
    }
}
