package com.example.diaaebakri.hochschuleulm;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MensaPlan {
    private int meal;
    private String description;
    private int studentPrice;
    private int bedPrice;
    private int gastPrice;
    private int image;
    private boolean vegan;

    public MensaPlan(int meal, String description, int studentPrice, int bedPrice, int gastPrice, int image, boolean vegan) {
        this.meal = meal;
        this.description = description;
        this.studentPrice = studentPrice;
        this.bedPrice = bedPrice;
        this.gastPrice = gastPrice;
        this.vegan = vegan;
        this.image = image;
    }

    public MensaPlan(int meal, String description, int studentPrice, int bedPrice, int gastPrice, int image) {
        this.meal = meal;
        this.description = description;
        this.studentPrice = studentPrice;
        this.bedPrice = bedPrice;
        this.gastPrice = gastPrice;
        this.vegan = false;
        this.image = image;
    }

    final DecimalFormat df = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.GERMAN);
    public String getMeal() {
        switch(meal){
            case 0:
                return "Tagessuppe";
            case 1:
                return "Gut und günstig";
            case 2:
                return "Prima Klima";
            case 3:
                return "Gourmet";
            case 4:
                return "Special";
            case 5:
                return "Wok und Grill";
            default:
                return "None";
        }
    }

    public String getDescription() {
        return description;
    }

    public String getStudentPrice() {
        return getPrice(studentPrice);
    }

    public String getBedPrice() {
        return getPrice(bedPrice);
    }

    public String getGastPrice() {
        return getPrice(gastPrice);
    }

    public boolean isVegan() {
        return vegan;
    }

    public int getImage() {
        return image;
    }

    private String getPrice(int price){
        DecimalFormatSymbols symbols = df.getDecimalFormatSymbols();
        symbols.setCurrencySymbol("");
        df.setDecimalFormatSymbols(symbols);
        if(price == 0){
            return null;
        }else{
            return "\u20ac" + df.format(Double.valueOf(price)/100);
        }
    }

    public static MensaPlan[] mensaPlans = {
            new MensaPlan(0, "Italienische Gemüsesuppe (26,34W) ", 490, 520, 620, R.drawable.tagesuppe, true),
            new MensaPlan(1, "Cevapcici mit Ajvar (S,24) auf Djuvetschreis", 300, 435, 570, R.drawable.meal_2),
            new MensaPlan(2, "Gegrillter MaultaschenSnackriegel (14,26,34W)\n" +
                    "mit pikanter TomatenCurrysoße (3,9,23,34W) und\n" +
                    "Röstzwiebeln", 250, 360, 475, R.drawable.meal_3,true),
            new MensaPlan(3, "Gesottene Rinderbrust (R) auf Bouillonkartoffeln (26) mit Meerrettich (3,24,30)",
                    360, 520, 685,R.drawable.meal_4),
            new MensaPlan(4, "Gebratene Putenstücke auf pikanter Tomaten-PapayaSalsa (24,26,G,34W,34G) Rote-Bohnen-Reis (24)",
                    420, 605, 800, R.drawable.meal_5)
    };

    public static List<MensaPlan> getList(){
        return Arrays.asList(mensaPlans);
    }

}
