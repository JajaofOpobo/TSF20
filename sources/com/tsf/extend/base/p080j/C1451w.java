package com.tsf.extend.base.p080j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: com.tsf.extend.base.j.w */
/* loaded from: classes.dex */
public class C1451w {
    /* renamed from: a */
    private static boolean m8583a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    public static <T> T m8582a(String str, Object obj, Class<T> cls, Class[] clsArr, Object[] objArr) {
        if (m8583a(str) || obj == null) {
            throw new NullPointerException("reflect method or receiver is null");
        }
        if (clsArr == null && objArr != null) {
            throw new IllegalArgumentException("illegal agument");
        }
        if (clsArr != null && objArr != null && objArr.length != clsArr.length) {
            throw new IllegalArgumentException("illegal aguments count");
        }
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return (T) declaredMethod.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
