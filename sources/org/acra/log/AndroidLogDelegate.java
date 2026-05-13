package org.acra.log;

import android.util.Log;
/* loaded from: classes.dex */
public final class AndroidLogDelegate implements ACRALog {
    @Override // org.acra.log.ACRALog
    /* renamed from: v */
    public int mo5v(String str, String str2) {
        return Log.v(str, str2);
    }

    @Override // org.acra.log.ACRALog
    /* renamed from: v */
    public int mo4v(String str, String str2, Throwable th) {
        return Log.v(str, str2, th);
    }

    @Override // org.acra.log.ACRALog
    /* renamed from: d */
    public int mo11d(String str, String str2) {
        return Log.d(str, str2);
    }

    @Override // org.acra.log.ACRALog
    /* renamed from: d */
    public int mo10d(String str, String str2, Throwable th) {
        return Log.d(str, str2, th);
    }

    @Override // org.acra.log.ACRALog
    /* renamed from: i */
    public int mo7i(String str, String str2) {
        return Log.i(str, str2);
    }

    @Override // org.acra.log.ACRALog
    /* renamed from: i */
    public int mo6i(String str, String str2, Throwable th) {
        return Log.i(str, str2, th);
    }

    @Override // org.acra.log.ACRALog
    /* renamed from: w */
    public int mo3w(String str, String str2) {
        return Log.w(str, str2);
    }

    @Override // org.acra.log.ACRALog
    /* renamed from: w */
    public int mo2w(String str, String str2, Throwable th) {
        return Log.w(str, str2, th);
    }

    @Override // org.acra.log.ACRALog
    /* renamed from: w */
    public int mo1w(String str, Throwable th) {
        return Log.w(str, th);
    }

    @Override // org.acra.log.ACRALog
    /* renamed from: e */
    public int mo9e(String str, String str2) {
        return Log.e(str, str2);
    }

    @Override // org.acra.log.ACRALog
    /* renamed from: e */
    public int mo8e(String str, String str2, Throwable th) {
        return Log.e(str, str2, th);
    }

    @Override // org.acra.log.ACRALog
    public String getStackTraceString(Throwable th) {
        return Log.getStackTraceString(th);
    }
}
