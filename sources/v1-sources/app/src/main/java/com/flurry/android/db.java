package com.flurry.android;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes.dex */
final class db extends AsyncTask {
    private /* synthetic */ s a;

    db(s sVar) {
        this.a = sVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: Throwable -> 0x005a, TRY_LEAVE, TryCatch #0 {Throwable -> 0x005a, blocks: (B:14:0x0025, B:16:0x002d, B:20:0x0052), top: B:13:0x0025, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: Throwable -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Throwable -> 0x005a, blocks: (B:14:0x0025, B:16:0x002d, B:20:0x0052), top: B:13:0x0025, outer: #5 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005b -> B:18:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Void a() {
        File file;
        DataInputStream dataInputStream;
        boolean z;
        File file2;
        File file3;
        try {
            file = this.a.l;
            try {
                if (file.exists()) {
                    try {
                        file3 = this.a.l;
                        dataInputStream = new DataInputStream(new FileInputStream(file3));
                        try {
                            this.a.b(dataInputStream);
                            bp.a(dataInputStream);
                        } catch (Throwable th) {
                            th = th;
                            Cdo.b(s.a, "Error when loading persistent freqCap file", th);
                            bp.a(dataInputStream);
                            z = this.a.j;
                            if (z) {
                            }
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dataInputStream = null;
                        bp.a(dataInputStream);
                        throw th;
                    }
                    try {
                        z = this.a.j;
                        if (z) {
                            file2 = this.a.l;
                            if (!file2.delete()) {
                            }
                        } else {
                            this.a.d.c();
                        }
                    } catch (Throwable th3) {
                        Cdo.b(s.a, "", th3);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        return null;
    }
}
