package com.tsf.shell.utils;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class h {
    public static ArrayList<ItemInfo> a(ArrayList<ItemInfo> arrayList, String str, String str2, boolean z) {
        ArrayList<ItemInfo> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayListA = a(str, ",", false);
        int size = arrayListA.size();
        for (int i = 0; i < size; i++) {
            ItemInfo itemInfoA = a(arrayList, arrayListA.get(i).intValue());
            if (itemInfoA != null) {
                arrayList2.add(itemInfoA);
                arrayList.remove(itemInfoA);
            }
        }
        if (z) {
            arrayList2.addAll(arrayList);
            arrayList.clear();
        }
        return arrayList2;
    }

    private static ItemInfo a(ArrayList<ItemInfo> arrayList, int i) {
        for (ItemInfo itemInfo : arrayList) {
            if (itemInfo.id == i) {
                return itemInfo;
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
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length == 1 && strArrSplit[0].length() == 0) {
            return arrayList;
        }
        for (String str3 : strArrSplit) {
            try {
                int i = Integer.parseInt(str3);
                if (z) {
                    arrayList.add(Integer.valueOf(i));
                } else {
                    Iterator<Integer> it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = false;
                            break;
                        }
                        if (it.next().intValue() == i) {
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2) {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
            } catch (Exception e) {
            }
        }
        return arrayList;
    }
}
