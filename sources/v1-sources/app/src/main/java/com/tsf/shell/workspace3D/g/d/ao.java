package com.tsf.shell.workspace3D.g.d;

import android.database.Cursor;
import com.tsf.shell.cd;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ao {
    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Cursor query = com.censivn.C3DEngine.a.c().getContentResolver().query(cd.a, null, null, null, null);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("intent");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("title");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("data");
            while (query.moveToNext()) {
                try {
                    long j = query.getLong(columnIndexOrThrow);
                    String string = query.getString(columnIndexOrThrow3);
                    String string2 = query.getString(columnIndexOrThrow2);
                    byte[] blob = query.getBlob(columnIndexOrThrow4);
                    p pVar = new p();
                    if (pVar.a(j, string, string2, blob)) {
                        arrayList.add(pVar);
                        if (arrayList.size() >= 6) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (Exception e) {
                }
            }
            return arrayList;
        } finally {
            query.close();
        }
    }
}
