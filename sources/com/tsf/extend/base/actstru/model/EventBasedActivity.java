package com.tsf.extend.base.actstru.model;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
/* loaded from: classes.dex */
public class EventBasedActivity extends Activity implements InterfaceC1356e {

    /* renamed from: a */
    boolean f4230a = true;

    /* renamed from: b */
    boolean f4231b = true;

    /* renamed from: c */
    protected Handler f4232c = new Handler() { // from class: com.tsf.extend.base.actstru.model.EventBasedActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (EventBasedActivity.this.f4231b && !EventBasedActivity.this.m8943a(message)) {
                super.handleMessage(message);
            }
        }
    };

    /* renamed from: a */
    protected boolean m8943a(Message message) {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.InterfaceC1356e
    /* renamed from: a */
    public final void mo8908a(final C1355d c1355d) {
        runOnUiThread(new Runnable() { // from class: com.tsf.extend.base.actstru.model.EventBasedActivity.2
            @Override // java.lang.Runnable
            public void run() {
                EventBasedActivity.this.m8942b(c1355d);
            }
        });
    }

    /* renamed from: b */
    protected void m8942b(C1355d c1355d) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1345a.m8941a().m8940a("ui", this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f4230a) {
            C1345a.m8941a().m8939b("ui", this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f4230a) {
            C1345a.m8941a().m8940a("ui", this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C1345a.m8941a().m8939b("ui", this);
    }
}
