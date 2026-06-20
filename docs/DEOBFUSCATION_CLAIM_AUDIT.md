# Deobfuscation Claim Audit

Date: 2026-06-20

## Summary

Deepseek's claim is only partly supported.

The narrow claim that `sources/sources/com/tsf/shell` has no single-letter Java filenames is true in the current tree. The broader claim that the project is "100% deobfuscated" is not supported by the source tree or the build.

Current evidence:

- `sources/sources/com/tsf/shell`: 0 single-letter Java filenames.
- `sources/sources/com/tsf/shell`: 156 single-letter or underscore-single-letter package directory segments remain.
- `sources/sources/com/tsf/shell`: 348 single-letter inner class/interface/enum declarations remain.
- `sources/sources`: 420 single-letter Java filenames remain.
- Entire repository: 2237 single-letter Java filenames remain, mostly bundled/decompiled dependencies and non-shell packages.
- `./gradlew assembleDebug` still fails at javac's 100-error cap.

## Build Result

Command:

```bash
./gradlew assembleDebug
```

Result: build failed during `:app:compileDebugJavaWithJavac` with 100 reported errors.

Representative error categories:

- Stale short-name references after renames:
  - `cannot find symbol: class b`, `class c`, `class n`, `class f`, etc.
  - Examples: `LabelManager`, `DrawerSortManager`, `GlobalServiceLocator`, `DashPanelController`.
- References to meaningful names that do not match the actual renamed location or declaration:
  - `com.tsf.shell.f.e.SelectionFrameLayoutItem` is referenced widely, but the source tree contains related files such as `ILayoutItem.java` and `f/e/e/ItemLayoutItem.java`.
- Duplicate member/method collisions left by decompiler/rename cleanup:
  - `PageAnimationState.java`: `variable a is already defined in class a`.
  - `FolderItemPositioner.java`: `variable a is already defined in class FolderItemPositioner`.
  - `DrawerItemVisual.java`: duplicate `c()` method signatures.

## What The Claim Gets Right

The top-level app shell filename cleanup appears real:

```bash
find sources/sources/com/tsf/shell -name '*.java' -type f \
  | awk -F/ '{n=$NF; sub(/\.java$/, "", n); if (n ~ /^[A-Za-z]$/) print}'
```

This currently returns no files.

Git history also shows many recoverable rename pairs. For example:

```text
sources/sources/com/tsf/shell/f/i/b/e/g.java
  -> sources/sources/com/tsf/shell/f/i/b/e/DrawerItemVisual.java
```

## What The Claim Overstates

"100% deobfuscated" is too strong for the current repository.

Remaining obfuscation includes:

- package paths such as `f/i/_b/e`, `manager/o/a`, and `_a/a`;
- short inner types such as `class a`, `interface a`, `enum b`;
- method and field names such as `a()`, `b`, `c`, etc.;
- stale references where one side of a rename was updated but same-package or cross-package references were not.

The current compile errors are consistent with an incomplete rename propagation pass, not with a fully coherent semantic deobfuscation.

## Rename Ledger Feasibility

A partial rename ledger can be reconstructed from Git history using rename detection. This works best when a file was renamed with enough unchanged content for Git to recognize similarity.

Limitations:

- Git cannot reliably infer a rename when a file was heavily rewritten in the same commit.
- Some changes appear as delete/add or modify-only rather than a clean rename.
- Class/member renames inside files are not recoverable as rename pairs without deeper AST or diff analysis.
- If Deepseek renamed files outside Git and later committed only the final state, those exact original-to-new pairs may be unrecoverable.
- If a rename and a large rewrite happened in the same commit, similarity can fall below reliable thresholds.

The script `scripts/extract_rename_ledger.py` generates a reproducible TSV ledger from Git's rename detection. Treat it as an evidence-backed baseline, not a perfect historical record.

The script `scripts/reconstruct_rename_ledger.py` uses Git as a snapshot time machine. For each commit, it compares the parent and child Java file sets, then infers old-to-new pairs from normalized source similarity, package/type declarations, imports, methods, identifiers, and path shape. Its high-confidence shell pass generated `docs/deobfuscation_rename_ledger_inferred.tsv`; a looser review pass generated `docs/deobfuscation_rename_ledger_inferred_review.tsv`.

This gives us a stronger ledger process:

- Git-detected ledger: authoritative when Git reports an `Rxxx old -> new` rename.
- Snapshot-inferred ledger: useful when a commit appears as delete/add instead of rename.
- Review ledger: lower threshold candidates that should be manually checked before being treated as fact.

## Recommended Next Steps

1. Generate and review the Git-based ledger.
2. Fix compile errors by category, starting with stale type references that have obvious renamed targets.
3. Add a source consistency check that fails when:
   - a Java filename and public class name diverge;
   - a referenced same-package short type no longer exists;
   - duplicate members created by decompiler cleanup remain.
4. Continue semantic deobfuscation separately for packages, inner classes, fields, and methods.
