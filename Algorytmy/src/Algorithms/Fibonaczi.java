package Algorithms;

/**
 * Created by RENT on 2017-07-25.
 */
public class Fibonaczi extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(Fib(n));


    }

    private int Fib(int n) {

        if (n == 0) return 0;
        else if (n == 1) return 1;
        else
            return Fib(n - 1) + Fib(n - 2);

    }

}
