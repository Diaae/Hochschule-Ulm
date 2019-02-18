package com.example.diaaebakri.hochschuleulm;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class postActivity extends AppCompatActivity {
    TextView newsTitle;
    TextView newsBody;
    ImageView postImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actual_post);

        Intent intent = getIntent();

        NewsContent nc = NewsContent.getContentById(intent.getIntExtra("postid", 0));

        newsTitle = findViewById(R.id.post_title);
        newsBody = findViewById(R.id.post_body);
        postImage = findViewById(R.id.post_image);

        newsTitle.setText(nc.getTitle());
        newsBody.setText(nc.getBody());
        postImage.setImageResource(nc.getImage());


    }
}
