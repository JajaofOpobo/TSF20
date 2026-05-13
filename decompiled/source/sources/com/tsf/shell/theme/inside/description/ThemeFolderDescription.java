package com.tsf.shell.theme.inside.description;

import com.censivn.C3DEngine.api.element.Number3d;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ThemeFolderDescription extends ThemeDescriptionInterface {
    public static final String BACK_PLANE = "widget_folder_back";
    public static final String FRONT_PLANE = "widget_folder_upon";
    public static final String ICON = "widget_folder_icon";
    public static final int ORDER_BACK_PLANE = 2;
    public static final int ORDER_CHILD_CONTAINER_PLANE = 3;
    public static final int ORDER_FRONT_PLANE = 1;
    public static final int ORDER_SIZE_PLANE = 4;
    public static final int ORDER_TEXT_PLANE = 0;
    public static final String SCROLLING_POINT = "widget_folder_scrolling_point";
    public static final String SIZE_PLANE = "widget_folder_size";
    public boolean backPlaneEnable;
    public int backPlaneHeight;
    public int backPlaneWidth;
    public int backPlaneX;
    public int backPlaneY;
    public int childContainerX;
    public int childContainerY;
    public boolean frontPlaneEnable;
    public int frontPlaneHeight;
    public int frontPlaneWidth;
    public int frontPlaneX;
    public int frontPlaneY;
    public TextFormat nameTextFormat;
    public ArrayList<Integer> order;
    public String packagename;
    public int sampleCount;
    public ArrayList<SystemFolderChild> sampleList;
    public boolean sizePlaneEnable;
    public int sizePlaneHeight;
    public int sizePlaneWidth;
    public int sizePlaneX;
    public int sizePlaneY;
    public TextFormat sizeTextFormat;
    public int sizeTextHeight;
    public int sizeTextWidth;
    public int textHeight;
    public boolean textPlaneEnable;
    public int textPlaneHeight;
    public int textPlaneWidth;
    public int textPlaneX;
    public int textPlaneY;
    public int textWidth;

    public ThemeFolderDescription(ThemeDescription themeDescription) {
        super(themeDescription);
        this.sampleList = new ArrayList<>();
        this.nameTextFormat = new TextFormat();
        this.sizeTextFormat = new TextFormat();
        this.order = new ArrayList<>();
    }

    public void destroy() {
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
        systemFolderChild.sourcePosition.x = f;
        systemFolderChild.sourcePosition.y = f2;
        systemFolderChild.sourcePosition.z = f3;
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

    public ArrayList<SystemFolderChild> getSampleInformaiton() {
        return this.sampleList;
    }

    /* loaded from: classes.dex */
    public class SystemFolderChild {
        public Number3d sourcePosition = new Number3d();
        public Number3d position = new Number3d();
        public Number3d rotation = new Number3d();
        public Number3d scale = new Number3d();

        public SystemFolderChild() {
        }
    }

    /* loaded from: classes.dex */
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

    public boolean check() {
        return checkAllResource();
    }

    private boolean checkAllResource() {
        if (!this.backPlaneEnable || checkResource(BACK_PLANE)) {
            if (!this.frontPlaneEnable || checkResource(FRONT_PLANE)) {
                return !this.sizePlaneEnable || checkResource(SIZE_PLANE);
            }
            return false;
        }
        return false;
    }

    public boolean checkResource(String str) {
        return getDescription().getContext().getResources().getIdentifier(str, "drawable", getDescription().getContext().getPackageName()) != 0;
    }
}
