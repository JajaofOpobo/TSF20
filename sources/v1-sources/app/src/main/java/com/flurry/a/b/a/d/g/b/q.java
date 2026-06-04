package com.flurry.a.b.a.d.g.b;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class q extends y implements com.flurry.a.b.a.d.ar {
    protected final boolean a;
    protected final com.flurry.a.b.a.g.a b;
    protected com.flurry.a.b.a.d.ac c;
    protected com.flurry.a.b.a.d.g.a.d d;

    @Override // com.flurry.a.b.a.d.g.b.y
    public final /* synthetic */ void b(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        Object obj2 = null;
        int i = 0;
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length != 0) {
            if (this.c != null) {
                com.flurry.a.b.a.d.ac acVar = this.c;
                int length2 = objArr.length;
                com.flurry.a.b.a.d.az azVar = this.e;
                while (i < length2) {
                    try {
                        obj2 = objArr[i];
                        if (obj2 == null) {
                            awVar.a(eVar);
                        } else if (azVar == null) {
                            acVar.a(obj2, eVar, awVar);
                        } else {
                            acVar.a(obj2, eVar, awVar, azVar);
                        }
                        i++;
                    } catch (IOException e) {
                        throw e;
                    } catch (Exception e2) {
                        e = e2;
                        while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                            e = e.getCause();
                        }
                        if (!(e instanceof Error)) {
                            throw com.flurry.a.b.a.d.y.a(e, obj2, i);
                        }
                        throw ((Error) e);
                    }
                }
                return;
            }
            if (this.e != null) {
                int length3 = objArr.length;
                com.flurry.a.b.a.d.az azVar2 = this.e;
                try {
                    com.flurry.a.b.a.d.g.a.d dVar = this.d;
                    while (i < length3) {
                        obj2 = objArr[i];
                        if (obj2 == null) {
                            awVar.a(eVar);
                        } else {
                            Class<?> cls = obj2.getClass();
                            com.flurry.a.b.a.d.ac a = dVar.a(cls);
                            if (a == null) {
                                a = a(dVar, cls, awVar);
                            }
                            a.a(obj2, eVar, awVar, azVar2);
                        }
                        i++;
                    }
                    return;
                } catch (IOException e3) {
                    throw e3;
                } catch (Exception e4) {
                    e = e4;
                    while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                        e = e.getCause();
                    }
                    if (!(e instanceof Error)) {
                        throw com.flurry.a.b.a.d.y.a(e, obj2, i);
                    }
                    throw ((Error) e);
                }
            }
            try {
                com.flurry.a.b.a.d.g.a.d dVar2 = this.d;
                while (i < length) {
                    obj2 = objArr[i];
                    if (obj2 == null) {
                        awVar.a(eVar);
                    } else {
                        Class<?> cls2 = obj2.getClass();
                        com.flurry.a.b.a.d.ac a2 = dVar2.a(cls2);
                        if (a2 == null) {
                            if (this.b.e()) {
                                com.flurry.a.b.a.d.g.a.h a3 = dVar2.a(awVar.a(this.b, cls2), awVar, this.f);
                                if (dVar2 != a3.b) {
                                    this.d = a3.b;
                                }
                                a2 = a3.a;
                            } else {
                                a2 = a(dVar2, cls2, awVar);
                            }
                        }
                        a2.a(obj2, eVar, awVar);
                    }
                    i++;
                }
            } catch (IOException e5) {
                throw e5;
            } catch (Exception e6) {
                e = e6;
                while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                    e = e.getCause();
                }
                if (!(e instanceof Error)) {
                    throw com.flurry.a.b.a.d.y.a(e, obj2, i);
                }
                throw ((Error) e);
            }
        }
    }

    public q(com.flurry.a.b.a.g.a aVar, boolean z, com.flurry.a.b.a.d.az azVar, com.flurry.a.b.a.d.f fVar, com.flurry.a.b.a.d.ac acVar) {
        super(Object[].class, azVar, fVar);
        this.b = aVar;
        this.a = z;
        this.d = com.flurry.a.b.a.d.g.a.d.a();
        this.c = acVar;
    }

    @Override // com.flurry.a.b.a.d.g.b.e
    public final e a(com.flurry.a.b.a.d.az azVar) {
        return new q(this.b, this.a, azVar, this.f, this.c);
    }

    @Override // com.flurry.a.b.a.d.ar
    public final void a(com.flurry.a.b.a.d.aw awVar) {
        if (this.a && this.c == null) {
            this.c = awVar.a(this.b, this.f);
        }
    }

    private com.flurry.a.b.a.d.ac a(com.flurry.a.b.a.d.g.a.d dVar, Class cls, com.flurry.a.b.a.d.aw awVar) {
        com.flurry.a.b.a.d.g.a.h a = dVar.a(cls, awVar, this.f);
        if (dVar != a.b) {
            this.d = a.b;
        }
        return a.a;
    }
}
