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
        int t = Integer.parseInt(String.valueOf(input[1]));

        for (int i = 0 ; i < t ;i++){
            String reverse = new StringBuilder(String.valueOf(t)).reverse().toString();
            if(Integer.toString(t).equals(reverse)){
                System.out.println("Za : "+(i+1)+" Razem sie udalo"+" , Liczba " + reverse+" jest palindromem");
                break;
            }else {
                System.out.println("Proba :"+(i+1)+" || "+t+" Nie jest palindromem");
                t += Integer.parseInt(reverse);
            }
        }
    }
}
