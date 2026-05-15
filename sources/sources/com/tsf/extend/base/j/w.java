package com.tsf.extend.base.j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class w {
    private static boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public static <T> T a(String str, Object obj, Class<T> cls, Class[] clsArr, Object[] objArr) {
        if (a(str) || obj == null) {
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
