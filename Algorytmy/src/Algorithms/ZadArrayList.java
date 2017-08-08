package Algorithms;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-04.
 */
public class ZadArrayList extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        int toDelete = Integer.parseInt(input[1]);
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < input.length - 2; i++) {
            list.add(i, Integer.parseInt(input[i + 2]));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(toDelete)) {
                list.remove(i);
                i = 0;
            }
        }

        for (int i =0; i < list.size(); i++)
            System.out.println(list.get(i));

    }
}