package com.tsf.shell.p086a.p087a;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.p002v4.app.C0062a;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.Toast;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.p024b.p025a.C0843a;
import com.tsf.shell.p086a.p087a.C2195b;
import com.tsf.shell.p086a.p087a.C2202d;
import com.tsf.shell.p086a.p087a.DialogC2197c;
import com.tsf.shell.p086a.p088b.C2209a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
/* renamed from: com.tsf.shell.a.a.a */
/* loaded from: classes.dex */
public class C2186a {

    /* renamed from: a */
    public static LinkedHashMap<Integer, C2195b> f7184a = new LinkedHashMap<>();

    /* renamed from: b */
    private DialogC2197c f7185b;

    /* renamed from: c */
    private DialogC2197c f7186c;

    /* renamed from: f */
    private Activity f7189f;

    /* renamed from: m */
    private boolean f7196m;

    /* renamed from: n */
    private int f7197n;

    /* renamed from: d */
    private ArrayList<C2202d.InterfaceC2204b> f7187d = new ArrayList<>();

    /* renamed from: e */
    private String[] f7188e = null;

    /* renamed from: g */
    private EnumC2194c f7190g = EnumC2194c.SHOW_WHEN_REJECT;

    /* renamed from: h */
    private boolean f7191h = false;

    /* renamed from: i */
    private boolean f7192i = false;

    /* renamed from: j */
    private boolean f7193j = false;

    /* renamed from: k */
    private String f7194k = "";

    /* renamed from: l */
    private C2192a f7195l = new C2192a();

    /* renamed from: com.tsf.shell.a.a.a$b */
    /* loaded from: classes.dex */
    public enum EnumC2193b {
        DEFAULT,
        SHOW,
        NOT_SHOW
    }

    /* renamed from: com.tsf.shell.a.a.a$c */
    /* loaded from: classes.dex */
    public enum EnumC2194c {
        SHOW_WHEN_REJECT_WITH_NMA,
        SHOW_WHEN_REJECT,
        SHOW_NOTHING
    }

    public C2186a(Activity activity) {
        this.f7189f = activity;
    }

    static {
        C2195b.C2196a c2196a = new C2195b.C2196a();
        c2196a.m6100c(C0843a.C0844a.perms_calender_contact_audio_bg).m6101b(C0843a.C0848e.perm_calender_contact_record_desc).m6099d(3).m6103a(C0843a.C0848e.calendar_text);
        f7184a.put(76, c2196a.m6104a());
        C2195b.C2196a c2196a2 = new C2195b.C2196a();
        c2196a2.m6100c(C0843a.C0844a.perms_calender_contact_audio_bg).m6101b(C0843a.C0848e.perm_calender_contact_record_desc).m6099d(2).m6103a(C0843a.C0848e.calendar_text);
        f7184a.put(68, c2196a2.m6104a());
        C2195b.C2196a c2196a3 = new C2195b.C2196a();
        c2196a3.m6100c(C0843a.C0844a.perms_calender_contact_audio_bg).m6101b(C0843a.C0848e.perm_calender_contact_record_desc).m6099d(2).m6103a(C0843a.C0848e.calendar_text);
        f7184a.put(12, c2196a3.m6104a());
        C2195b.C2196a c2196a4 = new C2195b.C2196a();
        c2196a4.m6100c(C0843a.C0844a.perms_calender_contact_audio_bg).m6101b(C0843a.C0848e.perm_calender_contact_record_desc).m6099d(2).m6103a(C0843a.C0848e.calendar_text);
        f7184a.put(72, c2196a4.m6104a());
        C2195b.C2196a c2196a5 = new C2195b.C2196a();
        c2196a5.m6100c(C0843a.C0844a.perms_phone_contacts_bg).m6101b(C0843a.C0848e.perm_phone_contacts_desc).m6099d(2).m6103a(C0843a.C0848e.contacts_text);
        f7184a.put(80, c2196a5.m6104a());
        C2195b.C2196a c2196a6 = new C2195b.C2196a();
        c2196a6.m6100c(C0843a.C0844a.perm_calender_bg).m6101b(C0843a.C0848e.perm_calender_desc).m6102a("1").m6103a(C0843a.C0848e.calendar_text);
        f7184a.put(4, c2196a6.m6104a());
        C2195b.C2196a c2196a7 = new C2195b.C2196a();
        c2196a7.m6100c(C0843a.C0844a.perm_camera_bg).m6101b(C0843a.C0848e.perm_camera_desc).m6102a("2").m6103a(C0843a.C0848e.camera_title);
        f7184a.put(32, c2196a7.m6104a());
        C2195b.C2196a c2196a8 = new C2195b.C2196a();
        c2196a8.m6100c(C0843a.C0844a.perm_contacts_bg).m6101b(C0843a.C0848e.perm_contacts_desc).m6102a("3").m6103a(C0843a.C0848e.contacts_text);
        f7184a.put(64, c2196a8.m6104a());
        C2195b.C2196a c2196a9 = new C2195b.C2196a();
        c2196a9.m6100c(C0843a.C0844a.perm_location_bg).m6101b(C0843a.C0848e.perm_location_desc).m6102a("4").m6103a(C0843a.C0848e.location_text);
        f7184a.put(2, c2196a9.m6104a());
        C2195b.C2196a c2196a10 = new C2195b.C2196a();
        c2196a10.m6100c(C0843a.C0844a.perm_audio_bg).m6101b(C0843a.C0848e.perm_recoder_desc).m6102a("5").m6103a(C0843a.C0848e.audio_text);
        f7184a.put(8, c2196a10.m6104a());
        C2195b.C2196a c2196a11 = new C2195b.C2196a();
        c2196a11.m6100c(C0843a.C0844a.perm_phone_bg).m6101b(C0843a.C0848e.perm_phone_desc).m6102a("6").m6103a(C0843a.C0848e.phone_text);
        f7184a.put(16, c2196a11.m6104a());
        C2195b.C2196a c2196a12 = new C2195b.C2196a();
        c2196a12.m6100c(C0843a.C0844a.perm_storage_bg).m6101b(C0843a.C0848e.perm_storage_desc).m6102a("7").m6103a(C0843a.C0848e.storage_text);
        f7184a.put(Integer.valueOf((int) ItemInfo.APP_INTENT), c2196a12.m6104a());
        C2195b.C2196a c2196a13 = new C2195b.C2196a();
        c2196a13.m6100c(C0843a.C0844a.perm_storage_bg).m6101b(C0843a.C0848e.perm_wallpaper_desc).m6102a("7").m6103a(C0843a.C0848e.storage_text);
        f7184a.put(Integer.valueOf((int) ItemInfo.APP_VERSION_CODE), c2196a13.m6104a());
    }

    /* renamed from: a */
    public boolean m6120a(C2202d.InterfaceC2204b interfaceC2204b, boolean z, int i, String... strArr) {
        return m6121a(interfaceC2204b, z ? EnumC2194c.SHOW_WHEN_REJECT : EnumC2194c.SHOW_NOTHING, EnumC2193b.DEFAULT, true, i, strArr);
    }

    /* renamed from: a */
    public boolean m6121a(C2202d.InterfaceC2204b interfaceC2204b, EnumC2194c enumC2194c, EnumC2193b enumC2193b, boolean z, int i, String... strArr) {
        if (!C2202d.m6090a(this.f7189f, strArr)) {
            if (interfaceC2204b != null) {
                interfaceC2204b.mo152a(i, true, C2202d.EnumC2203a.AUTHORIZED);
            }
            return true;
        } else if (this.f7196m) {
            if (interfaceC2204b != null) {
                if (this.f7197n == i) {
                    this.f7187d.add(interfaceC2204b);
                    return false;
                }
                interfaceC2204b.mo152a(i, true, C2202d.EnumC2203a.SYSTEM_CANCEL_AUTH);
                return false;
            }
            return false;
        } else {
            this.f7196m = true;
            this.f7197n = i;
            List<String> m6089b = C2202d.m6089b(this.f7189f, strArr);
            C2195b m6119b = m6119b(i, m6089b);
            boolean z2 = m6119b != null && m6119b.m6107c() > 1;
            this.f7191h = true;
            this.f7190g = enumC2194c;
            this.f7192i = z;
            switch (enumC2193b) {
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
                m6130a(i, m6089b);
            } else {
                C2202d.m6091a(this.f7189f, i, strArr);
            }
            if (interfaceC2204b != null) {
                this.f7187d.add(interfaceC2204b);
                return false;
            }
            return false;
        }
    }

    /* renamed from: a */
    public void m6127a(int i, String[] strArr, int[] iArr) {
        boolean z;
        boolean z2 = true;
        this.f7196m = false;
        this.f7197n = 0;
        List<String> arrayList = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr[i2] == 0 && C2202d.m6088c(this.f7189f, str)) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        if (!TextUtils.isEmpty(m6111f(i, arrayList))) {
        }
        if (!(arrayList2.size() == 0 && arrayList.size() > 0)) {
            List<String> arrayList3 = new ArrayList<>();
            boolean z3 = false;
            for (String str2 : arrayList2) {
                if (C0062a.m13698a(this.f7189f, str2)) {
                    z = z3;
                } else {
                    arrayList3.add(str2);
                    z = true;
                }
                z3 = z;
            }
            if (!TextUtils.isEmpty(m6111f(i, arrayList3))) {
            }
            List<String> arrayList4 = new ArrayList<>(arrayList2);
            arrayList4.removeAll(arrayList3);
            if (!TextUtils.isEmpty(m6111f(i, arrayList4))) {
            }
            if (arrayList2.size() > 0) {
                switch (this.f7190g) {
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
                if (z2 && this.f7191h) {
                    if (this.f7189f != null && !this.f7189f.isFinishing()) {
                        m6129a(i, arrayList2, strArr, z3);
                        return;
                    }
                    return;
                }
                m6128a(i, false, C2202d.EnumC2203a.USER_REJECT_AUTH, arrayList2);
                return;
            }
            m6128a(i, false, C2202d.EnumC2203a.SYSTEM_CANCEL_AUTH, arrayList2);
            return;
        }
        m6128a(i, true, C2202d.EnumC2203a.USER_CLICK_AGREE_AUTH, (List<String>) null);
    }

    /* renamed from: a */
    private void m6130a(final int i, final List<String> list) {
        if (this.f7186c != null && this.f7186c.isShowing()) {
            this.f7186c.dismiss();
        }
        this.f7186c = new DialogC2197c(this.f7189f);
        C2195b m6119b = m6119b(i, list);
        if (m6119b != null) {
            this.f7186c.m6098a(8);
            this.f7186c.m6097a(i, m6119b.m6109a(), this.f7189f.getString(m6119b.m6108b()), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.a.a.a.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    if (i2 == -1) {
                        C2186a.this.f7186c.dismiss();
                        C2202d.m6091a(C2186a.this.f7189f, i, (String[]) list.toArray(new String[list.size()]));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m6129a(final int i, final List<String> list, final String[] strArr, final boolean z) {
        if (this.f7185b != null && this.f7185b.isShowing()) {
            this.f7185b.dismiss();
        }
        this.f7190g = EnumC2194c.SHOW_NOTHING;
        this.f7185b = new DialogC2197c(this.f7189f);
        this.f7185b.setContentView(C0843a.C0846c.permission_guide_dialog_no_bg);
        if (m6119b(i, list) != null) {
            String m6112e = m6112e(i, list);
            this.f7194k = m6111f(i, list);
            m6126a(this.f7189f);
            this.f7185b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tsf.shell.a.a.a.2
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    C2186a.this.m6118b(C2186a.this.f7189f);
                }
            });
            this.f7185b.m6094a(new DialogC2197c.InterfaceC2201a() { // from class: com.tsf.shell.a.a.a.3
                @Override // com.tsf.shell.p086a.p087a.DialogC2197c.InterfaceC2201a
                /* renamed from: a */
                public boolean mo6086a(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                    if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() == 1) {
                    }
                    return true;
                }
            });
            this.f7185b.m6096a(i, m6112e, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.a.a.a.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    if (i2 == -1) {
                        C2186a.this.f7185b.dismiss();
                        if (z) {
                            C2209a.m6084a(C2186a.this.f7189f, i | 1);
                            C2186a.this.f7188e = strArr;
                            return;
                        }
                        C2202d.m6091a(C2186a.this.f7189f, i, (String[]) list.toArray(new String[list.size()]));
                        return;
                    }
                    C2186a.this.m6128a(i, false, C2202d.EnumC2203a.USER_REJECT_AUTH, (List<String>) list);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6128a(int i, boolean z, C2202d.EnumC2203a enumC2203a, List<String> list) {
        if (!z && list != null && list.size() > 0 && this.f7192i) {
            Toast.makeText(this.f7189f, m6114d(i, list), 1).show();
        }
        this.f7192i = false;
        this.f7188e = null;
        ArrayList arrayList = new ArrayList(this.f7187d);
        this.f7187d.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2202d.InterfaceC2204b interfaceC2204b = (C2202d.InterfaceC2204b) it.next();
            if (interfaceC2204b != null) {
                interfaceC2204b.mo152a(i, z, enumC2203a);
            }
        }
    }

    /* renamed from: b */
    private C2195b m6119b(int i, List<String> list) {
        return f7184a.get(Integer.valueOf(m6110g(i, list)));
    }

    /* renamed from: c */
    private StringBuilder m6116c(int i, List<String> list) {
        C2195b c2195b;
        int m6110g = m6110g(i, list);
        Set<Integer> keySet = f7184a.keySet();
        StringBuilder sb = new StringBuilder();
        for (Integer num : keySet) {
            if ((num.intValue() & m6110g) == num.intValue() && m6131a(num.intValue()) && (c2195b = f7184a.get(num)) != null) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.f7189f.getString(c2195b.m6106d()));
            }
        }
        return sb;
    }

    /* renamed from: d */
    private String m6114d(int i, List<String> list) {
        StringBuilder m6116c = m6116c(i, list);
        m6116c.append(" ").append(this.f7189f.getString(C0843a.C0848e.permission_denied));
        return m6116c.toString();
    }

    /* renamed from: e */
    private String m6112e(int i, List<String> list) {
        StringBuilder m6116c = m6116c(i, list);
        return this.f7189f.getResources().getQuantityString(C0843a.C0847d.permission_denied_guide_desc, m6116c.toString().contains(",") ? 2 : 1, m6116c.toString());
    }

    /* renamed from: f */
    private String m6111f(int i, List<String> list) {
        C2195b c2195b;
        int m6110g = m6110g(i, list);
        if (m6110g == 0) {
            return "";
        }
        Set<Integer> keySet = f7184a.keySet();
        StringBuilder sb = new StringBuilder();
        for (Integer num : keySet) {
            if ((num.intValue() & m6110g) == num.intValue() && m6131a(num.intValue()) && (c2195b = f7184a.get(num)) != null) {
                if (sb.length() > 0) {
                    sb.append("_");
                }
                sb.append(c2195b.m6105e());
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    private int m6110g(int i, List<String> list) {
        if (list == null || list.size() <= 0) {
            return 0;
        }
        if (m6131a(i)) {
            return i;
        }
        return 0 | (list.contains("android.permission.READ_PHONE_STATE") || list.contains("android.permission.CALL_PHONE") || list.contains("android.permission.READ_CALL_LOG") || list.contains("android.permission.WRITE_CALL_LOG") ? 16 : 0) | (list.contains("android.permission.ACCESS_FINE_LOCATION") || list.contains("android.permission.ACCESS_COARSE_LOCATION") ? 2 : 0) | (list.contains("android.permission.READ_CALENDAR") || list.contains("android.permission.WRITE_CALENDAR") ? 4 : 0) | (list.contains("android.permission.RECORD_AUDIO") ? 8 : 0) | (list.contains("android.permission.CAMERA") ? 32 : 0) | (list.contains("android.permission.READ_CONTACTS") || list.contains("android.permission.WRITE_CONTACTS") ? 64 : 0) | (list.contains("android.permission.READ_EXTERNAL_STORAGE") || list.contains("android.permission.WRITE_EXTERNAL_STORAGE") ? ItemInfo.APP_INTENT : 0);
    }

    /* renamed from: a */
    private void m6126a(Context context) {
        if (context != null && !this.f7193j) {
            try {
                context.registerReceiver(this.f7195l, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                this.f7193j = true;
            } catch (Exception e) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6118b(Context context) {
        if (context != null && this.f7193j) {
            try {
                context.unregisterReceiver(this.f7195l);
                this.f7193j = false;
            } catch (Exception e) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.a.a.a$a */
    /* loaded from: classes.dex */
    public class C2192a extends BroadcastReceiver {

        /* renamed from: a */
        final String f7210a;

        /* renamed from: b */
        final String f7211b;

        private C2192a() {
            this.f7210a = "reason";
            this.f7211b = "homekey";
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            if (!intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") || (stringExtra = intent.getStringExtra("reason")) == null || !stringExtra.equals("homekey") || C2186a.this.f7185b == null || !C2186a.this.f7185b.isShowing() || !TextUtils.isEmpty(C2186a.this.f7194k)) {
            }
        }
    }

    /* renamed from: a */
    private boolean m6131a(int i) {
        return ((i + (-1)) & i) == 0;
    }
}
