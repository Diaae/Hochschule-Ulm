package com.example.diaaebakri.hochschuleulm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MensaCampus {

    private String campusName;
    private String openingHours;
    private String address;
    private int image;

    public MensaCampus(String name, String openingHours, String address, int image){
        this.campusName = name;
        this.openingHours = openingHours;
        this.image = image;
        this.address = address;
    }

    public String getCampusName() {
        return campusName;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public int getImage() {
        return image;
    }

    public String getAddress() {
        return address;
    }

    private static MensaCampus[] mensaCampuses = {
            new MensaCampus("Mensa Prittwitzstraße", "Mo-Do: 11:45 – 13:45 Uhr\n" +
                    "Fr: 11:45 – 13:30 Uhr", "Prittwitzstr.10, 89075 Ulm",R.drawable.mensa_1),
            new MensaCampus("Mensa Albert-Einstein-Allee","Mo-Do: 11:45 – 13:45 Uhr\n" +
                    "Fr: 11:45 – 13:30 Uhr", "Albert-Einstein-Allee 55 89081 Ulm",R.drawable.mensa_eselsberg),
            new MensaCampus("Mensa Böfingen", "Mo-Do: 11:45 – 13:45 Uhr\n" +
                    "Fr: 11:45 – 13:30 Uhr", "Eberhard-Finckh-Str.11 89075 Ulm",R.drawable.mensa_bofingen)
    };

    public static List<MensaCampus> getMensaCampuses(){
        return Arrays.asList(mensaCampuses);
    }


}
