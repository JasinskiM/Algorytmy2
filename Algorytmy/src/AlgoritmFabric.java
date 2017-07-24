import Algorithms.*;

/**
 * Created by RENT on 2017-07-21.
 */
public class AlgoritmFabric {

    public AbstractAlgoritm getAlgoritm(String name) throws Exception{
        switch (name.toLowerCase()){
            case  "test":
                return new Test();
            case "biednycamelcase":{
                return new BiednyCamelCase();
            }
            case "sumujemyliczbynaturalne":{
                return new SumowanieLiczNaturalnych();
            }
            case "sumaliczb":{
                return  new SumaLiczb();
            }
            case "money":{
                return new Money();
            }
            case "rok":{
                return  new Rok();
            }

                default:
                    throw new Exception("Nie ma takego algorytmu !");
        }
    }
}
