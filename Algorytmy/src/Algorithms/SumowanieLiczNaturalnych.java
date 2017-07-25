package Algorithms;

/**
 * Created by RENT on 2017-07-24.
 */
public class SumowanieLiczNaturalnych extends AbstractAlgoritm{
    @Override
    public String getName() {
        return "Sumowanie liczb naturalnych";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        int sum = 0;

        int i =1;
        while (i<n){
            sum += 1;
            i++;
        }
        System.out.println(sum);

    }
}
