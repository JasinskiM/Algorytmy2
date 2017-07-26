package Algorithms;

/**
 * Created by RENT on 2017-07-24.
 */
public class Palindromy extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        int[] t = new int[ Integer.parseInt(input[1])];
        t.toString().toCharArray();
         String x = new StringBuilder(String.valueOf(t)).reverse().toString();

        for (int i = 0 ; i < t.toString().charAt(i) ; i++){
            for (int j = i; j< x.toString().charAt(j); j--){
                if (t.equals(x)){
                    System.out.println("Liczba "+t+"Jest palindromem");
                }
                System.out.println("Nie jest");

            }
        }



    }
}
