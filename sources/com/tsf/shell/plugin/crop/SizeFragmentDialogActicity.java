package com.tsf.shell.plugin.crop;

import android.os.Bundle;
import android.support.p002v4.app.DialogInterface$OnCancelListenerC0090k;
import android.support.p002v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tsf.shell.plugin.crop.C3793e;
/* loaded from: classes.dex */
public class SizeFragmentDialogActicity extends FragmentActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.support.p002v4.app.AbstractActivityC0087h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new C3786a().m13634a(m13715f().mo13569a(), "dialog");
    }

    /* renamed from: com.tsf.shell.plugin.crop.SizeFragmentDialogActicity$a */
    /* loaded from: classes.dex */
    public static class C3786a extends DialogInterface$OnCancelListenerC0090k {

        /* renamed from: ai */
        private View f12429ai;

        public C3786a() {
            m13637a(1, 0);
        }

        @Override // android.support.p002v4.app.DialogInterface$OnCancelListenerC0090k, android.support.p002v4.app.Fragment
        /* renamed from: a */
        public void mo782a(Bundle bundle) {
            super.mo782a(bundle);
        }

        @Override // android.support.p002v4.app.Fragment
        /* renamed from: a */
        public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.f12429ai = layoutInflater.inflate(C3793e.C3795b.crop_size_dialog_layout, viewGroup);
            return this.f12429ai;
        }
    }
}
