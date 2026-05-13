package com.tsf.shell.plugin.theme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.C1306b;
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
/* renamed from: com.tsf.shell.plugin.theme.a */
/* loaded from: classes.dex */
public class C3831a extends ArrayAdapter<C3835c> {

    /* renamed from: a */
    int f12571a;

    /* renamed from: b */
    private final ArrayList<C3835c> f12572b;

    /* renamed from: c */
    private final Context f12573c;

    public C3831a(Context context, int i, ArrayList<C3835c> arrayList) {
        super(context, i, arrayList);
        this.f12571a = 0;
        this.f12572b = arrayList;
        this.f12573c = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f12572b.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C3835c c3835c;
        if (view == null) {
            view = ((LayoutInflater) this.f12573c.getSystemService("layout_inflater")).inflate(C1306b.C1313g.theme_element_item, (ViewGroup) null);
        }
        if (i < getCount() && (c3835c = this.f12572b.get(i)) != null) {
            ImageView imageView = (ImageView) view.findViewById(C1306b.C1311e.image);
            ((TextView) view.findViewById(C1306b.C1311e.title)).setText(c3835c.f12580c);
            ((TextView) view.findViewById(C1306b.C1311e.count)).setVisibility(8);
            if (c3835c.f12578a == null) {
                switch (c3835c.f12582e) {
                    case 4:
                        c3835c.f12578a = ThemeClockManager.createPreviewBitmap(this.f12573c, c3835c.f12579b, false);
                        break;
                    case 8:
                        c3835c.f12578a = ThemeFolderManager.createPreviewBitmap(this.f12573c, c3835c.f12579b, false);
                        break;
                    case 16:
                        c3835c.f12578a = ThemeContactManager.createPreviewBitmap(this.f12573c, c3835c.f12579b, false);
                        break;
                    case 33:
                        c3835c.f12578a = ThemeShellOtherManager.createPreviewBitmap(this.f12573c, c3835c.f12579b, false);
                        break;
                    case ThemeElementType.TYPE_DESKTOP /* 257 */:
                        c3835c.f12578a = ThemePageManager.createPreviewBitmap(this.f12573c, c3835c.f12579b, false);
                        break;
                    case ThemeElementType.TYPE_DESKTOP_EFFECT /* 513 */:
                        c3835c.f12578a = ThemeDesktopEffectManager.createPreviewBitmap(this.f12573c, c3835c.f12579b);
                        break;
                    case ThemeElementType.TYPE_SMART_BUTTON /* 1025 */:
                        c3835c.f12578a = ThemeSmartButtonManager.createPreviewBitmap(this.f12573c, c3835c.f12579b, false);
                        break;
                    case ThemeElementType.TYPE_ICON_MENU /* 2049 */:
                        c3835c.f12578a = ThemeIconMenuManager.createPreviewBitmap(this.f12573c, c3835c.f12579b, false);
                        break;
                    case ThemeElementType.TYPE_WIDGET_RESIZE /* 4097 */:
                        c3835c.f12578a = ThemeWidgetResizeManager.createPreviewBitmap(this.f12573c, c3835c.f12579b, false);
                        break;
                    case ThemeElementType.TYPE_LASSO /* 8193 */:
                        c3835c.f12578a = ThemeLassoManager.createPreviewBitmap(this.f12573c, c3835c.f12579b, false);
                        break;
                    case ThemeElementType.TYPE_ARRANGE /* 16385 */:
                        c3835c.f12578a = ThemeArrangeManager.createPreviewBitmap(this.f12573c, c3835c.f12579b, false);
                        break;
                    case ThemeElementType.TYPE_UNREAD_COUNT /* 32769 */:
                        c3835c.f12578a = ThemeUnreadCountManager.createPreviewBitmap(this.f12573c, c3835c.f12579b, false);
                        break;
                    case ThemeElementType.TYPE_APP_MUTIL_CHOICE /* 131073 */:
                        c3835c.f12578a = ThemeAppMutilChoiceManager.createPreviewBitmap(this.f12573c, c3835c.f12579b, false);
                        break;
                    case ThemeElementType.TYPE_ACTION /* 524289 */:
                        c3835c.f12578a = ThemeActionManager.createPreviewBitmap(this.f12573c, c3835c.f12579b, false);
                        break;
                }
                if (c3835c.f12578a == null) {
                    this.f12572b.remove(i);
                    notifyDataSetChanged();
                }
            }
            imageView.setImageBitmap(c3835c.f12578a);
        }
        return view;
    }
}
