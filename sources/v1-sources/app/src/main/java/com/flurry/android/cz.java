package com.flurry.android;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes.dex */
final class cz extends AsyncTask {
    private /* synthetic */ s a;

    cz(s sVar) {
        this.a = sVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: Throwable -> 0x005b, TRY_LEAVE, TryCatch #0 {Throwable -> 0x005b, blocks: (B:17:0x002e, B:19:0x0036), top: B:16:0x002e, outer: #3 }] */
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
            file = this.a.k;
            try {
                if (file.exists()) {
                    try {
                        file3 = this.a.k;
                        dataInputStream = new DataInputStream(new FileInputStream(file3));
                        try {
                            if (dataInputStream.readUnsignedShort() == 46586) {
                                this.a.a(dataInputStream);
                            }
                            bp.a(dataInputStream);
                        } catch (Throwable th) {
                            th = th;
                            Cdo.b(s.a, "Error when loading persistent file", th);
                            bp.a(dataInputStream);
                            z = this.a.i;
                            if (!z) {
                            }
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dataInputStream = null;
                    }
                    try {
                        z = this.a.i;
                        if (!z) {
                            file2 = this.a.k;
                            if (!file2.delete()) {
                            }
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
