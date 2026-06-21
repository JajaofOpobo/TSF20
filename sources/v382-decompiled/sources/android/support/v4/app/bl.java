package android.support.v4.app;

import android.app.RemoteInput;

/* loaded from: classes.dex */
class bl {
    static RemoteInput[] a(bn[] bnVarArr) {
        if (bnVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[bnVarArr.length];
        for (int i = 0; i < bnVarArr.length; i++) {
            bn bnVar = bnVarArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(bnVar.a()).setLabel(bnVar.b()).setChoices(bnVar.c()).setAllowFreeFormInput(bnVar.d()).addExtras(bnVar.e()).build();
        }
        return remoteInputArr;
    }
}
