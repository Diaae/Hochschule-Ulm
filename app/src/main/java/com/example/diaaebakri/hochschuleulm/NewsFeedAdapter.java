package com.example.diaaebakri.hochschuleulm;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class NewsFeedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    Context context;
    List<NewsContent> items;

    public NewsFeedAdapter(Context context, List<NewsContent> items){
        this.context = context;
        this.items = items;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.custom_news_row, viewGroup ,false);
        Item item = new Item(row);
        return item;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((Item)viewHolder).textrow.setText(items.get(i).getTitle());
        ((Item)viewHolder).body.setText(items.get(i).getBody());
        ((Item)viewHolder).picture.setImageResource(items.get(i).getImage());
        final int postId = items.get(i).getId();
        ((Item)viewHolder).newsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent post_intent = new Intent(v.getContext(), postActivity.class);
              post_intent.putExtra("postid", postId);
              v.getContext().startActivity(post_intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Item extends RecyclerView.ViewHolder {
        //News Items
        TextView textrow;
        TextView body;
        ImageView picture;
        CardView newsCard;
        public Item(View itemView){
            super(itemView);

            //News Items
            textrow = (TextView) itemView.findViewById(R.id.article_title);
            body = (TextView) itemView.findViewById(R.id.body);
            picture = (ImageView) itemView.findViewById(R.id.imageView2);
            newsCard = (CardView) itemView.findViewById(R.id.news_card);

        }

    }



}
