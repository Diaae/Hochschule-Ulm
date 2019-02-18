package com.example.diaaebakri.hochschuleulm;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MensaView extends RecyclerView.Adapter <MensaView.MensaViewHolder> {
    private List<MensaPlan> mensaList;
    private Context context;

    public MensaView(Context context, List mensaList){
        this.mensaList = mensaList;
        this.context = context;
    }

    @NonNull
    @Override
    public MensaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.mensa_card, viewGroup, false);
        return new MensaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MensaViewHolder viewHolder, int i) {
        viewHolder.menuTitle.setText(mensaList.get(i).getMeal());
        viewHolder.description.setText(mensaList.get(i).getDescription());
        viewHolder.studentPrice.setText(mensaList.get(i).getStudentPrice());
        viewHolder.bedPrice.setText(mensaList.get(i).getBedPrice());
        viewHolder.gastPrice.setText(mensaList.get(i).getGastPrice());
        viewHolder.mealImage.setImageResource(mensaList.get(i).getImage());
        if(mensaList.get(i).isVegan()){
            viewHolder.veganImage.setImageResource(R.drawable.vegan);
        }
    }

    @Override
    public int getItemCount() {
        return mensaList.size();
    }

    class MensaViewHolder extends RecyclerView.ViewHolder{
        TextView menuTitle;
        ImageView veganImage;
        ImageView mealImage;
        TextView description;
        TextView studentPrice;
        TextView bedPrice;
        TextView gastPrice;

        public MensaViewHolder(@NonNull View itemView) {
            super(itemView);
            description = itemView.findViewById(R.id.description);
            menuTitle = itemView.findViewById(R.id.menuTitle);
            veganImage = itemView.findViewById(R.id.veganImage);
            studentPrice = itemView.findViewById(R.id.GastPtice);
            bedPrice = itemView.findViewById(R.id.StudPrice);
            gastPrice = itemView.findViewById(R.id.BedPrice);
            mealImage = itemView.findViewById(R.id.imageView3);
        }
    }
}
