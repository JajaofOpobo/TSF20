package com.tsf.extend.theme.diy;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import com.tsf.extend.base.p074d.AbstractC1386a;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.theme.diy.d */
/* loaded from: classes.dex */
public class C1819d implements AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> {

    /* renamed from: a */
    private InterfaceC1820a f5865a;

    /* renamed from: com.tsf.extend.theme.diy.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1820a {
        /* renamed from: a */
        void mo7009a(Bitmap bitmap);
    }

    public C1819d(InterfaceC1820a interfaceC1820a) {
        this.f5865a = interfaceC1820a;
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo6245a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
        if (pair == null) {
            mo6247a(jSONObject, 0, (Pair<String, Bitmap>) null);
            return;
        }
        Bitmap bitmap = (Bitmap) pair.second;
        if (!TextUtils.isEmpty((String) pair.first) && bitmap != null && this.f5865a != null) {
            this.f5865a.mo7009a(bitmap);
        }
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo6247a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
        if (this.f5865a != null) {
            this.f5865a.mo7009a(null);
        }
    }
}
