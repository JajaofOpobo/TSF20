package com.tsf.shell.activity.tips;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tsf.C1306b;
/* loaded from: classes.dex */
public class TipsDialogActivity extends Activity {

    /* renamed from: a */
    private RelativeLayout f7296a;

    /* renamed from: b */
    private ImageView f7297b;

    /* renamed from: c */
    private TextView f7298c;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1306b.C1313g.tips_layout);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.tsf.shell.activity.tips.TipsDialogActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TipsDialogActivity.this.finish();
            }
        };
        this.f7296a = (RelativeLayout) findViewById(C1306b.C1311e.main_layout);
        this.f7296a.setOnClickListener(onClickListener);
        this.f7297b = (ImageView) findViewById(C1306b.C1311e.tips_image);
        this.f7298c = (TextView) findViewById(C1306b.C1311e.tips_context);
        m6056a(getIntent().getIntExtra("type", -1));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            System.exit(0);
        } catch (Exception e) {
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private void m6056a(int i) {
        switch (i) {
            case 1:
                this.f7297b.setImageResource(C1306b.C1310d.tips_empty_folder_lasso);
                this.f7298c.setText(C1306b.C1315i.tips_empty_folder_lasso);
                return;
            case 2:
                this.f7297b.setImageResource(C1306b.C1310d.tips_folder_lasso_view);
                this.f7298c.setText(C1306b.C1315i.tips_folder_lasso_view);
                return;
            case 5:
                this.f7297b.setImageResource(C1306b.C1310d.tips_lasso_option);
                this.f7298c.setText(C1306b.C1315i.tips_lasso_option);
                return;
            case 12:
                this.f7297b.setImageResource(C1306b.C1310d.tips_music);
                this.f7298c.setText(C1306b.C1315i.tips_music);
                return;
            case 13:
                this.f7297b.setImageResource(C1306b.C1310d.tips_independent_layout);
                this.f7298c.setText(C1306b.C1315i.tips_independent_layout);
                return;
            default:
                finish();
                return;
        }
    }
}
