package Algorithms;

/**
 * Created by RENT on 2017-07-31.
 */
public class NajwiekszyWspolnyDzielnik extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        int k = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);

        System.out.println(NWD(k, n));
    }

    int NWD(int k, int n) {
        if (k == 0) return n;
        else
            return NWD(n % k, k);
    }
}
