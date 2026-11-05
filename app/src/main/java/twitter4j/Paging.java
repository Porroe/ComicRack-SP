package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class Paging implements Serializable {
    static final String COUNT = "count";
    static final String PER_PAGE = "per_page";
    private static final long serialVersionUID = -7226113618341047983L;
    private int count;
    private long maxId;
    private int page;
    private long sinceId;

    /* renamed from: S */
    static final char[] f3736S = {'s'};
    static final char[] SMCP = {'s', 'm', 'c', 'p'};
    private static final HttpParameter[] NULL_PARAMETER_ARRAY = new HttpParameter[0];
    private static final List NULL_PARAMETER_LIST = new ArrayList(0);

    final List asPostParameterList() {
        return asPostParameterList(SMCP, COUNT);
    }

    final HttpParameter[] asPostParameterArray() {
        List listAsPostParameterList = asPostParameterList(SMCP, COUNT);
        return listAsPostParameterList.size() == 0 ? NULL_PARAMETER_ARRAY : (HttpParameter[]) listAsPostParameterList.toArray(new HttpParameter[listAsPostParameterList.size()]);
    }

    final List asPostParameterList(char[] cArr) {
        return asPostParameterList(cArr, COUNT);
    }

    final List asPostParameterList(char[] cArr, String str) {
        ArrayList arrayList = new ArrayList(cArr.length);
        addPostParameter(cArr, 's', arrayList, "since_id", getSinceId());
        addPostParameter(cArr, 'm', arrayList, "max_id", getMaxId());
        addPostParameter(cArr, 'c', arrayList, str, getCount());
        addPostParameter(cArr, 'p', arrayList, "page", getPage());
        if (arrayList.size() == 0) {
            return NULL_PARAMETER_LIST;
        }
        return arrayList;
    }

    final HttpParameter[] asPostParameterArray(char[] cArr, String str) {
        ArrayList arrayList = new ArrayList(cArr.length);
        addPostParameter(cArr, 's', arrayList, "since_id", getSinceId());
        addPostParameter(cArr, 'm', arrayList, "max_id", getMaxId());
        addPostParameter(cArr, 'c', arrayList, str, getCount());
        addPostParameter(cArr, 'p', arrayList, "page", getPage());
        return arrayList.size() == 0 ? NULL_PARAMETER_ARRAY : (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()]);
    }

    private void addPostParameter(char[] cArr, char c, List list, String str, long j) {
        boolean z = false;
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (cArr[i] != c) {
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!z && -1 != j) {
            throw new IllegalStateException("Paging parameter [" + str + "] is not supported with this operation.");
        }
        if (-1 != j) {
            list.add(new HttpParameter(str, String.valueOf(j)));
        }
    }

    public Paging() {
        this.page = -1;
        this.count = -1;
        this.sinceId = -1L;
        this.maxId = -1L;
    }

    public Paging(int i) {
        this.page = -1;
        this.count = -1;
        this.sinceId = -1L;
        this.maxId = -1L;
        setPage(i);
    }

    public Paging(long j) {
        this.page = -1;
        this.count = -1;
        this.sinceId = -1L;
        this.maxId = -1L;
        setSinceId(j);
    }

    public Paging(int i, int i2) {
        this(i);
        setCount(i2);
    }

    public Paging(int i, long j) {
        this(i);
        setSinceId(j);
    }

    public Paging(int i, int i2, long j) {
        this(i, i2);
        setSinceId(j);
    }

    public Paging(int i, int i2, long j, long j2) {
        this(i, i2, j);
        setMaxId(j2);
    }

    public final int getPage() {
        return this.page;
    }

    public final void setPage(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("page should be positive integer. passed:" + i);
        }
        this.page = i;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("count should be positive integer. passed:" + i);
        }
        this.count = i;
    }

    public final Paging count(int i) {
        setCount(i);
        return this;
    }

    public final long getSinceId() {
        return this.sinceId;
    }

    public final void setSinceId(long j) {
        if (j < 1) {
            throw new IllegalArgumentException("since_id should be positive integer. passed:" + j);
        }
        this.sinceId = j;
    }

    public final Paging sinceId(long j) {
        setSinceId(j);
        return this;
    }

    public final long getMaxId() {
        return this.maxId;
    }

    public final void setMaxId(long j) {
        if (j < 1) {
            throw new IllegalArgumentException("max_id should be positive integer. passed:" + j);
        }
        this.maxId = j;
    }

    public final Paging maxId(long j) {
        setMaxId(j);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Paging)) {
            return false;
        }
        Paging paging = (Paging) obj;
        return this.count == paging.count && this.maxId == paging.maxId && this.page == paging.page && this.sinceId == paging.sinceId;
    }

    public final int hashCode() {
        return (((((this.page * 31) + this.count) * 31) + ((int) (this.sinceId ^ (this.sinceId >>> 32)))) * 31) + ((int) (this.maxId ^ (this.maxId >>> 32)));
    }

    public final String toString() {
        return "Paging{page=" + this.page + ", count=" + this.count + ", sinceId=" + this.sinceId + ", maxId=" + this.maxId + '}';
    }
}
