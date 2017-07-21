package Algorithms;

/**
 * Created by RENT on 2017-07-21.
 */
public class BiednyCamelCase extends AbstractAlgoritm {

    @Override
    public String getName() {
        return "Biedny Camel Case";
    }

    @Override
    public void runAlgoritm(String[] input) {

    int literki = 0;

        for (int i = 1; i<input.length ; i++){
            String s = input[i];
            for (int j = 0 ; j< s.length();j++ ){
                if (literki%2 ==0){
                  //  Character.toString(s.charAt(j));
                    System.out.print(Character.toUpperCase(s.charAt(j)));
                }
                else System.out.print(Character.toLowerCase(s.charAt(j)));
                literki++;
            }
            System.out.print(" ");
        }
    }
}
