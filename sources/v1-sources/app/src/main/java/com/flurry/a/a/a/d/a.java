package com.flurry.a.a.a.d;

import com.flurry.a.a.a.ad;
import com.flurry.a.a.a.c.o;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a extends com.flurry.a.a.a.b.c {
    private static final a a = new a();
    private static final Class[] c = new Class[0];
    private static final Class[] d = {com.flurry.a.a.a.c.class};
    private static final Map e = new ConcurrentHashMap();
    private static final Class g = new b().getClass();
    private static final com.flurry.a.a.a.c h = com.flurry.a.a.a.c.a(ad.NULL);
    private final ClassLoader b;
    private Map f;
    private final WeakHashMap i;

    protected a() {
        this(a.class.getClassLoader());
    }

    private a(ClassLoader classLoader) {
        this.f = new ConcurrentHashMap();
        this.i = new WeakHashMap();
        this.b = classLoader;
    }

    @Override // com.flurry.a.a.a.b.c
    public final o a(com.flurry.a.a.a.c cVar) {
        return new e(cVar, cVar, this);
    }

    public static a c() {
        return a;
    }

    @Override // com.flurry.a.a.a.b.c
    protected final boolean b(Object obj) {
        return (obj instanceof Enum) || super.b(obj);
    }

    @Override // com.flurry.a.a.a.b.c
    protected final com.flurry.a.a.a.c c(Object obj) {
        return obj instanceof Enum ? a((Type) obj.getClass()) : super.c(obj);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final java.lang.Class b(com.flurry.a.a.a.c r6) {
        /*
            r5 = this;
            r2 = 0
            r1 = 0
        L2:
            int[] r0 = com.flurry.a.a.a.d.c.a
            com.flurry.a.a.a.ad r3 = r6.a()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            switch(r0) {
                case 1: goto L26;
                case 2: goto L26;
                case 3: goto L26;
                case 4: goto L51;
                case 5: goto L54;
                case 6: goto L57;
                case 7: goto L86;
                case 8: goto L9a;
                case 9: goto L9d;
                case 10: goto La0;
                case 11: goto La3;
                case 12: goto La6;
                case 13: goto La9;
                case 14: goto Lac;
                default: goto L11;
            }
        L11:
            com.flurry.a.a.a.a r0 = new com.flurry.a.a.a.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown type: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L26:
            java.lang.String r1 = r6.g()
            if (r1 != 0) goto L2e
            r0 = r2
        L2d:
            return r0
        L2e:
            java.util.Map r0 = r5.f
            java.lang.Object r0 = r0.get(r1)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L47
            java.lang.ClassLoader r0 = r5.b     // Catch: java.lang.ClassNotFoundException -> L4d
            java.lang.String r3 = c(r6)     // Catch: java.lang.ClassNotFoundException -> L4d
            java.lang.Class r0 = r0.loadClass(r3)     // Catch: java.lang.ClassNotFoundException -> L4d
        L42:
            java.util.Map r3 = r5.f
            r3.put(r1, r0)
        L47:
            java.lang.Class r1 = com.flurry.a.a.a.d.a.g
            if (r0 != r1) goto L2d
            r0 = r2
            goto L2d
        L4d:
            r0 = move-exception
            java.lang.Class r0 = com.flurry.a.a.a.d.a.g
            goto L42
        L51:
            java.lang.Class<java.util.List> r0 = java.util.List.class
            goto L2d
        L54:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            goto L2d
        L57:
            java.util.List r3 = r6.k()
            int r0 = r3.size()
            r4 = 2
            if (r0 != r4) goto L83
            com.flurry.a.a.a.c r0 = com.flurry.a.a.a.d.a.h
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L83
            java.lang.Object r0 = r3.get(r1)
            com.flurry.a.a.a.c r0 = (com.flurry.a.a.a.c) r0
            com.flurry.a.a.a.c r4 = com.flurry.a.a.a.d.a.h
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L81
            r0 = 1
        L79:
            java.lang.Object r0 = r3.get(r0)
            com.flurry.a.a.a.c r0 = (com.flurry.a.a.a.c) r0
            r6 = r0
            goto L2
        L81:
            r0 = r1
            goto L79
        L83:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            goto L2d
        L86:
            java.lang.String r0 = "String"
            java.lang.String r1 = "avro.java.string"
            java.lang.String r1 = r6.a(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L97
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            goto L2d
        L97:
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            goto L2d
        L9a:
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            goto L2d
        L9d:
            java.lang.Class r0 = java.lang.Integer.TYPE
            goto L2d
        La0:
            java.lang.Class r0 = java.lang.Long.TYPE
            goto L2d
        La3:
            java.lang.Class r0 = java.lang.Float.TYPE
            goto L2d
        La6:
            java.lang.Class r0 = java.lang.Double.TYPE
            goto L2d
        La9:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            goto L2d
        Lac:
            java.lang.Class r0 = java.lang.Void.TYPE
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.a.a.a.d.a.b(com.flurry.a.a.a.c):java.lang.Class");
    }

    private static String c(com.flurry.a.a.a.c cVar) {
        String f = cVar.f();
        String d2 = cVar.d();
        if (f == null || "".equals(f)) {
            return d2;
        }
        return f + (f.endsWith("$") ? "" : ".") + d2;
    }

    public final com.flurry.a.a.a.c a(Type type) {
        com.flurry.a.a.a.c cVar = (com.flurry.a.a.a.c) this.i.get(type);
        if (cVar == null) {
            com.flurry.a.a.a.c a2 = a(type, new LinkedHashMap());
            this.i.put(type, a2);
            return a2;
        }
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return com.flurry.a.a.a.c.a(com.flurry.a.a.a.ad.INT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return com.flurry.a.a.a.c.a(com.flurry.a.a.a.ad.NULL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return com.flurry.a.a.a.c.a(com.flurry.a.a.a.ad.BOOLEAN);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return com.flurry.a.a.a.c.a(com.flurry.a.a.a.ad.DOUBLE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        return com.flurry.a.a.a.c.a(com.flurry.a.a.a.ad.FLOAT);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.flurry.a.a.a.c a(Type type, Map map) {
        Type type2 = type;
        while (true) {
            if ((type2 instanceof Class) && CharSequence.class.isAssignableFrom((Class) type2)) {
                return com.flurry.a.a.a.c.a(ad.STRING);
            }
            if (type2 == ByteBuffer.class) {
                return com.flurry.a.a.a.c.a(ad.BYTES);
            }
            if (type2 == Integer.class || type2 == Integer.TYPE) {
                break;
            }
            if (type2 == Long.class || type2 == Long.TYPE) {
                break;
            }
            if (type2 == Float.class || type2 == Float.TYPE) {
                break;
            }
            if (type2 == Double.class || type2 == Double.TYPE) {
                break;
            }
            if (type2 == Boolean.class || type2 == Boolean.TYPE) {
                break;
            }
            if (type2 == Void.class || type2 == Void.TYPE) {
                break;
            }
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type2;
                Class cls = (Class) parameterizedType.getRawType();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (Collection.class.isAssignableFrom(cls)) {
                    if (actualTypeArguments.length != 1) {
                        throw new com.flurry.a.a.a.b("No array type specified.");
                    }
                    return com.flurry.a.a.a.c.a(a(actualTypeArguments[0], map));
                }
                if (Map.class.isAssignableFrom(cls)) {
                    Type type3 = actualTypeArguments[0];
                    Type type4 = actualTypeArguments[1];
                    if (!(type2 instanceof Class) || !CharSequence.class.isAssignableFrom((Class) type2)) {
                        throw new com.flurry.a.a.a.b("Map key class not CharSequence: " + type3);
                    }
                    return com.flurry.a.a.a.c.b(a(type4, map));
                }
                type2 = cls;
            } else {
                if (type2 instanceof Class) {
                    Class cls2 = (Class) type2;
                    String name = cls2.getName();
                    com.flurry.a.a.a.c cVar = (com.flurry.a.a.a.c) map.get(name);
                    if (cVar == null) {
                        try {
                            cVar = (com.flurry.a.a.a.c) cls2.getDeclaredField("SCHEMA$").get(null);
                            if (!name.equals(c(cVar))) {
                                cVar = com.flurry.a.a.a.c.f(cVar.toString().replace(cVar.f(), cls2.getPackage().getName()));
                            }
                        } catch (IllegalAccessException e2) {
                            throw new com.flurry.a.a.a.a(e2);
                        } catch (NoSuchFieldException e3) {
                            throw new com.flurry.a.a.a.a("Not a Specific class: " + cls2);
                        }
                    }
                    map.put(name, cVar);
                    return cVar;
                }
                throw new com.flurry.a.a.a.b("Unknown type: " + type2);
            }
        }
        return com.flurry.a.a.a.c.a(ad.LONG);
    }

    @Override // com.flurry.a.a.a.b.c
    protected final int a(Object obj, Object obj2, com.flurry.a.a.a.c cVar, boolean z) {
        switch (c.a[cVar.a().ordinal()]) {
            case 3:
                if (obj instanceof Enum) {
                    return ((Enum) obj).ordinal() - ((Enum) obj2).ordinal();
                }
                break;
        }
        return super.a(obj, obj2, cVar, z);
    }

    private static Object a(Class cls, com.flurry.a.a.a.c cVar) {
        boolean isAssignableFrom = d.class.isAssignableFrom(cls);
        try {
            Constructor constructor = (Constructor) e.get(cls);
            if (constructor == null) {
                constructor = cls.getDeclaredConstructor(isAssignableFrom ? d : c);
                constructor.setAccessible(true);
                e.put(cls, constructor);
            }
            return constructor.newInstance(isAssignableFrom ? new Object[]{cVar} : null);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.flurry.a.a.a.b.c
    public final Object b(Object obj, com.flurry.a.a.a.c cVar) {
        Class b = a.b(cVar);
        return b == null ? super.b(obj, cVar) : !b.isInstance(obj) ? a(b, cVar) : obj;
    }

    @Override // com.flurry.a.a.a.b.c
    public final Object c(Object obj, com.flurry.a.a.a.c cVar) {
        Class b = a.b(cVar);
        return b == null ? super.c(obj, cVar) : !b.isInstance(obj) ? a(b, cVar) : obj;
    }
}
