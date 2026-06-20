package com.tsf.extend.theme;

import com.tsf.extend.theme.ThemeCategoryListModel;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeProgressModel extends ThemeModel {
    private List<com.tsf.extend.base.c.ProgressCallback> a;

    public List<com.tsf.extend.base.c.ProgressCallback> b() {
        return this.a;
    }

    public void b(List<com.tsf.extend.base.c.ProgressCallback> list) {
        this.a = list;
    }
}
