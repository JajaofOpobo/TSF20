package com.flurry.android;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import org.apache.http.HttpResponse;

/* loaded from: classes.dex */
final class am extends AsyncTask {
    private final String a = getClass().getSimpleName();
    private Context b;
    private String c;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    public am(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:7|(2:9|(3:11|(1:33)(2:13|(3:30|31|32)(2:15|(2:26|27)(2:19|(2:21|22)(1:24))))|23))|34|35|36|38|23) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        r2.getMessage();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a() {
        boolean e;
        boolean d;
        for (int i = 0; i < 5; i++) {
            try {
                if (Uri.parse(this.c).getScheme().equals("http")) {
                    e = s.e(this.b);
                    if (e) {
                        d = s.d(this.b);
                        if (!d) {
                            HttpResponse a = bp.a(this.c, false);
                            if (a == null) {
                                continue;
                            } else {
                                int statusCode = a.getStatusLine().getStatusCode();
                                if (statusCode == 200) {
                                    String str = "Redirect URL found for: " + this.c;
                                    return this.c;
                                }
                                if (statusCode >= 300 && statusCode < 400) {
                                    String str2 = "NumRedirects: " + (i + 1);
                                    if (a.containsHeader("Location")) {
                                        this.c = a.getFirstHeader("Location").getValue();
                                    }
                                } else {
                                    String str3 = "Bad Response status code: " + statusCode;
                                    return null;
                                }
                            }
                        }
                    }
                    Thread.sleep(100L);
                } else {
                    if (s.a(this.b, this.c, "android.intent.action.VIEW")) {
                        return this.c;
                    }
                    return null;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
