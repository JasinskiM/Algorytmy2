package Algorithms;

/**
 * Created by RENT on 2017-07-24.
 */
public class Money extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Pieniazki";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int[] zlotowki = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] grosze = {50, 20, 10, 5, 2, 1};
        int[] wydanezl = new int[8];
        int[] wydanegr = new int[6];

        int kwotazl = Integer.parseInt(input[1]);
        int kwotagr = Integer.parseInt(input[2]);

        while (kwotazl > 0) {
            for (int i = 0; i < zlotowki.length; i++) {
                if (zlotowki[i] <= kwotazl) {
                    kwotazl = kwotazl - zlotowki[i];
                    wydanezl[i]++;
                    break;
                }

            }
            for (int i = 0; i< grosze.length;i++){
                if(grosze[i]<= kwotagr){
                    kwotagr -= grosze[i];
                    wydanegr[i]++;
                     break;
                }
            }
        }

            for(int i=0; i<wydanezl.length;i++){
                System.out.printf("%d x %d\n", zlotowki[i], wydanezl[i]);
            }
        System.out.println("----------\n Grosze\n");
            for (int i = 0; i<wydanegr.length;i++){
                System.out.printf("%d x %d\n",grosze[i],wydanegr[i]);
            }

    }
}
