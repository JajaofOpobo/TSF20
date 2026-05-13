package com.tsf.shell.p096f.p131f.p132a.p133a;

import android.annotation.TargetApi;
import android.os.Build;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.flurry.android.Constants;
import com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2683b;
import com.tsf.shell.p096f.p131f.p132a.p133a.p134a.C2684c;
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
/* renamed from: com.tsf.shell.f.f.a.a.b */
/* loaded from: classes.dex */
public class C2685b {

    /* renamed from: a */
    public static char[] f8848a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'w', 'x', 'y', 'z'};

    /* renamed from: b */
    private static final char[] f8849b = {12353, 12363, 12373, 12383, 12394, 12399, 12414, 12419, 12425, 12430, 12436, 12437, 12449, 12459, 12469, 12479, 12490, 12495, 12510, 12515, 12521, 12526, 12532, 12533};

    /* renamed from: c */
    private static final char[] f8850c = {12362, 12372, 12382, 12393, 12398, 12413, 12418, 12424, 12429, 12435, 12436, 12438, 12458, 12468, 12478, 12489, 12494, 12509, 12514, 12520, 12525, 12531, 12532, 12534};

    /* renamed from: d */
    private static final char[] f8851d = {12354, 12363, 12373, 12383, 12394, 12399, 12414, 12420, 12425, 12431, 12354, 12363, 12354, 12363, 12373, 12383, 12394, 12399, 12414, 12420, 12425, 12431, 12354, 12363};

    /* renamed from: e */
    private static final int[] f8852e = {-20319, -20283, -19775, -19218, -18710, -18526, -18239, -17922, -17417, -16474, -16212, -15640, -15165, -14922, -14914, -14630, -14149, -14090, -13318, -12838, -12556, -11847, -11055};

    /* renamed from: f */
    private static final List<Character> f8853f = new ArrayList();

    /* renamed from: g */
    private static final List<Character> f8854g = new ArrayList();

    /* renamed from: h */
    private static final Map<Character.UnicodeBlock, Character> f8855h = new HashMap();

    /* renamed from: i */
    private static final Map<Character, Character> f8856i = new HashMap();

    /* renamed from: j */
    private static final List<Character> f8857j = new ArrayList();

    /* renamed from: com.tsf.shell.f.f.a.a.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2688a {
        /* renamed from: r_ */
        String mo3099r_();
    }

    /* renamed from: com.tsf.shell.f.f.a.a.b$b */
    /* loaded from: classes.dex */
    public static class C2689b extends ArrayList<C2690c> {
        /* renamed from: a */
        public void m4901a(InterfaceC2688a interfaceC2688a) {
            String ch = Character.toString(C2685b.m4918a(interfaceC2688a.mo3099r_()));
            Iterator<C2690c> it = iterator();
            while (it.hasNext()) {
                C2690c next = it.next();
                if (ch.equals(next.m4897a())) {
                    next.m4894b().add(interfaceC2688a);
                    return;
                }
            }
            C2690c c2690c = new C2690c(ch);
            c2690c.m4894b().add(interfaceC2688a);
            add(c2690c);
        }
    }

    /* renamed from: com.tsf.shell.f.f.a.a.b$c */
    /* loaded from: classes.dex */
    public static class C2690c {

        /* renamed from: a */
        private String f8860a;

        /* renamed from: b */
        private ArrayList<InterfaceC2688a> f8861b = new ArrayList<>();

        public C2690c(String str) {
            this.f8860a = str;
        }

        /* renamed from: a */
        public String m4897a() {
            return this.f8860a;
        }

        /* renamed from: b */
        public ArrayList<InterfaceC2688a> m4894b() {
            return this.f8861b;
        }
    }

    /* renamed from: a */
    public static char m4920a(char c) {
        if (160 != c) {
            int m4912c = m4912c(c);
            if (m4912c > 0 && m4912c <= 160) {
                return (char) m4912c;
            }
            for (int length = f8852e.length - 1; length >= 0; length--) {
                if (f8852e[length] <= m4912c) {
                    return f8848a[length];
                }
            }
            return (char) 23383;
        }
        return c;
    }

    /* renamed from: b */
    public static char m4914b(char c) {
        int binarySearch = Arrays.binarySearch(f8849b, c);
        char c2 = binarySearch >= 0 ? f8851d[binarySearch] : c;
        int i = ((-binarySearch) - 1) - 1;
        return (i < 0 || c2 > f8850c[i]) ? c2 : f8851d[i];
    }

    /* renamed from: c */
    private static int m4912c(char c) {
        try {
            byte[] bytes = String.valueOf(c).getBytes("GB2312");
            if (bytes == null || bytes.length > 2 || bytes.length <= 0) {
                return 0;
            }
            byte b = bytes.length == 1 ? bytes[0] : (byte) 0;
            if (bytes.length == 2) {
                return ((bytes[1] + Constants.FEMALE) + ((bytes[0] + Constants.FEMALE) * ItemInfo.APP_VERSION_CODE)) - 65536;
            }
            return b;
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: a */
    public static char m4918a(String str) {
        if (str != null && str.length() > 0) {
            char m4913b = m4913b(str);
            char upperCase = Character.toUpperCase(m4913b);
            if (Character.isDigit(m4913b)) {
                return '#';
            }
            if (!m4911d(upperCase)) {
                if (f8853f.contains(Character.valueOf(m4913b))) {
                    return m4913b;
                }
                Character.UnicodeBlock of = Character.UnicodeBlock.of(m4913b);
                if (f8855h.containsKey(of)) {
                    return f8855h.get(of).charValue();
                }
                if (f8856i.containsKey(Character.valueOf(upperCase))) {
                    return f8856i.get(Character.valueOf(upperCase)).charValue();
                }
                if (Character.UnicodeBlock.HIRAGANA.equals(of) || Character.UnicodeBlock.KATAKANA.equals(of)) {
                    return m4914b(m4913b);
                }
                if (Build.VERSION.SDK_INT >= 9) {
                    upperCase = Normalizer.normalize(String.valueOf(upperCase), Normalizer.Form.NFKD).charAt(0);
                }
                if (!"zh_CN".equalsIgnoreCase(Locale.getDefault().toString()) && m4910e(upperCase)) {
                    return (char) 23383;
                }
                return upperCase;
            }
            return upperCase;
        }
        return '?';
    }

    /* renamed from: d */
    private static boolean m4911d(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: b */
    private static char m4913b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Build.VERSION.SDK_INT < 9 || ' ' != Normalizer.normalize(String.valueOf(charAt), Normalizer.Form.NFKD).charAt(0)) {
                return "zh_CN".equalsIgnoreCase(Locale.getDefault().toString()) ? m4920a(charAt) : charAt;
            }
        }
        return ' ';
    }

    /* renamed from: e */
    private static boolean m4910e(char c) {
        return c >= 19968 && c <= 40891;
    }

    /* renamed from: a */
    public static ArrayList<C2690c> m4916a(ArrayList<InterfaceC2688a> arrayList) {
        C2689b c2689b = new C2689b();
        Iterator<InterfaceC2688a> it = arrayList.iterator();
        while (it.hasNext()) {
            c2689b.m4901a(it.next());
        }
        final Collator collator = Collator.getInstance(Locale.getDefault());
        Collections.sort(c2689b, new Comparator<C2690c>() { // from class: com.tsf.shell.f.f.a.a.b.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(C2690c c2690c, C2690c c2690c2) {
                return collator.compare(c2690c.m4897a(), c2690c2.m4897a());
            }
        });
        return c2689b;
    }

    /* renamed from: a */
    public static String m4919a(InterfaceC2688a interfaceC2688a) {
        return Character.toString(m4918a(interfaceC2688a.mo3099r_()));
    }

    /* renamed from: a */
    public static C2690c m4917a(String str, InterfaceC2688a interfaceC2688a) {
        C2690c c2690c = new C2690c(str);
        c2690c.m4894b().add(interfaceC2688a);
        return c2690c;
    }

    /* renamed from: a */
    public static int m4915a(ArrayList<C2684c> arrayList, C2683b c2683b) {
        final Collator collator = Collator.getInstance(Locale.getDefault());
        arrayList.add(c2683b);
        Collections.sort(arrayList, new Comparator<C2684c>() { // from class: com.tsf.shell.f.f.a.a.b.2
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(C2684c c2684c, C2684c c2684c2) {
                if ((c2684c instanceof C2683b) && (c2684c2 instanceof C2683b)) {
                    return collator.compare(((C2683b) c2684c).m4942g(), ((C2683b) c2684c2).m4942g());
                } else if (!(c2684c instanceof C2683b)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == c2683b) {
                return i;
            }
        }
        return 0;
    }
}
