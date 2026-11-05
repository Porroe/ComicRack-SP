package twitter4j;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class StatusUpdate implements Serializable {
    private static final long serialVersionUID = 7422094739799350035L;
    private transient InputStream mediaBody;
    private File mediaFile;
    private long[] mediaIds;
    private String mediaName;
    private boolean possiblySensitive;
    private final String status;
    private long inReplyToStatusId = -1;
    private GeoLocation location = null;
    private String placeId = null;
    private boolean displayCoordinates = true;

    public StatusUpdate(String str) {
        this.status = str;
    }

    public final String getStatus() {
        return this.status;
    }

    public final long getInReplyToStatusId() {
        return this.inReplyToStatusId;
    }

    public final void setInReplyToStatusId(long j) {
        this.inReplyToStatusId = j;
    }

    public final StatusUpdate inReplyToStatusId(long j) {
        this.inReplyToStatusId = j;
        return this;
    }

    public final GeoLocation getLocation() {
        return this.location;
    }

    public final void setLocation(GeoLocation geoLocation) {
        this.location = geoLocation;
    }

    public final StatusUpdate location(GeoLocation geoLocation) {
        this.location = geoLocation;
        return this;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final void setPlaceId(String str) {
        this.placeId = str;
    }

    public final StatusUpdate placeId(String str) {
        this.placeId = str;
        return this;
    }

    public final boolean isDisplayCoordinates() {
        return this.displayCoordinates;
    }

    public final void setDisplayCoordinates(boolean z) {
        this.displayCoordinates = z;
    }

    public final StatusUpdate displayCoordinates(boolean z) {
        this.displayCoordinates = z;
        return this;
    }

    public final void setMedia(File file) {
        this.mediaFile = file;
    }

    public final StatusUpdate media(File file) {
        this.mediaFile = file;
        return this;
    }

    public final void setMedia(String str, InputStream inputStream) {
        this.mediaName = str;
        this.mediaBody = inputStream;
    }

    public final void setMediaIds(long[] jArr) {
        this.mediaIds = jArr;
    }

    final boolean isForUpdateWithMedia() {
        return (this.mediaFile == null && this.mediaName == null) ? false : true;
    }

    public final StatusUpdate media(String str, InputStream inputStream) {
        setMedia(str, inputStream);
        return this;
    }

    public final void setPossiblySensitive(boolean z) {
        this.possiblySensitive = z;
    }

    public final StatusUpdate possiblySensitive(boolean z) {
        this.possiblySensitive = z;
        return this;
    }

    public final boolean isPossiblySensitive() {
        return this.possiblySensitive;
    }

    final HttpParameter[] asHttpParameterArray() {
        ArrayList arrayList = new ArrayList();
        appendParameter("status", this.status, arrayList);
        if (-1 != this.inReplyToStatusId) {
            appendParameter("in_reply_to_status_id", this.inReplyToStatusId, (List) arrayList);
        }
        if (this.location != null) {
            appendParameter("lat", this.location.getLatitude(), arrayList);
            appendParameter("long", this.location.getLongitude(), arrayList);
        }
        appendParameter("place_id", this.placeId, arrayList);
        if (!this.displayCoordinates) {
            appendParameter("display_coordinates", "false", arrayList);
        }
        if (this.mediaFile != null) {
            arrayList.add(new HttpParameter("media[]", this.mediaFile));
            arrayList.add(new HttpParameter("possibly_sensitive", this.possiblySensitive));
        } else if (this.mediaName != null && this.mediaBody != null) {
            arrayList.add(new HttpParameter("media[]", this.mediaName, this.mediaBody));
            arrayList.add(new HttpParameter("possibly_sensitive", this.possiblySensitive));
        } else if (this.mediaIds != null && this.mediaIds.length > 0) {
            arrayList.add(new HttpParameter("media_ids", StringUtil.join(this.mediaIds)));
        }
        return (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()]);
    }

    private void appendParameter(String str, String str2, List list) {
        if (str2 != null) {
            list.add(new HttpParameter(str, str2));
        }
    }

    private void appendParameter(String str, double d, List list) {
        list.add(new HttpParameter(str, String.valueOf(d)));
    }

    private void appendParameter(String str, long j, List list) {
        list.add(new HttpParameter(str, String.valueOf(j)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatusUpdate statusUpdate = (StatusUpdate) obj;
        if (this.displayCoordinates == statusUpdate.displayCoordinates && this.inReplyToStatusId == statusUpdate.inReplyToStatusId && this.possiblySensitive == statusUpdate.possiblySensitive) {
            if (this.location == null ? statusUpdate.location != null : !this.location.equals(statusUpdate.location)) {
                return false;
            }
            if (this.mediaBody == null ? statusUpdate.mediaBody != null : !this.mediaBody.equals(statusUpdate.mediaBody)) {
                return false;
            }
            if (this.mediaFile == null ? statusUpdate.mediaFile != null : !this.mediaFile.equals(statusUpdate.mediaFile)) {
                return false;
            }
            if (this.mediaName == null ? statusUpdate.mediaName != null : !this.mediaName.equals(statusUpdate.mediaName)) {
                return false;
            }
            if (this.mediaIds == null ? statusUpdate.mediaIds != null : !Arrays.equals(this.mediaIds, statusUpdate.mediaIds)) {
                return false;
            }
            if (this.placeId == null ? statusUpdate.placeId != null : !this.placeId.equals(statusUpdate.placeId)) {
                return false;
            }
            if (this.status != null) {
                if (this.status.equals(statusUpdate.status)) {
                    return true;
                }
            } else if (statusUpdate.status == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.mediaFile != null ? this.mediaFile.hashCode() : 0) + (((this.mediaBody != null ? this.mediaBody.hashCode() : 0) + (((this.mediaName != null ? this.mediaName.hashCode() : 0) + (((((this.displayCoordinates ? 1 : 0) + (((this.placeId != null ? this.placeId.hashCode() : 0) + (((this.location != null ? this.location.hashCode() : 0) + ((((this.status != null ? this.status.hashCode() : 0) * 31) + ((int) (this.inReplyToStatusId ^ (this.inReplyToStatusId >>> 32)))) * 31)) * 31)) * 31)) * 31) + (this.possiblySensitive ? 1 : 0)) * 31)) * 31)) * 31)) * 31) + (this.mediaIds != null ? StringUtil.join(this.mediaIds).hashCode() : 0);
    }

    public final String toString() {
        return "StatusUpdate{status='" + this.status + "', inReplyToStatusId=" + this.inReplyToStatusId + ", location=" + this.location + ", placeId='" + this.placeId + "', displayCoordinates=" + this.displayCoordinates + ", possiblySensitive=" + this.possiblySensitive + ", mediaName='" + this.mediaName + "', mediaBody=" + this.mediaBody + ", mediaFile=" + this.mediaFile + ", mediaIds=" + this.mediaIds + '}';
    }
}
