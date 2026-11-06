# ComicRack SP for Android

**SP means “Slop.”** ComicRack SP is an AI-assisted effort to decompile and update ComicRack 1.80 for Android. AI helped reconstruct Java from the original bytecode and repair parts of the app so it could build and run again.

## What changed

- Updated for modern Android. ComicRack SP targets Android API 37 and requires Android 8.0 or later.
- Use Android’s file picker to select your main comics folder, add a second folder in Settings, or open an individual comic. The library only needs read access to scan and open your comics.
- The library opens in Material 3 by default, with a toolbar search icon, a **Continue Reading** card that shows the cover and saved page, and a **Cover / Detail / Stack** selector. Choose **Settings → Library interface → Classic** for the original library layout. Both layouts share your library and reading progress.
- Settings groups library folders, reading and display, controls, and live wallpaper in one place.
- The library shows saved entries while it checks for file changes in the background. Covers are cached for reuse across launches.
- Restored CBZ and CBR reading, page transitions, and the next-page preview while dragging. Fixed crashes in ComicRack Settings and Display Settings, and a freeze when switching to Stack view.
- Fresh installs skip the About and Terms dialogs. About is available from the menu. Twitter integration has been removed.

## Getting started

Choose **Select folder** when prompted and pick the folder that contains your comics. ComicRack scans its subfolders too. Use **Refresh library** after adding or removing files if you want to update the list immediately. To read a comic outside your library, use **Open comic file**.

Tap the magnifying glass in the Material toolbar to search. **Clear search** takes you back to **All comics**. Tap the back arrow to collapse the field.

Wi-Fi sync is outside the current storage update. The setup flow treats ComicRack SP as a fresh install.

[Developer handoff](docs/README.md)
