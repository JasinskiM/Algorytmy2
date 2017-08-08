package Algorithms;

/**
 * Created by RENT on 2017-08-04.
 */
public class zmienneTablice extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Zmienne tablica";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int[] tab = new int[input.length -1];
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < tab.length ; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < i; j++) {
                if (tab[i] == tab[j] ) {
                    System.out.println("Liczba :" + tab[i] + " powtorzyla sie w miejscach " + i + " " + j);
                }
            }
        }

    }
}
