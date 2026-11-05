package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface PagableResponseList extends CursorSupport, ResponseList {
    @Override // twitter4j.CursorSupport
    long getNextCursor();

    @Override // twitter4j.CursorSupport
    long getPreviousCursor();

    @Override // twitter4j.CursorSupport
    boolean hasNext();

    @Override // twitter4j.CursorSupport
    boolean hasPrevious();
}
