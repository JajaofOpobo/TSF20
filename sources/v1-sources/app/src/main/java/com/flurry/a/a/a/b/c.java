package com.flurry.a.a.a.b;

import com.flurry.a.a.a.ad;
import com.flurry.a.a.a.ag;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c {
    private static final c a = new c();
    private static final com.flurry.a.a.a.c b = com.flurry.a.a.a.c.a(ad.STRING);

    public static c a() {
        return a;
    }

    protected c() {
    }

    public com.flurry.a.a.a.c.o a(com.flurry.a.a.a.c cVar) {
        return new j(cVar, cVar, this);
    }

    public final String a(Object obj) {
        StringBuilder sb = new StringBuilder();
        a(obj, sb);
        return sb.toString();
    }

    private void a(Object obj, StringBuilder sb) {
        int i = 0;
        if (obj instanceof r) {
            sb.append("{");
            com.flurry.a.a.a.c d = d(obj);
            Iterator it = d.b().iterator();
            while (true) {
                int i2 = i;
                if (it.hasNext()) {
                    com.flurry.a.a.a.m mVar = (com.flurry.a.a.a.m) it.next();
                    a(mVar.a(), sb);
                    sb.append(": ");
                    mVar.a();
                    a(b(obj, mVar.b()), sb);
                    i = i2 + 1;
                    if (i < d.b().size()) {
                        sb.append(", ");
                    }
                } else {
                    sb.append("}");
                    return;
                }
            }
        } else {
            if (obj instanceof Collection) {
                sb.append("[");
                long size = r8.size() - 1;
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    a(it2.next(), sb);
                    int i3 = i + 1;
                    if (i < size) {
                        sb.append(", ");
                    }
                    i = i3;
                }
                sb.append("]");
                return;
            }
            if (obj instanceof Map) {
                sb.append("{");
                Map map = (Map) obj;
                Iterator it3 = map.entrySet().iterator();
                while (true) {
                    int i4 = i;
                    if (it3.hasNext()) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        a(entry.getKey(), sb);
                        sb.append(": ");
                        a(entry.getValue(), sb);
                        i = i4 + 1;
                        if (i < map.size()) {
                            sb.append(", ");
                        }
                    } else {
                        sb.append("}");
                        return;
                    }
                }
            } else {
                if ((obj instanceof CharSequence) || (obj instanceof o)) {
                    sb.append("\"");
                    String obj2 = obj.toString();
                    for (int i5 = 0; i5 < obj2.length(); i5++) {
                        char charAt = obj2.charAt(i5);
                        switch (charAt) {
                            case ThemeParser.TYPE_FOLDER /* 8 */:
                                sb.append("\\b");
                                break;
                            case '\t':
                                sb.append("\\t");
                                break;
                            case '\n':
                                sb.append("\\n");
                                break;
                            case '\f':
                                sb.append("\\f");
                                break;
                            case '\r':
                                sb.append("\\r");
                                break;
                            case '\"':
                                sb.append("\\\"");
                                break;
                            case '/':
                                sb.append("\\/");
                                break;
                            case '\\':
                                sb.append("\\\\");
                                break;
                            default:
                                if ((charAt < 0 || charAt > 31) && ((charAt < 127 || charAt > 159) && (charAt < 8192 || charAt > 8447))) {
                                    sb.append(charAt);
                                    break;
                                } else {
                                    Integer.toHexString(charAt);
                                    sb.append("\\u");
                                    for (int i6 = 0; i6 < 4 - sb.length(); i6++) {
                                        sb.append('0');
                                    }
                                    sb.append(obj2.toUpperCase());
                                    break;
                                }
                        }
                    }
                    sb.append("\"");
                    return;
                }
                if (obj instanceof ByteBuffer) {
                    sb.append("{\"bytes\": \"");
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    for (int position = byteBuffer.position(); position < byteBuffer.limit(); position++) {
                        sb.append((char) byteBuffer.get(position));
                    }
                    sb.append("\"}");
                    return;
                }
                sb.append(obj);
            }
        }
    }

    private static Object b(Object obj, int i) {
        return ((r) obj).a(i);
    }

    protected static Object b() {
        return null;
    }

    protected static void a(Object obj, int i, Object obj2) {
        ((r) obj).a(i, obj2);
    }

    protected static Object a(Object obj, int i) {
        return b(obj, i);
    }

    public final int a(com.flurry.a.a.a.c cVar, Object obj) {
        String a2;
        if (obj == null) {
            a2 = ad.NULL.a();
        } else if (obj instanceof r) {
            a2 = d(obj).g();
        } else if (b(obj)) {
            a2 = c(obj).g();
        } else if (obj instanceof Collection) {
            a2 = ad.ARRAY.a();
        } else if (obj instanceof Map) {
            a2 = ad.MAP.a();
        } else if (obj instanceof p) {
            a2 = ((b) obj).a().g();
        } else if (obj instanceof CharSequence) {
            a2 = ad.STRING.a();
        } else if (obj instanceof ByteBuffer) {
            a2 = ad.BYTES.a();
        } else if (obj instanceof Integer) {
            a2 = ad.INT.a();
        } else if (obj instanceof Long) {
            a2 = ad.LONG.a();
        } else if (obj instanceof Float) {
            a2 = ad.FLOAT.a();
        } else if (obj instanceof Double) {
            a2 = ad.DOUBLE.a();
        } else {
            if (!(obj instanceof Boolean)) {
                throw new com.flurry.a.a.a.a("Unknown datum type: " + obj);
            }
            a2 = ad.BOOLEAN.a();
        }
        Integer e = cVar.e(a2);
        if (e != null) {
            return e.intValue();
        }
        throw new ag(cVar, obj);
    }

    private static com.flurry.a.a.a.c d(Object obj) {
        return ((b) obj).a();
    }

    protected boolean b(Object obj) {
        return obj instanceof o;
    }

    protected com.flurry.a.a.a.c c(Object obj) {
        return ((b) obj).a();
    }

    public final int a(Object obj, com.flurry.a.a.a.c cVar) {
        Object obj2 = obj;
        while (obj2 != null) {
            int i = 1;
            switch (d.a[cVar.a().ordinal()]) {
                case 1:
                    for (com.flurry.a.a.a.m mVar : cVar.b()) {
                        if (mVar.f() != com.flurry.a.a.a.n.IGNORE) {
                            mVar.a();
                            i = a(i, b(obj2, mVar.b()), mVar.c());
                        }
                    }
                    return i;
                case 2:
                    return cVar.c(obj2.toString());
                case 3:
                    Collection collection = (Collection) obj2;
                    com.flurry.a.a.a.c i2 = cVar.i();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        i = a(i, it.next(), i2);
                    }
                    return i;
                case 4:
                case 6:
                case ThemeParser.TYPE_FOLDER /* 8 */:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                default:
                    return obj2.hashCode();
                case 5:
                    cVar = (com.flurry.a.a.a.c) cVar.k().get(a(cVar, obj2));
                case R.styleable.CellLayout_longAxisCells /* 7 */:
                    if (!(obj2 instanceof com.flurry.a.a.a.e.a)) {
                        obj2 = new com.flurry.a.a.a.e.a(obj2.toString());
                    }
                    return obj2.hashCode();
                case 14:
                    return 0;
            }
        }
        return 0;
    }

    private int a(int i, Object obj, com.flurry.a.a.a.c cVar) {
        return (i * 31) + a(obj, cVar);
    }

    public final int a(Object obj, Object obj2, com.flurry.a.a.a.c cVar) {
        return a(obj, obj2, cVar, false);
    }

    protected int a(Object obj, Object obj2, com.flurry.a.a.a.c cVar, boolean z) {
        if (obj == obj2) {
            return 0;
        }
        switch (d.a[cVar.a().ordinal()]) {
            case 1:
                for (com.flurry.a.a.a.m mVar : cVar.b()) {
                    if (mVar.f() != com.flurry.a.a.a.n.IGNORE) {
                        int b2 = mVar.b();
                        mVar.a();
                        int a2 = a(b(obj, b2), b(obj2, b2), mVar.c(), z);
                        if (a2 != 0) {
                            return mVar.f() == com.flurry.a.a.a.n.DESCENDING ? -a2 : a2;
                        }
                    }
                }
                return 0;
            case 2:
                return cVar.c(obj.toString()) - cVar.c(obj2.toString());
            case 3:
                Iterator it = ((Collection) obj).iterator();
                Iterator it2 = ((Collection) obj2).iterator();
                com.flurry.a.a.a.c i = cVar.i();
                while (it.hasNext() && it2.hasNext()) {
                    int a3 = a(it.next(), it2.next(), i, z);
                    if (a3 != 0) {
                        return a3;
                    }
                }
                if (it.hasNext()) {
                    return 1;
                }
                return it2.hasNext() ? -1 : 0;
            case 4:
                if (z) {
                    return ((Map) obj).equals(obj2) ? 0 : 1;
                }
                throw new com.flurry.a.a.a.a("Can't compare maps!");
            case 5:
                int a4 = a(cVar, obj);
                int a5 = a(cVar, obj2);
                return a4 == a5 ? a(obj, obj2, (com.flurry.a.a.a.c) cVar.k().get(a4), z) : a4 - a5;
            case 6:
            case ThemeParser.TYPE_FOLDER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                return ((Comparable) obj).compareTo(obj2);
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                return (obj instanceof com.flurry.a.a.a.e.a ? (com.flurry.a.a.a.e.a) obj : new com.flurry.a.a.a.e.a(obj.toString())).compareTo(obj2 instanceof com.flurry.a.a.a.e.a ? (com.flurry.a.a.a.e.a) obj2 : new com.flurry.a.a.a.e.a(obj2.toString()));
            case 14:
                return 0;
        }
    }

    public final Object b(com.flurry.a.a.a.c cVar, Object obj) {
        while (obj != null) {
            switch (d.a[cVar.a().ordinal()]) {
                case 1:
                    r rVar = (r) obj;
                    r rVar2 = (r) c(null, cVar);
                    for (com.flurry.a.a.a.m mVar : cVar.b()) {
                        rVar2.a(mVar.b(), b(mVar.c(), rVar.a(mVar.b())));
                    }
                    return rVar2;
                case 2:
                    return obj;
                case 3:
                    List list = (List) obj;
                    e eVar = new e(list.size(), cVar);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        eVar.add(b(cVar.i(), it.next()));
                    }
                    return eVar;
                case 4:
                    Map map = (Map) obj;
                    HashMap hashMap = new HashMap(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        hashMap.put((CharSequence) b(b, entry.getKey()), b(cVar.j(), entry.getValue()));
                    }
                    return hashMap;
                case 5:
                    cVar = (com.flurry.a.a.a.c) cVar.k().get(a(cVar, obj));
                case 6:
                    byte[] b2 = ((p) obj).b();
                    p pVar = (p) b((Object) null, cVar);
                    System.arraycopy(b2, 0, pVar.b(), 0, cVar.l());
                    return pVar;
                case R.styleable.CellLayout_longAxisCells /* 7 */:
                    if (!(obj instanceof String)) {
                        if (obj instanceof com.flurry.a.a.a.e.a) {
                            return new com.flurry.a.a.a.e.a((com.flurry.a.a.a.e.a) obj);
                        }
                        return new com.flurry.a.a.a.e.a(obj.toString());
                    }
                    return obj;
                case ThemeParser.TYPE_FOLDER /* 8 */:
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    byte[] bArr = new byte[byteBuffer.capacity()];
                    byteBuffer.rewind();
                    byteBuffer.get(bArr);
                    byteBuffer.rewind();
                    return ByteBuffer.wrap(bArr);
                case 9:
                    return new Integer(((Integer) obj).intValue());
                case 10:
                    return new Long(((Long) obj).longValue());
                case 11:
                    return new Float(((Float) obj).floatValue());
                case 12:
                    return new Double(((Double) obj).doubleValue());
                case 13:
                    return new Boolean(((Boolean) obj).booleanValue());
                case 14:
                    return null;
                default:
                    throw new com.flurry.a.a.a.a("Deep copy failed for schema \"" + cVar + "\" and value \"" + obj + "\"");
            }
        }
        return null;
    }

    public Object b(Object obj, com.flurry.a.a.a.c cVar) {
        return ((obj instanceof p) && ((p) obj).b().length == cVar.l()) ? obj : new h(cVar);
    }

    public Object c(Object obj, com.flurry.a.a.a.c cVar) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (rVar.a() == cVar) {
                return rVar;
            }
        }
        return new i(cVar);
    }
}
