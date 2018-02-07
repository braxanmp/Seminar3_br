package com.example.mageopet.seminar3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import static android.content.Intent.ACTION_VIEW;

public class FavouriteActivity extends AppCompatActivity {
    String authorName = "Albert Einstein";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
    }

    public void showAuthorInfo(View view) {
        Intent authorIntent = new Intent();
        authorIntent.setAction(Intent.ACTION_VIEW);
        authorIntent.setData(Uri.parse("http://en.wikipedia.org/wiki/Special:Search?search=" + authorName));
        startActivity(authorIntent);
    }
}
