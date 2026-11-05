package twitter4j;

import java.io.Serializable;

/* compiled from: DontLook */
/* loaded from: classes.dex */
abstract class EntityIndex implements Serializable, Comparable {
    private static final long serialVersionUID = 3757474748266170719L;
    private int start = -1;
    private int end = -1;

    EntityIndex() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((EntityIndex) obj);
    }

    public int compareTo(EntityIndex entityIndex) {
        long j = this.start - entityIndex.start;
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    void setStart(int i) {
        this.start = i;
    }

    void setEnd(int i) {
        this.end = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getStart() {
        return this.start;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getEnd() {
        return this.end;
    }
}
