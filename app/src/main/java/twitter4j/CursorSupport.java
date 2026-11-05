package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface CursorSupport {
    public static final long START = -1;

    long getNextCursor();

    long getPreviousCursor();

    boolean hasNext();

    boolean hasPrevious();
}
