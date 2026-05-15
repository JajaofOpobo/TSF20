package com.tsf.extend.wallpaper;

import android.content.Intent;
import android.os.Bundle;
import com.tsf.extend.base.actstru.model.activi.CustomActivity;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WallpaperActivity extends CustomActivity {
    @Override // com.tsf.extend.base.actstru.model.EventBasedActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) PersonalizationActivity.class);
        intent.putExtra("target", 1);
        startActivity(intent);
        finish();
    }
}
