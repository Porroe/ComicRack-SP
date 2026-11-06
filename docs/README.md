# ComicRack SP developer handoff

## Build and install

Open the Android project root in Android Studio. Use JDK 17, the included Gradle 9.6.0 wrapper, Android Gradle Plugin 9.4.1, Android SDK Platform 37, and Build Tools 37.0.0. The app ID is `com.cyo.comicracksp`. The minimum SDK is 26 and the compile and target SDK are both 37. The Java source build uses Junrar 8.1.2 for CBR extraction and `desugar_jdk_libs_nio` 2.1.5.

```sh
./gradlew :app:assembleSourceDebug
adb install -r app/build/outputs/apk/source/debug/app-source-debug.apk
```

## Source recovery

- `app/src/main/java` is based on JADX 1.5.2 output produced with `--deobf --no-inline-methods --no-inline-anonymous`. Compare the original names in `renamed from` comments with Smali when a method looks incomplete or its control flow looks suspicious.
- The manifest and resources came from Apktool. Keep surviving IDs in [stable-resource-ids.txt](../app/stable-resource-ids.txt) aligned with the resources because recovered classes still use numeric constants. The original APK, decoded Smali, and rebuilt APKs are local reference artifacts. The Gradle build uses checked-in source and resources.
- Recovery work covered reader lifecycle and layout, page scaling and animation, archive detection and extraction, metadata, bitmap caching, and library grouping. CFR and Vineflower output from a dex2jar conversion helped cross-check the Java. The legacy Wi-Fi socket dispatcher was translated from Smali.
- Give classes, methods, parameters, and variables descriptive names as their roles become clear. For an eventual Kotlin migration, use Java and Kotlin side by side in the app module and compare each migrated component against the working Java build and original Smali.

## Storage and library

- [ComicDocuments.java](../app/src/main/java/com/cyo/comicrack/storage/ComicDocuments.java) handles Storage Access Framework document trees and individual comics. Folder selection persists read grants and stores tree URIs in preferences. The scanner queries child documents and opens archives via content URIs. Reselect a folder if its grant is revoked. Keep network-backed or slow document providers in mind when touching this path.
- [ArchiveCache.java](../app/src/main/java/com/cyo/comicrack/storage/ArchiveCache.java) stages document archives in app-private cache for readers that need seekable files. It enforces a 1 GiB size limit and seven-day idle expiration. The cover thumbnail cache is separate and reuses thumbnails across launches. Reading progress and metadata continue to use the existing SQLite database.
- [ComicRackApplication.java](../app/src/main/java/com/cyo/comicrack/viewer/ComicRackApplication.java) builds the startup library from SQLite records for folders with valid read grants, then schedules a background scan. Explicit refresh uses the same scan path with progress feedback. Keep the saved library usable when a provider is slow. Room and migration from the original app are deferred.
- [ComicRackPreferencesActivity.java](../app/src/main/java/com/cyo/comicrack/viewer/ComicRackPreferencesActivity.java) connects the existing settings screens to the Android folder picker. [SplashActivity.java](../app/src/main/java/com/cyo/comicrack/viewer/SplashActivity.java) starts library initialization directly, and the first launch skips automatic About. The menu still opens About.
- [SystemBarInsets.java](../app/src/main/java/com/cyo/comicrack/viewer/SystemBarInsets.java) applies modern system bar insets to legacy layouts. A broader UI and Settings redesign is still pending. Twitter integration was removed, including its settings, entry points, resources, and bundled Twitter4J code. Legacy Wi-Fi sync still assumes a writable filesystem path and is outside the document-tree flow.

## Device checks

Use a clean test install for first-launch checks and a populated library for scan and cache checks. Keep the user's existing library data intact when testing.

1. Confirm startup reaches the folder prompt without showing About or Terms. Select a folder and reopen the app to check that the grant persists.
2. Open a CBZ and a CBR from the library and from **Open comic file**. Turn a page, drag to preview the next page, then reopen a comic and check its saved position.
3. Cycle Cover, Detail, and Stack in a populated library. Open ComicRack Settings and Display Settings. Check that covers are reused after a restart and that refresh picks up changes in the folder.
4. Exercise folder reselection after losing access and use a sizable library when checking scan performance.

The original recovery pass exercised stored, compressed, and solid RAR4 fixtures and CBZ reading on Android 14. Later Android 16 tablet checks covered the scoped-storage library, cover reuse across restart, Stack view switching, and first launch without About or Terms. Record the device, Android version, and archive types for new checks. RAR5, Wi-Fi sync, and a full compatibility matrix remain unverified.
