package com.tsf.shell.theme.inside.description;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import com.tsf.shell.R;
import com.tsf.shell.manager.o.a;
import com.tsf.shell.utils.x;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ThemeIconDescription {
    public float[] effectPolyParam;
    private Context mContext;
    public String packagename;
    public String themeName;
    public float scale = 0.8f;
    public boolean isColorize = false;
    public int colorize = 0;
    public HashMap iconFilter = new HashMap();
    public ArrayList iconBackItems = new ArrayList();
    public ArrayList iconUponItems = new ArrayList();
    public ArrayList iconMaskItems = new ArrayList();

    public ThemeIconDescription(Context context) {
        this.mContext = context;
        this.packagename = context.getPackageName();
    }

    public void parsePolyParam(String str) {
        try {
            String[] split = str.split(",");
            if (split.length == 8) {
                float[] fArr = new float[8];
                for (int i = 0; i < split.length; i++) {
                    fArr[i] = Float.parseFloat(split[i]);
                }
                this.effectPolyParam = fArr;
            }
        } catch (Exception e) {
        }
    }

    public void parseColorizeParam(String str) {
        try {
            this.colorize = Color.parseColor(str);
            this.isColorize = true;
        } catch (Exception e) {
        }
    }

    public void destroy() {
        Iterator it = this.iconBackItems.iterator();
        while (it.hasNext()) {
            ((DefaultIconItem) it.next()).recycle();
        }
        Iterator it2 = this.iconUponItems.iterator();
        while (it2.hasNext()) {
            ((DefaultIconItem) it2.next()).recycle();
        }
        Iterator it3 = this.iconMaskItems.iterator();
        while (it3.hasNext()) {
            ((DefaultIconItem) it3.next()).recycle();
        }
        this.iconBackItems.clear();
        this.iconUponItems.clear();
        this.iconMaskItems.clear();
        this.iconFilter.clear();
        this.iconBackItems = null;
        this.iconFilter = null;
        this.mContext = null;
    }

    public Bitmap getBackBitmap(a aVar) {
        if (this.iconBackItems.size() <= 0) {
            return null;
        }
        int random = (int) (Math.random() * this.iconBackItems.size());
        int size = random == this.iconBackItems.size() ? this.iconBackItems.size() - 1 : random;
        Bitmap bitmap = ((DefaultIconItem) this.iconBackItems.get(size)).getBitmap(aVar);
        if (bitmap == null) {
            this.iconBackItems.remove(size);
            return getBackBitmap(aVar);
        }
        return bitmap;
    }

    public Bitmap getUponBitmap(a aVar) {
        if (this.iconUponItems.size() <= 0) {
            return null;
        }
        Bitmap bitmap = ((DefaultIconItem) this.iconUponItems.get(0)).getBitmap(aVar);
        if (bitmap == null) {
            this.iconUponItems.remove(0);
            return getUponBitmap(aVar);
        }
        return bitmap;
    }

    public Bitmap getMaskBitmap(a aVar) {
        if (this.iconMaskItems.size() <= 0) {
            return null;
        }
        Bitmap bitmap = ((DefaultIconItem) this.iconMaskItems.get(0)).getBitmap(aVar);
        if (bitmap == null) {
            this.iconMaskItems.remove(0);
            return getMaskBitmap(aVar);
        }
        return bitmap;
    }

    public Bitmap getPackageIcon() {
        Bitmap a = x.a(this.mContext, this.mContext.getApplicationInfo().icon);
        if (a == null) {
            return x.a(R.drawable.default_icon);
        }
        return a;
    }

    public void addIconUpon(String str) {
        this.iconUponItems.add(new DefaultIconItem(this, str));
    }

    public void addIconBack(String str) {
        this.iconBackItems.add(new DefaultIconItem(this, str));
    }

    public void addIconMask(String str) {
        this.iconMaskItems.add(new DefaultIconItem(this, str));
    }

    public void resetIconItemScale(float f) {
        Iterator it = this.iconBackItems.iterator();
        while (it.hasNext()) {
            ((DefaultIconItem) it.next()).scale = f;
        }
    }

    public void addIconFilterItem(String str, String str2) {
        this.iconFilter.put(str, str2);
    }

    public Bitmap getIconFilterBitmap(String str, a aVar) {
        String str2 = (String) this.iconFilter.get(str);
        if (str2 == null) {
            return null;
        }
        return getBitmap(aVar, this.mContext, str2);
    }

    public int isIconExistId(String str) {
        return this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName());
    }

    public boolean isIconExist(String str) {
        return this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName()) != 0;
    }

    protected Bitmap getBitmap(DefaultIconItem defaultIconItem, a aVar) {
        return getBitmap(aVar, this.mContext, defaultIconItem.drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap getBitmap(a aVar, Context context, String str) {
        InputStream inputStream;
        Throwable th;
        Bitmap bitmap;
        int identifier;
        Bitmap bitmap2 = null;
        InputStream inputStream2 = null;
        try {
            identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        } catch (Exception e) {
            inputStream = null;
        } catch (Throwable th2) {
            inputStream = null;
            th = th2;
        }
        if (identifier == 0) {
            try {
                inputStream2.close();
            } catch (Exception e2) {
            }
            return bitmap2;
        }
        inputStream = context.getResources().openRawResource(identifier);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            try {
                inputStream.close();
                bitmap = decodeStream;
            } catch (Exception e3) {
                bitmap = decodeStream;
            }
        } catch (Exception e4) {
            try {
                inputStream.close();
                bitmap = null;
            } catch (Exception e5) {
                bitmap = null;
            }
            if (bitmap != null) {
            }
            return bitmap2;
        } catch (Throwable th3) {
            th = th3;
            try {
                inputStream.close();
            } catch (Exception e6) {
            }
            throw th;
        }
        if (bitmap != null) {
            bitmap2 = (bitmap.getWidth() == aVar.H && bitmap.getHeight() == aVar.I) ? bitmap.copy(Bitmap.Config.ARGB_8888, false) : Bitmap.createScaledBitmap(bitmap, aVar.H, aVar.I, true);
            if (bitmap != bitmap2) {
                bitmap.recycle();
            }
        }
        return bitmap2;
    }
}
