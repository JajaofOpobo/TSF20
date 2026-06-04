package com.tsf.shell.tips;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;

/* loaded from: classes.dex */
public class TipsDialogActivity extends Activity {
    private ImageView a;
    private TextView b;
    private LinearLayout c;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tips_layout);
        this.c = (LinearLayout) findViewById(R.id.tips_button);
        this.c.setOnClickListener(new a(this));
        this.a = (ImageView) findViewById(R.id.tips_image);
        this.b = (TextView) findViewById(R.id.tips_context);
        switch (getIntent().getIntExtra("type", -1)) {
            case 1:
                this.a.setImageResource(R.drawable.tips_empty_folder_lasso);
                this.b.setText(R.string.tips_empty_folder_lasso);
                break;
            case 2:
                this.a.setImageResource(R.drawable.tips_folder_lasso_view);
                this.b.setText(R.string.tips_folder_lasso_view);
                break;
            case 3:
                this.a.setImageResource(R.drawable.tips_folder_mutil_choice);
                this.b.setText(R.string.tips_folder_mutil_choice);
                break;
            case 4:
                this.a.setImageResource(R.drawable.tips_icon_option);
                this.b.setText(R.string.tips_icon_option);
                break;
            case 5:
                this.a.setImageResource(R.drawable.tips_lasso_option);
                this.b.setText(R.string.tips_lasso_option);
                break;
            case 6:
                this.a.setImageResource(R.drawable.tips_menu_item_sort);
                this.b.setText(R.string.tips_menu_item_sort);
                break;
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                this.a.setImageResource(R.drawable.tips_menu_sort);
                this.b.setText(R.string.tips_menu_sort);
                break;
            case ThemeParser.TYPE_FOLDER /* 8 */:
                this.a.setImageResource(R.drawable.tips_arrange_sort);
                this.b.setText(R.string.tips_arrange_sort);
                break;
            case 9:
                this.a.setImageResource(R.drawable.tips_icon_change_desktop);
                this.b.setText(R.string.tips_icon_change_desktop);
                break;
            case 10:
            case 11:
            default:
                finish();
                break;
            case 12:
                this.a.setImageResource(R.drawable.tips_music);
                this.b.setText(R.string.tips_music);
                break;
            case 13:
                this.a.setImageResource(R.drawable.tips_independent_layout);
                this.b.setText(R.string.tips_independent_layout);
                break;
        }
    }
}
