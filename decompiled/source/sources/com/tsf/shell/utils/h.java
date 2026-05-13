package com.tsf.shell.utils;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h {
    public static ArrayList<ItemInfo> a(ArrayList<ItemInfo> arrayList, String str, String str2, boolean z) {
        ArrayList<ItemInfo> arrayList2 = new ArrayList<>();
        ArrayList<Integer> a = a(str, ",", false);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ItemInfo a2 = a(arrayList, a.get(i).intValue());
            if (a2 != null) {
                arrayList2.add(a2);
                arrayList.remove(a2);
            }
        }
        if (z) {
            arrayList2.addAll(arrayList);
            arrayList.clear();
        }
        return arrayList2;
    }

    private static ItemInfo a(ArrayList<ItemInfo> arrayList, int i) {
        Iterator<ItemInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            ItemInfo next = it.next();
            if (next.id == i) {
                return next;
            }
        }
        return null;
    }

    public static ArrayList<Integer> a(String str, String str2, boolean z) {
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
