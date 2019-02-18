package com.example.diaaebakri.hochschuleulm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class LibraryAdapter extends RecyclerView.Adapter<LibraryAdapter.LibraryViewholder> {
    private List<Bibliothek> data;
    private Context context;
    String campusAddress;

    public LibraryAdapter(Context context, List data){
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public LibraryViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.library_layout, viewGroup, false);
        return new LibraryViewholder(view);
    }

    @Override
    public void onBindViewHolder(final @NonNull LibraryViewholder libraryViewholder, int i) {
        libraryViewholder.libraryTitle.setText(data.get(i).getCampus());
        libraryViewholder.imageLibrary.setImageResource(data.get(i).getImage());
        libraryViewholder.address.setText(data.get(i).getAddress());
        libraryViewholder.phoneNu.setText(data.get(i).getPhone());
        libraryViewholder.email.setText(data.get(i).getEmail());
        libraryViewholder.openingSemester.setText(data.get(i).getLectureHours());
        libraryViewholder.openingHolidays.setText(data.get(i).getHolidayHours());
        libraryViewholder.librarylayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                campusAddress = libraryViewholder.address.getText().toString();
                Uri campusAddressUri = Uri.parse("geo:0,0?q=" + campusAddress);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,campusAddressUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                v.getContext().startActivity(mapIntent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class LibraryViewholder extends RecyclerView.ViewHolder{
        //Library Items
        TextView libraryTitle;
        ImageView imageLibrary;
        TextView address;
        TextView phoneNu;
        TextView email;
        TextView openingSemester;
        TextView openingHolidays;
        LinearLayout librarylayout;


        public LibraryViewholder(@NonNull View itemView) {
            super(itemView);
            //Library Items
            libraryTitle = (TextView) itemView.findViewById(R.id.campusTitle);
            imageLibrary = (ImageView) itemView.findViewById(R.id.image_1);
            address = (TextView) itemView.findViewById(R.id.textView7);
            phoneNu = (TextView) itemView.findViewById(R.id.textView8);
            email = (TextView) itemView.findViewById(R.id.textView9);
            openingSemester = (TextView) itemView.findViewById(R.id.textView11);
            openingHolidays = (TextView) itemView.findViewById(R.id.textView12);
            librarylayout = (LinearLayout) itemView.findViewById(R.id.library_layout);

        }
    }
}
