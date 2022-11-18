package GABBAI;

import java.util.HashMap;

public class Milah extends Shoresh {

    //variable for adults ONLY
    boolean isSober;

    //Constructor
    public Milah(String name, int age, String pNouns, String shevet, String sup, String saf, String accs) {
        super(name, age, pNouns, shevet, sup, saf, accs);
    }

//defines Hagafen
    @Override
    public void bpHagefen() {
        if (isSober)
            System.out.println("This congregant is sober from alcohol. Please provide them with pri hagafen alternative.");

    }

// Define aliyot requests
    @Override
    public void aliyotReq() {
        HashMap<String, String> aliyot = new HashMap(); //aliyot for Shabbat - reason, shabbat date

    }


    //print method for Milah
    @Override
    public String toString() {
        return super.toString();

    }
}


