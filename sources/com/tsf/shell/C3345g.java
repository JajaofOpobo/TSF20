package com.tsf.shell;

import android.net.Uri;
import android.provider.BaseColumns;
/* renamed from: com.tsf.shell.g */
/* loaded from: classes.dex */
public class C3345g {

    /* renamed from: com.tsf.shell.g$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3348c extends BaseColumns {
    }

    /* renamed from: com.tsf.shell.g$d */
    /* loaded from: classes.dex */
    public static final class C3349d {

        /* renamed from: a */
        public static final Uri f11068a = Uri.parse("content://" + ShellProvider.f7174a + "/dock?notify=false");
    }

    /* renamed from: com.tsf.shell.g$f */
    /* loaded from: classes.dex */
    public static final class C3351f {

        /* renamed from: a */
        public static final Uri f11070a = Uri.parse("content://" + ShellProvider.f7174a + "/quicklaunch?notify=false");
    }

    /* renamed from: com.tsf.shell.g$g */
    /* loaded from: classes.dex */
    public static final class C3352g {

        /* renamed from: a */
        public static final Uri f11071a = Uri.parse("content://" + ShellProvider.f7174a + "/menu?notify=false");
    }

    /* renamed from: com.tsf.shell.g$h */
    /* loaded from: classes.dex */
    public static final class C3353h {

        /* renamed from: a */
        public static final Uri f11072a = Uri.parse("content://" + ShellProvider.f7174a + "/slidingdock?notify=false");
    }

    /* renamed from: com.tsf.shell.g$a */
    /* loaded from: classes.dex */
    public static final class C3346a {

        /* renamed from: a */
        public static final Uri f11066a = Uri.parse("content://" + ShellProvider.f7174a + "/action?notify=false");

        /* renamed from: a */
        public static Uri m2783a(long j) {
            return Uri.parse("content://" + ShellProvider.f7174a + "/action/" + j + "?notify=false");
        }
    }

    /* renamed from: com.tsf.shell.g$b */
    /* loaded from: classes.dex */
    public static final class C3347b implements InterfaceC3348c {

        /* renamed from: a */
        public static final Uri f11067a = Uri.parse("content://" + ShellProvider.f7174a + "/application?notify=false");

        /* renamed from: a */
        public static Uri m2782a(long j, boolean z) {
            return Uri.parse("content://" + ShellProvider.f7174a + "/application/" + j + "?notify=" + z);
        }
    }

    /* renamed from: com.tsf.shell.g$e */
    /* loaded from: classes.dex */
    public static final class C3350e implements InterfaceC3348c {

        /* renamed from: a */
        public static final Uri f11069a = Uri.parse("content://" + ShellProvider.f7174a + "/favorites?notify=false");

        /* renamed from: a */
        public static Uri m2781a(long j, boolean z) {
            return Uri.parse("content://" + ShellProvider.f7174a + "/favorites/" + j + "?notify=" + z);
        }
    }
}
