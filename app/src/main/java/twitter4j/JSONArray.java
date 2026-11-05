package twitter4j;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class JSONArray {
    private final ArrayList myArrayList;

    public JSONArray() {
        this.myArrayList = new ArrayList();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public JSONArray(twitter4j.JSONTokener r4) {
        /*
            r3 = this;
            r2 = 93
            r3.<init>()
            char r0 = r4.nextClean()
            r1 = 91
            if (r0 == r1) goto L14
            java.lang.String r0 = "A JSONArray text must start with '['"
            twitter4j.JSONException r0 = r4.syntaxError(r0)
            throw r0
        L14:
            char r0 = r4.nextClean()
            if (r0 == r2) goto L50
            r4.back()
        L1d:
            char r0 = r4.nextClean()
            r1 = 44
            if (r0 != r1) goto L3d
            r4.back()
            java.util.ArrayList r0 = r3.myArrayList
            java.lang.Object r1 = twitter4j.JSONObject.NULL
            r0.add(r1)
        L2f:
            char r0 = r4.nextClean()
            switch(r0) {
                case 44: goto L4a;
                case 59: goto L4a;
                case 93: goto L50;
                default: goto L36;
            }
        L36:
            java.lang.String r0 = "Expected a ',' or ']'"
            twitter4j.JSONException r0 = r4.syntaxError(r0)
            throw r0
        L3d:
            r4.back()
            java.util.ArrayList r0 = r3.myArrayList
            java.lang.Object r1 = r4.nextValue()
            r0.add(r1)
            goto L2f
        L4a:
            char r0 = r4.nextClean()
            if (r0 != r2) goto L51
        L50:
            return
        L51:
            r4.back()
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: twitter4j.JSONArray.<init>(twitter4j.JSONTokener):void");
    }

    public JSONArray(String str) {
        this(new JSONTokener(str));
    }

    public JSONArray(Collection collection) {
        this.myArrayList = new ArrayList();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.myArrayList.add(JSONObject.wrap(it.next()));
            }
        }
    }

    public JSONArray(Object obj) throws JSONException {
        this();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                put(JSONObject.wrap(Array.get(obj, i)));
            }
            return;
        }
        throw new JSONException("JSONArray initial value should be a string or collection or array.");
    }

    public Object get(int i) throws JSONException {
        Object objOpt = opt(i);
        if (objOpt == null) {
            throw new JSONException("JSONArray[" + i + "] not found.");
        }
        return objOpt;
    }

    public boolean getBoolean(int i) throws JSONException {
        Object obj = get(i);
        if (obj.equals(Boolean.FALSE) || ((obj instanceof String) && ((String) obj).equalsIgnoreCase("false"))) {
            return false;
        }
        if (obj.equals(Boolean.TRUE) || ((obj instanceof String) && ((String) obj).equalsIgnoreCase("true"))) {
            return true;
        }
        throw new JSONException("JSONArray[" + i + "] is not a boolean.");
    }

    public double getDouble(int i) throws JSONException {
        Object obj = get(i);
        try {
            if (obj instanceof Number) {
                return ((Number) obj).doubleValue();
            }
            return Double.parseDouble((String) obj);
        } catch (Exception e) {
            throw new JSONException("JSONArray[" + i + "] is not a number.");
        }
    }

    public int getInt(int i) throws JSONException {
        Object obj = get(i);
        try {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            return Integer.parseInt((String) obj);
        } catch (Exception e) {
            throw new JSONException("JSONArray[" + i + "] is not a number.");
        }
    }

    public JSONArray getJSONArray(int i) throws JSONException {
        Object obj = get(i);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw new JSONException("JSONArray[" + i + "] is not a JSONArray.");
    }

    public JSONObject getJSONObject(int i) {
        Object obj = get(i);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw new JSONException("JSONArray[" + i + "] is not a JSONObject.");
    }

    public long getLong(int i) throws JSONException {
        Object obj = get(i);
        try {
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            return Long.parseLong((String) obj);
        } catch (Exception e) {
            throw new JSONException("JSONArray[" + i + "] is not a number.");
        }
    }

    public String getString(int i) throws JSONException {
        Object obj = get(i);
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj.toString();
    }

    public boolean isNull(int i) {
        return JSONObject.NULL.equals(opt(i));
    }

    public String join(String str) {
        int length = length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(JSONObject.valueToString(this.myArrayList.get(i)));
        }
        return sb.toString();
    }

    public int length() {
        return this.myArrayList.size();
    }

    public Object opt(int i) {
        if (i < 0 || i >= length()) {
            return null;
        }
        return this.myArrayList.get(i);
    }

    public JSONArray put(boolean z) {
        put(z ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public JSONArray put(Collection collection) {
        put(new JSONArray(collection));
        return this;
    }

    public JSONArray put(int i) {
        put(new Integer(i));
        return this;
    }

    public JSONArray put(long j) {
        put(new Long(j));
        return this;
    }

    public JSONArray put(Map map) {
        put(new JSONObject(map));
        return this;
    }

    public JSONArray put(Object obj) {
        this.myArrayList.add(obj);
        return this;
    }

    public JSONArray put(int i, boolean z) throws JSONException {
        put(i, z ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public JSONArray put(int i, Collection collection) throws JSONException {
        put(i, new JSONArray(collection));
        return this;
    }

    public JSONArray put(int i, double d) throws JSONException {
        put(i, new Double(d));
        return this;
    }

    public JSONArray put(int i, int i2) throws JSONException {
        put(i, new Integer(i2));
        return this;
    }

    public JSONArray put(int i, long j) throws JSONException {
        put(i, new Long(j));
        return this;
    }

    public JSONArray put(int i, Map map) throws JSONException {
        put(i, new JSONObject(map));
        return this;
    }

    public JSONArray put(int i, Object obj) throws JSONException {
        JSONObject.testValidity(obj);
        if (i < 0) {
            throw new JSONException("JSONArray[" + i + "] not found.");
        }
        if (i < length()) {
            this.myArrayList.set(i, obj);
        } else {
            while (i != length()) {
                put(JSONObject.NULL);
            }
            put(obj);
        }
        return this;
    }

    public String toString() {
        try {
            return "[" + join(",") + ']';
        } catch (Exception e) {
            return null;
        }
    }

    public String toString(int i) {
        return toString(i, 0);
    }

    String toString(int i, int i2) {
        int length = length();
        if (length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        if (length == 1) {
            sb.append(JSONObject.valueToString(this.myArrayList.get(0), i, i2));
        } else {
            int i3 = i2 + i;
            sb.append('\n');
            for (int i4 = 0; i4 < length; i4++) {
                if (i4 > 0) {
                    sb.append(",\n");
                }
                for (int i5 = 0; i5 < i3; i5++) {
                    sb.append(' ');
                }
                sb.append(JSONObject.valueToString(this.myArrayList.get(i4), i, i3));
            }
            sb.append('\n');
            for (int i6 = 0; i6 < i2; i6++) {
                sb.append(' ');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public Writer write(Writer writer) {
        boolean z = false;
        try {
            int length = length();
            writer.write(91);
            int i = 0;
            while (i < length) {
                if (z) {
                    writer.write(44);
                }
                Object obj = this.myArrayList.get(i);
                if (obj instanceof JSONObject) {
                    ((JSONObject) obj).write(writer);
                } else if (obj instanceof JSONArray) {
                    ((JSONArray) obj).write(writer);
                } else {
                    writer.write(JSONObject.valueToString(obj));
                }
                i++;
                z = true;
            }
            writer.write(93);
            return writer;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }
}
