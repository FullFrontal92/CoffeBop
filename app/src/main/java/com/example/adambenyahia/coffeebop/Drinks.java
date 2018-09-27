package com.example.adambenyahia.coffeebop;

public class Drinks {


    private String name;
    private String desc;
    private int imageID;

    public static final Drinks[] drinks={

            new Drinks("Latte","Tasty coffee with milk",R.drawable.latte),
            new Drinks("Cappucino","Flavored coffee",R.drawable.cup),
            new Drinks("Filter","Morning coffee",R.drawable.Beans),

    };

    private Drinks (String name, String desc, int imageID){

        this.name=name;
        this.desc=desc;
        this.imageID=imageID;

    }

    public String getDesc(){

        return desc;
    }

    public String getName(){

        return name;
    }

    public int getImageID(){

        return imageID;
    }

    public String toString(){

        return this.name;
    }
}
