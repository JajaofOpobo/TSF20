package com.tsf.extend.theme;

import android.content.Context;
import android.view.View;
import com.tsf.extend.ResourceIds;
import com.tsf.extend.theme.ThemeBaseAdapter;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeAllItemsAdapter extends ThemeBaseAdapter {
    public af(Context context, List<t.b> list, View.OnClickListener onClickListener) {
        super(context, list, onClickListener);
    }

    @Override // com.tsf.extend.theme.ThemeBaseAdapter
    protected int c() {
        return ResourceIds.C0052f.theme_all_item_new_style;
    }
}
