package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

/* loaded from: classes.dex */
public class BodyDef {
    public BodyType type = BodyType.StaticBody;
    public final Vector2 position = new Vector2();
    public float angle = 0.0f;
    public final Vector2 linearVelocity = new Vector2();
    public float angularVelocity = 0.0f;
    public float linearDamping = 0.0f;
    public float angularDamping = 0.0f;
    public boolean allowSleep = true;
    public boolean awake = true;
    public boolean fixedRotation = false;
    public boolean bullet = false;
    public boolean active = true;
    public float inertiaScale = 1.0f;

    public enum BodyType {
        StaticBody(0),
        KinematicBody(1),
        DynamicBody(2);

        private int value;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static BodyType[] valuesCustom() {
            BodyType[] valuesCustom = values();
            int length = valuesCustom.length;
            BodyType[] bodyTypeArr = new BodyType[length];
            System.arraycopy(valuesCustom, 0, bodyTypeArr, 0, length);
            return bodyTypeArr;
        }

        BodyType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }
}
