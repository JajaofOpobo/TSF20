package com.tsf.shell.activity.tips;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TipsDialogActivity extends Activity {
    private RelativeLayout a;
    private ImageView b;
    private TextView c;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(b.g.tips_layout);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.tsf.shell.activity.tips.TipsDialogActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TipsDialogActivity.this.finish();
            }
        };
        this.a = (RelativeLayout) findViewById(b.e.main_layout);
        this.a.setOnClickListener(onClickListener);
        this.b = (ImageView) findViewById(b.e.tips_image);
        this.c = (TextView) findViewById(b.e.tips_context);
        a(getIntent().getIntExtra("type", -1));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            System.exit(0);
        } catch (Exception e) {
        }
        super.onDestroy();
    }

    private void a(int i) {
        switch (i) {
            case 1:
                this.b.setImageResource(b.d.tips_empty_folder_lasso);
                this.c.setText(b.i.tips_empty_folder_lasso);
                break;
            case 2:
                this.b.setImageResource(b.d.tips_folder_lasso_view);
                this.c.setText(b.i.tips_folder_lasso_view);
                break;
            case 5:
                this.b.setImageResource(b.d.tips_lasso_option);
                this.c.setText(b.i.tips_lasso_option);
                break;
            case 12:
                this.b.setImageResource(b.d.tips_music);
                this.c.setText(b.i.tips_music);
                break;
            case 13:
                this.b.setImageResource(b.d.tips_independent_layout);
                this.c.setText(b.i.tips_independent_layout);
                break;
            default:
                finish();
                break;
        }
    }
}
