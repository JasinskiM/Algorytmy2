package Algorithms;

import java.util.Random;

/**
 * Created by RENT on 2017-07-31.
 */
public class TabliceCw extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        int[] numbers = {1, 9, 12, 93, 123, 0, 99};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                index2= i;
            }
        }
        System.out.println(index);
        System.out.println(index2);
    }
}
