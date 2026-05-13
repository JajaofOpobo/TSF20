package com.flurry.sdk;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* renamed from: com.flurry.sdk.dq */
/* loaded from: classes.dex */
public class C1213dq {

    /* renamed from: a */
    private Map<String, Object> f3906a = new HashMap();

    /* renamed from: b */
    private Map<String, List<InterfaceC1214a>> f3907b = new HashMap();

    /* renamed from: com.flurry.sdk.dq$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1214a {
        /* renamed from: a */
        void mo9338a(String str, Object obj);
    }

    /* renamed from: a */
    public synchronized void m9375a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && !m9378a(obj, this.f3906a.get(str))) {
            if (obj == null) {
                this.f3906a.remove(str);
            } else {
                this.f3906a.put(str, obj);
            }
            m9373b(str, obj);
        }
    }

    /* renamed from: a */
    private boolean m9378a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    private void m9373b(String str, Object obj) {
        if (this.f3907b.get(str) != null) {
            for (InterfaceC1214a interfaceC1214a : this.f3907b.get(str)) {
                interfaceC1214a.mo9338a(str, obj);
            }
        }
    }

    /* renamed from: a */
    public synchronized Object m9377a(String str) {
        return this.f3906a.get(str);
    }

    /* renamed from: a */
    public synchronized void m9376a(String str, InterfaceC1214a interfaceC1214a) {
        if (!TextUtils.isEmpty(str) && interfaceC1214a != null) {
            List<InterfaceC1214a> list = this.f3907b.get(str);
            if (list == null) {
                list = new LinkedList<>();
            }
            list.add(interfaceC1214a);
            this.f3907b.put(str, list);
        }
    }

    /* renamed from: b */
    public synchronized boolean m9374b(String str, InterfaceC1214a interfaceC1214a) {
        boolean remove;
        if (TextUtils.isEmpty(str)) {
            remove = false;
        } else if (interfaceC1214a == null) {
            remove = false;
        } else {
            List<InterfaceC1214a> list = this.f3907b.get(str);
            remove = list == null ? false : list.remove(interfaceC1214a);
        }
        return remove;
    }
}
