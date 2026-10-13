# BUILD_DISCOVERY_LOG

Per GOAL.md BUILD-DRIVEN DISCOVERY RULE: every significant change gets an entry
recording resolved vs newly-exposed errors, newly discovered files/classes,
root cause, changes, regressions, confidence. Error counts are javac output
lines (cap: 100 unique + simplified duplicates); compare by *failure set*,
not by count alone.

Convention (GOAL.md TRACK M/S, 2026-10-07): each iteration below is tagged
`[M]` (mechanical restore/log-only), `[S]` (semantic, full §10 in session
notes), or `[M+S]` (both). Iteration 1 = `[M+S]`, iteration 2 = `[M]`,
iteration 3 = `[M+S]` (override triage), iteration 4 = `[S]`.

## Progress snapshot (after iteration 4)

Error-category trajectory (unique javac errors, cap 100):

| Category | Baseline | Iter1 | Iter2 | Iter3/4 |
|---|---|---|---|---|
| `b.f does not exist` | 86 | 0 | 0 | 0 |
| other missing packages (`b.c/d/g`, `sprite`, `f`, …) | ~40 lines | shifted | shifting | 0 |
| class/package clashes | 0 | 0 | 0 | 0 |
| duplicate class | 0 | 0 | 0 | 0 |
| `cannot find symbol` (stale refs) | 40 lines | 104 lines | 110 lines | 200 lines (=100 unique) |

Read down columns, not across: the cap hides totals; movement between rows is
the signal. All package-level absence is resolved or archived; what remains is
the stale single-letter reference layer inside real files.

Snapshot after iteration 6: `cannot find symbol` 200 → 176 lines; only remaining
package errors are 2+2 newly surfaced (`ItemStubHelper`, `e`); artifact
categories now visible: duplicate `variable a` (12, `WidgetItemPositioner`),
duplicate `c()` (`WorkspaceShortcutItem`, `WidgetDrawerItemVisual`). Resolved
families: `VObject3d`+`VObject3dContainer` (10+), `b.d` listener set,
`SliderRenderer` pair (22 lines), `SelectionFrameLayoutItem` 33-file family
(459 refs). Archived as phantom: 4 `_inner` dirs + nested-dup dir. Deferred:
top-level `g/` archival, real `e/a`+`e/b` decompile gap, `f.Vertex3s`,
singleton naming.

Snapshot after iteration 27: failure set is pure long-tail stale-symbol
(188 lines) + trio (4) + member-dups + `package e/c` (4). Resolved since:
iteration 28 (EditModeController, DashLayoutContainer, physics family),
iteration 29 (shortcut-info, dash-listener, h/a + comment self-fix).
`Home`/entry, sliders, scroller, drawer-base, anim-dups, label family (7),
panels pair, dash/drop/pool (5 files), physics pair, binder, editor
follow-ups, `g/`+4 `_inner` archived, `getText` twin rule, `InterfaceC0025a`
relocation, singleton/gesture/touch round, `ConfigConstants` self-type.
Deferred-but-tracked: trio renames, mystery-`j`, parent-`h`,
`e/b_inner/a` (moot), full-`g` (done), `EditTarget.*`/`ScreenHelper` restore,
`ServiceProvider.a()` chain, `C3DEngine` singleton naming. Instruments:
DEX type census, method walker with params, twin discipline, parallel
evidence rounds with single-writer apply. Commits: baseline + 6afdb3f4,
12c3242b, a04a998d, fe6c4d51, 097df9b7 (branch goal-driven-reconstruction).

Cumulative changes: 6 files restored from `181df6a5` (5 iter1 + 1 iter2, all
absorbed by Opus revert commit `0b12a217` — index cleaned); 5 stale refs fixed
in `VObject3d.java`; Opus's `EasingFunctions` rename + `*_inner` moves triaged
and kept; 2 missed `e.a_inner` follow-throughs completed; nested-duplicate dir
deleted; 4 phantom `_inner` dirs (11 files) archived to `archive/dex-phantom/`.
Deferred (not guessed): `e/b_inner/a.java` superclass (moot post-archive),
full top-level `g/` archival, real `e/a`+`e/b` decompile gap, `f.Vertex3s`,
singleton naming, duplicate-`c()` renames + mystery-`j` (both blocked on DEX
method-table parsing; iter9 built `/tmp/dexscan.py`, type census works,
method walk still misaligned — bounded next task with smali `b/f/i` as
validator). `_b`-in-DEX downgraded to UNDECIDED (27 referrers vs 0 DEX types +
0 Frida loads; needs Prime-dex re-census or feature-process Frida). Methods established: DEX type-table census (offsets
0x38–0x44 on the v3.9.4 APK) as ground-truth arbiter; v1 byte-match test for
contamination; zero-referrer grep before any archive/delete.

## Iteration 0 — Fresh baseline (clean HEAD)

- Command: `./gradlew compileDebugJavaWithJavac -Dorg.gradle.java.home=/usr/lib/jvm/java-25-openjdk-amd64`
- Output: `docs/build-output-baseline.txt` (733 lines), FAILED in 22s.
- Failure set (unique ~100): `package com.censivn.C3DEngine.b.f does not exist` (86),
  `b.f.sprite` (12), `b.c` (12), `b.d` (10), `b.g` (8), `b.f.ninepatch` (8),
  `b.b` (6), `a` (4), `cannot find symbol` (40, downstream of the above).
- Hotspot files: `FolderShortcutItem.java` (42), `PageItem.java` (14),
  `DrawerShortcutItemBase.java` (12), `WidgetFreeResizeController.java` (10),
  `VObject3d.java` (10).
- Root cause: HEAD commit `a198fa79` deleted the deobfuscated C3DEngine internals
  (`b/f/*`, `a/*`, `b/b/*`, … — 159 files) that `api/*`, `Home.java`,
  `manager/*`, `f/i/*`, `f/e/*` still import. No other error category is
  observable until this hole is addressed.
- Confidence: HIGH (git stat + import graph + build output agree).

## Iteration 1 — VObject3d.vTarget / IRenderable surface

- Investigation: §10 block in session notes 2026-10-07 (VObject3d delegation
  wrapper; v382 `b/f/j` + `b/f/l` lineage; smali `b/f/i` + `i$a` ground truth;
  rename commits `c479ffa6`, `b4a71c11`).
- Changes made:
  1. Restored 5 files from `181df6a5` (revert of deletion, no renames):
     `b/f/IRenderable.java`, `b/f/BaseRenderable.java`,
     `b/f/IRenderableContainer.java`, `a/MatrixUtils.java`,
     `b/b/ScreenConstants.java`.
  2. `VObject3d.java` stale-ref fixes (all HIGH, v382 side-by-side proven):
     `instanceof j` → `instanceof BaseRenderable`;
     `i hittingTarget` → `IRenderable hittingTarget`;
     `c.b(` ×4 → `MatrixUtils.b(`; `A.H/A.I` ×8 → `ScreenConstants.H/I`;
     `i.a.a(` ×6 → `IRenderable.a.a(` (inner point-class cross product;
     residual arg-type question logged as newly-exposed, not papered over).
- Output: `docs/build-output-iter1.txt`, FAILED in 4s (incremental).
- Resolved: `package b.f does not exist` 86 → 0; `VObject3d.java` 10 → 0;
  `VObject3dContainer.java` errors → 0.
- Newly exposed (next frontier, each a future §10 increment):
  - `IRenderable.java` own deps: `b.f.sprite` (TextureSpriteRenderable),
    `b.g._b` (ITweenTarget), `b.d` (MouseEventListener), `f` (Vertex3s et al.),
    `b.g.a` (tween), plus `cannot find symbol` :41–44 (C3DEngine singleton?),
    :82, :1481.
  - `ScreenConstants.java`: :8/:10 (RendererImpl, GridRenderable), :81.
  - `BaseRenderable.java`: :56.
  - Unchanged carry-over: `b.c`/`b.d`/`b.g`/ninepatch/`f` packages still absent;
    `FolderShortcutItem`/`PageItem`/drawer hotspots persist downstream.
- Regressions: none observed (no previously-clean file newly fails; total lines
  still 200 = cap, composition shifted as predicted).
- Confidence: HIGH for restores + 5 ref fixes; MEDIUM for `IRenderable.a.a`
  spelling (symbol resolves per smali `i$a.a(i$a,i$a)`; arg-type symmetry vs
  parent-tree field types is the known open question for iteration 2+).
- Rule check: no batch renames performed; no error-count claim made; restored
  files' own errors treated as newly discovered work.

## Iteration 2 — b.d.MouseEventListener (gesture listener base)

- Investigation: §10 block in session notes 2026-10-07 (VMouseEventListener
  13-gesture vocabulary; DragSortContainer/SideMenuIndicator/AddItemButton/
  WidgetVisualRenderer/PageItemTouchHandler/FolderShortcutItem callers;
  v382 `b/d/a` → `MouseEventListener` rename in `1b7f4093`; smali `b/d/a`
  confirms single-class package).
- Changes made:
  1. Restored 1 file from `181df6a5`:
     `b/d/MouseEventListener.java` (field `IRenderable c`, ctor, 14 empty
     gesture callbacks `a–k`). No renames, no source edits — all callers
     already reference the FQN.
- Output: `docs/build-output-iter2.txt`, FAILED in 14s.
- Resolved: `package b.d does not exist` 16 → 0; `MouseEventListener.java`,
  `VMouseEventListener.java`, `PageItemTouchHandler.java` errors → 0.
- Newly exposed: cap displacement only — `b.f.sprite` 16 → 24,
  `cannot find symbol` 104 → 110 lines, `b.g._b` 2 → 4 were already known
  from iter1's per-file list, now counted at the cap. No new root cause.
- Regressions: none (no previously-clean file newly fails).
- Confidence: HIGH (single file, deps `MotionEvent` + restored `IRenderable`
  both satisfied; compiles clean).
- Next frontier (unchanged): `b.f.sprite.TextureSpriteRenderable`,
  `b.g._b.ITweenTarget`, `b.d`-adjacent dispatch (`a.d`), `f.Vertex3s`,
  `b.g.a` tween types, `C3DEngine` singleton.

## Iteration 3 — Override reconciliation (concurrent-editor triage) [M+S]

- Situation: second agent (Opus) worked the same worktree concurrently —
  committed `0b12a217` (full revert restoring all 159 files deleted by
  `a198fa79`; matches iteration-1 root-cause ruling, content byte-identical to
  my staged restores — verified via empty `git diff HEAD`), set
  `gradle.properties` java.home to system Java 25, renamed
  `EasingFunctions` inner `b` → `EasingInterface`, and moved clash-colliding
  packages `e/a→e/a_inner`, `e/b→e/b_inner`, `g/a→g/a_inner`, `g/b→g/b_inner`
  (uncommitted) with ref updates in `g/s.java`, `g/t.java`.
- Triage verdicts (each verified, none taken on trust):
  1. Full revert commit — KEEP (identical bytes to independent restores).
  2. `gradle.properties` java.home fix — KEEP (build requires it; documented
     as environment, not source).
  3. `EasingFunctions.b` → `EasingInterface` — KEEP (inner `b` interface vs
     three inner `b` classes genuinely ambiguous; zero external `b` refs;
     matches `fix_clashes.py` convention).
  4. `*_inner` moves — KEEP (package/class clashes real per post-revert log;
     no remaining refs to old `g.a/g.b/e.b` packages; completed the missed
     follow-through `e.a.c` → `e.a_inner.c` in `g/s.java` ×2 and
     `g/c/a/a.java` import ×1, verified target `class c` + field `m`).
  5. Nested `e/b_inner/b_inner/` (pure-duplicate `b.java` + corrupted `a.java`
     extending a package) — DELETED, no referrers. [M]
- Output: `docs/build-output-iter3.txt`, FAILED (cap 100 as 200 lines).
- Resolved this round: clash errors → 0; duplicate-class → 0.
- Failure set now: 198 `cannot find symbol` + 2 other. Top symbols: `i` (32),
  `l` (11), `c` (7), `SelectionFrameLayoutItem` (6), `b` (6). Top files:
  `e/a_inner/a.java` + `SliderRenderer.java` (14 each), `FolderShortcutItem`
  + `DashEffectData` (12 each). These are the stale single-letter refs inside
  moved/render files — the audit-predicted layer, now fully exposed.
- Investigated but DEFERRED (TRACK S, not guessed):
  `e/b_inner/a.java:4` (`extends IModelParser`, an interface). Rejected the
  tempting `implements` swap: the class calls `super(f,f2,3,3,false)`, uses
  undeclared fields `A/B`, and its `@Override IModelParser` methods
  (`a_`,`h`,`n_`,`o_`) match neither `IModelParser.b()/c()` — superclass +
  fields need smali/DEX reconstruction first. No smali counterpart under `e/b/`
  (only interface `e/b.smali`); provenance open.
- Regressions: none. Rule check: Opus's unattributed changes were triaged
  per GOAL Step 0/§8 before building on them; going forward single-agent
  ownership of the tree holds per user override.

## Iteration 4 — DEX-census exposes version contamination [S]

- Question: iteration-3 hotspot `e/a_inner/a.java` imports `b.l/b.r/b.v`,
  which exist in no tree, no smali, and no v382 — where did these files come
  from?
- Evidence (all checked, strongest last):
  1. v1 tree contains the same files with identical content
     (`v1/.../e/a/a.java` ≡ tree file; tree `g/s.java` ≡ v1 `g/s.java`
     byte-for-byte modulo later edits).
  2. Rigorous v3.9.4 DEX type-table parse (5923 types, via struct offsets
     0x38/0x3C/0x40/0x44 — reusable method): ZERO top-level `g/` types; ZERO
     `e/a/*`, `e/b/*`, `g/a/*`, `g/b/*` subpackage types. Real `e/a`, `e/b`
     are CLASSES (with inners); real tween scheduler is `b/g/*` (matches
     Frida). Controls (`api VObject3d`, `b/f/i`, `b/d/a`) PRESENT.
  3. Zero referrers outside the phantom cluster (grep over full tree).
- Verdict: the 4 `_inner` dirs (11 files) plus the top-level `g/` single-letter
  cluster are v1-era contamination, not application code. Renaming or refixing
  them would be inventing functionality — archived instead of fixed.
- Changes made: moved `e/a_inner`, `e/b_inner`, `g/a_inner`, `g/b_inner` →
  `archive/dex-phantom/` (as `e-a_inner` etc.; provenance kept, outside
  sourceSets). Also deleted stray nested `e/b_inner/b_inner/` first (pure dup
  + package-extending corrupted variant, zero referrers).
- Output: `docs/build-output-iter4.txt`, FAILED (cap 100 as 200 lines, now
  100% `cannot find symbol` — package/clash/duplicate categories all at zero).
- Resolved: phantom-file errors (`e/a_inner/a` 14 etc.) gone with the files.
- Newly exposed (cap displacement, all real): `ItemRowItem` (12), `ItemNode`
  (8), `MultiSelectLinePicker` (6); `SliderRenderer` still leads (14).
- Deferred with reasons: full top-level `g/` archival (tracked files, separate
  sized increment); real `e/a`, `e/b` classes missing from tree (decompile-from-
  DEX gap — we hold the APK); `e/b_inner/a.java` superclass mystery now moot
  (file archived with its cluster); `f.Vertex3s` stale import; `C3DEngine`
  singleton naming (variant-skew caution between apksum DEX and
  resources-Prime decompile source).
- Regressions: none. Confidence: HIGH (DEX table + v1 byte-match + zero-referrer
  grep triangulate; no naming inferred from identifiers alone).

## Iteration 5 — SliderRenderer/BaseSliderRenderer `i` → `IRenderable` [S]

- Node: `b/b/a/SliderRenderer.java` (14 lines) + `BaseSliderRenderer.java`
  (8 lines), both real (DEX `b/b/a/*` present, 21 types).
- Evidence: bare `i` in `@Override` positions of `IRenderableContainer`
  (`addChild(IRenderable)`, `removeChild(IRenderable)`) and assignments from
  `getChildAt(int)→IRenderable`, `removeChildAt(int)→IRenderable`,
  `children()→ArrayList<IRenderable>` — same pattern as iteration 1's
  `i hittingTarget`, now with interface-signature proof on both sides.
- Changes: regex `\bi (?=(iVar|childAt))` → `IRenderable ` (12 + 9 replacements,
  diff-verified type-positions only; `int i`, loop vars untouched). Both files
  already imported `IRenderable`.
- Output: `docs/build-output-iter5.txt`, FAILED (cap).
- Resolved: both files CLEAN (22 lines).
- Newly exposed: `ItemRowItem` 12 → 24 lines (cap displacement); first
  duplicate-method artifact `c() already defined in WidgetDrawerItemVisual`
  (audit-predicted category, new to the failure set).
- Regressions: none. Confidence: HIGH.

## Iteration 6 — `SelectionFrameLayoutItem` → `ILayoutItem` (33 files) [S]

- Node: FQN `com.tsf.shell.f.e.SelectionFrameLayoutItem` referenced 459× in
  33 files; no such file exists anywhere in tree or DEX.
- Evidence: (1) `f/e/ILayoutItem.java` declares exactly the 15-method set used
  at every reference site (`a(fVar,f,f)`, `m/n/o/p`, `b–h`, `a(fVar)`,
  `a(int,int)`), zero competitors; (2) rename ledger:
  `f/e/F.java` → `ILayoutItem.java` (conf 93, commit `7e0852cf`); (3) DEX has
  no `SelectionFrame*` type — the old FQN is a stale pre-rename spelling.
- Changes: literal single-string FQN replacement (no regex, no ambiguity
  surface), 459 occurrences, residual grep confirms zero remaining.
- Output: `docs/build-output-iter6.txt`, FAILED (cap).
- Resolved: `ItemRowItem`/`ItemLayoutItem`/`ItemNode` and the whole 33-file
  family CLEAN; `cannot find symbol` 200 → 176 lines.
- Newly exposed (decompiler-artifact layer, audit-predicted): `variable a
  already defined in WidgetItemPositioner` (12, new leader file at 24 lines),
  duplicate `c()` in `WorkspaceShortcutItem` + `WidgetDrawerItemVisual`,
  `package ItemStubHelper/e does not exist`.
- Regressions: none. Confidence: HIGH.
- Standing note for Opus's critique: this IS the legitimate batch case — one
  literal string, one verified target, machine-checkable residual. The
  prohibition stands for regex/guess batches, not this.

## Iteration 15 — tween port triage: 7 MATCH, 3 DRIFT, 0 ported (deliberately) [S]

- Two parallel investigators: (A) v382-vs-DEX method-shape drift check per
  file, smali-cross-validated (incl. proving resources/apk == apksum 3.9.4
  for `b/g` paths); (B) reference-adaptation patch table for all 8 v382
  files (existence-checked per ref, HIGH throughout, version-skew traps
  explicitly marked).
- Results: MATCH modulo renames — `b/g/a` registry, `a/a`, `a/b`, `a/c`,
  `a/d`, `b/a`, `b/b` (7/10). DRIFT — v382 `b/c/d` share FQNs with DIFFERENT
  v3.9.4 classes (manager/config/interface: `w->c`, `x->d`, `v->b` letter
  reassignment); porting by FQN would clobber — FORBIDDEN, recorded.
- Decision: port NOTHING this round. Findings: (1) `a/c`, `b/a`, `b/b`
  already have tree equivalents (`AbstractTween`, `ITweenTarget`,
  `TweenTargetWrapper` — fix their `c`→`AbstractTween` leftovers instead);
  (2) `a/a`, `a/b`, `a/d` duplicate existing `RenderableTween`/
  `PropertyTween`/`TimedTween` roles; (3) the genuinely absent `b/g/a`
  registry unblocks ZERO current errors (nothing references it) while its
  15 impl mappings are pure semantic work — queued behind compilability.
- Caution recorded: agent B's "ledger analog" rows for `EasingInterpolator`
  etc. have NO actual ledger rows (verified by grep) — treat as twin-based
  MEDIUM, not ledger-backed, until confirmed.
- Value banked regardless: the MATCH/DRIFT table is now the permanent guard
  against double-restores in `b/g/`; `TweenUtils.b(this)`→`TweenManager.b`
  target-errors identified in 3 tree tween files for a future pass.
- Regressions: none (read-only). Confidence: HIGH.

## Iteration 16 — `InterfaceC0025a` inner-interface relocation [S]

- Node: `Home.java` (4) + `ShellCoreInterface.java` (1):
  `ShellCoreInterface.InterfaceC0025a` undeclared.
- Evidence: sole declaration in tree is
  `ActivityResultBridge.InterfaceC0025a`
  (`onActivityResult(int,int,Intent)`); every caller casts to it when calling
  `Home.a()` (e.g. `PhotoPicker:34`); `Home`/`ShellCoreInterface` already
  import `ActivityResultBridge`. Classic ERROR_TRIAGE Bucket-3
  (JADX-renamed inner interface referenced from old owner).
- Changes: FQN swap at 5 sites (both files already import the owner).
  Output: `docs/build-output-iter16.txt`. Both files CLEAN.
- Regressions: none. Confidence: HIGH.

## Iteration 14 — DEX-vs-tree census: completeness is now finite [M+S]

- Built `scripts/dex_tree_census.py` (ledger-bridged alignment of 3,759 app
  DEX classes vs 1,770 tree files; fixed own aliasing bug on first run).
- Result (`docs/DEX_TREE_CENSUS.md`): EXACT 339 / LEDGER 2,527 / OUTER 702 /
  **MISSING 191** / ORPHANS 477 (incl. support-libs noise + R classes).
- Triaged reading (minus generated R$, kinfoc/cm stubs, support noise):
  real clusters are `extend/theme` ledger gaps, `b/g/a/a–d` + `b/g/b/*`
  (tween core — absent from HEAD *and* `181df6a5`, i.e. lost before the
  deletion saga), shell top-level strays, and the `_b` orphan set (34,
  still UNDECIDED pending Prime-dex/runtime proof).
- Recovery path found without new downloads: v382 (3.8.2) HAS
  `b/g/a/{a,b,c,d}` + `b/g/b/{a,b}` — port-forward with dexscan method-shape
  comparison as the drift check (queued as iteration 15). No jadx/baksmali
  on this machine; v1/v382 twins + DEX shapes are the in-house instruments.
- "Complete source" is now a numbered list, not an aspiration. Census +
  script committed as process infrastructure.
- Regressions: none (read-only + new files only). Confidence: HIGH.

## Iteration 11 — phantom `g.b` → `WidgetPanelController.b` [S]

- Node: `DrawerDragEffectController` field/instantiation `g.b` (top-level `g/`
  has 0 DEX types). Evidence: anonymous subclass carries
  `@Override // WidgetPanelController.b` + method shape
  `a(ArrayList<DrawerItemVisual>)` matching `WidgetPanelController.b`'s own
  member; callback-holder role confirmed by
  `ServiceProvider.a().a().a(this.a)` wiring.
- Correction to my own earlier worry: the anon override
  (`ArrayList<WidgetDrawerItemVisual>` vs base `ArrayList<DrawerItemVisual>`)
  compiles — override-equivalence uses erasure, and no "does not override"
  error appeared. Invariance intuition was wrong; javac adjudicated.
- Output: `docs/build-output-iter11.txt`. `package g does not exist` GONE.
- Newly exposed (same file :20 `class c` ctor param; `ServiceProvider.a()`
  chain whose static `a()` doesn't exist in-tree) — next layers, logged.
- Deferred with a NEW lead: `WorkspaceEditor`'s `e.a` (no same-package `e`,
  no import). Ledger: `f/e/f/a.java` → `f/e/_f/WorkspaceEditor.java`
  (direct_diff 72) — the file's ORIGINAL package context differs from its
  current one, which is likely where `e.a` resolved. Next: reconstruct from
  the original context + unmatched interface methods.
- Regressions: none. Confidence: HIGH (fix), MEDIUM (e.a lead — unproven).

## Iteration 19 — parallel round #3: scroller, drawer-base, anim-dup [S]

- `ScrollStateAggregator` (11): `n/b/g/d` resolved (construction sites,
  delegation interfaces, DEX sigs, ledger). CLEAN.
- `DrawerBaseElement` (5): `k`→`GridRenderable`, `i`→`IRenderable` (DEX field
  + method signatures exact). CLEAN.
- `DrawerItemAnimationManager.a` dup: verdict (b), three roles proven by
  member-access census; follow-up `c` closed by its own construction site
  (`new …(this)` in `DrawerItemContainer`) + member shape. Whole file CLEAN.
- Output: `docs/build-output-iter19.txt`. Regressions: none. HIGH throughout.

## Iteration 20 — label-provider family `i` returns (7 files) [S]

- `ItemGroupBase`/`ItemLabelProvider` + 5 subclass overrides: bare `i`
  returns resolved by override-body convergence (all return
  `BaseRenderable`-typed fields) → `BaseRenderable` (imports added where
  absent). Follow-up `ItemLabelProvider.b(int)` → `LabelRenderable`
  (returns `this.a`, a `LabelRenderable` field — tightest proof of the day).
  `_c/` widget twins + anon classes left untouched (separate hierarchies).
- Output: `docs/build-output-iter20.txt` (note: first run raced the final
  edit; reran clean). Entire 7-file family CLEAN.
- Regressions: none. Confidence: HIGH.

## Iteration 18 — parallel round #2: scroller, drawer-base, anim-manager [S]

- Three read-only investigators, all verified before apply; single-writer.
- `ScrollStateAggregator` (11 unique + 2 latent): `n`→`PageTouchHandler`
  (construction site), `b`→`ScrollBounceHandler` (ctor arg + 12/12 delegation
  match), `g`→`WorkspacePage` (DEX sig + ledger + twin), `d`→`TweenParams`
  (DEX + ledger + override match). Deferred per report: no-arg ctor-statement
  (needs DEX bytecode check). CLEAN.
- `DrawerBaseElement` (5): `k`→`GridRenderable`, 4× `i`→`IRenderable` —
  DEX field/method signatures exact, twin callers converge. Noted
  `TweenUtils.a` own-`d`-param issue as separate file's error. CLEAN.
- `DrawerItemAnimationManager.a` dup: verdict (b) — usages prove three roles
  (`a` target, `b` base, `c` exit); renamed lines 2–3. Follow-up `c` (field +
  ctor) resolved via construction site (`new …(this)` in
  `DrawerItemContainer`) + member/static shape. CLEAN (whole file).
- Output: `docs/build-output-iter18.txt` (distinct from `iter13.txt`, which
  holds parallel round #1's final state).
  Failure set: 186 stale-symbol + `ItemGroupBase.a`/`DrawerItemLayoutData.a`
  dups + trio + `package e/c`.
- Regressions: none. Confidence: HIGH throughout.

## Iteration 13 — parallel-agent round: dash, drop-indicator, object-pool [S]

- Method: three read-only investigators (single-writer discipline: I applied
  everything after spot-verifying each load-bearing claim). All agent
  findings verified before use; one agent miscount corrected (DropIndicator
  8 unique, not 5+3 split as briefed).
- (a) `DashEffectData` + `DashEffectParams`: bare `g`→`WorkspacePage` (ledger
  `f/f/g.java→WorkspacePage` + twin `PageTransitionEffect` signatures + reverse
  call-site `WorkspacePage:120`), bare `<i>`→`<IRenderable>` (twin body
  identical + callee cast demand). Both files already imported the targets.
  CLEAN.
- (b) `DropIndicatorState` + `DropIndicatorConfig`: the old filenames THEMSELVES
  (`c`=State, `d`=Config, `a`=Container, `j`=BaseRenderable) survived inside
  the renamed files — proven four ways (DEX field descriptors, twin,
  ledger, call-site behavior), including two cases where the twin was WRONG
  and DEX overruled it (`C0092c` refs → State). Qualifier rewrites
  (`c.this`/`d.this`) verified lexically scoped. CLEAN.
- (c) `ObjectPoolRenderable`: `f.e.D`→`ObjectPool` (smali superclass + DEX
  existence + method parity; JADX case artifact), 4× `i`→`IRenderable`
  (override signatures + smali params) plus 2 latent same-pattern sites.
  CLEAN.
- Output: `docs/build-output-iter13.txt`. `cannot find symbol` 194 → 188
  lines. Failure set: stale-symbol + duplicate-member artifacts
  (`DrawerItemAnimationManager.a`, trio, `DrawerItemLayoutData.a`) +
  `package e` (WorkspaceEditor, deferred with ledger lead).
- Agent-discipline note: reports carried per-row confidence + explicit
  DO-NOT-TOUCH/DEFER lists (State:69 `new DropIndicatorRenderer()`,
  State:95 container-vs-inner-a ctor, State:338 `x.a`, bare-statement calls);
  those are queued verbatim as the next micro-nodes. Parallel investigation
  with single-writer application works — no collisions, no attribution loss.
- Regressions: none. Confidence: HIGH (every applied fix re-verified here).

## Iteration 12 — top-level `g/` archived (22 files) [M]

- Evidence (all re-verified pre-move): 0 DEX types under `C3DEngine/g/`,
  v1 byte-match (`g/s.java`), zero referrers from outside `g/` (re-grepped
  post-changes). The `b/g/` engine package (TweenManager et al.) is real and
  untouched — only the top-level phantom went to `archive/dex-phantom/top-g/`.
- Output: `docs/build-output-iter12.txt`. No errors attributable to the move;
  `package g` category extinct. Failure set: 194 stale-symbol + trio (4) +
  `package e` (2, = `WorkspaceEditor` only).
- Newly surfaced leaders: `DashEffectData` (12), `DropIndicatorState` (10),
  `ObjectPoolRenderable` (10) — all previously cap-hidden.
- Regressions: none. Confidence: HIGH.

## Iteration 7 — WidgetItemPositioner twin-file reconstruction [S]

- Node: `f/i/_b/d/WidgetItemPositioner.java` (24 lines: dup field + 7 stale
  symbols). Method: parallel-twin comparison with `f/i/b/d/FolderItemPositioner`
  (identical imports, field block, usage line numbers within ±2).
- Fixes (all HIGH, twin-verified):
  1. Deleted 6× duplicated `public TextureElement a;` (lines 74–79; single
     ctor, all usages int-arithmetic served by `int a` line 50). Left the 7×
     duplicated `WidgetItemPositioner();` statements alone (legal Java, and
     removing them changes runtime recursion behaviour — flagged, not touched).
  2. `implements ItemStubHelper.a` → `implements WindowManager.a`
     (`ItemStubHelper` has no inner `a`; file already imports `WindowManager`;
     line 572 `@Override WindowManager.a` with exact-signature method proves).
  3. `static i N/O` → `ScrollingIndicator` (same-package ctor call line 188).
  4. `h I` → `WidgetItemIndicator` (parallel + usage set).
  5. `n J` → `EmptyRenderable` (ctor `new EmptyRenderable()` line 250; import
     added — file lacked it).
  6. `f W` + `f e()` → `WidgetItemBackground` (ctor line 229; `e()` returns W;
     parallel-twin line-number match across 7 usage sites).
- Output: `docs/build-output-iter7.txt`, FAILED (cap).
- Resolved: file CLEAN (24 lines). `cannot find symbol` 176 → 190 lines is
  cap displacement (previously hidden errors now counted), not regression.
- Failure set now: 190 stale-symbol + 8 duplicate-`c()` lines + 2 `package e`.
  Next nodes: duplicate-`c()` pair (new artifact category),
  `DashEffectData` (12), `Home` (8).
- Regressions: none. Confidence: HIGH (twin-file triangulation on every fix).

## Iteration 8 — duplicate-`c()` collisions: investigated, fix DEFERRED [S]

- Node: `WidgetDrawerItemVisual` (`String c()` ×2 + `void c()`) and
  `WorkspaceShortcutItem` (`TextureElement`/`CharSequence`/`void c()`).
- Evidence gathered:
  1. Supertype contracts: `PageItem`/`ShortcutItem` declare only `void c()`;
     `DrawerButtonElement` declares NO `c()` — both `String c()` @Override
     claims are bogus; only `void c()` (with `super.c()` chain) is the true
     override. Bodies: title-getter (`this.a.e`), `r()`-delegate,
     texture-getter (`this.u`), `K().title`-getter.
  2. Caller search: ZERO in-tree value-callers of any colliding getter
     (all `.c()` hits resolve to other receivers: `ShellBindContext`,
     the `FolderShortcutItem.l` static field, `WidgetItemAnimation`'s
     mystery-`j jVar`, `ToggleAction.a`).
  3. DEX method-table parsing built (class_defs walk works, 4960 classes) but
     unusable by session-given names. Structural matching (find triple-`c()`
     classes, match by sibling methods) is the remaining path; queued.
  4. Incidental (queued for the `j` node): `WidgetItemAnimation:36`
     `j jVar = WorkspaceShortcutItem.l` (typed `j`, assigned
     `WidgetItemPositioner`, `.c()` returns folder-data) — `j` is a
     load-bearing unknown touching many files; NOT renamed on this evidence.
  5. `_b`-in-DEX question partially answered: `f/i/_b/` has 0 DEX types AND 0
     Frida-loaded classes, but 27 in-tree referrers — real-but-unloaded
     (feature-process?) vs session-fabricated is UNDECIDED; no archive action
     taken on `_b` (contrast iteration-4 phantoms, which had zero referrers).
- Decision: NO code change. Any rename now would be a LOW-confidence mapping
  promoted without callers or DEX truth to check it against — exactly what
  GOAL forbids. Compilation of these two files stays red pending the
  structural DEX match.
- Confidence in the deferral: HIGH (evidence complete, conclusion explicit).

## Iteration 17 — `VerticalPageRenderer` `i` → `IRenderable` (6 sites) [S]

- Same proven pattern as iterations 1/5 (override + assigned-from proof),
  extended to inner-class occurrences (`getChildAt` locals). Import present.
  File CLEAN. Output: `docs/build-output-iter17.txt`.
- Newly surfaced leader: `ScrollStateAggregator` (22 lines, previously
  cap-hidden). Next nodes: it, `DrawerBaseElement` (10), `WorkspaceEditor`
  `e.a` (10, ledger lead held), `DrawerItemAnimationManager.a` dup (8).
- Regressions: none. Confidence: HIGH.

## Iteration 10 — dexscan fixed; `getText` twin-precedent; trio stays deferred [M+S]

- Tool: `scripts/dex_method_scan.py` promoted from `/tmp/dexscan.py`. Three
  parser bugs fixed against smali ground truth: field/method uleb arity,
  method_idx delta accumulation, class_data counts-first ordering, correct
  header offsets (`mo`=0x5C, `po`=0x4C), null-`class_data_off` guard.
  Validated: `b/f/i` method list, `b/d/a` 1+1+14 shape, `--multic` full sweep.
- Twin-precedent resolution (HIGH): `WidgetDrawerItemVisual` line-110
  `String c()` (title body, bogus `@Override PageItem`) → `getText()`,
  byte-identical to real twin `DrawerItemVisual.getText()` (which carries NO
  annotation — mirrored exactly). Line-115 `String c()` DELETED on two
  independent grounds: duplicate erasure AND dangling callee (`r()`
  undeclared in file). Zero in-tree value-callers either way. File CLEAN.
- Trio (`WorkspaceShortcutItem` TextureElement/CharSequence/void `c()`)
  stays deferred: `void c()` proven true override; folder twin
  (`FolderShortcutItem`, DEX `f/i/b/d/b` with `c→{I,b,V}` triple) carries NO
  value-getters at all, so no twin name exists to mirror; zero callers to
  satisfy; DEX identity of the widget twin unknown (structural hunt queued).
  Renaming now would mint API names from nothing — declined per GOAL.
- Output: `docs/build-output-iter10.txt`. Regressions: none.

## Iteration 9 — DEX structural scanner: tool partial, verdicts refined [S]

- Built `/tmp/dexscan.py` (type-table census WORKS — reused for `b/b/a`,
  `g/`, `e/*`, `f/i/*` verdicts; method-table walk NOT working yet:
  found and fixed field/method uleb-arity split and method_idx delta
  accumulation, still misaligned on real classes — root cause open).
- Findings that stand without method parsing:
  1. Underscore packages (`_a`, `_b`, `_c`, `_d`, `_inner`) are session
     clash-rename artifacts — invisible to DEX-name checks by construction.
     The iteration-4 phantom verdict is unaffected (those files had zero
     referrers AND zero plausibility); but `f/i/_b/` (27 in-tree referrers,
     0 DEX types, 0 Frida loads) is now explicitly UNDECIDED rather than
     phantom-suspect: real-but-unloaded (feature process), Prime-vs-Free
     edition skew (tree cites resources-Prime dex; census used apksum Free
     dex), or session-fabricated split of `f/i/b/` (114 real types) are all
     live hypotheses. NO archive action on `_b`; recorded test: recover
     resources-Prime classes.dex and re-run census, or capture Frida in
     widget-picker flow.
  2. `f/f/` (316 dex types), `f/i/b/` (114), `f/e/` (227), `Home`,
     `ShellApplication` all present — the drawer/page core is real; only the
     underscore splits and top-level `g/` fail the census.
  3. Triple-`c()` structural match is blocked on the method parser; next
     turn finishes it (bounded: validate against smali-known `b/f/i` first —
     smali lists ~60 methods as ground truth for the walk).

## Iterations 21–22 — panel pair `h/A/i` + returns [S]

- `ShortcutsPanel` (19 unique): `h`→`DrawerItemButton` (DEX field type
  `b/e/h`; second `new h()` site proven assignment-compatible via
  `DrawerItemButton extends DrawerShortcutItemBase`), `A`→inner-`a`
  (DEX signatures `d$a`), `i`→`IRenderable` (params + 3 inner returns via
  `m`-field/`ShortcutManager`/null bodies). Parent `ScrollableItemListPanel`
  fixed in lockstep (params, `getChildAt` locals, returns; pre-existing
  imports covered all). ShortcutsPanel CLEAN.
- Deferred with full evidence state: parent `private h b` (6-arg
  int/int/float×4 ctor + `a(SparkleEffect)`/`a(f)`/`b(f,f)`/`d()`/`e()` set;
  PageThumbnailRenderer ruled OUT — no such ctor/methods). Only 2 lines left
  in parent. Next: identify the container-renderable with that ctor shape.
- Outputs: `docs/build-output-iter21.txt`, `iter22.txt`. Regressions: none.
  Confidence: HIGH (fixes), MEDIUM (deferral is evidence-complete).

## Iteration 27 — parallel round #6: physics, binder, editor [S]

- Three read-only investigators (single-writer apply; one agent miscount
  corrected: DropIndicator was 8 unique, not 5+3).
- `ConstraintList`/`ParticleTransform`: cross-type (`e`→`ParticleData`,
  DEX/smali/v382/ledger) vs self-type (`b`→own class, DEX signatures +
  in-file self-evidence) — with explicit no-batch warning heeded (spring
  subpackage shares the letters). CLEAN.
- `ShellBindController`: `d`→`ShellBindStub`, `c`→`ShellBindCallback`
  (ledger + smali fields + 9/9 call-site match); agent's downstream
  `b.a(...)` qualifier trap + `WidgetInstantiator` follow-up recorded, not
  folded in. CLEAN.
- `WorkspaceEditor` follow-ups: `i`→`IRenderable` (assigned-from ×2 +
  method-set), `d`→`DashLayoutContainer` (DEX + ledger + imported-but-unused
  smoking gun), `m`→`LabelRenderable` (initializer subtype + exact method
  set; supertypes provably lack the methods). CLEAN. Agent's 12-point
  latent inventory (`ScreenHelper`, `a.this`, `x/w`, `j.a`, `EditTarget.*`)
  queued verbatim.
- Output: `docs/build-output-iter27.txt`. New leaders: `EditModeController`
  + `DashLayoutContainer` + `PhysicsSystem` (10 each). Regressions: none.
  Confidence: HIGH throughout.

## Iteration 26 — parallel round #5: transitions, touch-G, labels, gesture [S]

- Four read-only investigators, all verified before apply (incl. correcting
  agent shorthand against log carets, and catching a wrong-guess `new h()`
  initializer I almost carried over).
- `TransitionManager` (7 + 2 latent iterators): `LauncherAppInfo`→
  `TransitionRenderer` — smali field/method signatures + ledger + twin
  callers; naive `manager.app` import explicitly rejected (would break
  `a(boolean)/k()/j()` call sites). CLEAN.
- `DesktopTouchHandlerG` (7 + latent locals + missed initializer): smali +
  DEX per-site signatures to `b/f/i` + twin convergence. CLEAN.
- `LabelManager` (5, MEDIUM): V1-vs-V2 judgment for `TextLabelElementV2` —
  `ButtonMetrics.ab` V1 typing + DEX returns + same-package twin against the
  V2-import alternative (which would newly mismatch). CLEAN; V2 remnants
  queued as next layer.
- `GestureMenuOverlay` (5): constructor-assignment proof per field + ledger
  rows + smali field descriptors + supertype cross-checks. CLEAN.
- Output: `docs/build-output-iter26.txt`. Regressions: none. Confidence:
  HIGH (HIGH×3, MEDIUM×1 as marked).

## Iteration 23 — parent-`h` hunt: tool upgraded, node deferred [S]

- Searched by constructor shape instead of name: NO `(I,I,F,F,F,F)` 6-arg
  ctor exists anywhere in C3DEngine (nearest: `F×6` in `b/h/b/h`,
  `b/h/e/{a,b}`, `VNinePathParam`, `b/f/b/b` — ints widen, so still live
  candidates). `PageThumbnailRenderer`, `DesktopTouchHandler{H,base}`
  ruled OUT (no such ctor/method set).
- To run the search, extended `scripts/dex_method_scan.py` to full
  name(params):return output (validated against smali-known classes;
  docstring corrected; `/tmp` copy resynced). The instrument now answers
  "who takes X" and "who has ctor shape Y" structurally across all 4,960
  classes — permanent capability, built for this node.
- Deferred: `ScrollableItemListPanel:16 private h b` (+ twins in
  `TogglePanel:14`, `AppListPanel:26 c`). Evidence state logged above;
  next attempt starts from the F×6 candidate method lists (already dumped
  for 3 of 5) instead of from zero.
- Proportionality note: 12 tool calls without closure is the signal to
  stop per GOAL increments — the turn banked a reusable instrument rather
  than a guess. Confidence: HIGH (tool), MEDIUM (deferral completeness).

## Iteration 24 — parallel round #4 + ShellProvider merge [S]

- Four parallel investigators (single-writer apply): DesktopTouchHandlerC
  (DEX interface/bitmask proof per site), WorkspaceEditor `e.a`
  (DEX 4-interface partition → `WindowManager.a`, residue exactly one
  method), MultiSelectLinePicker 4-way swap (positional DEX-interface
  order vs collision explanation), PageTouchHandler/EditModeNode `l`/`a`
  (DEX descriptors + IS-A call-site proof). One mid-application snag
  (assertion caught a 3-site shortfall from wrong param-name guess) resolved
  by reading actual text — no misapplied edits. New files clean except
  follow-on layers, all logged as exposed (not regressed).
- ShellProvider merge: smali+DEX proved tree inner `a` (empty,
  `extends <interface>`) phantom and tree `A` the real `$a` DB helper
  (db-name/version/bootstrap match + `ShellProvider.a.*` static callers);
  deleted phantom, renamed `A`→`a` (decl/ctor/field/`new`/ShellModel param),
  fixed line-29 `new ShellCoreInterface(getContext())` → `new a(...)`.
  Both files CLEAN. Output: `docs/build-output-iter25.txt`.
- New leaders: `TransitionManager` + `DesktopTouchHandlerG` (14 each),
  `LabelManager` + `GestureMenuOverlay` (10 each).
- Regressions: none. Confidence: HIGH throughout.

## Iteration 28 — EditModeController, DashLayoutContainer, physics [S]

- Three parallel investigators (single-writer apply).
- `EditModeController` (5):Twin-parallel `e.a`→`WindowManager.a` (DEX
  4-interface partition residue proof), `i`→`IRenderable`,
  `d`→`DashLayoutContainer`, `m`→`LabelRenderable` (initializer subtype +
  supertype elimination). CLEAN.
- `DashLayoutContainer` (5): `f`→`TransitionRenderer` (DEX super + twin),
  `c`→`DashLayoutListener` (DEX descriptors + reciprocal), `DashLayoutA.c`
  →`WorkspaceEditor.c` (inner never existed per DEX; ledger + shape).
  CLEAN.
- `PhysicsSystem` family (5+1+3): `c`→`Particle`, `B`→`IPhysicsSystem`,
  `i`→`IRenderable` (smali+v382+DEX+ledger); cascade through
  `IPhysicsSystem.a(c)` fixed at the interface; three implementers needed
  only the missing cross-package import. Whole family CLEAN.
- Output: `docs/build-output-iter28.txt`. Regressions: none. Confidence:
  HIGH throughout.

## Iteration 34 — theme trio: keyboard, detail, xml-parser [S]

- Three investigators (smali descriptors + ledger + twins, all verified).
- `KeyboardPager` (5): `k`→`ThemeModel` (smali sigs + twin consensus +
  unused-import signal; boolean field `k` untouched; `KeyboardThemeModel`
  ruled out by missing `g()`). CLEAN.
- `ThemeDetail` (4 + 5 latent): `o`→`ThemeLoadingDialog`,
  `t`→`ThemeBaseAdapter`, `k`→`ThemeModel` (smali field types + member
  collisions explicitly avoided). CLEAN.
- `ThemeXmlParser` (3 + generic + 6 self-refs): `f`→`ThemeSystemModel`
  (`b()` disambiguation decisive); `ae.`→`ThemeXmlParser.` (no `ae` class
  exists anywhere — stale self-ref, same-class statics confirmed).
  CLEAN. Two misfired applications caught by atomic asserts (whitespace,
  access modifier) before any write.
- Output: `docs/build-output-iter34.txt`. Regressions: none. Confidence:
  HIGH (HIGH×3).

## Iteration 37 — smali-fidelity audit + fix-scripts-era corruption purge [S]

Answer to the standing question: NO — iter-36 was not the only
non-smali-faithful flag. Audit found a whole fix-scripts-era corruption
family (commit 2d27af77 pattern: blind single-letter→named-type substitution).
Verified each against smali/v382/ledger before touching:

- `IRenderable` AABB cluster: fields+constructions `a`→`TextureSpriteRenderable`,
  helper sig, 6 call sites, `a.c.a/b`→`a.Box3DRenderable.a/b`,
  `e.printStackTrace`→`AltColoredRectRenderable`, 5× `j jVar=(BaseRenderable)`
  mixed decls — all reverted to smali/v382-faithful forms (`a`, `MatrixUtils`,
  `e`, `BaseRenderable`). VObject3d iter-1 spelling fix stands (now
  semantically correct too).
- `<Type>.printStackTrace()` family: 51 sites tree-wide, each catch-var
  verified (`e`/`e2`/`e3`/`e6`→`e`); 2 legitimate `bVar` sites left alone.
- Label family (my own iter-20 deviation): DEX full signatures prove all
  `a(Z)`/`a(I,I,Z)`/`b(I)` return `b/f/i` — reverted 9 sites + 1 latent
  local to `IRenderable`. Lesson logged: body-expression type ≠ declared
  return type; declared type comes from the interface/DEX contract.
- `a.d.d()`→`TouchDispatcher.d()` (smali+ledger), `a.e.l()`→`RendererImpl.l()`
  (ledger+v382+member, in H).
- Verified faithful, no action: EasingFunctions (smali `b` interface shape
  matches), FolderItemPositioner twin (ledger+smali N/O types), label
  callers (no BaseRenderable-typed receivers).
- Queued with precise briefs (not guessed): `a.TransitionConfig.l()`,
  `a.ItemTransitionManager.d()`, `a.AppClassifier`+`e.a(out_of_space)`
  (neither candidate has the members — needs smali/v382 reconstruction),
  field-`w`/`x` PageTouchHandler sites (`w.a/l`, `x.c`, `j.a` vs
  `PageAnimationState.a`, `WidgetPanelController.a.j` vs PageShaderNode).
- Output: `docs/build-output-iter37.txt`. Regressions: none. Confidence:
  HIGH (all applied fixes triple-verified; queued items explicitly deferred).

## Iteration 38 — theme-2, qualifier sites, drawer chain [S]

- Three investigators (smali descriptors + ledger + twins, all verified).
- `ThemeDIYActivity` (8 + 1 latent): `aq`→`AbstractThemeProvider`
  (smali field/method descriptors; lethal `String aq` field collision
  avoided by type-position-only edits). CLEAN.
- `ThemeNotificationBuilder` (5 + 2 latent): self-type `g` (ledger: file
  WAS `g.java`; smali returns + `return this` bodies). CLEAN.
- Qualifier sites: `DrawerPanelController.e`→`DrawerSettingsPanel`
  (ledger + boolean-ctor), chain resolves to
  `GlobalServiceLocator.g.a.j()/.k()` (static/instance chain verified
  end-to-end); `FolderPage` ShellDataParser→`ShellDataProvider.a()` +
  dead-import delete + `C0133a`→`ToastOverlayController.C0133a`
  (Notifier call-shape chain). CLEAN (all three files).
- Output: `docs/build-output-iter38.txt`. Regressions: none. Confidence:
  HIGH throughout.

## Iteration 40 — ThemeDataProvider round + TCLM type-arg correction [S]

- One investigator (smali descriptors + ledger + DEX, all verified).
- Applied: self-type `v`, `p/k/d/n/B/b.a/C/ai/ah/ag/ap/aj/ak/ac/s/a-
  InterfaceC0050a/f/ae` mappings (all same-package, no imports; FQN only
  for the referrals-handler interface).
- `aq` DEFERRED-then-resolved: brief's counter-evidence collapsed on
  recheck — `t()` is inherited from `ThemeModel` (which `AbstractTheme-
  Provider` extends), and both call shapes (`diy/e.a` return, `t()` feed
  into `a(String,List<String>,…)`) match exactly. `aq`→`AbstractTheme-
  Provider`. Lesson: check supertypes before declaring a method absent.
- Structural find: smali `c` Signature proves `ThemeCategoryListModel`
  extends `PagedListModel<c$a>` — tree's `<ThemeCategoryModel>` contradicted
  it with zero in-tree dependents, so the type arg was corrected to `<A>`;
  `k()` rebuilt to construct `TCLM.A` per smali body (keys/fields 1:1).
  Prior `ProgressCallback`-shaped body archived as corrupt in the log.
- Output: `docs/build-output-iter40.txt`. File CLEAN (was 30 lines).
  Regressions: none. Confidence: HIGH throughout.

## Iteration 42 — C-generics settled via smali Signature [S]

- Question: with C=TCLM, `cVar.a().add(TCLM.A)` fails against
  `List<ThemeCategoryModel>` — so which link is wrong?
- Smali Signature attribute: `c extends a<c$a>` — the TRUE C holds
  `List<c$a>`. Tree TCLM.A ≡ `c$a` (String a/b/c + Object d, exact);
  zero in-tree dependents on `<ThemeCategoryModel>`; only use is a
  subclass decl. Type arg corrected to `<A>` (self-inner reference
  requires FQN in extends clause — caught on rebuild, fixed).
- `k()` rebuilt per smali body (keys/fields/branches 1:1); incidentally
  proved tree's `ProgressCallback`-shaped body irreconcilable (interface
  can't be instantiated) — archived as corrupt in the log.
- `ProgressCallback` itself: REAL type with legitimate users (interface
  impls, params, ServiceBinderA) — kept. Only the TPM.b()-flow lists
  (which smali proves carry `c$a`) retargeted, plus the `HttpDownloader`
  static-call mapping (`base/c` ≡ HttpDownloader, method-for-method).
  WallpaperOnLineActivity's 2-arg line queued (no fitting overload —
  needs its own twin work, not guessing).
- DIYThemeDetail `k/o/aq` resolved by usage shapes in passing.
- Output: `docs/build-output-iter42.txt`. Regressions: none. Confidence:
  HIGH throughout.

## Iteration 41 — theme install/share/list/category round [S]

- Two investigators (smali descriptors + ledger + twins, all verified).
- `ThemeInstallManager` (8 + 15 qualifiers + `aa` widening): self-type,
  `l`→`ThemeStubHandler`, `B/b` + `A/a` case artifacts, `aa`→`Object`
  (empty-class evidence documented; behavior-preserving by erasure).
  Missed 3 sites on first pass (caught on rebuild, fixed, verified).
  CLEAN.
- Share/list/share-adapter/pager/page: `aq`→`AbstractThemeProvider`,
  inner-`a`, `t`→`ThemeBaseAdapter`, `p`→`ThemePagedModel`,
  `B`→`DiyWallpaperProvider` (sibling `instanceof` proof),
  `an`→`ThemeShareItem`, `n`→`ThemeProgressModel`, `t`-return.
  CLEAN (all five).
- Scope discipline held: ProgressCallback→TCLM.A coherent restoration
  (8 sites, 3 files) deferred to its own iteration — needs the C-generics
  question settled first, not rushed inside this batch.
- Output: `docs/build-output-iter41.txt`. Regressions: none. Confidence:
  HIGH throughout.

## Iteration 39 — parallel round #9: provider, renderables, spring twins [S]

- Three investigators (smali descriptors + ledger + twins, all verified).
- `ThemeDataProvider` deferred to its own round (14 logged + ~25 latent —
  too big to fold in; precise brief in hand).
- Renderable trio: `compare(i,i)`→`IRenderable` (interface-arg proof),
  `m/k`→`Label/GridRenderable` (smali fields + ctor shape), `b`→
  `AltSpriteItemData` (smali returns + element-type proof), 5× `l.this`
  + 44× `a.this` qualifier repairs (line/occurrence counts distinguished
  explicitly after a miscount). CLEAN (all three).
- Spring twins: stale `c/a/a/{a,b}` DELETED (zero outside refs; all live
  code on `spring.*`), bare-`b` retargeted to `DampedSpringConstraint`
  (diff-proven identical; `b()/c()/d()` present). CLEAN.
- `PageThumbnailRenderer`: `f.a.a.a`→`GlTextureBinding` (smali+ledger);
  husk given `a,b,c,d` int fields (smali shapes + consumer uses).
  Follow-ons queued (manager.A recovery, `a` self-refs). CLEAN.
- Output: `docs/build-output-iter39.txt`. Regressions: none. Confidence:
  HIGH throughout.

## Iteration 35 — diy trio, TouchHandlerC latents, TweenUtils [S]

- Three investigators (smali descriptors + ledger + twins, all verified).
- `diy/c,f,e` (11 sites): `aq`→`AbstractThemeProvider` (smali generic
  signatures + in-file self-confirmation), `k`→`ThemeModel`. Caution heeded:
  parent-`f` mapping NOT carried into `diy/` (volley request class).
  CLEAN (all three).
- `DesktopTouchHandlerC` follow-ups: `e`→`DesktopTouchHandlerE`,
  `ArrayList<i>`+locals→`IRenderable`, `c.this`×44, `x.`→`GraphicsEngineBridge`
  (anchored to `x.a(`/`x.b(` — int-var `x` uses untouched), R-class FQN
  (fields-in-scope force FQN form). File error-free; `c.b`/`c.a` twin-choice
  (f/e/d/a vs _d) still queued — lines 269/277 produce no errors this round
  (cap displacement), explicitly NOT taken as resolution.
- `TweenUtils` (2): `d`→`TweenParams` (ledger + smali + call sites). KEEP
  verdict (1,200+ callers); bodies/overloads queued as separate work.
  CLEAN.
- Output: `docs/build-output-iter35.txt`. Regressions: none. Confidence:
  HIGH throughout.

## Iteration 36 — twin-choice flag resolved [S]

- `DesktopTouchHandlerC:269/277` `c.b`/`c.a` → `_d` `DropIndicatorState`
  inners (not smali-faithful `f/e/d/a`): R is already `_d`-typed from the
  prior verified fix, so only the `_d` inner satisfies the assignment;
  `_d.b` fields a–g match every assignment shape. Import present.
  Judgment recorded with its rejected alternative. File CLEAN.
- Output: `docs/build-output-iter36.txt`. Regressions: none. Confidence:
  HIGH.

## Iteration 33 — ThemeBaseAdapter trio [S]

- One investigator (smali field/method descriptors per site + ledger +
  twin). `k`→`ThemeModel` (16 sites incl. 7 latent locals the cap hid),
  `B`→own inner `b`, `A`→own `enum a`, plus latent `t.this.n`→
  `ThemeBaseAdapter.this.n`. First pass missed four 8-space field decls
  (caught on rebuild, fixed, verified). CLEAN.
- Output: `docs/build-output-iter33.txt`. Regressions: none. Confidence:
  HIGH.

## Iteration 32 — scattered five: drop-target, workspace, typeface, pager [S]

- `DropTarget.a(i,g)`: implementer `WorkspaceShortcutItem` spells
  `(IRenderable, WidgetDrawerItemVisual)`; file already imported both.
  CLEAN.
- `Workspace3D.n`: `PageTouchHandler.n()`→`WorkspacePage` +
  `WorkspacePage.s()`→`CellLayout` closes the `i.n().s()` chain; import
  present. CLEAN.
- `TypefaceManager.a`: singleton self-type (`synchronized (a.class)` +
  `new a()` + `return a`). CLEAN.
- `PagedListModel.b`→`FilterPredicate` (same package; `boolean a(Model)`
  matches `d()`); `ThemePager.a.InterfaceC0048a`→`BaseDataProvider.
  InterfaceC0048a` (override comments name the true owner; import present).
- `theme/c/e` visibility: file/class mismatch found — `SearchQueryHolder.
  java` contained only `class e`. Renamed class to file (`SearchQueryHolder`,
  public) and updated 4 same-package/FQN type-position refs (field-name `e`
  occurrences untouched); `.a()` call shapes confirm identity. All CLEAN.
- Output: `docs/build-output-iter32.txt`. Regressions: none. Confidence:
  HIGH throughout.

## Iteration 31 — `ConfigConstants` self-type [S]

- `A` (field type, 3 returns, `new A()`) ≡ own class `ConfigConstants`
  (renamed from `a.java`; all methods `return this`). Field `int A` and
  `this.A` uses correctly left alone. CLEAN.
- Output: `docs/build-output-iter31.txt`. Regressions: none. Confidence:
  HIGH.

## Iteration 30 — parallel round #8: singleton, gesture, touch [S]

- `C3DEngine.java` (6): `preference.a.a.b`→`PreferenceItemB` (smali field
  writes + ledger 99), `e`→`RendererImpl`, `f`→`TextureFactory`,
  `c`→`TaskDispatcher` (smali field types + ledger + full caller-shape
  coverage incl. direct `ShellModel`/`ShellBindContext` type proofs).
  Clarifies the earlier census puzzle: singleton is named `a` in DEX/smali,
  `C3DEngine` only in Prime tree. CLEAN.
- `GestureMenuRenderer` (2): `k`→`CircleDotNode`, `j`→`BaseRenderable`
  (smali field/ctor descriptors + ledger + twin). CLEAN.
- `WidgetTouchHandler` (2): `b`→`WorkspaceShortcutItem` (line-parallel twin
  + ledger + member-access census). CLEAN.
- Output: `docs/build-output-iter30.txt`. New leader: `ConfigConstants`
  (10). Regressions: none. Confidence: HIGH (HIGH×3).

## Iteration 29 — parallel round #7: shortcut-info, dash-listener, h/a [S]

- Three read-only investigators, all verified before apply (incl. correcting
  agent shorthand against log carets twice).
- `LauncherShortcutStandardInfo` (8 + 6 latent): `manager.o.A`→`ButtonMetrics`
  (ledger 99 + DEX + consumer shapes; naive-import trap explicitly rejected),
  `utils.q`→`BitmapTransformationHelper`, plus latent `b`/`x`/`f.i.b.e.b`
  fixes (smali-direct each, incl. rejecting a score-64 cross-package ledger
  row in favor of score-91 + smali). CLEAN.
- `DashLayoutListener` (3 + 6 latent qualifiers): `h`→`GestureMenuRenderer`
  (DEX superclass + ledger + sibling precedent), `d`→`DashLayoutContainer`,
  `c.this`×6→`DashLayoutListener.this`. CLEAN. (L67 R-class + super-call
  caveats held as deferred.)
- `h/a` (3): V1-only file (absent from DEX/smali/v382) with a live caller —
  fix, don't delete. `r`→`IRenderable` (GraphicsEngineBridge twin shape),
  `ThemeDockDescription`→`512` literal with provenance comment (restore
  would drag missing chains). Self-inflicted `//`-comment-eats-array bug
  caught on rebuild, repaired with block comment. CLEAN.
- Output: `docs/build-output-iter29.txt`. New leader: `C3DEngine.java`
  (12, the engine singleton itself). Regressions: none. Confidence: HIGH
  (HIGH×3).
