package com.tsf.shell.plugin.crop;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tsf.shell.plugin.crop.CropImageResources;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SizeFragmentDialogActicity extends FragmentActivity {
    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new CropImageParser().a(f().a(), "dialog");
    }

    public static class a extends CropImageContract {
        private View ai;

        public a() {
            a(1, 0);
        }

        @Override // android.support.v4.app.k, android.support.v4.app.Fragment
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // android.support.v4.app.Fragment
        public View c() {
            this.ai = layoutInflater.inflate(CropImageResources.b.crop_size_dialog_layout, viewGroup);
            return this.ai;
        }
    }
}
