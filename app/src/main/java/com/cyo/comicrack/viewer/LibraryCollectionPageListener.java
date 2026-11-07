package com.cyo.comicrack.viewer;

import com.cyo.comicrack.p019a.C0575ak;

final class LibraryCollectionPageListener implements InterfaceC0754dx {
    private final LibraryActivity activity;

    LibraryCollectionPageListener(LibraryActivity activity) {
        this.activity = activity;
    }

    @Override
    public void mo1811a(int position) {
        InterfaceC0753dw comicPager = LibraryActivity.m1470a(activity);
        if (comicPager == null) {
            return;
        }
        C0575ak collection = comicPager.mo1798a(position);
        if (collection == null) {
            return;
        }
        LibraryInterface.setCollectionTitle(activity, collection);
        C0776es sidebar = (C0776es) LibraryActivity.m1472b(activity).mo1803b();
        if (sidebar != null) {
            sidebar.m1840e(collection);
            sidebar.m1830W();
        }
    }
}
