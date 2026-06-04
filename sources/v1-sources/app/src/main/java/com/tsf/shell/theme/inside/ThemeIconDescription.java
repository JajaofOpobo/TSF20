package com.tsf.shell.theme.inside;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tsf.shell.R;
import com.tsf.shell.workspace3D.k.b.ap;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ThemeIconDescription {
    private Context mContext;
    public String packagename;
    public String themeName;
    public boolean isSystem = false;
    public float globalScale = 1.0f;
    public float scale = 1.0f;
    public float leftOffset = 0.0f;
    public float rightOffset = 0.0f;
    public float topOffset = 0.0f;
    public float bottomOffset = 0.0f;
    public int defaultIcon = -1;
    public int defaultMask = -1;
    public boolean isSecondParserMode = false;
    public HashMap iconFilter = new HashMap();
    public ArrayList iconBackItems = new ArrayList();
    public ArrayList iconUponItems = new ArrayList();

    public ThemeIconDescription(Context context) {
        this.mContext = context;
        this.packagename = context.getPackageName();
    }

    public void destroy() {
        if (!this.isSystem) {
            this.iconBackItems.clear();
            this.iconFilter.clear();
            this.iconBackItems = null;
            this.iconFilter = null;
            this.mContext = null;
        }
    }

    public Bitmap getPackageIcon() {
        Bitmap a = com.censivn.C3DEngine.h.a.a(this.mContext, this.mContext.getApplicationInfo().icon);
        if (a == null) {
            return com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.themes_mix_icon_button);
        }
        return a;
    }

    public void addDefaultIconUponItem(String str) {
        this.iconUponItems.add(new DefaultIconItem(this, str, "iconMask", 1.0f));
    }

    public void addDefaultIconBack(String str, float f) {
        this.iconBackItems.add(new DefaultIconItem(this, str, "icon", f));
    }

    public void resetIconItemScale(float f) {
        Iterator it = this.iconBackItems.iterator();
        while (it.hasNext()) {
            ((DefaultIconItem) it.next()).scale = f;
        }
    }

    public DefaultIconItem getDefaultIconBackFilename() {
        if (this.iconBackItems.isEmpty() || this.defaultIcon > this.iconBackItems.size() - 1 || this.defaultIcon < 0) {
            return null;
        }
        return (DefaultIconItem) this.iconBackItems.get(this.defaultIcon);
    }

    public String getDefaultMaskFilename() {
        if (!this.iconUponItems.isEmpty()) {
            if (this.defaultMask > this.iconUponItems.size() - 1 || this.defaultMask < 0) {
                return null;
            }
            return ((DefaultIconItem) this.iconUponItems.get(this.defaultMask)).drawable;
        }
        return "";
    }

    public Bitmap getRandomDefaultIconBack() {
        if (this.iconBackItems.isEmpty()) {
            return null;
        }
        int random = (int) (Math.random() * this.iconBackItems.size());
        int size = random == this.iconBackItems.size() ? this.iconBackItems.size() - 1 : random;
        Bitmap bitmap = ((DefaultIconItem) this.iconBackItems.get(size)).getBitmap();
        if (bitmap == null) {
            this.iconBackItems.remove(size);
            return getRandomDefaultIconBack();
        }
        return bitmap;
    }

    public void addIconFilterItem(String str, String str2) {
        this.iconFilter.put(str, str2);
    }

    public Bitmap getIconFilterBitmap(String str) {
        String str2 = (String) this.iconFilter.get(str);
        if (str2 == null) {
            return null;
        }
        return getBitmp("theme/icon/", str2);
    }

    public int isIconExistId(String str) {
        if (!this.isSecondParserMode) {
            return 0;
        }
        return this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName());
    }

    public boolean isIconExist(String str) {
        return (this.isSecondParserMode && this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName()) == 0) ? false : true;
    }

    protected Bitmap getBitmp(DefaultIconItem defaultIconItem, String str) {
        return getBitmp("theme/" + str + "/", defaultIconItem.drawable);
    }

    private Bitmap getBitmp(String str, String str2) {
        return getBitmp(this.isSecondParserMode, this.mContext, str, str2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(1:2)|(1:4)(2:38|(4:40|41|42|11)(1:45))|5|6|7|8|9|(3:13|(1:20)(1:17)|(1:19))|11|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap getBitmp(boolean z, Context context, String str, String str2) {
        InputStream inputStream;
        Bitmap bitmap = null;
        try {
        } catch (Exception e) {
            inputStream = null;
        } catch (Throwable th) {
            inputStream = null;
            Throwable th2 = th;
        }
        if (z) {
            int identifier = context.getResources().getIdentifier(str2, "drawable", context.getPackageName());
            if (identifier == 0) {
                InputStream inputStream2 = null;
                try {
                    inputStream2.close();
                } catch (Exception e2) {
                }
                return bitmap;
            }
            inputStream = context.getResources().openRawResource(identifier);
        } else {
            inputStream = context.getAssets().open(String.valueOf(str) + str2 + ".png");
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        inputStream.close();
        Bitmap bitmap2 = decodeStream;
        if (bitmap2 != null) {
            bitmap = (bitmap2.getWidth() == ap.E && bitmap2.getHeight() == ap.E) ? bitmap2.copy(Bitmap.Config.ARGB_8888, false) : Bitmap.createScaledBitmap(bitmap2, ap.E, ap.E, true);
            if (bitmap2 != bitmap) {
                bitmap2.recycle();
            }
        }
        return bitmap;
    }

    public static Bitmap getDefaultIconBack(String str, String str2) {
        return getBitmp(str, "theme/icon/", str2);
    }

    public static Bitmap getDefaultIconMask(String str, String str2) {
        return getBitmp(str, "theme/iconMask/", str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap getBitmp(String str, String str2, String str3) {
        InputStream inputStream;
        Throwable th;
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (str3 != null) {
            try {
                try {
                    Context createPackageContext = com.censivn.C3DEngine.a.c().createPackageContext(str, 3);
                    try {
                        inputStream = createPackageContext.getAssets().open(String.valueOf(str2) + str3 + ".png");
                    } catch (Exception e) {
                        int identifier = createPackageContext.getResources().getIdentifier(str3, "drawable", createPackageContext.getPackageName());
                        if (identifier == 0) {
                            InputStream inputStream2 = null;
                            try {
                                inputStream2.close();
                            } catch (Exception e2) {
                            }
                        } else {
                            inputStream = createPackageContext.getResources().openRawResource(identifier);
                        }
                    }
                } catch (Exception e3) {
                    inputStream = null;
                }
            } catch (Throwable th2) {
                inputStream = null;
                th = th2;
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                try {
                    inputStream.close();
                    bitmap = decodeStream;
                } catch (Exception e4) {
                    bitmap = decodeStream;
                }
            } catch (Exception e5) {
                try {
                    inputStream.close();
                    bitmap = null;
                } catch (Exception e6) {
                    bitmap = null;
                }
                if (bitmap != null) {
                }
                return bitmap2;
            } catch (Throwable th3) {
                th = th3;
                try {
                    inputStream.close();
                } catch (Exception e7) {
                }
                throw th;
            }
            if (bitmap != null) {
                bitmap2 = (bitmap.getWidth() == ap.E && bitmap.getHeight() == ap.E) ? bitmap.copy(Bitmap.Config.ARGB_8888, false) : Bitmap.createScaledBitmap(bitmap, ap.E, ap.E, true);
                if (bitmap != bitmap2) {
                    bitmap.recycle();
                }
            }
        }
        return bitmap2;
    }
}
