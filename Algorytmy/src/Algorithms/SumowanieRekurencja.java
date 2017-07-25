package Algorithms;

/**
 * Created by RENT on 2017-07-25.
 */
public class SumowanieRekurencja extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(Suma(n));
    }
        private int Suma(int n){
        if (n == 1)
            return 1;

            return n + Suma(n-1);

    }


}
