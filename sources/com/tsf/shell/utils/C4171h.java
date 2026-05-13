package com.tsf.shell.utils;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.utils.h */
/* loaded from: classes.dex */
public class C4171h {
    /* renamed from: a */
    public static ArrayList<ItemInfo> m678a(ArrayList<ItemInfo> arrayList, String str, String str2, boolean z) {
        ArrayList<ItemInfo> arrayList2 = new ArrayList<>();
        ArrayList<Integer> m680a = m680a(str, ",", false);
        int size = m680a.size();
        for (int i = 0; i < size; i++) {
            ItemInfo m679a = m679a(arrayList, m680a.get(i).intValue());
            if (m679a != null) {
                arrayList2.add(m679a);
                arrayList.remove(m679a);
            }
        }
        if (z) {
            arrayList2.addAll(arrayList);
            arrayList.clear();
        }
        return arrayList2;
    }

    /* renamed from: a */
    private static ItemInfo m679a(ArrayList<ItemInfo> arrayList, int i) {
        Iterator<ItemInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            ItemInfo next = it.next();
            if (next.f2532id == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static ArrayList<Integer> m680a(String str, String str2, boolean z) {
        boolean z2;
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (str == null) {
            return arrayList;
        }
        String[] split = str.split(",");
        if (split.length == 1 && split[0].length() == 0) {
            return arrayList;
        }
        for (String str3 : split) {
            try {
                int parseInt = Integer.parseInt(str3);
                if (z) {
                    arrayList.add(Integer.valueOf(parseInt));
                } else {
                    Iterator<Integer> it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().intValue() == parseInt) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (!z2) {
                        arrayList.add(Integer.valueOf(parseInt));
                    }
                }
            } catch (Exception e) {
            }
        }
        return arrayList;
    }
}
