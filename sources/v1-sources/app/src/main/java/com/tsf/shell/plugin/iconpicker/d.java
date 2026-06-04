package com.tsf.shell.plugin.iconpicker;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import com.tsf.shell.R;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends Fragment implements AdapterView.OnItemClickListener {
    public static Map S = new HashMap();
    public int P;
    public int Q;
    public String R;
    private View T;

    @Override // android.support.v4.app.Fragment
    public final void b(Bundle bundle) {
        super.b(bundle);
        this.P = c() != null ? c().getInt("num") : 0;
        this.Q = c() != null ? c().getInt("PkgType") : 0;
        this.R = c() != null ? c().getString("PkgName") : "";
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.T = layoutInflater.inflate(R.layout.icon_picker_viewer_grid, viewGroup, false);
        GridView gridView = (GridView) this.T.findViewById(R.id.icongrid);
        gridView.setVisibility(4);
        gridView.setTag(false);
        a aVar = (a) S.get(Integer.valueOf(this.P));
        if (aVar == null) {
            FragmentActivity d = d();
            switch (this.Q) {
                case 0:
                    aVar = new com.tsf.shell.plugin.iconpicker.b.a(d, this.R);
                    break;
                case 1:
                    aVar = new com.tsf.shell.plugin.iconpicker.a.a(d, this.R);
                    break;
                case 2:
                    aVar = new com.tsf.shell.plugin.iconpicker.c.a(d, this.R);
                    break;
            }
            S.put(Integer.valueOf(this.P), aVar);
        }
        aVar.a(this.T);
        gridView.setOnItemClickListener(this);
        gridView.setOnScrollListener(aVar);
        return this.T;
    }

    public final void z() {
        GridView gridView = (GridView) this.T.findViewById(R.id.icongrid);
        int childCount = gridView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((ImageView) gridView.getChildAt(i).findViewById(R.id.imageView1)).setImageBitmap(null);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Bitmap bitmap = ((BitmapDrawable) ((ImageView) view.findViewById(R.id.imageView1)).getDrawable()).getBitmap();
        if (bitmap != null) {
            IconPicker.a(bitmap.copy(Bitmap.Config.ARGB_8888, true));
        }
    }
}
