import Algorithms.AbstractAlgoritm;

/**
 * Created by RENT on 2017-07-20.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        String algorithmName = args[0];

        AlgoritmFabric factory = new AlgoritmFabric();
        AbstractAlgoritm algoritm
                = factory.getAlgoritm(algorithmName);
        System.out.println("Wykonujemy algorytm: "+ algoritm.getName());
        algoritm.runAlgoritm(args);

    }
}
