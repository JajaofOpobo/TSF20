package com.tsf.extend.theme.diy;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import com.tsf.extend.base.d.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d implements a.InterfaceC0048a<Pair<String, Bitmap>> {
    private a a;

    public interface a {
        void a(Bitmap bitmap);
    }

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
    public void a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
        if (pair == null) {
            a(jSONObject, 0, (Pair<String, Bitmap>) null);
            return;
        }
        String str = (String) pair.first;
        Bitmap bitmap = (Bitmap) pair.second;
        if (!TextUtils.isEmpty(str) && bitmap != null && this.a != null) {
            this.a.a(bitmap);
        }
    }

    @Override // com.tsf.extend.base.d.a.InterfaceC0048a
    public void a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
        if (this.a != null) {
            this.a.a(null);
        }
    }
}
