package com.tsf.shell.theme.inside.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.theme.inside.ThemeManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class SystemFolderTheme {
    public static final int ORDER_BACK_PLANE = 2;
    public static final int ORDER_CHILD_CONTAINER_PLANE = 3;
    public static final int ORDER_FRONT_PLANE = 1;
    public static final int ORDER_SIZE_PLANE = 4;
    public static final int ORDER_TEXT_PLANE = 0;
    public String addButton;
    public String backPlane;
    public boolean backPlaneEnable;
    public int backPlaneX;
    public int backPlaneY;
    public int borderBottom;
    public int borderLeft;
    public int borderRight;
    public int borderTop;
    public int childContainerX;
    public int childContainerY;
    private String[] filesList;
    public String frame;
    public String frontPlane;
    public boolean frontPlaneEnable;
    public int frontPlaneX;
    public int frontPlaneY;
    public String icon;
    private Context mContext;
    public String packagename;
    public int sampleCount;
    public String scrollingPoint;
    public String sizePlane;
    public boolean sizePlaneEnable;
    public int sizePlaneHeight;
    public int sizePlaneWidth;
    public int sizePlaneX;
    public int sizePlaneY;
    public int sizeTextHeight;
    public int sizeTextWidth;
    public int textHeight;
    public String textPlane;
    public int textPlaneHeight;
    public int textPlaneWidth;
    public int textPlaneX;
    public int textPlaneY;
    public int textWidth;
    public String themeName;
    public boolean isSystem = false;
    public int addButtonOffsetY = 9;
    public boolean supportHD = false;
    public float dockBottomOffset = 0.0f;
    public float dockTopOffset = 0.0f;
    public float dockLefOffset = 0.0f;
    public float dockRightOffset = 0.0f;
    public boolean followRotation = false;
    public boolean isSecondParserMode = false;
    public ArrayList sampleList = new ArrayList();
    public TextFormat nameTextFormat = new TextFormat();
    public SizeTextFormat sizeTextFormat = new SizeTextFormat();
    public ArrayList order = new ArrayList();

    public SystemFolderTheme(Context context) {
        this.mContext = context;
        this.packagename = context.getPackageName();
    }

    public void destroy() {
        this.mContext = null;
        if (this.sampleList != null) {
            this.sampleList.clear();
        }
        this.sampleList = null;
        this.nameTextFormat = null;
        this.sizeTextFormat = null;
        if (this.order != null) {
            this.order.clear();
        }
        this.order = null;
    }

    public void addChildInformation(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        SystemFolderChild systemFolderChild = new SystemFolderChild();
        systemFolderChild.position.x = f;
        systemFolderChild.position.y = f2;
        systemFolderChild.position.z = f3;
        systemFolderChild.rotation.x = f4;
        systemFolderChild.rotation.y = f5;
        systemFolderChild.rotation.z = f6;
        systemFolderChild.scale.x = f7;
        systemFolderChild.scale.y = f8;
        systemFolderChild.scale.z = f9;
        this.sampleList.add(systemFolderChild);
    }

    public ArrayList getSampleInformaiton() {
        return this.sampleList;
    }

    public class SystemFolderChild {
        public Number3d position = new Number3d();
        public Number3d rotation = new Number3d();
        public Number3d scale = new Number3d();

        public SystemFolderChild() {
        }
    }

    public class TextFormat {
        public boolean auto = true;
        public int color;
        public int height;
        public int size;
        public int width;
        public int x;
        public int y;

        public TextFormat() {
        }
    }

    public class SizeTextFormat extends TextFormat {
        public int colorFull;

        public SizeTextFormat() {
            super();
        }
    }

    public Bitmap getScrollingPointBitmap() {
        Bitmap bitmp = getBitmp(this.scrollingPoint);
        if (bitmp == null) {
            return ThemeManager.getInstance().getSystemThemeDescription().widget.folder.getScrollingPointBitmap();
        }
        return bitmp;
    }

    public Bitmap getAddButtonBitmap() {
        Bitmap bitmp = getBitmp(this.addButton);
        if (bitmp == null) {
            return ThemeManager.getInstance().getSystemThemeDescription().widget.folder.getAddButtonBitmap();
        }
        return bitmp;
    }

    public Bitmap getFrameBitmap() {
        Bitmap bitmp = getBitmp(this.frame);
        if (bitmp == null) {
            return ThemeManager.getInstance().getSystemThemeDescription().widget.folder.getFrameBitmap();
        }
        return bitmp;
    }

    public Bitmap getIconBitmap() {
        return getBitmp(this.icon);
    }

    public Bitmap getTextPlaneBitmap() {
        if (this.textPlane.length() == 0) {
            return null;
        }
        return getBitmp(this.textPlane);
    }

    public Bitmap getSizePlaneBitmap() {
        if (this.sizePlane.length() == 0) {
            return null;
        }
        return getBitmp(this.sizePlane);
    }

    public Bitmap getFrontPlaneBitmap() {
        return getBitmp(this.frontPlane);
    }

    public Bitmap getBackPlaneBitmap() {
        return getBitmp(this.backPlane);
    }

    private Bitmap getBitmp(String str) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        Bitmap bitmap = null;
        if (str != null) {
            try {
                if (!this.isSecondParserMode) {
                    inputStream = this.mContext.getAssets().open("theme/widget/com.tsf.shell.widget.folder/" + str + ".png");
                } else {
                    inputStream = this.mContext.getResources().openRawResource(this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName()));
                }
                try {
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                        try {
                            bitmap = decodeStream.copy(Bitmap.Config.ARGB_8888, false);
                            decodeStream.recycle();
                            try {
                                inputStream.close();
                            } catch (Exception e) {
                            }
                        } catch (Exception e2) {
                            bitmap = decodeStream;
                            inputStream2 = inputStream;
                            try {
                                inputStream2.close();
                            } catch (Exception e3) {
                            }
                            return bitmap;
                        }
                    } catch (Exception e4) {
                        inputStream2 = inputStream;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream.close();
                    } catch (Exception e5) {
                    }
                    throw th;
                }
            } catch (Exception e6) {
                inputStream2 = null;
            } catch (Throwable th3) {
                inputStream = null;
                th = th3;
            }
        }
        return bitmap;
    }

    public boolean check() {
        int i = this.borderRight - this.borderLeft;
        int i2 = this.borderTop - this.borderBottom;
        try {
            this.filesList = this.mContext.getAssets().list("theme/widget/com.tsf.shell.widget.folder");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return i > 0 && i2 > 0 && checkAllResource();
    }

    private boolean checkAllResource() {
        if (!this.backPlaneEnable || checkResource(this.backPlane)) {
            return !this.frontPlaneEnable || checkResource(this.frontPlane);
        }
        return false;
    }

    private boolean checkResource(String str) {
        if (this.isSecondParserMode || this.filesList == null) {
            return this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName()) != 0;
        }
        for (String str2 : this.filesList) {
            if (str2.equals(String.valueOf(str) + ".png")) {
                return true;
            }
        }
        return false;
    }
}
