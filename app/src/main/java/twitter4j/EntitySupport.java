package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface EntitySupport {
    MediaEntity[] getExtendedMediaEntities();

    HashtagEntity[] getHashtagEntities();

    MediaEntity[] getMediaEntities();

    SymbolEntity[] getSymbolEntities();

    URLEntity[] getURLEntities();

    UserMentionEntity[] getUserMentionEntities();
}
