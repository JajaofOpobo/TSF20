package com.tsf.shell.plugin.p195a;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.tsf.shell.plugin.a.a */
/* loaded from: classes.dex */
public class C3771a {
    /* renamed from: a */
    public static byte[] m1532a(String str, String str2) {
        byte[] bArr = null;
        if (str2 != null) {
            try {
                if (str2.length() == 16) {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("ASCII"), "AES");
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(2, secretKeySpec, new IvParameterSpec("1234567812345678".getBytes()));
                    try {
                        bArr = cipher.doFinal(C3772b.m1531a(str));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return bArr;
    }
}
