package com.tsf.extend.base.actstru.model;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class EventBasedActivity extends Activity implements e {
    boolean a = true;
    boolean b = true;
    protected Handler c = new Handler() { // from class: com.tsf.extend.base.actstru.model.EventBasedActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (EventBasedActivity.this.b && !EventBasedActivity.this.a(message)) {
                super.handleMessage(message);
            }
        }
    };

    protected boolean a(Message message) {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.e
    public final void a(final d dVar) {
        runOnUiThread(new Runnable() { // from class: com.tsf.extend.base.actstru.model.EventBasedActivity.2
            @Override // java.lang.Runnable
            public void run() {
                EventBasedActivity.this.b(dVar);
            }
        });
    }

    protected void b(d dVar) {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.a().a("ui", this);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.a) {
            a.a().b("ui", this);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.a) {
            a.a().a("ui", this);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        a.a().b("ui", this);
    }
}
