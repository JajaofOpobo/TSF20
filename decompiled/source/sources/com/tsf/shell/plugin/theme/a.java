package com.tsf.shell.plugin.theme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.b;
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
public class a extends ArrayAdapter<c> {
    int a;
    private final ArrayList<c> b;
    private final Context c;

    public a(Context context, int i, ArrayList<c> arrayList) {
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
        c cVar;
        if (view == null) {
            view = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(b.g.theme_element_item, (ViewGroup) null);
        }
        if (i < getCount() && (cVar = this.b.get(i)) != null) {
            ImageView imageView = (ImageView) view.findViewById(b.e.image);
            ((TextView) view.findViewById(b.e.title)).setText(cVar.c);
            ((TextView) view.findViewById(b.e.count)).setVisibility(8);
            if (cVar.a == null) {
                switch (cVar.e) {
                    case 4:
                        cVar.a = ThemeClockManager.createPreviewBitmap(this.c, cVar.b, false);
                        break;
                    case 8:
                        cVar.a = ThemeFolderManager.createPreviewBitmap(this.c, cVar.b, false);
                        break;
                    case 16:
                        cVar.a = ThemeContactManager.createPreviewBitmap(this.c, cVar.b, false);
                        break;
                    case 33:
                        cVar.a = ThemeShellOtherManager.createPreviewBitmap(this.c, cVar.b, false);
                        break;
                    case ThemeElementType.TYPE_DESKTOP /* 257 */:
                        cVar.a = ThemePageManager.createPreviewBitmap(this.c, cVar.b, false);
                        break;
                    case ThemeElementType.TYPE_DESKTOP_EFFECT /* 513 */:
                        cVar.a = ThemeDesktopEffectManager.createPreviewBitmap(this.c, cVar.b);
                        break;
                    case ThemeElementType.TYPE_SMART_BUTTON /* 1025 */:
                        cVar.a = ThemeSmartButtonManager.createPreviewBitmap(this.c, cVar.b, false);
                        break;
                    case ThemeElementType.TYPE_ICON_MENU /* 2049 */:
                        cVar.a = ThemeIconMenuManager.createPreviewBitmap(this.c, cVar.b, false);
                        break;
                    case ThemeElementType.TYPE_WIDGET_RESIZE /* 4097 */:
                        cVar.a = ThemeWidgetResizeManager.createPreviewBitmap(this.c, cVar.b, false);
                        break;
                    case ThemeElementType.TYPE_LASSO /* 8193 */:
                        cVar.a = ThemeLassoManager.createPreviewBitmap(this.c, cVar.b, false);
                        break;
                    case ThemeElementType.TYPE_ARRANGE /* 16385 */:
                        cVar.a = ThemeArrangeManager.createPreviewBitmap(this.c, cVar.b, false);
                        break;
                    case ThemeElementType.TYPE_UNREAD_COUNT /* 32769 */:
                        cVar.a = ThemeUnreadCountManager.createPreviewBitmap(this.c, cVar.b, false);
                        break;
                    case ThemeElementType.TYPE_APP_MUTIL_CHOICE /* 131073 */:
                        cVar.a = ThemeAppMutilChoiceManager.createPreviewBitmap(this.c, cVar.b, false);
                        break;
                    case ThemeElementType.TYPE_ACTION /* 524289 */:
                        cVar.a = ThemeActionManager.createPreviewBitmap(this.c, cVar.b, false);
                        break;
                }
                if (cVar.a == null) {
                    this.b.remove(i);
                    notifyDataSetChanged();
                }
            }
            imageView.setImageBitmap(cVar.a);
        }
        return view;
    }
}
