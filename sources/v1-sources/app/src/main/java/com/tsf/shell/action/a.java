package com.tsf.shell.action;

import android.database.Cursor;
import com.tsf.shell.R;
import com.tsf.shell.bx;

/* loaded from: classes.dex */
public final class a {
    public static b a(int i) {
        b bVar;
        try {
            Cursor query = com.censivn.C3DEngine.a.c().getContentResolver().query(bx.b, new String[]{"action", "name", "intent"}, "action=" + i, null, "_id desc");
            if (query.moveToFirst()) {
                String string = query.getString(query.getColumnIndex("name"));
                String string2 = query.getString(query.getColumnIndex("intent"));
                query.close();
                bVar = new b(i, string, string2);
            } else {
                query.close();
                bVar = new b(i, com.censivn.C3DEngine.h.a.c(R.string.none), "");
            }
            return bVar;
        } catch (Exception e) {
            return new b(i, com.censivn.C3DEngine.h.a.c(R.string.none), "");
        }
    }
}
