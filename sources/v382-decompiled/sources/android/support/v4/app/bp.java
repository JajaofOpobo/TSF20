package android.support.v4.app;

import android.os.Bundle;

/* loaded from: classes.dex */
class bp {
    static Bundle a(bn bnVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", bnVar.a());
        bundle.putCharSequence("label", bnVar.b());
        bundle.putCharSequenceArray("choices", bnVar.c());
        bundle.putBoolean("allowFreeFormInput", bnVar.d());
        bundle.putBundle("extras", bnVar.e());
        return bundle;
    }

    static Bundle[] a(bn[] bnVarArr) {
        if (bnVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[bnVarArr.length];
        for (int i = 0; i < bnVarArr.length; i++) {
            bundleArr[i] = a(bnVarArr[i]);
        }
        return bundleArr;
    }
}
