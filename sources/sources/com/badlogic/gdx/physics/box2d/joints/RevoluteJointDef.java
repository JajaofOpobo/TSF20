package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.math.Vector2;

public class RevoluteJointDef {
    public Body bodyA;
    public Body bodyB;
    public Vector2 localAnchorA;
    public Vector2 localAnchorB;

    public void initialize(Body bodyA, Body bodyB, Vector2 anchor) {
    }
}
