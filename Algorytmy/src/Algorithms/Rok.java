package Algorithms;

/**
 * Created by RENT on 2017-07-24.
 */
public class Rok extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Rok przestepny";
    }

    @Override
    public void runAlgoritm(String[] input) {


        for (int i = 2;i<input.length;i++){
            int n = Integer.parseInt(input[i]);

            if (n%4 ==0) System.out.println("Rok : "+n+" Jest przestepny");
            else System.out.println("Rok : "+n+" Nie jest przestepny");
        }
    }
}
