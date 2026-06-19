package com.tsf.shell._a.a;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.Toast;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell._a.a.ShellPageManagerV2;
import com.tsf.shell._a.a.ShellThemeEngineV2;
import com.tsf.shell._a.a.ShellLayoutEngineV2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ShellContentManagerV2 {
    public static LinkedHashMap<Integer, com.tsf.shell._a.a.ShellPageManagerV2> a = new LinkedHashMap<>();
    private com.tsf.shell._a.a.ShellThemeEngineV2 b;
    private com.tsf.shell._a.a.ShellThemeEngineV2 c;
    private Activity f;
    private boolean m;
    private int n;
    private ArrayList<ShellLayoutEngineV2.b> d = new ArrayList<>();
    private String[] e = null;
    private c g = ShellThemeEngineV2.SHOW_WHEN_REJECT;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private String k = "";
    private C0074a l = new C0074a();

    public enum b {
        DEFAULT,
        SHOW,
        NOT_SHOW
    }

    public enum c {
        SHOW_WHEN_REJECT_WITH_NMA,
        SHOW_WHEN_REJECT,
        SHOW_NOTHING
    }

    public ShellContentManagerV2(Activity activity) {
        this.f = activity;
    }

    static {
        ShellPageManagerV2.a aVar = new ShellPageManagerV2.a();
        aVar.c(a.C0020a.perms_calender_contact_audio_bg).b(a.e.perm_calender_contact_record_desc).d(3).a(a.e.calendar_text);
        a.put(76, aVar.a());
        ShellPageManagerV2.a aVar2 = new ShellPageManagerV2.a();
        aVar2.c(a.C0020a.perms_calender_contact_audio_bg).b(a.e.perm_calender_contact_record_desc).d(2).a(a.e.calendar_text);
        a.put(68, aVar2.a());
        ShellPageManagerV2.a aVar3 = new ShellPageManagerV2.a();
        aVar3.c(a.C0020a.perms_calender_contact_audio_bg).b(a.e.perm_calender_contact_record_desc).d(2).a(a.e.calendar_text);
        a.put(12, aVar3.a());
        ShellPageManagerV2.a aVar4 = new ShellPageManagerV2.a();
        aVar4.c(a.C0020a.perms_calender_contact_audio_bg).b(a.e.perm_calender_contact_record_desc).d(2).a(a.e.calendar_text);
        a.put(72, aVar4.a());
        ShellPageManagerV2.a aVar5 = new ShellPageManagerV2.a();
        aVar5.c(a.C0020a.perms_phone_contacts_bg).b(a.e.perm_phone_contacts_desc).d(2).a(a.e.contacts_text);
        a.put(80, aVar5.a());
        ShellPageManagerV2.a aVar6 = new ShellPageManagerV2.a();
        aVar6.c(a.C0020a.perm_calender_bg).b(a.e.perm_calender_desc).a("1").a(a.e.calendar_text);
        a.put(4, aVar6.a());
        ShellPageManagerV2.a aVar7 = new ShellPageManagerV2.a();
        aVar7.c(a.C0020a.perm_camera_bg).b(a.e.perm_camera_desc).a("2").a(a.e.camera_title);
        a.put(32, aVar7.a());
        ShellPageManagerV2.a aVar8 = new ShellPageManagerV2.a();
        aVar8.c(a.C0020a.perm_contacts_bg).b(a.e.perm_contacts_desc).a("3").a(a.e.contacts_text);
        a.put(64, aVar8.a());
        ShellPageManagerV2.a aVar9 = new ShellPageManagerV2.a();
        aVar9.c(a.C0020a.perm_location_bg).b(a.e.perm_location_desc).a("4").a(a.e.location_text);
        a.put(2, aVar9.a());
        ShellPageManagerV2.a aVar10 = new ShellPageManagerV2.a();
        aVar10.c(a.C0020a.perm_audio_bg).b(a.e.perm_recoder_desc).a("5").a(a.e.audio_text);
        a.put(8, aVar10.a());
        ShellPageManagerV2.a aVar11 = new ShellPageManagerV2.a();
        aVar11.c(a.C0020a.perm_phone_bg).b(a.e.perm_phone_desc).a("6").a(a.e.phone_text);
        a.put(16, aVar11.a());
        ShellPageManagerV2.a aVar12 = new ShellPageManagerV2.a();
        aVar12.c(a.C0020a.perm_storage_bg).b(a.e.perm_storage_desc).a("7").a(a.e.storage_text);
        a.put(Integer.valueOf(ItemInfo.APP_INTENT), aVar12.a());
        ShellPageManagerV2.a aVar13 = new ShellPageManagerV2.a();
        aVar13.c(a.C0020a.perm_storage_bg).b(a.e.perm_wallpaper_desc).a("7").a(a.e.storage_text);
        a.put(Integer.valueOf(ItemInfo.APP_VERSION_CODE), aVar13.a());
    }

    public boolean a(ShellLayoutEngineV2.b bVar, boolean z, int i, String... strArr) {
        return a(bVar, z ? ShellThemeEngineV2.SHOW_WHEN_REJECT : ShellThemeEngineV2.SHOW_NOTHING, ShellPageManagerV2.DEFAULT, true, i, strArr);
    }

    public boolean a(ShellLayoutEngineV2.b bVar, c cVar, b bVar2, boolean z, int i, String... strArr) {
        if (!ShellLayoutEngineV2.a(this.f, strArr)) {
            if (bVar != null) {
                bVar.a(i, true, ShellLayoutEngineV2.a.AUTHORIZED);
            }
            return true;
        }
        if (this.m) {
            if (bVar == null) {
                return false;
            }
            if (this.n == i) {
                this.d.add(bVar);
                return false;
            }
            bVar.a(i, true, ShellLayoutEngineV2.a.SYSTEM_CANCEL_AUTH);
            return false;
        }
        this.m = true;
        this.n = i;
        List<String> listB = ShellLayoutEngineV2.b(this.f, strArr);
        com.tsf.shell._a.a.ShellPageManagerV2 bVarB = b(i, listB);
        boolean z2 = bVarB != null && bVarB.c() > 1;
        this.h = true;
        this.g = cVar;
        this.i = z;
        switch (bVar2) {
            case DEFAULT:
                break;
            case SHOW:
                z2 = true;
                break;
            case NOT_SHOW:
                z2 = false;
                break;
            default:
                z2 = false;
                break;
        }
        if (z2) {
            a(i, listB);
        } else {
            ShellLayoutEngineV2.a(this.f, i, strArr);
        }
        if (bVar == null) {
            return false;
        }
        this.d.add(bVar);
        return false;
    }

    public void a(int i, String[] strArr, int[] iArr) {
        boolean z;
        boolean z2 = true;
        this.m = false;
        this.n = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr[i2] == 0 && ShellLayoutEngineV2.c(this.f, str)) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        if (!TextUtils.isEmpty(f(i, arrayList))) {
        }
        if (!(arrayList2.size() == 0 && arrayList.size() > 0)) {
            ArrayList arrayList3 = new ArrayList();
            boolean z3 = false;
            for (String str2 : arrayList2) {
                if (android.support.v4.app.a.a(this.f, str2)) {
                    z = z3;
                } else {
                    arrayList3.add(str2);
                    z = true;
                }
                z3 = z;
            }
            if (!TextUtils.isEmpty(f(i, arrayList3))) {
            }
            ArrayList arrayList4 = new ArrayList(arrayList2);
            arrayList4.removeAll(arrayList3);
            if (!TextUtils.isEmpty(f(i, arrayList4))) {
            }
            if (arrayList2.size() > 0) {
                switch (this.g) {
                    case SHOW_WHEN_REJECT_WITH_NMA:
                        z2 = z3;
                        break;
                    case SHOW_WHEN_REJECT:
                        break;
                    case SHOW_NOTHING:
                        z2 = false;
                        break;
                    default:
                        z2 = false;
                        break;
                }
                if (z2 && this.h) {
                    if (this.f != null && !this.f.isFinishing()) {
                        a(i, arrayList2, strArr, z3);
                        return;
                    }
                    return;
                }
                a(i, false, ShellLayoutEngineV2.a.USER_REJECT_AUTH, (List<String>) arrayList2);
                return;
            }
            a(i, false, ShellLayoutEngineV2.a.SYSTEM_CANCEL_AUTH, (List<String>) arrayList2);
            return;
        }
        a(i, true, ShellLayoutEngineV2.a.USER_CLICK_AGREE_AUTH, (List<String>) null);
    }

    private void a(final int i, final List<String> list) {
        if (this.c != null && this.c.isShowing()) {
            this.c.dismiss();
        }
        this.c = new com.tsf.shell._a.a.ShellThemeEngineV2(this.f);
        com.tsf.shell._a.a.ShellPageManagerV2 bVarB = b(i, list);
        if (bVarB != null) {
            this.c.a(8);
            this.c.a(i, bVarB.a(), this.f.getString(bVarB.b()), new DialogInterface.OnClickListener() { // from class: com.tsf.shell._a.a.ShellContentManagerV2.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    if (i2 == -1) {
                        a.this.c.dismiss();
                        ShellLayoutEngineV2.a(a.this.f, i, (String[]) list.toArray(new String[list.size()]));
                    }
                }
            });
        }
    }

    private void a(final int i, final List<String> list, final String[] strArr, final boolean z) {
        if (this.b != null && this.b.isShowing()) {
            this.b.dismiss();
        }
        this.g = ShellThemeEngineV2.SHOW_NOTHING;
        this.b = new com.tsf.shell._a.a.ShellThemeEngineV2(this.f);
        this.b.setContentView(a.c.permission_guide_dialog_no_bg);
        if (b(i, list) != null) {
            String strE = e(i, list);
            this.k = f(i, list);
            a(this.f);
            this.b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tsf.shell._a.a.ShellContentManagerV2.2
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    a.this.b(a.this.f);
                }
            });
            this.b.a(new ShellThemeEngineV2.a() { // from class: com.tsf.shell._a.a.ShellContentManagerV2.3
                @Override // com.tsf.shell._a.a.ShellThemeEngineV2.a
                public boolean a(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                    if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() == 1) {
                    }
                    return true;
                }
            });
            this.b.a(i, strE, new DialogInterface.OnClickListener() { // from class: com.tsf.shell._a.a.ShellContentManagerV2.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    if (i2 == -1) {
                        a.this.b.dismiss();
                        if (z) {
                            com.tsf.shell._a.b.ShellGestureHandlerV2.a(a.this.f, i | 1);
                            a.this.e = strArr;
                            return;
                        }
                        ShellLayoutEngineV2.a(a.this.f, i, (String[]) list.toArray(new String[list.size()]));
                        return;
                    }
                    a.this.a(i, false, ShellLayoutEngineV2.a.USER_REJECT_AUTH, (List<String>) list);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z, ShellLayoutEngineV2.a aVar, List<String> list) {
        if (!z && list != null && list.size() > 0 && this.i) {
            Toast.makeText(this.f, d(i, list), 1).show();
        }
        this.i = false;
        this.e = null;
        ArrayList<ShellLayoutEngineV2.b> arrayList = new ArrayList(this.d);
        this.d.clear();
        for (ShellLayoutEngineV2.b bVar : arrayList) {
            if (bVar != null) {
                bVar.a(i, z, aVar);
            }
        }
    }

    private com.tsf.shell._a.a.ShellPageManagerV2 b(int i, List<String> list) {
        return a.get(Integer.valueOf(g(i, list)));
    }

    private StringBuilder c(int i, List<String> list) {
        com.tsf.shell._a.a.ShellPageManagerV2 bVar;
        int iG = g(i, list);
        Set<Integer> setKeySet = a.keySet();
        StringBuilder sb = new StringBuilder();
        for (Integer num : setKeySet) {
            if ((num.intValue() & iG) == num.intValue() && a(num.intValue()) && (bVar = a.get(num)) != null) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.f.getString(bVar.d()));
            }
        }
        return sb;
    }

    private String d(int i, List<String> list) {
        StringBuilder sbC = c(i, list);
        sbC.append(" ").append(this.f.getString(a.e.permission_denied));
        return sbC.toString();
    }

    private String e(int i, List<String> list) {
        StringBuilder sbC = c(i, list);
        return this.f.getResources().getQuantityString(a.d.permission_denied_guide_desc, sbC.toString().contains(",") ? 2 : 1, sbC.toString());
    }

    private String f(int i, List<String> list) {
        com.tsf.shell._a.a.ShellPageManagerV2 bVar;
        int iG = g(i, list);
        if (iG == 0) {
            return "";
        }
        Set<Integer> setKeySet = a.keySet();
        StringBuilder sb = new StringBuilder();
        for (Integer num : setKeySet) {
            if ((num.intValue() & iG) == num.intValue() && a(num.intValue()) && (bVar = a.get(num)) != null) {
                if (sb.length() > 0) {
                    sb.append("_");
                }
                sb.append(bVar.e());
            }
        }
        return sb.toString();
    }

    private int g(int i, List<String> list) {
        if (list == null || list.size() <= 0) {
            return 0;
        }
        if (a(i)) {
            return i;
        }
        return 0 | (list.contains("android.permission.READ_PHONE_STATE") || list.contains("android.permission.CALL_PHONE") || list.contains("android.permission.READ_CALL_LOG") || list.contains("android.permission.WRITE_CALL_LOG") ? 16 : 0) | (list.contains("android.permission.ACCESS_FINE_LOCATION") || list.contains("android.permission.ACCESS_COARSE_LOCATION") ? 2 : 0) | (list.contains("android.permission.READ_CALENDAR") || list.contains("android.permission.WRITE_CALENDAR") ? 4 : 0) | (list.contains("android.permission.RECORD_AUDIO") ? 8 : 0) | (list.contains("android.permission.CAMERA") ? 32 : 0) | (list.contains("android.permission.READ_CONTACTS") || list.contains("android.permission.WRITE_CONTACTS") ? 64 : 0) | (list.contains("android.permission.READ_EXTERNAL_STORAGE") || list.contains("android.permission.WRITE_EXTERNAL_STORAGE") ? ItemInfo.APP_INTENT : 0);
    }

    private void a(Context context) {
        if (context != null && !this.j) {
            try {
                context.registerReceiver(this.l, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                this.j = true;
            } catch (Exception e) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        if (context != null && this.j) {
            try {
                context.unregisterReceiver(this.l);
                this.j = false;
            } catch (Exception e) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tsf.shell._a.a.ShellContentManagerV2$a, reason: collision with other inner class name */
    private class C0074a extends BroadcastReceiver {
        final String a;
        final String b;

        private C0074a() {
            this.a = "reason";
            this.b = "homekey";
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            if (!intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") || (stringExtra = intent.getStringExtra("reason")) == null || !stringExtra.equals("homekey") || a.this.b == null || !a.this.b.isShowing() || !TextUtils.isEmpty(a.this.k)) {
            }
        }
    }

    private boolean a(int i) {
        return ((i + (-1)) & i) == 0;
    }
}
