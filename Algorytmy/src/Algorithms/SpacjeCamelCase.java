package Algorithms;

/**
 * Created by RENT on 2017-07-25.
 */
public class SpacjeCamelCase extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {

        for (int i = 1; i<input.length;i++) {
            String s = input[i].replaceAll("\\s+", "");
            System.out.print(s);

        }

    }
}
