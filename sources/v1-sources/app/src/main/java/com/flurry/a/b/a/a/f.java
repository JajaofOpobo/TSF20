package com.flurry.a.b.a.a;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public enum f {
    ANY,
    NON_PRIVATE,
    PROTECTED_AND_PUBLIC,
    PUBLIC_ONLY,
    NONE,
    DEFAULT;

    public final boolean a(Member member) {
        switch (this) {
            case ANY:
                return true;
            case NONE:
                return false;
            case NON_PRIVATE:
                return !Modifier.isPrivate(member.getModifiers());
            case PROTECTED_AND_PUBLIC:
                if (Modifier.isProtected(member.getModifiers())) {
                    return true;
                }
                break;
            case PUBLIC_ONLY:
                break;
            default:
                return false;
        }
        return Modifier.isPublic(member.getModifiers());
    }
}
