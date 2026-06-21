package com.tsf.shell.plugin.theme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import com.tsf.shell.theme.inside.mix.ThemeActionManager;
import com.tsf.shell.theme.inside.mix.ThemeAppMutilChoiceManager;
import com.tsf.shell.theme.inside.mix.ThemeArrangeManager;
import com.tsf.shell.theme.inside.mix.ThemeClockManager;
import com.tsf.shell.theme.inside.mix.ThemeContactManager;
import com.tsf.shell.theme.inside.mix.ThemeDesktopEffectManager;
import com.tsf.shell.theme.inside.mix.ThemeFolderManager;
import com.tsf.shell.theme.inside.mix.ThemeIconMenuManager;
import com.tsf.shell.theme.inside.mix.ThemeLassoManager;
import com.tsf.shell.theme.inside.mix.ThemePageManager;
import com.tsf.shell.theme.inside.mix.ThemeShellOtherManager;
import com.tsf.shell.theme.inside.mix.ThemeSmartButtonManager;
import com.tsf.shell.theme.inside.mix.ThemeUnreadCountManager;
import com.tsf.shell.theme.inside.mix.ThemeWidgetResizeManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends ArrayAdapter {
    int a;
    private final ArrayList b;
    private final Context c;

    public a(Context context, int i, ArrayList arrayList) {
        super(context, i, arrayList);
        this.a = 0;
        this.b = arrayList;
        this.c = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        e eVar;
        if (view == null) {
            view = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.theme_element_item, (ViewGroup) null);
        }
        if (i < getCount() && (eVar = (e) this.b.get(i)) != null) {
            TextView textView = (TextView) view.findViewById(R.id.title);
            TextView textView2 = (TextView) view.findViewById(R.id.count);
            ImageView imageView = (ImageView) view.findViewById(R.id.image);
            textView.setText(eVar.c);
            textView2.setVisibility(8);
            if (eVar.a == null) {
                switch (eVar.e) {
                    case 4:
                        eVar.a = ThemeClockManager.createPreviewBitmap(this.c, eVar.b, false);
                        break;
                    case 8:
                        eVar.a = ThemeFolderManager.createPreviewBitmap(this.c, eVar.b, false);
                        break;
                    case 16:
                        eVar.a = ThemeContactManager.createPreviewBitmap(this.c, eVar.b, false);
                        break;
                    case 33:
                        eVar.a = ThemeShellOtherManager.createPreviewBitmap(this.c, eVar.b, false);
                        break;
                    case ThemeElementType.TYPE_DESKTOP /* 257 */:
                        eVar.a = ThemePageManager.createPreviewBitmap(this.c, eVar.b, false);
                        break;
                    case ThemeElementType.TYPE_DESKTOP_EFFECT /* 513 */:
                        eVar.a = ThemeDesktopEffectManager.createPreviewBitmap(this.c, eVar.b);
                        break;
                    case ThemeElementType.TYPE_SMART_BUTTON /* 1025 */:
                        eVar.a = ThemeSmartButtonManager.createPreviewBitmap(this.c, eVar.b, false);
                        break;
                    case ThemeElementType.TYPE_ICON_MENU /* 2049 */:
                        eVar.a = ThemeIconMenuManager.createPreviewBitmap(this.c, eVar.b, false);
                        break;
                    case ThemeElementType.TYPE_WIDGET_RESIZE /* 4097 */:
                        eVar.a = ThemeWidgetResizeManager.createPreviewBitmap(this.c, eVar.b, false);
                        break;
                    case ThemeElementType.TYPE_LASSO /* 8193 */:
                        eVar.a = ThemeLassoManager.createPreviewBitmap(this.c, eVar.b, false);
                        break;
                    case ThemeElementType.TYPE_ARRANGE /* 16385 */:
                        eVar.a = ThemeArrangeManager.createPreviewBitmap(this.c, eVar.b, false);
                        break;
                    case ThemeElementType.TYPE_UNREAD_COUNT /* 32769 */:
                        eVar.a = ThemeUnreadCountManager.createPreviewBitmap(this.c, eVar.b, false);
                        break;
                    case ThemeElementType.TYPE_APP_MUTIL_CHOICE /* 131073 */:
                        eVar.a = ThemeAppMutilChoiceManager.createPreviewBitmap(this.c, eVar.b, false);
                        break;
                    case ThemeElementType.TYPE_ACTION /* 524289 */:
                        eVar.a = ThemeActionManager.createPreviewBitmap(this.c, eVar.b, false);
                        break;
                }
                if (eVar.a == null) {
                    this.b.remove(i);
                    notifyDataSetChanged();
                }
            }
            imageView.setImageBitmap(eVar.a);
        }
        return view;
    }
}
