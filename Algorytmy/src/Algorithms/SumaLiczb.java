package Algorithms;

/**
 * Created by RENT on 2017-07-24.
 */
public class SumaLiczb extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Sumowanie liczb";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int suma = 0;
        for (int i = 1 ; i<input.length ; i++){
            suma = suma + Integer.parseInt(input[i]);
            System.out.println(suma);
        }

    }
}
