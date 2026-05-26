# Error Triage: TSF Shell v3.9.4 Recompilation

## Summary

**Build target:** `compileDebugJavaWithJavac` (Java source only, no DEX/R8)

**Environment:** WSL2 (Ubuntu) with Java 17, AGP 8.8.2, Linux SDK

**Total errors:** 100 (unique locations)

**NPE blocker:** Room annotation processor hits `NullPointerException` on `TypeElement.getNestingKind()` due to malformed source. This is a secondary issue — the 100 javac errors must be resolved first, after which the Room processor error can be addressed.

---

## Error Buckets

### Bucket 1: Filename/classname case mismatch — 87 errors

**Pattern:** `class X is public, should be declared in a file named X.java`

**Root cause:** JADX outputs `public class A` in file `a.java`. On case-insensitive FS (Windows) this is legal. On case-sensitive FS (Linux/WSL) it is not.

**Breakdown by class:**
| Class | Count | Category |
|-------|-------|----------|
| A | 45 | class |
| B | 14 | class |
| C | 11 | class |
| D | 6 | class |
| E | 2 | class |
| F | 1 | class |
| H | 1 | class |
| I | 1 | class |
| A | 2 | interface |
| B | 2 | interface |
| D | 1 | interface |
| F | 1 | interface |

**Affected packages:** `com.censivn.C3DEngine.*`, `com.tsf.shell.*`, `com.tsf.extend.*` (87 files across the entire project)

**Fix approach (automated):** Two options:
1. Rename files to uppercase (`a.java` → `A.java`) — requires updating all cross-file lowercase type references (~86 additional fixes)
2. Change class declarations to lowercase (`public class A` → `public class a`) — requires updating constructors in the same files (~84 additional constructor renames)

Both approaches require follow-up rounds of fixing references that now break. A combined batch script can handle all 87 files + their constructors + obvious wrong-case references in ~2-3 iterations.

---

### Bucket 2: Wrong-case type references — 7 errors

**Pattern:** `cannot find symbol: class X` where symbol name is lowercase but actual class is uppercase.

**Root cause:** Decompiled code references types by lowercase name (`b`, `a`, `d`) when the actual class is uppercase (`B`, `A`, `D`). On Windows javac resolves case-insensitively; on Linux it does not.

**Affected locations:**

| File | Symbol | Expected |
|------|--------|----------|
| `ItemInfo.java` (×4) | `b` | `B` (imported `com.tsf.shell.f.i.B`) |
| `Home.java:42` | `com.tsf.shell.a` | `com.tsf.shell.A` |
| `Home.java:50` | `com.tsf.shell.f.d` | `com.tsf.shell.f.D` |
| `Home.java:60,451,460,469` | `a.InterfaceC0025a` | `InterfaceC0025a` inside inner class `a` |
| `f/e/_h/a.java:11` | `a.InterfaceC0025a` | `InterfaceC0025a` inside inner class `a` |

**Fix:** Replace lowercase type names with uppercase in the 5 affected files.

---

### Bucket 3: JADX-renamed interface names — 5 errors

**Pattern:** `cannot find symbol: class InterfaceC0025a / InterfaceC0113a`

**Root cause:** JADX renames anonymous inner interfaces with generated names (`InterfaceC0025a`) but other files reference these names without importing them, or the interface declaration was lost during class/package clash on Windows decompilation.

**Affected locations:**

| File | Symbol |
|------|--------|
| `Home.java:60,451,460,469` (×4) | `InterfaceC0025a` |
| `f/e/_h/a.java:11` | `InterfaceC0025a` |
| `f/i/_b/d/b.java:30` | `InterfaceC0113a` |

**Fix:** These may require creating stub interfaces or removing the `implements` clause. The interfaces likely exist somewhere in the decompiled output but may have been lost in the class/package clash renaming.

---

### Bucket 4: Cyclic inheritance — 1 error

| File | Error |
|------|-------|
| `f/e/_h/a.java:11` | `cyclic inheritance involving a` |

`public class a implements a.InterfaceC0025a` — the class tries to implement an inner interface of itself (`a.InterfaceC0025a`). This is pre-existing in the decompiled code and requires manual inspection.

**Fix:** Either the `implements` clause is wrong or the inner interface was supposed to be from a different class.

---

## Current State vs Windows Build

| Metric | Windows (cmdline) | WSL/Linux |
|--------|-------------------|-----------|
| Total errors | ~200 | 100 |
| Class/package clash errors | ~86 | 0 |
| Filename case errors | 0 | 87 |
| Cannot-find-symbol errors | ~12 | 12 |
| Other (cyclic, etc.) | ~2 | 1 |

**Key insight:** Class/package clash errors (~86 on Windows) are replaced by filename case errors (87 on Linux). The "true" compilation errors (cannot-find-symbol + cyclic + JADX interface names) are consistent between platforms at ~13-14.

---

## Recommendation

1. **Use WSL/Linux for the build.** The Linux javac gives cleaner errors and avoids the class/package clash issue entirely.
2. **Fix Buckets 1+2 together.** Write a batch script that:
   - Renames files `a.java` → `A.java` where class `A` is declared
   - In those files, also renames constructors `A(...)` → `a(...)` if class was changed to lowercase
   - Fixes the 7 wrong-case references in `ItemInfo.java`, `Home.java`, `f/e/_h/a.java`
3. **Fix Bucket 3 (JADX interface names)** manually — likely requires creating stub interface files or finding the lost declarations.
4. **Fix Bucket 4 (cyclic inheritance)** by inspecting `f/e/_h/a.java` and figuring out the correct parent interface.
5. **After javac passes,** address the Room annotation processor NPE (suspect: source file with malformed annotations confuses Room).

---

## Build Commands

```bash
# WSL (Linux SDK at /opt/android-sdk):
cd ~/TSF20
echo "sdk.dir=/opt/android-sdk" > local.properties
chmod +x gradlew
./gradlew compileDebugJavaWithJavac -Dorg.gradle.java.home=/usr/lib/jvm/java-17-openjdk-amd64
```

Build output: `docs/build-wsl.txt`
