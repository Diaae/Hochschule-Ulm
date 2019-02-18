package com.example.diaaebakri.hochschuleulm;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private String campus;
    private String phone;
    private String address;
    private String email;
    private String lectureHours;
    private String holidayHours;
    private int image;

    private Bibliothek(String campus, String phone, String address, String lectureHours, String holidayHours, int image){
        this.campus = campus;
        this.phone = phone;
        this.address = address;
        this.email = "bibliothek@hs-ulm.de";
        this.lectureHours = lectureHours;
        this.holidayHours = holidayHours;
        this.image = image;
    }

    public String getCampus() {
        return campus;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getLectureHours() {
        return lectureHours;
    }

    public String getHolidayHours() {
        return holidayHours;
    }

    public int getImage() {
        return image;
    }

    public static Bibliothek[] libraryArray = {
            new Bibliothek("Hauptbibliothek", "0731 / 50-28113", "Prittwitzstr.10, 89075 Ulm",
                    "Mo – Do: 08:00 – 18:00 Uhr\n" +
                    "Fr: 08:00 – 14:00 Uhr", "Mo – Do: 08:00 – 16:00 Uhr\n" +
                    "Fr: 08:00 – 13:00 Uhr\n", R.drawable.bibliothek),

            new Bibliothek("Außenstelle Albert-Einstein-Allee", "0731 / 50-28512",
                    "Albert-Einstein-Allee 55 89081 Ulm", "Mo, Mi, Do: 09:00 – 13:30 Uhr\n" +
                    "Di: 08:00 – 12:00 und 13:00 – 16:00 Uhr", "Closed", R.drawable.bibliothek_2),

            new Bibliothek("Außenstelle Böfingen", "0731 / 50-28318",
                    "Eberhard-Finckh-Str.11 89075 Ulm", "Mo – Do: 09:00 – 13:30 Uhr", "Closed"
            ,R.drawable.bibliothek_3)
    };

    public static List<Bibliothek> getLibraryList(){
        List res = new ArrayList();
        for(Bibliothek b : libraryArray){
            res.add(b);
        }
        return res;
    }
}
