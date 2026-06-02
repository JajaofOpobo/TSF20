package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

public class BodyDef {
    public Vector2 position = new Vector2();

    public static enum BodyType {
        StaticBody,
        DynamicBody,
        KinematicBody
    }
}
