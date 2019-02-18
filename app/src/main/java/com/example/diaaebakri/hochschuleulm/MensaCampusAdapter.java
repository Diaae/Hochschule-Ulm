package com.example.diaaebakri.hochschuleulm;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MensaCampusAdapter extends RecyclerView.Adapter<MensaCampusAdapter.CampusViewHolder> {
    private List<MensaCampus> campusList;
    private Context context;

    public MensaCampusAdapter(List<MensaCampus> campusList, Context context) {
        this.campusList = campusList;
        this.context = context;
    }

    @NonNull
    @Override
    public CampusViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.mensa_activity_content, viewGroup, false);
        return new CampusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CampusViewHolder campusViewHolder, int i) {
        campusViewHolder.campusTitle.setText(campusList.get(i).getCampusName());
        campusViewHolder.openingHours.setText(campusList.get(i).getOpeningHours());
        campusViewHolder.mensaimage.setImageResource(campusList.get(i).getImage());
        campusViewHolder.campusAddress.setText(campusList.get(i).getAddress());
        campusViewHolder.mensa_campus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MensaDates.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return campusList.size();
    }

    class CampusViewHolder extends RecyclerView.ViewHolder{

        TextView campusTitle;
        TextView openingHours;
        ImageView mensaimage;
        LinearLayout mensa_campus;
        TextView campusAddress;


        public CampusViewHolder(@NonNull View itemView) {
            super(itemView);

            campusAddress = itemView.findViewById(R.id.textView7);
            mensa_campus = itemView.findViewById(R.id.mensa_campus_layout);
            campusTitle = itemView.findViewById(R.id.campusTitle);
            openingHours = itemView.findViewById(R.id.textView11);
            mensaimage = itemView.findViewById(R.id.image_1);
        }
    }
}
