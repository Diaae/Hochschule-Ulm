package com.example.diaaebakri.hochschuleulm;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MensaDatesAdapter extends BaseAdapter {

    private List<String> daysOfWeekList;
    TextView daysView;

    public MensaDatesAdapter(List<String> daysOfWeek) {
        this.daysOfWeekList = daysOfWeek;
    }

    @Override
    public int getCount() {
        return daysOfWeekList.size();
    }

    @Override
    public Object getItem(int position) {
        return daysOfWeekList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();
        String xDay = daysOfWeekList.get(position);

        if (convertView == null){
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.mensa_days_layout, null, false);
        }

        CardView link = convertView.findViewById(R.id.day_card);
        daysView = convertView.findViewById(R.id.day_name);
        daysView.setText(xDay);

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ActivityMensaCard.class);
                v.getContext().startActivity(intent);
            }
        });
        return convertView;
    }
}
