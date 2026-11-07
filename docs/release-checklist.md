# First ComicRack SP release checklist

Reviewed November 7, 2026. This is a readiness assessment, not a claim that every item below is a known defect. The current device build is a debug build; a working debug installation does not establish release readiness.

## Current release-build result

`./gradlew :app:assembleSourceRelease :app:assembleSourceDebug` passes as of November 7, 2026, with release lint enabled. The 13 non-static manifest components are now static nested classes; widget and notification PendingIntents explicitly select mutability. Fixed actions are immutable, while the explicit stack-widget template is mutable on API 31+ so collection items can supply fill-in extras. No lint suppressions or baselines were added. An external Android 16 instrumentation check instantiated all 13 repaired components through their public no-argument constructors, exercised widget click PendingIntent creation, and verified version 2.0 (104). This does not replace end-to-end widget, wallpaper, or Wi-Fi feature testing.

The app is version **2.0**, version code **104**. The release task produces `app/build/outputs/apk/source/release/app-source-release-unsigned.apk`; dedicated release signing and signed-artifact device verification remain pending.

## Before the first public release

- [x] **Fix the 15 release lint errors:** registered nested components can be instantiated without an outer object, and widget/notification PendingIntents have explicit mutability. Both builds pass with the normal release checks enabled.
- [x] **Version identity:** set `versionName '2.0'` and increment `versionCode` from 103 to 104. Keep `com.cyo.comicracksp` stable and increment the code for subsequent releases.
- [ ] **Release signing:** create and securely back up a dedicated release keystore, keep credentials outside Git, and document how release signing is supplied. The app module still has no release signing configuration.
- [ ] **Release artifact verification:** build `:app:assembleSourceRelease`, sign the artifact with the release key, verify its signature, and test the signed artifact on a clean test device/profile. Exercise folder selection, relaunch, CBZ/CBR reading, saved position, Settings, and both library interfaces. Test offline startup and review remaining legacy market/license code paths. Do not uninstall the user's working app to perform this check.
- [ ] **Archive and failure coverage:** finish the archive compatibility matrix, including the intended RAR5 policy. Previously exercised RAR4 stored/compressed/solid fixtures and CBZs do not establish compatibility with every archive. Check corrupt/password-protected files, missing covers, and actionable errors without crashes or stuck scans.
- [ ] **Storage and progress resilience:** verify revoked folder grants, moved/deleted comics, reselecting a folder, secondary folders, process death during reading/scan, and temporarily unavailable document providers. Check that reading progress survives normal restarts and recoverable provider failures. No migration from the original app is required for this first release.
- [ ] **Device, layout, and accessibility pass:** cover a small phone and a tablet, portrait/landscape, supported oldest Android (API 26), and the target platform. Check keyboard/insets, large text, TalkBack labels and focus, dialogs, Classic pinning, collection-sheet scrolling, swipe gestures, and settings. Android 14/16 checks so far are not a complete matrix.
- [ ] **Large-library measurements:** record cold/warm startup, refresh duration, cover reuse, memory, and cache growth on a substantially larger library than the current 86-comic tablet collection. Include a slower document provider before making broad performance claims.
- [ ] **Public packaging:** publish known limitations and concise release notes, verify bundled dependency/icon notices and user-visible legacy links, and provide an issue-report template requesting Android version, archive type, reproduction steps, and relevant logs. Do not claim Wi-Fi sync is supported by the modern folder flow.

## Recommended engineering follow-up

- [ ] Add a reproducible CI build and retain meaningful regression checks for archive handling, provider failures, page-selection headers, and dialog lifecycle. Current device harnesses live outside the repository.
- [ ] Review exported components and remaining network/usage-statistics settings for the intended public behavior. Disabling a consent prompt does not by itself constitute a telemetry audit.
- [ ] Make the release build/signing steps reproducible without relying on one developer's temporary SDK/JDK installation.

## Deferred beyond the first release

Kotlin conversion, Room adoption, a redesigned comic reader, Wi-Fi sync modernization, and a wider tablet series-detail pane can remain separate follow-up projects. They are not prerequisites for an explicitly scoped first local-library release. Modernizing every surviving secondary dialog can also follow later, provided the release checks find no blocking usability or stability problems.
