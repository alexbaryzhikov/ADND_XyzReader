package com.example.xyzreader.data;

public final class Query {

    public static final String[] PROJECTION = {
            ItemsContract.Items._ID,
            ItemsContract.Items.TITLE,
            ItemsContract.Items.PUBLISHED_DATE,
            ItemsContract.Items.AUTHOR,
            ItemsContract.Items.THUMB_URL,
            ItemsContract.Items.PHOTO_URL,
            ItemsContract.Items.ASPECT_RATIO,
            ItemsContract.Items.BODY,
    };

    public static final int _ID = 0;
    public static final int TITLE = 1;
    public static final int PUBLISHED_DATE = 2;
    public static final int AUTHOR = 3;
    public static final int THUMB_URL = 4;
    public static final int PHOTO_URL = 5;
    public static final int ASPECT_RATIO = 6;
    public static final int BODY = 7;

    private Query() {
    }
}
