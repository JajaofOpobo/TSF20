package org.acra.log;
/* loaded from: classes.dex */
public interface ACRALog {
    /* renamed from: d */
    int mo11d(String str, String str2);

    /* renamed from: d */
    int mo10d(String str, String str2, Throwable th);

    /* renamed from: e */
    int mo9e(String str, String str2);

    /* renamed from: e */
    int mo8e(String str, String str2, Throwable th);

    String getStackTraceString(Throwable th);

    /* renamed from: i */
    int mo7i(String str, String str2);

    /* renamed from: i */
    int mo6i(String str, String str2, Throwable th);

    /* renamed from: v */
    int mo5v(String str, String str2);

    /* renamed from: v */
    int mo4v(String str, String str2, Throwable th);

    /* renamed from: w */
    int mo3w(String str, String str2);

    /* renamed from: w */
    int mo2w(String str, String str2, Throwable th);

    /* renamed from: w */
    int mo1w(String str, Throwable th);
}
