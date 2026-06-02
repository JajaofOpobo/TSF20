# Decompiled Source Package Analysis

**Total**: 1847 Java files

## TSF-Proprietary Code (COMPILE THESE)

| Package | Files | Description |
|---------|-------|-------------|
| `com/tsf/shell/` | 842 | Main launcher code |
| `com/tsf/extend/` | 296 | Extension modules (wallpaper, themes, base) |
| `com/censivn/C3DEngine/` | 175 | Custom 3D engine |
| `com/ksmobile/` | 16 | KS Mobile launcher utilities |
| **Subtotal** | **1329** | |

## Third-Party Libraries (EXCLUDE — use Gradle deps instead)

| Package | Files | What It Is | Modern Replacement |
|---------|-------|-----------|-------------------|
| `android/support/v4/` + `android/support/v7/` | 338 | Old Android Support Library | `androidx.*` (already in build.gradle.kts) |
| `org/acra/` | 57 | ACRA crash reporting | Delete — being removed |
| `com/badlogic/gdx/` | 44 | **LibGDX** physics/math | `implementation 'com.badlogicgames.gdx:...'` |
| `com/android/` | 37 | Volley HTTP client | `implementation 'com.android.volley:volley:...'` |
| `com/cm/` | 35 | CM (Clean Master/Cheetah Mobile) SDK | Delete — analytics/monetization |
| `com/a/` | 3 | Unknown obfuscated lib | Assess per-file |
| `com/b/` | 1 | Unknown obfuscated (likely resources R class proxy) | Assess |
| `com/c/` | 1 | Unknown obfuscated | Assess |
| **Subtotal** | **516** | | |

## Key Discovery

**The original TSF Shell already used LibGDX** (`com.badlogic.gdx.math.*` and `com.badlogic.gdx.physics.*`). This means:

1. LibGDX is NOT a foreign choice — it was already part of the app
2. The C3DEngine uses LibGDX math/physics internally
3. The `libandenginephysicsbox2dextension.so` native lib connects to these LibGDX physics classes
4. Using LibGDX as the rendering engine replacement is actually the **most natural fit** since it was already a dependency

## Compilation Strategy

1. **Include only**: `com/tsf/`, `com/censivn/`, `com/ksmobile/`
2. **Exclude**: `android/support/`, `org/acra/`, `com/badlogic/`, `com/android/`, `com/cm/`, `com/a/`, `com/b/`, `com/c/`
3. **Add Gradle deps**: LibGDX (math/physics), Volley (if needed)
4. **Fix imports**: `android.support.v4.*` → `androidx.*` in TSF code
5. **Stub/delete**: ACRA calls, Flurry calls, CM SDK calls
