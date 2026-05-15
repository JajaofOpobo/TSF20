package com.censivn.C3DEngine.b.f;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.opengl.GLES20;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Color4BufferList;
import com.censivn.C3DEngine.api.element.FacesBufferedList;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PointBufferManager;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureDescription;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.TextureList;
import com.censivn.C3DEngine.api.element.UvBufferManager;
import com.censivn.C3DEngine.api.element.Vertices;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.Shader;
import com.censivn.C3DEngine.common.shader.ShaderColor;
import com.tsf.extend.base.j.q;
import com.tsf.shell.Home;
import com.tsf.shell.utils.x;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class i implements com.censivn.C3DEngine.b.g.b.a {
    public static final int GONE = 2;
    public static final int INVISIBLE = 1;
    public static final int VISIBLE = 0;
    protected static int mVBOCount = 0;
    private static Number3d tempPosition = new Number3d();
    public float[] AABB_BL;
    public float[] AABB_BR;
    public float[] AABB_MATRIX;
    public a AABB_P1;
    public a AABB_P2;
    public a AABB_P3;
    public a AABB_P4;
    public float[] AABB_TL;
    public float[] AABB_TR;
    public float[] TEMP_AABB_BL;
    public float[] TEMP_AABB_BR;
    public float[] TEMP_AABB_TL;
    public float[] TEMP_AABB_TR;
    private com.censivn.C3DEngine.b.d.a _mouseEventListener;
    private TextureElement cacheTextureElement;
    public float canvasMaxX;
    public float canvasMaxY;
    public float canvasMinX;
    public float canvasMinY;
    private float canvasTempMaxX;
    private float canvasTempMaxY;
    private float canvasTempMinX;
    private float canvasTempMinY;
    private boolean doubleSidedClickEnabled;

    @SuppressLint({"NewApi"})
    boolean hasTexture;
    private boolean isAABBInit;
    public boolean isAnimationObject;
    public boolean isHighPriorityAnimationObject;
    private boolean isUpdateFacesVBO;
    private boolean isUpdatePointsVBO;
    private boolean isUpdateUvsVBO;
    protected float mAlpha;
    private boolean mAnimationEnabled;
    private boolean mColorMaterialEnabled;
    private Shader mCustomShader;
    private Color4 mDefaultColor;
    private boolean mDestroyed;
    private int mDisplayTag;
    private boolean mDoubleSidedEnabled;
    private int mFaceBufferIndex;
    protected FacesBufferedList mFaces;
    private int mIndexCount;
    private com.censivn.C3DEngine.b.b.b mLayoutParam;
    private boolean mLightingEnabled;
    private boolean mLineSmoothing;
    private float mLineWidth;
    private boolean mMouseAreaDynamic;
    private boolean mMouseEnabled;
    private boolean mMouseSkip;
    private String mName;
    private boolean mNormalsEnabled;
    private f mParent;
    private float mPointSize;
    private boolean mPointSmoothing;
    private PositionNumber3d mPosition;
    private com.censivn.C3DEngine.f.e mRenderType;
    private int mRendererPriorityLevel;
    private Number3d mRotation;
    private Number3d mScale;
    private com.censivn.C3DEngine.f.f mShadeModel;
    private Object mTag;
    private HashMap<Object, Object> mTags;
    private int mTexCoordsBufferIndex;
    protected TextureList mTextures;
    private boolean mTexturesEnabled;
    public com.censivn.C3DEngine.b.g.a.c mTweenChild;
    private boolean mUseVBO;
    private int mVertBufferIndex;
    private boolean mVertexColorsEnabled;
    protected Vertices mVertices;
    private VObject3d mVirtualObject;
    private boolean mVisible;
    private boolean rendererVisibility;
    private boolean useCustomizeShader;

    public i(int i, int i2, Boolean bool, Boolean bool2, Boolean bool3) {
        this.TEMP_AABB_TL = new float[4];
        this.TEMP_AABB_TR = new float[4];
        this.TEMP_AABB_BL = new float[4];
        this.TEMP_AABB_BR = new float[4];
        this.AABB_MATRIX = new float[16];
        this.AABB_TL = new float[4];
        this.AABB_TR = new float[4];
        this.AABB_BL = new float[4];
        this.AABB_BR = new float[4];
        this.AABB_P1 = new a();
        this.AABB_P2 = new a();
        this.AABB_P3 = new a();
        this.AABB_P4 = new a();
        this.mRenderType = com.censivn.C3DEngine.f.e.TRIANGLES;
        this.mMouseEnabled = true;
        this.mMouseAreaDynamic = false;
        this.mMouseSkip = false;
        this.mUseVBO = true;
        this.mVisible = true;
        this.mVertexColorsEnabled = false;
        this.mDoubleSidedEnabled = false;
        this.mTexturesEnabled = true;
        this.mNormalsEnabled = true;
        this.mColorMaterialEnabled = false;
        this.mLightingEnabled = true;
        this.mAnimationEnabled = false;
        this.mPosition = new PositionNumber3d(0.0f, 0.0f, 0.0f);
        this.mRotation = new Number3d(0.0f, 0.0f, 0.0f);
        this.mScale = new Number3d(1.0f, 1.0f, 1.0f);
        this.mShadeModel = com.censivn.C3DEngine.f.f.SMOOTH;
        this.mPointSize = 3.0f;
        this.mPointSmoothing = true;
        this.mLineWidth = 1.0f;
        this.mLineSmoothing = false;
        this.isUpdatePointsVBO = false;
        this.isUpdateUvsVBO = false;
        this.isUpdateFacesVBO = false;
        this.mDestroyed = false;
        this.isHighPriorityAnimationObject = true;
        this.isAnimationObject = false;
        this.useCustomizeShader = false;
        this._mouseEventListener = null;
        this.mRendererPriorityLevel = 0;
        this.mAlpha = 255.0f;
        this.hasTexture = false;
        this.doubleSidedClickEnabled = false;
        this.isAABBInit = false;
        this.rendererVisibility = true;
        initVBOIndex();
        this.mVertices = new Vertices(i, bool, bool2, bool3);
        this.mFaces = new FacesBufferedList(i2);
        this.mTextures = new TextureList();
        init();
    }

    public i(Vertices vertices, FacesBufferedList facesBufferedList, TextureList textureList) {
        this.TEMP_AABB_TL = new float[4];
        this.TEMP_AABB_TR = new float[4];
        this.TEMP_AABB_BL = new float[4];
        this.TEMP_AABB_BR = new float[4];
        this.AABB_MATRIX = new float[16];
        this.AABB_TL = new float[4];
        this.AABB_TR = new float[4];
        this.AABB_BL = new float[4];
        this.AABB_BR = new float[4];
        this.AABB_P1 = new a();
        this.AABB_P2 = new a();
        this.AABB_P3 = new a();
        this.AABB_P4 = new a();
        this.mRenderType = com.censivn.C3DEngine.f.e.TRIANGLES;
        this.mMouseEnabled = true;
        this.mMouseAreaDynamic = false;
        this.mMouseSkip = false;
        this.mUseVBO = true;
        this.mVisible = true;
        this.mVertexColorsEnabled = false;
        this.mDoubleSidedEnabled = false;
        this.mTexturesEnabled = true;
        this.mNormalsEnabled = true;
        this.mColorMaterialEnabled = false;
        this.mLightingEnabled = true;
        this.mAnimationEnabled = false;
        this.mPosition = new PositionNumber3d(0.0f, 0.0f, 0.0f);
        this.mRotation = new Number3d(0.0f, 0.0f, 0.0f);
        this.mScale = new Number3d(1.0f, 1.0f, 1.0f);
        this.mShadeModel = com.censivn.C3DEngine.f.f.SMOOTH;
        this.mPointSize = 3.0f;
        this.mPointSmoothing = true;
        this.mLineWidth = 1.0f;
        this.mLineSmoothing = false;
        this.isUpdatePointsVBO = false;
        this.isUpdateUvsVBO = false;
        this.isUpdateFacesVBO = false;
        this.mDestroyed = false;
        this.isHighPriorityAnimationObject = true;
        this.isAnimationObject = false;
        this.useCustomizeShader = false;
        this._mouseEventListener = null;
        this.mRendererPriorityLevel = 0;
        this.mAlpha = 255.0f;
        this.hasTexture = false;
        this.doubleSidedClickEnabled = false;
        this.isAABBInit = false;
        this.rendererVisibility = true;
        initVBOIndex();
        this.mVertices = vertices;
        this.mFaces = facesBufferedList;
        this.mTextures = textureList;
        init();
    }

    private void init() {
        this.AABB_TL[3] = 1.0f;
        this.AABB_TR[3] = 1.0f;
        this.AABB_BL[3] = 1.0f;
        this.AABB_BR[3] = 1.0f;
    }

    public void setRendererPriorityLevel(int i) {
        this.mRendererPriorityLevel = i;
    }

    public int getRendererPriorityLevel() {
        return this.mRendererPriorityLevel;
    }

    public void setVirtualObject(VObject3d vObject3d) {
        this.mVirtualObject = vObject3d;
    }

    public VObject3d getVirtualObject() {
        return this.mVirtualObject;
    }

    public void setTag(Object obj) {
        this.mTag = obj;
    }

    public Object getTag() {
        return this.mTag;
    }

    public TextureElement cacheToTexture() {
        recycleCacheTexture();
        int cacheWidth = getCacheWidth();
        int cacheHeight = getCacheHeight();
        tempPosition.setAllFrom(position());
        com.tsf.shell.f.a.a.a aVarA = com.tsf.shell.manager.a.t.a(cacheWidth, cacheHeight);
        this.cacheTextureElement = com.censivn.C3DEngine.a.g().a(cacheWidth, cacheHeight, false);
        com.tsf.shell.manager.a.t.a(aVarA, this.cacheTextureElement);
        position().setAll(0.0f, 0.0f, 0.0f);
        dispatchDraw();
        com.tsf.shell.manager.a.t.a();
        com.tsf.shell.manager.a.t.a(aVarA);
        position().setAllFrom(tempPosition);
        return this.cacheTextureElement;
    }

    private int getCacheWidth() {
        return (int) (maxX() - minX());
    }

    private int getCacheHeight() {
        return (int) (maxY() - minY());
    }

    private void recycleCacheTexture() {
        if (this.cacheTextureElement != null && this.cacheTextureElement.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.cacheTextureElement);
        }
    }

    public void setDisplayTag(int i) {
        this.mDisplayTag = i;
    }

    public int getDisplayTag() {
        return this.mDisplayTag;
    }

    public void setTag(Object obj, Object obj2) {
        if (this.mTags == null) {
            this.mTags = new HashMap<>();
        }
        this.mTags.put(obj, obj2);
    }

    public Object getTag(Object obj) {
        if (this.mTags == null) {
            return null;
        }
        return this.mTags.get(obj);
    }

    public void removeTag() {
        this.mTag = null;
    }

    public void removeTag(Object obj) {
        this.mTags.remove(obj);
    }

    public void clearTag() {
        if (this.mTags != null) {
            this.mTags.clear();
        }
        this.mTags = null;
        this.mTag = null;
    }

    public void invalidate() {
        com.censivn.C3DEngine.a.e().j();
    }

    public void invalidateHighPriority() {
        com.censivn.C3DEngine.a.e().k();
    }

    public void setHighPriorityAnimationObjectState(boolean z) {
        this.isHighPriorityAnimationObject = z;
    }

    public boolean getHighPriorityAnimationObjectState() {
        return this.isHighPriorityAnimationObject;
    }

    public void setAnimationObjectState(boolean z) {
        this.isAnimationObject = z;
    }

    public boolean getAnimationObjectState() {
        return this.isAnimationObject;
    }

    public Vertices vertices() {
        return this.mVertices;
    }

    public FacesBufferedList faces() {
        return this.mFaces;
    }

    public TextureList textures() {
        return this.mTextures;
    }

    public boolean visible() {
        return this.mVisible;
    }

    public void visible(Boolean bool) {
        if (bool.booleanValue() != this.mVisible) {
            this.mVisible = bool.booleanValue();
            invalidate();
        }
    }

    public boolean animationEnabled() {
        return this.mAnimationEnabled;
    }

    public void animationEnabled(boolean z) {
        this.mAnimationEnabled = z;
    }

    public boolean doubleSidedEnabled() {
        return this.mDoubleSidedEnabled;
    }

    public void doubleSidedEnabled(boolean z) {
        this.mDoubleSidedEnabled = z;
        invalidate();
    }

    public boolean colorMaterialEnabled() {
        return this.mColorMaterialEnabled;
    }

    public boolean lightingEnabled() {
        return this.mLightingEnabled;
    }

    public void lightingEnabled(boolean z) {
        this.mLightingEnabled = z;
        invalidate();
    }

    public void colorMaterialEnabled(boolean z) {
        this.mColorMaterialEnabled = z;
        invalidate();
    }

    public boolean vertexColorsEnabled() {
        return this.mVertexColorsEnabled;
    }

    public void vertexColorsEnabled(Boolean bool) {
        this.mVertexColorsEnabled = bool.booleanValue();
        invalidate();
    }

    public boolean texturesEnabled() {
        return this.mTexturesEnabled;
    }

    public void texturesEnabled(Boolean bool) {
        this.mTexturesEnabled = bool.booleanValue();
        invalidate();
    }

    public boolean normalsEnabled() {
        return this.mNormalsEnabled;
    }

    public void normalsEnabled(boolean z) {
        this.mNormalsEnabled = z;
        invalidate();
    }

    public com.censivn.C3DEngine.f.e renderType() {
        return this.mRenderType;
    }

    public void renderType(com.censivn.C3DEngine.f.e eVar) {
        this.mRenderType = eVar;
        invalidate();
    }

    public com.censivn.C3DEngine.f.f shadeModel() {
        return this.mShadeModel;
    }

    public void shadeModel(com.censivn.C3DEngine.f.f fVar) {
        this.mShadeModel = fVar;
        invalidate();
    }

    public PointBufferManager points() {
        return this.mVertices.points();
    }

    public UvBufferManager uvs() {
        return this.mVertices.uvs();
    }

    public PointBufferManager normals() {
        return this.mVertices.normals();
    }

    public Color4BufferList colors() {
        return this.mVertices.colors();
    }

    public boolean hasUvs() {
        return this.mVertices.hasUvs();
    }

    public boolean hasNormals() {
        return this.mVertices.hasNormals();
    }

    public boolean hasVertexColors() {
        return this.mVertices.hasColors();
    }

    public boolean hasDestroyed() {
        return this.mDestroyed;
    }

    public void destroy() {
        destroy(true);
    }

    public void destroy(boolean z) {
        if (!this.mDestroyed) {
            clearTag();
            if (vertices().points() != null) {
                vertices().points().clear();
            }
            if (vertices().uvs() != null) {
                vertices().uvs().clear();
            }
            if (vertices().normals() != null) {
                vertices().normals().clear();
            }
            if (this.mTextures != null && z) {
                this.mTextures.clear();
            }
            recycleCacheTexture();
            removeFromParent();
            freeVBO();
            this.mDestroyed = true;
        }
    }

    public void alpha(float f) {
        this.mAlpha = f;
    }

    public float alpha() {
        return this.mAlpha;
    }

    public Color4 getDefaultColor() {
        return this.mDefaultColor;
    }

    public void clearDefaultColor() {
        this.mDefaultColor = null;
    }

    public void setDefaultColor(Color4 color4) {
        this.mDefaultColor = color4;
        invalidate();
    }

    public PositionNumber3d position() {
        return this.mPosition;
    }

    public Number3d rotation() {
        return this.mRotation;
    }

    public Number3d scale() {
        return this.mScale;
    }

    public float pointSize() {
        return this.mPointSize;
    }

    public void pointSize(float f) {
        this.mPointSize = f;
    }

    public boolean pointSmoothing() {
        return this.mPointSmoothing;
    }

    public void pointSmoothing(boolean z) {
        this.mPointSmoothing = z;
    }

    public float lineWidth() {
        return this.mLineWidth;
    }

    public void lineWidth(float f) {
        this.mLineWidth = f;
    }

    public boolean lineSmoothing() {
        return this.mLineSmoothing;
    }

    public void lineSmoothing(boolean z) {
        this.mLineSmoothing = z;
    }

    public String name() {
        return this.mName;
    }

    public void name(String str) {
        this.mName = str;
    }

    public f parent() {
        return this.mParent;
    }

    public void removeFromParent() {
        q.a("szxasasqsq", "removeFromParent...parent:" + this.mParent);
        if (this.mParent != null) {
            this.mParent.removeChild(this);
            this.mParent = null;
        }
    }

    public void parent(f fVar) {
        this.mParent = fVar;
    }

    public void superDispatchDraw() {
        if (this.mVisible) {
            onDrawStart();
            draw();
            onDrawEnd();
        }
    }

    public void dispatchDraw() {
        if (this.mVisible) {
            onDrawStart();
            draw();
            onDrawEnd();
        }
    }

    public void drawQuietly() {
        if (this.mVisible) {
            draw();
        }
    }

    public void setCustomShader(Shader shader) {
        this.useCustomizeShader = true;
        this.mCustomShader = shader;
    }

    public void resetDefaultShader() {
        this.useCustomizeShader = false;
        this.mCustomShader = null;
    }

    public void updateAABBMatrix(float[] fArr) {
        System.arraycopy(fArr, 0, this.AABB_MATRIX, 0, 16);
    }

    public float[] getAABBMatrix() {
        return this.AABB_MATRIX;
    }

    public void updateTextureState() {
        this.hasTexture = textures().size() > 0;
    }

    public void superDraw() {
        drawShader();
        drawMVPMatrix();
        drawElement();
    }

    public void draw() {
        drawShader();
        drawMVPMatrix();
        drawElement();
    }

    public void drawShader() {
        float f;
        float f2;
        float f3;
        float f4;
        com.censivn.C3DEngine.a.e().a(this);
        updateTextureState();
        MatrixStack.ColorInfo colorInfoGlColor = MatrixStack.glColor();
        float f5 = (this.mAlpha / 255.0f) * colorInfoGlColor.alpha;
        if (this.mDefaultColor == null) {
            f = colorInfoGlColor.colorA;
            f2 = colorInfoGlColor.colorR;
            f3 = colorInfoGlColor.colorG;
            f4 = colorInfoGlColor.colorB;
        } else {
            f = this.mDefaultColor.glA * colorInfoGlColor.colorA;
            f2 = colorInfoGlColor.colorR * this.mDefaultColor.glR;
            f3 = this.mDefaultColor.glG * colorInfoGlColor.colorG;
            f4 = colorInfoGlColor.colorB * this.mDefaultColor.glB;
        }
        if (this.useCustomizeShader) {
            ShaderManager.enableShader(this.mCustomShader);
        } else if (f != 1.0f || f2 != 1.0f || f3 != 1.0f || f4 != 1.0f) {
            ShaderColor shaderColor = this.hasTexture ? ShaderManager.SHADER_COLOR_TEXTURE : ShaderManager.SHADER_COLOR;
            ShaderManager.enableShader(shaderColor);
            float f6 = f * f5;
            GLES20.glVertexAttrib4f(shaderColor.maColor4Handle, f2 * f6, f3 * f6, f4 * f6, f6);
        } else if (f5 != 1.0f) {
            ShaderManager.enableShader(ShaderManager.SHADER_ALPHA);
            GLES20.glVertexAttrib1f(ShaderManager.SHADER_ALPHA.maAlphaHandle, f5);
        } else {
            ShaderManager.enableShader(ShaderManager.SHADER_STANDARD);
        }
        if (doubleSidedEnabled()) {
            GLES20.glDisable(2884);
        } else {
            GLES20.glEnable(2884);
        }
    }

    public void superDrawMVPMatrix() {
        MatrixStack.glTranslatef(this.mPosition.x, this.mPosition.y, this.mPosition.z);
        MatrixStack.glRotatef(this.mRotation.x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glRotatef(this.mRotation.y, 0.0f, 1.0f, 0.0f);
        MatrixStack.glRotatef(this.mRotation.z, 0.0f, 0.0f, 1.0f);
        MatrixStack.glScalef(this.mScale.x, this.mScale.y, this.mScale.y);
        com.censivn.C3DEngine.a.c.a(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.AABB_MATRIX, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    public void drawMVPMatrix() {
        MatrixStack.glTranslatef(this.mPosition.x, this.mPosition.y, this.mPosition.z);
        MatrixStack.glRotatef(this.mRotation.x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glRotatef(this.mRotation.y, 0.0f, 1.0f, 0.0f);
        MatrixStack.glRotatef(this.mRotation.z, 0.0f, 0.0f, 1.0f);
        MatrixStack.glScalef(this.mScale.x, this.mScale.y, this.mScale.y);
        com.censivn.C3DEngine.a.c.a(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.AABB_MATRIX, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    @SuppressLint({"NewApi"})
    public void drawElement() {
        if (useVBO()) {
            if (points().size() != 0) {
                if (this.mVertBufferIndex == 0) {
                    initVBO();
                }
                if (this.hasTexture) {
                    drawObject_textures_vbo();
                }
                GLES20.glBindBuffer(34962, this.mVertBufferIndex);
                GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
                GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maPositionHandle, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(34963, this.mFaceBufferIndex);
                GLES20.glDrawElements(renderType().a(), this.mIndexCount, 5123, 0);
                GLES20.glBindBuffer(34963, 0);
                GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
                GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
                return;
            }
            return;
        }
        if (points().size() != 0) {
            if (this.hasTexture) {
                drawObject_textures();
            }
            vertices().points().buffer().position(0);
            GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maPositionHandle, 3, 5126, false, 0, (Buffer) vertices().points().buffer());
            int size = faces().size();
            faces().buffer().position(0);
            GLES20.glDrawElements(renderType().a(), size * 3, 5123, faces().buffer());
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
        }
    }

    @SuppressLint({"NewApi"})
    public void superDrawElement() {
        if (useVBO()) {
            if (points().size() != 0) {
                if (this.mVertBufferIndex == 0) {
                    initVBO();
                }
                if (this.hasTexture) {
                    drawObject_textures_vbo();
                }
                GLES20.glBindBuffer(34962, this.mVertBufferIndex);
                GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
                GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maPositionHandle, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(34963, this.mFaceBufferIndex);
                GLES20.glDrawElements(renderType().a(), this.mIndexCount, 5123, 0);
                GLES20.glBindBuffer(34963, 0);
                GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
                GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
                return;
            }
            return;
        }
        if (points().size() != 0) {
            if (this.hasTexture) {
                drawObject_textures();
            }
            vertices().points().buffer().position(0);
            GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maPositionHandle, 3, 5126, false, 0, (Buffer) vertices().points().buffer());
            int size = faces().size();
            faces().buffer().position(0);
            GLES20.glDrawElements(renderType().a(), size * 3, 5123, faces().buffer());
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
        }
    }

    @SuppressLint({"NewApi"})
    public void drawObject_textures_vbo() {
        GLES20.glActiveTexture(33984);
        if (hasUvs() && texturesEnabled() && textures().size() > 0) {
            TextureDescription textureDescription = textures().get(0);
            if (textureDescription != null) {
                GLES20.glBindTexture(3553, textureDescription.textureElement.id);
            } else {
                GLES20.glBindTexture(3553, 0);
            }
            if (this.mTexCoordsBufferIndex != 0) {
                GLES20.glBindBuffer(34962, this.mTexCoordsBufferIndex);
                GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maTextureHandle, 2, 5126, false, 0, 0);
                GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
                GLES20.glBindBuffer(34962, 0);
                return;
            }
            return;
        }
        GLES20.glBindTexture(3553, 0);
    }

    public void drawObject_textures() {
        GLES20.glActiveTexture(33984);
        if (hasUvs() && texturesEnabled() && textures().size() > 0) {
            TextureDescription textureDescription = textures().get(0);
            if (textureDescription != null) {
                GLES20.glBindTexture(3553, textureDescription.textureElement.id);
            } else {
                GLES20.glBindTexture(3553, 0);
            }
            vertices().uvs().buffer().position(0);
            GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maTextureHandle, 2, 5126, false, 0, (Buffer) vertices().uvs().buffer());
            GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            return;
        }
        GLES20.glBindTexture(3553, 0);
    }

    public boolean useVBO() {
        return this.mUseVBO && com.censivn.C3DEngine.a.e.g;
    }

    public void useVBO(Boolean bool) {
        this.mUseVBO = bool.booleanValue();
    }

    public void initVBOIndex() {
        this.mVertBufferIndex = 0;
        this.mFaceBufferIndex = 0;
        this.mTexCoordsBufferIndex = 0;
    }

    public void freeVBO() {
        if (this.mVertBufferIndex != 0) {
            mVBOCount--;
            int[] iArr = {this.mVertBufferIndex};
            GLES20.glDeleteBuffers(1, iArr, 0);
            iArr[0] = this.mFaceBufferIndex;
            GLES20.glDeleteBuffers(1, iArr, 0);
            if (this.mTexCoordsBufferIndex != 0) {
                iArr[0] = this.mTexCoordsBufferIndex;
                GLES20.glDeleteBuffers(1, iArr, 0);
            }
            initVBOIndex();
        }
    }

    public void syncUpdatePointVBO() {
        if (!this.isUpdatePointsVBO) {
            this.isUpdatePointsVBO = true;
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.b.f.i.1
                @Override // java.lang.Runnable
                public void run() {
                    i.this.updatePointsVBO();
                }
            });
        }
    }

    public void syncUpdateUvsVBO() {
        if (!this.isUpdateUvsVBO) {
            this.isUpdateUvsVBO = true;
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.b.f.i.2
                @Override // java.lang.Runnable
                public void run() {
                    i.this.updateUvsVBO();
                }
            });
        }
    }

    public void syncUpdateFacesVBO() {
        if (!this.isUpdateFacesVBO) {
            this.isUpdateFacesVBO = true;
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.b.f.i.3
                @Override // java.lang.Runnable
                public void run() {
                    i.this.updateFacesVBO();
                }
            });
        }
    }

    public void updatePointsVBO() {
        points().buffer().position(0);
        GLES20.glBindBuffer(34962, this.mVertBufferIndex);
        GLES20.glBufferData(34962, vertices().points().buffer().capacity() * 4, vertices().points().buffer(), 35044);
        GLES20.glBindBuffer(34962, 0);
        invalidate();
        this.isUpdatePointsVBO = false;
    }

    public void updateUvsVBO() {
        vertices().uvs().buffer().position(0);
        GLES20.glBindBuffer(34962, this.mTexCoordsBufferIndex);
        try {
            GLES20.glBufferData(34962, vertices().uvs().buffer().capacity() * 4, vertices().uvs().buffer(), 35044);
        } catch (Exception e) {
            e.printStackTrace();
        }
        GLES20.glBindBuffer(34962, 0);
        invalidate();
        this.isUpdateUvsVBO = false;
    }

    public void updateFacesVBO() {
        this.mIndexCount = faces().buffer().limit();
        GLES20.glBindBuffer(34963, this.mFaceBufferIndex);
        faces().buffer().position(0);
        GLES20.glBufferData(34963, faces().buffer().capacity() * 2, faces().buffer(), 35044);
        GLES20.glBindBuffer(34963, 0);
        invalidate();
        this.isUpdateFacesVBO = false;
    }

    public void initVBO() {
        if (this.mVertBufferIndex == 0) {
            mVBOCount++;
            int[] iArr = new int[1];
            GLES20.glGenBuffers(1, iArr, 0);
            this.mVertBufferIndex = iArr[0];
            updatePointsVBO();
            if (hasUvs() && texturesEnabled()) {
                GLES20.glGenBuffers(1, iArr, 0);
                this.mTexCoordsBufferIndex = iArr[0];
                updateUvsVBO();
            }
            GLES20.glGenBuffers(1, iArr, 0);
            this.mFaceBufferIndex = iArr[0];
            updateFacesVBO();
        }
    }

    public Number3d localRotationToGlobal(Number3d number3d) {
        while (true) {
            Number3d number3dRotation = this.rotation();
            number3d.x += number3dRotation.x;
            number3d.y += number3dRotation.y;
            number3d.z = number3dRotation.z + number3d.z;
            Object objParent = this.parent();
            if (objParent == null || (objParent instanceof com.censivn.C3DEngine.a.g)) {
                break;
            }
            this = (i) objParent;
        }
        return number3d;
    }

    public Number3d globalScaleToLocal(Number3d number3d) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(this);
            Object objParent = this.parent();
            if (objParent == null || (objParent instanceof com.censivn.C3DEngine.a.g)) {
                break;
            }
            this = (i) objParent;
        }
        int size = arrayList.size() - 1;
        while (true) {
            int i = size;
            if (i > -1) {
                Number3d number3dScale = ((i) arrayList.get(i)).scale();
                number3d.x /= number3dScale.x;
                number3d.y /= number3dScale.y;
                number3d.z /= number3dScale.z;
                size = i - 1;
            } else {
                return number3d;
            }
        }
    }

    public Number3d globalRotationToLocal(Number3d number3d) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(this);
            Object objParent = this.parent();
            if (objParent == null || (objParent instanceof com.censivn.C3DEngine.a.g)) {
                break;
            }
            this = (i) objParent;
        }
        int size = arrayList.size() - 1;
        while (true) {
            int i = size;
            if (i > -1) {
                Number3d number3dRotation = ((i) arrayList.get(i)).rotation();
                number3d.x -= number3dRotation.x;
                number3d.y -= number3dRotation.y;
                number3d.z -= number3dRotation.z;
                size = i - 1;
            } else {
                return number3d;
            }
        }
    }

    public Number3d localScaleToGlobale(Number3d number3d) {
        while (true) {
            number3d.x *= this.scale().x;
            number3d.y *= this.scale().y;
            number3d.z *= this.scale().z;
            Object objParent = this.parent();
            if (objParent == null || (objParent instanceof com.censivn.C3DEngine.a.g)) {
                break;
            }
            this = (i) objParent;
        }
        return number3d;
    }

    public Number3d localToGlobal(Number3d number3d) {
        while (true) {
            PositionNumber3d positionNumber3dPosition = this.position();
            number3d.rotateAll(this.rotation());
            number3d.x += positionNumber3dPosition.x;
            number3d.y += positionNumber3dPosition.y;
            number3d.z = positionNumber3dPosition.z + number3d.z;
            Object objParent = this.parent();
            if (objParent == null || (objParent instanceof com.censivn.C3DEngine.a.g)) {
                break;
            }
            i iVar = (i) objParent;
            number3d.x *= iVar.scale().x;
            number3d.y *= iVar.scale().y;
            number3d.z *= iVar.scale().z;
            this = iVar;
        }
        return number3d;
    }

    public Number3d globalToLocal(Number3d number3d) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(this);
            Object objParent = this.parent();
            if (objParent == null || (objParent instanceof com.censivn.C3DEngine.a.g)) {
                break;
            }
            this = (i) objParent;
        }
        int size = arrayList.size() - 1;
        while (true) {
            int i = size;
            if (i > -1) {
                PositionNumber3d positionNumber3dPosition = ((i) arrayList.get(i)).position();
                Number3d number3dScale = ((i) arrayList.get(i)).scale();
                number3d.x -= positionNumber3dPosition.x;
                number3d.y -= positionNumber3dPosition.y;
                number3d.z -= positionNumber3dPosition.z;
                number3d.x /= number3dScale.x;
                number3d.y /= number3dScale.y;
                number3d.z /= number3dScale.z;
                number3d.rotateReverseAll(((i) arrayList.get(i)).rotation());
                size = i - 1;
            } else {
                return number3d;
            }
        }
    }

    public void doubleSidedClickEnabled(boolean z) {
        this.doubleSidedClickEnabled = z;
    }

    public boolean doubleSidedClickEnabled() {
        return this.doubleSidedClickEnabled;
    }

    public boolean calTouchCollision(float f, float f2) {
        if (this.mVirtualObject != null) {
            return this.mVirtualObject.calTouchCollision(f, f2);
        }
        if (mouseAreaDynamic()) {
            calAABB();
        }
        com.censivn.C3DEngine.a.c.b(this.TEMP_AABB_TL, 0, this.AABB_MATRIX, 0, this.AABB_TL, 0);
        com.censivn.C3DEngine.a.c.b(this.TEMP_AABB_TR, 0, this.AABB_MATRIX, 0, this.AABB_TR, 0);
        com.censivn.C3DEngine.a.c.b(this.TEMP_AABB_BL, 0, this.AABB_MATRIX, 0, this.AABB_BL, 0);
        com.censivn.C3DEngine.a.c.b(this.TEMP_AABB_BR, 0, this.AABB_MATRIX, 0, this.AABB_BR, 0);
        float f3 = (this.TEMP_AABB_TL[0] / this.TEMP_AABB_TL[3]) * com.censivn.C3DEngine.b.b.a.H;
        float f4 = (this.TEMP_AABB_TL[1] / this.TEMP_AABB_TL[3]) * com.censivn.C3DEngine.b.b.a.I;
        float f5 = (this.TEMP_AABB_TR[0] / this.TEMP_AABB_TR[3]) * com.censivn.C3DEngine.b.b.a.H;
        float f6 = (this.TEMP_AABB_TR[1] / this.TEMP_AABB_TR[3]) * com.censivn.C3DEngine.b.b.a.I;
        float f7 = (this.TEMP_AABB_BL[0] / this.TEMP_AABB_BL[3]) * com.censivn.C3DEngine.b.b.a.H;
        float f8 = (this.TEMP_AABB_BL[1] / this.TEMP_AABB_BL[3]) * com.censivn.C3DEngine.b.b.a.I;
        float f9 = (this.TEMP_AABB_BR[0] / this.TEMP_AABB_BR[3]) * com.censivn.C3DEngine.b.b.a.H;
        float f10 = (this.TEMP_AABB_BR[1] / this.TEMP_AABB_BR[3]) * com.censivn.C3DEngine.b.b.a.I;
        this.AABB_P1.a(f - f3, f2 - f4);
        this.AABB_P2.a(f - f5, f2 - f6);
        this.AABB_P3.a(f - f7, f2 - f8);
        this.AABB_P4.a(f - f9, f2 - f10);
        float fA = a.a(this.AABB_P1, this.AABB_P2);
        float fA2 = a.a(this.AABB_P2, this.AABB_P3);
        float fA3 = a.a(this.AABB_P3, this.AABB_P1);
        if (fA < 0.0f && fA2 < 0.0f && fA3 < 0.0f) {
            return true;
        }
        if (this.doubleSidedClickEnabled && fA > 0.0f && fA2 > 0.0f && fA3 > 0.0f) {
            return true;
        }
        float fA4 = a.a(this.AABB_P2, this.AABB_P3);
        float fA5 = a.a(this.AABB_P3, this.AABB_P4);
        float fA6 = a.a(this.AABB_P4, this.AABB_P2);
        if (fA4 <= 0.0f || fA5 <= 0.0f || fA6 <= 0.0f) {
            return this.doubleSidedClickEnabled && fA4 < 0.0f && fA5 < 0.0f && fA6 < 0.0f;
        }
        return true;
    }

    public void setAABBSP(float f, float f2, float f3, float f4, float f5, float f6) {
        setAABBPX(f * com.censivn.C3DEngine.b.b.a.a, f2 * com.censivn.C3DEngine.b.b.a.a, f3 * com.censivn.C3DEngine.b.b.a.a, f4 * com.censivn.C3DEngine.b.b.a.a, f5 * com.censivn.C3DEngine.b.b.a.a, f3 * com.censivn.C3DEngine.b.b.a.a);
    }

    public void setAABBPX(float f, float f2) {
        setAABBPX((-f) / 2.0f, (-f2) / 2.0f, 0.0f, f / 2.0f, f2 / 2.0f, 0.0f);
    }

    public void setAABBPX(float f, float f2, float f3, float f4, float f5, float f6) {
        this.AABB_TL[0] = f;
        this.AABB_TL[1] = f5;
        this.AABB_TL[2] = f3;
        this.AABB_TL[3] = 1.0f;
        this.AABB_TR[0] = f4;
        this.AABB_TR[1] = f5;
        this.AABB_TR[2] = f3;
        this.AABB_TR[3] = 1.0f;
        this.AABB_BL[0] = f;
        this.AABB_BL[1] = f2;
        this.AABB_BL[2] = f3;
        this.AABB_BL[3] = 1.0f;
        this.AABB_BR[0] = f4;
        this.AABB_BR[1] = f2;
        this.AABB_BR[2] = f3;
        this.AABB_BR[3] = 1.0f;
    }

    public void copyAABB(i iVar) {
        this.AABB_TL[0] = iVar.AABB_TL[0];
        this.AABB_TL[1] = iVar.AABB_TL[1];
        this.AABB_TL[2] = iVar.AABB_TL[2];
        this.AABB_TL[3] = iVar.AABB_TL[3];
        this.AABB_TR[0] = iVar.AABB_TR[0];
        this.AABB_TR[1] = iVar.AABB_TR[1];
        this.AABB_TR[2] = iVar.AABB_TR[2];
        this.AABB_TR[3] = iVar.AABB_TR[3];
        this.AABB_BL[0] = iVar.AABB_BL[0];
        this.AABB_BL[1] = iVar.AABB_BL[1];
        this.AABB_BL[2] = iVar.AABB_BL[2];
        this.AABB_BL[3] = iVar.AABB_BL[3];
        this.AABB_BR[0] = iVar.AABB_BR[0];
        this.AABB_BR[1] = iVar.AABB_BR[1];
        this.AABB_BR[2] = iVar.AABB_BR[2];
        this.AABB_BR[3] = iVar.AABB_BR[3];
    }

    public float minX() {
        return this.AABB_TL[0];
    }

    public void minX(float f) {
        this.AABB_TL[0] = f;
        this.AABB_BL[0] = f;
    }

    public float minY() {
        return this.AABB_BL[1];
    }

    public void minY(float f) {
        this.AABB_BL[1] = f;
        this.AABB_BR[1] = f;
    }

    public float minZ() {
        return this.AABB_TL[2];
    }

    public void minZ(float f) {
        this.AABB_TL[2] = f;
        this.AABB_TR[2] = f;
        this.AABB_BL[2] = f;
        this.AABB_BR[2] = f;
    }

    public float maxX() {
        return this.AABB_TR[0];
    }

    public void maxX(float f) {
        this.AABB_TR[0] = f;
        this.AABB_BR[0] = f;
    }

    public float maxY() {
        return this.AABB_TL[1];
    }

    public void maxY(float f) {
        this.AABB_TL[1] = f;
        this.AABB_TR[1] = f;
    }

    public void maxZ(float f) {
    }

    public float maxZ() {
        return this.AABB_TL[2];
    }

    public void calAABB(float f, float f2, float f3) {
        float fMax;
        float f4;
        float f5;
        float fMin;
        float fMin2;
        float fMin3;
        float fMax2;
        float fMax3;
        this.isAABBInit = true;
        int size = 0;
        if (this instanceof j) {
            size = ((j) this).children().size();
        }
        if (size <= 0) {
            fMax = 0.0f;
            f4 = 0.0f;
            f5 = 0.0f;
            fMin = 0.0f;
            fMin2 = 0.0f;
            fMin3 = 0.0f;
        } else {
            j jVar = (j) this;
            int size2 = jVar.children().size();
            float fMin4 = 0.0f;
            float fMin5 = 0.0f;
            float fMin6 = 0.0f;
            float fMax4 = 0.0f;
            float fMax5 = 0.0f;
            float fMax6 = 0.0f;
            for (int i = 0; i < size2; i++) {
                i iVar = jVar.children().get(i);
                if (!iVar.isAABBInit) {
                    iVar.calAABB();
                }
                fMin4 = Math.min(fMin4, iVar.AABB_TL[0] + iVar.position().x);
                fMin5 = Math.min(fMin5, iVar.AABB_BL[1] + iVar.position().y);
                fMin6 = Math.min(fMin6, iVar.AABB_TL[2] + iVar.position().z);
                fMax4 = Math.max(fMax4, iVar.AABB_TR[0] + iVar.position().x);
                fMax5 = Math.max(fMax5, iVar.AABB_TL[1] + iVar.position().y);
                fMax6 = Math.max(fMax6, iVar.position().z + iVar.AABB_TL[2]);
            }
            fMax = fMax6;
            f4 = fMax5;
            f5 = fMax4;
            fMin = fMin6;
            fMin2 = fMin5;
            fMin3 = fMin4;
        }
        int size3 = points().size();
        int i2 = 0;
        float f6 = f4;
        float f7 = f5;
        while (i2 < size3) {
            Number3d asNumber3dPX = points().getAsNumber3dPX(i2);
            if (i2 == 0) {
                fMax2 = asNumber3dPX.x;
                fMax3 = asNumber3dPX.y;
                fMax = asNumber3dPX.z;
                fMin = fMax;
                fMin2 = fMax3;
                fMin3 = fMax2;
            } else {
                fMin3 = Math.min(fMin3, asNumber3dPX.x);
                fMin2 = Math.min(fMin2, asNumber3dPX.y);
                fMin = Math.min(fMin, asNumber3dPX.z);
                fMax2 = Math.max(f7, asNumber3dPX.x);
                fMax3 = Math.max(f6, asNumber3dPX.y);
                fMax = Math.max(fMax, asNumber3dPX.z);
            }
            i2++;
            f6 = fMax3;
            f7 = fMax2;
        }
        setAABBPX(fMin3 * f, fMin2 * f2, fMin * f3, f7 * f, f6 * f2, fMax * f3);
    }

    public void calAABB() {
        calAABB(1.0f, 1.0f, 1.0f);
    }

    public void mouseAreaDynamic(boolean z) {
        this.mMouseAreaDynamic = z;
    }

    public boolean mouseAreaDynamic() {
        return this.mMouseAreaDynamic;
    }

    public void mouseEnabled(boolean z) {
        this.mMouseEnabled = z;
    }

    public boolean mouseEnabled() {
        return this.mMouseEnabled;
    }

    public void mouseSkip(boolean z) {
        this.mMouseSkip = z;
    }

    public boolean mouseSkip() {
        return this.mMouseSkip;
    }

    public void setMouseEventListener(com.censivn.C3DEngine.b.d.a aVar) {
        this._mouseEventListener = aVar;
    }

    public com.censivn.C3DEngine.b.d.a getMouseEventListener() {
        return this._mouseEventListener;
    }

    public i getHittingObjectTarget(MotionEvent motionEvent, boolean z) {
        float[] fArrA = x.a(motionEvent);
        return getHittingObjectTarget(fArrA[0], fArrA[1], z);
    }

    public i getHittingObjectTarget(float f, float f2, boolean z) {
        if (!visible()) {
            return null;
        }
        if (!z) {
            if (!calTouchCollision(f, f2)) {
                return getHittingObjectTarget(f, f2, true);
            }
            return this;
        }
        if (!(this instanceof j)) {
            return null;
        }
        j jVar = (j) this;
        int size = jVar.children().size() - 1;
        while (true) {
            int i = size;
            if (i <= -1) {
                return null;
            }
            i hittingObjectTarget = jVar.children().get(i).getHittingObjectTarget(f, f2, false);
            if (hittingObjectTarget != null) {
                return hittingObjectTarget;
            }
            size = i - 1;
        }
    }

    public i getHittingTarget(float f, float f2, boolean z) {
        if (!mouseEnabled() || !visible() || !getRendererVisibility()) {
            return null;
        }
        if ((getMouseEventListener() != null || (this instanceof com.censivn.C3DEngine.b.f.a.a)) && !mouseSkip() && !z) {
            if (calTouchCollision(f, f2)) {
                return this;
            }
            return null;
        }
        if (!(this instanceof j)) {
            return null;
        }
        j jVar = (j) this;
        int size = jVar.children().size() - 1;
        while (true) {
            int i = size;
            if (i <= -1) {
                return null;
            }
            i hittingTarget = jVar.children().get(i).getHittingTarget(f, f2, false);
            if (hittingTarget != null) {
                return hittingTarget;
            }
            size = i - 1;
        }
    }

    public void setZOrderOnTop() {
        if (parent() != null) {
            f fVarParent = parent();
            fVarParent.removeChild(this);
            fVarParent.addChild(this);
        }
    }

    public void moveAllPointsSP(float f, float f2, float f3) {
        moveAllPointsPX(com.censivn.C3DEngine.b.b.a.a * f, com.censivn.C3DEngine.b.b.a.a * f2, com.censivn.C3DEngine.b.b.a.a * f3);
    }

    public void moveAllPointsPX(float f, float f2, float f3) {
        int size = points().size();
        Number3d number3d = new Number3d(f, f2, f3);
        for (int i = 0; i < size; i++) {
            Number3d asNumber3dPX = points().getAsNumber3dPX(i);
            asNumber3dPX.add(number3d);
            points().setPX(i, asNumber3dPX);
        }
        invalidate();
    }

    @Override // com.censivn.C3DEngine.b.g.b.a
    public com.censivn.C3DEngine.b.g.a.c getTweenChild() {
        return this.mTweenChild;
    }

    @Override // com.censivn.C3DEngine.b.g.b.a
    public void setTweenChild(com.censivn.C3DEngine.b.g.a.c cVar) {
        this.mTweenChild = cVar;
    }

    public void setFocus() {
        if (getMouseEventListener() != null) {
            com.censivn.C3DEngine.a.d.d().a(getMouseEventListener());
        }
    }

    public void killFocus() {
        com.censivn.C3DEngine.a.d.d().a((com.censivn.C3DEngine.b.d.a) null);
    }

    public void onFocus() {
    }

    public void onKillFocus() {
    }

    public void onDrawStart() {
    }

    public void onDrawEnd() {
    }

    public void onUpdateAnimation() {
    }

    public static void disableLauncher() {
        com.censivn.C3DEngine.a.d().getPackageManager().setComponentEnabledSetting(new ComponentName(Home.b(), Home.class.getName()), 2, 1);
    }

    public static class a {
        public float a;
        public float b;

        public void a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public static float a(a aVar, a aVar2) {
            return (aVar.a * aVar2.b) - (aVar.b * aVar2.a);
        }
    }

    public void setLayoutParams(com.censivn.C3DEngine.b.b.b bVar) {
        this.mLayoutParam = bVar;
    }

    public com.censivn.C3DEngine.b.b.b getLayoutParams() {
        return this.mLayoutParam;
    }

    public void onMeasure(int i, int i2) {
    }

    public void measure() {
    }

    public void layout(int i, int i2) {
    }

    public void onChildMeasure(i iVar) {
    }

    public void transferCanvas(float f, float f2, float f3, float f4) {
        this.canvasTempMinX = f;
        this.canvasTempMaxX = f3;
        float fMinX = minX();
        float fMaxX = maxX();
        float f5 = fMinX + position().x;
        float f6 = fMaxX + position().x;
        float fMax = Math.max(f, f5);
        this.canvasMinX = fMax;
        float fMin = Math.min(f3, f6);
        this.canvasMaxX = fMin;
        boolean z = fMax < fMin;
        if (z) {
            setRendererVisibility(true);
        } else {
            setRendererVisibility(false);
        }
        if (z && (this instanceof j)) {
            float f7 = fMax - position().x;
            float f8 = fMin - position().x;
            j jVar = (j) this;
            int size = jVar.children().size();
            for (int i = 0; i < size; i++) {
                jVar.children().get(i).transferCanvas(f7, 0.0f, f8, 0.0f);
            }
        }
    }

    public void transferCanvasV(float f, float f2, float f3, float f4) {
        this.canvasTempMinY = f2;
        this.canvasTempMaxY = f4;
        float fMinY = minY();
        float fMaxY = maxY();
        float f5 = fMinY + position().y;
        float f6 = fMaxY + position().y;
        float fMax = Math.max(f2, f5);
        this.canvasMinY = fMax;
        float fMin = Math.min(f4, f6);
        this.canvasMaxY = fMin;
        minX(f);
        maxX(f3);
        boolean z = fMax < fMin;
        if (z) {
            setRendererVisibility(true);
        } else {
            setRendererVisibility(false);
        }
        if (z && (this instanceof j)) {
            float f7 = -(position().y - f2);
            float f8 = -(position().y - f4);
            j jVar = (j) this;
            int size = jVar.children().size();
            for (int i = 0; i < size; i++) {
                jVar.children().get(i).transferCanvasV(f, f7, f3, f8);
            }
        }
    }

    public boolean isPositionYVisible(float f) {
        float fMinY = minY();
        float fMaxY = maxY() + f;
        float fMax = Math.max(this.canvasTempMinY, fMinY + f);
        this.canvasMinY = fMax;
        float fMin = Math.min(this.canvasTempMaxY, fMaxY);
        this.canvasMaxY = fMin;
        return fMax < fMin;
    }

    public boolean isPositionXVisible(float f) {
        float fMinX = minX();
        float fMaxX = maxX() + f;
        float fMax = Math.max(this.canvasTempMinX, fMinX + f);
        this.canvasMinX = fMax;
        float fMin = Math.min(this.canvasTempMaxX, fMaxX);
        this.canvasMaxX = fMin;
        return fMax < fMin;
    }

    public void notifLayoutRefresh() {
        if (parent() != null) {
            ((j) parent()).onChildMeasure(this);
        }
    }

    public void setRendererVisibility(boolean z) {
        this.rendererVisibility = z;
    }

    public boolean getRendererVisibility() {
        return this.rendererVisibility;
    }
}
