package com.tsf.shell.render;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.SystemClock;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class PageTransitionRenderer implements GLSurfaceView.Renderer {

    private static final long ANIM_DURATION_MS = 400;
    private static final float CAROUSEL_RADIUS = 2.8f;
    private static final float PAGE_WIDTH = 1.4f;
    private static final float TOTAL_ARC = (float) Math.PI * 0.55f;

    private int pageCount = 1;
    private int currentPage;
    private float carouselAngle;
    private float targetAngle;
    private float animStartAngle;
    private long animStartTime;
    private boolean animating;
    private float viewAspect = 1f;

    private int program;
    private int muMVPMatrixHandle;
    private int maPositionHandle;
    private int maTexCoordHandle;
    private int muTextureHandle;
    private int muColorHandle;
    private int muUseTextureHandle;

    private FloatBuffer vertexBuffer;
    private FloatBuffer texCoordBuffer;
    private ShortBuffer indexBuffer;

    private int[] textureIds;
    private Bitmap[] pendingBitmaps;

    private static final float[] VERTICES = {
            -PAGE_WIDTH / 2f, -PAGE_WIDTH / 2f, 0,
            PAGE_WIDTH / 2f, -PAGE_WIDTH / 2f, 0,
            PAGE_WIDTH / 2f, PAGE_WIDTH / 2f, 0,
            -PAGE_WIDTH / 2f, PAGE_WIDTH / 2f, 0
    };

    private static final float[] TEX_COORDS = {
            0, 1,
            1, 1,
            1, 0,
            0, 0
    };

    private static final short[] INDICES = {0, 1, 2, 0, 2, 3};

    private static final int[] PAGE_COLORS = {
            0xFF4A90D9, 0xFFE74C3C, 0xFF2ECC71, 0xFFF39C12,
            0xFF9B59B6, 0xFF1ABC9C, 0xFFE67E22, 0xFF3498DB,
            0xFFE91E63, 0xFF00BCD4, 0xFF8BC34A, 0xFFFF5722,
            0xFF607D8B, 0xFF795548, 0xFFCDDC39, 0xFF3F51B5
    };

    public PageTransitionRenderer() {
        vertexBuffer = ByteBuffer.allocateDirect(VERTICES.length * 4)
                .order(ByteOrder.nativeOrder()).asFloatBuffer();
        vertexBuffer.put(VERTICES).position(0);

        texCoordBuffer = ByteBuffer.allocateDirect(TEX_COORDS.length * 4)
                .order(ByteOrder.nativeOrder()).asFloatBuffer();
        texCoordBuffer.put(TEX_COORDS).position(0);

        indexBuffer = ByteBuffer.allocateDirect(INDICES.length * 2)
                .order(ByteOrder.nativeOrder()).asShortBuffer();
        indexBuffer.put(INDICES).position(0);
    }

    public void setPageCount(int count) {
        pageCount = Math.max(count, 1);
        textureIds = new int[pageCount];
        Arrays.fill(textureIds, -1);
        pendingBitmaps = new Bitmap[pageCount];
        updateTargetAngle();
    }

    public void setCurrentPage(int page) {
        if (page < 0 || page >= pageCount || page == currentPage) return;
        animateToPage(page);
    }

    public void animateToPage(int page) {
        if (page < 0 || page >= pageCount) return;
        animStartAngle = carouselAngle;
        animStartTime = SystemClock.elapsedRealtime();
        currentPage = page;
        updateTargetAngle();
        animating = true;
    }

    public void snapToPage(int page) {
        if (page < 0 || page >= pageCount) return;
        currentPage = page;
        updateTargetAngle();
        carouselAngle = targetAngle;
        animating = false;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setPageTexture(int index, Bitmap bitmap) {
        if (index < 0 || index >= pageCount) return;
        pendingBitmaps[index] = bitmap;
    }

    private void updateTargetAngle() {
        float step = pageCount > 1 ? TOTAL_ARC / (pageCount - 1) : 0;
        float start = -TOTAL_ARC / 2f;
        targetAngle = -(start + currentPage * step);
    }

    private void updateAnimation() {
        if (!animating) return;
        long elapsed = SystemClock.elapsedRealtime() - animStartTime;
        float t = Math.min(1f, (float) elapsed / ANIM_DURATION_MS);
        t = t * t * (3f - 2f * t);
        carouselAngle = animStartAngle + (targetAngle - animStartAngle) * t;
        if (t >= 1f) {
            carouselAngle = targetAngle;
            animating = false;
        }
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        GLES20.glClearColor(0.05f, 0.05f, 0.08f, 1f);
        GLES20.glEnable(GLES20.GL_DEPTH_TEST);
        GLES20.glEnable(GLES20.GL_BLEND);
        GLES20.glBlendFunc(GLES20.GL_SRC_ALPHA, GLES20.GL_ONE_MINUS_SRC_ALPHA);

        String vertexShader = "uniform mat4 uMVPMatrix;"
                + "attribute vec4 aPosition;"
                + "attribute vec2 aTexCoord;"
                + "varying vec2 vTexCoord;"
                + "void main() {"
                + "  gl_Position = uMVPMatrix * aPosition;"
                + "  vTexCoord = aTexCoord;"
                + "}";

        String fragmentShader = "precision mediump float;"
                + "varying vec2 vTexCoord;"
                + "uniform sampler2D uTexture;"
                + "uniform vec4 uColor;"
                + "uniform bool uUseTexture;"
                + "void main() {"
                + "  if (uUseTexture) {"
                + "    gl_FragColor = texture2D(uTexture, vTexCoord);"
                + "  } else {"
                + "    gl_FragColor = uColor;"
                + "  }"
                + "}";

        program = createProgram(vertexShader, fragmentShader);
        muMVPMatrixHandle = GLES20.glGetUniformLocation(program, "uMVPMatrix");
        maPositionHandle = GLES20.glGetAttribLocation(program, "aPosition");
        maTexCoordHandle = GLES20.glGetAttribLocation(program, "aTexCoord");
        muTextureHandle = GLES20.glGetUniformLocation(program, "uTexture");
        muColorHandle = GLES20.glGetUniformLocation(program, "uColor");
        muUseTextureHandle = GLES20.glGetUniformLocation(program, "uUseTexture");

        if (textureIds != null) {
            Arrays.fill(textureIds, -1);
        }
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0, 0, width, height);
        viewAspect = (float) width / height;
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        updateAnimation();
        processPendingTextures();
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BUFFER_BIT);

        if (pageCount == 0) return;

        float[] projectionMatrix = new float[16];
        Matrix.perspectiveM(projectionMatrix, 0, 45f, viewAspect, 0.1f, 100f);

        float[] viewMatrix = new float[16];
        Matrix.setLookAtM(viewMatrix, 0, 0, 0, 4.5f, 0, 0, 0, 0, 1, 0);

        float step = pageCount > 1 ? TOTAL_ARC / (pageCount - 1) : 0;
        float start = -TOTAL_ARC / 2f;

        GLES20.glUseProgram(program);

        for (int i = 0; i < pageCount; i++) {
            float pageAngle = start + i * step + carouselAngle;
            float x = (float) Math.sin(pageAngle) * CAROUSEL_RADIUS;
            float z = (float) Math.cos(pageAngle) * CAROUSEL_RADIUS - CAROUSEL_RADIUS;

            float[] modelMatrix = new float[16];
            Matrix.setIdentityM(modelMatrix, 0);
            Matrix.translateM(modelMatrix, 0, x, 0, z);
            Matrix.rotateM(modelMatrix, 0, (float) Math.toDegrees(-pageAngle), 0, 1, 0);
            Matrix.scaleM(modelMatrix, 0, 1f, 1f / viewAspect, 1f);

            float[] mvMatrix = new float[16];
            Matrix.multiplyMM(mvMatrix, 0, viewMatrix, 0, modelMatrix, 0);

            float[] mvpMatrix = new float[16];
            Matrix.multiplyMM(mvpMatrix, 0, projectionMatrix, 0, mvMatrix, 0);

            GLES20.glUniformMatrix4fv(muMVPMatrixHandle, 1, false, mvpMatrix, 0);

            boolean hasTexture = textureIds != null && i < textureIds.length && textureIds[i] != -1;
            GLES20.glUniform1i(muUseTextureHandle, hasTexture ? 1 : 0);

            if (hasTexture) {
                GLES20.glActiveTexture(GLES20.GL_TEXTURE0);
                GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, textureIds[i]);
                GLES20.glUniform1i(muTextureHandle, 0);
            } else {
                int color = PAGE_COLORS[i % PAGE_COLORS.length];
                float r = ((color >> 16) & 0xFF) / 255f;
                float g = ((color >> 8) & 0xFF) / 255f;
                float b = (color & 0xFF) / 255f;
                float fade = 1f - Math.abs(pageAngle) / (TOTAL_ARC * 0.7f);
                fade = Math.max(0.4f, fade);
                GLES20.glUniform4f(muColorHandle, r * fade, g * fade, b * fade, fade);
            }

            GLES20.glVertexAttribPointer(maPositionHandle, 3, GLES20.GL_FLOAT, false, 0, vertexBuffer);
            GLES20.glEnableVertexAttribArray(maPositionHandle);
            GLES20.glVertexAttribPointer(maTexCoordHandle, 2, GLES20.GL_FLOAT, false, 0, texCoordBuffer);
            GLES20.glEnableVertexAttribArray(maTexCoordHandle);

            GLES20.glDrawElements(GLES20.GL_TRIANGLES, INDICES.length, GLES20.GL_UNSIGNED_SHORT, indexBuffer);

            GLES20.glDisableVertexAttribArray(maPositionHandle);
            GLES20.glDisableVertexAttribArray(maTexCoordHandle);
        }
    }

    private void processPendingTextures() {
        if (pendingBitmaps == null) return;
        for (int i = 0; i < pendingBitmaps.length; i++) {
            if (pendingBitmaps[i] != null) {
                int texId = createTexture(pendingBitmaps[i]);
                if (textureIds != null && i < textureIds.length) {
                    if (textureIds[i] != -1) {
                        GLES20.glDeleteTextures(1, new int[]{textureIds[i]}, 0);
                    }
                    textureIds[i] = texId;
                }
                pendingBitmaps[i].recycle();
                pendingBitmaps[i] = null;
            }
        }
    }

    private int createTexture(Bitmap bitmap) {
        int[] tex = new int[1];
        GLES20.glGenTextures(1, tex, 0);
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, tex[0]);
        GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MIN_FILTER, GLES20.GL_LINEAR);
        GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MAG_FILTER, GLES20.GL_LINEAR);
        GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_S, GLES20.GL_CLAMP_TO_EDGE);
        GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_T, GLES20.GL_CLAMP_TO_EDGE);
        GLUtils.texImage2D(GLES20.GL_TEXTURE_2D, 0, bitmap, 0);
        return tex[0];
    }

    private int loadShader(int type, String source) {
        int shader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(shader, source);
        GLES20.glCompileShader(shader);
        return shader;
    }

    private int createProgram(String vertexSource, String fragmentSource) {
        int vs = loadShader(GLES20.GL_VERTEX_SHADER, vertexSource);
        int fs = loadShader(GLES20.GL_FRAGMENT_SHADER, fragmentSource);
        int prog = GLES20.glCreateProgram();
        GLES20.glAttachShader(prog, vs);
        GLES20.glAttachShader(prog, fs);
        GLES20.glLinkProgram(prog);
        return prog;
    }

    public boolean isAnimating() {
        return animating;
    }
}
