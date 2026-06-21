package com.tsf.shell.widget.alarm.setting;

import android.os.AsyncTask;
import java.util.ArrayList;

/* loaded from: classes.dex */
class f extends AsyncTask {
    final /* synthetic */ PlaceSearchActivity a;

    private f(PlaceSearchActivity placeSearchActivity) {
        this.a = placeSearchActivity;
    }

    /* synthetic */ f(PlaceSearchActivity placeSearchActivity, f fVar) {
        this(placeSearchActivity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ArrayList doInBackground(String... strArr) {
        return com.tsf.shell.widget.alarm.d.a.a.a(strArr[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(ArrayList arrayList) {
        this.a.b.a(arrayList);
        synchronized (this.a) {
            PlaceSearchActivity.a.remove(this);
        }
    }
}
