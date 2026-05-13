package com.tsf.shell.f.d.d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
/* loaded from: classes.dex */
public class d {
    public static Body a(World world, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        float f7 = (f + f3) / 2.0f;
        float f8 = (f2 + f4) / 2.0f;
        float f9 = (f3 - f) / 2.0f;
        float f10 = (f4 - f2) / 2.0f;
        if (f9 < 0.0f) {
            f9 = -f9;
        }
        if (f10 < 0.0f) {
            f10 = -f10;
        }
        PolygonShape polygonShape = new PolygonShape();
        polygonShape.setAsBox(f9, f10, new Vector2(0.0f, 0.0f), f5);
        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = polygonShape;
        fixtureDef.density = 1.0f;
        fixtureDef.friction = 0.3f;
        if (f6 > 0.0f) {
            fixtureDef.restitution = f6;
        }
        BodyDef bodyDef = new BodyDef();
        bodyDef.position.set(f7, f8);
        Body createBody = world.createBody(bodyDef);
        createBody.createFixture(fixtureDef);
        if (z) {
            createBody.setType(BodyDef.BodyType.StaticBody);
        } else {
            createBody.setType(BodyDef.BodyType.DynamicBody);
        }
        return createBody;
    }
}
