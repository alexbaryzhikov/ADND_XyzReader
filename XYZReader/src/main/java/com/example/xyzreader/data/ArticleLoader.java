package com.example.xyzreader.data;

import android.content.Context;
import android.net.Uri;
import android.support.v4.content.CursorLoader;

/**
 * Helper for loading a list of articles or a single article.
 */
public final class ArticleLoader extends CursorLoader {

    private ArticleLoader(Context context, Uri uri) {
        super(context, uri, Query.PROJECTION, null, null, ItemsContract.Items.DEFAULT_SORT);
    }

    public static ArticleLoader newAllArticlesInstance(Context context) {
        return new ArticleLoader(context, ItemsContract.Items.buildDirUri());
    }

    public static ArticleLoader newInstanceForItemId(Context context, long itemId) {
        return new ArticleLoader(context, ItemsContract.Items.buildItemUri(itemId));
    }
}
