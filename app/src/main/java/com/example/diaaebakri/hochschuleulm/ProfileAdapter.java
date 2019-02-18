package com.example.diaaebakri.hochschuleulm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProfileAdapter extends BaseAdapter {

    private List<UserClass> personalInformations;

    public ProfileAdapter(List<UserClass> personalInformations) {
        this.personalInformations = personalInformations;
    }

    @Override
    public int getCount() {
        return personalInformations.size();
    }

    @Override
    public Object getItem(int position) {
        return personalInformations.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_field, parent, false);
        }

        TextView field = convertView.findViewById(R.id.text_2);
        TextView value = convertView.findViewById(R.id.text_1);


        field.setText(personalInformations.get(position).getField());
        value.setText(personalInformations.get(position).getValue());

        return convertView;
    }
}
