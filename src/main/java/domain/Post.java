package domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int dateAndTime;
    private boolean addToFavorite;
    private String text;
    private Picture picture;
    private Like like;
    private Comment comment;
    private Share share;
}
