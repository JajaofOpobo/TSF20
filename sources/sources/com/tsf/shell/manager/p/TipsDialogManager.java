package com.tsf.shell.manager.p;

import android.content.Intent;
import com.censivn.C3DEngine.b.c.ActivityResultBridge;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.activity.tips.TipsDialogActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TipsDialogManager implements com.censivn.C3DEngine.b.c.ActivityResultBridge.InterfaceC0025a {
    public static TipsDialogManager a;
    public static a b;
    private static ArrayList<PreferenceToggle> c;
    private static ArrayList<Integer> d;
    private static boolean e = false;
    private static int f;
    private static int g;

    public static void a() {
        if (c == null) {
            a = new TipsDialogManager();
            b = new ThemeTransitionAnimator();
            c = new ArrayList<>();
            d = new ArrayList<>();
            TipsDialogManager.add(new PreferenceToggle(1, true));
            TipsDialogManager.add(new PreferenceToggle(2, true));
            TipsDialogManager.add(new PreferenceToggle(5, true));
            TipsDialogManager.add(new PreferenceToggle(12, true));
            TipsDialogManager.add(new PreferenceToggle(13, true));
            TipsDialogManager.add(new PreferenceToggle(14, true));
            TipsDialogManager.add(new PreferenceToggle(6, true));
            for (String str : com.tsf.shell.manager.b.ConfigManager.p().split("/")) {
                try {
                    String[] strArrSplit = str.split(",");
                    a(Integer.parseInt(strArrSplit[0]), strArrSplit[1].equals("1"), false);
                } catch (Exception e2) {
                }
            }
        }
        TipsDialogManager();
    }

    @Override // com.censivn.C3DEngine.b.c.ActivityResultBridge.InterfaceC0025a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1 || i == f) {
        }
        a(g, false);
        e = false;
        if (!ThemePreferenceStore.isEmpty()) {
            a(ThemePreferenceStore.remove(0).intValue());
        }
    }

    public static void a(int i) {
        a(i, 0);
    }

    public static void a(final int i, int i2) {
        if (Home.b().d() && b(i) && i != -1) {
            if (e) {
                if (!ThemePreferenceStore.contains(Integer.valueOf(i))) {
                    ThemePreferenceStore.add(Integer.valueOf(i));
                    return;
                }
                return;
            }
            e = true;
            g = i;
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.p.TipsDialogManager.1
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent = new Intent();
                    intent.setClass(com.censivn.C3DEngine.C3DEngine.d(), TipsDialogActivity.class);
                    intent.putExtra("type", i);
                    int unused = TipsDialogManager.f = Home.b().a(intent, TipsDialogManager.a, b.a.app_alpha_enter, b.a.app_alpha_exit);
                }
            };
            if (i2 == 0) {
                com.censivn.C3DEngine.C3DEngine.a().a(runnable);
            } else {
                com.censivn.C3DEngine.C3DEngine.a().a(runnable, i2);
            }
        }
    }

    public static void b() {
        int size = TipsDialogManager.size();
        int i = 0;
        String str = "";
        while (i < size) {
            PreferenceToggle fVar = TipsDialogManager.get(i);
            String str2 = str + fVar.a + "," + (fVar.b ? "1" : "0");
            if (i != size - 1) {
                str2 = str2 + "/";
            }
            i++;
            str = str2;
        }
        com.tsf.shell.manager.b.ConfigManager.c(str);
    }

    public static void a(int i, boolean z) {
        a(i, z, true);
    }

    public static void c() {
    }

    public static void a(int i, boolean z, boolean z2) {
        int size = TipsDialogManager.size();
        for (int i2 = 0; i2 < size; i2++) {
            PreferenceToggle fVar = TipsDialogManager.get(i2);
            if (fVar.a == i) {
                fVar.b = z;
                if (z2) {
                    TipsDialogManager();
                    return;
                }
                return;
            }
        }
    }

    public static boolean b(int i) {
        int size = TipsDialogManager.size();
        for (int i2 = 0; i2 < size; i2++) {
            PreferenceToggle fVar = TipsDialogManager.get(i2);
            if (fVar.a == i) {
                return fVar.b;
            }
        }
        return false;
    }
}
