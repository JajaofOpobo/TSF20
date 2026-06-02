# Fix Scripts Catalog

Maintainer: opencode (2026-06-02)

## Evolution Overview

All scripts created by Jaja (initial bulk import: 2026-05-26). Logical order inferred from
naming convention (1→2→3→final/precise) and content analysis (each iteration adds features).

---

## Group 1: Type Reference Case Fixes

Fix import/fully-qualified/bare type references after JADX renamed `a.java → A.java`.

| # | File | Status | Purpose |
|---|------|--------|---------|
| 1 | `fix_refs.py` | **OBSOLETE** | Initial version: git-diff rename detection, basic import/FQ/bare ref patterns |
| 2 | `fix_refs2.py` | **OBSOLETE** | Adds nested imports, cast `(oldname)`, `.this`, generics `<oldname>`. Has duplicated code block. |
| 3 | `fix_refs3.py` | **OBSOLETE** | Adds placeholder protection for package/import lines before FQ regex substitution |
| 4 | `fix_refs_final.py` | **CURRENT** | Detects subpackage/type conflicts, processes line-by-line, skips package declarations, callback-based FQ fix with context checking |
| — | `fix_all_refs.py` | **CURRENT** | Parallel alternative (simpler regex, no conflict detection). Not part of the 1→2→3→final lineage. |

---

## Group 2: Constructor Name Case Fixes

Fix `<init>` → class name case mismatches after JADX rename.

| # | File | Status | Purpose |
|---|------|--------|---------|
| 1 | `fix_constructors.py` | **OBSOLETE** | Initial version: simple regex, replaces wrong-case constructors at line-start with optional modifiers |
| 2 | `fix_constructors2.py` | **OBSOLETE** | Uses `(^|\\n)` anchor, less thorough |
| 3 | `fix_constructors3.py` | **OBSOLETE** | Brace-scope tracking: gets class body range, only fixes constructors within scope. Handles `/* synthetic */` |
| 4 | `fix_constructors_final.py` | **OBSOLETE** | Reads build errors from `docs/build-output-round1.txt`, targeted fixes with brace-depth tracking |
| 5 | `fix_constructors_precise.py` | **CURRENT** | Reads `docs/build-output-current.txt`, return-type detection (skips methods), most precise |

---

## Group 3: Class Declaration Case Fixes

Fix `class D {` → `class d {` in `d.java`.

| # | File | Status | Purpose |
|---|------|--------|---------|
| 1 | `fix_class_decls.py` | **OBSOLETE** | Initial version: handles upper→lower only, fewer self-reference patterns |
| 2 | `fix_class_decls2.py` | **CURRENT** | Handles both directions (upper↔lower), fixes `D.this`, `new D()`, `D.c()` self-references |

---

## Group 4: Infrastructure (Standalone)

| File | Status | Purpose |
|------|--------|---------|
| `fix_filenames.py` | **CURRENT** | Renames `.java` files to match declared class name (case-insensitive FS fix). Uses `shutil.move`, handles duplicate detection. |
| `fix_clashes.py` | **CURRENT** | Renames class/directory clash dirs to `_`-prefix (e.g. `a/`→`_a/`). Updates all package declarations and imports in renamed tree. |
| `fix_package_refs.py` | **CURRENT** | Updates imports and FQ refs after manual package renames (`com.tsf.shell.a`→`com.tsf.shell._a`) |
| `fix_parcelable_creators.py` | **CURRENT** | Standalone CLI: converts anonymous `Parcelable.Creator<>` to named private static inner class |

---

## Group 5: Batch / Catch-All Fixes

Fix remaining compilation errors by creating missing types, fixing decompilation artifacts.

| # | File | Status | Purpose |
|---|------|--------|---------|
| 1 | `fix_iteration1.py` | **OBSOLETE** | Hardcoded fixes for ~12 specific files, creates InterfaceC0113a/C0079a/C0133a stubs |
| — | `fix_missing_types.py` | **OBSOLETE** | Partial draft — creates A.java, D.java, InterfaceC0113a, H.java stubs. Subsumed by `fix_all.py`. |
| 2 | `fix_all.py` | **CURRENT** | Most comprehensive: creates 7+ missing type stubs, fixes mangled paths, shadowed imports, inner-type→standalone type migration |
| 1 | `fix_remaining.py` | **OBSOLETE** | Post-constructor-fixer: reads `docs/build-output-round2.txt`. Fixes inner type refs, ambiguous imports, package errors |
| 2 | `fix_round2.py` | **CURRENT** | Enhanced version: discovers inner type renames by scanning all files, same 3 fix categories. Reads `docs/build-output-r2.txt`. |

---

## Execution Pipeline (Recommended Order)

```
1. fix_filenames.py        — rename .java files to match class names
2. fix_class_decls2.py     — fix declaration names to match filenames
3. fix_refs_final.py       — fix type references (imports, FQ, bare) for renames
4. fix_constructors_precise.py — fix constructor names via build errors
5. fix_clashes.py          — handle class/directory name clashes
6. fix_package_refs.py     — update refs after package renames
7. fix_all.py              — create missing types, fix remaining artifacts
8. fix_round2.py           — handle round-2 build errors (inner types, ambiguous imports)
<!-- build → if errors remain, run fix_constructors_precise.py again with new build-output -->
```
