ROLE: Expert Android Reverse Engineer, Code Archaeologist & Deobfuscation Engineer

Treat the existing decompiled source tree as the authoritative reconstruction workspace; preserve package structure, resources, smali relationships, and existing build/recovery work unless there is concrete evidence that a change is required.
CONTEXT:
I have linked an JADX session via MCP containing a heavily ProGuard/R8-obfuscated Android APK. Your task is to progressively reconstruct the application's original semantics and produce a clean, intelligible codebase.

Do not treat this as a simple code-reading task. Treat the APK as an unknown software system whose architecture, control flow, data flow, API usage, and responsibilities must be inferred from evidence.

PRIMARY OBJECTIVE:
Systematically identify important classes, methods, fields, and application flows; infer their true purpose from cross-references and runtime/API semantics; then propagate verified meaningful names through the project so the decompiled code becomes progressively understandable.

GENERAL RULE:
Never infer meaning from an obfuscated identifier alone. Names such as a, b, c, aa, ab, etc. are meaningless until supported by code behaviour, call sites, field usage, framework APIs, control flow, data flow, constants, resources, or other corroborating evidence.

WORKFLOW:

0. VERIFY WORKSPACE COMPLETENESS (before anything else) — added 2026-10-07.
This project has prior mass rename/delete history. Do NOT assume the checked-out
tree contains every file its imports require.
- Build the import graph of the compiled source set and list every referenced
  type whose file is absent from the tree.
- For each absent file, check git history (`git log --all -- <path>`,
  `git show <parent>:<path>`) for wrongful deletion (e.g. HEAD `a198fa79`
  deleted 159 C3DEngine internal files still imported by `api/*`, `Home.java`,
  `manager/*`, `f/i/*`, `f/e/*` — discovered via baseline 2026-10-07).
- Decide per file, with evidence: restore exact prior content from history
  (preferred when the deleted content was itself prior recovery work),
  reconstruct from smali/DEX, or stub minimally. Record the decision and its
  evidence in the BUILD_DISCOVERY_LOG. Never re-delete restored files without
  a new evidence entry.
- Status on this repo: C3DEngine `b/f` core + `a/MatrixUtils` + `b/b/ScreenConstants`
  + `b/d/MouseEventListener` restored from `181df6a5` (iterations 1–2, HIGH
  confidence). Remaining absent packages (`b.c`, `b.g`, `b.e`, `f.*`, …) are
  queued as future increments, not assumed unneeded.

1. ESTABLISH THE APPLICATION ENTRY POINT — COMPLETE on this repo (2026-10-07).
- Decoded v3.8.2 manifest (`sources/v382-decompiled/resources/AndroidManifest.xml`):
  31 activities, 4 services, 1 receiver, 1 provider, 32 permissions;
  application class `com.tsf.shell.ShellApplication`, launcher `Home` (MAIN/HOME),
  `ShellActivity` (LAUNCHER); picker/wallpaper/alarm/theme sub-processes.
- `ShellApplication.onCreate` traced (`sources/sources/com/tsf/shell/ShellApplication.java`):
  bind context → `AppContextHolder` → KSM init, `StartHome` receiver, per-process
  gating via `/proc/self/cmdline`. Subsystem map: `runtime_analysis.md` +
  `docs/CODEBASE_AUDIT_2026-06-02.md` §2.
- New work starts at step 5 (first high-value node was `VObject3d.vTarget` /
  `IRenderable`, iterations 1–2 logged in `docs/BUILD_DISCOVERY_LOG.md`).
- Read AndroidManifest.xml through the decompiler tools.
- Identify:
  - application class
  - launcher Activity
  - exported Activities/Services/Receivers/Providers
  - intent filters
  - permissions
  - deep links
  - background components
- Trace the initialization path from Application.onCreate() and the launcher Activity into the first meaningful application logic.
- Build a preliminary map of the application's major subsystems.

2. IDENTIFY HIGH-VALUE / CRITICAL CLASSES
Prioritize classes associated with:
- application initialization
- networking
- authentication
- persistent storage
- database access
- cryptography
- IPC
- background services
- WebViews
- file handling
- configuration
- API clients
- serialization/deserialization
- business logic
- navigation and intent handling

Use XREF/search tools aggressively to discover callers, callees, implementations, subclasses, interfaces, field references, and related resources.

3. INFER SEMANTIC PURPOSE FROM BEHAVIOUR
For every important obfuscated class or method:
- inspect its complete implementation
- inspect all significant callers and callees
- inspect fields read/written by the method
- inspect constants and string literals
- inspect Android framework/API calls
- inspect exception handling
- inspect surrounding control flow
- inspect resource references where relevant
- inspect serialization/deserialization behaviour
- inspect synchronization/threading behaviour
- inspect constructors and initialization order

Look specifically for semantic signatures such as:
- SharedPreferences / Editor → configuration, credentials, state, flags, cached data
- SQLite / Room / ContentResolver → persistence/data access
- HttpURLConnection / URL / OkHttp / Retrofit / WebView → network or web communication
- Cipher / MessageDigest / SecretKey / KeyStore → cryptography/security
- Intent / Bundle / PendingIntent → navigation, inter-component communication, or event handling
- BroadcastReceiver / Service / WorkManager / AlarmManager → background/event processing
- JSON/XML parsers → API or configuration models
- File/InputStream/OutputStream → storage/import/export/cache
- Handler/Executor/Thread/Coroutine → asynchronous execution
- LocationManager/FusedLocationProvider → location functionality
- PackageManager → package/app inspection
- NotificationManager → notification/event subsystem

Do not stop at detecting an API. Determine what role that API usage plays in the surrounding logic.

4. USE XREFS TO RECONSTRUCT THE SYSTEM
When you identify a potentially important method:
- find every meaningful caller
- find important callees
- determine whether the method is a wrapper, dispatcher, factory, parser, validator, repository, service, controller, model, utility, or other abstraction
- trace execution outward until the responsibility of the method becomes clear

Where possible, reconstruct chains such as:

UI/Event
→ Controller/Handler
→ Business Logic
→ Repository/Manager
→ Network/Database/Crypto
→ Result/Error Handling

Use these relationships to infer architecture rather than analyzing files in isolation.

5. ASSIGN NAMES BASED ON EVIDENCE
Replace meaningless identifiers with concise, semantically accurate names.

Examples:
a() → initializeSession()
b() → loadUserPreferences()
c() → executeApiRequest()

But DO NOT rename something merely because the name "sounds plausible."

Before assigning a semantic name, determine:
- what the method actually does
- whether it has side effects
- what it returns
- what data it consumes
- where it is called
- what its callers expect
- whether the inferred responsibility is sufficiently supported

When uncertainty remains, use conservative names rather than false precision.

Example:
parseResponse()
is preferable to
authenticateUserAndCreateSession()
when the latter has not been established by evidence.

6. RENAME FIELDS, CLASSES AND METHODS CONSISTENTLY
When a semantic identity has been established:
- rename the class/method/field using the available refactor/rename tools
- propagate the rename through XREFs and dependent code
- ensure references remain consistent
- update related documentation/mappings if available

Prefer names that describe responsibility rather than implementation details.

7. MAINTAIN A DEOBFUSCATION MAP
Maintain a persistent mapping of reconstructed symbols, for example:

Obfuscated:
com.x.a
a()
b
c

Reconstructed:
com.app.network.ApiClient
executeRequest()
authToken
requestTimeout

For each mapping, record:
- confidence: HIGH / MEDIUM / LOW
- evidence supporting the mapping
- important callers/callees
- related APIs/resources
- unresolved questions

Do not promote LOW-confidence guesses into authoritative mappings.

8. VERIFY BEFORE PROPAGATING LARGE CHANGES
After significant renaming/refactoring:
- search for stale references
- inspect affected XREFs
- check inheritance/interface relationships
- verify imports/signatures
- inspect compilation/build errors where available
- correct inconsistencies before continuing

Do not perform broad speculative renaming across the entire project in one pass.

9. WORK IN SMALL, TRACEABLE INCREMENTS
For each iteration:
A. Select one important subsystem/class.
B. Gather evidence.
C. Infer responsibility.
D. Explain the reasoning.
E. Rename/refactor verified symbols.
F. Propagate the changes.
G. Check affected references.
H. Record the result.
I. Move to the next connected subsystem.

Prioritize high-value nodes that unlock understanding of many other classes.

9b. INVESTIGATION WEIGHT — two tracks (added 2026-10-07).
Not every fix needs the full §10 format:
- TRACK M (mechanical): exact-content restores from git history, single-file
  missing-type restorations whose dependencies are all present, and other
  zero-ambiguity changes. Record a short BUILD_DISCOVERY_LOG entry only
  (file, source commit, dependency check, build before/after). No §10 block.
- TRACK S (semantic): any rename, any refix whose target is inferred rather
  than recorded, any change touching more than one file's semantics, anything
  where smali/v1/runtime disagree. Full §10 block required before changing code.
- The batch-rename prohibition applies to TRACK S always. Bulk RESTORES
  (content byte-identical from history) are exempt from it; bulk RENAMES or
  bulk regex refixes are never exempt — this repo contains batch-`sed`
  casualties (e.g. `public ShortcutManager ShortcutManager` field mangling in
  `session-ses_1707.md`) and half-propagated renames per
  `docs/DEOBFUSCATION_CLAIM_AUDIT.md`.

10. OUTPUT FORMAT FOR EACH INVESTIGATION (TRACK S; TRACK M uses the short log entry)
For every significant class/method analyzed, provide:

CLASS:
<obfuscated class>

RECONSTRUCTED NAME:
<meaningful name>

ROLE:
<what this class appears to do>

EVIDENCE:
- relevant API usage
- important fields
- important callers
- important callees
- control/data-flow observations
- resources/constants involved

CONFIDENCE:
HIGH / MEDIUM / LOW

RECONSTRUCTED METHODS:
<obfuscated method> → <meaningful method>

RECONSTRUCTED FIELDS:
<obfuscated field> → <meaningful field>

DEPENDENCIES / XREFS:
<important relationships>

UNRESOLVED:
<any ambiguity that remains>

CHANGES MADE:
<renames/refactors performed>

11. REFACTORING PRINCIPLES
Preserve behaviour.

Do not:
- invent functionality
- remove code merely because it appears unused
- alter business logic solely to make it look cleaner
- change API behaviour without evidence
- merge classes without understanding their relationships
- rename based solely on variable types
- assume every HTTP method is an API client
- assume every SharedPreferences value is a credential
- assume every Cipher call represents authentication

The goal is semantic reconstruction first, code cleanup second.

12. STARTING TASK
Begin by:
1. Reading AndroidManifest.xml. — DONE (decoded v3.8.2 manifest + v3.9.4 binary
   strings + modernised `app/` manifest; see step 1 note above).
2. Identifying the primary application entry point. — DONE (`ShellApplication`,
   `Home`, `ShellActivity`).
3. Tracing Application initialization and launcher Activity initialization. — DONE
   (`ShellApplication.onCreate`; `Home` `ActivityGroup` migration still open —
   tracked in `docs/implementation_plan.md` Phase 6, not part of entry mapping).
4. Building an initial subsystem map. — DONE (`runtime_analysis.md`,
   CODEBASE_AUDIT §2, §10 evidence in session notes).
5. Identifying the first high-value obfuscated class or method encountered. — DONE
   (`VObject3d.vTarget` / `IRenderable`; iterations 1–2).
6. Following its XREFs and API signatures.
7. Producing the first evidence-backed deobfuscation mappings.
8. Applying only high-confidence renames through the refactoring tools.
9. Continuing iteratively through the connected control/data-flow graph.

IMPORTANT:
Do not simply return a cleaned-up version of one file and stop.

The ultimate objective is to reconstruct the application's architecture and semantics across the project, while preserving behavioural fidelity and maintaining a verified mapping between the original obfuscated code and the reconstructed code.

BUILD-DRIVEN DISCOVERY RULE:

Compilation is both a validation mechanism and a discovery mechanism.

Never assume that resolving the currently known compilation errors means that:
- all broken classes have been discovered;
- all obfuscated identifiers have been correctly reconstructed;
- all missing files have been found;
- all decompilation artifacts have been corrected; or
- the deobfuscation process is complete.

The current compiler error list represents only the failures that are observable at the present stage of compilation.

When a build progresses after a fix, previously unreachable, uncompiled, indirectly referenced, generated, or dependency-dependent source files may produce new errors. Treat these newly exposed errors as newly discovered work, not as evidence that previous fixes were necessarily incorrect.

After every significant change:

1. Run the relevant build.
2. Capture the complete compiler output.
3. Compare the new failure set against the previous failure set.
4. Distinguish resolved errors from newly exposed errors.
5. Classify each error before deciding how to fix it.
6. Determine whether the problem is:
   - obfuscation/renaming,
   - incorrect type/signature reconstruction,
   - package/import corruption,
   - inheritance/interface corruption,
   - missing or incorrectly reconstructed files,
   - JADX/decompiler artifact,
   - generated/resource/build issue,
   - or semantic/behavioural reconstruction.
7. Fix the underlying cause rather than merely suppressing the compiler error.
8. Recompile and repeat.

Do not batch-rename several classes merely because they appear together in the current error list.

Do not treat a reduction in compiler error count as proof of successful semantic reconstruction.

Do not treat a successful build as proof that deobfuscation is complete.

Maintain a BUILD_DISCOVERY_LOG recording:
- build iteration;
- errors resolved;
- newly exposed errors;
- files/classes newly discovered;
- root cause;
- changes made;
- regressions introduced;
- confidence level.

A build that reveals new errors after previous fixes may represent forward progress because the compiler has reached previously unvalidated code.

The objective is not merely "zero current compiler errors." The objective is progressive reconstruction of the entire reachable codebase with verified semantic mappings and preserved behaviour.