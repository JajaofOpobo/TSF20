package com.tsf.shell.f.f.a.a;

import android.annotation.TargetApi;
import android.os.Build;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.flurry.android.Constants;
import java.lang.Character;
import java.text.Collator;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
@TargetApi(9)
/* loaded from: classes.dex */
public class b {
    public static char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'w', 'x', 'y', 'z'};
    private static final char[] b = {12353, 12363, 12373, 12383, 12394, 12399, 12414, 12419, 12425, 12430, 12436, 12437, 12449, 12459, 12469, 12479, 12490, 12495, 12510, 12515, 12521, 12526, 12532, 12533};
    private static final char[] c = {12362, 12372, 12382, 12393, 12398, 12413, 12418, 12424, 12429, 12435, 12436, 12438, 12458, 12468, 12478, 12489, 12494, 12509, 12514, 12520, 12525, 12531, 12532, 12534};
    private static final char[] d = {12354, 12363, 12373, 12383, 12394, 12399, 12414, 12420, 12425, 12431, 12354, 12363, 12354, 12363, 12373, 12383, 12394, 12399, 12414, 12420, 12425, 12431, 12354, 12363};
    private static final int[] e = {-20319, -20283, -19775, -19218, -18710, -18526, -18239, -17922, -17417, -16474, -16212, -15640, -15165, -14922, -14914, -14630, -14149, -14090, -13318, -12838, -12556, -11847, -11055};
    private static final List<Character> f = new ArrayList();
    private static final List<Character> g = new ArrayList();
    private static final Map<Character.UnicodeBlock, Character> h = new HashMap();
    private static final Map<Character, Character> i = new HashMap();
    private static final List<Character> j = new ArrayList();

    /* loaded from: classes.dex */
    public interface a {
        String r_();
    }

    /* renamed from: com.tsf.shell.f.f.a.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0102b extends ArrayList<c> {
        public void a(a aVar) {
            String ch = Character.toString(b.a(aVar.r_()));
            Iterator<c> it = iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (ch.equals(next.a())) {
                    next.b().add(aVar);
                    return;
                }
            }
            c cVar = new c(ch);
            cVar.b().add(aVar);
            add(cVar);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        private String a;
        private ArrayList<a> b = new ArrayList<>();

        public c(String str) {
            this.a = str;
        }

        public String a() {
            return this.a;
        }

        public ArrayList<a> b() {
            return this.b;
        }
    }

    public static char a(char c2) {
        if (160 != c2) {
            int c3 = c(c2);
            if (c3 > 0 && c3 <= 160) {
                return (char) c3;
            }
            for (int length = e.length - 1; length >= 0; length--) {
                if (e[length] <= c3) {
                    return a[length];
                }
            }
            return (char) 23383;
        }
        return c2;
    }

    public static char b(char c2) {
        int binarySearch = Arrays.binarySearch(b, c2);
        char c3 = binarySearch >= 0 ? d[binarySearch] : c2;
        int i2 = ((-binarySearch) - 1) - 1;
        return (i2 < 0 || c3 > c[i2]) ? c3 : d[i2];
    }

    private static int c(char c2) {
        try {
            byte[] bytes = String.valueOf(c2).getBytes("GB2312");
            if (bytes == null || bytes.length > 2 || bytes.length <= 0) {
                return 0;
            }
            byte b2 = bytes.length == 1 ? bytes[0] : (byte) 0;
            if (bytes.length == 2) {
                return ((bytes[1] + Constants.FEMALE) + ((bytes[0] + Constants.FEMALE) * ItemInfo.APP_VERSION_CODE)) - 65536;
            }
            return b2;
        } catch (Exception e2) {
            return 0;
        }
    }

    public static char a(String str) {
        if (str != null && str.length() > 0) {
            char b2 = b(str);
            char upperCase = Character.toUpperCase(b2);
            if (Character.isDigit(b2)) {
                return '#';
            }
            if (!d(upperCase)) {
                if (f.contains(Character.valueOf(b2))) {
                    return b2;
                }
                Character.UnicodeBlock of = Character.UnicodeBlock.of(b2);
                if (h.containsKey(of)) {
                    return h.get(of).charValue();
                }
                if (i.containsKey(Character.valueOf(upperCase))) {
                    return i.get(Character.valueOf(upperCase)).charValue();
                }
                if (Character.UnicodeBlock.HIRAGANA.equals(of) || Character.UnicodeBlock.KATAKANA.equals(of)) {
                    return b(b2);
                }
                if (Build.VERSION.SDK_INT >= 9) {
                    upperCase = Normalizer.normalize(String.valueOf(upperCase), Normalizer.Form.NFKD).charAt(0);
                }
                if (!"zh_CN".equalsIgnoreCase(Locale.getDefault().toString()) && e(upperCase)) {
                    return (char) 23383;
                }
                return upperCase;
            }
            return upperCase;
        }
        return '?';
    }

    private static boolean d(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    private static char b(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Build.VERSION.SDK_INT < 9 || ' ' != Normalizer.normalize(String.valueOf(charAt), Normalizer.Form.NFKD).charAt(0)) {
                return "zh_CN".equalsIgnoreCase(Locale.getDefault().toString()) ? a(charAt) : charAt;
            }
        }
        return ' ';
    }

    private static boolean e(char c2) {
        return c2 >= 19968 && c2 <= 40891;
    }

    public static ArrayList<c> a(ArrayList<a> arrayList) {
        C0102b c0102b = new C0102b();
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            c0102b.a(it.next());
        }
        final Collator collator = Collator.getInstance(Locale.getDefault());
        Collections.sort(c0102b, new Comparator<c>() { // from class: com.tsf.shell.f.f.a.a.b.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(c cVar, c cVar2) {
                return collator.compare(cVar.a(), cVar2.a());
            }
        });
        return c0102b;
    }

    public static String a(a aVar) {
        return Character.toString(a(aVar.r_()));
    }

    public static c a(String str, a aVar) {
        c cVar = new c(str);
        cVar.b().add(aVar);
        return cVar;
    }

    public static int a(ArrayList<com.tsf.shell.f.f.a.a.a.c> arrayList, com.tsf.shell.f.f.a.a.a.b bVar) {
        final Collator collator = Collator.getInstance(Locale.getDefault());
        arrayList.add(bVar);
        Collections.sort(arrayList, new Comparator<com.tsf.shell.f.f.a.a.a.c>() { // from class: com.tsf.shell.f.f.a.a.b.2
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(com.tsf.shell.f.f.a.a.a.c cVar, com.tsf.shell.f.f.a.a.a.c cVar2) {
                if ((cVar instanceof com.tsf.shell.f.f.a.a.a.b) && (cVar2 instanceof com.tsf.shell.f.f.a.a.a.b)) {
                    return collator.compare(((com.tsf.shell.f.f.a.a.a.b) cVar).g(), ((com.tsf.shell.f.f.a.a.a.b) cVar2).g());
                } else if (!(cVar instanceof com.tsf.shell.f.f.a.a.a.b)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) == bVar) {
                return i2;
            }
        }
        return 0;
    }
}
