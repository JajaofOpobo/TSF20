# TSF Shell Database Schema

## Legacy Database

- **File**: `TSFLauncher-database.db`
- **Version**: 34
- **Authority**: `com.tsf.shell.provider` (derived at runtime from package name)
- **Location**: Default app database directory

---

## Table: `favorites`
Workspace items (apps, folders, widgets, shortcuts).

| Column | Type | Notes |
|--------|------|-------|
| `_id` | INTEGER | PRIMARY KEY |
| `title` | TEXT | Display name |
| `intent` | TEXT | URI intent for launching |
| `container` | INTEGER | Parent container ID |
| `screen` | INTEGER | Desktop screen index |
| `cellX` | TEXT | X position |
| `cellY` | TEXT | Y position |
| `rotation` | TEXT | Rotation value |
| `spanX` | TEXT | Width span |
| `spanY` | TEXT | Height span |
| `scale` | TEXT | Scale value |
| `itemType` | INTEGER | 0=app, 1=folder, 2=shortcut, 3=appwidget, 4=livefolder |
| `appWidgetId` | INTEGER | NOT NULL DEFAULT -1 |
| `iconType` | INTEGER | Icon source type |
| `iconPackage` | TEXT | Package for icon resource |
| `iconResource` | TEXT | Resource name for icon |
| `icon` | BLOB | Embedded icon bitmap |
| `titleType` | INTEGER | Title display type |
| `config` | TEXT | Configuration data |
| `packagename` | TEXT | App package name |
| `classname` | TEXT | App class name |
| `internal` | INTEGER | Internal flag |
| `appWidgetProvider` | TEXT | Widget provider component |

## Table: `application`
App drawer entries.

| Column | Type | Notes |
|--------|------|-------|
| `_id` | INTEGER | PRIMARY KEY |
| `mindex` | INTEGER | Display order |
| `title` | TEXT | Display name |
| `clickcnt` | INTEGER | Launch count |
| `ishide` | INTEGER | Hidden from drawer flag |
| `intent` | TEXT | Launch intent |
| `container` | INTEGER | Parent container |
| `itemType` | INTEGER | Item type |
| `iconType` | INTEGER | Icon source type |
| `iconPackage` | TEXT | Icon package |
| `iconResource` | TEXT | Icon resource |
| `icon` | BLOB | Embedded icon |
| `titleType` | INTEGER | Title type |
| `config` | TEXT | Configuration |
| `vercode` | INTEGER | Version code |
| `vername` | TEXT | Version name |

## Table: `dock`
Bottom dock bar (JSON blob store).

| Column | Type | Notes |
|--------|------|-------|
| `_id` | INTEGER | PRIMARY KEY |
| `child` | TEXT | Serialized JSON of dock items |

Seeded with: `insert into dock(child) values('?')`

## Table: `slidingdock`
Sliding dock panel (JSON blob store).

| Column | Type | Notes |
|--------|------|-------|
| `_id` | INTEGER | PRIMARY KEY |
| `child` | TEXT | Serialized JSON of sliding dock items |

Seeded with: `insert into slidingdock(child) values('?')`

## Table: `menu`
Menu panel (JSON blob store).

| Column | Type | Notes |
|--------|------|-------|
| `_id` | INTEGER | PRIMARY KEY |
| `child` | TEXT | Serialized JSON of menu items |

Seeded with: `insert into menu(child) values('?')`

## Table: `quicklaunch`
Quick launch strip (JSON blob store).

| Column | Type | Notes |
|--------|------|-------|
| `_id` | INTEGER | PRIMARY KEY |
| `child` | TEXT | Serialized JSON of quick launch items |

Seeded with: `insert into quicklaunch(child) values('?')`

---

## Room Entity Mapping

| Room Entity | Legacy Table | Status |
|-------------|-------------|--------|
| `FavoriteItem` | `favorites` | ✅ Full column mapping |
| `ApplicationItem` | `application` | ✅ Full column mapping (+ extra: packagename, classname) |
| `DockItem` | `dock` | ⚠️ Expanded schema (normalized, not JSON blob) |
| `MenuItem` | `menu` | ⚠️ Expanded schema (normalized, not JSON blob) |
| `SlidingDockItem` | `slidingdock` | ❌ Missing — needs creation |
| `QuickLaunchItem` | `quicklaunch` | ❌ Missing — needs creation |

## Dropped Legacy Tables
- `optionmenu` (dropped in version < 30)
- `theme` (dropped in version < 30)
- `folders` (dropped in version < 30)
- `configuration` (dropped in version < 33, contained `screenorder`)
