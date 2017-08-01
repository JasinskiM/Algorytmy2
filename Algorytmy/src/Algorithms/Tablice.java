package Algorithms;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-01.
 */
public class Tablice extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        ArrayList<String> kolory  = new ArrayList<>();
        kolory.add("NIEBIESKI");
        kolory.add("CZARNY");
        kolory.add("ZOLTY");
        kolory.add("FIOLETOWY");
        kolory.add(0,"Rozwy");
        kolory.add(kolory.size(),"ZIELONY");
        for (String element : kolory) {
            System.out.println(element);

        }

    }
}
