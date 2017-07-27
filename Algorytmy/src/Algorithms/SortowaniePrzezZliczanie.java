package Algorithms;

/**
 * Created by RENT on 2017-07-27.
 */
public class SortowaniePrzezZliczanie extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = input.length -2 ;
        int max = Integer.parseInt(input[1])+1;
        int[] tab = new int[n];
        for (int i = 0; i<n;i++){
            tab[i] = Integer.parseInt(input[ i + 2]);
        }
        int[] help = new int[max];
        for (int i = 0; i < tab.length ; i++ ){
            int liczba = tab[i];
            help[liczba]++;
            }
            for (int i = 0; i<help.length;i++){
                for (int j = help[i] ; j > 0 ; j--){
                    System.out.printf("%d ",i);
                }
        }

    }
}
