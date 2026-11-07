package com.cyo.comicrack.viewer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.service.wallpaper.WallpaperService;
import com.cyo.comicrack.p019a.C0628f;
import com.cyo.common.AbstractC1010bu;
import com.cyo.common.p022a.p023a.C0927n;
import com.cyo.common.view.C1136bc;
import java.util.Random;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class CoverWallpaperService extends C0927n {

    /* renamed from: a */
    private static final Random f1989a = new Random();

    /* renamed from: a */
    static /* synthetic */ Random m1466a() {
        return f1989a;
    }

    /* compiled from: DontLook */
    public static class ConfigurationActivity extends PreferenceActivity {
        @Override // android.preference.PreferenceActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(C0809fy.preferences_wallpaper);
            PreferenceScreen preferenceScreen = getPreferenceScreen();
            if (C0628f.f1889k) {
                C1136bc.m2411a(preferenceScreen, null, "wallpaper_comic_keywords");
            }
        }

        @Override // android.app.Activity
        protected void onPause() {
            super.onPause();
            CoverWallpaperService.m1467a(this, ComicRackApplication.f1954i.m1441e());
        }
    }

    @Override // com.cyo.common.p022a.p023a.C0927n, android.service.wallpaper.WallpaperService
    public WallpaperService.Engine onCreateEngine() {
        C0751du c0751du = new C0751du(this, (byte) 0);
        C0751du c0751du2 = c0751du;
        c0751du2.mo1796a(new SharedPreferencesOnSharedPreferenceChangeListenerC0744dn(this, c0751du2));
        return c0751du;
    }

    /* renamed from: a */
    public static void m1468a(SharedPreferences sharedPreferences, Intent intent) {
        new C0740dj(AbstractC1010bu.m2098a(intent)).m1761a(AbstractC1010bu.m2099a(sharedPreferences));
    }

    /* renamed from: a */
    public static void m1467a(Context context, SharedPreferences sharedPreferences) {
        Intent intent = new Intent("ComicRackWallPaperPropertiesChanges");
        new C0740dj(AbstractC1010bu.m2099a(sharedPreferences)).m1761a(AbstractC1010bu.m2098a(intent));
        context.sendBroadcast(intent);
    }
}
