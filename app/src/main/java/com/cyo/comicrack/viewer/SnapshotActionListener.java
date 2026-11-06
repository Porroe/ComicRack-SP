package com.cyo.comicrack.viewer;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import java.io.File;

final class SnapshotActionListener implements DialogInterface.OnClickListener {
    private final ReaderActivity reader;

    SnapshotActionListener(ReaderActivity reader) {
        this.reader = reader;
    }

    @Override
    public void onClick(DialogInterface dialog, int selectedAction) {
        if (selectedAction == 0) {
            ReaderActivity.saveSnapshot(reader);
            return;
        }
        try {
            File snapshot = ComicRackFilesProvider.m1448a("snapshot", ".jpg");
            if (snapshot == null || !ReaderActivity.m1575a(reader, snapshot)) {
                if (snapshot != null) {
                    snapshot.delete();
                }
                return;
            }
            String title = ReaderActivity.m1614u(reader);
            Uri snapshotUri = ComicRackFilesProvider.m1451b(snapshot);
            Intent share = new Intent(Intent.ACTION_SEND)
                    .setType("image/jpeg")
                    .putExtra(Intent.EXTRA_SUBJECT, title)
                    .putExtra(Intent.EXTRA_TEXT, title)
                    .putExtra(Intent.EXTRA_STREAM, snapshotUri)
                    .addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            share.setClipData(ClipData.newUri(reader.getContentResolver(), title, snapshotUri));
            reader.startActivity(Intent.createChooser(share, null));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
