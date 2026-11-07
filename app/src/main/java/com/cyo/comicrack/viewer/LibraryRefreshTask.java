package com.cyo.comicrack.viewer;

import android.os.AsyncTask;
import com.cyo.common.view.C1137bd;

final class LibraryRefreshTask extends AsyncTask<Void, Integer, Boolean> {
    private final ComicRackApplication application;
    private final boolean showProgress;
    private final C1137bd phases = new C1137bd(new int[] {75, 25});

    LibraryRefreshTask(ComicRackApplication application, boolean showProgress) {
        this.application = application;
        this.showProgress = showProgress;
    }

    @Override
    protected Boolean doInBackground(Void... arguments) {
        try {
            application.m1427a(showProgress ? (total, current) -> publishProgress(total, current) : null);
            return true;
        } catch (RuntimeException exception) {
            android.util.Log.w("ComicRack", "Library refresh failed", exception);
            return false;
        }
    }

    @Override
    protected void onPostExecute(Boolean success) {
        application.libraryRefreshFinished();
        application.libraryRefresh().finish(success);
    }

    @Override
    protected void onProgressUpdate(Integer... progress) {
        if (progress[0] > 0) {
            phases.m2412a(progress[0], progress[1]);
            application.libraryRefresh().update(phases.f3609b * 100 / phases.f3608a);
        }
    }

    @Override
    protected void onPreExecute() {
        application.libraryRefresh().begin(showProgress);
    }
}
