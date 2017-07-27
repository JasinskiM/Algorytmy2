package Algorithms;

/**
 * Created by RENT on 2017-07-27.
 */
public class Krzyzowka extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input)  {

        int n = Integer.parseInt(input[1]);
        if(Math.sqrt(n)%1 == 0){
            int x = (int) Math.sqrt(n);
            String[] literki = {"A","B","C","D","E","F","G","H","I","J"};
            String[][] tab = new String[x][x];
            for (int i = 0; i < x; i++){
                for (int j = 0 ; j < x ; j++){
                    tab[i][j] = literki[i] + String.valueOf(j+1);

                }


            }
            for (int i = 0; i< x ; i++){
                for (int j = 0 ; j<x; j++){
                    System.out.printf("%s ",tab[i][j]);
                }
                System.out.println();
            }
        }
        else System.out.println(" Podana liczba nie jest pierwstkowalna bez reszty XDD");


    }
}
