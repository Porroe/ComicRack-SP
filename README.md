# ComicRack SP for Android

This Android Studio project contains Java and resources recovered from ComicRack 1.80. Open this directory in Android Studio and select JDK 17 as the Gradle JDK. The project uses the included Gradle 8.7 wrapper, Android SDK Platform 21, and Build Tools 34.0.0. API 21 matches the original compile platform and provides legacy APIs referenced by the recovered source.

- `app/src/main/java` contains the Java recovered by JADX 1.5.2 with `--deobf --no-inline-methods --no-inline-anonymous`. These options preserve synthetic accessors and alias obfuscated names that collide. The `renamed from` comments identify original names for comparison with Smali.
- `app/src/main/AndroidManifest.xml` and `app/src/main/res` come from Apktool. Gradle supplies the package and version metadata and generates the resource class. ComicRack SP uses the application ID `com.cyo.comicracksp`, minimum SDK 8, and target SDK 21. It preserves all 1,045 declared resource IDs.
- The original APK, its decoded Smali, and rebuilt APKs are local reference artifacts. The Java build can run without them.

## Build variants

- Select `bytecodeDebug` in Android Studio or run `./gradlew :app:assembleBytecodeDebug`. This variant requires a local copy of the input APK at `../ComicRack.1.80.Cracked.apk`. Gradle packages its original `classes.dex` with the project manifest and resources and signs the result with the Android debug key. The output is `app/build/outputs/apk/bytecode/debug/app-bytecode-debug.apk`. The packaged DEX and all 1,045 resource IDs were verified against the original. Changes to the manifest and resources go into this build.
- Select `sourceDebug` to work on the recovered Java, or run `./gradlew :app:assembleSourceDebug` to build it. The output is `app/build/outputs/apk/source/debug/app-source-debug.apk`. This variant uses the published Twitter4J 4.0.2 library and Junrar 8.1.2 for CBR extraction. The decompiled Twitter4J and original RAR decoder files are available for reference. The original RAR decoder’s unrecovered methods are outside the Java reader’s CBR path.

## Recovered methods

The three missing methods in `ReaderActivity` and three in `WifiSyncService` have been reconstructed. Other restored methods cover comic metadata files, archive signature detection, bitmap caching, library grouping, view animation, page scaling, and page background color sampling. CFR and Vineflower output from a dex2jar conversion helped with comparison. Both failed to reconstruct the main Wi-Fi socket handler, so its command dispatch and cleanup were translated from the original Smali.

## Device testing

On a Pixel 5 running Android 14, the bytecode variant rendered synthetic CBZ and CBR files. The Java variant initially failed in fragment lifecycle handling and pager layout. After restoring those paths and reader viewport traversal, it scanned the test CBZ into the library, opened it from its cover, turned to page two, and reopened on page two after an app restart.

The Java variant also opened stored, compressed, and solid RAR4 CBR fixtures and rendered page two after a swipe in each. The host-side decoder check extracted pages three, one, and two from fresh archive instances and matched the original JPEG bytes. Older Android versions, RAR5, zoom, and Wi-Fi sync were outside this device pass. D8 reports desugaring warnings with the API 21 compile SDK.

For a Kotlin migration, use the Java for navigation and the Smali to resolve missing or ambiguous behavior. Keep Java and Kotlin in the same app module as components are recovered so each migrated component can be checked against the baseline.
