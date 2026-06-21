package com.tsf.shell.plugin.themepicker.utils;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
class c extends Handler {
    private c() {
    }

    /* synthetic */ c(c cVar) {
        this();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        b bVar = (b) message.obj;
        switch (message.what) {
            case 1:
                bVar.a.e(bVar.b[0]);
                break;
            case 2:
                bVar.a.b(bVar.b);
                break;
        }
    }
}
