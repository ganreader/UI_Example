package com.anfengde.ui.novels;

import java.util.List;

import com.anfengde.epub.core.value.Constants;
import com.anfengde.epub.ui.BookView;
import com.anfengde.epub.ui.BookView.BookList;
import com.anfengde.ui.novels.R;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.WindowManager;

public class CallEPubUIActivity extends Activity {
    public BookView bookView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bookView = (BookView) findViewById(R.id.bookView1);
        bookView.setPath(Constants.CACHE_PAHT);
        bookView.customizeAdMob(true, "a1502c86e3f3fcf");
        bookView.initBook();
        bookView.setShelfEdit(false);
        bookView.setTextIndent(1);
        bookView.openShelf();
        //List<BookList> books = bookView.getAllBooks();
        //bookView.deleteBook(books.get(0).bookName);
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
