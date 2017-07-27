package Algorithms;

/**
 * Created by RENT on 2017-07-27.
 */
public class DzialkaJasia extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        int[] tab = new int[n];
        for (int i = 0 ; i < n; i++){
            tab[i] = Integer.parseInt(input[i+2]);
            System.out.println(Math.pow(tab[i],2));

        }

    }
}
