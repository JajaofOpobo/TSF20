package com.tsf.shell.plugin.iconpicker;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import com.tsf.shell.R;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements AbsListView.OnScrollListener {
    public static c e = new c();
    public static c f = new c();
    protected Context a;
    protected Context c;
    protected Resources d;
    protected Animation h;
    private boolean j;
    private View k;
    public Map b = new HashMap();
    protected Handler g = new Handler();
    private Object l = new Object();
    protected boolean i = false;

    public abstract void a(View view, int i);

    public a(Context context, String str) {
        this.a = context;
        this.h = AnimationUtils.loadAnimation(this.a, R.anim.icon_picker_item_fade_out);
        try {
            this.c = this.a.createPackageContext(str, 2);
            this.d = this.c.getResources();
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public final void a(View view) {
        if (view != null) {
            this.k = view;
        }
        if (this.i) {
            this.g.post(new b(this));
        }
    }

    public final void a() {
        if (this.k != null) {
            GridView gridView = (GridView) this.k.findViewById(R.id.icongrid);
            if (!((Boolean) gridView.getTag()).booleanValue()) {
                gridView.setVisibility(0);
                gridView.setAdapter((ListAdapter) this);
                gridView.setTag(true);
                View findViewById = this.k.findViewById(R.id.mainprogress);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                    return;
                }
                return;
            }
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(R.layout.icon_picker_grid_item, (ViewGroup) null);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView1);
        View findViewById = view.findViewById(R.id.progress);
        imageView.setTag(Integer.valueOf(i));
        if (a(Integer.valueOf(i)) != null || !this.j) {
            imageView.setImageBitmap(null);
            imageView.setVisibility(0);
            findViewById.setVisibility(8);
            a(view, i);
        } else {
            imageView.setImageBitmap(null);
            imageView.setVisibility(4);
            findViewById.setVisibility(0);
        }
        return view;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        switch (i) {
            case 0:
                this.j = false;
                int firstVisiblePosition = absListView.getFirstVisiblePosition();
                int childCount = absListView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    a(absListView.getChildAt(i2), firstVisiblePosition + i2);
                }
                break;
            case 1:
            case 2:
                this.j = true;
                e.a();
                break;
        }
    }

    protected final Bitmap a(Integer num, Bitmap bitmap) {
        synchronized (this.l) {
            if (this.b.get(num) == null || ((SoftReference) this.b.get(num)).get() == null) {
                this.b.put(num, new SoftReference(bitmap));
            } else {
                bitmap.recycle();
                bitmap = a(num);
            }
        }
        return bitmap;
    }

    protected final Bitmap a(Integer num) {
        synchronized (this.l) {
            if (this.b.get(num) == null) {
                return null;
            }
            return (Bitmap) ((SoftReference) this.b.get(num)).get();
        }
    }

    protected final Bitmap a(int i) {
        InputStream inputStream;
        Throwable th;
        Bitmap bitmap = null;
        try {
            inputStream = this.d.openRawResource(i);
            try {
                bitmap = BitmapFactory.decodeStream(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return bitmap;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            inputStream = null;
        } catch (Throwable th3) {
            inputStream = null;
            th = th3;
        }
        return bitmap;
    }
}
